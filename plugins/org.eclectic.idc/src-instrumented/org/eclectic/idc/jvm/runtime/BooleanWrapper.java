package org.eclectic.idc.jvm.runtime;


public class BooleanWrapper extends IdcPrimitiveObjectImpl<Boolean> implements IMethodWrapper, IdcObject {

	public BooleanWrapper(boolean b) {
		super(b);
	}
	
	public Boolean not() {
		// System.out.println("nooooooT " + ! impl);
		return ! impl;
	}
	
	public Boolean and(Boolean b) {
		return impl && b;
	}

	public Boolean or(Boolean b) {
		return impl || b;
	}

	public Object if_else(RunnableClosure ifClosure, RunnableClosure elseClosure) {
		if ( impl ) {
			ifClosure.params = new java.util.ArrayList<Object>();
			ifClosure.params.add(impl);
			ifClosure.run();
			return ifClosure.result;
			// return ifClosure.call__(impl);
		}
		else {
			elseClosure.params = new java.util.ArrayList<Object>();
			elseClosure.params.add(impl);
			elseClosure.run();
			return elseClosure.result;

			// return elseClosure.call__(impl);
		}
	}

	public Object if_true(RunnableClosure ifClosure) {
		if ( impl ) {
			ifClosure.params = new java.util.ArrayList<Object>();
			ifClosure.params.add(impl);
			ifClosure.run();
			return ifClosure.result;
			// return ifClosure.call__(impl);
		}
		return null;
	}

	public Object if_false(RunnableClosure ifClosure) {
		if ( ! impl ) {
			ifClosure.params = new java.util.ArrayList<Object>();
			ifClosure.params.add(impl);
			ifClosure.run();
			return ifClosure.result;
			// return ifClosure.call__(impl);
		}
		return null;
	}

	@Override
	protected String getKindOfTypeName() { return "Boolean"; }

}