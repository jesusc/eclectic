package org.eclectic.idc.datatypes.active;

import org.eclectic.idc.datatypes.CallableN;

public class ActiveSelect extends ActiveIterable {

	public ActiveSelect(IActiveSource source, CallableN callable) {
		super(source, callable);
	}
	
	@Override
	public void next(Object o) {
		Object result = invoke1_v2(o);
		if ( result != null ) {
		   if ( result instanceof Boolean )  {
			   if ( ((Boolean) result).booleanValue() )
				   child.next(o);
		   } else {
			   child.next(o);
		   }
		}
	}
	
}
