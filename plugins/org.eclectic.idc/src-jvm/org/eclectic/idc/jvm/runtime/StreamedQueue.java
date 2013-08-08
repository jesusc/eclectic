package org.eclectic.idc.jvm.runtime;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IMultiLevelModel;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.NoModelFoundException;

/**
 * 
 * @author jesus
 *
 */
public class StreamedQueue implements IQueue<Object> {

	// private IStreamedModel<Object, ?> streamedModel;

	private QoolTransformationBase transformation;
	// From the transformation
	private Collection<IQueue<?>> transformationQueues = null;
	private LinkedList<LocalQueue> localQueues = null;

	private List<Request> requests = new LinkedList<Request>();

	public StreamedQueue(QoolTransformationBase t) {
		this.transformation = t;
		// this.streamedModel = (IStreamedModel<Object, ?>) model;
	}

	@Override
	public void put(Object newObj) {
		throw new UnsupportedOperationException();
	}
	
	// To do this well I should use "put", and generate a specific queue per streamed model
	// to avoid passing these parameters
	public void put2(Object newObj, IModel<?, ?> model, String modelName) {
		if ( this.transformationQueues == null ) {
			this.transformationQueues = transformation.queues.values();
			this.localQueues = new LinkedList<LocalQueue>();
			for (IQueue<?> q : transformationQueues) {
				if ( q instanceof LocalQueue ) {
					localQueues.add((LocalQueue) q);
				}
			}
			System.out.println("Local queues : " + localQueues.size());
		}
		// Resume if needed
		List<Request> affected = new LinkedList<Request>();
		Iterator<Request> it = requests.iterator();			

		while ( it.hasNext() ) {
			Request r = it.next();
			if ( r.satisfiedBy(newObj) ) {
				affected.add(r);
				if ( ! (r instanceof AllRequest) )
					it.remove();
			}
		}

		for (Request request : affected) {
			request.resume();
		}		
		
		// Apply rules
		for( IQueue<?> q : this.transformationQueues ) {
			if ( q instanceof StreamedModelQueue ) {
				StreamedModelQueue mq = (StreamedModelQueue) q;
				if ( mq.getModelName().equals(modelName) && 
						model.isKindOf(newObj, mq.getClassName()) ) {					
					mq.put(newObj);
					
					Object removed = mq.checkElementWindow();
					if ( removed != null ) {
						// Remove elements from local queues (typically traces)
						// System.out.println("Removed : " + removed);
						for (LocalQueue lq : localQueues) {
							lq.removeElementsAccessedByKey(removed);
						}
					
						/*
						// Remove the element from the model
						IModel removedObjectModel;
						try {
							removedObjectModel = transformation.getModelManager().getNamespace(removed);
							removedObjectModel.deleteObject(removed);
						} catch (NoModelFoundException e) {
							// System.err.println("Element " + removed + " without model. Deleting it anyway.");
						}
						*/
			
					}
				
				}
			}
		}
	}

	@Override
	public void addRequest(Request r) {
		// No optimization (see HistoryQueue)
		requests.add(r);			
		// System.out.println("Streamed queue: Requests " + requests.size());
		
	}
	
	@Override
	public void putAll(Collection<Object> objs) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void requestAll(IClosure closure) {
		throw new UnsupportedOperationException();		
	}

	/*
	@Override
	public Object requestAndWait(Request r) {
		// TODO: This was substituted by ContinuationResolverHelper.requestAndWait, but maybe its time to come back to this solution
		// See HistoryQueue
		throw new UnsupportedOperationException();
	}
	*/

	@Override
	public Collection<Request> pendingRequests() {
		return requests;
	}

	
	

}
