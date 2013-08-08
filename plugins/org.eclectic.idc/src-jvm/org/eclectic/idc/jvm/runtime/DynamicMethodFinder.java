package org.eclectic.idc.jvm.runtime;

import java.lang.reflect.Method;

public interface DynamicMethodFinder {

	Method findMethod(String methodName);

}
