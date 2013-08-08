package org.eclectic.frontend.capi;

import java.util.List;

import modelum.eclectic.ExecScalaInterpreter;
import modelum.eclectic.ExecScalaInterpreter.Result;
import modelum.eclectic.runtime_scala.ModelBinding;

import org.eclipse.emf.ecore.resource.Resource;

public class IDCExecutor {

	private Resource resource;

	public IDCExecutor(Resource resource) {
		this.resource = resource;
	}

	public void execute(List<ModelBinding> models) throws Exception {
		ExecScalaInterpreter exec = new ExecScalaInterpreter();
		Result r = exec.compile(resource);
		r.execute(ExecScalaInterpreter.CONTINUATIONS, models);			
	}
	
	public static ModelBinding newModel(Resource metamodel, Resource model) {
		ModelBinding m = modelum.eclectic.runtime_scala.Runtime_scalaFactory.eINSTANCE.createModelBinding();
		m.setInMemory(true);
		m.setMetamodels(metamodel);
		m.setModels(model);
		return m;
	}
	
	public static ModelBinding newModel(String metamodel, String model) {
		ModelBinding m = modelum.eclectic.runtime_scala.Runtime_scalaFactory.eINSTANCE.createModelBinding();		
		m.getMetamodelURIs().add(metamodel);
		m.getModelURIs().add(model);
		return m;
	}
		
}
