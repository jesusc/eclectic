package org.eclectic.idc.jvm.runtime;

import org.apache.commons.javaflow.Continuation;

/**
 * A request is used in the following way:
 *   - calls to satisfiedBy(o) until it returns true
 *   - call to satisfyingValue / resume (which uses satisfyingValue)
 *   
 * The request is in charge of holding the value
 * that is used as satisfiyingValue. This is because sometimes
 * the original object is only part of the satisfying value
 * (e.g., multivalued resolving)
 * 
 * @author jesus
 */
public interface Request {
	public boolean satisfiedBy(Object o);
	public boolean satisfiedByOptimized(AccessDataByFeature accessData);
	
	/**
	 * Index this request into the passed AccessData, if possible. 
	 * Some types of request are not meant to be indexed.
	 * @param accessData
	 */
	public void indexRequest(AccessDataByFeature accessData);	

	public Object satisfyingValue();
	public void resume();
	
	public void    setContinuation(Continuation c);
	public String  toInfo();
}
