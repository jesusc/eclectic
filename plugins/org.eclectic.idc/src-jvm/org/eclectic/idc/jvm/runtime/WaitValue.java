package org.eclectic.idc.jvm.runtime;

import org.apache.commons.javaflow.Continuation;

public class WaitValue {
	public Request r;
	public IQueue q;

	public WaitValue(IQueue q, Request r) {
		this.q = q;
		this.r = r;
	}
	
	public void registerContinuation(Continuation c) {
		r.setContinuation(c);			
	}
	
}