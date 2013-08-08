package org.eclectic.ttc2013.flowgraphs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.idc.jvm.runtime.MethodLibraryBase;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class TransformTask3 {

	public static void main(String[] args) throws IOException {
		
		for(int i = 0; i <= 6; i++) {
			System.out.println("Begin transforming " + i);
			new TransformTask3().
				transform("original/results/Test" + i + "-ControlFlowGraph-with-Vars.xmi", "tmp_/task3.result" + i + ".xmi");
			System.out.println("End transforming " + i);	
			System.out.println();
		}
		
		/*
		int i = 5;
		new TransformTask3().
			transform("original/results/Test" + i + "-ControlFlowGraph-with-Vars.xmi", "tmp_/task3.result" + i + ".xmi");
		*/
	}

	public void transform(String sourceFile, String targetFile) throws IOException {	
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		
		IdcTransformationBase transformation = new eclectic.task3();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = loader
				.basicModelFromFile(
						new String[] {
						withDir("original/metamodel/FlowGraph.ecore") },
						withDir(sourceFile));

		//BasicEMFModel out = 
		//		loader.basicEmptyModelFromFile("original/metamodel/FlowGraph.ecore", "tmp_/test0.xmi");
		
		manager.register("flow", in);
		//manager.register("out", out);

		
		in.registerMethodHandler(new LibraryMethodHandler(eclectic.task3_2_navigation.class, manager));
		// in.registerMethodHandler(new CustomMethodHandler(manager));
		//out.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		
		//out.serialize();
		
		in.serialize(new FileOutputStream(new File(targetFile)));
		System.out.println("Finished "
				+ TransformTask3.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}

	
	public static class LibraryMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {
		private Class<?> transformation;

		public LibraryMethodHandler(Class<?> class1, ModelManager m) {
			super(m);
			this.transformation = class1;
		}
		
		@Override
		public IMethodWrapper wrap(Object o) {
			EObject eobj = (EObject) o;
			String metaclassName = eobj.eClass().getName();
			String wrapperClassName = transformation.getName() + "$" + "wrap_" + "FlowInstr"; // metaclassName;

			try {
				Class<?> c = transformation.getClassLoader().loadClass(wrapperClassName);
				IdcTransformationBase wrapper = (IdcTransformationBase) c.getConstructor(new Class[] { Object.class }).newInstance(o);
				wrapper.setModelManager(this.manager);
				return (IMethodWrapper) wrapper;
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			} catch (InstantiationException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			} catch (SecurityException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
			
			// return super.wrap(o);
		}
	}
	
		
	// Copied from atl adapter in components.api
	public static class CustomMethodHandler extends
			org.eclectic.idc.jvm.runtime.BasicMethodHandler {
		public CustomMethodHandler(ModelManager m) {
			super(m);
		}

		@Override
		public IMethodWrapper wrap(Object o) {
			try {
				return new CustomMethodWrapper(manager.getNamespace(o), o);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
		}
	}

	public static class CustomMethodWrapper extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {

		public CustomMethodWrapper(IModel<?, ?> model, Object o) {
			super(model, o);
			// TODO Auto-generated constructor stub
		}
	}


}
