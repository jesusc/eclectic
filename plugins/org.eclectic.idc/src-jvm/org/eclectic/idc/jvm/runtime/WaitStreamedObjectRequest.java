package org.eclectic.idc.jvm.runtime;

import org.apache.commons.javaflow.Continuation;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.ModelManager;

public class WaitStreamedObjectRequest implements Request {

	private IModel<?, ?> model;
	private IStreamedModel<Object, ?> streamingModel;
	private Object proxyObj;
	private Object satisfyingValue = null;
	private Continuation continuation;
	
	public WaitStreamedObjectRequest(IStreamedModel<?, ?> model, Object proxyObj) {
		this.model = (IModel<?, ?>) model;
		this.streamingModel = (IStreamedModel<Object, ?>) model;
		this.proxyObj = proxyObj;
	}

	@Override
	public boolean satisfiedBy(Object o) {
		if ( ! model.contains(o) ) {
			return false;
		}
		else if ( streamingModel.tryToResolveProxy(proxyObj, o) ) {
			satisfyingValue = o;
			return true;
		}
		return false;
	}

	@Override
	public boolean satisfiedByOptimized(AccessDataByFeature accessData) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void indexRequest(AccessDataByFeature accessData) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object satisfyingValue() {
		if ( satisfyingValue == null ) throw new IllegalStateException();
		return satisfyingValue;
	}

	@Override
	public void resume() {
		if ( satisfyingValue == null ) throw new IllegalStateException();

		// Copied from RequestKindProperty
		Continuation c = Continuation.continueWith(continuation, satisfyingValue);
		if ( c != null ) {
			WaitValue v = ((WaitValue) c.value());
			v.registerContinuation(c);
		}		
		
	}

	@Override
	public void setContinuation(Continuation c) {
		this.continuation = c;	
	}

	@Override
	public String toInfo() {
		return "Waiting streamed: " + proxyObj;
	}

}
