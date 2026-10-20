package no.ntnu.tdt4250.rango.gamemode.dsl.ui.generate;

import java.io.File;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;

import no.ntnu.tdt4250.rango.gamemode.dsl.generator.GameGeneration;
import no.ntnu.tdt4250.rango.gamemode.dsl.ui.internal.DslActivator;

/**
 * "Generate Game Modes into Game...": derives a product from the selected edition model. Asks for the
 * folder of the game (remembering the last one, and proposing a {@code rango-game} folder next to the
 * project), validates the model, and replaces the game modes of the game with the generated ones.
 */
public class GenerateIntoGameHandler extends AbstractHandler {

	private static final String TITLE = "Generate Game Modes into Game";
	private static final String LAST_FOLDER = "generateIntoGame.lastFolder";

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private GameGeneration generation;

	@Override
	public Object execute(ExecutionEvent event) {
		Shell shell = HandlerUtil.getActiveShell(event);
		IFile file = modelFile(event);
		if (file == null) {
			MessageDialog.openInformation(shell, TITLE, "Select a .rango model, or open one in the editor.");
			return null;
		}
		if (!IDE.saveAllEditors(new IResource[] { file }, true)) {
			return null;
		}

		DirectoryDialog dialog = new DirectoryDialog(shell);
		dialog.setText(TITLE);
		dialog.setMessage("Choose the folder of the Rango Unchained game: the one with core/ and assets/.");
		dialog.setFilterPath(defaultFolder(file));
		String folder = dialog.open();
		if (folder == null) {
			return null;
		}
		preferences().setValue(LAST_FOLDER, folder);

		Resource resource = resourceSetProvider.get(file.getProject())
				.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		GameGeneration.Outcome outcome = generation.generate(resource, new File(folder));
		refresh(new File(folder));

		if (outcome.generated()) {
			MessageDialog.openInformation(shell, TITLE, outcome.message());
		} else {
			String errors = outcome.issues().stream()
					.filter(issue -> issue.getSeverity() == Severity.ERROR)
					.map(issue -> "line " + issue.getLineNumber() + ": " + issue.getMessage())
					.collect(Collectors.joining("\n"));
			MessageDialog.openError(shell, TITLE, outcome.message() + (errors.isEmpty() ? "" : "\n\n" + errors));
		}
		return null;
	}

	/** The selected .rango file, or the one in the active editor. */
	private IFile modelFile(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection structured && structured.getFirstElement() instanceof IAdaptable adaptable) {
			IFile file = adaptable.getAdapter(IFile.class);
			if (file != null && "rango".equals(file.getFileExtension())) {
				return file;
			}
		}
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor != null && editor.getEditorInput() instanceof IFileEditorInput input
				&& "rango".equals(input.getFile().getFileExtension())) {
			return input.getFile();
		}
		return null;
	}

	private String defaultFolder(IFile file) {
		String last = preferences().getString(LAST_FOLDER);
		if (last != null && !last.isEmpty()) {
			return last;
		}
		File project = file.getProject().getLocation().toFile();
		File sibling = new File(project.getParentFile(), "rango-game");
		return GameGeneration.isGameFolder(sibling) ? sibling.getPath() : project.getPath();
	}

	/** Lets the workspace see the generated files if the game is (inside) a workspace project. */
	private void refresh(File folder) {
		for (IContainer container : ResourcesPlugin.getWorkspace().getRoot().findContainersForLocationURI(folder.toURI())) {
			try {
				container.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// the files are written; only the workspace view is stale
			}
		}
	}

	private IPreferenceStore preferences() {
		return DslActivator.getInstance().getPreferenceStore();
	}
}
