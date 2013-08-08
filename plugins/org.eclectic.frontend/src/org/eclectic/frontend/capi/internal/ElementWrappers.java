package org.eclectic.frontend.capi.internal;

import org.eclectic.frontend.core.Annotation;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.PotencyAnnotation;
import org.eclectic.frontend.core.ResolveLink;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.xtext.EcoreUtil2;

public class ElementWrappers {
	public static class DelegateMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private Delegate self;

		public DelegateMethodHandler(IModel<?, ?> model, Delegate o) {
			super(model, o);
			this.self = o;
		}

		// Same as resolve link!!
		public String queue_id_string() {
			String name = self.getModule().getAs();
			if ( name == null ) name = self.getModule().getModule();
			return name + "!" + self.getLinkName();
		}		
	}

	public static class ResolveLinkMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private ResolveLink self;

		public ResolveLinkMethodHandler(IModel<?, ?> model, ResolveLink o) {
			super(model, o);
			this.self = o;
		}

		public String queue_id_string() {
			String name = self.getModule().getAs();
			if ( name == null ) name = self.getModule().getModule();
			return name + "!" + self.getLinkName();
		}		
	}

	public static class ClassUseMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private ClassUse self;

		public ClassUseMethodHandler(IModel<?, ?> model, org.eclectic.frontend.core.ClassUse use) {
			super(model, use);
			this.self = use;
		}
		
		/*
		public String id_string() {
			return ((org.eclectic.frontend.core.NamedElement) self.getModel()).getName() +
					"!" + self.getClassName();
		}
		*/
		
		public PotencyAnnotation potencyAnnotation() {
			for (Annotation ann : self.getAnnotations()) {
				if ( ann instanceof PotencyAnnotation ) {
					return ((PotencyAnnotation) ann);
				}
			}
			return null;
		}
		
		public String queue_id_string() {
			/*
			UseDeclaration dcl = (UseDeclaration) self.getModel();
			String name = dcl.getAs();
			if ( name == null ) name = dcl.getModule();
			return name + "!" + self.getClassName();
			*/
			return id_string();
		}				
		
		public String id_string() {
			String potStr = "";
			PotencyAnnotation pot = potencyAnnotation();
			if ( pot != null ) {
				potStr = "_" + pot.getValue();	
			}
			
			String name = null;
			if ( self.getModel() instanceof UseDeclaration ) {
				UseDeclaration useDeclaration = (UseDeclaration) self.getModel();
				name = useDeclaration.getAs() != null ? useDeclaration.getAs() : useDeclaration.getModule();
			} else {
				name = ((org.eclectic.frontend.core.NamedElement) self.getModel()).getName();
			}
			
			TransformationDefinition rootTransformation = EcoreUtil2.getContainerOfType(self, TransformationDefinition.class);
			if ( rootTransformation == null )
				throw new IllegalStateException("Cannot find TransformationDefinition container for " + self);
			
			return rootTransformation.getName() + "_" + name +
					"_" + self.getClassName() + potStr;
		}

	}

}
