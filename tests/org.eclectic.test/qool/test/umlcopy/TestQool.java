package test.umlcopy;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import modelum.eclectic.jvm.test.ScriptCompiler;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.FrontendPackage;
import org.eclectic.frontend.QoolParseUtil;
import org.eclectic.frontend.QoolStandaloneSetup;
import org.eclectic.frontend.ScriptParseUtil;
import org.eclectic.frontend.ScriptStandaloneSetup;
import org.eclectic.frontend.Util;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.attribution.AttributionPackage;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.DefineVariable;
import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.qool.ForAllStatement;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.qool.Segment;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.idc.qool.QForAll;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.test.BaseTest;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;


public class TestQool extends BaseTest {
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}

	public static void main(String[] args) throws IOException, EclecticException {
		setUp();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       //("uml", new UMLResourceFactoryImpl());
			("*", new XMIResourceFactoryImpl());
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, QoolPackage.eINSTANCE);		

		
		new TestQool().testUmlCopy();
		// new TestScript().testClosuresCall();
	}

	@Test
	public void testParserScopes() throws Exception{
		Injector injector = new QoolStandaloneSetup().createInjectorAndDoEMFRegistration();		
		XtextResource x = new QoolParseUtil().parseFile(withDir("qool/test/umlcopy/umlcopy.qool"), injector);
		
		QoolTransformation q = (QoolTransformation) x.getContents().get(0);
		Segment s = q.getSegments().get(2);
		ForAllStatement a = (ForAllStatement) s.getStatements().get(0);
		
		DefineVariable v = (DefineVariable) a.getStatements().get(0);
		PropertyWrite  p = (PropertyWrite ) a.getStatements().get(1);
		
		// TODO: Force failure!
		assertEquals(v, p.getReceptor());
		// See: http://www.eclipse.org/forums/index.php/m/741529/
	}
		
	@Test
	public void testUmlCopy() throws IOException, EclecticException{
		JVMCompilationResult executor = new QoolCompiler(QoolCompiler.JAVA_VERSION).execute(withDir("qool/test/umlcopy/umlcopy.qool"));

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
		executor.execute(manager, "umlcopy_with_qool");
		
		// Serialize
		out.serialize();		
	}

}
