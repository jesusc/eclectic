package org.eclectic.idc.core.jvmgen;

import org.eclectic.idc.core.MethodDefinition;
import org.eclectic.idc.core.MethodLibrary;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.NormalFunction;
import org.eclectic.idc.core.impl.CoreFactoryImpl;

public class CoreFactoryJVMGen extends CoreFactoryImpl {

	@Override
	public NormalFunction createNormalFunction() {
		return new NormalFunctionJVMGen();
	}
	
	@Override
	public MethodLibrary createMethodLibrary() {
		return new MethodLibraryJVMGen();
	}
	
	@Override
	public MethodDefinition createMethodDefinition() {
		return new MethodDefinitionJVMGen();
	}
	
	@Override
	public ModelDefinition createModelDefinition() {
		return new ModelDefinitionJVMGen();
	}
}
