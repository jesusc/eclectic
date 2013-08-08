package org.eclectic.frontend;

import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class AttributionParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new AttributionParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public AttributionTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new AttributionStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (AttributionTransformation) resource.getContents().get(0);
	}

}
