
package org.eclectic.frontend;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.qool.QoolPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MappingsStandaloneSetup extends MappingsStandaloneSetupGenerated{

	public static void doSetup() {
		new MappingsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, MappingsPackage.eINSTANCE);		
	}		

}

