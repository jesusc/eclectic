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

import org.apache.bcel.*;
import org.apache.bcel.generic.*;

/**
 * This class represents an uninitialized object type; see The Java
 * Virtual Machine Specification, Second Edition, page 147: 4.9.4 for
 * more details.
 * 
 * WARNING! These classes are a fork of the bcel verifier.
 *
 */
public class UninitializedObjectType extends ReferenceType implements Constants {

	private static final long serialVersionUID = 1L;
    
    /** The "initialized" version. */
	private ObjectType initialized;
	
	/** Creates a new instance. */
	public UninitializedObjectType(ObjectType t){
		super(T_UNKNOWN, "<UNINITIALIZED OBJECT OF TYPE '"+t.getClassName()+"'>");
		initialized = t;
	}

	/**
	 * Returns the ObjectType of the same class as the one of the uninitialized object
	 * represented by this UninitializedObjectType instance.
	 */
	public ObjectType getInitialized(){
		return initialized;
	}

	/**
	 * Returns true on equality of this and o.
	 * Equality means the ObjectType instances of "initialized"
	 * equal one another in this and the o instance.
	 *
	 */
	public boolean equals(Object o){
		if (! (o instanceof UninitializedObjectType)) return false;
		return initialized.equals(((UninitializedObjectType)o).initialized);
	}
}
