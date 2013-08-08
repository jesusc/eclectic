package org.eclectic.test.streaming.jdk2jdt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

import org.eclectic.idc.jvm.runtime.LocalQueue;
import org.eclectic.idc.jvm.runtime.ModelQueue;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.streaming.fragments.EmfFragment;
import org.eclectic.streaming.fragments.EmfFragmentFactory;
import org.eclectic.test.nativejavaparser.ejctree.EjctreePackage;
import org.eclectic.test.streaming.MeasureTime;
import org.eclectic.test.streaming.javaparser.NativeJavaParser;
import org.eclectic.test.streaming.javaparser.NativeJavaParser_NoStreaming;
import org.eclectic.test.streaming.javaparser.NativeJavaParser_StreamingId;
import org.eclectic.test.streaming.jdk2jdt.ParserStreamer.TransformationThread;
import org.eclipse.emf.ecore.EPackage;

import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;

public class ParserStreamer {
	private final Collection<String> files;

	public ParserStreamer(Collection<String> files) {
		this.files = files;
	}

	public void parseAll(BasicEMFModel model) {
		NativeJavaParser_NoStreaming parser = new NativeJavaParser_NoStreaming(model);
		for (String file : files) {
			
			MeasureTime.startMeasure("Parsing");
			JCCompilationUnit cu = parser.parse(file);
			MeasureTime.endMeasure("Parsing");

			MeasureTime.startMeasure("Injecting");
			parser.getFragment(cu);
			MeasureTime.endMeasure("Injecting");
		}
	}

	public void parseAndFeed(String modelName, QoolTransformationBase transformation, boolean withId) {
		ArrayList<EPackage> list = new ArrayList<EPackage>();
		list.add(EjctreePackage.eINSTANCE);

		
		NativeJavaParser parser = null;
		if ( ! withId ) {
			parser = new NativeJavaParser(new EmfFragmentFactory(list));
		} else {
			parser = new NativeJavaParser_StreamingId(new EmfFragmentFactory(list));
		}
		
		for (String file : files) {
			// System.out.println("Parsing " + file);
			MeasureTime.startMeasure("Parsing");
			JCCompilationUnit cu = parser.parse(file);
			MeasureTime.endMeasure("Parsing");
			

			MeasureTime.startMeasure("Injecting");
			EmfFragment fragment = (EmfFragment) parser.getFragment(cu);
			MeasureTime.endMeasure("Injecting");
			
			// System.out.println("Transforming " + file);
			MeasureTime.startMeasure("Transforming");
			transformation.receiveStreamedFragment("jdk", fragment);
			MeasureTime.endMeasure("Transforming");
		}
	}
	
	public void threadedParseAndFeed(String modelName, QoolTransformationBase transformation, boolean withId) {
		ArrayList<EPackage> list = new ArrayList<EPackage>();
		list.add(EjctreePackage.eINSTANCE);

		TransformationThread thread = new TransformationThread(transformation);
		thread.start();
		
		NativeJavaParser parser = null;
		if ( ! withId ) {
			parser = new NativeJavaParser(new EmfFragmentFactory(list));
		} else {
			parser = new NativeJavaParser_StreamingId(new EmfFragmentFactory(list));
		}		
		
		for (String file : files) {
			// System.out.println("Parsing " + file);
			MeasureTime.startMeasure("Parsing");
			JCCompilationUnit cu = parser.parse(file);
			MeasureTime.endMeasure("Parsing");
			

			MeasureTime.startMeasure("Injecting");
			EmfFragment fragment = (EmfFragment) parser.getFragment(cu);
			MeasureTime.endMeasure("Injecting");
			

			thread.receiveFragment(fragment);
			// transformation.receiveStreamedFragment("jdk", fragment);
		}
		
		thread.finish();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public class TransformationThread extends Thread {
		// private Queue<EmfFragment> fragments = new SynchronousQueue<EmfFragment>();
		private ArrayList<EmfFragment> fragments = new ArrayList<EmfFragment>();
		private boolean finish = false;
		private QoolTransformationBase transformation;
		
		public TransformationThread(QoolTransformationBase transformation) {
			this.transformation = transformation;
		}
		
		public synchronized void receiveFragment(EmfFragment fragment) {
			fragments.add(fragment);
		}
		
		public synchronized EmfFragment nextFragment() {
			// EmfFragment fragment = fragments.element();			
			return fragments.remove(0);
		}
		
		public synchronized boolean moreFragments() {
			return fragments.size() > 0;
		}
		
		public synchronized void finish() { finish = true; }
		public synchronized boolean isFinished() { return finish; }
		
		@Override
		public void run() {
			System.out.println( Runtime.getRuntime().availableProcessors() );
			while ( ! isFinished() || moreFragments() ) {
				if ( moreFragments() ) {
					MeasureTime.startMeasure("Transforming");

					EmfFragment fragment = nextFragment();
					transformation.receiveStreamedFragment("jdk", fragment);
					
					/*
					LocalQueue lq = (LocalQueue) transformation.getQueue("MethodQ");
					lq.clean();		
					*/
				
					MeasureTime.endMeasure("Transforming");
				}
			}
		}
	}


	
}

