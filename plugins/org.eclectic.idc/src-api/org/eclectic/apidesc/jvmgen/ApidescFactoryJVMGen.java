package org.eclectic.apidesc.jvmgen;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.Constructor;
import org.eclectic.apidesc.SimpleClassMapping;
import org.eclectic.apidesc.impl.ApidescFactoryImpl;

public class ApidescFactoryJVMGen extends ApidescFactoryImpl {

	@Override
	public ApiDescription createApiDescription() {
		return new ApiDescriptionJVMGen();
	}
	
	@Override
	public SimpleClassMapping createSimpleClassMapping() {
		return new SimpleClassMappingJVMGen();
	}

	@Override
	public Constructor createConstructor() {
		return new ConstructorJVMGen();
	}


}
