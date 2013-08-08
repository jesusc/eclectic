package org.eclectic.ttc2013.flowgraphs;

import java.io.File;
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

public class TransformAll {

	public static void main(String[] args) throws Exception {

		for(int i = 0; i < 9; i++) {
		//int i = 1;
		System.out.println("Transforming example " + i);
		new TransformTask1().
			transform("original/models/Test" + i + ".java.xmi", "tmp_/task1.result" + i + ".xmi");
		
		new TransformTask2().
			transform("tmp_/task1.result" + i + ".xmi", "tmp_/task2.result" + i + ".xmi");
	
		new TransformTask3().
			transform("tmp_/task2.result" + i + ".xmi", "tmp_/task3.result" + i + ".xmi");
		System.out.println();
		}
		/*
		new ValidateTask4().
			transform("tmp_/task3.result" + i + ".xmi", 
				"dsl/test" + i + ".validate",
				"tmp_/task4.result" + i + ".xmi");
		*/
	}

}
