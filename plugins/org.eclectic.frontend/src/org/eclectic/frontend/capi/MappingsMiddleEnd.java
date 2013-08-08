package org.eclectic.frontend.capi;

import idc.core.LocatedElement;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.FrontendPackage;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.capi.internal.MethodHandler;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.idc.IdcPackage;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.BasicMethodWrapper;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class MappingsMiddleEnd<R> implements MiddleEnd<MappingTransformation, R>{

	private BackEnd<Resource, R> next;
	private MappingsMiddleEndOptions options;

	public MappingsMiddleEnd(BackEnd<Resource, R> b) {
		this(b, new MappingsMiddleEndOptions());
	}

	public MappingsMiddleEnd(BackEnd<Resource, R> b, MappingsMiddleEndOptions options) {
		this.next = b;
		this.options = options;
	}
	
	@Override
	public R compile(MappingTransformation t) throws EclecticException {
		Resource idc = null;
		try {
			InputStream qoolS = getClass().getClassLoader().getResource("family_v1/mappings.qool").openStream();
			JVMCompilationResult executor = new QoolCompiler(QoolCompiler.JAVA_VERSION).execute("mappings.qool", qoolS);
			
			// Declare models
			ModelManager manager = new ModelManager();
			EMFLoader    loader  = new EMFLoader(new JavaListConverter());
			BasicEMFModel in  = loader.basicModelFromMemory(FrontendPackage.eINSTANCE, t.eResource());		 
			BasicEMFModel out = loader.basicEmptyModelFromMemory(IdcPackage.eINSTANCE.eResource(), "result_mappings2idc.idc.xmi");
	
			in.registerMethodHandler(new MethodHandler(manager));
			manager.register("in", in);
			manager.register("idc", out);
			
			System.out.println("Starting ** mappings2idc ** ");
			executor.execute(manager, "mappings2idc");
			System.out.println("Finished ** mappings2idc ** ");
			
			idc  = out.getHandler().getResource();
			// This is a bit tricky (to permit .serialize to be removed):
			out.getHandler().packRootElements();
			out.serialize(); 
		} catch ( Exception e ) {
			throw new EclecticException(e);
		}
		
		if ( options.saveIntermediate != null ) {
			idc.setURI(URI.createFileURI(options.saveIntermediate));			
			try {
				idc.save(null);
			} catch (IOException e) {
				throw new EclecticException(e);
			}
		}
		
		if ( options.checkLocatedElements ) {
			TreeIterator<EObject> it = idc.getAllContents();
			while ( it.hasNext()) {
				EObject o = it.next();
				if ( o instanceof LocatedElement ) {
					LocatedElement l = (LocatedElement) o;
					if ( l.getFile() == null ) {
						throw new IllegalStateException("Element " + o + " without localization");
					}
				}
			}
		}
		
		return next.compile(idc);
	}

	public static class MappingsMiddleEndOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
