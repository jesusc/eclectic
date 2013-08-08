package test.streaming;

import java.io.File;
import java.io.IOException;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclectic.streaming.fragments.StreamedEmfModel;

public class TestDynamicTraces2SeqDiagrams {
	
	public static void main(String[] args) throws IOException {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		new TestDynamicTraces2SeqDiagrams().testSimple();
	}
	
	public void testSimple() throws IOException {
		// configure twitter
		// AbstractTraceGenerator generator = new ExecutionTraceGenerator();
		AbstractTraceGenerator generator = new ExecutionTraceSimulator();
				
		// configure transformation
		eclectic.dtrace2seq_diagrams transformation = new eclectic.dtrace2seq_diagrams();

		Util.registerResourceFactory();

		// Declare models
		String streamDesc = withDir("src/test/streaming/dtrace.streamdesc");
		IModel<?, ?> in = generator.getModel(streamDesc);
		
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel out  = loader.basicEmptyModelFromFile(
				withDir("model/seq_diagrams.ecore"), 
				withDir("tmp_/seq_output.xmi")); 
		
		
	    in.registerMethodHandler(new BasicMethodHandler(manager));
	    out.registerMethodHandler(new BasicMethodHandler(manager));

		manager.register("trc", in);
		manager.register("seq", out);
		
		// Execute
		//init("twitter2mention");
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.configureStreamingMode("trc", (IStreamedModel<?, ?>) in);
		
		transformation.start_();

		// generator.feedTransformation("trc", in, transformation);
		generator.feedTransformation("trc", transformation);
		
		System.out.println("Finished transformation.");
		transformation.printPending();
		
		System.out.println( in.allObjectsOf("LocalExecution") );
		
		//stream.shutdown();
		//finish();
		out.serialize();
	}

	public String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;		
	}

}
