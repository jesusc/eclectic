package org.eclectic.api;

import java.io.IOException;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.jvmgen.ApidescFactoryJVMGen;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ApiLoader {

	private JavaListConverter listConverter;

	public ApiLoader(JavaListConverter listConverter) {
		this.listConverter = listConverter;
	}

	public ApiModel emptyModelFromFile(String path) {
		return new ApiModel(loadApiDescriptionFromXMI(path), listConverter);
	}

	public ApiModel emptyModelFromDescription(ApiDescription desc) {
		return new ApiModel(desc, listConverter);
	}

	/**
	 * Creates a new model from a given root element. All objects (whose class is
	 * described in the ApiDescription given) reachable from the root object are part
	 * of the model.
	 * 
	 * @param root
	 * @param apiDescriptionPath
	 * @return
	 */
	public ApiModel modelFromRoot(Object root, String apiDescriptionPath) {
		return new ApiModel(root, loadApiDescriptionFromXMI(apiDescriptionPath), listConverter);
	}

	public ApiDescription loadApiDescriptionFromXMI(String path) {
		ResourceSet rs = new ResourceSetImpl();

		// This is to make it work in Eclipse, when launching from a .java
		rs.getPackageRegistry().put(ApidescPackage.eINSTANCE.getNsURI(), ApidescPackage.eINSTANCE);
		ApidescPackage.eINSTANCE.setEFactoryInstance(new ApidescFactoryJVMGen());

		Resource resource = rs.getResource(Util.createURI(path), true);
		return (ApiDescription) resource.getContents().get(0);
	}

	public ApiModel modelFromRoot(Object root, String path, MetamodelManager.MetamodelLoader loader) throws IOException {
		return new ApiModel(root, (ApiDescription) loader.load(path), listConverter);
	}

}
