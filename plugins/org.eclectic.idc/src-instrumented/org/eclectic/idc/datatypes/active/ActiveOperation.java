package org.eclectic.idc.datatypes.active;


public abstract class ActiveOperation extends ActiveBase {

	private IActiveSource source;
	protected ActiveOperation child;

	public ActiveOperation(IActiveSource source) {
		this.source = source;
	}
	
	public void activeOperation(ActiveOperation child) {
		this.child = child;
		source.activeOperation(this);
	}
	
	public abstract void next(Object o);
	
	
}
