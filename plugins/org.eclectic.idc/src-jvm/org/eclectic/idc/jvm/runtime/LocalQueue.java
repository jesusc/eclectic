package org.eclectic.idc.jvm.runtime;

public class LocalQueue extends HistoryQueue<Object> {

	private QoolTransformationBase transformation;

	public LocalQueue(String name, QoolTransformationBase t) {
		super(name, t);
		t.registerQueue(name, this);
	}

	public void removeElementsAccessedByKey(Object o) {
		if ( accessData != null ) {
			Object element = accessData.remove(o);
			if ( element != null ) {
				// System.out.println("Removed from [" + this.name + "] = " + objects.size());
				this.objects.remove(element);
			}
		}
	}
	
}
