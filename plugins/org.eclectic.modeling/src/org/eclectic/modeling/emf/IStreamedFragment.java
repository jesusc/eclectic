package org.eclectic.modeling.emf;

public interface IStreamedFragment<OBJECT, ANNOTATION> {
	public OBJECT createObject(String metaclassName);
	public OBJECT createProxyObject(String metaclassName, OBJECT receptor, String featureName);
	
	public OBJECT[] getObjects();
	public OBJECT[] getProxyObjects();
	public ANNOTATION[] getAnnotations();
	public ANNOTATION[] getProxyAnnotations();
}
