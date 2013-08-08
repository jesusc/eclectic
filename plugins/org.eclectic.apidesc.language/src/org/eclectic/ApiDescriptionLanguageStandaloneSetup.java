
package org.eclectic;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ApiDescriptionLanguageStandaloneSetup extends ApiDescriptionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ApiDescriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

