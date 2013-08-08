package org.eclectic.streaming.fragments;

/**
 * Notifies about objects loaded lazily from an streaming IModel.
 * 
 * @author jesus
 */
public interface ILazyLoadListener {
	
	public void loaded(Object o);
	
}
