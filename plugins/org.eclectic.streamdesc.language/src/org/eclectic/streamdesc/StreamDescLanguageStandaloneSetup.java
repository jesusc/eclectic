
package org.eclectic.streamdesc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StreamDescLanguageStandaloneSetup extends StreamDescLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new StreamDescLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

