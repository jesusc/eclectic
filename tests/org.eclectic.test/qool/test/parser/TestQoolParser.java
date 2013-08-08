package test.parser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import modelum.eclectic.jvm.test.ScriptCompiler;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.QoolParseUtil;
import org.eclectic.frontend.QoolStandaloneSetup;
import org.eclectic.frontend.ScriptParseUtil;
import org.eclectic.frontend.ScriptStandaloneSetup;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.core.DefineVariable;
import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.core.VariableReference;
import org.eclectic.frontend.qool.EmitStatement;
import org.eclectic.frontend.qool.ForAllStatement;
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
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;


public class TestQoolParser extends BaseTest {
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}

	// See: http://www.eclipse.org/forums/index.php/m/741529/
	@Test
	public void testParserScopes() throws Exception{
		Injector injector = new QoolStandaloneSetup().createInjectorAndDoEMFRegistration();		
		XtextResource x = new QoolParseUtil().parseFile(withDir("qool/test/parser/scope_trace.qool"), injector);
		
		QoolTransformation q = (QoolTransformation) x.getContents().get(0);
		
		// Try the first scope with tgt	
		Segment s = q.getSegments().get(1);
		ForAllStatement a = (ForAllStatement) s.getStatements().get(0);

		DefineVariable  v = (DefineVariable) a.getStatements().get(0);
		ForAllStatement f = (ForAllStatement) a.getStatements().get(1);
		PropertyWrite   p = (PropertyWrite) f.getStatements().get(0);					
		
		assertEquals(v, p.getReceptor());
		assertEquals(2, a.getStatements().size());
		assertEquals(1, f.getStatements().size());

		// Try the second segment that uses tgt
		s = q.getSegments().get(2);
		a = (ForAllStatement) s.getStatements().get(0);
		
		v = (DefineVariable) a.getStatements().get(0);		
		p = (PropertyWrite) a.getStatements().get(1);		

		assertEquals(v, p.getReceptor());
		assertEquals(2, a.getStatements().size());

		// Try emit in findClasses
		s = q.getSegments().get(0);
		a = (ForAllStatement) s.getStatements().get(1);
		
		v = (DefineVariable) s.getStatements().get(0);		
		EmitStatement e = (EmitStatement) a.getStatements().get(0);				
		
		assertEquals(v, ((VariableReference) e.getValue()).getVariable() );
		assertEquals(2, s.getStatements().size());
		assertEquals(1, a.getStatements().size());

	}
		
}
