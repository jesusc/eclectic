package org.eclectic.idc;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.jvm.gen.ApiModelStrategy;
import org.eclectic.idc.rewrite.ReorderConstructorDependencies;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/** 
 * Executes pre-processing steps that can be configured or that
 * are forced to make IDC work properly in certain environments.
 * 
 * Current pre-preprocessing steps are:
 * <ul>
 * <li>Re-ordering for JVM classes creation (executed if ApiDescription is provided for a model)</li>
 * <li>TODO: Implement assignment removal (although at the JVM level variables should be avoided as well)</li>
 * <ul>
 * 
 * @author jesus
 *
 */
public class IdcPreprocessor {

	private Resource resource;
	private MetamodelManager metamodelManager;
	
	public IdcPreprocessor(Resource resource, MetamodelManager metamodelManager) {
		this.resource = resource;
		this.metamodelManager = metamodelManager;
	}

	public Resource apply() {
		reorder();
		return resource;
	}

	private void reorder() {
		EList<EObject> contents = resource.getContents();
		for (EObject o : contents) {
			if ( o instanceof CodeUnit ) {
				CodeUnit u = (CodeUnit) o;
				for (ModelDefinition modelDefinition : u.getModels()) {
					if ( modelDefinition.getMetamodel() != null ) {
						Object description = metamodelManager.getDescription(modelDefinition.getMetamodel().getPath());
						if ( description instanceof ApiDescription ) {
							new ReorderConstructorDependencies(u, modelDefinition, (ApiDescription) description).execute();
						}						
					}
				}
			}
		}
	}
	
	

}
