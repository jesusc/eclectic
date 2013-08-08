package org.eclectic.idc.datatypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


import org.eclectic.idc.jvm.runtime.RunnableClosure;

public class ImmutableList implements Iterable<Object> {
	private List<Object> impl = null;
	
	public ImmutableList() { this(new ArrayList<Object>()); }
	public ImmutableList(List<Object> impl) { this.impl = impl; }

	public ImmutableList(Object... objs) { 
		this(new ArrayList<Object>());
		for(int i = 0; i < objs.length; i++) {
			impl.add(objs[i]);
		}
	}

	public static ImmutableList convertList(List<Object> objects) {
		ImmutableList result = new ImmutableList(objects);
		return result;
		/*
		for (Object object : objects) {
			//result = result.add(object);
			result.addFast(object);
		}
		return result;
		*/
	}

	// -- Utility methods -- //
	
	public boolean empty() {
		return impl.isEmpty();
	}
	
	public Object first() {
		if ( impl.size() > 0 ) 
			return impl.get(0);
		return null;
	}

	public Object last() {
		if ( impl.size() > 0 ) 
			return impl.get(impl.size() - 1);
		return null;		
	}
	
	public ImmutableList tail() {
		ImmutableList r = new ImmutableList();
		for(int i = 1; i < this.impl.size(); i++) {
			r.addFast(this.impl.get(i));
		}
		return r;
	}

	public ImmutableList add(Object o) {
		ImmutableList r = new ImmutableList();
		r.impl.addAll(impl);
		r.impl.add(o);
		return r;
	}
	
	public int index_of(Object o) {
		return this.impl.indexOf(o);
	}
	
	private void addFast(Object o) { this.impl.add(o); }
	
	public ImmutableList zip(ImmutableList l) {
		if ( l.size() != impl.size() ) 
			throw new IllegalArgumentException("Zip requires lists of the same size");
		
		ImmutableList r = new ImmutableList();
		for(int i = 0; i < this.impl.size(); i++) {
			Pair p = new Pair();
			p.set_first(this.impl.get(i));
			p.set_second(l.get(i));
			
			r.addFast(p);
		}
		
		return r;
	}

	public ImmutableList map(CallableN callable) {
		ImmutableList r = new ImmutableList();
		for (Object o : impl) {
			// System.out.println("*** Map iteration for " + o);
			// It seems that it is better to perform a direct invocation 
			RunnableClosure rc = ((RunnableClosure) callable);
			rc.params.clear();
			rc.params.add(o);
			rc.run();
			// System.out.println("--- Map iteration for " + o);
			Object rx = rc.result;
			r.addFast(rx);
		}
		return r;
	}

	public Object inject(Object init, CallableN callable) {
		Object tmp = init;
		for (Object o : impl) {
			// System.out.println("*** Map iteration for " + o);
			// It seems that it is better to perform a direct invocation 
			RunnableClosure rc = ((RunnableClosure) callable);
			rc.params.clear();
			rc.params.add(tmp);
			rc.params.add(o);
			rc.run();
			// System.out.println("--- Map iteration for " + o);
			tmp = rc.result;
		}
		return tmp;
	}

	public ImmutableList select(CallableN callable) {
		ImmutableList r = new ImmutableList();
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
			   if ( result instanceof Boolean )  {
				   if ( ((Boolean) result).booleanValue() )
					   r.addFast(o);
			   } else {
				   r.addFast(o);
			   }
			}
		}
		return r;
	}

	public Boolean all(CallableN callable) {
		ImmutableList r = new ImmutableList();
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
			   if ( result instanceof Boolean )  {
				   if ( ((Boolean) result).booleanValue() )
					   continue;
			   } else {
				   continue;
			   }
			}
			return false;
		}
		return true;
	}

	public Object find(CallableN callable) {
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
			   if ( result instanceof Boolean )  {
				   if ( ((Boolean) result).booleanValue() )
					   return o;
			   } else {
				   return o;
			   }
			}
		}
		return null;
	}

	public ImmutableList reject(CallableN callable) {
		ImmutableList r = new ImmutableList();
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
			   if ( result instanceof Boolean )  {
				   if ( ! ((Boolean) result).booleanValue() ) 
					   r.addFast(o);
			   } 
			} else {
			   r.addFast(o);
			}
		}
		return r;
	}
	
	
	public Object find_exactly_one(CallableN callable) {
		Object found = null;
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
				if ( result instanceof Boolean )  {
					if ( ((Boolean) result).booleanValue() ) {
						if ( found != null ) throw new AssertionError("Found more than one: \n   -> " + found + "\n   ->" + o);
						found = o;
					}
				} else {
					if ( found != null ) throw new AssertionError("Found more than one: \n   -> " + found + "\n   ->" + o);
					found = o;					
				}
			}
		}
		if ( found == null ) throw new AssertionError("Nothing found");
		return found;
	}
	
	public ImmutableList concat(ImmutableList l) {
		ImmutableList r = new ImmutableList();
		r.addAll(this.impl);
		r.addAll(l.impl);
		return r;
	}

	// Remove duplicates (difference with concat)
	public ImmutableList union(ImmutableList l) {
		HashSet<Object> set = new HashSet<Object>(this.impl);
		set.addAll(l.impl);
		ImmutableList r = new ImmutableList();
		r.addAll(set);
		return r;
	}

	public ImmutableList uniq() {
		HashSet<Object> set = new HashSet<Object>(this.impl);
		ImmutableList r = new ImmutableList();
		r.addAll(set);
		return r;
	}

	public ImmutableList difference(ImmutableList l) {
		ImmutableList r = new ImmutableList();
		r.addAll(this.impl);
		r.impl.removeAll(l.impl);
		return r;
	}
	
	public Boolean exist(CallableN callable) {
		ImmutableList r = new ImmutableList();
		for (Object o : impl) {
			Object result = callable.call__(o);
			if ( result != null ) {
			   if ( result instanceof Boolean )  {
				  return true;
			   } else {
				   return true;
			   }
			}
		}
		return false;
	}
	
	
	
	private void addAll(Collection<Object> list) {
		impl.addAll(list);
	}

	@Override
	public Iterator<Object> iterator() {
		return impl.iterator();
	}

	public Boolean include(Object o) {
		if ( impl.contains(o) ) return Boolean.TRUE;
		return Boolean.FALSE;
	}
	
	public String join(String separator) {
		StringBuffer b = new StringBuffer();
		for(int i = 0; i < impl.size(); i++) {
			b.append(impl.get(i));
			if ( i + 1 < impl.size() ) b.append(separator);
		}
		return b.toString();
	}

	public ImmutableList uniq_by(CallableN callable) {
		ImmutableList r = new ImmutableList();
		HashMap<String, Object> map = new HashMap<String, Object>(); 
		for (Object o : impl) {
			String id =  (String) callable.call__(o) ;
			if ( map.get(id) == null )
				map.put(id, o);
		}
		
		r.addAll(map.values());				
		return r;
	}

	// Each is continuable, but a non-continuable one should be possible!
	public void each(CallableN callable) {
		for (Object o : impl) {
			RunnableClosure rc = ((RunnableClosure) callable);
			rc.params.clear();
			rc.params.add(o);
			rc.run();
		}
		
	}

	public void each_with_index(CallableN callable) {
		int i = 0;
		for (Object o : impl) {
			RunnableClosure rc = ((RunnableClosure) callable);
			rc.params.clear();
			rc.params.add(o);
			rc.params.add(i);
			rc.run();
			i++;
		}
		
	}

	public ImmutableList flatten() {
		ImmutableList newList = new ImmutableList();
		for (Object obj : impl) {
			if (obj instanceof ImmutableList) {
				ImmutableList other = (ImmutableList) obj;
				newList.impl.addAll(other.flatten().impl);
			} else {
				newList.impl.add(obj);
			}
		}
		return newList;
	}
	
	public Boolean includes(Object o) {
		return this.impl.contains(o);
	}
	
	public Integer size() {
		return impl.size();
	}
	
	public Object get(Integer i) {
		return impl.get(i);
	}
	
	public ImmutableList as_list() {
		return this;
	}
	
	public void println(String prefix) {
		System.out.println(prefix + ":" + this.impl);
	}
	
	
	
}

