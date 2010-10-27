package org.eclipse.ese;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class AndroidStandaloneSetup extends AndroidStandaloneSetupGenerated {

	public static void doSetup() {
		new AndroidStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
