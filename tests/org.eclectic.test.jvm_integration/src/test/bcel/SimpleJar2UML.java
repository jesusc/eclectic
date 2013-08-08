package test.bcel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.regex.Pattern;

import org.apache.bcel.classfile.AccessFlags;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.util.BCELComparator;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IModelMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import test.base.BaseTest;

public class SimpleJar2UML extends BaseTest {
    static BCELComparator simpleComparator = new BCELComparator() {		
		@Override
		public int hashCode(Object arg0) {
			return arg0.toString().hashCode();
		}
		
		@Override
		public boolean equals(Object arg0, Object arg1) {
			if ( arg0 == null || arg1 == null ) return false;
			return arg0.toString().equals(arg1.toString());
		}
	};
	

	public static void main(String[] args) throws IOException {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
	    JavaClass.setComparator(simpleComparator);
	    Method.setComparator(simpleComparator);
	    Field.setComparator(simpleComparator);
	    
		SimpleJar2UML jar2uml =  new SimpleJar2UML();
		jar2uml.test1();
	}
	
	public void test1() throws IOException {
		//String file = "lib/jgraph/jgraphx.jar";
		String file = "lib/jfugue/jfugue-4.0.3.jar";
		//String file = "test/test.jar";
		
		// parse classes
		LinkedList<JavaClass> result    = new LinkedList<JavaClass>();
		LinkedList<JavaClass> cpClasses = new LinkedList<JavaClass>();
		parseClasses(new JarFile(file), result, cpClasses);
		
		// configure transformation
		eclectic.jar2uml transformation = new eclectic.jar2uml();

		Util.registerResourceFactory();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("../org.eclectic.test/family/uml2java/UML.ecore"), 
				withDir("_tmp/jar_output.uml")); 

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiModel in = apiLoader.modelFromRoot(result, 
				withDir("src/test/bcel/bcel.apidesc"),
				new org.eclectic.apidesc.ApiDescriptionLanguageLoader()); 
		
		manager.register("jar", in);
		manager.register("uml", out);
		
		// Execute
		init("jar2uml");
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		finish();
		out.serialize();		
	}
	
	private static Pattern classFileName = Pattern.compile("^(WEB-INF/classes/)?[a-zA-Z_0-9/\\$]+\\.class$"); //$NON-NLS-1$
	private static Pattern jarFileName = Pattern.compile(".+\\.(zip|(j|w|e|s|r)ar)$"); //$NON-NLS-1$

	/**
	 * From Jar2Uml
	 */
	public void parseClasses(JarInputStream jar, Collection<JavaClass> parsedClasses, 
			Collection<JavaClass> parsedCpClasses) throws IOException {
		assert jar != null;
		for (JarEntry entry = jar.getNextJarEntry(); entry != null; entry = jar.getNextJarEntry()) {
			String name = entry.getName();
			if (classFileName.matcher(name).matches()) {
				/*
				if (!filter(entry.getName())) {
					continue;
				}
				*/
				ClassParser parser = new ClassParser(jar, entry.getName());
				JavaClass javaClass = parser.parse();
				//setMajorFormatVersion(javaClass.getMajor());
				//setMinorFormatVersion(javaClass.getMinor());
				parsedClasses.add(javaClass);
			} else if (jarFileName.matcher(name).matches()) {
				JarInputStream nestedJar = new JarInputStream(jar);
				// switch to classpath classes collection
				parseClasses(nestedJar, parsedCpClasses, parsedCpClasses);
				// do NOT close input stream!
			}
			jar.closeEntry();
			// checkCancelled();
		}
	}
	
	public void parseClasses(JarFile jar, Collection<JavaClass> parsedClasses, 
			Collection<JavaClass> parsedCpClasses) throws IOException {
		assert jar != null;
		for (Enumeration<JarEntry> entries = jar.entries(); entries.hasMoreElements();) {
			JarEntry entry = entries.nextElement();
			String name = entry.getName();
			if (classFileName.matcher(name).matches()) {
				//if (!filter(entry.getName())) {
				//	continue;
				//}
				InputStream input = jar.getInputStream(entry);
				ClassParser parser = new ClassParser(input, entry.getName());
				JavaClass javaClass = parser.parse();
				//setMajorFormatVersion(javaClass.getMajor());
				//setMinorFormatVersion(javaClass.getMinor());
				input.close();
				parsedClasses.add(javaClass);
			} else if (jarFileName.matcher(name).matches()) {
				InputStream input = jar.getInputStream(entry);
				JarInputStream nestedJar = new JarInputStream(input);
				// switch to classpath classes collection
				parseClasses(nestedJar, parsedCpClasses, parsedCpClasses);
				nestedJar.close();
			}
			//worked();
		}
	}	
	
	/*
	public class Jar2UMLHandler implements IModelMethodHandler {

		private ModelManager modelManager;

		public Jar2UMLHandler(ModelManager m) {
			this.modelManager = m;
		}

		@Override
		public IMethodWrapper wrap(Object o) {
				
		}
		
	}
	*/

}
