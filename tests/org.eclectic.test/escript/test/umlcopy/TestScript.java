package test.umlcopy;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import modelum.eclectic.jvm.test.ScriptCompiler;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.ScriptParseUtil;
import org.eclectic.frontend.ScriptStandaloneSetup;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

public class TestScript {

	public static void main(String[] args) throws IOException, EclecticException {
		setUp();
		new TestScript().testClosures();
		// new TestScript().testClosuresCall();
	}
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}
	
	/*
	@Test
	public void testSyntax() throws Exception {
		Injector injector = new ScriptStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResource resource = new ScriptParseUtil().parseFile("escript/test/umlcopy/test_keyword_methods", injector);
		
		XMIResourceImpl r = new XMIResourceImpl();
		r.getContents().addAll( resource.getContents() );
		r.save(System.out, null);
		
		EList<Diagnostic> errors = resource.getErrors();
		for (Diagnostic diagnostic : errors) {
			System.out.println(diagnostic);
		}
		assertTrue(errors.size() == 0);
	}
	*/
	
	@Test
	public void testExecute() throws IOException, EclecticException{
		JVMCompilationResult executor = new ScriptCompiler().execute("escript/test/umlcopy/umlcopy.escript");

		String d = "/home/jesusc/usr/qool/workspace/org.eclectic.test/";
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				d + "fixtures/metamodels/ClassDiagram.ecore", 
				d + "fixtures/models/pets.xmi"); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				d + "fixtures/metamodels/ClassDiagram.ecore", 
				d + "_tmp/output.xmi"); 
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "umlcopy");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testClosures() throws IOException, EclecticException{
		JVMCompilationResult executor = new ScriptCompiler().execute(withDir("escript/test/umlcopy/umlcopy-closures.escript"));

		//String d = "/home/jesusc/usr/qool/workspace/org.eclectic.test/";
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("fixtures/models/pets.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "umlcopy");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testClosuresCall() throws IOException, EclecticException{
		JVMCompilationResult executor = new ScriptCompiler().execute(withDir("escript/test/umlcopy/closures-call.escript"));

		//String d = "/home/jesusc/usr/qool/workspace/org.eclectic.test/";
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("fixtures/models/pets.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("fixtures/metamodels/ClassDiagram.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "umlcopy");

		// Serialize
		out.serialize();		

		// Test
		List<EObject> classes = out.allObjectsOf("Class");
		assertEquals(3, classes.size());
		assertEquals("tclass1", out.getFeature(classes.get(0), "name"));
		assertEquals("tclass2", out.getFeature(classes.get(1), "name"));
		assertEquals("tclass3", out.getFeature(classes.get(2), "name"));
	}
	public String withDir(String f) {
		String d = "/home/jesusc/usr/qool/workspace/org.eclectic.test/";
		return d + f;
	}
}
