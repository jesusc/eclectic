package org.eclectic.idc.datatypes.active;

import org.eclectic.idc.datatypes.CallableN;

public class ActiveMap extends ActiveIterable {

	public ActiveMap(IActiveSource source, CallableN callable) {
		super(source, callable);
	}

	@Override
	public void next(Object o) {
		Object result = invoke1_v2(o);
		child.next(result);
	}
}
