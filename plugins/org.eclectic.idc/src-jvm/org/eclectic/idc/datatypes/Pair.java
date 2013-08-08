package org.eclectic.idc.datatypes;

public class Pair {

	private Object first;
	private Object second;

	public Pair() {
		this.first  = null;
		this.second = null;
	}
	
	public Object _1() { return first; }
	public Object _2() { return second; }
	
	public Object first() { return first; }
	public Object second() { return second; }
	
	public void set_first(Object o) {
		this.first = o;
	}
	
	public void set_second(Object o) {
		this.second = o;
	}
}
