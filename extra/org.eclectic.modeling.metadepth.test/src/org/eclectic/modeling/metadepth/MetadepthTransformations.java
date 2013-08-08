package org.eclectic.modeling.metadepth;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import meteoric.at3rdx.kernel.Model;
import meteoric.at3rdx.kernel.ModelFactory;
import meteoric.at3rdx.kernel.VirtualMachine;
import meteoric.at3rdx.parse.ASTVisitorInterpreter;
import meteoric.at3rdx.parse.metaDepthInterpreter;
import meteoric.at3rdx.parse.exceptions.MDinvalidElementCreation;
import meteoric.at3rdx.shell.commands.LoadMDFile;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.QoolStandaloneSetup;
import org.eclectic.frontend.ScriptParseUtil;
import org.eclectic.frontend.ScriptStandaloneSetup;
import org.eclectic.frontend.api.MappingsCompiler;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.metadepth.MetadepthModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class MetadepthTransformations {

	public static void main(String[] args) throws Exception {
		setUp();
		//new MetadepthTransformations().testMetadepthAsSource_copy_classdiagram();
		//new MetadepthTransformations().testMetadepthAsTarget_copy_classdiagram();
		//new MetadepthTransformations().testReflective();

		//new MetadepthTransformations().testDeepTransformation();
		new MetadepthTransformations().testProcess2PMS();
	}
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
		QoolStandaloneSetup.doSetup();
	}

	@Test
	public void testMetadepthAsSource_copy_classdiagram() throws Exception{
		JVMCompilationResult executor = new QoolCompiler().execute(withDir("src/transformations/copy_classdiagram.qool"));		

		ModelManager manager = new ModelManager();
		
		Model classDiagramMM1 = loadModel(withDir("fixtures/metadepth/class_diagram.mdepth"), "ClassDiagram");
		Model inputModel1 = loadModel(withDir("fixtures/metadepth/diagram.mdepth"), "Test");
		
		MetadepthModel in = new MetadepthModel(
				classDiagramMM1, 
				inputModel1, 
				new JavaListConverter());								
		

		// output
		EMFLoader     loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel out    = loader.basicEmptyModelFromFile(
				withDir("../org.eclectic.test/fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "umlcopy_with_qool");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testMetadepthAsTarget_copy_classdiagram() throws Exception{
		JVMCompilationResult executor = new QoolCompiler().execute(withDir("src/transformations/copy_classdiagram.qool"));		
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("../org.eclectic.test/fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		
		Model classDiagramMM = loadModel(withDir("fixtures/metadepth/class_diagram.mdepth"), "ClassDiagram");

		String type 	 = "ClassDiagram";
		Model  metaModel = VirtualMachine.instance().getModel(type);

		ModelFactory mf   = metaModel.getFactory();
		Model outputModel = mf.createModel("OUT");
		
		// classDiagramMM.addChildren(outputModel);
		// outputModel.setContainer(classDiagramMM);
		
		// VirtualMachine.instance().addModel(outputModel);
		MetadepthModel out = new MetadepthModel(
				classDiagramMM, 
				outputModel, 
				new JavaListConverter());								
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "umlcopy_with_qool");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testReflective() throws Exception{
		JVMCompilationResult executor = new QoolCompiler().execute(withDir("src/transformations/reflective.qool"));		

		ModelManager manager = new ModelManager();
		
		Model classDiagramMM1 = loadModel(withDir("fixtures/metadepth/class_diagram.mdepth"), "ClassDiagram");
		Model inputModel1 = loadModel(withDir("fixtures/metadepth/diagram.mdepth"), "Test");
		
		MetadepthModel in = new MetadepthModel(
				classDiagramMM1, 
				inputModel1, 
				new JavaListConverter());								
		

		// output
		EMFLoader     loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel out    = loader.basicEmptyModelFromFile(
				withDir("../org.eclectic.test/fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "reflective_metadepth");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testDeepTransformation() throws Exception{
		JVMCompilationResult executor = new QoolCompiler().execute(withDir("src/transformations/product2ui_deep.qool"));		

		ModelManager manager = new ModelManager();
		
		Model classDiagramMM1 = loadModel(productExampleDir("Products.mdepth"), "Products");
		Model inputModel1 = loadModel(withDir("fixtures/metadepth/Hardware.mdepth"), "Hardware");
		
		MetadepthModel in = new MetadepthModel(
				classDiagramMM1, 
				inputModel1, 
				new JavaListConverter());								
		

		Model uiMM = loadModel(productExampleDir("ConcreteUserInterface.mdepth"), "ConcreteUserInterface");
		String type 	 = "ConcreteUserInterface";
		Model  metaModel = VirtualMachine.instance().getModel(type);

		ModelFactory mf   = metaModel.getFactory();
		Model outputModel = mf.createModel("OUT");
		
		MetadepthModel out = new MetadepthModel(
				uiMM, 
				outputModel, 
				new JavaListConverter());								
		
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "reflective_metadepth");
		
		// Serialize
		out.serialize();		
	}


	@Test
	public void testProcess2PMS() throws Exception{
		JVMCompilationResult executor = new MappingsCompiler().execute(withDir("src/transformations/process2pms.map"));		

		ModelManager manager = new ModelManager();
		
		Model classDiagramMM1 = loadModel(istExampleDir("DSPM.mdepth"), "ProcessModel");
		//Model inputModel1 = loadModel(withDir("fixtures/metadepth/Hardware.mdepth"), "Hardware");
		Model inputModel1 = VirtualMachine.instance().getModel("Project1");
		
		
		MetadepthModel in = new MetadepthModel(
				classDiagramMM1, 
				inputModel1, 
				new JavaListConverter());								
		in.registerMethodHandler(new MetadepthBasicMethodHandler(manager));

		Model uiMM = loadModel(istExampleDir("PMS.mdepth"), "PMS");
		Model  metaModel = VirtualMachine.instance().getModel("PMS");

		ModelFactory mf   = metaModel.getFactory();
		Model outputModel = mf.createModel("OUT");
		
		MetadepthModel out = new MetadepthModel(
				uiMM, 
				outputModel, 
				new JavaListConverter());								
		
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "process2pms");
		
		// Serialize
		out.serialize();		
	}

	//
	// Utility methods
	//
	
	public String withDir(String f) {
		return new File(".") + File.separator + f;
	}
	
	public String productExampleDir(String f) {
		// return withDir("../metadepth/src/samples/ECMFA/") + f;
		return ("/home/jesus/usr/guizmo/workspace/./metadepth/src/samples/ECMFA/") + f;
	}

	public String istExampleDir(String f) {
		return ("/home/jesus/usr/guizmo/workspace/./metadepth/src/samples/IST/") + f;
	}

	protected Model loadModel(String fileName, String modelName) throws Exception {
		new LoadMDFile(fileName).Execute();
		/*
		metaDepthInterpreter in = new metaDepthInterpreter();
		
		in.parse(fileName);
		in.interpret();
		*/
		return VirtualMachine.instance().getModel(modelName);
	}
}
