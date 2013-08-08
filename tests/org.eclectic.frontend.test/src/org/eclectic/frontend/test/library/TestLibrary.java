package org.eclectic.frontend.test.library;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.BasicMethodWrapper;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
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


public class TestLibrary {

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		IdcTransformationBase transformation = new eclectic.test_library();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = loader
				.basicModelFromFile(EcorePackage.eINSTANCE,
						withDir("metamodels/uml/UML.ecore")); // UML meta-model as model
		
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("metamodels/uml/UML.ecore"), 
				withDir("tmp_/output_library_test.xmi"));
		
		manager.register("in", in);
		manager.register("out", out);

		in.registerMethodHandler(new BasicMethodHandler(manager));
		//in.registerMethodHandler(new LibraryMethodHandler(eclectic.bottom2ecore_in_ecl_library.class, manager));
		//out.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		
		out.serialize();
		System.out.println("Finished "
				+ TestLibrary.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}

}
