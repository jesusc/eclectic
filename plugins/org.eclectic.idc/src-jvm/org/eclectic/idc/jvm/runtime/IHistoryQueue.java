package org.eclectic.idc.jvm.runtime;

import java.util.LinkedList;

public interface IHistoryQueue<T> extends IQueue<T> {

	public abstract LinkedList<T> getObjects();

	//public abstract LinkedList<Request> getRequests();
	public abstract void addRequest(Request r);

	public abstract Object findSatisfyingValue(Request r);

}