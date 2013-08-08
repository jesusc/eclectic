package org.eclectic.idc.jvm.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;

public class ParametersModel implements org.eclectic.modeling.emf.IModel<Object, Object> {
	public static final String InternalName = "Value";
	private HashMap<String, Object> data = new HashMap<String, Object>();
	
	public ParametersModel() {
		addParameterObject(InternalName, new InternalTransformationParameters());
	}
	
	public void addParameterObject(String metaclassName, Object data) {
		this.data.put(metaclassName, data);
	}

	public void addParameterObject(Object data) {
		this.addParameterObject(data.getClass().getSimpleName(), data);
	}

	@Override
	public Object getMetaclass(String metaclass) { 
		if ( data.containsKey(metaclass) ) 
			return data.get(metaclass);
		throw new IllegalArgumentException("No parameter " + metaclass + " in parameters models");
	}

	@Override
	public List<Object> allObjectsOf(String metaclass) {  
		ArrayList<Object> result = new ArrayList<Object>();
		if ( data.containsKey(metaclass) ) {
			result.add(data.get(metaclass));
		}
		return result;
	}
	
	@Override
	public Object createObject(String metaclass) { throw new UnsupportedOperationException(); }
	
	@Override
	public void setFeature(Object receptor, String featureName, Object value) { 
		if ( receptor instanceof InternalTransformationParameters ) {
			((InternalTransformationParameters) receptor).setParamValue(featureName, value);
			return;
		}
		throw new UnsupportedOperationException(); 
	}
	
	@Override
	public Object getFeature(Object receptor, String featureName) { 
		if ( receptor instanceof InternalTransformationParameters ) {
			return ((InternalTransformationParameters) receptor).getParamValue(featureName);
		}
		throw new UnsupportedOperationException(); 		
	}
	
	@Override
	public boolean hasFeature(Object receptor, String featureName) { 
		if ( receptor instanceof InternalTransformationParameters ) {
			return ((InternalTransformationParameters) receptor).hasParamValue(featureName);
		}
		return false;
	}
	
	@Override
	public boolean contains(Object obj) {
		return data.values().contains(obj);
	}
	@Override
	public boolean isKindOf(Object o, String metaclass) { throw new UnsupportedOperationException(); }
	
	@Override
	public void registerMethodHandler(Object handler) { }

	@Override
	public Object getMethodHandler() { return null; }
	
	@Override
	public Object getContainer(Object object) { throw new UnsupportedOperationException(); }

	@Override
	public List<Object> allObjectsOf(String metaclass, boolean noSubtypes) {
		throw new UnsupportedOperationException();
	}

	public class InternalTransformationParameters {
		private HashMap<String, Object> params = new HashMap<String, Object>();
		public void setParamValue(String name, Object value) {
			this.params.put(name, value);
		}
		public boolean hasParamValue(String featureName) {
			return this.params.containsKey(featureName);
		}
		public Object getParamValue(String name) {
			return this.params.get(name);
		}
	}

	@Override
	public void deleteObject(Object o) {
		throw new UnsupportedOperationException();
	}
	
	/*
	public class ParametersMethodHandler implements IModelMethodHandler {
		@Override
		public Object wrap(Object o) {
			return null;
		}		
	}
	
	public class ParametersMethodWrapper implements IMethodWrapper {
		
	}
	*/
	
}
