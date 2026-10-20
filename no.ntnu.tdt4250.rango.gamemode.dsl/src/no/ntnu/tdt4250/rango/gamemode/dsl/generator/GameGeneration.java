package no.ntnu.tdt4250.rango.gamemode.dsl.generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

import no.ntnu.tdt4250.rango.gamemode.Edition;

/**
 * Derives a product of the Rango Unchained product line from an edition model: validates the model
 * and, if it has no errors, replaces the game modes of a copy of the game with the ones it describes.
 * Used by the command-line generator ({@link Main}) and by the "Generate into Game" command of the
 * editor.
 */
public class GameGeneration {

	/** What a generation run did. */
	public record Outcome(boolean generated, List<Issue> issues, String message) {
	}

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject
	private Provider<JavaIoFileSystemAccess> fileAccessProvider;

	/** Whether a folder looks like the root of the game: it has the core module and the assets. */
	public static boolean isGameFolder(File folder) {
		return new File(folder, "core").isDirectory() && new File(folder, "assets").isDirectory();
	}

	public Outcome generate(Resource resource, File game) {
		if (!isGameFolder(game)) {
			return new Outcome(false, List.of(), "Not a Rango Unchained game folder (no core/ and assets/): " + game);
		}
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		boolean errors = issues.stream().anyMatch(issue -> issue.getSeverity() == Severity.ERROR);
		if (errors || resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof Edition)) {
			return new Outcome(false, issues, "Nothing generated: " + resource.getURI().lastSegment() + " has errors.");
		}
		try {
			clean(game);
		} catch (IOException e) {
			return new Outcome(false, issues, "Could not remove the previously generated game modes: " + e.getMessage());
		}
		JavaIoFileSystemAccess fileAccess = fileAccessProvider.get();
		fileAccess.setOutputPath(game.getPath());
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.generate(resource, fileAccess, context);

		Edition edition = (Edition) resource.getContents().get(0);
		return new Outcome(true, issues, "Generated " + edition.getModes().size() + " game modes of edition "
				+ edition.getName() + " into " + game);
	}

	/**
	 * Removes what an earlier run generated (the generated Java package and the arena resources), so
	 * that a mode removed from the model also disappears from the game.
	 */
	private void clean(File game) throws IOException {
		deleteFiles(new File(game, GeneratorNames.JAVA_FOLDER + GeneratorNames.PACKAGE.replace('.', '/')).toPath(), ".java");
		deleteFiles(new File(game, GeneratorNames.ARENA_FOLDER).toPath(), ".json");
	}

	private void deleteFiles(Path folder, String extension) throws IOException {
		if (!Files.isDirectory(folder)) {
			return;
		}
		try (Stream<Path> files = Files.list(folder)) {
			for (Path file : files.filter(f -> f.getFileName().toString().endsWith(extension)).toList()) {
				Files.delete(file);
			}
		}
	}
}
