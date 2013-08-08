package org.eclectic.frontend;


import org.eclectic.frontend.koan.KoanTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class KoanParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];

		new KoanParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }

	@Override
	public KoanTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new KoanStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (KoanTransformation) resource.getContents().get(0);
	}
	
}
