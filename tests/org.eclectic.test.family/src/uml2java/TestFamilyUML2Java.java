package uml2java;

import java.io.File;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class TestFamilyUML2Java {

	public static void main(String[] args) throws Exception {
	    System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		new TestFamilyUML2Java().testComposite();		
	}
	
	public void testComposite() throws Exception {
		eclectic.uml2java_si transformation = new eclectic.uml2java_si();

		Util.registerResourceFactory();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("src/uml2java/UML.ecore"), 
				withDir("src/uml2java/model/bank.uml")); 
		BasicEMFModel ocl  = loader.basicModelFromFile(
				withDir("src/uml2java/ocl_constraints.ecore"), 
				withDir("src/uml2java/model/bank_constraints_simple1.oclc.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("src/uml2java/java.ecore"), 
				withDir("_tmp/java-output.xmi")); 

		in.registerMethodHandler(new UMLHandler(manager));
		ocl.registerMethodHandler(new OclHandler(manager));
		manager.register("uml", in);
		manager.register("ocl", ocl);
		manager.register("java", out);
		
		transformation.setModelManager(manager);
		transformation.configure_();
		transformation.start_();
				
		// Serialize
		out.serialize();		
	}

	public class UMLHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {

		public UMLHandler(ModelManager m) {
			super(m);
		}

		@Override
		public IMethodWrapper wrap(Object o) {
			if ( o instanceof EObject) {
				EObject eo = (EObject) o;
				if ( eo.eClass().getName().equals("Operation") )
					return new UMLOperationHandler(manager.getNamespace("uml"), manager.getNamespace("ocl"), eo);

			}
			return super.wrap(o);
		}
		
	}

	public class UMLOperationHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private EObject self;
		private IModel<Object, ?> oclModel;

		public UMLOperationHandler(IModel<?, ?> model, IModel<?, ?> oclModel, EObject self) {
			super((IModel<Object, ?>) model, self);
			this.oclModel = (IModel<Object, ?>) oclModel;
			this.self = self;
		}
		
		public EObject pre() {
			String name = (String) model.getFeature(self, "name");
			List<?> pres = oclModel.allObjectsOf("OclPrecondition");
			for (Object object : pres) {
				String preName = (String) oclModel.getFeature(object, "name");
				if ( preName.equals(name) ) return (EObject) object;
			}
			return null;
		}
	}

	public class OclHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {

		public OclHandler(ModelManager m) {
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
			if ( o instanceof EObject) {
				EObject eo = (EObject) o;
				if ( eo.eClass().getName().equals("OperatorCallExp") )
					return new OperatorCallExpHandler(namespace, manager.getNamespace("uml"), eo);
				if ( eo.eClass().getName().equals("IntegerExp") )
					return new IntegerExpHandler(namespace, manager.getNamespace("uml"), eo);
			}
			return super.wrap(o);
		}
		
	}
	
	public class OperatorCallExpHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private EObject self;
		private IModel<Object, ?> umlModel;

		public OperatorCallExpHandler(IModel<?, ?> model, IModel<?, ?> umlModel, EObject self) {
			super(model, self);
			this.umlModel = (IModel<Object, ?>) umlModel;
			this.self = self;
		}
		
		public EObject umlType() {
			List<?> ptypes = umlModel.allObjectsOf("PrimitiveType");
			for (Object object : ptypes) {
				String typeName = (String) umlModel.getFeature(object, "name");
				if ( typeName.equals("Boolean") ) return (EObject) object;
			}
			throw new IllegalStateException("Not found type for " + self);
		}
	}

	public class IntegerExpHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private EObject self;
		private IModel<Object, ?> umlModel;

		public IntegerExpHandler(IModel<?, ?> model, IModel<?, ?> umlModel, EObject self) {
			super(model, self);
			this.umlModel = (IModel<Object, ?>) umlModel;
			this.self = self;
		}
		
		public EObject umlType() {
			List<?> ptypes = umlModel.allObjectsOf("PrimitiveType");
			for (Object object : ptypes) {
				String typeName = (String) umlModel.getFeature(object, "name");
				if ( typeName.equals("Integer") ) return (EObject) object;
			}
			throw new IllegalStateException("Not found type for " + self);
		}
	}

	public String withDir(String f) {
		return new File(".").getAbsolutePath() + File.separator + f;		
	}
}

