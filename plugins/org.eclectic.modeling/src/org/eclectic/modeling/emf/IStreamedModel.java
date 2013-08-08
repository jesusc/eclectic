package org.eclectic.modeling.emf;

import java.util.Collection;

import org.eclectic.streamdesc.ElementSlidingWindow;
import org.eclectic.streaming.fragments.ILazyLoadListener;

public interface IStreamedModel<O, M> {

	public Collection<Object> receive(IStreamedFragment<O, ?> fragment);
	
	public boolean receptorNeedsWaiting(Object receptor, String featureName);
	public boolean  valueNeedsWaiting(Object value);
	
	public boolean tryToResolveProxy(Object proxyObj, Object o);

	void addLazyLoadListener(ILazyLoadListener listener);

	
	// Access to the stream configuration
	public Collection<ElementSlidingWindow> getElementSlidingWindows();

	/**
	 * Remove an element that has been temporaly stored.
	 * @param removed
	 */
	public void removeStreamed(Object removed);
}