package org.eclectic.frontend;

import org.eclectic.frontend.chain.ChainTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class ChainParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new ChainParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public ChainTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new ChainStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (ChainTransformation) resource.getContents().get(0);
	}

}
