package org.eclectic.idc.datatypes;

import java.util.ArrayList;
import java.util.HashMap;

public class MutableMap {
	private HashMap<Object, Object> impl = new HashMap<Object, Object>();
	
	public MutableMap() { }

	// -- Utility methods -- //
	
	public boolean empty() {
		return this.empty();
	}
	
	public Object first() {
		if ( impl.size() > 0 ) 
			return impl.get(0);
		return null;
	}

	public MutableMap put(Object key, Object o) {
		impl.put(key, o);	
		return this;
	}

	public Boolean include(Object o) {
		return this.impl.containsKey(o);
	}
	
	public Object get(Object key) {
		return this.impl.get(key);
	}
	
	public Integer size() {
		return impl.size();
	}
	
	public ImmutableList keys() {
		return new ImmutableList(new ArrayList<Object>(impl.keySet()));
	}
	
	public void println(String prefix) {
		System.out.println(prefix + ":" + this.impl);
	}
}

