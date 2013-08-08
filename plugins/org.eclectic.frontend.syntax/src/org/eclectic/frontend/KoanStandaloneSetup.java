
package org.eclectic.frontend;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.koan.KoanPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KoanStandaloneSetup extends KoanStandaloneSetupGenerated{

	public static void doSetup() {
		new KoanStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, KoanPackage.eINSTANCE);		
	}
}

