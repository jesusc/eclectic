package org.eclectic.frontend.capi;

import idc.core.LocatedElement;

import java.io.IOException;
import java.io.InputStream;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.FrontendPackage;
import org.eclectic.frontend.api.QoolCompiler;
import org.eclectic.frontend.chain.ChainTransformation;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.idc.IdcPackage;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
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

public class ChainMiddleEnd<R> implements MiddleEnd<ChainTransformation, R>{

	private BackEnd<Resource, R> next;
	private ChainMiddleEndOptions options;

	public ChainMiddleEnd(BackEnd<Resource, R> b) {
		this(b, new ChainMiddleEndOptions());
	}

	public ChainMiddleEnd(BackEnd<Resource, R> b, ChainMiddleEndOptions options) {
		this.next = b;
		this.options = options;
	}
	
	public class MethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {

		public MethodHandler(ModelManager m) {
			super(m);
		}

		@Override
		public IMethodWrapper wrap(Object o) {
			IModel<?, ?> namespace;
			try {
			 namespace = manager.getNamespace(o);
			} catch ( NoModelFoundException e) {
				throw new IdcException(e);
			}
			if ( o instanceof ClassUse) {
				return new ClassUseMethodHandler(namespace, (ClassUse) o);
			}
			return super.wrap(o);
		}
		
	}
	
	public class ClassUseMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private ClassUse self;

		public ClassUseMethodHandler(IModel<?, ?> model, org.eclectic.frontend.core.ClassUse use) {
			super(model, use);
			this.self = use;
		}
		
		public String id_string() {
			return ((org.eclectic.frontend.core.NamedElement) self.getModel()).getName() +
					"_" + self.getClassName();
		}
		
	}
	
	@Override
	public R compile(ChainTransformation t) throws EclecticException {
		Resource idc = null;
		try {
			InputStream qoolS = getClass().getClassLoader().getResource("family_v1/chain.qool").openStream();
			//String qoolT = ClassLoader.getSystemClassLoader().getResource("family_v1/chain.qool").getFile();		
			JVMCompilationResult executor = new QoolCompiler().execute("chain.qool", qoolS);
			
			// Declare models
			ModelManager manager = new ModelManager();
			EMFLoader    loader  = new EMFLoader(new JavaListConverter());
			BasicEMFModel in  = loader.basicModelFromMemory(FrontendPackage.eINSTANCE, t.eResource());		 
			BasicEMFModel out = loader.basicEmptyModelFromMemory(IdcPackage.eINSTANCE.eResource(), "result_chain2idc.idc.xmi");
	
			in.registerMethodHandler(new MethodHandler(manager));
			manager.register("in", in);
			manager.register("idc", out);
			
			System.out.println("Starting ** chain2idc ** ");
			executor.execute(manager, "chain2idc");
			System.out.println("Finished ** chain2idc ** ");
			
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

	public static class ChainMiddleEndOptions {
		public boolean checkLocatedElements = false;
		public String saveIntermediate = null;
	}
}
