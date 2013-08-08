package org.eclectic.idc.jvm.bcel;


import org.apache.bcel.Constants;

import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.Type;
import org.eclectic.api.ApiModel;
import org.eclectic.idc.jvm.runtime.IModelMethodHandler;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
// import org.eclectic.idc.jvm.runtime.MethodCallHandler;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclipse.emf.ecore.EObject;

/**
 * Constants defining runtime types.
 * 
 * @author Jesus Perera Aracil
 * @author Jesus Sanchez Cuadrado
 *
 */
public interface DefaultTypes {

	public final ObjectType EObject = new ObjectType(EObject.class.getName());
	
	public final ObjectType IdcMetaclass = new ObjectType(IdcMetaclass.class.getName());
	
	
	// -- 
	// From org.eclectic.modeling - EMF
	// --
	
	public final ObjectType IdcTransformation   = new ObjectType(IdcTransformationBase.class.getName());
	public final ObjectType QoolTransformation  = new ObjectType("org.eclectic.idc.jvm.runtime.QoolTransformationBase");
	
	public final ObjectType ModelManager = new ObjectType(ModelManager.class.getName());
	
	public final ObjectType IModel = new ObjectType(org.eclectic.modeling.emf.IModel.class.getName());
	public final ObjectType IStreamingModel = new ObjectType(IStreamedModel.class.getName());

	public final ObjectType RuntimeModel = new ObjectType(org.eclectic.idc.jvm.runtime.RuntimeModel.class.getName());
	public final short      IModelCall = Constants.INVOKEINTERFACE;

	public final ObjectType JavaList = new ObjectType(java.util.ArrayList.class.getName());
	public final ObjectType ArrayList = new ObjectType(java.util.ArrayList.class.getName());
	public final ObjectType Iterable = new ObjectType(java.lang.Iterable.class.getName());

	// public final ObjectType MethodCallHandler = new ObjectType(MethodCallHandler.class.getName());
	
	public final ObjectType IClosure = new ObjectType("org.eclectic.idc.jvm.runtime.IClosure");
	public final ObjectType RunnableClosure = new ObjectType("org.eclectic.idc.jvm.runtime.RunnableClosure");
	
	public final ObjectType RuntimeUtil = new ObjectType(org.eclectic.idc.jvm.runtime.RuntimeUtil.class.getName());

	public final ObjectType BaseSegment = new ObjectType("org.eclectic.idc.jvm.runtime.IClosure");
	public final ObjectType BaseContinuableMethod = new ObjectType("org.eclectic.idc.jvm.runtime.ContinuableMethod");

	public final ObjectType JavaListConverter = new ObjectType(org.eclectic.idc.datatypes.JavaListConverter.class.getName());

	public final ObjectType ICollectionConverter = new ObjectType(org.eclectic.modeling.emf.ICollectionConverter.class.getName());

	public final ObjectType IModelMethodHandler = new ObjectType(IModelMethodHandler.class.getName());


	public final ObjectType IQueue = new ObjectType("org.eclectic.idc.jvm.runtime.IQueue");
	public final ObjectType HistoryQueue = new ObjectType("org.eclectic.idc.jvm.runtime.IHistoryQueue");
	public final ObjectType IRequest = new ObjectType("org.eclectic.idc.jvm.runtime.Request");
	
	public final ObjectType ApiModel = new ObjectType(org.eclectic.api.ApiModel.class.getName());

	// To avoid loading it before hand...
	public final ObjectType ContinuationResolverHelper = new ObjectType("org.eclectic.idc.jvm.runtime.ContinuationResolverHelper");

	public final ObjectType BasicMethodHandler = new ObjectType("org.eclectic.idc.jvm.runtime.BasicMethodHandler");


}
