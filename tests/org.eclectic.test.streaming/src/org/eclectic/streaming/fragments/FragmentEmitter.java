package org.eclectic.streaming.fragments;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.streamdesc.runtime.StreamedFragment;
import org.eclipse.emf.ecore.EObject;

import eclectic.dtrace2seq_diagrams;

public class FragmentEmitter {

	private dtrace2seq_diagrams transformation;
	private String modelName;

	public FragmentEmitter(String modelName, dtrace2seq_diagrams transformation) {
		this.transformation = transformation;
		this.modelName = modelName;
	}

	public void sendFragment(EmfFragment fragment) {
		transformation.receiveStreamedFragment(modelName, fragment);
	}

	public void cleanTargetModel() {
		BasicEMFModel m = (BasicEMFModel) transformation.getModelManager().getNamespace("seq");
		m.clean();
	}

	public void printQueueStatus() {
		System.out.println("TraceQ               : " + transformation.TraceQ.getObjects().size() + " - " + transformation.TraceQ.getRequestsSize() );
		System.out.println("mAllInstances        : " + transformation.allInstancesMethodExecution.getObjects().size() + " - " + transformation.allInstancesMethodExecution.getRequestsSize() );
		System.out.println("mClass               : " + transformation.mClass.getObjects().size() + " - " + transformation.mClass.getRequestsSize() );
		System.out.println("mLocalInstance       : " + transformation.mLocalInstance.getObjects().size() + " - " + transformation.mLocalInstance.getRequestsSize()  );
		System.out.println("mLocalMethodExecution: " + transformation.mLocalMethodExecution.getObjects().size() + " - " + transformation.mLocalMethodExecution.getRequestsSize() );

	}
}
