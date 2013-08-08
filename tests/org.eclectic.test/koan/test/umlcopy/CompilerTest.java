package test.umlcopy;

import static org.junit.Assert.*;

import java.io.IOException;

import modelum.eclectic.modelhandling.BasicEMFModel;
import modelum.eclectic.modelhandling.EMFLoader;
import modelum.eclectic.modelhandling.ModelManager;

import org.eclectic.idc.jvm.CompilerException;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.JVMCompiler;
import org.junit.Test;

public class CompilerTest {

	@Test
	public void testExecute() throws IOException, CompilerException {
		JVMCompilationResult executor = new JVMCompiler().execute("koan/test/umlcopy/umlcopy.koan");

		String d = "/home/jesusc/usr/koan/workspace/modelum.eclectic.test/";
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader();
		BasicEMFModel in  = loader.basicModelFromFile(
				d + "fixtures/metamodels/ClassDiagram.ecore", 
				d + "fixtures/models/pets.xmi"); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				d + "fixtures/metamodels/ClassDiagram.ecore", 
				d + "_tmp/output.xmi"); 
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager);
		
		// Serialize
		out.serialize();		
	}

}
