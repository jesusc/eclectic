/*
 * generated by Xtext
 */
package org.eclectic.frontend;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AttributionRuntimeModule extends org.eclectic.frontend.AbstractAttributionRuntimeModule {
	/**
	 * Redefined to return a new type of parser which is able of tracking line numbers
	 * and nodes.
	 */
	@Override 
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {		
		return org.eclectic.frontend.AttributionParserTrackingLines.class;
	}
	
}
