package org.eclectic.frontend;

import org.eclectic.frontend.tao.TaoTransformation;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class TaoParseUtil extends AbstractParserUtil {

	public static void main(String[] args) throws Exception {
		String fileToBeParsed = args[0];
		String targetModelPath = args[1];
		
		new TaoParseUtil().readAndSave(fileToBeParsed, targetModelPath);
    }
    
	public TaoTransformation read(String fileToBeParsed) throws Exception {
		Injector injector = new TaoStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (TaoTransformation) resource.getContents().get(0);
	}

}
