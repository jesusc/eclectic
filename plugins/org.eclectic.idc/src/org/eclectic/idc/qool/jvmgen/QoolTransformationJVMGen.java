package org.eclectic.idc.qool.jvmgen;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FieldGen;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.RETURN;
import org.apache.bcel.generic.Type;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.DeclaredElement;
import org.eclectic.apidesc.patterns.ObserverDescription;
import org.eclectic.apidesc.patterns.UpdateMethod;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.core.MethodDefinition;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.ModelKind;
import org.eclectic.idc.core.NormalFunction;
import org.eclectic.idc.core.jvmgen.MethodDefinitionJVMGen;
import org.eclectic.idc.ecl_meta.KAttribute;
import org.eclectic.idc.ecl_meta.KClass;
import org.eclectic.idc.ecl_meta.KClassifier;
import org.eclectic.idc.ecl_meta.KReference;
import org.eclectic.idc.ecl_meta.KStructuralFeature;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableFunction;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.idc.jvm.runtime.MethodLibraryBase;
import org.eclectic.idc.jvm.runtime.QoolTransformationBase;
import org.eclectic.idc.qool.InlineModel;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.Queue;
import org.eclectic.idc.qool.Segment;
import org.eclectic.idc.qool.impl.QoolTransformationImpl;
import org.eclipse.emf.common.util.EList;

public class QoolTransformationJVMGen extends QoolTransformationImpl {

	public void generate(JVMCompilationResult result, MetamodelManager metamodelManager) {
		TransformationContext context = new TransformationContext(this, metamodelManager);
		result.addTransformation(context);

		// 1. Generate qool transformation class
		ClassGen cg = new ClassGen(context.getRuntimeClassName(), QoolTransformationBase.class.getName(),
				context.getFilename(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		// 1. Generate external classes
		generateObserverClasses(cg, context, metamodelManager);
		
		// 3. Set up the rest
		GenScope scope   = new GenScope(context, cg);           

		//cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		createConstructor(scope, cg);

		// add a property for each queue
		CommonGen.generateQueuesFields(CommonGen.allQueues(this), scope, cg);
		createConfigureMethod(scope, cg);
		
		// Generate segment classes
		for (Segment sf : getSegments()) {
			QoolSegmentJVMGen jvmS = (QoolSegmentJVMGen) sf;
			jvmS.generateContinuableClass(scope);
		}
				
		// TODO: Repeated from TransformationJVMGen
		
		// generate start method		
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		
		// String startMethod = "start_";
		String startMethod = "run";
		
		MethodGen startMg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				startMethod, null, // method, class
				il, cg.getConstantPool());
		scope.processMethod(startMg);		
		// Call pre if needed		
		
		// start the execution
		for (ModelDefinition m : getModels()) {
			if ( m.getKind() == ModelKind.IN ) {
				il.append(InstructionConstants.THIS);
				il.append(ifact.createConstant(m.getName()));
				il.append(ifact.createInvoke(scope.getTransformationContext().getRuntimeClassName(), "fillQueues",
						Type.VOID, new Type[] { Type.STRING }, Constants.INVOKESPECIAL));				
			}
			
			/*
			QueueJVMGen jvmQ = (QueueJVMGen) q;
			il.append(ifact.createNew(jvmQ.getType().getClassName()));
			il.append(new DUP());		

			// push this
			if ( q instanceof ModelElementQueue ) {
				il.append(InstructionConstants.THIS);
				il.append(ifact.createGetField(scope.getTransformationContext().getRuntimeClassName(), jvmQ.getFieldName(), jvmQ.getType()));
				
				il.append(ifact.createInvoke(scope.getTransformationContext().getRuntimeClassName(), "fillModelQueue",
						Type.VOID, new Type[] { DefaultTypes.IQueue }, Constants.INVOKESPECIAL));

			}
			*/
		}
		
		for (Segment sf : getSegments()) {
			QoolSegmentJVMGen jvmS = (QoolSegmentJVMGen) sf;
			jvmS.genContinuableCallCode(scope, cg, startMg);

			// GenerableFunction function = (GenerableFunction) sf;
			// function.genFunctionCallCode(cg, startMg);
		}	
				
		/*
		if ( getPre() != null ) {
			GenerableFunction genPre = (GenerableFunction) getPre();
			genPre.genCallCode(cg, startMg);
		}
		*/

		// Generate call to perform the clean up
		il.append(InstructionConstants.THIS);
		il.append(ifact.createInvoke(DefaultTypes.QoolTransformation.getClassName(), "cleanUp",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));		
		
		
		il.append(InstructionConstants.RETURN);
		
		startMg.setMaxLocals();
		startMg.setMaxStack();
		
		cg.addMethod(startMg.getMethod());
		
		context.setJavaClass( cg.getJavaClass() );
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

        Collection<Queue> queues = CommonGen.allQueues(this);
		for (Queue q : queues) {
			QueueJVMGen jvmQ = (QueueJVMGen) q;
			jvmQ.generateInitField(il, ifact, scope);
		}
		
                
        il.append(InstructionConstants.RETURN);

        mg.setMaxStack();
        cg.addMethod(mg.getMethod());		
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

		// Begind-of configure internal models		
		for (InlineModel m : getInlineModels()) {
			String mmBuilderClass = "org.eclectic.modeling.emf.EMFMetamodelBuilder";

			il.append(ifact.createNew(mmBuilderClass));		
			il.append(InstructionConstants.DUP);		

			il.append(ifact.createConstant(this.getName()));
			il.append(ifact.createConstant(m.getName()));
			il.append(ifact.createNew(DefaultTypes.JavaListConverter.getClassName()));
			il.append(InstructionConstants.DUP);
			il.append(ifact.createInvoke(DefaultTypes.JavaListConverter.getClassName(), "<init>", Type.VOID, Type.NO_ARGS, Constants.INVOKESPECIAL));
			
			il.append(ifact.createInvoke(mmBuilderClass, "<init>",
					Type.VOID, new Type[] { Type.STRING, Type.STRING, DefaultTypes.ICollectionConverter }, Constants.INVOKESPECIAL));
		
			for(KClassifier kc : m.getClassifiers()) {
				KClass kclass = (KClass) kc;
				il.append(InstructionConstants.DUP);
				
				il.append(ifact.createConstant(kclass.getName()));
				il.append(ifact.createInvoke(mmBuilderClass, "addMetaclass",
						Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
				
				for(KStructuralFeature f : kclass.getFeatures()) {
					if ( f instanceof KReference ) {
						KReference r = (KReference) f;
						
						il.append(InstructionConstants.DUP);
						il.append(ifact.createConstant(kclass.getName()));
						il.append(ifact.createConstant(f.getName()));
						// il.append(ifact.createConstant(r.getKtype().getName())); // TODO: KType != null
						il.append(InstructionConstants.ACONST_NULL);
						il.append(ifact.createConstant(f.isIsMultivalued()));
						il.append(ifact.createInvoke(mmBuilderClass, "addReference",
								Type.VOID, new Type[] { Type.STRING, Type.STRING, Type.STRING, Type.BOOLEAN }, Constants.INVOKEVIRTUAL));					
					} else {
						KAttribute a = (KAttribute ) f;
						
						il.append(InstructionConstants.DUP);
						il.append(ifact.createConstant(kclass.getName()));
						il.append(ifact.createConstant(f.getName()));
						// il.append(ifact.createConstant(a.getKtype().getName())); // TODO: KType != null
						il.append(ifact.createConstant(a.getKtypeName())); // TODO: KType != null
						// il.append(InstructionConstants.ACONST_NULL);
						il.append(ifact.createConstant(f.isIsMultivalued()));
						il.append(ifact.createInvoke(mmBuilderClass, "addAttribute",
								Type.VOID, new Type[] { Type.STRING, Type.STRING, Type.STRING, Type.BOOLEAN }, Constants.INVOKEVIRTUAL));							
					}
				}
			}

			il.append(ifact.createNew(DefaultTypes.BasicMethodHandler));
			il.append(InstructionConstants.DUP);
			scope.generateGetModelManager();
			il.append(ifact.createInvoke(DefaultTypes.BasicMethodHandler.getClassName(), "<init>",
					Type.VOID, new Type[] { DefaultTypes.ModelManager }, Constants.INVOKESPECIAL));

			scope.generateGetModelManager();
			il.append(InstructionConstants.SWAP);
			il.append(ifact.createInvoke(mmBuilderClass, "register",
					Type.VOID, new Type[] { DefaultTypes.ModelManager, Type.OBJECT }, Constants.INVOKEVIRTUAL));					
		}
		// End-of configure internal models
		
		// configure depedendent queues
        Collection<Queue> queues = CommonGen.getImportedQueues(this);
		for (Queue q : queues) {
			RequiredQueueJVMGen jvmQ = (RequiredQueueJVMGen) q;
			jvmQ.generateConfigure(il, ifact, scope);
		}		

		// configure optimizations
        Collection<Queue> allQueues = CommonGen.allQueues(this);
		for (Queue q : allQueues) {
			QueueJVMGen jvmQ = (QueueJVMGen) q;

			// The queue has to be on top of the stack
	        il.append(InstructionConstants.THIS); // Push `this'
			il.append(ifact.createGetField(cg.getClassName(), jvmQ.getFieldName(), jvmQ.getType()));
			il.append(ifact.createCheckCast(jvmQ.getType()));
			jvmQ.generateConfigureOptimizations(il, ifact, scope);
			il.append(InstructionConstants.POP);
		
		}

		il.append(InstructionConstants.RETURN);
		
		startMg.setMaxLocals();
		startMg.setMaxStack();
		
		cg.addMethod(startMg.getMethod());		
	}

	// Begin-of observer API
	private void generateObserverClasses(ClassGen cg, TransformationContext context, MetamodelManager metamodelManager) {
		for (ModelDefinition model : getModels()) {
			if ( model.getKind() == ModelKind.IN && model.getMetamodel() != null ) {
				Object description = metamodelManager.getDescription(model.getMetamodel().getPath());
				if ( description instanceof ApiDescription ) {
					EList<DeclaredElement> declaredElements = ((ApiDescription) description).getDeclaredElements();
					for (DeclaredElement declaredElement : declaredElements) {
						if ( declaredElement instanceof ObserverDescription ) {
							String cname = generateObserverClass(model, (ObserverDescription) declaredElement, context);
							createObserverCreatorMethod(cg, (ObserverDescription) declaredElement, cname);
						}
					}
				}
			}
		}
	}

	private void createObserverCreatorMethod(ClassGen cg, ObserverDescription observer, String observerClassName) {
		final String methodName = "create" + observer.getName();
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, new ObjectType(observerClassName), new Type[] { } , null, methodName,
                cg.getClassName(), il, cg.getConstantPool());
		
		il.append(ifact.createNew(observerClassName));
		il.append(InstructionConstants.DUP);
		il.append(InstructionConstants.THIS);
		il.append(ifact.createInvoke(observerClassName, "<init>",
				Type.VOID, new Type[] { DefaultTypes.QoolTransformation }, Constants.INVOKESPECIAL));
				
		il.append(InstructionFactory.ARETURN);	
		
		mg.setMaxLocals();
		mg.setMaxStack();
		
		cg.addMethod(mg.getMethod());		
	}

	private String generateObserverClass(ModelDefinition model, ObserverDescription observer, TransformationContext context) {
		final String className = context.getRuntimeClassName() + "$" + observer.getName();
		final String transformationFieldName = "transformation_";
		ClassGen cg = new ClassGen(className, observer.getObserverClass(),
				context.getFilename(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		cg.addField(new FieldGen(Constants.ACC_PUBLIC, DefaultTypes.QoolTransformation, 
				transformationFieldName, cg.getConstantPool()).getField());			

		// constructor
		InstructionList constructorIl = new InstructionList();
		InstructionFactory constructorIfact = new InstructionFactory(cg);
		MethodGen constructor = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, 
        		new Type[] { DefaultTypes.QoolTransformation } , null, "<init>",
                cg.getClassName(), constructorIl, cg.getConstantPool());

        constructorIl.append(InstructionConstants.THIS); // Push `this'
        constructorIl.append(new INVOKESPECIAL(cg.getConstantPool().addMethodref(cg.getSuperclassName(), "<init>", "()V")));

		constructorIl.append(InstructionFactory.THIS);
		constructorIl.append(new ALOAD(1));
		constructorIl.append( constructorIfact.createPutField(cg.getClassName(), transformationFieldName, DefaultTypes.QoolTransformation) );		
        constructorIl.append(InstructionFactory.RETURN);
		constructor.setMaxLocals();
		constructor.setMaxStack();
        cg.addMethod(constructor.getMethod());
        // end-of constructor
        
        
		EList<UpdateMethod> methods = observer.getUpdateMethods();
		for (UpdateMethod updateMethod : methods) {
			EList<String> ptypes = updateMethod.getParameterTypes();
			InstructionList il = new InstructionList();
			InstructionFactory ifact = new InstructionFactory(cg);
			// TODO: Assuming void return type
			// TODO: Assuming object types

			Type[] types = new Type[ptypes.size()];
			int i = 0;
			for(String strType : ptypes) {
				types[i++] = new ObjectType(strType);
			}
			MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, types, null, updateMethod.getName(),
	                cg.getClassName(), il, cg.getConstantPool());
						
			// TODO: assuming only 1 interest parameter
			assert(updateMethod.getInterest().size() == 1);
			il.append(InstructionConstants.THIS); 
			il.append(ifact.createGetField(className, transformationFieldName, DefaultTypes.QoolTransformation));
			il.append(ifact.createConstant(model.getName()));
			il.append(new ALOAD(updateMethod.getInterest().get(0) + 1));
			il.append(ifact.createInvoke(DefaultTypes.QoolTransformation.getClassName(), "addObjectToQueues",
					Type.VOID, new Type[] { Type.STRING, Type.OBJECT }, Constants.INVOKEVIRTUAL));
			il.append(InstructionFactory.RETURN);
			mg.setMaxLocals();
			mg.setMaxStack();			
			cg.addMethod(mg.getMethod());
		}
		
		context.addExtraClass(cg.getJavaClass());
		
		return className;
	}
	
	// End-of observer API
}
