package org.eclectic.idc;

import java.io.IOException;
import java.util.HashMap;

import org.eclectic.api.ApiLoader;
import org.eclectic.idc.jvm.runtime.IdcException;


/**
 * Class intended to retrieve descriptions of metamodels.
 * TODO: This can probably be improved a lot.
 * @author jesus
 *
 */
public class MetamodelManager {
	private HashMap<String, Object> loaded = new HashMap<String, Object>();
	private java.util.LinkedList<MetamodelLoader> loaders = new java.util.LinkedList<MetamodelLoader>();
	
	public Object getDescription(String name) {
		if ( loaded.containsKey(name) ) 
			return loaded.get(name);
		
		if ( name.endsWith("apidesc.xmi") ) {			
			loaded.put(name, new ApiLoader(null).loadApiDescriptionFromXMI(name));
			return loaded.get(name);
		} else {
			for (MetamodelLoader loader : loaders) {
				if ( loader.supports(name) ) {
					try {
						loaded.put(name, loader.load(name));
					} catch (IOException e) {
						throw new IdcException(e);
					}				
					return loaded.get(name);
				}
			}
		}
		throw new IllegalArgumentException("Not supported: " + name);
	}
	
	public MetamodelManager addMetamodelLoader(MetamodelLoader loader) {
		this.loaders.add(loader);
		return this;
	}

	public interface MetamodelLoader {
		public Object load(String path) throws IOException;
		public boolean supports(String suffix);
	}
}
