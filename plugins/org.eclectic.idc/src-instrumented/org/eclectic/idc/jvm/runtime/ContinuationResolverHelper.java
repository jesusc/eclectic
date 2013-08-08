package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.Type;
import org.apache.commons.javaflow.Continuation;
import org.eclectic.idc.datatypes.CallableN;
import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.modeling.emf.IStreamedModel;

/// I HAVE TRIED TO PUT ALL CONTINUATION RESUMING LOGIC HERE
/// TRYING TO INSTRUMENT ONLY THIS CLASS, BUT DOES NOT SEEM POSSIBLE
public class ContinuationResolverHelper {

	/*
	public static Object monoStatic(Object o) {
		return Continuation.suspend(o);
	}

	public Object mono(Object o) {
		return Continuation.suspend(o);
	}
	*/
	
	public static Object performCall(java.lang.reflect.Method method, Object receptor, Object[] args) {
		// System.out.println("===> " + receptor + "." + method.getName());
		if ( receptor instanceof RunnableClosure ) {
			RunnableClosure rc = ((RunnableClosure) receptor);
			rc.params.clear();
			for(int i = 0; i < args.length; i++) {
				rc.params.add( args[i] );
			}
			rc.run();
			return rc.result;
		}
		else if ( receptor.getClass().getName().equals("org.eclectic.idc.datatypes.ImmutableList") ) {
			if ( method.getName().equals("map") ) {
				return ((ImmutableList) receptor).map((CallableN) args[0]);
			}
			else if ( method.getName().equals("all") ) {
				return ((ImmutableList) receptor).all((CallableN) args[0]);
			}
			else if ( method.getName().equals("each") ) {
				((ImmutableList) receptor).each((CallableN) args[0]);
				return null;
			}			
			else if ( method.getName().equals("inject") ) {
				return ((ImmutableList) receptor).inject(args[0], (CallableN) args[1]);
			}						
		} else if ( receptor.getClass().getName().equals(BooleanWrapper.class.getName()) ) {
			if ( method.getName().equals("if_else") ) {
				return ((BooleanWrapper) receptor).if_else((RunnableClosure) args[0], (RunnableClosure) args[1]);
			}
			else if ( method.getName().equals("if_false") ) {
				return ((BooleanWrapper) receptor).if_false((RunnableClosure) args[0]);
			}
			else if ( method.getName().equals("if_true") ) {
				return ((BooleanWrapper) receptor).if_true((RunnableClosure) args[0]);
			}

		}
		
		try {
			return method.invoke(receptor, args);
		} catch (IllegalArgumentException e) {
			throw new IdcException(e);
		} catch (IllegalAccessException e) {
			throw new IdcException(e);
		} catch (InvocationTargetException e) {
			if ( e.getTargetException() instanceof IdcException ) throw (IdcException) e.getTargetException();
			throw new IdcException(e.getTargetException());
		}
		
	}

	public static Object requestStreamedAndWait( QoolTransformationBase qt, IStreamedModel<?, ?> model, Object proxyObj) {
		StreamedQueue q = qt.getStreamedQueue();
		Request r = new WaitStreamedObjectRequest(model, proxyObj);
		q.addRequest(r);
		
		Object o = Continuation.suspend(new WaitValue(q, r));		
		return o; 
	}

	public static Object requestAndWait(IHistoryQueue<?> queue, Request r) {
		
		Object satisfying = queue.findSatisfyingValue(r);
		if ( satisfying != null ) 
			return satisfying;
		
		/*
		LinkedList<?> objects = queue.getObjects();
		for(Object o : objects) {
			if ( r.satisfiedBy(o) ) {
				return r.satisfyingValue();
			}			
		}
		*/

		//queue.getRequests().add(r);		
		queue.addRequest(r);
		
		// System.out.println("Suspending " + queue);
		Object o = Continuation.suspend(new WaitValue(queue, r));		
		
		return o;		
	}
	
	/*
	@SuppressWarnings("unchecked")
	public final static Object dynamic(final String trace,
			final String feature, final Object source) {
		if (source instanceof List) {
			return multi(trace, feature, (List<Object>) source);
		} else {
			return mono(trace, feature, source);
		}
	}

	public final static Object multi(final String trace, final String feature,
			final List<Object> source) {
		final MyList<Object> solution = new MyList<Object>(source.size());
		for (Object eobj : source) {
			solution.add(mono(trace, feature, eobj));
		}
		return solution;
	}

	public final static Object mono(final String trace, final String feature,
			final Object source) {
		Object solution = AbstractSingleTrace.getInstance().search(trace,
				feature, source);
		if (solution == null) {
			return ContinuationFAKE
					.suspend(new TraceWaitFor(trace, feature, source));
		}
		return solution;
	}
	*/


}