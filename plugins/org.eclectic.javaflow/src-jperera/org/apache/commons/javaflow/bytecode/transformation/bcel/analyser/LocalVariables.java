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
import org.apache.bcel.verifier.exc.AssertionViolatedException;

import java.util.Arrays;

/**
 * This class implements an array of local variables used for symbolic JVM
 * simulation.
 * 
 * WARNING! These classes are a fork of the bcel verifier.
 *
 */
public class LocalVariables{
    /** The Type[] containing the local variable slots. */
    private Type[] locals;

    /**
     * Creates a new LocalVariables object.
     */
    public LocalVariables(int maxLocals){
        locals = new Type[maxLocals];
        Arrays.fill(locals,Type.UNKNOWN);
    }

    /**
     * Returns a deep copy of this object; i.e. the clone
     * operates on a new local variable array.
     * However, the Type objects in the array are shared.
     */
    protected Object clone(){
        LocalVariables lvs = new LocalVariables(locals.length);
        System.arraycopy(this.locals, 0, lvs.locals, 0, locals.length);
        return lvs;
    }

    /**
     * Returns the type of the local variable slot i.
     */
    public Type get(int i){
        return locals[i];
    }

    /**
     * Returns a (correctly typed) clone of this object.
     * This is equivalent to ((LocalVariables) this.clone()).
     */
    public LocalVariables getClone(){
        return (LocalVariables) this.clone();
    }

    /**
     * Returns the number of local variable slots this
     * LocalVariables instance has.
     */
    public int maxLocals(){
        return locals.length;
    }

    /**
     * Sets a new Type for the given local variable slot.
     */
    public void set(int i, Type type){
        if (type == Type.BYTE || type == Type.SHORT || type == Type.BOOLEAN || type == Type.CHAR){
            throw new AssertionViolatedException("LocalVariables do not know about '"+type+"'. Use Type.INT instead.");
        }
        locals[i] = type;
    }

    /*
      * Fulfills the general contract of Object.equals().
      */
    public boolean equals(Object o){
        if (!(o instanceof LocalVariables)) return false;
        LocalVariables lv = (LocalVariables) o;
        return Arrays.equals(this.locals, lv.locals);
    }

    /**
     * Merges two local variables sets as described in the Java Virtual Machine Specification,
     * Second Edition, section 4.9.2, page 146.
     */
    public void merge(LocalVariables that){

        if (this.locals.length != that.locals.length){
            throw new AssertionViolatedException("Merging LocalVariables of different size?!? From different methods or what?!?");
        }

        for (int i=0; i<locals.length; i++) {
            this.locals[i] = Frame.merge(this.locals[i], that.locals[i], false);
        }
    }


    /**
     * Returns a String representation of this object.
     */
    public String toString(){
        String s = "";
        for (int i=0; i<locals.length; i++){
            s += Integer.toString(i)+": "+locals[i]+"\n";
        }
        return s;
    }

    /**
     * Replaces all occurences of u in this local variables set
     * with an "initialized" ObjectType.
     */
    public void initializeObject(UninitializedObjectType u){
        for (int i=0; i<locals.length; i++){
            if (locals[i] == u){
                locals[i] = u.getInitialized();
            }
        }
    }
}
