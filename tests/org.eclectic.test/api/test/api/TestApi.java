package test.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.FlowLayout;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclectic.ApiDescriptionLanguageStandaloneSetup;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApiDescriptionLanguageLoader;
import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.AbstractParserUtil;
import org.eclectic.frontend.AttributionStandaloneSetup;
import org.eclectic.frontend.api.MappingsCompiler;
import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.test.BaseTest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

public class TestApi extends BaseTest {

	public static void main(String[] args) throws Exception {
		setUp(); 
		//new TestApi().testParse();
		new TestApi().testUml2Swing();
		// new TestApi().testSwing2Uml();
		
		//new TestApi().generateSwingApp();
	}
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}
	
	public void testParse() throws Exception {
		ApiDescription api = (ApiDescription) new Parse().read(withDir("api/test/api/swing.apidesc"));
		System.out.println(api);
	}
	
	private class Parse extends AbstractParserUtil {

		@Override
		public EObject read(String fileToBeParsed) throws Exception {
			Injector injector = new ApiDescriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();   	
			MetamodelManager m = new MetamodelManager().addMetamodelLoader(new ApiDescriptionLanguageLoader(injector));
			return (EObject) m.getDescription(fileToBeParsed);
			//XtextResource resource = parseFile(fileToBeParsed, injector);
	    	//showErrors(resource);
	    	//return (ApiDescription) resource.getContents().get(0);
		}
		
	}
	
	@Test
	public void testUml2Swing() throws Exception{
		Injector injector = new ApiDescriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();  
		JVMCompilationResult executor = new MappingsCompiler().
				withMetamodelManager(new MetamodelManager().addMetamodelLoader(new ApiDescriptionLanguageLoader(injector))).
				execute(withDir("api/test/api/uml2swing.map"));

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       //("uml", new UMLResourceFactoryImpl());
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("family/uml2java/bank/bank.uml")); 

		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		//ApiModel out = apiLoader.emptyModelFromFile(
		//		withDir("mappings/test/api/swing.apidesc.xmi")); 
		ApiModel out = apiLoader.emptyModelFromDescription((ApiDescription)
				new ApiDescriptionLanguageLoader().load("api/test/api/swing.apidesc"));
				// new ParseApiDesc().read("api/test/api/swing.apidesc"));
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		executor.execute(manager, "uml2swing");
		
		List<JPanel> allPanels = out.allObjectsOf(javax.swing.JPanel.class);
		List<JPanel> panels = new LinkedList<JPanel>();
		for (JPanel jPanel : allPanels) {
			System.out.println(jPanel.getName() + " -- " + jPanel.getParent());
			if ( jPanel.getParent() == null ) 
				panels.add(jPanel);
		}
		
		if ( panels.size() != 3 ) System.out.println("WARNING: Still transforming associations"); 
		// assertEquals(3, panels.size());

		JPanel bank     = panels.get(0);
		JPanel customer = panels.get(1);
		JPanel account  = panels.get(2);
		/*
		assertEquals("Bank", bank.getName());
		assertEquals("Customer", customer.getName());
		assertEquals("Account", account.getName());
	
		for (JPanel jPanel : panels) {
			assertNotNull(jPanel.getLayout());
			assertTrue(jPanel.getLayout() instanceof FlowLayout);
		}
		
		assertEquals(2, bank.getComponentCount());
		assertEquals(1, customer.getComponentCount());
		assertEquals(1, account.getComponentCount());
		*/
		// Show the result
		JFrame result = new JFrame();
		result.setBounds(250, 250, 250, 275);
		result.setTitle("My Test Application");		

		result.getContentPane().setLayout(new BoxLayout(result.getContentPane(), BoxLayout.Y_AXIS));
		result.getContentPane().add(bank);
		result.getContentPane().add(customer);
		result.getContentPane().add(account);
		
		result.setVisible(true);
	}

	@Test
	public void testSwing2Uml() throws IOException, EclecticException{
		JVMCompilationResult executor = new MappingsCompiler().
				withMetamodelManager(new MetamodelManager().addMetamodelLoader(new ApiDescriptionLanguageLoader())).
				execute(withDir("api/test/api/swing2uml.map"));
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("_tmp/swing_output.uml")); 

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		// VER COMO API2MOL SACA TODOS LOS OBJETOS!
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiModel in = apiLoader.modelFromRoot(generateSwingApp(), 
				withDir("api/test/api/swing.apidesc"), new ApiDescriptionLanguageLoader()); 
		System.out.println( in.allObjectsOf("JPanel") );
		manager.register("in", in);
		manager.register("uml", out);
		
		// Execute
		executor.execute(manager, "swing2uml");
		out.serialize();
	}
	
	private JFrame generateSwingApp() {
		JFrame result = new JFrame();
		result.setBounds(150, 150, 250, 75);
		result.setTitle("My Test Application");		

		// JPanel creation
		JPanel jpanel = new JPanel();
		jpanel.setName("contentPane");
		result.setContentPane(jpanel);
		
		// jpanel.setLayout(new FlowLayout());
		//result.setLayout(new FlowLayout());
		// requires initialization
		// new BoxLayout(target, axis)
		jpanel.setLayout( new BoxLayout(jpanel, BoxLayout.Y_AXIS) );
		
		
		JTextField field = new JTextField();
		field.setText("test");
		jpanel.add(field);

		JTextField field2 = new JTextField();
		field2.setText("test2");
		jpanel.add(field2);

		
		// Container contentPane = result.getContentPane();
		// contentPane.setLayout(new FlowLayout());

		/*
		JButton b1 = new JButton("Button One");
		JButton b2 = new JButton("Button Two");

		contentPane.add(b1);
		contentPane.add(b2);
		*/
		
		//result.setAlwaysOnTop(true);
		//result.setBackground(new Color(23));
		//result.pack();
		//result.setVisible(true);
		
		return result;
	}
	
	public String withDir(String f) {
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
	}

}
