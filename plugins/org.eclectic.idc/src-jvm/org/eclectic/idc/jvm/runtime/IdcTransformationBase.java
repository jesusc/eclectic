package org.eclectic.idc.jvm.runtime;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.javaflow.ContinuationClassLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;

public abstract class IdcTransformationBase implements IModel<Object, Class<?>> {

	public ModelManager modelManager;	
	public String name;
	protected IdcTransformationBase parent;

	protected RunnableClosure viewFilter;
	
	public String getName() {
		return name;
	}
	
	/**
	 * It must be set only once, before the transformation start.
	 * 
	 * A runtime model automatically added to the model manager. 
	 * 
	 * @param modelManager The model manager.
	 */
	public void setModelManager(ModelManager modelManager) {
		setSharedModelManager(modelManager);

		if ( ! this.modelManager.hasNamespace(RuntimeModel.UNIQUE_ID) ) 
			this.modelManager.register(RuntimeModel.UNIQUE_ID, new RuntimeModel());
	}

	/**
	 * Sets the model manager, assuming that it is shared among several transformations.
	 * @param modelManager The model manager.
	 */
	public void setSharedModelManager(ModelManager modelManager) {
		if ( this.modelManager != null ) 
			throw new IllegalStateException("Model manager already set");
		
		this.modelManager = modelManager;		
	} 	

	public ModelManager getModelManager() {
		return this.modelManager;
	}


	public abstract void start_();
	public void configure_() { };
	
	// 
	// Begin-of IModel 
	//
	
	/**
	 * See QoolTransformationBase, where it returns the objects in
	 * a queue named metaclass
	 */
	@Override
	public List<Object> allObjectsOf(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object createObject(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Class<?> getMetaclass(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setFeature(Object receptor, String featureName, Object value) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Object getFeature(Object receptor, String featureName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasFeature(Object receptor, String featureName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(Object obj) {
		if ( this.getClass().isInstance(obj) ) return true;
		return false;
	}

	@Override
	public boolean isKindOf(Object o, String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void registerMethodHandler(Object handler) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public Object getMethodHandler() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getContainer(Object object) {
		throw new UnsupportedOperationException();
	}	
	// End-of IModel

	
	// Begin-of Method-Handler
	
	/**
	 * Search for wrapper which can handle the method according to the type of the
	 * receptor object. The look up is performed on the modules loaded by the
	 * transformation. If none is found the default wrapper is returned.
	 * 
	 * @param receptor The receptor object
	 * @param methodName The name of the method
	 * 
	 * @return An object able to deal with the method (or a default wrapper if not available)
	 */
	public Object getMethodHandler(Object receptor, String methodName) {
		// TODO: Implement or remove...
		throw new UnsupportedOperationException();
	}
	
	// End-of Method-handler
	
	/**
	 * Establishes the transformation that act as parent of this transformation, that is,
	 * it invokes the transformation and may provide data required by this transformation.
	 * @param parent
	 */
	public void setParentTransformation(IdcTransformationBase parent) {
		this.parent = parent;
	}
	
	/**
	 * Creates an new transformation object by instantiating a new transformation
	 * that has to be looked up according to the transformationName parameter.
	 * 
	 * @param transformationName
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public IdcTransformationBase instantiateTransformation(String transformationName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> c = null; 
		// TODO: Unify with MethodLibraryBase -> this seems simple and works for Eclipse...
		//       Works in standalone???
		c = this.getClass().getClassLoader().loadClass(transformationName);

		IdcTransformationBase t = (IdcTransformationBase) c.newInstance();

		// TODO: Do the actual binding according to the specification in = gbind, in2 = atl... etc.

		t.setSharedModelManager( modelManager.createSharedCopy() ); 
		return t;
	}


	//
	// Methods to invoke this transformation from another
	//
	
	public void	configure_invocation_(RunnableClosure viewFilter) {
		this.viewFilter = viewFilter;
	}

	public void setParameterValue(String parameterName, Object value) {
		final String modelName = "params"; // TODO: This is a convention...
		if ( ! this.getModelManager().hasNamespace(modelName) ) 
			this.getModelManager().register(modelName, new ParametersModel());
		
		ParametersModel model = (ParametersModel) this.getModelManager().getNamespace(modelName);		
		model.setFeature(model.allObjectsOf(ParametersModel.InternalName).get(0), parameterName, value);
		//model.setFeature(receptor, featureName, value)
		//System.out.println(parameterName + " = " + value);
	}
	
	/**
	 * Retrieve an element from an interface. It is non-blocking. If there is
	 * no counterpart it throws an exception.
	 * 
	 * The actual kind of interface (referred with interfaceName) is defined
	 * (interpreted by) subclasses.
	 * 
	 * @param src
	 * @param interfaceName
	 * @param srcAttrName
	 * @param tgtAttrName
	 */
	public abstract Object retrieve_from_invocation_(Object srcObj, String interfaceName, String srcAttrName, String tgtAttrName);


	public void printPending() { }

}
