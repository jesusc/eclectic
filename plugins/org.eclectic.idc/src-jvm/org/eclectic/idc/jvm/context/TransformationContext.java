package org.eclectic.idc.jvm.context;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.util.Class2HTML;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.javaflow.ContinuationClassLoader;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.ExecutableUnit;
import org.eclectic.idc.jvm.runtime.IdcClassLoader;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.javaflow.SerializedTransformer;
import org.eclectic.modeling.emf.ModelManager;

/**
 * Represents the context in which a transformation is 
 * compiled. 
 * 
 * @author Jesus Sanchez Cuadrado
 *
 */
public class TransformationContext {
	private CodeUnit transformation;
	private JavaClass javaClass;
	private Class<?> compiled;
	private List<JavaClass> extraClasses = new LinkedList<JavaClass>();
	private MetamodelManager metamodelManager;

	public TransformationContext(CodeUnit transformation, MetamodelManager metamodelManager) {
		this.transformation = transformation;
		this.metamodelManager = metamodelManager;
	}
	
	public MetamodelManager getMetamodelManager() {
		return metamodelManager;
	}
	
	/**
	 * Returns the name of the corresponding Java package.
	 */
	public String getJavaPackage() {
		return "eclectic";
	}

	/**
	 * @return The name of the class that represents the current transformation.
	 */
	public String getRuntimeClassName() {
		return getJavaPackage() + "." + transformation.getName();
	}
	
	public String getFilename() {
		return this.transformation.getFile();
	}

	/**
	 * Sets the Java class that has been generated to represent this
	 * transformation.
	 * @param javaClass
	 */
	public void setJavaClass(JavaClass javaClass) {
		this.javaClass = javaClass;
	}

	public void addExtraClass(JavaClass javaClass) {
		this.extraClasses.add(javaClass);
	}

	
	/*
	public void loadClasses(ContinuationClassLoader loader) {
		if ( true ) throw new RuntimeException("Not supported anymore");
		// compiled = loader.loadGeneratedClass(javaClass.getClassName(), javaClass.getBytes());
		// To force instrumenting the class (for instance for tao transformations...)
		// TODO: See if I should split the class into two: continuable & non-continuable
		loader.loadInstrumentedClass(javaClass.getClassName(), javaClass.getBytes());
		try {
			compiled = loader.loadClass(javaClass.getClassName());
		} catch (ClassNotFoundException e) {
			throw new IdcException(e);
		}
		for (JavaClass extra : extraClasses) {
		// 	loader.loadGeneratedClass(extra);
			loader.loadInstrumentedClass(extra.getClassName(), extra.getBytes());
		}
		//List<JavaClass> classes = this.getJavaClasses();
		//for (JavaClass javaClass : classes) {
		// loader.loadGeneratedClass(javaClass);
		// }		
	}
	*/

	ClassLoader loader;
	public ClassLoader getLoader() {
		return loader;
	}

	/*
	public void loadWithLoader() {
		IdcClassLoader.BytecodeClass[] dynamicClasses = new IdcClassLoader.BytecodeClass[ extraClasses.size() ];
		for(int i = 0; i < extraClasses.size(); i++) {
			JavaClass c = extraClasses.get(i);
			dynamicClasses[i] = new IdcClassLoader.BytecodeClass(c.getClassName(), c.getBytes());
		}

		
		loader = new IdcClassLoader(dynamicClasses, new Class<?>[] {
				org.eclectic.idc.jvm.runtime.HistoryQueue.class,
				org.eclectic.idc.jvm.runtime.LocalQueue.class,
				org.eclectic.idc.jvm.runtime.ModelQueue.class,
				org.eclectic.idc.datatypes.ImmutableList.class,
				org.eclectic.idc.datatypes.JavaListConverter.class,
				org.eclectic.idc.jvm.runtime.RequestKindProperty.class				
				
		}, new Class<?>[] {});
		
		compiled = loader.loadGeneratedClass(javaClass.getClassName(), javaClass.getBytes());
	}
		*/

	private String getClassFile(JavaClass c) {
		return c.getClassName().replace('.', File.separatorChar)  + ".class";
	}

	public void dump(String dir) throws IOException {
		dump(dir, null, new LinkedList<String>());
	}

	public void removeCompileFiles(String dir) {
		String dirMain  = dir + File.separator + javaClass.getPackageName().replace('.', File.separatorChar);
		File f = new File(dirMain);
		if ( ! f.exists() ) 
			return;
		File[] files = f.listFiles();
		for (File file : files) {
			if ( file.getName().startsWith(transformation.getName()) ) {
				file.delete();
				//System.out.println("Deleting " + file);
			}
		}
	}
	

	public void dump(String dir, ClassLoader runtimeClassLoader, List<String> additionalPaths) throws IOException {
		String pathMain  = dir + File.separator + getClassFile(javaClass);
		System.out.println("Dumping to: " + pathMain);
		javaClass.dump(pathMain);

		for (JavaClass extra : extraClasses) {
			String path = dir + File.separator + getClassFile(extra);
			extra.dump(path);
		}
		
		SerializedTransformer t = new SerializedTransformer(dir, additionalPaths);
		if ( runtimeClassLoader != null ) 
			t.setRuntimeClassLoader(runtimeClassLoader);
		
		t.instrumentClass(getClassFile(javaClass));		

		for (JavaClass extra : extraClasses) {
			t.instrumentClass(getClassFile(extra));		
		}

		System.out.println("Finished: " + pathMain);
	}


	public void loadWithLoader() {
		ContinuationClassLoader cloader = ContinuationClassLoader.getInstance(getClass().getClassLoader());
		loader = cloader;
		compiled = cloader.loadGeneratedClass(javaClass.getClassName(), javaClass.getBytes());
		/*
		// To force instrumenting the class (for instance for tao transformations...)
		// TODO: See if I should split the class into two: continuable & non-continuable
		cloader.loadInstrumentedClass(javaClass.getClassName(), javaClass.getBytes());
		try {
			compiled = loader.loadClass(javaClass.getClassName());
		} catch (ClassNotFoundException e) {
			throw new IdcException(e);
		}
		*/

		for (JavaClass extra : extraClasses) {
		//	if ( extra.getClassName().startsWith("eclectic.uml2swing$segment$Class_JPanel_BoxLayout$ForAllforAll_178") ) {
		//		System.out.println(extra.getClassName());
		//		cloader.loadNoInstrumentedClass(extra.getClassName(), extra.getBytes());
		//	}
		//	else 
				cloader.loadInstrumentedClass(extra.getClassName(), extra.getBytes());
		}

		// cloader.forceLoads();
	}

	public void forceLoads() {
		((ContinuationClassLoader) loader).forceLoads();
	}

	/*
	protected List<JavaClass> getJavaClasses() {
		LinkedList<JavaClass> result = new LinkedList<JavaClass>();
		result.add(javaClass);
		return result;
	}
	*/

	/**
	 * Check whether this context corresponds to the transformation
	 * whose name is given.
	 * 
	 * @param name The name of the transformation.
	 * @return true if this context has been used to compile the transformation.
	 */
	public boolean is(String name) {
		return this.transformation.getName().equals(name);
	}
	
	
	public IdcTransformationBase getTransformationInstance(ModelManager m) {
		/*
		try {
			new Class2HTML(javaClass, "/tmp/");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		*/
		
		try {
			IdcTransformationBase t = (IdcTransformationBase) compiled.newInstance();
			t.setModelManager(m);
			return t;
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new IdcException(e);
		} catch (IllegalAccessException e) {
			throw new IdcException(e);
		}
	}

}
