package org.eclectic.frontend.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclectic.frontend.syntax.validation.ExpressionsJavaValidator;

public class AbstractScriptJavaValidator extends ExpressionsJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/scriptL"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://eclectic.org/frontend/core"));
		return result;
	}

}
