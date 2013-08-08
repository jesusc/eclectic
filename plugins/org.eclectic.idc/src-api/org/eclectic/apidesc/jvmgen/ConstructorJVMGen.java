package org.eclectic.apidesc.jvmgen;

import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.impl.ConstructorImpl;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Set;
import org.eclipse.emf.common.util.EList;

public class ConstructorJVMGen extends ConstructorImpl implements CreationMechanismJVMGen {

	@Override
	public boolean hasConstructorDependencies() {
		return this.getParameters().size() > 0;
	}

	@Override
	public boolean dependsOn(FeatureMapping featureMapping) {
		return this.getParameters().contains(featureMapping);
	}

	private VariableParameter createVariableParameter(Set setIntr) {
		for(int i = 0; i < getParameters().size(); i++) {
			FeatureMapping fmapping = getParameters().get(i);
			if ( fmapping.getFeatureName().equals(setIntr.getFeatureName()) ) {
				return new VariableParameter(setIntr.getValue(), fmapping, i);
			}
		}
		throw new IllegalArgumentException(setIntr.getFeatureName() + " not found as parameter");
	}

	@Override
	public VariableParameter[] sortConstructorVariablesParameters(EList<Set> constructorParameters) {
		VariableParameter[] result = new VariableParameter[constructorParameters.size()];
		for(int i = 0; i < constructorParameters.size(); i++ ) {
			Set setInstr = constructorParameters.get(i);
			VariableParameter p = createVariableParameter(setInstr);
			result[p.paramIdx] = p;
		}
		return result;
	}
}
