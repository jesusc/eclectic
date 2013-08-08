package test.java_reflect;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
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
import org.apache.commons.javaflow.utils.ReflectionUtils;
import org.eclectic.api.ApiLoader;
import org.eclectic.api.ApiModel;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApidescPackage;
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
import org.eclipse.xtext.util.ReflectionUtil;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.GreekList;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfWriter;

import test.base.BaseTest;

public class Reflect2DSL extends BaseTest {
	private static final String RT_LIB = "jar:file:/usr/lib/jvm/java-6-openjdk/jre/lib/rt.jar!/";
	public static void main(String[] args) throws IOException, Exception {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
	    Reflect2DSL r =  new Reflect2DSL();
	    r.testTransformation();
	    //r.learn();
	}
	
	
	private Reflections configureReflections() throws MalformedURLException {
		ConfigurationBuilder config = new ConfigurationBuilder();
		config.addClassLoaders(ClassLoader.getSystemClassLoader());
		LinkedList<URL> urls = new LinkedList<URL>();
		urls.add(new URL(RT_LIB));
		config.addUrls(urls);

		Reflections reflections = new Reflections(config);
		return reflections;
	}
	
	private void learn() throws MalformedURLException {
		Reflections reflections = configureReflections();
		Set<Class<? extends Component>> x = reflections.getSubTypesOf(java.awt.Component.class);
		System.out.println(x);
		
		// does nothing
		reflections.getResources(new Predicate<String>() {
			@Override
			public boolean apply(String arg0) {
				System.out.println(arg0);
				return true;
			}
			
		});
	
		// getClass().getMethods()[0].getReturnType()
	}


	public void testTransformation() throws DocumentException, IOException {
		eclectic.reflect2dsl transformation = new eclectic.reflect2dsl();
		Util.registerResourceFactory();

		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		
		BasicEMFModel out  = loader.basicEmptyModelFromMemory(ApidescPackage.eINSTANCE.eResource(), 
				withDir("_tmp/dsl_metamodel.xmi")); // TODO: Generar en xText resource

		// TODO: HOW TO SELECT THE OBJECTS INVOLVED!!
		ApiLoader apiLoader = new ApiLoader(new JavaListConverter());
		Reflections reflections = configureReflections();
		Set<Class<? extends Component>> result = reflections.getSubTypesOf(java.awt.Component.class);
		ApiModel in = apiLoader.modelFromRoot(result, 
				withDir("src/test/java_reflect/java_reflect.apidesc"),
				new org.eclectic.apidesc.ApiDescriptionLanguageLoader()); 
		
		manager.register("reflect", in);
		manager.register("dsl", out);
		
		// Execute
		init("reflect2dsl");
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		finish();
		out.serialize();		
		
	}

}
