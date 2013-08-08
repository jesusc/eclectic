package org.eclectic.frontend;


import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.script.ScriptedTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class MappingsParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new MappingsParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public MappingTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new MappingsStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (MappingTransformation) resource.getContents().get(0);
	}

}
