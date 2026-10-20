package no.ntnu.tdt4250.rango.gamemode.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

/**
 * Where the Eclipse builder writes what the generator produces when a model is saved: a folder
 * {@code generated-game} next to the model, laid out like the game (core/..., assets/..., android/...)
 * so the result can be inspected. The command-line generator (see {@link Main}) writes the same files
 * straight into a copy of the game.
 */
public class RangoModeOutputConfigurationProvider implements IOutputConfigurationProvider {

	public static final String PREVIEW_FOLDER = "./generated-game";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration preview = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		preview.setDescription("Generated game modes (preview of the files written into the game)");
		preview.setOutputDirectory(PREVIEW_FOLDER);
		preview.setOverrideExistingResources(true);
		preview.setCreateOutputDirectory(true);
		preview.setCleanUpDerivedResources(true);
		preview.setSetDerivedProperty(true);
		preview.setKeepLocalHistory(false);
		return Set.of(preview);
	}
}
