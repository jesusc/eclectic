package test.swing;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.jvmgen.ApidescFactoryJVMGen;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TestSwing {

	public static void main(String[] args) throws Exception {		
	     System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		new TestSwing().testUml2Swing();
		// new TestSwing().testSwing2Uml();
	}
	
	public void testUml2Swing() throws Exception {
		eclectic.uml2swing transformation = new eclectic.uml2swing();

		Util.registerResourceFactory();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       //("uml", new UMLResourceFactoryImpl());
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("../org.eclectic.test/family/uml2java/UML.ecore"), 
				withDir("../org.eclectic.test/family/uml2java/bank/bank.uml")); 

		
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		// Podria no hacer falta si se generara automáticamente con el compilador
		ApiDescription api = (ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load("src/test/swing/swing.apidesc");
		ApiModel out = apiLoader.emptyModelFromDescription(api);
		
		manager.register("in", in);
		manager.register("out", out);
		
		// Execute
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		
		
		List<JPanel> allPanels = out.allObjectsOf(javax.swing.JPanel.class);
		List<JPanel> panels = new LinkedList<JPanel>();
		for (JPanel jPanel : allPanels) {
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

	public void testSwing2Uml() throws Exception {
		eclectic.swing2uml transformation = new eclectic.swing2uml();

		Util.registerResourceFactory();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("../org.eclectic.test/family/uml2java/UML.ecore"), 
				withDir("_tmp/swing_output.uml")); 

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		// VER COMO API2MOL SACA TODOS LOS OBJETOS!
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiModel in = apiLoader.modelFromRoot(generateSwingApp(), 
				withDir("src/test/swing/swing.apidesc"),
				new org.eclectic.apidesc.ApiDescriptionLanguageLoader()); 
		
		manager.register("in", in);
		manager.register("uml", out);
		
		// Execute
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
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
		
		//result.setAlwaysOnTop(true);
		//result.setBackground(new Color(23));
		//result.pack();
		//result.setVisible(true);
		
		return result;
	}

	public String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;
				
		/*
		String home = System.getenv("HOME");
		if ( home == null || home.isEmpty() ) 
			throw new RuntimeException("No HOME directory defined!");
		
		String d = home + "/usr/qool/workspace/org.eclectic.test/";
		return d + f;
		*/
	}

}
