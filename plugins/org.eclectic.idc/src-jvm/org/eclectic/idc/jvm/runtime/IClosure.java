package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclectic.idc.datatypes.CallableN;
import org.eclectic.modeling.emf.ModelManager;

public class IClosure implements CallableN {
	public int numParameters_;
	public ModelManager modelManager_;
	public IdcTransformationBase transformation_;

	/*
	@Override
	public Object call__(Object... args) {
		throw new UnsupportedOperationException();
	}
	*/
	
	@Override
	public Object call__(Object... args) {
		// Calls the "call" method reflectively, that will be implemented by subclasses
		// return MethodCallHandler.executeReflectively(this, "call", args);
	
		String methodName = "call";
		Object receptor   = this;
		Object[] params   = args;
		
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
			return method.invoke(receptor, params);
		} catch (IllegalArgumentException e) {
			throw new IdcException(e);
		} catch (IllegalAccessException e) {
			throw new IdcException(e);
		} catch (InvocationTargetException e) {
			if ( e.getTargetException() instanceof IdcException ) throw (IdcException) e.getTargetException();
			throw new IdcException(e.getTargetException());
		}
	
	}
	
}
