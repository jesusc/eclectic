package org.eclectic.frontend;


import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class QoolParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new QoolParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public QoolTransformation read(String fileToBeParsed) throws Exception {
		// Injector injector = new QoolStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		Injector injector = Guice.createInjector(new org.eclectic.frontend.QoolRuntimeModule());

		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (QoolTransformation) resource.getContents().get(0);
	}

}
