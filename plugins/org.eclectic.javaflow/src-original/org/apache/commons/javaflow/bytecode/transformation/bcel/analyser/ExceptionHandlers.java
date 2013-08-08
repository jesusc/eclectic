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

import org.apache.bcel.generic.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * This class allows easy access to ExceptionHandler objects.
 * 
 * WARNING! These classes are a fork of the bcel verifier.
 *
 */
public class ExceptionHandlers{
	/**
	 * The ExceptionHandler instances.
	 * Key: InstructionHandle objects, Values: HashSet<ExceptionHandler> instances.
	 */
	private HashMap<InstructionHandle, Set<ExceptionHandler>> exceptionhandlers;
	 
	/**
	 * Constructor. Creates a new ExceptionHandlers instance.
	 */
	public ExceptionHandlers(MethodGen mg){
		exceptionhandlers = new HashMap<InstructionHandle, Set<ExceptionHandler>>();
		CodeExceptionGen[] cegs = mg.getExceptionHandlers();
		for (final CodeExceptionGen ceg : cegs) {
			final ExceptionHandler eh = new ExceptionHandler(ceg.getCatchType(), ceg.getHandlerPC());
			for (InstructionHandle ih = ceg.getStartPC(); ih != ceg.getEndPC().getNext(); ih = ih.getNext()) {
				Set<ExceptionHandler> hs = exceptionhandlers.get(ih);
				if (hs == null){
					hs = new HashSet<ExceptionHandler>();
					exceptionhandlers.put(ih, hs);
				}
				hs.add(eh);
			}
		}
	}
	
	/**
	 * Returns all the ExceptionHandler instances representing exception
	 * handlers that protect the instruction ih.
	 */
	public ExceptionHandler[] getExceptionHandlers(InstructionHandle ih){
		Set<ExceptionHandler> hs = exceptionhandlers.get(ih);
		if (hs == null) return new ExceptionHandler[0];
		else {
			ExceptionHandler[] ret = new ExceptionHandler[hs.size()];
			return hs.toArray(ret);
		}
	}

}
