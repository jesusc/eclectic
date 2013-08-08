
package org.eclectic.frontend;

import org.eclectic.frontend.chain.ChainPackage;
import org.eclectic.frontend.core.CorePackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ChainStandaloneSetup extends ChainStandaloneSetupGenerated{

	public static void doSetup() {
		new ChainStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, ChainPackage.eINSTANCE);		
	}	
}

