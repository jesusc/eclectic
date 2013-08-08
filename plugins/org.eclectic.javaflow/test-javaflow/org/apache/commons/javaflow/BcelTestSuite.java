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
package org.apache.commons.javaflow;

import junit.framework.Test;
import junit.framework.TestSuite;

public final class BcelTestSuite extends TestSuite {

	public static Test suite() throws Exception {

//    	final ClassTransformerClassLoader classloader =
//            new ClassTransformerClassLoader(
//            		new BcelClassTransformer(),
//            		new Class[] { // instrument
//            			BlackRed.class,
//            			ClassAccess1.class,
//            			ClassAccess2.class,
//            			CounterFlow.class,
//            			DefaultConstructor.class,
//            			Simple.class,
//            			NewObject.class,
//            			NoReference.class,
//            			SimpleSerializable.class,
//            			RewriteBugs.class,
//            			SimpleTryCatch.class,
//            			SimpleSynchronized.class,
//            			Stack.class,	
//            			}, 
//            		new Class[] { // load
//            			VerificationTestCase.class,
//            			SerializationTestCase.class
//            			}  
//            		);
        
        final TestSuite suite = new TestSuite();
        suite.setName("BCEL");
        // BCEL is deprecated and the ASM implementation is moving on
        // suite.addTestSuite(classloader.loadClass(VerificationTestCase.class.getName()));
        // suite.addTestSuite(classloader.loadClass(SerializationTestCase.class.getName()));        
        return suite;
    }

}
