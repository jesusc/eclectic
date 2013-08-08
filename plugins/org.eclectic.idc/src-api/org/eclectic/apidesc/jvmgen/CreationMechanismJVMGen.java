package org.eclectic.apidesc.jvmgen;

import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Set;
import org.eclipse.emf.common.util.EList;

public interface CreationMechanismJVMGen {
	public boolean hasConstructorDependencies();

	public boolean dependsOn(FeatureMapping featureMapping);

	public VariableParameter[] sortConstructorVariablesParameters(EList<Set> constructorParameters);

    public static class VariableParameter {
    	public Variable var;
    	public FeatureMapping featureMapping;
    	public int paramIdx;
    	public VariableParameter(Variable var, FeatureMapping featureMapping, int paramIdx) {
    		this.var = var;
    		this.featureMapping = featureMapping;
    		this.paramIdx = paramIdx;
    	}
    }
}
