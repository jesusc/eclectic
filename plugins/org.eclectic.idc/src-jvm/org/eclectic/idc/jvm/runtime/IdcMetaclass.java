package org.eclectic.idc.jvm.runtime;

import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.active.AllInstancesGenerator;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.IStreamedModel;


/**
 * Represent a metaclass at runtime. 
 * 
 * @author Jesus Perera Aracil
 * @author Jesus Sanchez Cuadrado
 *
 */
public class IdcMetaclass {
	private String metaclass;
	private IModel model;
	private IdcTransformationBase transformation;

	public IdcMetaclass(IdcTransformationBase t, IModel<?, ?> model, String metaclass) {
		this.transformation = t;
		this.model = model;
		this.metaclass = metaclass;
	}

	public ImmutableList all_instances() {
		if ( model instanceof IStreamedModel ) {
			return new AllInstancesGenerator((QoolTransformationBase) transformation, model, metaclass);
		}
		return ImmutableList.convertList( model.allObjectsOf(metaclass) );
	}

	public Object new_() {
		return model.createObject(this.metaclass);
	}
	
	public IModel getModel() {
		return model;		
	}

	public boolean ofKindIs(Object o) {
		return model.contains(o) && 
		       model.isKindOf(o, metaclass);
	}
	
	public String getMetaclassName() {
		return metaclass;
	}
	
	/*
	 * ESTO ES MAL!! TYPE_OF VS KIND_OF
	public Boolean kind_of(EObject obj) {
		return obj.eClass().getName().equals(metaclass)
				&& MetamodelUtil.model2.getNamespace(model).contains(obj);
	}

	public MyList<EObject> all_objects() {
		return new MyList<EObject>((List<EObject>) MetamodelUtil.model2.getNamespace(model).allObjectsOf(metaclass));
	}
	*/
}
