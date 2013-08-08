package org.eclectic.frontend;


import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class ScriptParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new ScriptParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public ScriptedTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new ScriptStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (ScriptedTransformation) resource.getContents().get(0);
	}

}
