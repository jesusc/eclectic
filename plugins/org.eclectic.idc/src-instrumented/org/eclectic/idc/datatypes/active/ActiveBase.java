package org.eclectic.idc.datatypes.active;

import org.eclectic.idc.datatypes.CallableN;
import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedSetter;

public abstract class ActiveBase extends ImmutableList implements IActiveSource, IStreamedSetter {

	protected ActiveOperation finalTarget = null;
	
	@Override
	public ImmutableList select(CallableN callable) {
		return new ActiveSelect(this, callable);
	}
	
	@Override
	public ImmutableList map(CallableN callable) {
		return new ActiveMap(this, callable);
	}
	
	@Override
	public void setStreamed(IModel model, Object obj, String featureName) {
		finalTarget = new ActiveSet(this, model, obj, featureName);
		this.activeOperation(finalTarget);
	}

}
