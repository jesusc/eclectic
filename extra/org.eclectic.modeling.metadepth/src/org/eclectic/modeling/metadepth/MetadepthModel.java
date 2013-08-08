package org.eclectic.modeling.metadepth;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import meteoric.at3rdx.kernel.Clabject;
import meteoric.at3rdx.kernel.Classifier;
import meteoric.at3rdx.kernel.Field;
import meteoric.at3rdx.kernel.Model;
import meteoric.at3rdx.kernel.ModelFactory;
import meteoric.at3rdx.kernel.QualifiedElement;
import meteoric.at3rdx.kernel.Type;
import meteoric.at3rdx.kernel.dataTypes.FieldValue;
import meteoric.at3rdx.kernel.exceptions.At3IllegalAccessException;
import meteoric.at3rdx.kernel.storage.TextDumper;

import org.eclectic.modeling.emf.ICollectionConverter;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IMultiLevelModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolNotInstantiableModelElementTypeException;

public class MetadepthModel implements IMultiLevelModel<Clabject, Clabject> {

	private Model metamodel;
	private ICollectionConverter converter;
	private Model instanceModel;
	private Model[] ontologicalModels;
	private Object methodHandler;
	
	private static Set<String> linguisticFields = new HashSet<String>();
	static {
		linguisticFields.add("_id");
	}

	
	public MetadepthModel(Model metamodel, Model instanceModel, ICollectionConverter converter) {
		this.metamodel     = metamodel;
		this.instanceModel = instanceModel;
		this.converter = converter;

		List<Type> types = instanceModel.getAllOntologicalTypes();
		this.ontologicalModels = new Model[types.size() + 1];
		this.ontologicalModels[0] = instanceModel;
		for(int i = 0; i < types.size(); i++) {
			Model parent = (Model) types.get(i);
			ontologicalModels[i + 1] = parent;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Clabject> allObjectsOf(String metaclass) {
		return allObjectsOf(metaclass, 0);
	}

	@Override
	public List<Clabject> allObjectsOf(String metaclass, int potency) {
		if ( potency < 0 || potency > this.ontologicalModels.length) {
			throw new RuntimeException("Invalid potency " + potency);
		}
		try {
			Collection<Clabject> elements = (Collection<Clabject>) this.ontologicalModels[potency].getAllOfKind(metaclass);
			HashSet<Clabject> hashSet = new java.util.HashSet<Clabject>(elements);
			return (List<Clabject>) new java.util.LinkedList<Clabject>(hashSet);
			//return (List<Clabject>) elements; //converter.convertList(elements);
		} catch (EolModelElementTypeNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Clabject createObject(String type) {
		//  This version just doesn't work
		// return (Clabject) this.instanceModel.createInstance(metaclass);

		Model meta = (Model) instanceModel.getType();	// get the metamodel
		if (meta != null) {
			ModelFactory mf = ((Model)instanceModel.getType()).getFactory();
			QualifiedElement typ = meta.getQualifiedElement(type);
			if (typ == null)
				throw new RuntimeException("No type " + type);
				// throw new EolModelElementTypeNotFoundException(instanceModel.name(), type);
			// TODO: We are assuming that we create only NODES			
			return mf.createQE(type, null, instanceModel);					
		} else {
			throw new RuntimeException("No metamodel");
		}
		/*
		Clabject object = (Clabject) this.instanceModel.createInstance(metaclass, this.instanceModel);
		this.instanceModel.addChildren((QualifiedElement) object);
		this.instanceModel.addChildren((QualifiedElement) object, metaclass);
		return object;
		*/
	}

	@Override
	public Clabject getMetaclass(String metaclass) {
		return this.metamodel.getQualifiedElement(metaclass);
	}

	@Override
	public void setFeature(Clabject receptor, String featureName, Object value) {
		QualifiedElement q = ((QualifiedElement) receptor);
		Field            f = q.getField(featureName);
		FieldValue       v = f.get();

		
		if ( f.getMaximum() == -1 || f.getMinimum() > 1 ) {
			if ( converter.isList(value) ) {
				LinkedList<Object> result = new LinkedList<Object>();
				Iterator<Object> iterator = converter.toIterator(value);
				while ( iterator.hasNext() ) 
					result.add(iterator.next());
				
				value = result;
			}
		}
		
		if ( v == null)  { // attribute not setted yet!
			v = f.createValue();
			f.setFieldValue(v);
		}
 		v.set(value);
		
		/*
		QualifiedElement q = ((QualifiedElement) receptor);
		FieldValue       v = q.get(featureName);
		v.set(value);
		*/
	}

	@Override
	public Object getFeature(Clabject receptor, String featureName) {
		QualifiedElement q = ((QualifiedElement) receptor);
		Field            f = null;
		try {
			f = q.getField(featureName);
		} catch ( At3IllegalAccessException e ) { 
			if ( featureName.equals("_id") ) return q.name();
			throw e;
		}
		
		FieldValue       v = f.get();
		if ( v == null)  { // attribute not setted yet!
			return null;
		}
		// FieldValue       v = q.get(featureName);
		Object result = v.getValue();
		if ( result instanceof List ) {
			return converter.convertList((List) result);
		}
		return result;
	}

	@Override
	public boolean hasFeature(Clabject receptor, String featureName) {
		QualifiedElement q = ((QualifiedElement) receptor);
		try {
			q.getField(featureName);
			return true;
		} catch ( At3IllegalAccessException e ) { 
			return linguisticFields.contains(featureName);
		}		

		/*
		// BEFORE: It seems that hasField does not look up in the ontological types...
		return q.hasField(featureName) || linguisticFields.contains(featureName);
		*/

	}

	@Override
	public boolean contains(Object obj) {
		for(int i = 0; i < ontologicalModels.length; i++) {
			if ( ontologicalModels[i].owns(obj) ) {
				return true;
			}
		}
		return false;
	}	
	
	public void serialize() throws Exception {
		/*
		System.out.println(
				instanceModel.allInstances((Classifier) metamodel.getQualifiedElement("Class"))
			);
		*/
		System.out.println(	TextDumper.dump(instanceModel)	);
	}

	@Override
	public boolean isKindOf(Object o, String metaclass) {
		if ( o instanceof QualifiedElement ) {
			QualifiedElement c = (QualifiedElement) getMetaclass(metaclass);
			QualifiedElement qe = (QualifiedElement) o;
			return c.isInstance(qe);
		}
		return false;
	}

	@Override
	public void registerMethodHandler(Object handler) {
		this.methodHandler = handler;		
	}

	@Override
	public Object getMethodHandler() {
		return methodHandler;
	}

	@Override
	public Object getContainer(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Clabject> allObjectsOf(String metaclass, boolean noSubtypes) {
		//if ( potency < 0 || potency > this.ontologicalModels.length) {
		//	throw new RuntimeException("Invalid potency " + potency);
		//}
		int potency = 1;
		try {
			Collection<Clabject> elements = (Collection<Clabject>) this.ontologicalModels[potency].getAllOfType(metaclass);
			HashSet<Clabject> hashSet = new java.util.HashSet<Clabject>(elements);
			return (List<Clabject>) new java.util.LinkedList<Clabject>(hashSet);
			//return (List<Clabject>) elements; //converter.convertList(elements);
		} catch (EolModelElementTypeNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteObject(Clabject o) {
		throw new UnsupportedOperationException();		
	}


}
