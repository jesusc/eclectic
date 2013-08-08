package org.eclectic.capi;

import idc.IdcPackage;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

// import ecl_meta.Ecl_metaPackage;

public class OldIDCUtil {

	
	public static Resource loadIDCFromXMI(String filename) throws EclecticException  {
		return loadIDCFromXMI( URI.createURI(filename) );
	}
	
	
	public static Resource loadIDCFromXMI(URI uri) throws EclecticException {
		// Util.registerResourceFactory();
		ResourceSetImpl resourceSet = new ResourceSetImpl();

		//EPackage.Registry.INSTANCE.put(Ecl_metaPackage.eNS_URI, Ecl_metaPackage.eINSTANCE);
		//resourceSet.getPackageRegistry().put(Ecl_metaPackage.eNS_URI, Ecl_metaPackage.eINSTANCE);
		//System.out.println("***" + 		EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) );

		resourceSet.getPackageRegistry().put(IdcPackage.eNS_URI, IdcPackage.eINSTANCE);
		
		Resource r = resourceSet.getResource(uri, true);
		try {
			r.load(null);
		} catch (IOException e) {
			throw new EclecticException(e);
		}
		return r;
	}

	public static Resource loadIDCFromXMI(String uri, InputStream resourceAsStream) throws EclecticException {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		
		//EPackage.Registry.INSTANCE.put(Ecl_metaPackage.eNS_URI, Ecl_metaPackage.eINSTANCE);
		//resourceSet.getPackageRegistry().put(Ecl_metaPackage.eNS_URI, Ecl_metaPackage.eINSTANCE);
		//System.out.println("@@@" + 		EPackage.Registry.INSTANCE.getEPackage(Ecl_metaPackage.eNS_URI) );
		resourceSet.getPackageRegistry().put(IdcPackage.eNS_URI, IdcPackage.eINSTANCE);
		
		Resource r = resourceSet.getResource(URI.createURI(uri), true);
		try {
			r.load(resourceAsStream, null);
		} catch (IOException e) {
			throw new EclecticException(e);
		}
		return r;		
	}

	public static Resource emptyIDC() throws EclecticException  {
		// Util.registerResourceFactory();
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		
		resourceSet.getPackageRegistry().put(IdcPackage.eNS_URI, IdcPackage.eINSTANCE);
		
		Resource r = resourceSet.createResource(URI.createFileURI("/tmp/inmemory.xmi"));
		return r;
	}




	
	
}
