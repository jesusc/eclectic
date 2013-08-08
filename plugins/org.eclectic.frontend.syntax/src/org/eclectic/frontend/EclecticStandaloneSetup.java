
package org.eclectic.frontend;

import org.eclectic.frontend.attribution.AttributionPackage;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.koan.KoanPackage;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.patterns.PatternsPackage;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.tao.TaoPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EclecticStandaloneSetup extends EclecticStandaloneSetupGenerated{

	public static void doSetup() {
		new EclecticStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);

		Util.register(CorePackage.eINSTANCE, FrontendPackage.eINSTANCE,
				MappingsPackage.eINSTANCE,
				TaoPackage.eINSTANCE,
				AttributionPackage.eINSTANCE,
				PatternsPackage.eINSTANCE,
				QoolPackage.eINSTANCE
		);		
	}
}

