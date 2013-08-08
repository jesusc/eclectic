package org.eclectic.frontend.capi;

import idc.core.LocatedElement;

import java.io.IOException;
import java.io.InputStream;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.FrontendPackage;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.capi.internal.ElementWrappers;
import org.eclectic.frontend.capi.internal.MethodHandler;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.ResolveLink;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.tao.TaoTransformation;
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

public class TaoMiddleEnd<R> implements MiddleEnd<TaoTransformation, R>{

	private BackEnd<Resource, R> next;
	private TaoMiddleEndOptions options;

	public TaoMiddleEnd(BackEnd<Resource, R> b) {
		this(b, new TaoMiddleEndOptions());
	}

	public TaoMiddleEnd(BackEnd<Resource, R> b, TaoMiddleEndOptions options) {
		this.next = b;
		this.options = options;
	}
	
	// TODO: FACTORIZE!
	
	
	@Override
	public R compile(TaoTransformation t) throws EclecticException {
		Resource idc = null;
		try {			
			InputStream qoolS = getClass().getClassLoader().getResource("family_v1/tao.qool").openStream();
			JVMCompilationResult executor = new QoolCompiler().execute("tao.qool", qoolS);
			
			// Declare models
			ModelManager manager = new ModelManager();
			EMFLoader    loader  = new EMFLoader(new JavaListConverter());
			BasicEMFModel in  = loader.basicModelFromMemory(FrontendPackage.eINSTANCE, t.eResource());		 
			BasicEMFModel out = loader.basicEmptyModelFromMemory(IdcPackage.eINSTANCE.eResource(), "result_tao2idc.idc.xmi");
	
			in.registerMethodHandler(new MethodHandler(manager));
			manager.register("in", in);
			manager.register("idc", out);
			
			System.out.println("Starting ** tao2idc ** ");
			executor.execute(manager, "tao2idc");
			System.out.println("Finished ** tao2idc ** ");
			
			idc  = out.getHandler().getResource();
			// This is a bit tricky (to permit .serialize to be removed):
			out.getHandler().packRootElements();
			out.serialize(); 
		} catch ( Exception e ) {
			throw new EclecticException(e);
		}
		
		/*
		Mappings2IDC k = new Mappings2IDC();
		Resource idc = k.compile(r);
		*/		
		
		if ( options.saveIntermediate != null ) {
			idc.setURI(URI.createFileURI(options.saveIntermediate));			
			try {
				/*
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put(XMIResourceImpl.OPTION_SCHEMA_LOCATION, true);
				*/
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

	public static class TaoMiddleEndOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
