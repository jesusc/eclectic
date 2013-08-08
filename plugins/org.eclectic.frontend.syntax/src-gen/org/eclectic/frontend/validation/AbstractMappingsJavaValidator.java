package org.eclectic.frontend.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractMappingsJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/mappingL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/core"));
		return result;
	}

}
