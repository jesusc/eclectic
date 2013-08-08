package org.eclectic.idc.instr.jvmgen;

import java.util.Set;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.ICONST;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.impl.ClosureDefImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.ClosureScope;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.gen.OuterVariableSet;

public class ClosureDefJVMGen extends ClosureDefImpl implements GenerableInstruction {

	protected class NewScopeResult {
		public ClassGen cg;
		public GenScope scope;

		public NewScopeResult(ClassGen cg, GenScope scope) { this.cg = cg; this.scope = scope; } 
	}
	
	private ClassGen     closureClass = null;
	private ClosureScope closureScope = null;
	
	public ClassGen getClosureClass() {
		if ( closureClass == null ) throw new IllegalStateException();
		return closureClass;
	}
	
	
	public ClosureScope getClosureScope() {
		if ( closureScope == null ) throw new IllegalStateException();
		return closureScope;
	}
	
	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();		

		NewScopeResult closureClassScope = createClosureClass(scope);
		ClassGen     closureClass = closureClassScope.cg;
		ClosureScope closureScope = (ClosureScope) closureClassScope.scope;
		
		scope.getTransformationContext().addExtraClass(closureClass.getJavaClass());

		LocalVariableGen lvg  = scope.newLocalVariable(this, Type.OBJECT);
		
		// Create the closure instance 
		il.append(ifact.createNew(closureClass.getClassName()));		
		il.append(new DUP());		

		scope.generateGetTransformation();
		scope.generateGetModelManager();		
		il.append(ifact.createInvoke(closureClass.getClassName(), "<init>",
				Type.VOID, new Type[] { DefaultTypes.IdcTransformation, DefaultTypes.ModelManager }, Constants.INVOKESPECIAL));
				//Type.VOID, new Type[] { DefaultTypes.ModelManager }, Constants.INVOKESPECIAL));
				
		// This is a bit hard-wired because the OuterVariableSet 
		// is computed as a result of creating the closureClass...
		OuterVariableSet outers = closureScope.getOuterVariables();
		Set<Variable> o = outers.get();
		for (Variable variable : o) {
			il.append(new DUP());
			scope.loadVariable(variable, il);
			il.append(scope.getInstructionFactory().createPutField(closureClass.getClassName(), variable.getName(), Type.OBJECT));	
		}		
				
		il.append(new ASTORE(lvg.getIndex()));
	}
	
	private String innerClassName = null;
	private static int ClosureCounter = 0;
	
	public String getInnerClassName(ClassGen cg) {
		if ( innerClassName == null ) {
			innerClassName = cg.getClassName() + "$" + name + ClosureCounter++; 
		}
		return innerClassName;
	}

	protected NewScopeResult createClosureClass(GenScope parentScope) {		
		String closureSuperClass = DefaultTypes.RunnableClosure.getClassName();
		ClassGen closureClass = new ClassGen(getInnerClassName(parentScope.getClassGen()), 
				closureSuperClass,
				// IClosure.class.getName(),
				parentScope.getTransformationContext().getFilename(), // TODO: Is this the way of putting the filename? 
				Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		ClosureScope scope = new ClosureScope(parentScope, closureClass);
		
		createConstructor(scope, closureClass);
		
		closureClass.addEmptyConstructor(Constants.ACC_PUBLIC); // only to be used in "MethodLibraryBase" to instantiate
		closureClass.addMethod(createCallMethod(closureClass, scope, parentScope).getMethod());
		closureClass.addMethod(createRunMethod(closureClass, scope, parentScope).getMethod());
		
		
		//closureClass.addField(new FieldGen(Constants.ACC_PUBLIC, Type.INT, "numParameters_", scope.getConstantPool()).getField());
		
		/*
		// Load this new class
		ContinuationClassLoader.getInstance().add(closureClass.getJavaClass());

		if (continuationFree) {
			ContinuationClassLoader.getInstance().addMappingsToNotTransform(
					name);
		}
		*/
		return new NewScopeResult(closureClass, scope);
	}

	private void createConstructor(GenScope scope, ClassGen closureClass) {
        InstructionList il = new InstructionList();
        il.append(InstructionConstants.THIS); // Push `this'
        il.append(new INVOKESPECIAL(closureClass.getConstantPool().addMethodref(closureClass.getSuperclassName(), "<init>", "()V")));
        
        il.append(InstructionConstants.THIS); // Push `this'   
        il.append(scope.getInstructionFactory().createConstant(this.getFormalParameters().size()));
        il.append(scope.getInstructionFactory().createPutField(DefaultTypes.IClosure.getClassName(), "numParameters_", Type.INT));

        il.append(InstructionConstants.THIS); // Push `this'
        il.append(new ALOAD(1)); // first parameter
        il.append(scope.getInstructionFactory().createPutField(DefaultTypes.IClosure.getClassName(), "transformation_", DefaultTypes.IdcTransformation));	
        
        il.append(InstructionConstants.THIS); // Push `this'
        il.append(new ALOAD(2)); // second parameter
        il.append(scope.getInstructionFactory().createPutField(DefaultTypes.IClosure.getClassName(), "modelManager_", DefaultTypes.ModelManager));	
    	// TODO: It would be nice to have cross-checking between code being generated and framework code
        
        /*
        il.append(InstructionConstants.THIS); // Push `this'
        il.append(new ALOAD(1)); // first parameter
        il.append(scope.getInstructionFactory().createPutField(DefaultTypes.IClosure.getClassName(), "modelManager_", DefaultTypes.ModelManager));       
          */
                
        il.append(InstructionConstants.RETURN);

        MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, new Type[] { DefaultTypes.IdcTransformation, DefaultTypes.ModelManager } , null, "<init>",
        		closureClass.getClassName(), il, closureClass.getConstantPool());
        
        // mg.setMaxStack(3);
        mg.setMaxStack();
        
        
        closureClass.addMethod(mg.getMethod());		
	}

	private MethodGen createCallMethod(ClassGen closureClass, ClosureScope scope, GenScope parentScope) {
		InstructionList il = new InstructionList();
		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.OBJECT, // return type
				getParameterTypes(), getParameterNames(), // arg
				// names
				"call", closureClass.getClassName(), // method, class
				il, closureClass.getConstantPool());
		
		// TODO: Do it directly in the constructor!!
		scope.processMethod(mg);
		
		GenUtil.generate(this, closureClass, mg, scope, true);

		// Create proper fields in the class, they will be set when the
		// instance is created
		Set<Variable> o = scope.getOuterVariables().get();
		for (Variable variable : o) {
			closureClass.addField(new FieldGen(Constants.ACC_PUBLIC, Type.OBJECT, variable.getName(), closureClass.getConstantPool()).getField());
		}

		return mg;
	}

	private MethodGen createRunMethod(ClassGen closureClass, ClosureScope scope, GenScope parentScope) {
		InstructionList il = new InstructionList();
		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, 
				Type.NO_ARGS, new String[] {}, 
				"run", closureClass.getClassName(), // method, class
				il, closureClass.getConstantPool());

		scope.processMethod(mg);
		InstructionFactory ifact = scope.getInstructionFactory();		
		
		il.append(InstructionFactory.THIS);
		
		for(int i = 0; i < formalParameters.size(); i++) {
			il.append(InstructionFactory.THIS);
			// with this, I get class-circularity-error
			// il.append(ifact.createGetField(DefaultTypes.RunnableClosure.getClassName(), "params", DefaultTypes.ArrayList));
			il.append(ifact.createGetField(closureClass.getClassName(), "params", DefaultTypes.ArrayList));
			il.append(new ICONST(i));
			il.append(ifact.createInvoke(DefaultTypes.ArrayList.getClassName(), "get",
					Type.OBJECT, new Type[] { Type.INT }, Constants.INVOKEVIRTUAL));
		}
		
		il.append(ifact.createInvoke(closureClass.getClassName(), "call",
				Type.OBJECT, getParameterTypes(), Constants.INVOKEVIRTUAL));

		il.append(InstructionFactory.THIS);
		il.append(InstructionConstants.SWAP);
		il.append(ifact.createPutField(closureClass.getClassName(), "result", Type.OBJECT));

		InstructionHandle end = il.append(InstructionConstants.RETURN);
	
		// TODO: Line numbers
		mg.setMaxStack();
		mg.setMaxLocals();

		return mg;
	}
	

	private Type[] getParameterTypes() {
		Type[] types = new Type[getFormalParameters().size()];
		for(int i = 0; i < formalParameters.size(); i++) {
			types[i] = Type.OBJECT;
		}
		return types;
	}

	private String[] getParameterNames() {
		String[] names = new String[getFormalParameters().size()];
		for(int i = 0; i < getFormalParameters().size(); i++) {
			names [i] = getFormalParameters().get(i).getName();
		}
		return names ;
	}

}
