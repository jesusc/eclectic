
package org.eclectic.frontend;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.tao.TaoPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TaoStandaloneSetup extends TaoStandaloneSetupGenerated{

	public static void doSetup() {
		new TaoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, TaoPackage.eINSTANCE);		
	}	
}

