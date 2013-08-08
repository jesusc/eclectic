package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.jvm.runtime.RuntimeModel.BigIntegerWrapper;
import org.eclectic.idc.jvm.runtime.RuntimeModel.NilObject;
import org.eclectic.idc.jvm.runtime.RuntimeModel.StringWrapper;

public class RuntimeUtil {
	
	public static int convertInt(Object o) {
		return ((Integer) o).intValue();
	}
	
	
	/*
	public static void startSegment(String segmentClassName, IdcTransformationBase transformation, ModelManager modelManager) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, SecurityException, NoSuchFieldException {
		Class<?> k = ContinuationClassLoader.getInstance().loadClass(segmentClassName);
		// Class<?> k     = Class.forName(segmentClassName);
		Runnable r     = (Runnable) k.newInstance();
		k.getField("transformation_").set(r, transformation);
		k.getField("modelManager_").set(r, modelManager);
		
		System.out.println("RuntimeUtil - Starting " + segmentClassName);
		Continuation c = Continuation.startWith(r);
		if ( c != null ) {
			System.out.println("RuntimeUtil - Stored " + segmentClassName);
			// ((HistoryQueue.WaitValue) c.value()).registerContinuation(c);
			try {
				c.value().getClass().getMethod("registerContinuation", Continuation.class).invoke(c.value(), c);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Finished segment " + segmentClassName);
		}
	}
	*/

	
	// Always return null. Before getReflectiveMethod was called, but it took too long just to 
	// check methods that are not going to be called (because ContinuationResolverHelper) "inlines" the call... 
	public static Method getReflectiveMethod_Dummy(Object receptor, String methodName, Object[] params) {
		return null;
	}
	
	private static HashMap<Class<?>, HashMap<String, Method>> libraryMethods = new HashMap<Class<?>, HashMap<String, Method>>();
	static {
		computeLibraryMethods(ImmutableList.class, false);
		computeLibraryMethods(BooleanWrapper.class, true);		
		computeLibraryMethods(StringWrapper.class, true);		
		computeLibraryMethods(BasicMethodWrapper.class, true);		
		computeLibraryMethods(BigIntegerWrapper.class, true);		
		computeLibraryMethods(NilObject.class, true);		


	}
	
	private static void computeLibraryMethods(Class<?> clazz, boolean all) {
		HashMap<String, Method> methodMap = new HashMap<String, Method>();
		Method[] methods = clazz.getDeclaredMethods();
		if ( all )
			methods = clazz.getMethods();
		for(int i = 0; i < methods.length; i++) {
			methodMap.put(methods[i].getName(), methods[i]);
		}
		
		libraryMethods.put(clazz, methodMap);
	}
	
	public static Method getReflectiveMethod(Object receptor, String methodName, Object[] params) {
		Method method    = null;

		HashMap<String, Method> lm = libraryMethods.get(receptor.getClass());
		if ( lm != null ) {
			method = lm.get(methodName);
		} 
		
		if ( method == null ) {
			Method[] methods = receptor.getClass().getMethods();
			for (int i = 0; i < methods.length; i++) {
				if ( methods[i].getName().equals(methodName) ) {
					method = methods[i];
					break;
				}			
			}
			// System.out.println("looking up " +  receptor.getClass() + "for" + methodName );
		}

		String typeNames = "...";
		/*
		Class<?>[] parameterTypes = new Class<?>[params.length];		
		for(int i = 0; i < params.length; i++) {
			parameterTypes[i] = params[i].getClass();
			typeNames = typeNames + ", " + parameterTypes[i].getName();
		}
		
		Method method;
		try {
			method = receptor.getClass().getMethod(methodName, parameterTypes);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			method = null;
		}
		*/
		
		if ( method == null && receptor instanceof DynamicMethodFinder ) {
			method = ((DynamicMethodFinder) receptor).findMethod(methodName); 
		}

		if ( method == null ) throw new IdcException("No method '" + methodName + "' for object " + receptor + ". Class" + receptor.getClass().getName() + " params" + typeNames);
		
		return method;
	}
}

