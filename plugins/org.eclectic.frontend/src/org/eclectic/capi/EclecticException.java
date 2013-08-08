package org.eclectic.capi;

public class EclecticException extends Exception {

	private static final long serialVersionUID = 83549343536583181L;
	
	public EclecticException(Throwable e) {
		super(e);
	}

	public EclecticException(String msg) {
		super(msg);
	}
}
