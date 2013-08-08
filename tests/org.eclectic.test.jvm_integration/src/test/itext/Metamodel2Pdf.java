package test.itext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.regex.Pattern;

import org.apache.bcel.classfile.AccessFlags;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.util.BCELComparator;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IModelMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.GreekList;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfWriter;

import test.base.BaseTest;

public class Metamodel2Pdf extends BaseTest {

	public static void main(String[] args) throws IOException, Exception {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
	    Metamodel2Pdf mm2pdf =  new Metamodel2Pdf();
	    
	    mm2pdf.testTransformation();
	    // mm2pdf.learnIText();
	}
	
	
	public void testTransformation() throws DocumentException, IOException {
		eclectic.mm2pdf transformation = new eclectic.mm2pdf();
		Util.registerResourceFactory();

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		Resource resource = new ResourceImpl();		
		ResourceSet rs = new ResourceSetImpl();
		resource = rs.getResource(URI.createFileURI(withDir("../org.eclectic.test.jvm_integration/fixtures/metamodels/petrinet.ecore")), true);
		//resource.load(new FileInputStream("../org.eclectic.test.jvm_integration/fixtures/metamodels/petrinet.ecore"), null);
		BasicEMFModel in  = loader.basicModelFromMemory(EcorePackage.eINSTANCE, resource);
		
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		ApiDescription api = (ApiDescription) new org.eclectic.apidesc.ApiDescriptionLanguageLoader().load("src/test/itext/itext.apidesc");
		ApiModel out = apiLoader.emptyModelFromDescription(api);
		
		manager.register("mm", in);
		manager.register("pdf", out);
		
		// Execute
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();

		List<Paragraph> paragraphs = out.allObjectsOf(Paragraph.class);
		
		final Document document = new Document();
		PdfWriter.getInstance(document,
				new FileOutputStream("/tmp/test.pdf"));
		document.open();
		for (Paragraph paragraph : paragraphs) {
			document.add(paragraph);			
		}
		document.close();
		
	}
	
	
	
	
	
	public void learnIText() throws FileNotFoundException, DocumentException {
		final Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document,
				new FileOutputStream("/tmp/test.pdf"));

		document.open();
		
		Paragraph p = new Paragraph();
		for(int i = 0; i < 100; i++) {
		ZapfDingbatsList zapfdingbatslist = new ZapfDingbatsList(i);
		zapfdingbatslist.add(new ListItem(i));
		zapfdingbatslist.add(new ListItem("test2"));
		
		p.add(zapfdingbatslist);
		}
		document.add(p);
		
		
		/*
		for(int i = 0; i < 100; i++) {
		Paragraph p = new Paragraph();
		p.add("This is a test 2");
	
		// document.newPage();
		document.add(p);
		}
		*/
		
		document.close();
	}
	
}
