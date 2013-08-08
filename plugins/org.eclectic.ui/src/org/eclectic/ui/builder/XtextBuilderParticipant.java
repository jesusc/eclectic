package org.eclectic.ui.builder;

import java.io.File;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.apidesc.ApiDescriptionLanguageLoader;
import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.api.AttributionCompiler;
import org.eclectic.frontend.api.BasicCompiler;
import org.eclectic.frontend.api.ChainCompiler;
import org.eclectic.frontend.api.EclecticCompiler;
import org.eclectic.frontend.api.MappingsCompiler;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.api.TaoCompiler;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.streamdesc.StreamDescLanguageLoader;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.internal.statushandlers.DefaultDetailsArea;
import org.eclipse.ui.statushandlers.AbstractStatusAreaProvider;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.XtextResource;

public class XtextBuilderParticipant implements IXtextBuilderParticipant {

	public XtextBuilderParticipant() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		
		if ( context.getBuildType() == BuildType.RECOVERY ) {
			System.out.println("==> Ignoring recovery build.");
			return;
		}
 		
		List<Delta> deltas = context.getDeltas();
		for (Delta delta : deltas) {
			Resource aResource = context.getResourceSet().getResource(delta.getUri(), true);
			if ( ! (aResource instanceof XtextResource) ) {
				System.out.println("Resource " + aResource + " is not XtextResource" );
				continue;
			}
			
			/*
			if ( ! delta.haveEObjectDescriptionsChanged() ) {
				continue;
			}
			*/

			System.out.println("===>   isModified? " + aResource.isModified() + ": " + aResource );
			System.out.println("===> Have changes? " + delta.haveEObjectDescriptionsChanged() + ": " + aResource );
			System.out.println("===> Build type: " + context.getBuildType());
			
			XtextResource resource = (XtextResource) aResource;
			
			if ( resource.isLoaded() && resource.getErrors().size() == 0 ) { 
				if ( resource.getLanguageName().endsWith("Mappings") ) {
					compileMappings(resource, context, monitor);
				}
				else if ( resource.getLanguageName().endsWith("Attribution") ) {
					compileAttribution(resource, context, monitor);
				}
				else if ( resource.getLanguageName().endsWith("Chain") ) {
					compileChain(resource, context, monitor);
				}
				else if ( resource.getLanguageName().endsWith("Qool") ) {
					compileQool(resource, context, monitor);
				}
				else if ( resource.getLanguageName().endsWith("Tao") ) {
					compileTao(resource, context, monitor);
				}
				else if ( resource.getLanguageName().endsWith("Eclectic") ) {
					compileEclectic(resource, context, monitor);
				}
			}
		}
	}

	/*
	private void compileMappings(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		JVMCompilationResult executor;
		try {
			System.out.println("Compiling " + resource.getURI());
			
			IPath path = new Path(resource.getURI().toPlatformString(false)).makeRelativeTo(context.getBuiltProject().getLocation());
			path = path.removeFirstSegments(1); // TODO: This is to remove src -> see how to know the source folder...
			executor = new MappingsCompiler().execute(resource, path.toPortableString());
			
			org.eclipse.core.internal.resources.Project p = (Project) context.getBuiltProject();
			IJavaProject nature = null;
			IPath genDir = null;
			// JavaProject
			// nature = (IJavaProject) p.getNature(JavaCore.NATURE_ID);
			// I could put each transformation in a different directory, to attach source files... 
			EclecticProjectNature eclNature = (EclecticProjectNature) p.getNature(EclecticProjectNature.NATURE_ID);				
			genDir = context.getBuiltProject().getLocation().append( eclNature.getEclecticSpecificSourceFolder() );
			
			// Generates directly to the default output folder
			//EclecticProjectNature eclNature = (EclecticProjectNature) p.getNature(EclecticProjectNature.NATURE_ID);
			//genDir = context.getBuiltProject().getLocation().append( eclNature.getEclecticSpecificSourceFolder() );
			
			executor.dump( genDir.toOSString(), this.getClass().getClassLoader() );
			
			// I do not how to refresh only the classpath entry, so I refresh the whole project
			context.getBuiltProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			
			//System.out.println(context.getBuiltProject().getFile(eclNature.getEclecticSpecificSourceFolder()).exists());
			// context.getBuiltProject().getWorkspace().getRoot().getFile(genDir).refreshLocal(10, monitor);
			// context.getBuiltProject().getFile(eclNature.getEclecticSpecificSourceFolder()).refreshLocal(10, monitor);
		} catch (EclecticException e) {
			// TODO: Throw Eclipse exceptions
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}
	*/

	private void compileEclectic(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new EclecticCompiler(), monitor);		
	}

	private void compileMappings(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new MappingsCompiler(), monitor);
	}

	private void compileAttribution(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new AttributionCompiler(), monitor);
	}

	private void compileTao(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new TaoCompiler(), monitor);
	}

	private void compileQool(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new QoolCompiler(true, QoolCompiler.JAVA_VERSION), monitor);
	}

	private void compileChain(XtextResource resource, IBuildContext context, IProgressMonitor monitor) {
		compile(resource, context, new ChainCompiler(), monitor);
	}

	private void compile(XtextResource resource, IBuildContext context, BasicCompiler compiler, IProgressMonitor monitor) {
		compiler = compiler.withMetamodelManager(
				new MetamodelManager().
				addMetamodelLoader(new ApiDescriptionLanguageLoader()).
				addMetamodelLoader(new StreamDescLanguageLoader()));
		JVMCompilationResult executor;
		IFile compiledFile = null;
		try {
			System.out.println("Compiling " + resource.getURI());

			// This is needed because Xtext does lazy linking, but the real problem is that
			// I create the self variable lazily, but the transformation associate self in the
			// trace before it is lazily created as a response of a variable reference resolution!!!
			EcoreUtil.resolveAll(resource);
			
			
			IPath path = new Path(resource.getURI().toPlatformString(false)).makeRelativeTo(context.getBuiltProject().getLocation());
			path = path.removeFirstSegments(1); // TODO: This is to remove src -> see how to know the source folder...
			compiledFile = context.getBuiltProject().getFile(path);
			
			executor = compiler.execute(resource, path.toPortableString());
			
			org.eclipse.core.internal.resources.Project p = (Project) context.getBuiltProject();
			// JavaProject
			IJavaProject nature = (IJavaProject) p.getNature(JavaCore.NATURE_ID);
			
			// I could put each transformation in a different directory, to attach source files... 
			EclecticProjectNature eclNature = (EclecticProjectNature) p.getNature(EclecticProjectNature.NATURE_ID);				
			IPath genDir = context.getBuiltProject().getLocation().append( eclNature.getEclecticSpecificSourceFolder() );
			
			// Generates directly to the default output folder
			//EclecticProjectNature eclNature = (EclecticProjectNature) p.getNature(EclecticProjectNature.NATURE_ID);
			//genDir = context.getBuiltProject().getLocation().append( eclNature.getEclecticSpecificSourceFolder() );
			
			List<String> paths = new LinkedList<String>();
			IClasspathEntry[] classpath = nature.getRawClasspath();
			for(int i = 0; i < classpath.length; i++) {

				// TODO: Differentiate between paths relative to the project and absolute paths, so far all considered relative
				if ( classpath[i].getEntryKind() == ClasspathEntry.CPE_LIBRARY ) {
					if ( classpath[i].getPath().toPortableString().endsWith(".jar") ) {
						IPath path2 = new Path(context.getBuiltProject().getLocation().toPortableString());
						path2 = path2.append(classpath[i].getPath().removeFirstSegments(1));
						
						String cpath = path2.toPortableString();
						paths.add(cpath);
						//System.out.println(cpath);
					}	
					
				}			
			}
			//paths.add("/home/jesus/usr/qool/runtime-Eclectic2/jgraph/lib/jgraphx.jar");
			
			executor.removeCompiledFiles(genDir.toOSString());
			executor.dump( genDir.toOSString(), this.getClass().getClassLoader(), paths);
			
			// I do not how to refresh only the classpath entry, so I refresh the whole project
			context.getBuiltProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			
			//System.out.println(context.getBuiltProject().getFile(eclNature.getEclecticSpecificSourceFolder()).exists());
			// context.getBuiltProject().getWorkspace().getRoot().getFile(genDir).refreshLocal(10, monitor);
			// context.getBuiltProject().getFile(eclNature.getEclecticSpecificSourceFolder()).refreshLocal(10, monitor);
			
			// Everything is fine, so delete markers
			deleteMarkers(compiledFile);
		} catch (EclecticException e) {
			addErrorMarkerFromException(compiledFile, e);	
			throw new RuntimeException(e);
		} catch (IOException e) {
			addErrorMarkerFromException(compiledFile, e);
			throw new RuntimeException(e);
		} catch (CoreException e) {
			addErrorMarkerFromException(compiledFile, e);
			throw new RuntimeException(e);
		} catch ( Exception e ) { // fallback...
			addErrorMarkerFromException(compiledFile, e);
			throw new RuntimeException(e);			
		}
	}

	private static final String MARKER_TYPE = "org.eclectic.compiler.error";

	private void addErrorMarkerFromException(IFile file, Exception e) {
		int lineNumber = -1;
		try { 
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, e.getMessage());
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (Exception ex) {
			throw new RuntimeException(e);
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

}
