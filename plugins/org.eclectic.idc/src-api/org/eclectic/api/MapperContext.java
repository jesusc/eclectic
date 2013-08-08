package org.eclectic.api;

public class MapperContext {
	private ApiModel model;

	public MapperContext(ApiModel model) {
		this.model = model;
	}
	
	public ApiModel getModel() {
		return model;
	}
}
