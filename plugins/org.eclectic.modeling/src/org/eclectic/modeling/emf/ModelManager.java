package org.eclectic.modeling.emf;

import java.util.Collection;
import java.util.HashMap;

/**
 * A model manager is responsible of handling the models
 * of a transformation. It is composed of IModel objects,
 * which represents the actual models. Each IModel act as
 * a namespace for its element, and the ModelManager is in 
 * charge of the binding.
 * 
 * @author Jesus Sanchez Cuadrado
 */
public class ModelManager {
	protected HashMap<String, IModel<?,  ?>> namespaces = new HashMap<String, IModel<?,  ?>>();
	
	/**
	 * Register a new model into the manager, binding it to a name.
	 * 
	 * @param name The model name.
	 * @param model The model to be added.
	 */
	public void register(String name, IModel<?,  ?> model) {
		if ( namespaces.containsKey(name) ) 
			throw new IllegalArgumentException("Namespace '" + name + "' already registered in the manager");
		
		namespaces.put(name, model);
	}
	
	/**
	 * Get a model given its name. 
	 * 
	 * It is intended to be used when it is possible to assure the existence of a model.
	 * 
	 * @param name The name for the model.
	 * @return The model bound to the name.
	 */
	public IModel<?, ?> getNamespace(String name) {
		if ( ! namespaces.containsKey(name) ) 
			throw new IllegalArgumentException("No namespace '" + name + "' registered in the manager. There are " + namespaces.keySet());
		
		return namespaces.get(name);
	}

	/**
	 * Get a model given its name.
	 * 
	 * @param name The name for the model.
	 * @return The model bound to the name.
	 * @throws NoModelFoundException 
	 */
	public IModel<?, ?> getNamespace(Object obj) throws NoModelFoundException {
		Collection<IModel<?, ?>> models = namespaces.values();
		for (IModel<?, ?> iModel : models) {
			if ( iModel.contains(obj) ) 
				return iModel;
		}
		
		throw new NoModelFoundException("Model not found for object " + obj + " with " + obj.getClass() + ". There are " + namespaces.keySet());
	}

	public boolean hasNamespace(String name) {
		return namespaces.containsKey(name);
	}
	
	public Collection<IModel<?, ?>> getAllModels() {
		return namespaces.values();
	}

	@SuppressWarnings("unchecked")
	public ModelManager createSharedCopy() {
		ModelManager copy = new ModelManager();
		copy.namespaces = (HashMap<String, IModel<?, ?>>) this.namespaces.clone();
		return copy;
	}
}
