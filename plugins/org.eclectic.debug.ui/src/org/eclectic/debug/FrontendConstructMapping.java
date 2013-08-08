package org.eclectic.debug;

import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclipse.emf.ecore.EObject;

/**
 * Establish the mapping between Frontend constructs and IDC
 * constructs.
 * 
 * TODO: It should be in another plugin, but this makes my life easier...
 * 
 * @author Jesus Sanchez Cuadrado
 * 
 */
public class FrontendConstructMapping {	
	private IdcConstructMapping mapping;

	public FrontendConstructMapping(IdcConstructMapping mapping) {
		this.mapping = mapping;
	}
	
	public String javaType(EObject obj) {
		if ( obj instanceof ScriptedTransformation ) {
			ScriptedTransformation t = (ScriptedTransformation) obj;
			// It should be t.getName()
			// return mapping.fromNormalFunction( "code" );
			System.out.println("Debugger mapping: " + t.getName());
			return t.getName(); // TODO: Get this from IDC!!
		} else if ( obj instanceof MappingTransformation ) {
			MappingTransformation t = (MappingTransformation) obj;
			return "eclectic." + t.getName();
		}
		EObject container = obj.eContainer();
		if ( container != null ) 
			return javaType(container);
		return "<unknown>";
	}
	
	public static FrontendConstructMapping getIdcMapping() {
		return new FrontendConstructMapping(new IdcConstructMapping());
	}
}
