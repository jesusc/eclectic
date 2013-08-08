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
package org.apache.commons.javaflow.bytecode.transformation.bcel.analyser;

import org.apache.bcel.generic.Type;
import org.apache.bcel.generic.ReferenceType;
import org.apache.bcel.generic.ReturnaddressType;
import org.apache.bcel.verifier.exc.StructuralCodeConstraintException;
import org.apache.bcel.verifier.exc.AssertionViolatedException;

/**
 * This class represents a JVM execution frame; that means,
 * a local variable array and an operand stack.
 * 
 * WARNING! These classes are a fork of the bcel verifier.
 *
 */

public class Frame{

    /**
     * For instance initialization methods, it is important to remember
     * which instance it is that is not initialized yet. It will be
     * initialized invoking another constructor later.
     * NULL means the instance already *is* initialized.
     */
    public static UninitializedObjectType _this;

    /**
     *
     */
    private LocalVariables locals;

    /**
     *
     */
    private OperandStack stack;

    /**
     *
     */
    public Frame(int maxLocals, int maxStack){
        locals = new LocalVariables(maxLocals);
        stack = new OperandStack(maxStack);
    }

    /**
     *
     */
    public Frame(LocalVariables locals, OperandStack stack){
        this.locals = locals;
        this.stack = stack;
    }

    /**
     *
     */
    protected Object clone(){
        Frame f = new Frame(locals.getClone(), stack.getClone());
        return f;
    }

    /**
     *
     */
    public Frame getClone(){
        return (Frame) clone();
    }

    /**
     *
     */
    public LocalVariables getLocals(){
        return locals;
    }

    /**
     *
     */
    public OperandStack getStack(){
        return stack;
    }

    /**
     *
     */
    public boolean equals(Object o){
        if (!(o instanceof Frame)) return false; // implies "null" is non-equal.
        Frame f = (Frame) o;
        return this.stack.equals(f.stack) && this.locals.equals(f.locals);
    }

    /**
     * Returns a String representation of the Frame instance.
     */
    public String toString(){
        String s="Local Variables:\n";
        s += locals;
        s += "OperandStack:\n";
        s += stack;
        return s;
    }


    /**
     * Merges two {@link Type}s into one.
     *
     * @param errorIfFailed
     *      if true, attempting to merge two types that are incompatible causes an error.
     *      if false, it yields {@link Type#UNKNOWN} value, indicating that value is unusable.
     */
    /*package*/ static Type merge(Type lhs, Type rhs, boolean errorIfFailed) {
        try {

            // We won't accept an unitialized object if we know it was initialized;
            // compare vmspec2, 4.9.4, last paragraph.
            if ((!(lhs instanceof UninitializedObjectType)) && (rhs instanceof UninitializedObjectType)) {
                throw new StructuralCodeConstraintException("Backwards branch with an uninitialized object in the local variables detected.");
            }
            // Even harder, what about _different_ uninitialized object types?!
            if ((!(lhs.equals(rhs))) && (lhs instanceof UninitializedObjectType) && (rhs instanceof UninitializedObjectType)) {
                throw new StructuralCodeConstraintException("Backwards branch with an uninitialized object in the local variables detected.");
            }
            // If we just didn't know that it was initialized, we have now learned.
            if (lhs instanceof UninitializedObjectType) {
                if (! (rhs instanceof UninitializedObjectType)) {
                    lhs = ((UninitializedObjectType) lhs).getInitialized();
                }
            }
            if ((lhs instanceof ReferenceType) && (rhs instanceof ReferenceType)) {
                if(lhs.equals(rhs)) {
                    return lhs; // same type
                }

                Type sup = ((ReferenceType) lhs).getFirstCommonSuperclass((ReferenceType) rhs);

                if (sup != null) {
                    return sup;
                } else {
                    // We should have checked this in Pass2!
                    throw new AssertionViolatedException("Could not load all the super classes of '" + lhs + "' and '" + rhs + "'.");
                }
            }

            if ((lhs instanceof ReturnaddressType) && (rhs instanceof ReturnaddressType)) {
                // see 'FinallyFlow' test.
                return lhs;
            }

            if (!lhs.equals(rhs)) {
                if(errorIfFailed) {
                    throw new StructuralCodeConstraintException("Cannot merge different types:"+lhs+" and "+rhs);
                } else {
                    return Type.UNKNOWN;
                }
            }

            return lhs;
        } catch (ClassNotFoundException e) {
            // FIXME: maybe not the best way to handle this
            throw new AssertionViolatedException("Missing class: " + e.toString());
        }
    }
}
