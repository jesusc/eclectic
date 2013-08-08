package org.eclectic.idc.jvm.runtime;

public class IdcExceptionBlockingMatchNotResolved extends RuntimeException {
	private static final long serialVersionUID = -6767999796310433663L;
	private QoolTransformationBase transformation;

	public IdcExceptionBlockingMatchNotResolved(Throwable e) {
		super(e);
	}

	public IdcExceptionBlockingMatchNotResolved(QoolTransformationBase t, String msg) {
		super(msg);
		this.transformation = t;
	}
	
	public QoolTransformationBase getTransformation() {
		return transformation;
	}

}
