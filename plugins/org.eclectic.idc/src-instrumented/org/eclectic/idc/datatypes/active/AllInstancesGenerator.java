package org.eclectic.idc.datatypes.active;

import org.eclectic.idc.datatypes.CallableN;
import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.active.AllInstancesGenerator.AllInstancesForAll;
import org.eclectic.idc.jvm.runtime.AllRequest;
import org.eclectic.idc.jvm.runtime.IClosure;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.idc.jvm.runtime.ModelQueue;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.idc.jvm.runtime.RunnableClosure;
import org.eclectic.modeling.emf.IModel;

public class AllInstancesGenerator extends ActiveBase {

	private ModelQueue queue;
	private AllInstancesForAll request;
	private ActiveOperation child;

	public AllInstancesGenerator(QoolTransformationBase transformation, IModel model, String metaclass) {
		this.queue = transformation.findQueueForMetaclass(model, metaclass);
		this.request = new AllInstancesForAll(new AllInstancesClosure());
	}
	
	//
	// Inner classes
	//
	
	public class AllInstancesForAll extends AllRequest {
		public AllInstancesForAll(IClosure c) {
			super(c);
		}		
	}
	
	public class AllInstancesClosure extends RunnableClosure {

		@Override
		public void run() {
			if ( params.size() != 1 ) throw new IllegalArgumentException();
			child.next(params.get(0));
		}
	}

	@Override
	public void activeOperation(ActiveOperation child) {
		this.child = child;
		queue.addRequest(request);
	}

}
