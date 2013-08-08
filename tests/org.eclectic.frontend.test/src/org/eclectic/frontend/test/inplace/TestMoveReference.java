package org.eclectic.frontend.test.inplace;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;


public class TestMoveReference {

	static {	
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

	}
	
	@Test
	public void testMoveReference() throws Exception {
		BasicEMFModel result = launchMoveReference();
		/*
		List<EObject> places = result.allObjectsOf("Place");
		List<EObject> transitions = result.allObjectsOf("Transition");
		
		Assert.assertEquals(3, places.size());
		Assert.assertEquals(2, transitions.size());
		*/	
	}
	
	

	private BasicEMFModel launchMoveReference() throws IOException,
			FileNotFoundException {
		IdcTransformationBase transformation = new eclectic.test_move_reference();

		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = loader
				.basicModelFromFile(
						new String[] {
						withDir("metamodels/atl/ATL.ecore") },
						withDir("src/org/eclectic/frontend/test/inplace/flow2pn.atl.xmi"));

		manager.register("atl", in);

		in.registerMethodHandler(new BasicMethodHandler(manager));
		//out.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		
		in.serialize(new FileOutputStream("tmp_/output.xmi"));
		System.out.println("Finished "
				+ TestMoveReference.class.getSimpleName());
	
		return in;
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}

}
