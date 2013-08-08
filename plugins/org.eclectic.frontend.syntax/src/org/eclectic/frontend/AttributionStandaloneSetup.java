
package org.eclectic.frontend;

import org.eclectic.frontend.attribution.AttributionPackage;
import org.eclectic.frontend.core.CorePackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AttributionStandaloneSetup extends AttributionStandaloneSetupGenerated{

	public static void doSetup() {
		new AttributionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, AttributionPackage.eINSTANCE);		
	}		
}

