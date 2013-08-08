package org.eclectic.idc.jvm.runtime;

public class IdcException extends RuntimeException {
	private static final long serialVersionUID = -6767999796310433663L;

	public IdcException(Throwable e) {
		super(e);
	}

	public IdcException(String msg) {
		super(msg);
	}

	public static class NoModelFound extends IdcException {
		private static final long serialVersionUID = 8544200811853607302L;

		public NoModelFound(String msg) {
			super(msg);
		}	
	}
}
