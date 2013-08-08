package org.eclectic.idc.jvm.runtime;

import java.util.ArrayList;

import org.apache.commons.javaflow.Continuation;

public class AllRequest implements Request {
	public IClosure closure;
	public AllRequest(IClosure c) {
		this.closure = c;
	}
	
	@Override
	public boolean satisfiedBy(Object o) {
		lastResult = o;
		return true;
	}
	
	@Override
	public boolean satisfiedByOptimized(AccessDataByFeature accessData) {
		return false;
	}
	
	@Override
	public void indexRequest(AccessDataByFeature accessData) {
		
	}

	public Object satisfyingValue() {
		return lastResult;
	}
	
	private Object lastResult;
	public void resume() {
		resumeWith(lastResult);	
	}
	
	// @Override
	public void resumeWith(Object o) {
		// System.out.println("Closure: " + closure.getClass().getName() + " " + closure);
		// System.out.println(closure.getClass().getSuperclass());
		RunnableClosure rc = (RunnableClosure) closure;			
		rc.params = new ArrayList<Object>();
		rc.params.add(0, o);
		Continuation c = Continuation.startWith(rc);
		if ( c != null ) {
			WaitValue v = ((WaitValue) c.value());

			//System.out.println("AllRequest - Stored for " + o);
			//System.out.println("AllRequest - Waiting for " + v.r);
			v.registerContinuation(c);
			/*
			try {
				// c.value().getClass().getMethod("registerContinuation", Continuation.class).invoke(c.value(), c);
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
		} else {
			// System.out.println("Finished object " + o);
		}
	}

	@Override
	public void setContinuation(Continuation c) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toInfo() {
		throw new UnsupportedOperationException();
	}

	
}