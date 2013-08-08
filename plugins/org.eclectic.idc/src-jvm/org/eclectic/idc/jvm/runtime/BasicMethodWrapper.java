package org.eclectic.idc.jvm.runtime;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.modeling.emf.IInplaceModel;
import org.eclectic.modeling.emf.IModel;

public class BasicMethodWrapper implements IMethodWrapper, IdcObject {
	protected IModel<Object, ?> model;
	protected Object object;

	public BasicMethodWrapper(IModel<?, ?> model, Object o) {
		this.model = (IModel<Object, ?>) model;
		this.object = o;
	}
	
	public Boolean kind_of(Object o) {
		if ( ! (o instanceof IdcMetaclass) ) return Boolean.FALSE;

		return ((IdcMetaclass) o).getModel() == model &&
				model.isKindOf(object, ((IdcMetaclass) o).getMetaclassName());
	}
	
	public Object get(String featureName) {
		return this.model.getFeature(object, featureName);
	}
	
	public Object up_to(Object o) {
		if ( ! (o instanceof IdcMetaclass ) ) throw new IllegalArgumentException();
		IdcMetaclass m = (IdcMetaclass) o;
		
		Object r = object;
		do {
			if ( m.ofKindIs(r) ) 
				return r;
			r = model.getContainer(r);
		} while ( r != null );
		
		throw new RuntimeException("No parent with type " + m.getMetaclassName());
	}
	
	public Object _refContainer() {
		return model.getContainer(object);
	}

	public Boolean is_nil() { return false; }

	public Object if_nil(IClosure c) { return object; }

	public Boolean eq(Object o) { 
		return o == object; 
	}

	// TODO: Remove at some point. Needed because in attribution language self[transf!trace.t] 
	// does not work at the syntax level
	public Object mySelf() {
		return object;
	}
	
	// TODO: DELETE THIS METHOD, IT IS HERE TO AVOID A LIMITATION OF THE MAPPINGS LANGUAGE 
	// ALSO, BE AWARE THAT mySelf returns this.object, which seems more reasonable...
	public Object my_self() {
		return this;
	}

	public ImmutableList as_list() {
		return new ImmutableList(object);
	}

	@Override
	public Object if_true(IClosure c) {
		return c.call__();
	}

	public Object println(Object o) {
		String str = o != null ? o.toString() : "Nil";
		System.out.println(str + " : " + this.object.toString());
		return object;
	}
	
	@Override
	public String toString() {
		return "BasicMethodWrapper [ " + object + " ]";
	}
	
	///
	/// Methods for deleting, replacing objects
	///
	public void replaceBy(Object newObject) {
		((IInplaceModel<Object>) model).replaceBy(this.object, newObject);	
	}
	
}
