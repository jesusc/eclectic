package org.eclectic.idc.datatypes.active;

import org.eclectic.modeling.emf.IModel;


public class ActiveSet extends ActiveOperation {
	
	private String featureName;
	private Object receptor;
	private IModel model;

	public ActiveSet(IActiveSource source, IModel model, Object receptor, String featureName) {
		super(source);
		this.model = model;
		this.receptor    = receptor;
		this.featureName = featureName;
	}

	@Override
	public void next(Object o) {
		model.setFeature(receptor, featureName, o);
	}
}
