package org.eclectic.ttc2013.flowgraphs;

import java.io.File;
import java.io.IOException;

import meteoric.at3rdx.kernel.Model;
import meteoric.at3rdx.kernel.VirtualMachine;
import meteoric.at3rdx.shell.commands.LoadMDFile;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclectic.modeling.metadepth.MetadepthModel;
import org.eclectic.ttc2013.flowgraphs.TransformTask2.CustomMethodHandler;

public class ValidateTask4 {
	public static void main(String[] args) throws Exception {
		int i = 0;
		new ValidateTask4().
			transform("tmp_/task3.result" + i + ".xmi", 
					"dsl/test" + i + ".validate",
					"tmp_/task4.result" + i + ".xmi");
		
	}

	public void transform(String sourceFile, String sourceDsl, String targetFile) throws Exception {	

		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		
		IdcTransformationBase transformation = new eclectic.task4();
		Util.registerResourceFactory();		

		ModelManager manager = new ModelManager();
		
		Model dsl = loadModel("dsl/ValidationDSL.mdepth", "ValidationDSL");
		Model inputModel1 = new ReadPDG().execute(sourceDsl);
		
		MetadepthModel in = new MetadepthModel(
				dsl, 
				inputModel1, 
				new JavaListConverter());								

		EMFLoader     loader = new EMFLoader(new JavaListConverter());
		
		BasicEMFModel flow = loader
				.basicModelFromFile(
						new String[] {
						withDir("original/metamodel/FlowGraph.ecore") },
						withDir(sourceFile));

		manager.register("flow", flow);

		BasicEMFModel out    = loader.basicEmptyModelFromFile("dsl/Report.ecore", targetFile);
		
		manager.register("dsl", in);
		manager.register("report", out);
		
		
		in.registerMethodHandler(new CustomMethodHandler(manager));
		flow.registerMethodHandler(new CustomMethodHandler(manager));
		
		System.out.println("\n\nStarting validation...");
		
		// Execute
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		
		// Serialize
		out.serialize();		
	}

	protected Model loadModel(String fileName, String modelName) throws Exception {
		new LoadMDFile(fileName).Execute();
		return VirtualMachine.instance().getModel(modelName);
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}

}
