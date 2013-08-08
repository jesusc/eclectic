package org.eclectic.ui.classpath;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.pde.core.plugin.IPluginLibrary;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModel;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathUtilCore;
import org.osgi.framework.Bundle;

/**
 * This class is used with the org.eclectic.ui.classpathContainerPage extension point to
 * add the "Eclectic library" entry to the "Add library" wizard.
 *  
 * Related: http://www.ibm.com/developerworks/opensource/tutorials/os-eclipse-classpath/ 
 *          Pde class: org.eclipse.pde.internal.core.RequiredPluginsInitializer
 * @author jesus
 */
public class EclecticClasspathContainerInitializer extends org.eclipse.jdt.core.ClasspathContainerInitializer {

	public static final String CLASSPATH_ID = "org.eclectic.ui.classpath.EclecticClasspathContainerInitializer";

	public EclecticClasspathContainerInitializer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		EclecticContainerInternal container = getNewContainer(containerPath);
		JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	
				new IClasspathContainer[] { container }, null);
		
		
	}

	// see http://www.devdaily.com/java/jwarehouse/eclipse/org.eclipse.jdt.junit/src/org/eclipse/jdt/internal/junit/buildpath/JUnitContainerInitializer.java.shtml
	// see http://grepcode.com/file/repository.grepcode.com/java/eclipse.org/3.6.1/org.eclipse.jdt.junit/core/3.6.1/org/eclipse/jdt/internal/junit/buildpath/BuildPathSupport.java#BuildPathSupport.JUnitPluginDescription.getLibraryEntry
	private EclecticContainerInternal getNewContainer(IPath containerPath) {
		// IPath bundleLocation  = new Path(org.eclectic.idc.Activator.getBundle().getLocation());
		// IClasspathEntry entry = JavaCore.newLibraryEntry(
		//		bundleLocation.append("eclectic-runtime.jar"), null, null);

		// I may need to touch raw classpath according to the clojure example, but i don't know why 
		
		// Eclectic-runtime		
		/*
		File libFile = getJarInsidePlugin(org.eclectic.idc.Activator.getBundle().getSymbolicName(), "eclectic-runtime");
		IPath libraryLocation = Path.fromOSString(libFile.getAbsolutePath());

		IPluginModelBase srcPlugin = PluginRegistry.findModel(org.eclectic.idc.Activator.getBundle().getSymbolicName());   
		IClasspathEntry entryEclecticRuntime = JavaCore.newLibraryEntry(libraryLocation, 
				Path.fromPortableString(srcPlugin.getInstallLocation()), null);
		
		// Eclectic-modelhandling
		File libFile2 = getJarInsidePlugin(org.eclectic.idc.Activator.getBundle().getSymbolicName(), "eclectic-modeling");
		IPath libraryLocation2 = Path.fromOSString(libFile2.getAbsolutePath());
		IClasspathEntry entryEclecticModeling = JavaCore.newLibraryEntry(libraryLocation2, null, null);
		*/
		
		// Bundle bundle = Platform.getBundle("org.eclipse.emf.ecore");
		//Path path = new Path("icons/sample.gif");
		//   URL fileURL = FileLocator.find(bundle, path, null);
		//   InputStream in = fileURL.openStream();

		LinkedList<BundleDescription> bundleDescriptions = new LinkedList<BundleDescription>();
		bundleDescriptions.add( PluginRegistry.findModel("org.eclipse.emf.ecore").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("org.eclipse.emf.ecore.xmi").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("org.eclectic.idc").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("org.eclectic.modeling").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("org.eclectic.javaflow").getBundleDescription() );
		// To allow loading a description to create an ApiModel -> maybe it could be removed in the future
		bundleDescriptions.add( PluginRegistry.findModel("org.eclectic.apidesc.language").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("org.eclectic.streamdesc.language").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("com.google.inject").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("javax.inject").getBundleDescription() );
		bundleDescriptions.add( PluginRegistry.findModel("com.google.guava").getBundleDescription() );
		
		
		fillWithDependent( bundleDescriptions );

		LinkedList<IClasspathEntry> entries = new LinkedList<IClasspathEntry>();
		for (int i = 0; i < bundleDescriptions.size(); i++) {
			BundleDescription bundleDescription = bundleDescriptions.get(i);
			
			// IPluginModelBase plugin = PluginRegistry.findModel(bundleDescription);  
			// IPath libraryLocation_ = Path.fromPortableString(plugin.getInstallLocation());
			// IClasspathEntry entry_ = JavaCore.newLibraryEntry(libraryLocation_, null, null);
			
			createEntry(bundleDescription, entries);
		}

		// entries.add( entryEclecticRuntime );
		// entries.add( entryEclecticModeling );

		File libFile2 = getJarInsidePlugin(org.eclectic.idc.Activator.getBundle().getSymbolicName(), "lib-instrumented/idc-instrumented");
		IPath libraryLocation2 = Path.fromOSString(libFile2.getAbsolutePath());
		IClasspathEntry entryIdcInstrumentedClasses = JavaCore.newLibraryEntry(libraryLocation2, null, null);
		entries.add(entryIdcInstrumentedClasses);

		String javaflow = PluginRegistry.findModel("org.eclectic.javaflow").getBundleDescription().getSymbolicName();		
		File libFile3 = getJarInsidePlugin(javaflow, "lib/commons-logging-api-1.1.1");
		IPath libraryLocation3 = Path.fromOSString(libFile3.getAbsolutePath());
		IClasspathEntry javaflow3 = JavaCore.newLibraryEntry(libraryLocation3, null, null);
		entries.add(javaflow3);

		File libFile4 = getJarInsidePlugin(javaflow, "lib/commons-logging-1.1.1");
		IPath libraryLocation4 = Path.fromOSString(libFile4.getAbsolutePath());
		IClasspathEntry javaflow4 = JavaCore.newLibraryEntry(libraryLocation4, null, null);
		entries.add(javaflow4);

		
		IClasspathEntry[] entriesAsArray = new IClasspathEntry[entries.size()];
		entries.toArray(entriesAsArray);
		return new EclecticContainerInternal(containerPath, entriesAsArray);
	}
	
	private void fillWithDependent(LinkedList<BundleDescription> bundleDescriptions) {
		HashSet<String> added = new HashSet<String>();
		for (BundleDescription bundleDescription : new LinkedList<BundleDescription>(bundleDescriptions) )  {
			//BundleSpecification[] deps = bundleDescription.getRequiredBundles();
			// for (BundleSpecification depSpec : deps) {
				// if ( depDescription.getSymbolicName().contains("commons.logging") ) 
				// 	break;
				
				// BundleDescription depDescription = depSpec.getBundle();
			BundleDescription deps[] = bundleDescription.getResolvedRequires();
			for(BundleDescription depDescription : deps) {
				if ( ! added.contains( depDescription.getSymbolicName() )) {
					bundleDescriptions.add( depDescription );
					added.add( depDescription.getSymbolicName() );
				}
			}
		}
		
	}

	// Adapted from RequiredPluginsClassPathContainer#addPlugin and PDEClasspathContainer#addExternalPlugin
    private void createEntry(BundleDescription desc, LinkedList<IClasspathEntry> entries) {      
        IPluginModelBase model = PluginRegistry.findModel(desc);
        IResource resource = model.getUnderlyingResource();
        // Rule[] rules = useInclusions ? getInclusions(map, model) : null;
        if (resource != null) {
        	entries.add( JavaCore.newProjectEntry(resource.getProject().getFullPath()) );
        	// addProjectEntry(resource.getProject(), rules, entries);
        } else {
        	if ( new File(model.getInstallLocation()).isFile() ) {
        		String installLocation = model.getInstallLocation();
        		// This is to make it work in windows...
        		if ( ! installLocation.startsWith("/" ) ) {
        			installLocation = "/" + installLocation;
        		}
        		IPath libraryLocation_ = Path.fromOSString(installLocation);
        		entries.add( JavaCore.newLibraryEntry(libraryLocation_, null, null) );

        		//IPath libraryLocation_ = Path.fromPortableString(model.getInstallLocation());
        		//entries.add( JavaCore.newLibraryEntry(libraryLocation_, null, null) );
        	} else {
        		IPluginLibrary[] libraries = model.getPluginBase().getLibraries();
                for (int i = 0; i < libraries.length; i++) {
                    if (IPluginLibrary.RESOURCE.equals(libraries[i].getType()))
                        continue;
                    model = (IPluginModelBase)libraries[i].getModel();
                    
                    String name = libraries[i].getName();
                    String expandedName = ClasspathUtilCore.expandLibraryName(name);
                    IPath path = getPath(model, expandedName);
                    if (path == null && !model.isFragmentModel() && ClasspathUtilCore.containsVariables(name)) {
                        model = resolveLibraryInFragments(model, expandedName);
                        if (model != null && model.isEnabled())
                            path = getPath(model, expandedName);
                    }
                    if (path != null && !path.toFile().isDirectory()) {
                    	entries.add( JavaCore.newLibraryEntry(path, 
                    			ClasspathUtilCore.getSourceAnnotation(model, expandedName), null) );                       
                    	// addLibraryEntry(path, ClasspathUtilCore.getSourceAnnotation(model, expandedName), rules, getClasspathAttributes(model), entries);
                    } else if ( path != null ) {
                    	// is a directory
                    	entries.add(JavaCore.newLibraryEntry(path, ClasspathUtilCore.getSourceAnnotation(model, expandedName), null));
                    }
                }             		
        	}
        }
    }
	
    // Copied from PDEClasspathContainer#getPath
    protected static IPath getPath(IPluginModelBase model, String libraryName) {
        IResource resource = model.getUnderlyingResource();
        if (resource != null) {
            IResource jarFile = resource.getProject().findMember(libraryName);
            return (jarFile != null) ? jarFile.getFullPath() : null;
        } 
        File file = new File(model.getInstallLocation(), libraryName);
        return file.exists() ? new Path(file.getAbsolutePath()) : null;
    }
    
    // Copied from PDEClasspathContainer#resolveLibraryInFragments
    protected static IPluginModelBase resolveLibraryInFragments(IPluginModelBase model, String libraryName) {
        BundleDescription desc = model.getBundleDescription();
        if (desc != null) {
            BundleDescription[] fragments = desc.getFragments();
            for (int i = 0; i < fragments.length; i++) {
                if (new File(fragments[i].getLocation(), libraryName).exists())
                    return PluginRegistry.findModel(fragments[i]);
            }
        }
        return null;
    }
    
	private static class EclecticContainerInternal implements IClasspathContainer {
		private final IClasspathEntry[] fEntries;
		private final IPath fPath;

		public EclecticContainerInternal(IPath path, IClasspathEntry[] entries) {
			fPath= path;
			fEntries= entries;
		}

		public IClasspathEntry[] getClasspathEntries() {
			return fEntries;
		}

		public String getDescription() {
			return "Eclectic";
		}

		public int getKind() {
			// return IClasspathContainer.K_SYSTEM; // originally, K_APPLICATION, but then it does not load EMF...
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return fPath;
		}		
	}

	/**
	 * Adapted from "ClojureProjectNature", in http://code.google.com/p/clojure-dev/source/browse/src/clojuredev/ClojureProjectNature.java?r=823b1fa724ead0027dbfbf3450eaca5f5d8257b7
	 * @param pluginName
	 * @param jarName
	 * @return
	 */
    private File getJarInsidePlugin(String pluginName, String jarName) {
        try {
                Bundle bundle = Platform.getBundle(pluginName);
                File bundlePath = FileLocator.getBundleFile(bundle);
                if (bundlePath.isFile()) {
                        // ClojuredevPlugin.logError(pluginName + " plugin should be deployed as a directory");
                		// return null;
                	throw new RuntimeException(pluginName + " plugin should be deployed as a directory");
                }
                
                File libEntry = new File(bundlePath, jarName + ".jar");
                if (!libEntry.exists()) {
                	// ClojuredevPlugin.logError("Unable to locate " + jarName + " jar in " + pluginName + " plugin");
                	// return null;
                	throw new RuntimeException("Unable to locate " + jarName + " jar in " + pluginName + " plugin");
                }
                return libEntry;
        } catch (IOException e) {
        	throw new RuntimeException("Unable to find " + pluginName + " plugin");
        	// ClojuredevPlugin.logError("Unable to find " + pluginName + " plugin");
            // return null;
        }
    }
    
}
