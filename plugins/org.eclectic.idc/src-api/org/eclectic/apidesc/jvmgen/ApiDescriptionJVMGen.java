package org.eclectic.apidesc.jvmgen;

import org.eclectic.apidesc.AttributeMapping;
import org.eclectic.apidesc.ClassMapping;
import org.eclectic.apidesc.CreationMechanism;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.SetMechanism;
import org.eclectic.apidesc.SimpleClassMapping;
import org.eclectic.apidesc.SimpleReferenceMapping;
import org.eclectic.apidesc.impl.ApiDescriptionImpl;
import org.eclectic.idc.IMetamodelDescription;
import org.eclectic.idc.instr.Create;
import org.eclipse.emf.common.util.EList;

public class ApiDescriptionJVMGen extends ApiDescriptionImpl implements IMetamodelDescription {
	
	/**
	 * Returns the creation mechanism that should be used for a given create
	 * instruction.
	 * 
	 * @param c Create instruction 
	 */
	public CreationMechanism getCreationMechanism(Create c) {
		return getMapping(c.getClassName()).getCreation();
	}


	
	public String getJavaClass(String metaclassName) {
		return getMapping(metaclassName).getCanonicalClassName();
	}

	public SetMechanism getSetter(String className, String featureName) {
		SimpleClassMapping m = getMapping(className);
		EList<FeatureMapping> featureMappings = m.getFeatureMappings();
		for (FeatureMapping featureMapping : featureMappings) {
			if ( featureMapping.getFeatureName().equals(featureName) ) {
				return featureMapping.getSetMethod();
			}
		}
		throw new IllegalArgumentException("Not mapping in the API description for " + className + "." + featureName);
	}
	
	public SimpleClassMapping getMapping(String metaclassName) {
		EList<ClassMapping> mappings = this.getClassMappings();
		for (ClassMapping classMapping : mappings) {
			if ( classMapping instanceof SimpleClassMapping ) {
				if ( ((SimpleClassMapping) classMapping).getMetaclassName().equals(metaclassName) ) 
					return ((SimpleClassMapping) classMapping);
			}
		}
		throw new IllegalArgumentException("No mapping in the API description for metaclass: " + metaclassName);
	}

	
	public ClassMapping fromClass(Class<?> clazz) {
		EList<ClassMapping> mappings = this.getClassMappings();
		// TODO: Do this well: Now. 1) exact mapping, 2) find one compatible (any order...)
		for (ClassMapping classMapping : mappings) {
			if ( classMapping instanceof SimpleClassMapping ) {
				SimpleClassMapping sc = (SimpleClassMapping) classMapping;
				if ( sc.getCanonicalClassName().equals(clazz.getCanonicalName()) ) {
					return sc;
				}
			}
		}		
		
		for (ClassMapping classMapping : mappings) {
			if ( classMapping instanceof SimpleClassMapping ) {
				
				if ( isMappingCompatible(classMapping, clazz) ) 
					return ((SimpleClassMapping) classMapping);
			}
		}
		throw new IllegalArgumentException("No mapping in the API description for Java class: " + clazz);		
	}


	private boolean isMappingCompatible(ClassMapping classMapping, Class<?> clazz) {
		SimpleClassMapping sc = (SimpleClassMapping) classMapping;
		if ( sc.getCanonicalClassName().equals(clazz.getCanonicalName()) ) {
			return true;
		}
		
		Class<?> superclass = clazz.getSuperclass();
		if ( superclass != null && isMappingCompatible(classMapping, superclass) ) 
			return true;
		
		Class<?>[] interfaces = clazz.getInterfaces();
		for (Class<?> iClazz : interfaces) {
			if ( isMappingCompatible(classMapping, iClazz) ) 
				return true;
		}
		
		return false;
	}

	// --------------------------------------------
	// "JVMGen versions" of some of the methods 
	// --------------------------------------------
	
	public SimpleClassMappingJVMGen getMappingJVMGen(String metaclassName) {
		return (SimpleClassMappingJVMGen) getMapping(metaclassName);
	}
	
	public CreationMechanismJVMGen getCreationMechanismJVMGen(Create c) {
		return (CreationMechanismJVMGen) getCreationMechanism(c);
	}

	// --------------------------------------------
	// Metamodel description methods
	// --------------------------------------------

	@Override
	public String getFeatureType(String typeName, String featureName) {
		SimpleClassMappingJVMGen mapping = (SimpleClassMappingJVMGen) getMapping(typeName);
		FeatureMapping fmapping = mapping.getFeatureMapping(featureName);
		if ( fmapping instanceof AttributeMapping ) {
			return ((AttributeMapping) fmapping).getType();
		} else {
			return ((SimpleClassMapping) ((SimpleReferenceMapping) fmapping).getType()).getMetaclassName();
		}
	}



	@Override
	public boolean isFeatureMultivalued(String typeName, String featureName) {
		SimpleClassMappingJVMGen mapping = (SimpleClassMappingJVMGen) getMapping(typeName);
		FeatureMapping fmapping = mapping.getFeatureMapping(featureName);
		return fmapping.isIsMultivalued();
	}
		
}
