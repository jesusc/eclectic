package org.eclectic.idc.jvm.gen;


import org.eclectic.apidesc.ApiDescription;
import org.eclectic.idc.IMetamodelDescription;
import org.eclectic.idc.core.MetamodelDefinition;
import org.eclectic.idc.core.MethodDefinition;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.SelfVariable;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.ReadMeta;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.RuntimeModel;
import org.eclectic.idc.qool.LocalQueue;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.QForAll;
import org.eclipse.emf.ecore.EObject;

// TODO: Processor should be part of the transformation context or something like this, 
//       but it should not work with static methods. For instance, it should store the 
//       metamodel descriptions whenever they have been loaded
public class Processor {

	public static class ModelInfo {
		private String modelName;
		private ModelDefinition model;
		private String typeName;

		public ModelInfo(String modelName, ModelDefinition modelDefinition) {
			this(modelName, modelDefinition, null);
		}

		public ModelInfo(String modelName, ModelDefinition modelDefinition, String typeName) {
			this.modelName = modelName;
			this.model     = modelDefinition;
			this.typeName  = typeName;
		}

		public String getTypeName() {
			return typeName;
		}
		
		public ModelDefinition getModel() {
			return model;
		}
		
		public String getModelName() {
			return modelName;
		}
	}
	
	public static ModelStrategy getModelStrategy(Create c, TransformationContext transformationContext) {
		MetamodelDefinition metamodel = c.getModel().getMetamodel();
		if ( metamodel == null ) return new RegularModelStrategy(c.getModel().getName());
		
		Object description = transformationContext.getMetamodelManager().getDescription(metamodel.getPath());
		if ( description instanceof ApiDescription ) {
			return new ApiModelStrategy(c.getModel().getName(), c.getClassName(), (ApiDescription) description);
		}
		
		throw new UnsupportedOperationException();
	}

	public static ModelStrategy getModelStrategy(Set s, TransformationContext transformationContext) {
		return getModelStrategy(s.getReceptor(), transformationContext);
	}

	// This can be put in each GenerableInstruction
	public static ModelStrategy getModelStrategy(EObject e, TransformationContext transformationContext) {
		if ( e instanceof Create ) {
			return getModelStrategy((Create) e, transformationContext);
		} /*
		} else if ( e instanceof Get ) {
			return new RegularModelStrategy(getModel((Get) e));
		} else if ( e instanceof ReadMeta ) {
			return new RegularModelStrategy(getModel((ReadMeta) e));
		} else if ( e instanceof Assign ) {
			return new RegularModelStrategy(getModel((Assign) e));
		} else if ( e instanceof SelfVariable ) {
			return new RegularModelStrategy(getModel((SelfVariable) e));
		}
		*/
		
		
		// I do not like this...
		return new RegularModelStrategy(null);
		// throw new IdcException("No model found for " + e);
	}

	
	// This can be put in each GenerableInstruction
	public static ModelInfo getModel(EObject e, TransformationContext transformationContext) {
		if ( e instanceof Create ) {
			return getModel((Create) e, transformationContext); 
		} else if ( e instanceof Get ) {
			return getModel((Get) e, transformationContext);
		} else if ( e instanceof ReadMeta ) {
			return getModel((ReadMeta) e, transformationContext);
		} else if ( e instanceof Assign ) {
			return getModel((Assign) e, transformationContext);
		} else if ( e instanceof SelfVariable ) {
			return getModel((SelfVariable) e,transformationContext);
		} else if ( e instanceof QForAll ) {
			return getModel((QForAll) e, transformationContext);
		}

		throw new IdcException("No model found for " + e);
	}

	public static ModelInfo getModel(QForAll fa, TransformationContext transformationContext) {
		if ( fa.getQueue() instanceof ModelElementQueue ) {
			ModelDefinition model = ((ModelElementQueue) fa.getQueue()).getType_().getModel();
			// Without this condition (i.e., this is better type detection) "mappings.qool" fails...
			// so, it put the condition to make it work with API descriptions
			// Some time later... The reason is that if there is a "get" for a multivalued feature
			// the model this is returning is actually the model of the elements inside the list
			// but we should return the "runtime model".
			if ( model.getMetamodel() != null )
				return new ModelInfo(((ModelElementQueue) fa.getQueue()).getType_().getModel().getName(),
						((ModelElementQueue) fa.getQueue()).getType_().getModel(),
						((ModelElementQueue) fa.getQueue()).getType_().getClassifierName() );
		} else if ( fa.getQueue() instanceof LocalQueue ) {
			// return ((LocalQueue) fa.getQueue()).getType_().getModel().getName();
		}
		throw new IdcException("No model found for " + fa);
	}

	public static ModelInfo getModel(Create c, TransformationContext transformationContext) {
		return new ModelInfo(c.getModel().getName(), c.getModel());
	}

	public static ModelInfo getModel(Set s, TransformationContext transformationContext) {
		return getModel(s.getReceptor(), transformationContext);
	}

	public static ModelInfo getModel(Get g, TransformationContext transformationContext) {		
		if ( true )
			throw new IdcException("Cannot implement this yet!");
		
		// return getModel(g.getReceptor());
		ModelInfo info = getModel(g.getReceptor(), transformationContext);
		if ( info.getTypeName() == null )
			throw new IdcException("Cannot determine type for " + g);
		
		// TODO: Factorize somehow with respect to getModelStrategy
		if ( info.getModel().getMetamodel() != null ) {
			IMetamodelDescription description = (IMetamodelDescription) transformationContext.getMetamodelManager().getDescription(info.getModel().getMetamodel().getPath());
			String fType        = description.getFeatureType(info.getTypeName(), g.getFeatureName());
			boolean multivalued = description.isFeatureMultivalued(info.getTypeName(), g.getFeatureName());
			if ( multivalued ) 
				return new ModelInfo(RuntimeModel.UNIQUE_ID, null);
			
			return new ModelInfo(info.getModelName(), info.getModel(), fType);
		} else {
			return info;
		}
		
	}

	public static ModelInfo getModel(SelfVariable v, TransformationContext transformationContext) {	
		MethodDefinition d = (MethodDefinition) v.eContainer();
		return new ModelInfo(d.getType().getModel().getName(), d.getType().getModel());
	}

	/**
	 * Returns the runtime model, not the model the metaclass belongs to.
	 * This is so, to allow calling methods on the IdcMetclass...
	 * (should I use mirrors?)
	 */
	public static ModelInfo getModel(ReadMeta r, TransformationContext transformationContext) {
		return new ModelInfo(RuntimeModel.UNIQUE_ID, null);
		// return r.getModel().getName();
	}

	public static ModelInfo getModel(Assign a, TransformationContext transformationContext) {		
		return getModel(a.getRightVariable(), transformationContext);
	}


	// ------------------
	//  Type computation 
	// ------------------
	private static Object getType(Variable receptor, IMetamodelDescription description) {
		throw new UnsupportedOperationException();
	}

}
