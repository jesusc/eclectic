package org.eclectic.test.streaming.jdk2jdt;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.tools.ant.util.FileUtils;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streaming.fragments.StreamedEmfModel;
import org.eclectic.test.nativejavaparser.ejctree.EjctreePackage;
import org.eclectic.test.streaming.AbstractConfiguration;
import org.eclectic.test.streaming.MeasureTime;
import org.eclectic.test.streaming.javaparser.FileRetriever;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TransformJdk2Jdt extends AbstractConfiguration {
	static {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
	}
	
	public static void main(String[] args) throws IOException {
		if ( args.length > 0 && args[0].equals("--batch")) {
			new TransformJdk2Jdt().batchTransformation();
		} else {
			new TransformJdk2Jdt().streamingTransformation();
		}
	}
	
	public void streamingTransformation() throws IOException {
		// configure transformation
		QoolTransformationBase transformation = new eclectic.jdk2jdt_batch();
		Collection<String> files = findJavaFiles();
		
		Util.registerResourceFactory();
		
		// Declare models
		String streamDesc = withDir("src-javatransform/org/eclectic/test/streaming/jdk2jdt/jdk.streamdesc");
		IModel<?, ?> in = getStreamedModel(streamDesc);
		
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("model/java.ecore"), 
				withDir("tmp_/java_output_streaming.xmi")); 
		
		
	    in.registerMethodHandler(new BasicMethodHandler(manager));
	    out.registerMethodHandler(new BasicMethodHandler(manager));

		manager.register("jdk", in);
		manager.register("jdt", out);
		
		// Execute
		//init("twitter2mention");
		transformation.setModelManager(manager);
		transformation.configure_();

		MeasureTime.startMeasure("Total");
		
		transformation.start_();

		
		ParserStreamer ps = new ParserStreamer(files);
		// ps.parseAndFeed("jdk", transformation, true);
		ps.threadedParseAndFeed("jdk", transformation, true);

		MeasureTime.endMeasure("Total");

		System.out.println("Finished streaming transformation.");
		MeasureTime.printMeasures();
		
		// transformation.printPending();
		
		//stream.shutdown();
		//finish();
		out.serialize();
	}

	public void batchTransformation() throws IOException {
		eclectic.jdk2jdt_batch transformation = new eclectic.jdk2jdt_batch();
		Collection<String> files = findJavaFiles();

		BasicEMFModel in = getBatchModel();
		
		MeasureTime.startMeasure("Total");		
		ParserStreamer ps = new ParserStreamer(files);
		ps.parseAll(in);
		MeasureTime.endMeasure("Total");		

		in.getHandler().packRootElements();
		// ps.threadedParseAndFeed("jdk", transformation);
		
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("model/java.ecore"), 
				withDir("tmp_/java_output_batch.xmi")); 
		
	    in.registerMethodHandler(new BasicMethodHandler(manager));
	    out.registerMethodHandler(new BasicMethodHandler(manager));

		manager.register("jdk", in);
		manager.register("jdt", out);
		
		// Execute
		//init("twitter2mention");
		transformation.setModelManager(manager);
		transformation.configure_();
		
		MeasureTime.startMeasure("Total");		
		MeasureTime.startMeasure("Transforming");
		transformation.start_();
		MeasureTime.endMeasure("Transforming");
		MeasureTime.endMeasure("Total");

		System.out.println("Finished batch transformation.");
		MeasureTime.printMeasures();
		
		// transformation.printPending();
		
		//stream.shutdown();
		//finish();
		out.serialize();
	}

	private Collection<String> findJavaFiles() {
		/*
		ArrayList<String> result = new ArrayList<String>();

		//result.add("src-javatransform/org/eclectic/test/streaming/javaparser/NativeJavaParser.java");
		//result.add("src-javatransform/org/eclectic/test/streaming/jdk2jdt/ParserStreamer.java");
		result.add("src-javatransform/org/eclectic/test/streaming/jdk2jdt/TransformJdk2Jdt.java");
	
		// with inheritance
		result.add("src-javatransform/org/eclectic/test/streaming/AbstractConfiguration.java");		
		return result;
		*/

		// return new FileRetriever("..", "/home/jesus/third-party/modisco", "/home/jesus/projects").getFiles();
		return new FileRetriever("..").getFiles();
	}

	public BasicEMFModel getBatchModel() throws IOException {
		JavaListConverter converter = new JavaListConverter();
		EMFHandler handler = createModelHandler();
		return new BasicEMFModel(handler, converter);
	}
	
	public IModel<?, ?> getStreamedModel(String streamDesc) throws IOException {
		JavaListConverter converter = new JavaListConverter();
		EMFHandler handler = createModelHandler();
		StreamDescription desc = (StreamDescription) new org.eclectic.streamdesc.StreamDescLanguageLoader().load(streamDesc);
		StreamedEmfModel model = new StreamedEmfModel(handler, desc, converter);
		
		return model;
	}

	private EMFHandler createModelHandler() {
		Util.registerResourceFactory();

		ResourceSetImpl rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(EjctreePackage.eINSTANCE.getNsURI(), EjctreePackage.eINSTANCE);
		Resource resource = rs.createResource( Util.createURI("tmp_/input_model.xmi") );

		ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(EjctreePackage.eINSTANCE);

		EMFHandler handler = new EMFHandler(pkgs, resource);
		return handler;
	}

}
