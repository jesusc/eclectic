package org.eclectic.frontend;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

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

public abstract class AbstractParserUtil {
	

    public XtextResource parseFile(String filename, Injector injector) throws Exception {
    	return parseFile(filename, new FileInputStream(filename), injector);
    }
    
    public XtextResource parseFile(String filename, InputStream stream, Injector injector) throws Exception {
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        // URI uri = URI.createFileURI(f); // uri of your resource, may be fictional

        String f = filename;
        if ( stream == null ) {
        	// TODO: Remove sometime
        	if ( f.contains("jar!") ) {
	        	f = f.replace("file:", "jar:");
	        }
        }

        // System.out.println("---> " + f);
        URI uri = URI.createURI(f);
        
        // long start = System.currentTimeMillis();
        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        rs.getResources().add(resource);
        // long end = System.currentTimeMillis();
        // String times = f + " Parse: " + (end - start) + "ms";
        
        // we are sure f exists, as we read the path automatically
        InputStream fis = null;
        if ( stream == null ) {
	        if ( f.contains("jar:") ) {
	        	int idx = f.lastIndexOf(".jar!");
	        	f = f.substring(idx + 5);        	
	            fis = getClass().getResourceAsStream(f);
	            // System.out.println(f + " : " + fis);
	        } else {
	        	fis = new FileInputStream(new File(f));
	        }
        } else {
        	fis = stream;
        }
        
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

	public abstract EObject read(String fileToBeParsed) throws Exception;
	
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
