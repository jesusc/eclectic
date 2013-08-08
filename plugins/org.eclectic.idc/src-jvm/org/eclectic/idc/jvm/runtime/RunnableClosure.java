package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.commons.javaflow.Continuation;

public abstract class RunnableClosure extends IClosure implements Runnable {
	public ArrayList<Object> params = new ArrayList<Object>();
	public Object result;
	
	/*@Override
	public void run() {
		System.out.println("ORIGINAL RUN " + this);
		Object[] paramsArray = params.toArray();
		this.result = call__(paramsArray);		
*/
		/*
		String methodName = "call";
		Object receptor   = this;
		Object[] params   = paramsArray;
		
		Method[] methods = receptor.getClass().getMethods();
		Method method    = null;
		for (int i = 0; i < methods.length; i++) {
			if ( methods[i].getName().equals(methodName) ) {
				method = methods[i];
				break;
			}			
		}
		
		if ( method == null ) throw new IdcException("No method " + methodName + " object " + receptor);
				
		try {
			// System.out.println("=== Executing " + methodName + " for " + receptor + " with " + params);
			this.result = method.invoke(receptor, params);
		} catch (IllegalArgumentException e) {
			throw new IdcException(e);
		} catch (IllegalAccessException e) {
			throw new IdcException(e);
		} catch (InvocationTargetException e) {
			if ( e.getTargetException() instanceof IdcException ) throw (IdcException) e.getTargetException();
			throw new IdcException(e.getTargetException());
		}
	*/
	//}


	public Object call_1(Object o) {
		params = new java.util.ArrayList<Object>();
		params.add(o);
		this.run();
		return this.result;
	}

	// Call method by name
	public Object call_2(Object o, Object o2) { fillParameters(o, o2); this.run(); return this.result; }	
	public Object call_3(Object o, Object o2, Object o3) { fillParameters(o, o2, o3); this.run(); return this.result; }	
	public Object call_4(Object o, Object o2, Object o3, Object o4) { fillParameters(o, o2, o3, o4); this.run(); return this.result; }	
	public Object call_5(Object o, Object o2, Object o3, Object o4, Object o5) { fillParameters(o, o2, o3, o4, o5); this.run(); return this.result; }	
	// Maximum 1 (receptor) + 4 parameters so far
	
	private void fillParameters(Object... args) {
		params = new java.util.ArrayList<Object>();
		for(int i = 0; i < args.length; i++) params.add(args[i]);
		this.numParameters_= params.size();
	}
	// 
	
	
	// TODO: CHECK THIS IS STILL VALID FOR SOMETHING
	
	// public Object continuable_call__(Object... args) {
	public Object continuable_call__(Object o) {
		Object[] args = new Object[1];
		args[0] = o;
		this.params.clear(); // TODO: be careful, this is weird...
		for (int i = 0; i < args.length; i++) {
			this.params.add(args[i]);	
		}
		
		//Continuation c = Continuation.startWith(this);
		//if ( c != null )
		//	Continuation.suspend();
		
		this.run();		
		
		System.out.println("[RunnableClosure[" + this + "].continuable_call]. Finish with " + this.result);
		return this.result;		
	}
	
}
