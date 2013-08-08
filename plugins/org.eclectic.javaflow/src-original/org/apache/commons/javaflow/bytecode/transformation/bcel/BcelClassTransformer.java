/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.javaflow.bytecode.transformation.bcel;

import org.apache.bcel.Constants;
import org.apache.bcel.Repository;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.ClassFormatException;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.ConstantCP;
import org.apache.bcel.classfile.ConstantNameAndType;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.IFEQ;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.InstructionTargeter;
import org.apache.bcel.generic.InvokeInstruction;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.PUSH;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.TABLESWITCH;
import org.apache.bcel.generic.TargetLostException;
import org.apache.bcel.generic.Type;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.SyntheticRepository;
import org.apache.bcel.verifier.exc.AssertionViolatedException;
import org.apache.commons.javaflow.bytecode.Continuable;
import org.apache.commons.javaflow.bytecode.StackRecorder;
import org.apache.commons.javaflow.bytecode.transformation.ResourceTransformer;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.ControlFlowGraph;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.ExceptionHandler;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.ExecutionPath;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.ExecutionVisitor;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.Frame;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.InstructionContext;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.LocalVariables;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.OperandStack;
import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.UninitializedObjectType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link ResourceTransformer} that uses BCEL.
 *
 * @deprecated use the AsmClassTransformer instead
 */
public final class BcelClassTransformer implements ResourceTransformer {

    private final static Log log = LogFactory.getLog(BcelClassTransformer.class);

    private static final String STACK_RECORDER_CLASS = StackRecorder.class.getName();
    private static final ObjectType STACK_RECORDER_TYPE = new ObjectType(STACK_RECORDER_CLASS);
    private static final String CONTINUABLE_CLASS = Continuable.class.getName();
    private static final String STACK_METHOD = "get";
    private static final String POP_METHOD = "pop";
    private static final String PUSH_METHOD = "push";
    private static final String RESTORING_FIELD = "isRestoring";
    private static final String CAPTURING_FIELD = "isCapturing";

    private boolean currentMethodStatic = false;
    public static boolean debug = false;

    /**
     * BCEL uses a repository object to load/store information related to other classes,
     * which are sometimes necessary to perform bytecode instrumentation.
     * <p>
     * Can be null, in which case the global BCEL repository is assumed to work.
     *
     * <p>
     * repository is a singleton instance in BCEL, so we have to be careful when changing it.
     * See BugZilla 38057. This is fundamentally broken.
     */
    private org.apache.bcel.util.Repository repository;

    /**
     * Since BCEL repository is a global resource, access needs to be controlled among
     * {@link BcelClassTransformer} instances.
     */
    private static final Object repositoryLock = new Object();

    static {
        try {
            debug = System.getProperty(BcelClassTransformer.class.getName()+".debug")!=null;
        } catch (SecurityException e) {
            // assume no debugging
        }
    }

    public BcelClassTransformer() {
    }

    /**
     * Creates an instance that uses the passed classpath for the resolution
     * of referenced classes.
     *
     * @param classPathFile The classpath to use for class file resolution.
     */
    public BcelClassTransformer(File classPathFile) {
        ClassPath classPath = new ClassPath( classPathFile.getAbsolutePath() );
        this.repository = SyntheticRepository.getInstance( classPath );
    }

    public BcelClassTransformer(org.apache.bcel.util.Repository repository) {
        this.repository = repository;
    }

    public byte[] transform(final byte[] original) {
        if(repository == null) {
            return doTransform(original);
        } else {
            synchronized(repositoryLock) {
                org.apache.bcel.util.Repository old = Repository.getRepository();
                Repository.setRepository(repository);
                try {
                    return doTransform(original);
                } finally {
                    Repository.setRepository(old);
                }
            }
        }
    }

    private byte[] doTransform(final byte[] original) {
        
        final InputStream is = new ByteArrayInputStream(original);
        
        final ClassParser parser = new ClassParser(is, null);
        JavaClass javaClazz = null;
        try {
            javaClazz = parser.parse();
        } catch (ClassFormatException e2) {
            e2.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } finally {
        	try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
        }
        }
        
        if (javaClazz == null) {
        	return null;
        }
        
        Repository.addClass(javaClazz);
        
        log.debug("transforming class " + javaClazz.getClassName());

        //final JavaClass clazz = Repository.lookupClass(clazzName);

        {// check if this class is already instrumented
            String[] intfs = javaClazz.getInterfaceNames();
            for( int i=0; i<intfs.length; i++ )
                if(intfs[i].equals(CONTINUABLE_CLASS)) {
                    // no need to instrument further
                    log.debug(javaClazz.getClassName()+" is already instrumented. Skipping");
                    return original;
                }
        }

        final ClassGen clazzGen = new ClassGen(javaClazz);
        final ConstantPoolGen cp = clazzGen.getConstantPool();

        if(debug) {
            dump(javaClazz, ".orig");
        }

        // vistor to build the frame information
        final ExecutionVisitor ev = new ExecutionVisitor();
        ev.setConstantPoolGen(cp);
        // obsolete, but neccesary to execute the InvokeContext
        //final InstConstraintVisitor icv = new InstConstraintVisitor();
        //icv.setConstantPoolGen(cp);

        final Method[] methods = clazzGen.getMethods();
        for (int i = 0; i < methods.length; i++) {
            final MethodGen method = new MethodGen(methods[i], clazzGen.getClassName(), cp);
            currentMethodStatic = methods[i].isStatic();
            if (needsRewriting(method)) {
                // analyse the code of the method to create the frame
                // information about every instruction
                final ControlFlowGraph cfg = new ControlFlowGraph(method);

                analyse(clazzGen, method, cfg, ev);

                try {
                    // add intercepting code
                    rewrite(method, cfg);
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

                clazzGen.replaceMethod(methods[i], method.getMethod());
            }
        }

        clazzGen.addInterface(CONTINUABLE_CLASS);
        JavaClass newClass = clazzGen.getJavaClass();
        final byte[] changed = newClass.getBytes();

        if(debug) {
            dump(newClass, ".rewritten");
        }

        return changed;
    }

    /**
     * Dumps the class file to the curent directory for debugging.
     */
    private void dump(JavaClass javaClazz, String suffix) {
        String path = javaClazz.getClassName()+suffix;

        final byte[] orig = javaClazz.getBytes();

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            
            log.debug("writing " + path);
            
            out.write(orig);
            out.flush();
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (final IOException e1) {
                log.error(e1.getMessage(), e1);
            } finally {
                out = null;
            }
        }

        try {
            out = new FileOutputStream(path + ".java");

            log.debug("writing " + path + ".java");

            final DecompilingVisitor v = new DecompilingVisitor(javaClazz, out);
            v.start();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (final IOException e1) {
                log.error(e1.getMessage(), e1);
            } finally {
                out = null;
            }
        }
    }

    private boolean needsRewriting(MethodGen m) {
        if (m.getName().equals(Constants.CONSTRUCTOR_NAME)
                || m.getName().equals(Constants.STATIC_INITIALIZER_NAME)
                || m.isNative()
                || m.isAbstract()) {
            return false;
        } else {
            return true;
        }
    }

    private void analyse(ClassGen clazz, MethodGen method, ControlFlowGraph cfg, ExecutionVisitor ev) {
        log.debug("analyse " + method.getName());

        final Frame vanillaFrame = createInitialFrame(method, clazz);

        final List<InstructionContext> ics = new ArrayList<InstructionContext>(); // Type: InstructionContext
        final List<ExecutionPath> ecs = new ArrayList<ExecutionPath>(); // Type: ExecutionPath

        final InstructionContext start = cfg.contextOf(method.getInstructionList().getStart());

        start.execute(vanillaFrame, ExecutionPath.EMPTY, ev);
        // new ArrayList() <=> no Instruction was executed before
        //                  => Top-Level routine (no jsr call before)
        ics.add(start);
        ecs.add(ExecutionPath.EMPTY);

        while (!ics.isEmpty()) {
            final InstructionContext u = ics.remove(0);
            final ExecutionPath oldchain = ecs.remove(0);
            final ExecutionPath newchain = oldchain.append(u);

            if ((u.getInstruction().getInstruction()) instanceof RET) {
                // where did we come from? this JSR
                InstructionHandle jsr = oldchain.lastExecutionJSR().getInstruction();
                // so the next instruction to execute will be this
                final InstructionContext theSuccessor = cfg.contextOf(jsr.getNext());

                if (theSuccessor.execute(u.getOutFrame(oldchain), newchain, ev)) {
                    ics.add(theSuccessor);
                    ecs.add(newchain);
                }
            } else { // "not a ret"
                // Normal successors. Add them to the queue of successors.
                final InstructionContext[] succs = u.getSuccessors();
                for (int s = 0; s < succs.length; s++) {
                    final InstructionContext v = succs[s];
                    //if (v.execute(u.getOutFrame(oldchain), newchain, icv, ev)) {
                    if (v.execute(u.getOutFrame(oldchain), newchain, ev)) {
                        ics.add(v);
                        ecs.add(newchain);
                    }
                }
            }
            // Exception Handlers. Add them to the queue of successors.
            final ExceptionHandler[] exc_hds = u.getExceptionHandlers();
            for (int s = 0; s < exc_hds.length; s++) {
                final InstructionContext v = cfg.contextOf(exc_hds[s].getHandlerStart());
                // TODO: the "oldchain" and "newchain" is used to determine the
                // subroutine
                // we're in (by searching for the last JSR) by the
                // InstructionContext
                // implementation. Therefore, we should not use this chain
                // mechanism
                // when dealing with exception handlers.

                final LocalVariables newLocals = u.getOutFrame(oldchain).getLocals();
                final OperandStack newStack = new OperandStack(
                        u.getOutFrame(oldchain).getStack().maxStack(),
                        (exc_hds[s].getExceptionType() == null ? Type.THROWABLE : exc_hds[s]
                        .getExceptionType()));
                final Frame newFrame = new Frame(newLocals, newStack);

                if (v.execute(newFrame, ExecutionPath.EMPTY, ev)) {
                    ics.add(v);
                    ecs.add(ExecutionPath.EMPTY);
                }
            }
        }
    }

    /**
     * Creates a {@link Frame} object that represents the state of the stack frame
     * at the beginning of a method.
     */
    private Frame createInitialFrame(MethodGen method, ClassGen clazz) {
        final Frame vanillaFrame = new Frame(method.getMaxLocals(), method.getMaxStack());
        if (!method.isStatic()) {
            if (method.getName().equals(Constants.CONSTRUCTOR_NAME)) {
                Frame._this = new UninitializedObjectType(new ObjectType(clazz.getClassName()));
                vanillaFrame.getLocals().set(0, new UninitializedObjectType(new ObjectType(clazz.getClassName())));
            } else {
                Frame._this = null;
                vanillaFrame.getLocals().set(0, new ObjectType(clazz.getClassName()));
            }
        }
        // fill local variables with parameter types
        final Type[] argtypes = method.getArgumentTypes();
        int twoslotoffset = 0;
        for (int j = 0; j < argtypes.length; j++) {
            if ((argtypes[j] == Type.SHORT) || (argtypes[j] == Type.BYTE) || (argtypes[j] == Type.CHAR) || (argtypes[j] == Type.BOOLEAN)) {
                argtypes[j] = Type.INT;
            }
            vanillaFrame.getLocals().set(twoslotoffset + j + (method.isStatic() ? 0 : 1), argtypes[j]);
            if (argtypes[j].getSize() == 2) {
                twoslotoffset++;
                vanillaFrame.getLocals().set(twoslotoffset + j + (method.isStatic() ? 0 : 1), Type.UNKNOWN);
            }
        }

        return vanillaFrame;
    }

    private void rewrite(MethodGen method, ControlFlowGraph cfg) throws ClassNotFoundException {
        final InstructionFactory insFactory = new InstructionFactory(method.getConstantPool());
        final List<InstructionHandle> invokeIns = new ArrayList<InstructionHandle>();
        final InstructionList insList = method.getInstructionList();
        InstructionHandle ins = insList.getStart();
        final InstructionList restorer = new InstructionList();
        int count = 0;  // count # of breakpoints

        // we need to expand the local variable size to store arguments for the constructor invocation.
        // compute the necessary size in this variable.
        int[] localVarsSize = new int[1];
        localVarsSize[0] = method.getMaxLocals();

        while (ins != null) {
            InstructionHandle next = ins.getNext();

            // if not traversed by the analyser, then don't rewrite
            InstructionContext context = null;
            Frame frame = null;
            try {
                context = cfg.contextOf(ins);
                frame = context.getOutFrame(ExecutionPath.EMPTY);
            } catch (AssertionViolatedException ave) {
                // empty
            }
            if (frame != null) {
                if (rewriteable(method, ins)) {
                    // Add frame saver and restorer for the current breakpoint

                    // determine type of object for the method invocation
                    final InvokeInstruction invoke = (InvokeInstruction) ins.getInstruction();
                    final Type[] arguments = invoke.getArgumentTypes(method.getConstantPool());
                    ReferenceType objecttype = null;
                    if (!(invoke instanceof INVOKESTATIC)) {
                        objecttype = (ReferenceType) context.getInFrame().getStack().peek(arguments.length);
                    }
                    final InstructionList rList = restoreFrame(method, ins, insFactory, frame, objecttype);
                    insList.append(ins, saveFrame(method, ins, count++, insFactory, frame));
                    invokeIns.add(rList.getStart());
                    restorer.append(rList);
                }
                // remove all new's
                if (ins.getInstruction().getOpcode() == Constants.NEW) {
                    try {
                        // remove additional dup's
                        while (next != null && next.getInstruction().getOpcode() == Constants.DUP) {
                            context = cfg.contextOf(next);
                            context.getOutFrame(ExecutionPath.EMPTY);
                            final InstructionHandle newnext = next.getNext();
                            insList.delete(next);
                            next = newnext;
                        }
                        // if there are any dup_x2 following new and dup, replace them with dup.
                        // some java compiler generates such bytecode for code like
                        //   someObject.someStringField += "abc"
                        //
                        // which yield
                        //   NEW StringBuffer
                        //   DUP
                        //   ALOAD  // someObject
                        //   DUP_x2
                        //   GETFIELD someStringField
                        //   INVOKESPECIAL StringBuffer.<init>
                        //   LDC "abc"
                        //   INVOKEVIRTUAL StringBuffer.append
                        //   INVOKEVIRTUAL StringBuffer.toString
                        //   PUTFIELD someStringField
                        //
                        // replacing this DUP_x2 -> DUP is required for moving the new.
                        if (next != null && next.getNext() != null && next.getNext().getInstruction().getOpcode() == Constants.DUP_X2) {
                            InstructionHandle dupx2ptr = next.getNext();
                            final InstructionHandle newnext = dupx2ptr.getNext();
                            insList.insert(dupx2ptr, InstructionConstants.DUP);
                            insList.delete(dupx2ptr);
                            next = newnext;
                        }
                        final InstructionTargeter[] targeter = ins.getTargeters();
                        if (targeter != null) {
                            final InstructionHandle newnext = ins.getNext();
                            for (int i = 0; i < targeter.length; i++) {
                                targeter[i].updateTarget(ins, newnext);
                            }
                        }
                        insList.delete(ins);
                    } catch (TargetLostException tle) {
                        throw new ClassNotFoundException(tle.getMessage(), tle);
                    }
                } else if (ins.getInstruction().getOpcode() == Constants.INVOKESPECIAL) {
                    // duplicate stack before invokespecial to insert
                    // uninitialized object
                    frame = context.getInFrame();
                    final InvokeInstruction invoke = (InvokeInstruction) ins.getInstruction();
                    final Type[] arguments = invoke.getArgumentTypes(method.getConstantPool());

                    final OperandStack os = frame.getStack();
                    final Type type = os.peek(arguments.length);
                    if (type instanceof UninitializedObjectType) {
                        final ObjectType objecttype = ((UninitializedObjectType) type).getInitialized();
                        final InstructionList duplicator = duplicateStack(method, invoke, objecttype, localVarsSize);
                        final InstructionTargeter[] targeter = ins.getTargeters();

                        if (targeter != null) {
                            final InstructionHandle newnext = duplicator.getStart();
                            for (int i = 0; i < targeter.length; i++) {
                                targeter[i].updateTarget(ins, newnext);
                            }
                        }
                        insList.insert(ins, duplicator);
                    }
                }
            }
            ins = next;
        }

        // local variable index for storing the StackRecorder object
        final int varStack = method.getMaxLocals();
        // instruction to load the stack recorder
        Instruction loadStackRecorder = InstructionFactory.createLoad(STACK_RECORDER_TYPE, varStack);

        final InstructionHandle firstIns = insList.getStart();
        if (count > 0) {
            int[] match = new int[count];
            for (int i = 0; i < count; i++) {
                match[i] = i;
            }
            InstructionHandle[] tableTargets = new InstructionHandle[count];
            tableTargets = invokeIns.toArray(tableTargets);
            insList.insert(restorer);

            // select frame restorer
            insList.insert(new TABLESWITCH(match, tableTargets, firstIns));
            insList.insert(insFactory.createInvoke(STACK_RECORDER_CLASS, getPopMethod(Type.INT), Type.INT, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
            insList.insert(loadStackRecorder);

            // test if the continuation should be restored
            insList.insert(new IFEQ(firstIns));
            insList.insert(insFactory.createFieldAccess(STACK_RECORDER_CLASS, RESTORING_FIELD, Type.BOOLEAN, Constants.GETFIELD));
            insList.insert(loadStackRecorder);

            // test if no current continuation exists
            insList.insert(new IFNULL(firstIns));

            // get current continuation and store in the next to last local variable
            insList.insert(InstructionFactory.createStore(STACK_RECORDER_TYPE, varStack));
            insList.insert(InstructionConstants.DUP);
            insList.insert(insFactory.createInvoke(STACK_RECORDER_CLASS, STACK_METHOD, STACK_RECORDER_TYPE, Type.NO_ARGS, Constants.INVOKESTATIC));

            // we need one more variable for storing StackRecorder
            localVarsSize[0] = Math.max( localVarsSize[0], method.getMaxLocals()+1 );

            // make room for additional object (StackRecorder)
            method.setMaxStack(method.getMaxStack() + 2);
        }

        method.setMaxLocals(localVarsSize[0]);
        // make room for additional 'null' we push on the stack to clear
        // the local variables that are used during the constructor invocation instrumentation.
        // ideally we should be able to determine when we need to add +1, but for now just to be
        // safe and let's always add this.
        method.setMaxStack(method.getMaxStack() + 1);

        // remove LocalVariableTypeTable attribute until BCEL #33549 is fixed,
        // so that JDK 5.0 classes can be instrumented correctly.
        // see http://issues.apache.org/bugzilla/show_bug.cgi?id=33549
        Attribute[] atts = method.getCodeAttributes();
        for( int i=0; i<atts.length; i++ ) {
            if(atts[i].getNameIndex()==method.getConstantPool().lookupUtf8("LocalVariableTypeTable"))
                method.removeCodeAttribute(atts[i]);
        }
    }

    /**
     * Used to instrument the constructor invocation.
     */
    private InstructionList duplicateStack(MethodGen method, InvokeInstruction invoke, ObjectType objecttype, int[] localVarsSize) {
        // reconstruction of an uninitialed object to call the constructor.
        final InstructionFactory insFactory = new InstructionFactory(method.getConstantPool());
        final InstructionList insList = new InstructionList();

        final Type[] arguments = invoke.getArgumentTypes(method.getConstantPool());

        int localVarOffset = method.getMaxLocals()+1;   // +1 for stack recorder

        // move all arguments for the constructor from the operand stack into local variables
        for (int i = arguments.length - 1; i >= 0; i--) {
            Type type = arguments[i];
            insList.append(InstructionFactory.createStore(type,localVarOffset));
            localVarOffset += type.getSize();
        }

        localVarsSize[0] = Math.max(localVarsSize[0],localVarOffset);

        // create uninitialzed object
        insList.append(insFactory.createNew(objecttype));
        insList.append(InstructionConstants.DUP);

        // move the arguments back into the operand stack
        for (int i = 0; i < arguments.length; i++) {
            Type type = arguments[i];

            localVarOffset -= type.getSize();
            insList.append(InstructionFactory.createLoad(type,localVarOffset));
            if(type instanceof ReferenceType) {
                // erase the local variable, or else we have a potential for memory leak
                insList.append(InstructionConstants.ACONST_NULL);
                insList.append(InstructionFactory.createStore(type,localVarOffset));
            }
        }
        return insList;
    }

    private boolean rewriteable(MethodGen method, InstructionHandle handle) {
        // check in the invocation can be a breakpoint.
        int opcode = handle.getInstruction().getOpcode();

        if(!(handle.getInstruction() instanceof InvokeInstruction))
            return false;   // not an INVOKE***

        if (opcode == Constants.INVOKESPECIAL) {
            final InvokeInstruction ivs = (InvokeInstruction) handle.getInstruction();
            final String mName = ivs.getMethodName(method.getConstantPool());
            if(mName.equals(Constants.CONSTRUCTOR_NAME))
                return false;   // can't instrument the constructor invocation
        }

        // final int index = ((InvokeInstruction) handle.getInstruction()).getIndex();
        // final String classname = getObjectType(method.getConstantPool().getConstantPool(), index).getClassName();

        // rewrite invocation if object is continuable or a continuation
        // object

        // FIXME:
        //return Repository.implementationOf(classname, CONTINUABLE_CLASS) || Repository.instanceOf(classname, CONTINUATION_CLASS);
        return true;
    }

    private InstructionList saveFrame(MethodGen method, InstructionHandle handle, int pc, InstructionFactory insFactory, Frame frame) {
        final InstructionList insList = new InstructionList();

        // Remove needless return type from stack
        final InvokeInstruction inv = (InvokeInstruction) handle.getInstruction();
        final Type returnType = getReturnType(method.getConstantPool().getConstantPool(), inv.getIndex());
        if (returnType.getSize() > 0) {
            insList.insert(InstructionFactory.createPop(returnType.getSize()));
        }
        boolean skipFirst = returnType.getSize() > 0;

        //if (debug) {
        //    insList.append(insFactory.createPrintln("save stack"));
        //}

        // instruction for loading StackRecorder
        Instruction loadStackRecorder = InstructionFactory.createLoad(STACK_RECORDER_TYPE, method.getMaxLocals());

        // save stack
        final OperandStack os = frame.getStack();
        for (int i = skipFirst ? 1 : 0; i < os.size(); i++) {
            Type type = os.peek(i);
            if (type instanceof BasicType) {
                if (type.getSize() < 2 && !type.equals(Type.FLOAT)) {
                    type = Type.INT;
                }

                // check for types with two words on stack
                if (type.equals(Type.LONG) || type.equals(Type.DOUBLE)) {
                    insList.append(InstructionConstants.ACONST_NULL); // create dummy stack entry
                    insList.append(loadStackRecorder);
                    insList.append(InstructionConstants.DUP2_X2); // swap Stack object and long/float
                    insList.append(InstructionConstants.POP2);
                } else {
                    insList.append(loadStackRecorder);
                    insList.append(InstructionConstants.SWAP);
                }
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPushMethod(type), Type.VOID, new Type[] { type }, Constants.INVOKEVIRTUAL));
                if (type.equals(Type.LONG) || type.equals(Type.DOUBLE))
                    insList.append(InstructionConstants.POP); // remove dummy stack entry
            } else if (type == null) {
                insList.append(InstructionConstants.POP);
            } else if (type instanceof UninitializedObjectType) {
                // After the remove of new, there shouldn't be a
                // uninitialized object on the stack
            } else if (type instanceof ReferenceType) {
                if(type.equals(Type.NULL)) {
                    // if it's guaranteed to be null, no need to store.
                    // in fact, we can't really store this, because we'll never
                    // be able to restore it as the 'null' type.
                    insList.append(InstructionConstants.POP);
                } else {
                    insList.append(loadStackRecorder);
                    insList.append(InstructionConstants.SWAP);
                    insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPushMethod(Type.OBJECT), Type.VOID, new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
                }
            }
        }
        // add isCapturing test
        if (debug) {
            insList.insert(insFactory.createPrintln("capturing invocation "+method));
        }
        insList.insert(new IFEQ(handle.getNext()));

        // test if the continuation should be captured after the invocation
        insList.insert(insFactory.createFieldAccess(STACK_RECORDER_CLASS, CAPTURING_FIELD, Type.BOOLEAN, Constants.GETFIELD));
        insList.insert(loadStackRecorder);

        // test if continuation exists
        insList.insert(new IFNULL(handle.getNext()));
        insList.insert(loadStackRecorder);

        // save local variables
        //if (debug) {
        //    insList.append(insFactory.createPrintln("save local variables"));
        //}

        final LocalVariables lvs = frame.getLocals();
        for (int i = 0; i < lvs.maxLocals(); i++) {
            Type type = lvs.get(i);
            if (type instanceof BasicType) {
                insList.append(loadStackRecorder);
                insList.append(InstructionFactory.createLoad(type, i));
                if (type.getSize() < 2 && !type.equals(Type.FLOAT))
                    type = Type.INT;
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPushMethod(type), Type.VOID, new Type[] { type }, Constants.INVOKEVIRTUAL));
            } else if (type == null || type==Type.NULL) {
                // no need to save null
            } else if (type instanceof UninitializedObjectType) {
                // no need to save uninitialized objects
            } else if (type instanceof ReferenceType) {
                if (i == 0 && !currentMethodStatic) {
                    // remember current object
                    insList.append(loadStackRecorder);
                    insList.append(InstructionFactory.createLoad(type, i));
                    insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, PUSH_METHOD + "Reference", Type.VOID, new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
                }
                insList.append(loadStackRecorder);
                insList.append(InstructionFactory.createLoad(type, i));
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPushMethod(Type.OBJECT), Type.VOID, new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
            }
        }
        // save programcounter
        insList.append(loadStackRecorder);
        insList.append(new PUSH(method.getConstantPool(), pc));
        insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPushMethod(Type.INT), Type.VOID, new Type[] { Type.INT }, Constants.INVOKEVIRTUAL));
        // return NULL result
        insList.append(InstructionFactory.createNull(method.getReturnType()));
        insList.append(InstructionFactory.createReturn(method.getReturnType()));
        return insList;
    }

    private InstructionList restoreFrame(MethodGen method, InstructionHandle handle, InstructionFactory insFactory, Frame frame, ReferenceType objecttype) {
        final InstructionList insList = new InstructionList();
        // restore local variables
        //if (debug) {
        //    insList.append(insFactory.createPrintln("restore local variables"));
        //}

        final LocalVariables lvs = frame.getLocals();
        Instruction loadStackRecorder = InstructionFactory.createLoad(STACK_RECORDER_TYPE, method.getMaxLocals());

        for (int i = lvs.maxLocals() - 1; i >= 0; i--) {
            Type type = lvs.get(i);
            if (type instanceof BasicType) {
                insList.append(loadStackRecorder);
                if (type.getSize() < 2 && !type.equals(Type.FLOAT)) {
                    type = Type.INT;
                }
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPopMethod(type), type, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
                insList.append(InstructionFactory.createStore(type, i));
            } else if (type == null) {
                insList.append(InstructionConstants.ACONST_NULL);
                insList.append(new ASTORE(i));
            } else if (type instanceof UninitializedObjectType) {
                // No uninitilaized objects should be found
                // in the local variables.
                throw new Error("assertion failure");
            } else if (type instanceof ReferenceType) {
                if (type==Type.NULL) {
                    // null type is a special type assignable to any type,
                    // whereas popObject returns a java/lang/Object.
                    // the saveFrame method is written so that we don't save the 'null' object
                    insList.append(InstructionConstants.ACONST_NULL);
                } else {
                    insList.append(loadStackRecorder);
                    insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPopMethod(Type.OBJECT), Type.OBJECT, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
                    if (!type.equals(Type.OBJECT)) {
                        insList.append(insFactory.createCast(Type.OBJECT, type));
                    }
                }
                insList.append(new ASTORE(i));
            }
        }

        final InvokeInstruction inv = (InvokeInstruction) handle.getInstruction();
        final Type returnType = getReturnType(method.getConstantPool().getConstantPool(), inv.getIndex());
        boolean skipFirst = returnType.getSize() > 0;

        // restore stack
        //if (debug) {
        //    insList.append(insFactory.createPrintln("restore stack"));
        //}

        final OperandStack os = frame.getStack();
        for (int i = os.size() - 1; i >= (skipFirst ? 1 : 0); i--) {
            Type type = os.peek(i);
            if (type instanceof BasicType) {
                if (type.getSize() < 2 && !type.equals(Type.FLOAT)) {
                    type = Type.INT;
                }
                insList.append(loadStackRecorder);
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPopMethod(type), type, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
            } else if (type == null || type==Type.NULL) {
                insList.append(new ACONST_NULL());
            } else if (type instanceof UninitializedObjectType) {
                // After the remove of new, there shouldn't be a
                // uninitialized object on the stack
            } else if (type instanceof ReferenceType) {
                insList.append(loadStackRecorder);
                insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, getPopMethod(Type.OBJECT), Type.OBJECT, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
                if (!type.equals(Type.OBJECT))
                    insList.append(insFactory.createCast(Type.OBJECT, type));
            }
        }
        // retrieve current object
        if (!(inv instanceof INVOKESTATIC)) {
            insList.append(loadStackRecorder);
            insList.append(insFactory.createInvoke(STACK_RECORDER_CLASS, POP_METHOD + "Reference", Type.OBJECT, Type.NO_ARGS, Constants.INVOKEVIRTUAL));
            insList.append(insFactory.createCast(Type.OBJECT, objecttype));
        }
        // Create null types for the parameters of the method invocation
        final Type[] paramTypes = getParamTypes(method.getConstantPool().getConstantPool(), inv.getIndex());
        for (int j = 0; j < paramTypes.length; j++) {
            insList.append(InstructionFactory.createNull(paramTypes[j]));
        }
        // go to last invocation
        insList.append(new GOTO(handle));
        return insList;
    }

    private Type[] getParamTypes(ConstantPool cp, int index) {
        final ConstantCP cmr = (ConstantCP) cp.getConstant(index);
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        final String sig = ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes();
        return Type.getArgumentTypes(sig);
    }

    private Type getReturnType(ConstantPool cp, int index) {
        final ConstantCP cmr = (ConstantCP) cp.getConstant(index);
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        final String sig = ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes();
        return Type.getReturnType(sig);
    }

    private String getPopMethod(Type type) {
        return POP_METHOD + getTypeSuffix(type);
    }

    private String getPushMethod(Type type) {
        return PUSH_METHOD + getTypeSuffix(type);
    }

    private String getTypeSuffix(Type type) {
        if (type.equals(Type.BOOLEAN))
            return "Int";
        else if (type.equals(Type.CHAR))
            return "Int";
        else if (type.equals(Type.FLOAT))
            return "Float";
        else if (type.equals(Type.DOUBLE))
            return "Double";
        else if (type.equals(Type.BYTE))
            return "Int";
        else if (type.equals(Type.SHORT))
            return "Int";
        else if (type.equals(Type.INT))
            return "Int";
        else if (type.equals(Type.LONG))
            return "Long";
        // VOID and OBJECT are "Object"
        return "Object";
    }

}