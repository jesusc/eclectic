package test.api;

import java.io.FileInputStream;
import java.io.InputStream;

import org.eclectic.ApiDescriptionLanguageStandaloneSetup;
import org.eclectic.apidesc.ApiDescription;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class ParseApiDesc {
    public XtextResource parseFile(String filename, Injector injector) throws Exception {
    	return parseFile(filename, new FileInputStream(filename), injector);
    }
    
    public XtextResource parseFile(String filename, InputStream fis, Injector injector) throws Exception {
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        // URI uri = URI.createFileURI(f); // uri of your resource, may be fictional

        URI uri = URI.createURI(filename);
        
        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);
        
        resource.load(fis, null);
        EcoreUtil.resolveAll(resource);

        return resource;
    }	

	public void readAndSave(String fileToBeParsed, String targetModelPath) throws Exception {
		EObject root = read(fileToBeParsed);
    	ResourceSetImpl rs = new ResourceSetImpl();
    	XMIResourceImpl xmi = (XMIResourceImpl) rs.createResource(URI.createFileURI(targetModelPath));    	

    	xmi.getContents().add(root);
    	xmi.save(null);    			
	}

	public ApiDescription read(String fileToBeParsed) throws Exception {
		Injector injector = new ApiDescriptionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();   	
		// Injector injector = Guice.createInjector(new org.eclectic.frontend.QoolRuntimeModule());

		XtextResource resource = parseFile(fileToBeParsed, injector);
    	showErrors(resource);
    	return (ApiDescription) resource.getContents().get(0);
	}
	
    public void showErrors(XtextResource resource) {
    	String error = "";
        if (! resource.getErrors().isEmpty()) {
            error += "### Parse: \n";
            for (Diagnostic d : resource.getErrors()) {
                error += d.getMessage() + " in " + d.getLine()  + "\n";
                
            }
        }
        if ( error.length() == 0 ) {
        	System.out.println("Ok : " + resource.getContents());
        } else {
        	System.out.println(error);
        }
        
    }	    

}
