package org.eclectic.idc.jvm.runtime;

import java.util.HashMap;
import java.util.Set;

import org.apache.commons.javaflow.ContinuationClassLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.NoModelFoundException;

public abstract class MethodLibraryBase extends IdcTransformationBase implements IMethodWrapper {
	
	private HashMap<String, Entry> methods = new HashMap<String, Entry>();
	
	public MethodLibraryBase() {
		super();
	}

	// TODO: DUPLICATED!!
	public RunnableClosure getMethodHandler(String methodName, Object receptor) {
		if ( receptor == null ) throw new NullPointerException("Invoking " + methodName);
		try {
			IModel<?, ?> m = modelManager.getNamespace(receptor);
			Entry e = methods.get(methodName);
			if ( e == null ) throw new IdcException("No method " + methodName + " for " + this.getName());
			
			String compatibleMetaclass = null;
			Set<String> classifiers = e.classifiers();
			for (String receptorMetaclassName : classifiers) {
				if ( m.isKindOf(receptor, receptorMetaclassName) ) {
					compatibleMetaclass = receptorMetaclassName;
					break;
				}
			}
			
			if ( compatibleMetaclass == null ) throw new IdcException("No compatible method " + methodName + " for " + this.getName());
			
			String generatedClass = e.generatedClassFor(compatibleMetaclass);

			
			Class<?> c;
			
			try {
				// This is because when the class is statically compiled (by the Eclipse builder)
				// it is not loader with the ContinuationClassLoader any more, so ContinuationClassLoader
				// is not working in this environment (because it is not actually needed, it was already used
				// as part of the compilation process to instrument the classes)
				//
				// TODO: Do this in a more elegant way (an efficient)
				c = ContinuationClassLoader.getInstance().loadClass(generatedClass);			
			} catch (IllegalStateException e2) {
				try {
				c = getClass().forName(generatedClass);
				} catch ( ClassNotFoundException ex) {
					c = this.getClass().getClassLoader().loadClass(generatedClass);
				}
			}
			
			IClosure genMethod = (IClosure) c.newInstance();
			genMethod.modelManager_ = this.modelManager;
			genMethod.numParameters_ = 0;
			genMethod.transformation_ = this;

			return (RunnableClosure) genMethod;
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		} catch (ClassNotFoundException e) {
			throw new IdcException(e);	
		} catch (InstantiationException e) {
			throw new IdcException(e);	
		} catch (IllegalAccessException e) {
			throw new IdcException(e);	
		}
		
	}
	
	public Object performInvocation(String methodName, Object receptor) {
		if ( receptor == null ) throw new NullPointerException("Invoking " + methodName);
		try {
			IModel<?, ?> m = modelManager.getNamespace(receptor);
			Entry e = methods.get(methodName);
			if ( e == null ) throw new IdcException("No method " + methodName + " for " + this.getName());
			
			String compatibleMetaclass = null;
			Set<String> classifiers = e.classifiers();
			for (String receptorMetaclassName : classifiers) {
				if ( m.isKindOf(receptor, receptorMetaclassName) ) {
					compatibleMetaclass = receptorMetaclassName;
					break;
				}
			}
			
			if ( compatibleMetaclass == null ) throw new IdcException("No compatible method " + methodName + " for " + this.getName());
			
			String generatedClass = e.generatedClassFor(compatibleMetaclass);
			
			//ContinuationClassLoader cloader = ContinuationClassLoader.getInstance();
			//Class<?> c = cloader.findClass(generatedClass);
			Class<?> c = ContinuationClassLoader.getInstance().loadClass(generatedClass);
			// Class<?> c = getClass().forName(generatedClass);
			IClosure genMethod = (IClosure) c.newInstance();
			genMethod.modelManager_ = this.modelManager;
			genMethod.numParameters_ = 0;
			genMethod.transformation_ = this;
			Object result = genMethod.call__(receptor);
			return result;
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		} catch (ClassNotFoundException e) {
			throw new IdcException(e);	
		} catch (InstantiationException e) {
			throw new IdcException(e);	
		} catch (IllegalAccessException e) {
			throw new IdcException(e);	
		}
		
	}
	
	public void registerMethod(String methodName, String modelName, String classifierName, String generatedClassName) {
		Entry e = methods.get(methodName);
		if ( e == null ) {
			e = new Entry(methodName);
			methods.put(methodName, e);
		}

		e.add(classifierName, generatedClassName);	
	}
	
	class Entry {
		private String methodName;
		private HashMap<String, String> classifiers = new HashMap<String, String>();
		
		public Entry(String methodName) {
			this.methodName = methodName;
		}
		
		public void add(String classifierName, String generated) {
			this.classifiers.put(classifierName, generated);
		}
		
		public java.util.Set<String> classifiers() {
			return classifiers.keySet();
		}
		
		public String generatedClassFor(String compatibleMetaclass) {
			return classifiers.get(compatibleMetaclass);
		}

	}
}
