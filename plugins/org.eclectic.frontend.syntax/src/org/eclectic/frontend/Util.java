package org.eclectic.frontend;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

public class Util {

	public static void register(EPackage... pkgs) {
		for(int i = 0; i < pkgs.length; i++) {
	        if (!EPackage.Registry.INSTANCE.containsKey( pkgs[i].getNsURI() )) {
	            EPackage.Registry.INSTANCE.put(pkgs[i].getNsURI(), pkgs[i]);
	        }
		}		
		
	}
	
	public static void register(Registry registry, EPackage... pkgs) {
		for(int i = 0; i < pkgs.length; i++) {
	        if (! registry.containsKey( pkgs[i].getNsURI() )) {
	        	registry.put(pkgs[i].getNsURI(), pkgs[i]);
	        }
		}		
	}
}
