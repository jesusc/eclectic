package org.eclectic.ui.builder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.util.CoreUtility;

// see for a classpath example: http://clojure-dev.googlecode.com/hg-history/44bc5352ed059e3eac601ba0a1278c8193b85034/src/clojuredev/ClojureProjectNature.java
public class EclecticProjectNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "org.eclectic.nature";

	private IProject project;

	/*
	public IPath getEclecticSpecificSourceFolder() throws JavaModelException {
		return getJavaProject(project).getOutputLocation();
	}
	*/

	public String getEclecticSpecificSourceFolder() throws JavaModelException {
		return "eclectic-gen";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(EclecticBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(EclecticBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
		
		IFolder genDir = project.getFolder(this.getEclecticSpecificSourceFolder());
		if ( ! genDir.exists() ) {
			genDir.create(true, true, null);
		
			// JavaCore.newSourceEntry(genDir.getLocation());
			addClasspathFolder(project, genDir);
		}
		
		
	}

	
	
	private void addClasspathFolder(IProject p, IFolder folder) throws CoreException {
		IJavaProject project = getJavaProject(p);

		//if (!project.exists())
		//	createJavaProject(project.getProject());
		//final IFolder folder= project.getProject().getFolder(root.getElementName());
		//if (!folder.exists())
		//	CoreUtility.createFolder(folder, true, true, new NullProgressMonitor());
		final List<IClasspathEntry> aux = Arrays.asList(project.getRawClasspath());
		LinkedList<IClasspathEntry> list = new LinkedList<IClasspathEntry>();
		list.addAll(aux);
		//list.add(JavaCore.newSourceEntry(folder.getFullPath()));
		list.add( JavaCore.newLibraryEntry(folder.getFullPath(), null, null) );
		
		// project.setRawClasspath(entries, outputLocation, monitor)
		project.setRawClasspath(list.toArray(new IClasspathEntry[list.size()]), new NullProgressMonitor());
	}

	private IJavaProject getJavaProject(IProject p) {
		IJavaProject project = null;
		try {
			project = (IJavaProject) p.getNature(JavaCore.NATURE_ID);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return project;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(EclecticBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);			
				return;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

}
