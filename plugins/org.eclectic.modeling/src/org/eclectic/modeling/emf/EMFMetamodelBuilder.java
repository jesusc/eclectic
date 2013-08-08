package org.eclectic.modeling.emf;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class EMFMetamodelBuilder {
	// private HashMap<String, EClass> classes = new HashMap<String, EClass>();
	private EPackage pkg;
	private ICollectionConverter converter; 
	
	public EMFMetamodelBuilder(String transformation, String name, ICollectionConverter converter) {
		pkg = EcoreFactory.eINSTANCE.createEPackage();
		pkg.setName(name);
		pkg.setNsURI("eclectic/" + transformation + "/internal/" + name);
		pkg.setNsPrefix(name);
		
		this.converter = converter;
	}
	
	public void addMetaclass(String metaclass) {
		EClass eclass = EcoreFactory.eINSTANCE.createEClass();
		eclass.setName(metaclass);
		pkg.getEClassifiers().add(eclass);
	}
	
	public void addReference(String metaclass, String featureName, String type, boolean multivalued) {
		EClass eclass  = (EClass) pkg.getEClassifier(metaclass);
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(featureName);
		
		// ref.setEType(EcorePackage.eINSTANCE.getEObject()); // changed to allow traces to work with Java objects
		ref.setEType(EcorePackage.eINSTANCE.getEJavaObject());
		if ( multivalued ) ref.setUpperBound(-1);

		eclass.getEStructuralFeatures().add(ref);
	}
	
	public void addAttribute(String metaclass, String featureName, String type, boolean multivalued) {
		EClass eclass  = (EClass) pkg.getEClassifier(metaclass);
		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		attr.setName(featureName);
		EClassifier eType_ = null;
		if ( "String".equals(type) ) {
			eType_ = EcorePackage.eINSTANCE.getEClassifier("EString");
		} else if ( "Map".equals(type) ) {
			eType_ = EcorePackage.eINSTANCE.getEClassifier("EJavaObject");
		} else if ( "List".equals(type) ) {
			eType_ = EcorePackage.eINSTANCE.getEClassifier("EJavaObject");
		} else {
			throw new IllegalArgumentException("Unsupported primitive type: " + type);
		}
		
		attr.setEType(eType_);
		if ( multivalued ) attr.setUpperBound(-1);
		eclass.getEStructuralFeatures().add(attr);
	}

	public IModel<?, ?> getModel() throws IOException {
		// TODO: How to parametrize this???			
		EMFLoader loader = new EMFLoader(converter);
		LinkedList<EPackage> pkgs = new LinkedList<EPackage>();
		pkgs.add(pkg);
		return loader.emptyModelFromMemory(pkgs, pkg.getName());		
	}
	
	public void register(ModelManager m, Object handler) throws IOException {
		BasicEMFModel model = (BasicEMFModel) getModel();
		// model.setId(pkg.getName());
		if ( handler != null)
			model.registerMethodHandler(handler);
		m.register(pkg.getName(), model);
	}

	public void register(ModelManager m) throws IOException {
		register(m, null);
	}

}
