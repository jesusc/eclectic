package org.eclectic.ui.wizards;

import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;

import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

/**
 * Creates a new Eclectic file. 
 * 
 * @author jesus
 */
public class NewEclecticFile extends Wizard implements INewWizard {
	private NewEclecticFilePage page;
	private ISelection selection;

	public NewEclecticFile() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		// page = new NewEclecticFilePage(selection);
		page = new NewEclecticFilePage();
		page.init((IStructuredSelection) selection);
		addPage(page);
	}


	public boolean performFinish() {
		final IPath path = page.getPackageFragment().getPath();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(path, page.getTypeName() + ".eclectic", monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */
	private void doFinish(IPath packagePath, String filename, IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + filename, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(packagePath);
		if ( resource == null ) {
			root.getFolder(packagePath).create(true, true, monitor);
		}
		
		
		final IFile file = root.getFile(packagePath.append(filename));
		
		// IResource resource = root.findMember(new Path(containerName));
		//if (!resource.exists() || !(resource instanceof IContainer)) {
		//	throwCoreException("Container \"" + containerName + "\" does not exist.");
		//}
		//IContainer container = (IContainer) resource;
		//final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream(filename);
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 * @param filename 
	 */

	private InputStream openContentStream(String filename) {
		String tname = filename.replace(".eclectic", "");
		StringBuffer buffer = new StringBuffer();
		buffer.append("eclectic " + tname + " (in) -> (out)");
		buffer.append('\n');
		
		buffer.append("mappings " + tname + "_map" + "(in) -> (out)");
		
		buffer.append('\n');
		buffer.append("end");

		
		buffer.append('\n');

		return new ByteArrayInputStream(buffer.toString().getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.eclectic.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}