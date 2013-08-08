package org.eclectic.idc.jvm.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.api.ApiModel;
import org.eclectic.idc.jvm.runtime.facilities.BuiltinFacilities;
import org.eclectic.idc.qool.Queue;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.streamdesc.ElementSlidingWindow;
import org.eclectic.streaming.fragments.ILazyLoadListener;

public abstract class QoolTransformationBase extends IdcTransformationBase implements Runnable {
	
	protected HashMap<String, IQueue<?>> queues = new HashMap<String, IQueue<?>>();
	protected ContinuationResolverHelper cHelper = new ContinuationResolverHelper();
	
	protected StreamedQueue streamedQueue = new StreamedQueue(this);
	/*
	final String qName = "__STREAMING__";
	IQueue<?> q = qt.getQueue(qName);
	if ( q == null ) {
		q = new StreamedProxyQueue(qName, qt, model);
		qt.registerQueue(qName, q);
	}
	*/
	
	public QoolTransformationBase() {
		super();
	}
	
	public void registerQueue(String name, IQueue<?> q) {
		this.queues.put(name, q);
	}

	public IQueue<?> getQueue(String name) {
		return queues.get(name);
	}
		
	public StreamedQueue getStreamedQueue() {
		return this.streamedQueue;
	}

	public void addObjectToQueues(String modelName, Object obj) {
		//System.out.println("--------> " + obj);
		IModel<?, ?> model = getModelManager().getNamespace(modelName);
		if ( model instanceof ApiModel ) {
			ApiModel apiModel = (ApiModel) model;
			List<Object> allNewObjects = apiModel.referencedObjects(obj);
			allNewObjects.add(0, obj);
			for(int i = 0; i < allNewObjects.size(); i++) {
				Object newObj = allNewObjects.get(i);
				String metaclassName = apiModel.resolveMetaclassName(newObj);
				if ( metaclassName == null ) {
					System.err.println("WARNING: Not metaclass mapped to " + obj.getClass().getName());
				} else {
					for( IQueue<?> q : queues.values() ) {
						if ( q instanceof ModelQueue ) {
							ModelQueue mq = (ModelQueue) q;
							if ( mq.getModelName().equals(modelName) && mq.getClassName().equals(metaclassName) ) {
								if ( acceptedByViewFilter(newObj) )
									mq.put(newObj);
							}
						}
					}
				}
			}
		}
	}

	public ModelQueue findQueueForMetaclass(IModel model, String metaclassName) {
		// TODO: Factorize other code similar to this
		for( IQueue<?> q : queues.values() ) {
			if ( q instanceof ModelQueue ) {
				ModelQueue mq = (ModelQueue) q;
				if ( mq.getModel() == model && mq.getClassName().equals(metaclassName) ) {
					return mq;
				}
			}
		}		
		throw new IllegalArgumentException("No queue found for " + metaclassName);
	}
		
	
	public void configureStreamingMode(final String modelName, final IStreamedModel<?, ?> model) {
		model.addLazyLoadListener(new ILazyLoadListener() {			
			@Override
			public void loaded(Object newObj) {
				getStreamedQueue().put2(newObj, (IModel) model, modelName);
			}
		});
		
		for(ElementSlidingWindow w : model.getElementSlidingWindows() ) {
			for(IQueue<?> q : queues.values()) {
				if ( q instanceof StreamedModelQueue ) {
					StreamedModelQueue smq = (StreamedModelQueue) q;
					if ( smq.getModel() == model && smq.getClassName().equals(w.getClassName()) ) {					
						smq.setElementWindow(w.getElements());
					}
				}
			}
		}
		
	}

	/**
	 * It it assumed that the objects have already been added to the model...
	 * @param modelName
	 * @param obj
	 */
	public synchronized void receiveStreamedFragment(String modelName, IStreamedFragment<?, ?> fragment) {
		IModel<?, ?> model = getModelManager().getNamespace(modelName);
		IStreamedModel<Object, ?> streamed = (IStreamedModel<Object, ?>) model;
		Collection<Object> newObjs = streamed.receive((IStreamedFragment<Object, ?>) fragment);

		/*
		Object[] objs = fragment.getObjects();
		for(int i = 0; i < objs.length; i++) {
			getStreamedQueue().put2(objs[i], model, modelName);
		}
		*/

		
		for (Object object : newObjs) {
			getStreamedQueue().put2(object, model, modelName);
		}
		
		
	}
		
	private boolean acceptedByViewFilter(Object obj) {
		if ( viewFilter == null ) return true;
		Object r = viewFilter.call_1(obj);
		if ( r instanceof Boolean ) 
			return ((Boolean) r).booleanValue();
		return r != null;
	}

	protected void fillQueues(String modelName) {		
		// TODO: Now this could be improved by traversing in only one pass all objects of the model 		
		for( IQueue<?> q : queues.values() ) {
			if ( q instanceof ModelQueue ) {
				ModelQueue mq = (ModelQueue) q;
				if ( mq.getModelName().equals(modelName) ) {
					List<?> objects  = mq.retrieveAllObjects(getModelManager());
					for (Object object : objects) {
						if ( acceptedByViewFilter(object) )
							mq.put(object);
					}
				}
			}
		}
	}

	public void start_() {
		try {
			run();
		} catch ( IdcExceptionBlockingMatchNotResolved e ) {
			System.out.println("Cannot resolve in " + e.getTransformation().getName() + ": ");
			System.out.println("  " + e.getMessage());
			// TODO: Do this right
			if ( e.getTransformation().parent instanceof ParallelTransformationBase ) {
				((ParallelTransformationBase) e.getTransformation().parent).printPending();
			} else {
				e.getTransformation().printPending();
			}
			
			
			this.cleanUp(true);
		}
	}

	public void startSegment(String segmentClassName, IdcTransformationBase transformation, ModelManager modelManager) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, SecurityException, NoSuchFieldException {
		Class<?> k  = this.getClass().getClassLoader().loadClass(segmentClassName);
		//Class<?> k = ContinuationClassLoader.getInstance().loadClass(segmentClassName);
		// Class<?> k     = Class.forName(segmentClassName);
		Runnable r     = (Runnable) k.newInstance();
		k.getField("transformation_").set(r, transformation);
		k.getField("modelManager_").set(r, modelManager);

		r.run();
	}

	
	private long streamingTime = -1;
	public void setStreaming(long time) {
		streamingTime = time;
	}

	public void cleanUp() {
		cleanUp(false); 
	}
	
	/**
	 * If the transformation has a parent and "force" is set to false,
	 * the clean is not performed.
	 * @param force
	 */
	protected void cleanUp(boolean force) {
		if ( parent != null || force == false ) 
			return;
		
		if ( streamingTime > 0 ) {
			try {
				Thread.sleep(streamingTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		printPending();
	}

	public void printPending() {
		ArrayList<IQueue> toPrint = new ArrayList<IQueue>();
		toPrint.addAll(queues.values());
		toPrint.add(streamedQueue);
		for (IQueue q : toPrint) {
			Collection<Request> pending = q.pendingRequests();
			if ( pending.size() > 0 ) 
				System.out.println("** There are: " + pending.size() + " pending requests: ");
			
			for (Request request : pending) {
				System.out.println("   " + request.toInfo());
			}
		}
	}
	

	//
	// Methods to invoke this transformation from another
	//
		
	/**
	 * @see IdcTransformationBase#retrieve_from_invocation_(Object, String, String, String)
	 */
	@Override
	public Object retrieve_from_invocation_(Object srcObj, String queueName, String srcAttrName, String tgtAttrName) {
		IQueue<?> q             = this.getQueue(queueName);
		HistoryQueue<Object> hq = (HistoryQueue<Object>) q; // for the moment assume this
		
		LinkedList<Object> objs = hq.getObjects();
		for (Object obj : objs) {
			IModel<Object, ?> aModel;
			try {
				aModel = (IModel<Object, ?>) modelManager.getNamespace(obj);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
			if ( aModel.hasFeature(obj, srcAttrName) ) {
				Object v = aModel.getFeature(obj, srcAttrName);
				if ( v == srcObj ) {
					return aModel.getFeature(obj, tgtAttrName);
				}
			}
		}
		
		throw new IdcExceptionBlockingMatchNotResolved(this, "No match found in external invocation: " + srcObj);
		// TODO: Implement this using RequestKindProperty
	}

	
	public BuiltinFacilities getFacilities() {
		return new BuiltinFacilities(this);
	}
	
	
	/**
	 * See QoolTransformation, where it returns the objects in
	 * a queue named metaclass
	 */
	@Override
	public List<Object> allObjectsOf(String metaclass) {
		return ((LocalQueue) getQueue(metaclass)).getObjects();
	}
	
}
