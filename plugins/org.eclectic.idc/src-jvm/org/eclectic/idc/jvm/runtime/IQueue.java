package org.eclectic.idc.jvm.runtime;

import java.util.Collection;

public interface IQueue<T> {
	void put(T o);
	void putAll(Collection<T> objs);
	
	void requestAll(IClosure closure);
	// Object requestAndWait(Request r);
	void addRequest(Request r);

	Collection<Request> pendingRequests();
}
