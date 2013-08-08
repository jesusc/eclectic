package org.eclectic.apidesc.jvmgen;

import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.impl.SimpleClassMappingImpl;
import org.eclipse.emf.common.util.EList;

public class SimpleClassMappingJVMGen extends SimpleClassMappingImpl {

	public FeatureMapping getFeatureMapping(String name) {
		EList<FeatureMapping> features = getFeatureMappings();
		for (FeatureMapping featureMapping : features) {
			if ( featureMapping.getFeatureName().equals(name) )
				return featureMapping;
		}
		throw new FeatureNotFound("Not found " + name);
	}
	
	@SuppressWarnings("serial")
	public static class FeatureNotFound extends RuntimeException {
		public FeatureNotFound(String f) {
			super(f);
		}
	}


	public CreationMechanismJVMGen getCreationJVMGen() {
		return (CreationMechanismJVMGen) getCreation();
	}

}
