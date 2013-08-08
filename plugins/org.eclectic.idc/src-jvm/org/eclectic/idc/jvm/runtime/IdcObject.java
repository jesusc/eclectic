package org.eclectic.idc.jvm.runtime;

public interface IdcObject {
	public Boolean eq(Object s);	
	public Object if_nil(IClosure c);
	public Boolean is_nil();
	public Boolean kind_of(Object o);
	public Object  println(Object prefix);
	
	public Object if_true(IClosure c);

}
