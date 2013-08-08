package org.eclectic.ttc2013.flowgraphs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class TransformTask2 {

	public static void main(String[] args) throws IOException {
		for(int i = 0; i <= 6; i++) {
			System.out.println("Begin transforming " + i);
			new TransformTask2().
				transform("original/results/Test" + i + "-StructureGraph.xmi", "tmp_/task2.result" + i + ".xmi");
			System.out.println("End transforming " + i);	
			System.out.println();
		}
		
		/*
		int i = 4;
		new TransformTask2().
			transform("original/results/Test" + i + "-StructureGraph.xmi", "tmp_/task2.result" + i + ".xmi");
		*/
		/*
		int i = 2;
		new TransformTask2().
			transform("tmp_/task1.result" + i + ".xmi", "tmp_/task2.result" + i + ".xmi");
		*/
				
	}

	public void transform(String sourceFile, String targetFile) throws IOException {	
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		
		IdcTransformationBase transformation = new eclectic.task2();
		
		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = loader
				.basicModelFromFile(
						new String[] {
						withDir("original/metamodel/FlowGraph.ecore") },
						withDir(sourceFile));

		//BasicEMFModel out = 
		//		loader.basicEmptyModelFromFile("original/metamodel/FlowGraph.ecore", targetFile);
		
		manager.register("flow", in);
		//manager.register("out", out);

		in.registerMethodHandler(new CustomMethodHandler(manager));
		//out.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		in.serialize(new FileOutputStream(new File(targetFile)));

		System.out.println("Finished "
				+ TransformTask2.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
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
		
		public ImmutableList down_to(IdcMetaclass metaclass) {
			ImmutableList l = new ImmutableList();
			TreeIterator<EObject> contents = ((EObject) this.object).eAllContents();
			while ( contents.hasNext() ) {
				Object o = contents.next();
				if ( metaclass.ofKindIs(o) ) {
					l = l.add(o);
				}				
			}
			return l;
		}
	}


}
