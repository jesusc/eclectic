package org.eclectic.idc;

/**
 * This class represents a description of a meta-model that
 * this is accessed "statically" by the compiler.
 * 
 * @author jesus
 *
 */
public interface IMetamodelDescription {

	String getFeatureType(String typeName, String featureName);

	boolean isFeatureMultivalued(String typeName, String featureName);
	
}
