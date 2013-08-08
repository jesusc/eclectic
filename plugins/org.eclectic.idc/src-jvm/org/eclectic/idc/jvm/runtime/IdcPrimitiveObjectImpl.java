package org.eclectic.idc.jvm.runtime;

public abstract class IdcPrimitiveObjectImpl<T> implements IdcObject {
	protected T impl;

	public IdcPrimitiveObjectImpl(T impl) {
		this.impl = impl;
	}
	
	public Boolean eq(Object s) {
		if ( s == null ) return false;
		return s.equals(impl);
	}
	
	public T if_nil(IClosure c) {
		return impl;
	}
	
	public Boolean is_nil() {
		return false;
	}
	
	public Boolean kind_of(Object o) {
		if ( ! (o instanceof IdcMetaclass) ) return Boolean.FALSE;
		return ((IdcMetaclass) o).getMetaclassName().equals(getKindOfTypeName());
	}
	
	public Object println(Object prefix) {
		String res = "" + prefix + this.impl;
		System.out.println(res);
		return (Object) this.impl;
	}

	public String to_s() {
		return this.impl.toString();
	}

	public Object if_true(IClosure c) {
		return c.call__();
	}
	
	protected abstract String getKindOfTypeName();

}
