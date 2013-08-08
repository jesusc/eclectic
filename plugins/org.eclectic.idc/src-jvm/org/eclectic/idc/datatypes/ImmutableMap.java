package org.eclectic.idc.datatypes;

import java.util.HashMap;

public class ImmutableMap {
	private HashMap<Object, Object> impl = new HashMap<Object, Object>();
	
	public ImmutableMap() { }

	// -- Utility methods -- //
	
	public boolean empty() {
		return this.empty();
	}
	
	public Object first() {
		if ( impl.size() > 0 ) 
			return impl.get(0);
		return null;
	}

	public ImmutableMap put(Object key, Object o) {
		ImmutableMap r = new ImmutableMap();
		r.impl.putAll(impl);
		r.impl.put(key, o);
		return r;
	}

	public Boolean include(Object o) {
		return this.impl.containsKey(o);
	}

	private void putFast(Object k, Object o) { this.impl.put(k, o); }
	
	
	public Object get(Object key) {
		return this.impl.get(key);
	}
	
	public Integer size() {
		return impl.size();
	}
	
	public void println(String prefix) {
		System.out.println(prefix + ":" + this.impl);
	}
}

