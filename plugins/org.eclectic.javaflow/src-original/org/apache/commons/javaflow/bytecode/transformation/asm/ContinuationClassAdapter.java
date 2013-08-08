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
package org.apache.commons.javaflow.bytecode.transformation.asm;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public final class ContinuationClassAdapter extends ClassAdapter {

    private String className;

    public ContinuationClassAdapter(ClassVisitor cv) {
        super(cv);
    }


    public void visit( int version, int access, String name, String signature, String superName, String[] interfaces ) {
        cv.visit(version, access, name, signature, superName, interfaces);
        className = name;
    }

    public MethodVisitor visitMethod( int access, String name, String desc, String signature, String[] exceptions ) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        // TODO skip native and abstract methods?
        if (!"<init>".equals(name) && mv!=null) {  
            return new ContinuationMethodAnalyzer(className, this.cv, mv, access, name, desc, signature, exceptions);
        }
        return mv;
   }
    
}

