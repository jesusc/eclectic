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
import org.eclectic.frontend.core.EclecticTransformationDefinition;
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

public class EclecticMiddleEnd<R> implements MiddleEnd<EclecticTransformationDefinition, R>{

	private BackEnd<Resource, R> next;
	private EclecticMiddleEndOptions options;

	public EclecticMiddleEnd(BackEnd<Resource, R> b) {
		this(b, new EclecticMiddleEndOptions());
	}

	public EclecticMiddleEnd(BackEnd<Resource, R> b, EclecticMiddleEndOptions options) {
		this.next = b;
		this.options = options;
	}
	
	@Override
	public R compile(EclecticTransformationDefinition t) throws EclecticException {
		Resource idc = null;
		try {
			eclectic.navigation_compiler transformation = new eclectic.navigation_compiler();
			
			// Declare models
			ModelManager manager = new ModelManager();
			EMFLoader    loader  = new EMFLoader(new JavaListConverter());
			BasicEMFModel in  = loader.basicModelFromMemory(FrontendPackage.eINSTANCE, t.eResource());	
			in.registerMethodHandler(new MethodHandler(manager));

			rewriteOperators(t, in);
			
			
			BasicEMFModel out = loader.basicEmptyModelFromMemory(IdcPackage.eINSTANCE.eResource(), "result_eclectic2idc.idc.xmi");
	
			manager.register("eclectic", in);
			manager.register("idc", out);
			transformation.setModelManager(manager);
			
			System.out.println("Starting ** eclectic2idc ** ");
			transformation.configure_();
			transformation.start_();
			System.out.println("Finished ** eclectic2idc ** ");

			transformation.printPending();
			
			idc  = out.getHandler().getResource();
			// This is a bit tricky (to permit .serialize to be removed):
			out.getHandler().packRootElements();
			// out.serialize(); 
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

	private void rewriteOperators(EclecticTransformationDefinition t, BasicEMFModel in___) {
		eclectic.operators_rewriting transformation = new eclectic.operators_rewriting();

		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = in___;
		/*
		try {
			in = loader.basicModelFromMemory(FrontendPackage.eINSTANCE, t.eResource());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		*/
		in.registerMethodHandler(new MethodHandler(manager));
		manager.register("eclectic", in);
		transformation.setModelManager(manager);


		//ModelManager manager = new ModelManager();
		//manager.register("eclectic", in);
		//transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
		
	}

	public static class EclecticMiddleEndOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
