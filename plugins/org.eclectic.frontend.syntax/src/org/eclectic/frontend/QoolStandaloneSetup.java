
package org.eclectic.frontend;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.script.ScriptPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QoolStandaloneSetup extends QoolStandaloneSetupGenerated{

	public static void doSetup() {
		new QoolStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);
		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE, QoolPackage.eINSTANCE);		
	}		
}
