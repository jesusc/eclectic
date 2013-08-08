package org.eclectic.idc.jvm.runtime.facilities;

import org.eclectic.idc.jvm.runtime.QoolTransformationBase;

public class BuiltinFacilities {
	private QoolTransformationBase transformation;

	public BuiltinFacilities(QoolTransformationBase transformation) {
		this.transformation = transformation;
	}
	
	public IdcCopier createCopier(String modelName) {
		return new IdcCopier(transformation.getModelManager().getNamespace(modelName));
	}
}
