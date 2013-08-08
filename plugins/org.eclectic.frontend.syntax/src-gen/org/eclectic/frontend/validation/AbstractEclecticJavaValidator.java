package org.eclectic.frontend.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclectic.frontend.syntax.validation.ExpressionsJavaValidator;

public class AbstractEclecticJavaValidator extends ExpressionsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/core"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/mappingL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/patL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/imperativeL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/qoolL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/qoolL/facilities"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/taoL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/attributionL"));
		return result;
	}

}
