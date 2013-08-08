package org.eclectic.idc.core.jvmgen;

import org.eclectic.idc.core.impl.ModelDefinitionImpl;


public class ModelDefinitionJVMGen extends ModelDefinitionImpl {
	
	public boolean isStreamingModel() {
		return this.getMetamodel() != null && 
				this.getMetamodel().getPath().endsWith("streamdesc");
	}
	
}
