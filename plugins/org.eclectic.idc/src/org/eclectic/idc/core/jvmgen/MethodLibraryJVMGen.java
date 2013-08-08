package org.eclectic.idc.core.jvmgen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.MethodDefinition;
import org.eclectic.idc.core.impl.MethodLibraryImpl;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.idc.jvm.runtime.MethodLibraryBase;
import org.eclectic.idc.qool.Queue;
import org.eclectic.idc.qool.jvmgen.QueueJVMGen;
import org.eclectic.idc.qool.jvmgen.RequiredQueueJVMGen;

public class MethodLibraryJVMGen extends MethodLibraryImpl {
	private static final String START_METHOD = "start_";
	
	public void generate(JVMCompilationResult result) {
		TransformationContext context = new TransformationContext(this, null);
		result.addTransformation(context);

		
		ClassGen cg = new ClassGen(context.getRuntimeClassName(), MethodLibraryBase.class.getName(),
				context.getFilename(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		GenScope scope   = new GenScope(context, cg);           

		// This is only when there are navigation methods (I should add a marker in MethodLibrary metaclass)
		generateWrapperClasses(scope);

		
		for (MethodDefinition md : getMethods()) {
			MethodDefinitionJVMGen jvmMd = (MethodDefinitionJVMGen) md;
			jvmMd.generateContinuableClass(scope);
		}

		CommonGen.generateQueuesFields(CommonGen.getImportedQueues(this), scope, cg);
		
		// For the moment I'm going to generate the methods here, but this may go into
		// another class
		generateUniqueMethods(scope);

		createConfigureMethod(scope, cg);
		createStartMethod(scope, cg);
		
		//cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		createConstructor(scope, cg);
		
		context.setJavaClass( cg.getJavaClass() );		
	}
	
	
	/**
	 * Generates one class per metaclass referenced in the library.
	 * The class will contain the methods assigned to this metaclass.
	 * 
	 * @param scope
	 */
	private void generateWrapperClasses(GenScope scope) {
		HashMap<String, ArrayList<MethodDefinitionJVMGen>> map = new HashMap<String, ArrayList<MethodDefinitionJVMGen>>();

		// Index by metaclass
		for (MethodDefinition md : getMethods()) {
			String cn = md.getType().getClassifierName();
			ArrayList<MethodDefinitionJVMGen> list = map.get(cn);			
			if ( list == null ) {
				list = new ArrayList<MethodDefinitionJVMGen>();
				map.put(cn, list);
			}
			
			list.add((MethodDefinitionJVMGen) md);
		}
		
		for (String metaclassName : map.keySet()) {
			generateWrapperClass(scope, metaclassName, map.get(metaclassName));
		}
		
	}


	public class LibraryMethodTransformationContext extends TransformationContext {

		private String metaclassName;

		public LibraryMethodTransformationContext(String metaclassName, CodeUnit transformation,
				MetamodelManager metamodelManager) {
			super(transformation, metamodelManager);
			this.metaclassName = metaclassName;
		}
		
		@Override
		public String getRuntimeClassName() {
			return super.getRuntimeClassName() + "$" + "wrap_" + metaclassName;
		}
		
		
	}
	
	private void generateWrapperClass(GenScope parentScope,
			String metaclassName, List<MethodDefinitionJVMGen> methods) {

		LibraryMethodTransformationContext context = new LibraryMethodTransformationContext(metaclassName, this, null);
		
		String className = context.getRuntimeClassName();
		ClassGen cg = new ClassGen(className, IdcTransformationBase.class.getName(),
				context.getFilename(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] { IMethodWrapper.class.getName() });

		// Impl. field to hold the actual object
		cg.addField(new FieldGen(Constants.ACC_PUBLIC, Type.OBJECT, 
				"impl", cg.getConstantPool()).getField());			

		GenScope scope = new GenScope(context, cg);           

		// Create the constructor
		{
			InstructionList il = new InstructionList();
			InstructionFactory ifact = new InstructionFactory(cg);

			MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, new Type[] { Type.OBJECT } , null, "<init>",
	                cg.getClassName(), il, cg.getConstantPool());
	        scope.processMethod(mg);		
	        
			// call super
	        il.append(InstructionConstants.THIS); // Push `this'
	        il.append(new INVOKESPECIAL(cg.getConstantPool().addMethodref(cg.getSuperclassName(), "<init>", "()V")));
			        
	        // Set impl
	        il.append( InstructionConstants.THIS );
			il.append( InstructionConstants.ALOAD_1 );
	        il.append( ifact.createPutField(cg.getClassName(), "impl", Type.OBJECT) );
			
	        il.append(InstructionConstants.RETURN);
	        
			mg.setMaxLocals();
			mg.setMaxStack();
			
			scope.getClassGen().addMethod(mg.getMethod());		
		}
		// constructor
		/*
        il.append( InstructionConstants.THIS );
		il.append( ifact.createConstant(this.getName()) );
        il.append( ifact.createPutField(cg.getClassName(), "name", Type.STRING) );
		*/

		// Begin-of methods
		for (MethodDefinitionJVMGen methodDef : methods) {
			InstructionList il = new InstructionList();
			InstructionFactory ifact = new InstructionFactory(scope.getConstantPool());

			Type[] paramTypes = new Type[methodDef.getFormalParameters().size()];
			String[] paramNames = new String[paramTypes.length];
			for(int i = 0; i < methodDef.getFormalParameters().size(); i++) {
				paramTypes[i] = Type.OBJECT;
				paramNames[i] = methodDef.getFormalParameters().get(i).getName();
			}
		
			String methodName = methodDef.getName();
			MethodGen method = new MethodGen(Constants.ACC_PUBLIC, Type.OBJECT, 
				paramTypes, paramNames, methodName, scope.getClassGen().getClassName(), 
				il, scope.getConstantPool());

			scope.processMethod(method);	
			
			LocalVariableGen selfVar = scope.newLocalVariable(methodDef.getSelfVar(), Type.OBJECT);
			
			// Get the implementation and put it in "self"
			il.append(InstructionFactory.THIS);
			il.append(ifact.createGetField(className, "impl", Type.OBJECT));
			il.append(new ASTORE( selfVar.getIndex() ));
			
			GenUtil.generate(methodDef, cg, method, scope, true);

			scope.getClassGen().addMethod(method.getMethod());				
		}
		// End-of methods

		parentScope.getTransformationContext().addExtraClass(cg.getJavaClass());
	}


	private void generateUniqueMethods(GenScope scope) {
		HashMap<String, ArrayList<MethodDefinitionJVMGen>> map = new HashMap<String, ArrayList<MethodDefinitionJVMGen>>();
		for (MethodDefinition md : getMethods()) {
			MethodDefinitionJVMGen jvmMd = (MethodDefinitionJVMGen) md;
			ArrayList<MethodDefinitionJVMGen> list = map.get(md.getName());			
			if ( list == null ) {
				list = new ArrayList<MethodDefinitionJVMGen>();
				map.put(md.getName(), list);
			}
			
			list.add(jvmMd);
		}	
		
		Set<Entry<String, ArrayList<MethodDefinitionJVMGen>>> entries = map.entrySet();
		for (Entry<String, ArrayList<MethodDefinitionJVMGen>> entry : entries) {
			generateMethodForMethods(scope, entry.getKey(), entry.getValue());
		}
	}
	


	private void generateMethodForMethods(GenScope scope, String methodName, ArrayList<MethodDefinitionJVMGen> value) {
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(scope.getConstantPool());

		MethodDefinitionJVMGen methodDef = value.get(0);
		if ( value.size() > 1 ) {
			System.out.println("WARNING: Don't know why I assumed that several definition of the same method may appear, probably because overloading...");
			System.out.println("         Not sure why this seems to work for e.g., UML2Java tao example...");
		}
		
		Type[] paramTypes = new Type[methodDef.getFormalParameters().size() + 1];
		String[] paramNames = new String[paramTypes.length];
		paramTypes[0] = Type.OBJECT; // Receptor object
		paramNames[0] = "self";
		for(int i = 0; i < methodDef.getFormalParameters().size(); i++) {
			paramTypes[i + 1] = Type.OBJECT;
			paramNames[i + 1] = methodDef.getFormalParameters().get(i).getName();
		}
		
		MethodGen method = new MethodGen(Constants.ACC_PUBLIC, Type.OBJECT, 
				paramTypes, paramNames, methodName, scope.getClassGen().getClassName(), 
				il, scope.getConstantPool());

		scope.processMethod(method);		
		// todo: call pre??
		
		/*
		il.append(InstructionConstants.THIS);
		il.append(ifact.createConstant( methodName ) );
		il.append(new ALOAD(1));
		il.append(ifact.createInvoke(MethodLibraryBase.class.getName(), "performInvocation",
				Type.OBJECT, new Type[] { Type.STRING, Type.OBJECT }, Constants.INVOKEVIRTUAL));							
		*/
		// I think that performInvocation does not actually work because class loader issues, so 
		// it was replaced by getMethodHandler but I didn't change this piece of code, 8/Nov/2012, trying...

		il.append(InstructionConstants.THIS);
		il.append(ifact.createConstant( methodName ) );
		il.append(new ALOAD(1));
		il.append(ifact.createInvoke(MethodLibraryBase.class.getName(), "getMethodHandler", 
        		DefaultTypes.RunnableClosure, new Type[] { Type.STRING, Type.OBJECT }, Constants.INVOKEVIRTUAL));		

		for(int i = 0; i < paramTypes.length; i++) {
			il.append(new ALOAD(i + 1)); // parameters
		}
		String callMethod = "call_" + paramTypes.length;
        il.append(ifact.createInvoke(DefaultTypes.RunnableClosure.getClassName(), callMethod, Type.OBJECT,
        		paramTypes, Constants.INVOKEVIRTUAL));

		
		il.append(InstructionConstants.ARETURN);
		
		method.setMaxLocals();
		method.setMaxStack();
		
		scope.getClassGen().addMethod(method.getMethod());		
		
	}

	private void createStartMethod(GenScope scope, ClassGen cg) {
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		
		MethodGen startMg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				START_METHOD, null, // method, class
				il, cg.getConstantPool());
		scope.processMethod(startMg);		
		il.append(InstructionConstants.RETURN);
		
		startMg.setMaxLocals();
		startMg.setMaxStack();
		
		cg.addMethod(startMg.getMethod());		
	}
	
	private void createConfigureMethod(GenScope scope, ClassGen cg) {
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		
		MethodGen startMg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				CommonGen.CONFIGURE_METHOD, null, // method, class
				il, cg.getConstantPool());
		scope.processMethod(startMg);		
		// todo: call pre??
		
		// configure depedendent queues
        Collection<Queue> queues = CommonGen.getImportedQueues(this);
		for (Queue q : queues) {
			RequiredQueueJVMGen jvmQ = (RequiredQueueJVMGen) q;
			jvmQ.generateConfigure(il, ifact, scope);
		}		
		
		// register methods
        for(MethodDefinition m : getMethods()) {
        	MethodDefinitionJVMGen mdJvm = (MethodDefinitionJVMGen) m;
    		il.append(InstructionConstants.THIS);
        	
    		il.append(ifact.createConstant( m.getName() ));
    		il.append(ifact.createConstant( m.getType().getModel().getName() ) );
    		il.append(ifact.createConstant( m.getType().getClassifierName()) );
    		il.append(ifact.createConstant( mdJvm.getMethodClassName()) );
    		il.append(ifact.createInvoke(MethodLibraryBase.class.getName(), "registerMethod",
    				Type.VOID, new Type[] { Type.STRING, Type.STRING, Type.STRING, Type.STRING, }, Constants.INVOKEVIRTUAL));							
        }

		il.append(InstructionConstants.RETURN);
		
		startMg.setMaxLocals();
		startMg.setMaxStack();
		
		cg.addMethod(startMg.getMethod());		
	}

	private void createConstructor(GenScope scope, ClassGen cg) {
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);

		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, new Type[] { } , null, "<init>",
                cg.getClassName(), il, cg.getConstantPool());
        scope.processMethod(mg);		
        
		// call super
        il.append(InstructionConstants.THIS); // Push `this'
        il.append(new INVOKESPECIAL(cg.getConstantPool().addMethodref(cg.getSuperclassName(), "<init>", "()V")));
		        
        // Set name
        il.append( InstructionConstants.THIS );
		il.append( ifact.createConstant(this.getName()) );
        il.append( ifact.createPutField(cg.getClassName(), "name", Type.STRING) );
        
        Collection<Queue> queues = CommonGen.getImportedQueues(this);
		for (Queue q : queues) {
			QueueJVMGen jvmQ = (QueueJVMGen) q;
			jvmQ.generateInitField(il, ifact, scope);
		}
        
        il.append(InstructionConstants.RETURN);

        mg.setMaxStack();
        cg.addMethod(mg.getMethod());	
	}
}
