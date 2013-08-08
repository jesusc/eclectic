package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.javaflow.Continuation;
import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.jvm.runtime.RequestKindProperty.MultivaluedSatisfaction;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This is a quick implementation until a full compiler for
 * the trace matching language is created. 
 * 
 * @author jesusc
 *
 */
public class RequestKindProperty implements Request {

	private IdcMetaclass type;
	private String featureName;
	private Object value;
	private Continuation continuation;
	private String file;
	private int row;
	private int col;
	private IClosure getterClosure;
	private Satisfaction satisfaction;
	
	// This is needed to resolve situations in which type filter is not given
	private ModelManager modelManager;
	private int expectedHashCode;
	
	public RequestKindProperty(ModelManager m, IdcMetaclass type, String featureName, Object value) {
		this.type        = type;
		this.featureName = featureName;
		this.value       = value;
		this.expectedHashCode = value != null ? value.hashCode() : 0;
		this.modelManager = m;
		if ( value instanceof ImmutableList ) {
			satisfaction = new MultivaluedSatisfaction((ImmutableList) value);
		} else {
			satisfaction = new MonovaluedSatisfaction(); // TODO: Make it singleton!
		}
	}

	public void setDebugInfo(String file, int row, int col) {
		this.file = file;
		this.row  = row;
		this.col  = col;
	}
	
	
	public void setGetterClosure(IClosure getterClosure) {
		this.getterClosure = getterClosure;
	}
	
	/**
	 * Given something like:
	 * <pre>
	 * 		kindOf(class2class), p(s, value)
	 * </pre>
	 * 
	 * and an object o that goes into the queue, it is checked that:
	 *   * o is of type class2class
	 *   * o has a property called s (redundant, but worth it)
	 *   * o.s == value
	 * 
	 */
	@Override
	public boolean satisfiedBy(Object o) {
		Object r = satisfaction.satisfiedBy(o);
		return checkSatisfactionResult(r);
	}

	@Override
	public boolean satisfiedByOptimized(AccessDataByFeature accessData) {
		Object r = satisfaction.satisfiedByOptimized(accessData);
		return checkSatisfactionResult(r);
	}	

	protected boolean checkSatisfactionResult(Object r) {
		if ( r == null ) return false;
		lastResult = r;
		
		if ( getterClosure != null ) {
			if ( lastResult instanceof ImmutableList ) 
				lastResult = ((ImmutableList) lastResult).map(getterClosure);
			else {
				lastResult = getterClosure.call__(lastResult);
			}
		}
		
		return true;	
	}

	@Override
	public void indexRequest(AccessDataByFeature accessData) {
		if ( accessData.getFeatureName().equals(this.featureName) ) {
			accessData.indexRequest(value, this);
		}
	}

	public Object satisfyingValue() {
		return lastResult;
	}
	
	private Object lastResult = null;
	
	@Override
	public void resume() {
		resumeWith(lastResult);
	}
	
	public void resumeWith(Object o) {
		// System.out.println("RequestKindProperty[" + this + "] - Resuming " + o + " with " + continuation);
		Continuation c = Continuation.continueWith(continuation, o);
		if ( c != null ) {
			WaitValue v = ((WaitValue) c.value());
			v.registerContinuation(c);
		}		
		// TODO: This is not finished yet!!
		// if it returns null, the execution has finished
		// if not, it returns the suspended continuation (I guess the same as with
		//         startWith (in RuntimeUtil) must be done
		// System.out.println("RequestKindProperty - Finished resuming " + result);
	}

	@Override
	public void setContinuation(Continuation c) {
		this.continuation = c;		
	}

	@Override
	public String toInfo() {
		return satisfaction.toInfo();
	}
	
	public abstract class Satisfaction {
		public abstract Object satisfiedBy(Object o);	
		public abstract String toInfo();
		public abstract Object satisfiedByOptimized(AccessDataByFeature accessData);
		
		public boolean satisfiedByOne(Object expectedValue, Object o) {
			IModel model = null;
			if ( type != null ) {
				model = type.getModel();
				// Removed to improve efficiency... I think it is not actually needed
				//if ( ! type.ofKindIs(o) ) 
				//	return false;
			} else {
				model = getModelDynamically(o);
			}
		
			// This takes almost a second in the 10.000 migration
			if ( ! model.hasFeature(o, featureName) ) {
				return false;	
			}

			Object fv = model.getFeature(o, featureName);
			return compare(fv, expectedValue);			
		}

		private final boolean check(Object fv, Object expectedValue) {
			return ! ( fv == null || fv.hashCode() != expectedHashCode );
		}
		
		private final boolean compare(Object fv, Object expectedValue) {
			// return check(fv, expectedValue) && fv.equals(expectedValue);
			
			boolean equality = fv != null && fv.equals(expectedValue);							
			if ( equality == false && check(fv, expectedValue) == true ) {
				System.err.println("WARNING: In RequestKindProperty. Check based on hash code is disabled but it seems to be necessary...");
			}
			return equality;
		}		
	}
	
	
	private final IModel getModelDynamically(Object o) {
		try {
			return modelManager.getNamespace(o);
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		}		
	}
	
	public class MonovaluedSatisfaction extends Satisfaction {
		public Object satisfiedBy(Object o) {
			if ( satisfiedByOne(value, o) ) return o; else return null;
		}

		@Override
		public Object satisfiedByOptimized(AccessDataByFeature accessData) {
			Object expectedValue = accessData.get(value);
			if ( expectedValue != null ) 
				//return expectedValue;
				return satisfiedBy(expectedValue); 
				// This is a re-check. Probably no needed in all cases. 
				// TODO: Observe if it always return true.
			return null;
		}

		@Override
		public String toInfo() {
			String result = "match [" + featureName + " = " + value + "]" + "\n\t  at " + file + " " + row + ":" + col; 
			return result;
		}
	}
	
	public class MultivaluedSatisfaction extends Satisfaction  {
		private int numResolved;
		private ImmutableList list;
		private ArrayList<Object> resolvedList;
		public MultivaluedSatisfaction(ImmutableList l) {
			this.numResolved = 0;
			this.list = l;
			this.resolvedList = new ArrayList<Object>(l.size());
			for(int i = 0; i < l.size(); i++) resolvedList.add(null);
			// TODO: Make resolvedList and array and compare performance
		}

		public Object satisfiedBy(Object o) {
			for(int i = 0; i < list.size(); i++) {
				if ( resolvedList.get(i) == null ) {
					if ( satisfiedByOne( list.get(i), o) ) {
						resolvedList.set(i, o);
						numResolved++;
						break;
					}
				}
			}
			if ( numResolved == list.size() ) {				
				return ImmutableList.convertList(resolvedList);
			}
			return null;
		}

		@Override
		public Object satisfiedByOptimized(AccessDataByFeature accessData) {
			// Copied from above!
			for(int i = 0; i < list.size(); i++) {
				if ( resolvedList.get(i) == null ) {
					Object expectedValue = accessData.get(list.get(i));
					if ( expectedValue != null && satisfiedByOne( list.get(i), expectedValue) ) {
						resolvedList.set(i, expectedValue);
						numResolved++;
				
						// Cannot break, everything has to be checked in case it is in the data access
						// break;
					}
				}
			}
			if ( numResolved == list.size() ) {				
				return ImmutableList.convertList(resolvedList);
			}
			return null;
		}

		@Override
		public String toInfo() {
			String result = "match [" + featureName + " has pending in collection ]" + "\n\t  at " + file + " " + row + ":" + col; 

			for(int i = 0; i < list.size(); i++) {
				if ( resolvedList.get(i) == null ) {
					result += "\n\t   - " + list.get(i);
				}
			}
		
			return result;

		}
	
	}


		
}
