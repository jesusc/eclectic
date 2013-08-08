package uml2java;

import java.io.IOException;
import java.util.List;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.api.AttributionCompiler;
import org.eclectic.frontend.api.ChainCompiler;
import org.eclectic.frontend.api.MappingsCompiler;
import org.eclectic.frontend.api.TaoCompiler;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.StandaloneIdc;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.test.BaseTest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFamilyUML2Java extends BaseTest {

	public static void main(String[] args) throws IOException, EclecticException {
		setUp();
		// new TestFamilyUML2Java().testMapping();
		// new TestFamilyUML2Java().testTao();
		//new TestFamilyUML2Java().testAttr();
		new TestFamilyUML2Java().testComposite();		
	}
	
	@BeforeClass 
	public static void setUp() {
		StandaloneIdc.init();		
	}
	
	@Test
	public void testMapping() throws IOException, EclecticException{
		JVMCompilationResult executor = new MappingsCompiler().execute(withDir("family/uml2java/struct.map"));
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       //("uml", new UMLResourceFactoryImpl());
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("family/uml2java/bank/bank.uml")); 
		BasicEMFModel ocl  = loader.basicModelFromFile(
				withDir("family/uml2java/ocl_constraints.ecore"), 
				withDir("family/uml2java/bank/bank_constraints_simple1.oclc.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("family/uml2java/java.ecore"), 
				withDir("_tmp/java-output.xmi")); 
		
		manager.register("uml", in);
		manager.register("ocl", ocl);
		manager.register("java", out);
		in.registerMethodHandler(new UMLHandler(manager));
		ocl.registerMethodHandler(new OclHandler(manager));

		// Execute
		executor.execute(manager, "struct");
		
		// Serialize
		out.serialize();		
	}

	
	@Test
	public void testTao() throws IOException, EclecticException{
		JVMCompilationResult executor = new TaoCompiler().execute(withDir("family/uml2java/ocl2java.tao"));
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
	       //("uml", new UMLResourceFactoryImpl());
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("family/uml2java/bank/bank.uml")); 
		BasicEMFModel ocl  = loader.basicModelFromFile(
				withDir("family/uml2java/ocl_constraints.ecore"), 
				withDir("family/uml2java/bank/bank_constraints_simple1.oclc.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("family/uml2java/java.ecore"), 
				withDir("_tmp/java-output.xmi")); 
		
		manager.register("uml", in);
		manager.register("ocl", ocl);
		manager.register("java", out);
		
		// Execute
		executor.execute(manager, "gen_java");
		
		// Serialize
		out.serialize();		
	}

	@Test
	public void testAttr() throws IOException, EclecticException {
		JVMCompilationResult executor = new AttributionCompiler().execute(withDir("family/uml2java/typing.attr"));
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());

		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("family/uml2java/bank/bank.uml")); 
		BasicEMFModel ocl  = loader.basicModelFromFile(
				withDir("family/uml2java/ocl_constraints.ecore"), 
				withDir("family/uml2java/bank/bank_constraints_simple1.oclc.xmi")); 
		
		manager.register("uml", in);
		manager.register("ocl", ocl);
		ocl.registerMethodHandler(new OclHandler(manager));
		
		// Execute
		executor.execute(manager, "typing");
		
		// Serialize
		// out.serialize();		
	}

	@Test
	public void testComposite() throws IOException, EclecticException {
		JVMCompilationResult executorStruct = new MappingsCompiler().execute(withDir("family/uml2java/struct.map"));
		JVMCompilationResult executorTao    = new TaoCompiler().execute(withDir("family/uml2java/ocl2java.tao"));
		JVMCompilationResult executorTyp    = new AttributionCompiler().execute(withDir("family/uml2java/typing.attr"));
		JVMCompilationResult executor       = new ChainCompiler().execute(withDir("family/uml2java/ocl2java.chain"));
		
		executor.addCompiled(executorStruct);
		executor.addCompiled(executorTao);
		executor.addCompiled(executorTyp);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
			("uml", new XMIResourceFactoryImpl());
		
		// Declare models
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				withDir("family/uml2java/UML.ecore"), 
				withDir("family/uml2java/bank/bank.uml")); 
		BasicEMFModel ocl  = loader.basicModelFromFile(
				withDir("family/uml2java/ocl_constraints.ecore"), 
				withDir("family/uml2java/bank/bank_constraints_simple1.oclc.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("family/uml2java/java.ecore"), 
				withDir("_tmp/java-output.xmi")); 

		in.registerMethodHandler(new UMLHandler(manager));
		ocl.registerMethodHandler(new OclHandler(manager));
		manager.register("uml", in);
		manager.register("ocl", ocl);
		manager.register("java", out);
		
		// Execute
		executor.execute(manager, "uml2java_si");
		
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
}
