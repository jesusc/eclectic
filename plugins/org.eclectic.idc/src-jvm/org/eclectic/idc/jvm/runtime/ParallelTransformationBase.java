package org.eclectic.idc.jvm.runtime;

import java.util.LinkedList;

import org.eclectic.modeling.emf.ModelManager;

public abstract class ParallelTransformationBase extends IdcTransformationBase implements Runnable {
	LinkedList<IdcTransformationBase> transformations = new LinkedList<IdcTransformationBase>();
	
	public ParallelTransformationBase() {
		super();
	}
	
	public void register(IdcTransformationBase b) {
		b.setParentTransformation(this);
		transformations.add(b);
	}

	public void setSharedModelManager(ModelManager modelManager) {
		ModelManager copy = modelManager.createSharedCopy();
		super.setSharedModelManager(copy);
		
		if ( ! this.modelManager.hasNamespace(RuntimeModel.UNIQUE_ID) ) 
			this.modelManager.register(RuntimeModel.UNIQUE_ID, new RuntimeModel());

		
		configureDependentTransformationsIntoModelManager(copy);
	} 	
	
	@Override
	public void setModelManager(ModelManager modelManager) {
		// super.setModelManager(modelManager);

		this.modelManager = modelManager;		
		configureDependentTransformationsIntoModelManager(modelManager);

		if ( ! this.modelManager.hasNamespace(RuntimeModel.UNIQUE_ID) ) 
			this.modelManager.register(RuntimeModel.UNIQUE_ID, new RuntimeModel());

	}

	private void configureDependentTransformationsIntoModelManager(ModelManager modelManager) {
		for (IdcTransformationBase b : transformations) {
			modelManager.register(b.getName(), b);
			b.setSharedModelManager(modelManager);
		}		
	}
	
	public void start_() {
		run();
	}

	@Override
	public void run() {
		for (IdcTransformationBase b : transformations) {
			b.configure_();
		}

		RuntimeException rethrow = null;
		try {
			for (IdcTransformationBase b : transformations) {
				b.start_();
			}
		} catch ( IdcExceptionBlockingMatchNotResolved e ) {			
			// Probably I should rethrow only if it has been invoked with invoke-external
			rethrow = e;
		}

		for (IdcTransformationBase b : transformations) {
			if ( b instanceof QoolTransformationBase ) {
//				((QoolTransformationBase) b).printPending(); // Just to make sure that it has finished without pending issues			
				((QoolTransformationBase) b).cleanUp(true);
			}
		}
		
		if ( rethrow != null ) 
			throw rethrow;
	}

	public void printPending() {
		for (IdcTransformationBase b : transformations) {
			if ( b instanceof QoolTransformationBase ) {
				((QoolTransformationBase) b).printPending();
			}
		}		
	}

	@Override
	public void	configure_invocation_(RunnableClosure viewFilter) {
		super.configure_invocation_(viewFilter);
		for (IdcTransformationBase b : transformations) {
			b.configure_invocation_(viewFilter);
		}		
	}

	/**
	 * Look up a queue into the subtransformations. Assumes that the parallel transformation
	 * only contains "leaf" transformations. This could be changed easily...
	 * 
	 * @see IdcTransformationBase#retrieve_from_invocation_(Object, String, String, String)
	 */
	@Override
	public Object retrieve_from_invocation_(Object srcObj, String queueName, String srcAttrName, String tgtAttrName) {
		for (IdcTransformationBase b : transformations) {
			if ( b instanceof QoolTransformationBase ) {
				QoolTransformationBase qt = ((QoolTransformationBase) b);
				if ( qt.getQueue(queueName) != null ) {
					return qt.retrieve_from_invocation_(srcObj, queueName, srcAttrName, tgtAttrName);
				}
			}
		}		
		throw new IdcException("No queue " + queueName + " found.");
	}


}
