package org.eclectic.idc.datatypes.active;

import org.eclectic.idc.datatypes.CallableN;
import org.eclectic.idc.jvm.runtime.RunnableClosure;

public abstract class ActiveIterable extends ActiveOperation {
	
	protected CallableN callable;

	public ActiveIterable(IActiveSource source, CallableN callable) {
		super(source);
		this.callable = callable;
	}
	
	/* Now it seems not to work even for select...
	protected Object invoke1(Object o) {
		return callable.call__(o);
	}
	*/
	
	// Needed for map... if using "invoke1" => getting an IllegalArgumentException...
	protected Object invoke1_v2(Object o) {
		RunnableClosure rc = ((RunnableClosure) callable);
		rc.params.clear();
		rc.params.add(o);
		rc.run();
		return rc.result;
	}
	
}
