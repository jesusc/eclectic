package org.eclectic.idc.jvm.runtime;

import java.util.ArrayList;
import java.util.List;

import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IMultiLevelModel;
import org.eclectic.modeling.emf.ModelManager;

public class ModelQueue extends HistoryQueue<Object> {
	
	private String modelName;
	private String className;
	protected int potency = -1;
	private boolean isStrictType = false;

	public ModelQueue(String name, String modelName, String className, QoolTransformationBase t) {
		super(name, t);
		this.modelName = modelName;
		this.className = className;
	}

	public String getClassName() {
		return className;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	private class AdditionalType {
		protected String modelName;
		protected String className;
		protected boolean isStrict;
		public AdditionalType(String modelName, String className, boolean isStrict) {
			this.modelName = modelName; this.className = className; this.isStrict = isStrict;
		}
	}
	private ArrayList<AdditionalType> additionals = new ArrayList<AdditionalType>();
	
	public void addAdditionalType(String modelName, String className, boolean isStrict) {
		additionals.add(new AdditionalType(modelName, className, isStrict));
	}
	
	public IModel getModel() {
		return this.transformation.getModelManager().getNamespace(modelName);
	}
	
	/**
	 * This method is intended to deal with multi-level meta-modeling framework. 
	 * If it is not called, by default there is no potency and all elements of a given
	 * type are matched.
	 * 
	 * @param potency the potency of the elements to be stored by this queue.
	 */
	public void setPotency(int potency) {
		this.potency = potency;
	}

	public void setStrictType(boolean isStrictType) {
		this.isStrictType = isStrictType;
	}
	

	public List<?> retrieveAllObjects(ModelManager modelManager) {
		IModel<?, ?> model = modelManager.getNamespace(this.modelName);
		List<Object> result = (List<Object>) retrieveAllObjectsAux(model, this.className, this.isStrictType);
		for(AdditionalType t : additionals) {
			model = modelManager.getNamespace(t.modelName);
			result.addAll( retrieveAllObjectsAux(model, t.className, t.isStrict) );
		}
		return result;
	}
		
	private List<?> retrieveAllObjectsAux(IModel<?, ?> model, String className, boolean isStrictType) {
		if ( potency != -1 ) {
			IMultiLevelModel<?, ?> multLevelModel = (IMultiLevelModel<?, ?>) model;
			return multLevelModel.allObjectsOf(className, potency);
		}
		if ( isStrictType ) return model.allObjectsOf(className, true);
		else return model.allObjectsOf(className);
	}

	
}
