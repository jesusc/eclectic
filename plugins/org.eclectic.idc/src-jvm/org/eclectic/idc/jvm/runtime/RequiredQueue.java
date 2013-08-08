package org.eclectic.idc.jvm.runtime;

import java.util.Collection;
import java.util.LinkedList;

public class RequiredQueue implements IHistoryQueue<Object> {

	protected IHistoryQueue<Object> delegate;
	
	private String name;
	
	public RequiredQueue(String name) { // , QoolTransformationBase t) {
		this.name = name;
		// t.registerQueue(name, this);
	}
	
	/**
	 * The delegate is cast to an HistoryQueue
	 * @param delegate
	 */
	public void setDelegate(IQueue<Object> delegate) {
		if ( delegate == null ) throw new IllegalArgumentException("Null delegate for queue " + name);
		this.delegate = (IHistoryQueue<Object>) delegate;
	}
	
	@Override
	public void put(Object o) {
		delegate.put(o);
	}

	@Override
	public void putAll(Collection<Object> objs) {
		delegate.putAll(objs);
	}

	@Override
	public void requestAll(IClosure closure) {
		delegate.requestAll(closure);
	}

	/*
	@Override
	public Object requestAndWait(Request r) {
		return delegate.requestAndWait(r);
	}
	*/
	

	@Override
	public Collection<Request> pendingRequests() {
		return delegate.pendingRequests();
	}

	@Override
	public LinkedList<Object> getObjects() {
		return delegate.getObjects();
	}

	/*
	@Override
	public LinkedList<Request> getRequests() {
		return delegate.getRequests();
	}
	*/

	@Override
	public void addRequest(Request r) {
		delegate.addRequest(r);
	}

	@Override
	public Object findSatisfyingValue(Request r) {
		return delegate.findSatisfyingValue(r);
	}

 
}
