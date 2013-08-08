package org.eclectic.idc.core.jvmgen;

import org.apache.bcel.generic.ClassGen;
import org.eclectic.idc.core.CoreFactory;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Parameter;
import org.eclectic.idc.core.SelfVariable;
import org.eclectic.idc.core.impl.MethodDefinitionImpl;
import org.eclectic.idc.instr.jvmgen.ClosureDefJVMGen;
import org.eclectic.idc.jvm.context.ClosureScope;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MethodDefinitionJVMGen extends MethodDefinitionImpl {

	private String methodClassName = null;
	
	public String getMethodClassName() {
		return methodClassName;
	}
	
	/**
	 * Redefined to create the self variable it is not defined,
	 * which happens when it is not used the body of a method.
	 */
	@Override
	public SelfVariable getSelfVar() {
		if ( super.getSelfVar() == null ) {
			SelfVariable var = CoreFactory.eINSTANCE.createSelfVariable();
			var.setName("self");
			this.setSelfVar(var);
		}
	
		return super.getSelfVar();
	}
	
	public void generateContinuableClass(GenScope libraryScope) {
		methodClassName = libraryScope.getClassGen().getClassName() + "$method$" + getType().getModel().getName() + "__"+  getType().getClassifierName() + "__" + getName();
	
		MethodAsContinuableClosure continuableMethodGen = new MethodAsContinuableClosure();
		continuableMethodGen.generate(libraryScope);
	}
		/*
		ClassGen cg = new ClassGen(methodClassName, DefaultTypes.BaseSegment.getClassName(), libraryScope.getTransformationContext().getFilename(),
				Constants.ACC_PUBLIC, new String[] { Runnable.class.getName() });
		
		cg.addEmptyConstructor(Constants.ACC_PUBLIC);

		// ClosureScope is used to allow access to transformation_ and modelManager_ fields 
		GenScope scope = new ClosureScope(libraryScope, cg);		
		generate(cg, scope, "run");

		scope.getTransformationContext().addExtraClass(cg.getJavaClass());
		
		// return scope;				
	}
	
	public void generate(ClassGen cg, GenScope scope, String methodName) {
		InstructionList il = new InstructionList();

		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				methodName, cg.getClassName(), // method, class
				il, cg.getConstantPool());
		
		scope.processMethod(mg);
		
		GenUtil.generate(this, cg, mg, scope);
		
		cg.addMethod(mg.getMethod());
	}	*/

	/**
	 * This is a facility class to reuse class generation mechanisms of closures
	 * @author jesusc
	 *
	 */
	public class MethodAsContinuableClosure extends ClosureDefJVMGen {
		public MethodAsContinuableClosure() {
			Parameter selfParameter = CoreFactory.eINSTANCE.createParameter();
			selfParameter.setName(MethodDefinitionJVMGen.this.getSelfVar().getName());			
			selfParameter.setType( EcoreUtil.copy(MethodDefinitionJVMGen.this.getSelfVar().getType()) );
						
			this.getFormalParameters().add(selfParameter);
			EList<Parameter> originalParameters = MethodDefinitionJVMGen.this.getFormalParameters();
			for (Parameter parameter : originalParameters) {
				this.getFormalParameters().add( EcoreUtil.copy(parameter) );
			}			
		}
		
		@Override
		public void generate(GenScope scope) {
			NewScopeResult closureClassScope = createClosureClass(scope);
			ClassGen     closureClass = closureClassScope.cg;
			ClosureScope closureScope = (ClosureScope) closureClassScope.scope;
			
			scope.getTransformationContext().addExtraClass(closureClass.getJavaClass());
		}
		
		@Override
		public String getInnerClassName(ClassGen cg) {
			return methodClassName;
		}	
		
		@Override
		public EList<Instruction> getInstructions() {
			return MethodDefinitionJVMGen.this.getInstructions();
		}
	}
	
	/*
	  
	  		public QForAllContents() {
			this.setName("ForAll" + QForAllJVMGen.this.getName());
			
			Parameter p = CoreFactory.eINSTANCE.createParameter();
			p.setName(QForAllJVMGen.this.getName());			
			p.setType( EcoreUtil.copy(QForAllJVMGen.this.getType()) );
			this.getFormalParameters().add(p);
		}
		
		@Override
		public EList<Instruction> getInstructions() {
			return QForAllJVMGen.this.getInstructions();
		}
		*/
	 
}
