package test.publications;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import modelum.eclectic.jvm.test.ScriptCompiler;

import org.eclectic.capi.EclecticException;
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
import org.eclectic.test.BaseTest;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

public class TestPublications extends BaseTest {

	public static void main(String[] args) throws IOException, EclecticException {
		setUp();
		// new TestPublications().testCompileMap();
		new TestPublications().test1();
	}
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}

	@Test
	public void testCompileMap() throws IOException, EclecticException{
		JVMCompilationResult executor = new MappingsCompiler().execute(withDir("mappings/test/publications/pub2pub.map"));
		executor.dump("/tmp/t");		
		// JVMCompilationResult executor2 = new MappingsCompiler().execute(withDir("mappings/test/publications/pub2pub.map"));

	}

	@Test
	public void test1() throws IOException, EclecticException{
		JVMCompilationResult executor = new MappingsCompiler().execute(withDir("mappings/test/publications/pub2pub.map"));
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("fixtures/metamodels/Publications1.ecore"), 
				withDir("fixtures/models/professor1.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("fixtures/metamodels/Publications2.ecore"), 
				withDir("_tmp/output.xmi")); 
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "pub2pub");
		
		// Serialize
		out.serialize();		
	}

	public String withDir(String f) {
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
	}

}
