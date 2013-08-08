package org.eclectic.apidesc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclectic.ApiDescriptionLanguageRuntimeModule;
import org.eclectic.apidesc.jvmgen.ApidescFactoryJVMGen;
import org.eclectic.idc.MetamodelManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ApiDescriptionLanguageLoader implements MetamodelManager.MetamodelLoader {

	private Injector injector;

	public ApiDescriptionLanguageLoader(Injector injector) {
		this.injector = injector;
	}
	
	public ApiDescriptionLanguageLoader() {
		this(Guice.createInjector(new ApiDescriptionLanguageRuntimeModule()));
	}
	
	@Override
	public Object load(String path) throws IOException {
	    	String filename = path;
	    	//InputStream stream = new FileInputStream(filename);
	    	XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
	        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);

	        // This is to make it work when invoked from a new Eclipse instance and a regular Java program..
	        rs.getPackageRegistry().put(ApidescPackage.eINSTANCE.getNsURI(), ApidescPackage.eINSTANCE);        
			ApidescPackage.eINSTANCE.setEFactoryInstance(new ApidescFactoryJVMGen());
			// --

	        URI uri = URI.createURI(filename);
	        
	        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
	        rs.getResources().add(resource);
	        	        
	        resource.load(null);
	        EcoreUtil.resolveAll(resource);

	        return resource.getContents().get(0);
	}
	
	/*
	@Override
	public Object load(String path) throws IOException {
		if ( injector == null ) {
			injector = Guice.createInjector(new ApiDescriptionLanguageRuntimeModule());
		}
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        
        // This is to make it work when invoked from a new Eclipse instance and a regular Java program..
        rs.getPackageRegistry().put(ApidescPackage.eINSTANCE.getNsURI(), ApidescPackage.eINSTANCE);        
		ApidescPackage.eINSTANCE.setEFactoryInstance(new ApidescFactoryJVMGen());
		// --
		
        
        URI uri = URI.createURI(path);

        final XtextResource resource = (XtextResource) resourceFactory.createResource(uri);
        resource.load(null);
        
        if ( resource.getErrors().size() > 0 ) {
        	showErrors(resource);
        	throw new RuntimeException("Cannot parse " + path);
        }
        EcoreUtil.resolveAll(resource); 
        return resource.getContents().get(0);
	}
	*/
	
	@Override
	public boolean supports(String suffix) {
		return suffix.endsWith("apidesc");
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
