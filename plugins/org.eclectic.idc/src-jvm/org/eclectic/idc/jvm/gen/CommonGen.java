package org.eclectic.idc.jvm.gen;

import java.util.Collection;
import java.util.LinkedList;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.ImportedModel;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.core.jvmgen.MethodLibraryJVMGen;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.ClosureScope;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.Queue;
import org.eclectic.idc.qool.jvmgen.QueueJVMGen;
import org.eclipse.emf.common.util.EList;

public class CommonGen {
	public static final String CONFIGURE_METHOD = "configure_";

	
	private static GenScopeModelManagerGetter genScopeModelManagerGetter = new GenScopeModelManagerGetter();
	private static ClosureScopeModelManagerGetter closureScopeModelManagerGetter = new ClosureScopeModelManagerGetter();
	
	
	static  abstract class AbstractModelManagerGetter {
		public void generateGetModel(Variable v, GenScope scope) {
			InstructionList il       = scope.getInstructionList();
			InstructionFactory ifact = scope.getInstructionFactory();

			try {
				String modelName = Processor.getModel(v, scope.getTransformationContext()).getModelName();
				generateGetModel(modelName, il, ifact, scope);
			} catch ( IdcException e ) {
				// System.out.println("Warning: " + e.getMessage());

				// no model found! -> obtain model dynamically
				generateGetModelManager(il, ifact, scope.getTransformationContext(), scope);

				// get the namespace for the EObject
				scope.loadVariable(v, il);
				il.append(ifact.createInvoke(DefaultTypes.ModelManager.getClassName(),
						"getNamespace", DefaultTypes.IModel, 
						new Type[] { ObjectType.OBJECT },
						Constants.INVOKEVIRTUAL));
			}
		}

		public void generateGetModel(String modelName, InstructionList il, InstructionFactory ifact, GenScope scope) {
			generateGetModelManager(il, ifact, scope.getTransformationContext(), scope);

			il.append( new LDC(ifact.getConstantPool().addString(modelName)) );
			il.append(ifact.createInvoke(DefaultTypes.ModelManager.getClassName(),
					"getNamespace", DefaultTypes.IModel, 
					new Type[] { Type.STRING },
					Constants.INVOKEVIRTUAL));
		}

		public abstract void generateGetModelManager(InstructionList il, InstructionFactory ifact, TransformationContext context, GenScope scope);
		public abstract void generateGetTransformation(InstructionList il, InstructionFactory ifact, GenScope scope);
	}

	// TODO: Maybe this two subclasses could be merged by having the same interface
	//       for getting the model manager and the current transformation...
	static class GenScopeModelManagerGetter extends AbstractModelManagerGetter {

		@Override
		public void generateGetModelManager(InstructionList il, InstructionFactory ifact, TransformationContext context, GenScope scope) {
			il.append( InstructionFactory.createLoad(Type.OBJECT, 0) );
			il.append( ifact.createInvoke(context.getRuntimeClassName(), 
					"getModelManager", DefaultTypes.ModelManager, new Type[] {}, Constants.INVOKEVIRTUAL) );
		}

		@Override
		public void generateGetTransformation(InstructionList il, InstructionFactory ifact, GenScope scope) {
			il.append( InstructionConstants.THIS );
		}

	}
	
	static class ClosureScopeModelManagerGetter extends AbstractModelManagerGetter {
		@Override
		public void generateGetModelManager(InstructionList il, InstructionFactory ifact, TransformationContext context, GenScope scope) {
			il.append( InstructionFactory.createLoad(Type.OBJECT, 0) );
			il.append( ifact.createGetField(((ClosureScope) scope).getJavaClassName(), "modelManager_", DefaultTypes.ModelManager));
		}		

		@Override
		public void generateGetTransformation(InstructionList il, InstructionFactory ifact, GenScope scope) {
			il.append( InstructionFactory.createLoad(Type.OBJECT, 0) );
			// TODO: Why this works, but getting the field from the runtime class doesn't...
			//       Because the type of IClosure.transformation_ is IdcTransformationBase, not the runtime class
			il.append( ifact.createGetField(((ClosureScope) scope).getJavaClassName(), "transformation_", DefaultTypes.IdcTransformation));
			// il.append( ifact.createGetField(((ClosureScope) scope).getJavaClassName(), "transformation_", new ObjectType(scope.getTransformationContext().getRuntimeClassName()) ));
		}
	}

	
	// --- //
	
	public static void generateGetModel(Variable receptor, GenScope scope) {
		genScopeModelManagerGetter.generateGetModel(receptor, scope);
	}
	
	public static void generateGetModel(Variable receptor, ClosureScope scope) {
		closureScopeModelManagerGetter.generateGetModel(receptor, scope);
	}
	
	public static void generateGetModelManager(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		genScopeModelManagerGetter.generateGetModelManager(il, ifact, scope.getTransformationContext(), scope);
	}
	
	public static void generateGetModelManager(ClosureScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		closureScopeModelManagerGetter.generateGetModelManager(il, ifact, scope.getTransformationContext(), scope);
	}
	

	// This method is *only* called by Create & ReadMeta instruction, since it knows the the name of the model
	// without further ado.
	public static void generateGetModel(String modelName, GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		genScopeModelManagerGetter.generateGetModel(modelName, il, ifact, scope);		
	}
	
	public static void generateGetModel(String modelName, ClosureScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		closureScopeModelManagerGetter.generateGetModel(modelName, il, ifact, scope);		
	}

	public static void generateGetTransformation(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		genScopeModelManagerGetter.generateGetTransformation(il, ifact, scope);		
	}
	
	public static void generateGetTransformation(ClosureScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		closureScopeModelManagerGetter.generateGetTransformation(il, ifact, scope);		
	}

	public static void printText(InstructionList il, InstructionFactory ifact, String text) {
		il.append(ifact.createConstant(text));
		print(il, ifact);
	}

	public static void print(InstructionList il, InstructionFactory ifact) {
		ObjectType p_stream = new ObjectType("java.io.PrintStream");
		il.append(ifact.createFieldAccess("java.lang.System", "out", p_stream,
                   Constants.GETSTATIC));
		il.append(InstructionConstants.SWAP);
		il.append(ifact.createInvoke("java.io.PrintStream", "println",
                 Type.VOID, new Type[] { Type.OBJECT },
                 Constants.INVOKEVIRTUAL));		
	}
	
	public static void printBoolean(InstructionList il, InstructionFactory ifact) {
		ObjectType p_stream = new ObjectType("java.io.PrintStream");
		il.append(ifact.createFieldAccess("java.lang.System", "out", p_stream,
                   Constants.GETSTATIC));
		il.append(InstructionConstants.SWAP);
		il.append(ifact.createInvoke("java.io.PrintStream", "println",
                 Type.VOID, new Type[] { Type.BOOLEAN },
                 Constants.INVOKEVIRTUAL));		
	}

	public static void generateGetQueue(GenScope scope, QueueJVMGen jvmQ) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();		

		scope.generateGetTransformation();		
		il.append(ifact.createCheckCast(new ObjectType(scope.getTransformationContext().getRuntimeClassName())));
		il.append(ifact.createGetField(scope.getTransformationContext().getRuntimeClassName(), jvmQ.getFieldName(), jvmQ.getType()));		
	}

	public static void generateQueuesFields(Collection<Queue> qs, GenScope scope, ClassGen cg) {
		for (Queue q : qs) {
			QueueJVMGen jvmQ = (QueueJVMGen) q;			
			cg.addField(new FieldGen(Constants.ACC_PUBLIC, jvmQ.getType(), jvmQ.getFieldName(), cg.getConstantPool()).getField());			
		}
	}

	public static Collection<Queue> getImportedQueues(CodeUnit unit) {
		LinkedList<Queue> qs = new LinkedList<Queue>();
		EList<ImportedModel> importedModels = unit.getImportedModels();
		for (ImportedModel importedModel : importedModels) {
			for (Queue q : importedModel.getCapabilityQueues()) {
				qs.add(q);
			}
		}
		return qs;
	}

	public static Collection<Queue> allQueues(QoolTransformation qt) {
		Collection<Queue> qs = getImportedQueues(qt);
		qs.addAll(qt.getQueues());
		return qs;
	}	
}
