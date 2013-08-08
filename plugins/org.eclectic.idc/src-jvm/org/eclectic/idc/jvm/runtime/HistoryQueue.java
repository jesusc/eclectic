package org.eclectic.idc.jvm.runtime;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.NoModelFoundException;

public abstract class HistoryQueue<T> implements IHistoryQueue<T> {
	protected QoolTransformationBase transformation;
	
	protected LinkedList<T> objects = new LinkedList<T>();
	protected List<Request> requests = new LinkedList<Request>();
	protected HashSet<Request> removed = new HashSet<Request>(); // TODO: no longer used
	protected String name;
	
	public HistoryQueue(String name, QoolTransformationBase t) {
		this.transformation = t;
		this.name = name;
		t.registerQueue(name, this);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see org.eclectic.idc.jvm.runtime.IHistoryQueue#getObjects()
	 */
	@Override
	public LinkedList<T> getObjects() {
		return objects;
	}
	
	/**
	 * Remove all elements from the queue. 
	 * Used as an optimization when it is known that there is no need to
	 * use the elements of the element in the rest of the execution.
	 * {@link Request} elements are not removed.
	 */
	public void clean() {
		if ( accessData != null ) {
			for (Object o : objects) {
					accessData.remove(o);
			}
		}
		objects.clear();
	}
	
	/*
	@Override
	public LinkedList<Request> getRequests() {
		return requests;
	}
	*/
	@Override
	public void addRequest(Request r) {
		if ( accessData != null ) {
			r.indexRequest(accessData);
		} else {
			requests.add(r);			
		}
	}
	
	@Override
	public void put(T o) {
		objects.add(o);

		IModel<Object, Object> model = null;
		if ( accessData != null ) {
			model = (IModel<Object, Object>) elementTypeModel;
			/*
			// This could be optimized with static data, because I now the model...
			try {
				model = (IModel<Object, Object>) this.transformation.getModelManager().getNamespace(o);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
			*/
			accessData.put(o, model);
		}

		List<Request> affected = new LinkedList<Request>();
		Iterator<Request> it = null;
		if ( accessData != null ) {
			/*
			it = accessData.waitingRequestsFor(o, model);			

			while ( it.hasNext() ) {
				Request r = it.next();
				if ( r.satisfiedBy(o) ) {
					affected.add(r);
					if ( ! (r instanceof AllRequest) )
						it.remove();
				}
			}

			for (Request request : affected) {
				request.resume();
			}
			*/		

			
			affected = accessData.waitingRequestsFor2(o, model);
			if ( affected != null ) {
				for (Request request : affected) {
					//if ( ! request.satisfiedBy(o) ) 
					//	throw new IllegalStateException();
					((RequestKindProperty) request).checkSatisfactionResult(o);
					request.resume();
				}		
			}
			
			
		} else {
			it = requests.iterator();			

			while ( it.hasNext() ) {
				Request r = it.next();
				if ( r.satisfiedBy(o) ) {
					affected.add(r);
					if ( ! (r instanceof AllRequest) )
						it.remove();
				}
			}

			for (Request request : affected) {
				request.resume();
			}		
		}
		
		
		// THIS WAY IT WORKS, SLOW, BUT WORKS
		/*
		// objects.add(o);
		// List<Request> tmp = Collections.synchronizedList(requests);
		// TODO: Why this ConcurrentModificationExceptino...?
		LinkedList<Request> tmp = new LinkedList<Request>(requests);
		for (Request r : tmp) {
			if ( removed.contains(r) ) continue;
		//Iterator<Request> it = requests.iterator();
		//while ( it.hasNext() ) {
		//	Request r = it.next();
			if ( r.satisfiedBy(o) ) {
				// it.remove();
				// TODO: I need to deal with corner cases more elegantly
				if ( ! (r instanceof AllRequest) )
					removed.add(r);
				// r.resumeWith(o);
				r.resume();
				
				// does not work
				//if ( r instanceof RequestKindProperty )
				//	return;
			}
		}
		*/
	}	

	@Override
	public void putAll(Collection<T> objs) {
		throw new UnsupportedOperationException("HistoryQueue.putAll");
	}

	@Override
	public void requestAll(IClosure closure) {
		AllRequest r = new AllRequest(closure);
		requests.add(r);
		// TODO: See if calling the request with existing objects this may provoke
		//       a re-registritation of a new closure for the same forall
		
		LinkedList<T> existingObjects = (LinkedList<T>) new LinkedList<Object>(objects);
		//for(T o : objects) {
		// TODO: This copy is only needed for the TTC'13 live contest...
		for(T o : existingObjects) {
			if ( r.satisfiedBy(o) ) {
				// r.resumeWith(o);
				// r.resumeWith(o);
				r.resume();
			}			
		}
	}	

	@Override
	public Collection<Request> pendingRequests() {
		LinkedList<Request> r = new LinkedList<Request>();
		if ( accessData != null ) {
			r.addAll( accessData.pendingRequests() );
		}
	
		for (Request request : requests) {
			if ( ! ( request instanceof AllRequest) && ! removed.contains(request) ) {
				r.add(request);
			}			
		}
		return r;
	}

	/*
	// TODO: This was substituted by ContinuationResolverHelper.requestAndWait, but maybe its time to come back to this solution
	@Override
	public Object requestAndWait(Request r) {
		throw new UnsupportedOperationException();
		
//		for(T o : objects) {
//			if ( r.satisfiedBy(o) ) {
//				return o;
//			}			
//		}
//
//		this.requests.add(r);		
//		
//		System.out.println(this.getClass().getName() + " - Suspended ");
//		Object o = Continuation.suspend(new WaitValue(this, r));
//		System.out.println(this.getClass().getName() + " - Resumed " + o);
//		return o;
				
	}
	*/
	//
	// Begin-of Optimizations
	//

	protected AccessDataByFeature accessData = null;
	public void configureAccessByFeatureOptimization(String featureName) {
		accessData = new AccessDataByFeature(featureName);
	}
	
	@Override
	public Object findSatisfyingValue(Request r) {
		// Try the optimization
		if ( accessData != null ) {
			if ( r.satisfiedByOptimized(accessData) ) {
				return r.satisfyingValue();
			}
			// This assumes that the optimization has the force "!" flag
			return null;
		}
		
		// No optimization
		LinkedList<?> objects = this.getObjects();
		for(Object o : objects) {
			if ( r.satisfiedBy(o) ) {
				return r.satisfyingValue();
			}			
		}	
		
		return null;
	}
	
	private IModel<?, ?> elementTypeModel;
	
	/**
	 * Sets the model to which the objects put in the queue
	 * are expected to belong to.
	 *  
	 * @param model The model 
	 */
	public void setModel(IModel<?, ?> model) {
		this.elementTypeModel = model;
	}
	
	public int getRequestsSize() {
		if ( accessData != null ) {
			return accessData.getRequestsSize();
		}
		return this.requests.size();
	}
	
	/* PERERA'S IMPL.
	 * 
	public final static Object multi(final String trace, final String feature,
			final List<Object> source) {
		final MyList<Object> solution = new MyList<Object>(source.size());
		for (Object eobj : source) {
			solution.add(mono(trace, feature, eobj));
		}
		return solution;
	}

	public final static Object mono(final String trace, final String feature,
			final Object source) {
		Object solution = AbstractSingleTrace.getInstance().search(trace,
				feature, source);
		if (solution == null) {
			return Continuation
					.suspend(new TraceWaitFor(trace, feature, source));
		}
		return solution;
	} 
	 */
}
