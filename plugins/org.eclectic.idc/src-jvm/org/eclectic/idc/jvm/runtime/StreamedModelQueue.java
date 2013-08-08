package org.eclectic.idc.jvm.runtime;

import java.util.List;
import java.util.ListIterator;

import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IMultiLevelModel;
import org.eclectic.modeling.emf.IStreamedModel;

/**
 * A variant of a model queue for streamed models. 
 * For the moment it is the same.
 * 
 * @author jesus
 *
 */
public class StreamedModelQueue extends ModelQueue {
	private int maxElements = -1;
	
	public StreamedModelQueue(String name, String modelName, String className, QoolTransformationBase t) {
		super(name, modelName, className, t);
	}
	
	@Override
	public void put(Object o) {
		super.put(o);
		// System.out.println("Size [" + this.name + "] = Objects " + objects.size() + "/ Requests " + requests.size() );
	}
	
	public Object checkElementWindow() {
		if ( maxElements > 0 && objects.size() > maxElements ) {
			Object removed = objects.remove(0);
			IStreamedModel model = (IStreamedModel) getModel();
			model.removeStreamed(removed);
			return removed;
			/*
			ListIterator<Request> it = requests.listIterator();
			while ( it.hasNext() ) {
				Request r = it.next();
				if ( r instanceof WaitStreamedObjectRequest ) {
					WaitStreamedObjectRequest rs = (WaitStreamedObjectRequest) r;
					rs.
				}
			}
			*/
		}		
		return null;
	}

	public void setElementWindow(int elements) {
		if ( elements < 1 ) throw new IllegalArgumentException();
		this.maxElements = elements;
	}

}
