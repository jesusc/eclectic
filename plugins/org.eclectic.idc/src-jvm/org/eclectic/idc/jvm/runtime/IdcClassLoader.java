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
package org.eclectic.idc.jvm.runtime;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.commons.javaflow.bytecode.BytecodeClassLoader;
import org.apache.commons.javaflow.bytecode.transformation.ResourceTransformer;
import org.apache.commons.javaflow.bytecode.transformation.asm.AsmClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.ASMifierClassVisitor;

public final class IdcClassLoader extends BytecodeClassLoader {

    private final ResourceTransformer transformer;
    private final Set<String> instrument;
    private final Set<String> load;
    private final HashMap<String, BytecodeClass> byteCodeClasses = new HashMap<String, BytecodeClass>();

    
    
    public static class BytecodeClass {
    	private byte[] bytes;
    	private String className;

    	public BytecodeClass(String className, byte[] bytes) {
    		this.className = className;
    		this.bytes     = bytes;
    	}
    }
    
    public IdcClassLoader(final BytecodeClass[] dynamicClasses, final Class<?>[] pInstrument, final Class<?>[] pLoad) {
    	
    	this(new AsmClassTransformer(), pInstrument, pLoad);

    	for(int i = 0; i < dynamicClasses.length; i++)
    		this.byteCodeClasses.put(dynamicClasses[i].className, dynamicClasses[i]);
    }

	public Class<?> loadGeneratedClass(String className, byte[] bytes) {
		return defineClass(className, bytes, 0, bytes.length, getClass().getProtectionDomain());
	}

    /*
	final ClassTransformerClassLoader classloader =
            new ClassTransformerClassLoader(
            		new AsmClassTransformer(),
            		new Class[] { // instrument
            			BlackRed.class,
            			ClassAccess1.class,
            			ClassAccess2.class,
            			CounterFlow.class,
            			DefaultConstructor.class,
            			Simple.class,
            			NewObject.class,
            			NoReference.class,
            			SimpleSerializable.class,
            			RewriteBugs.class,
            			SimpleTryCatch.class,
            			SimpleSynchronized.class,
            			Stack.class,	
            			}, 
            		new Class[] { // load
            			VerificationTestCase.class,
            			SerializationTestCase.class
            			}  
            		);
        
        final TestSuite suite = new TestSuite();
        suite.setName("ASM");
        suite.addTestSuite((Class<? extends TestCase>)classloader.loadClass(VerificationTestCase.class.getName()));
        suite.addTestSuite((Class<? extends TestCase>)classloader.loadClass(SerializationTestCase.class.getName()));
        return suite;
        */
	// END-OF JESUSC
	
    public IdcClassLoader(final ResourceTransformer pTransformer, final Class<?>[] pInstrument, final Class<?>[] pLoad) {    	
    	instrument = new HashSet<String>(pInstrument.length);
    	for (int i = 0; i < pInstrument.length; i++) {
			instrument.add(pInstrument[i].getName());
		}

    	load = new HashSet<String>(pLoad.length);
    	for (int i = 0; i < pLoad.length; i++) {
    		load.add(pLoad[i].getName());
		}
    	
        transformer = pTransformer;
    }

    protected byte[] transform(final String pName, final InputStream pClassStream) throws IOException {
    	System.err.println("Transforming " + pName);
    	
    	
        final byte[] oldClass = IOUtils.toByteArray(pClassStream);
        final byte[] newClass = transformer.transform(oldClass);

        // CheckClassAdapter.verify(new ClassReader(newClass), true);

    	new ClassReader(oldClass).accept(
    			new ASMifierClassVisitor(
    					new PrintWriter(
    							new FileOutputStream(
    									transformer.getClass().getSimpleName() + pName + ".old"))), 0);

    	new ClassReader(newClass).accept(
    			new ASMifierClassVisitor(
    					new PrintWriter(
    							new FileOutputStream(
    									transformer.getClass().getSimpleName() + pName + ".new"))), 0);
    	
        return newClass;
    }

    
    public Class<?> loadClass( final String name ) throws ClassNotFoundException {
    	
    	if ( byteCodeClasses.containsKey(name) ) {
    		try {
				byte[] bytecode = transform(name, new ByteArrayInputStream(byteCodeClasses.get(name).bytes) );
                return super.defineClass(name, bytecode, 0, bytecode.length);
    		} catch (IOException ex) {
                ex.printStackTrace();
                throw new ClassNotFoundException(name + " " + ex.getMessage(), ex);
			}    		
    	}
    	
        final int i = name.indexOf('$');
        final String key;
        
        if (i == -1) {
        	key = name;
        } else {
        	key = name.substring(0, i);
        }
        
        if (instrument.contains(key) || load.contains(key)) {

            try {
                final InputStream is = getClass().getResourceAsStream("/" + name.replace('.', '/') + ".class");


                final byte[] bytecode;
                
                if (instrument.contains(key)) {
                    System.err.println("Instrumenting: " + name);
                	bytecode = transform(name, is);
                } else {
                    System.err.println("Loading: " + name);
					bytecode = new ClassReader(is).b;                	
                }
                
                return super.defineClass(name, bytecode, 0, bytecode.length);

            } catch (Throwable ex) {
                // System.err.println("Load error: " + ex.toString());
                ex.printStackTrace();
                throw new ClassNotFoundException(name + " " + ex.getMessage(), ex);
            }
        }

        // System.err.println("Delegating: " + name);
        return super.loadClass(name);
    }

}
