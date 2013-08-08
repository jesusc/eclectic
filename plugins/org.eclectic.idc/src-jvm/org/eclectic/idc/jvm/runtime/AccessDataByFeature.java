
package org.eclectic.idc.jvm.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.modeling.emf.IModel;

public class AccessDataByFeature {
	private String accessFeatureName = null;
	private HashMap<Object, Object> accessData;
	private HashMap<Object, ArrayList<Request>> waitingRequests;

	public AccessDataByFeature(String featureName) {
		this.accessFeatureName = featureName;
		this.accessData = new HashMap<Object, Object>();		
		this.waitingRequests = new HashMap<Object, ArrayList<Request>>();		
	}
	
	public void put(Object o, IModel<Object, Object> model) {		
		Object src = model.getFeature(o, accessFeatureName);
		accessData.put(src, o);
	}

	public Object get(Object key) {
		return accessData.get(key);
	}
	
	public Object remove(Object key) {
		Object result = accessData.remove(key);
		waitingRequests.remove(key);
		return result;
	}

	public String getFeatureName() {
		return accessFeatureName;
	}

	
	public void indexRequest(Object key, Request r) {
		if ( key instanceof ImmutableList ) {
			ImmutableList l = ((ImmutableList) key);
			for(int i = 0; i < l.size(); i++) {
				indexRequest(l.get(i), r);
			}
			return;
		}
		
		ArrayList<Request> l = waitingRequests.get(key);
		if ( l == null ) {
			l = new ArrayList<Request>();
			waitingRequests.put(key, l);
		}
		l.add(r);
	}

	private static Iterator<Request> EMPTY_ITERATOR = new ArrayList<Request>().iterator();
	public Iterator<Request> waitingRequestsFor(Object o, IModel<Object, Object> model) {
		Object key = model.getFeature(o, accessFeatureName);

		List<Request> l = waitingRequests.get(key);
		if ( l == null ) {
			return EMPTY_ITERATOR;
		}
		return l.iterator();
	}

	public List<Request> waitingRequestsFor2(Object o, IModel<Object, Object> model) {
		Object key = model.getFeature(o, accessFeatureName);
		return waitingRequests.remove(key);
	}

	public Collection<? extends Request> pendingRequests() {
		LinkedList<Request> r = new LinkedList<Request>();
		Collection<ArrayList<Request>> values = waitingRequests.values();
		for (ArrayList<Request> arrayList : values) {
			if ( arrayList != null)
				r.addAll(arrayList);
		}
		return r;
	}

	public int getRequestsSize() {
		System.out.println(this.accessData.size());
		int result = 0;
		Collection<ArrayList<Request>> values = waitingRequests.values();
		for (ArrayList<Request> arrayList : values) {
			if ( arrayList != null)
				result += arrayList.size();
		}
		return result;
	}


}
