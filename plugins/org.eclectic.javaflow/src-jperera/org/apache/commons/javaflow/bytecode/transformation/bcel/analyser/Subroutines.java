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

import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ATHROW;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.CodeExceptionGen;
import org.apache.bcel.generic.GotoInstruction;
import org.apache.bcel.generic.IndexedInstruction;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.JsrInstruction;
import org.apache.bcel.generic.LocalVariableInstruction;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.ReturnInstruction;
import org.apache.bcel.generic.Select;
import org.apache.bcel.verifier.exc.AssertionViolatedException;
import org.apache.bcel.verifier.exc.StructuralCodeConstraintException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Instances of this class contain information about the subroutines
 * found in a code array of a method.
 * This implementation considers the top-level (the instructions
 * reachable without a JSR or JSR_W starting off from the first
 * instruction in a code array of a method) being a special subroutine;
 * see getTopLevel() for that.
 * Please note that the definition of subroutines in the Java Virtual
 * Machine Specification, Second Edition is somewhat incomplete.
 * Therefore, JustIce uses an own, more rigid notion.
 * Basically, a subroutine is a piece of code that starts at the target
 * of a JSR of JSR_W instruction and ends at a corresponding RET
 * instruction. Note also that the control flow of a subroutine
 * may be complex and non-linear; and that subroutines may be nested.
 *
 * WARNING! These classes are a fork of the bcel verifier.
 *
 * @see #getTopLevel()
 */
public class Subroutines{
	/**
	 * This inner class implements the Subroutine interface.
	 */
	private class SubroutineImpl implements Subroutine{
		/**
		 * UNSET, a symbol for an uninitialized localVariable
		 * field. This is used for the "top-level" Subroutine;
		 * i.e. no subroutine.
		 */
		private final int UNSET = -1;

		/**
		 * The Local Variable slot where the first
		 * instruction of this subroutine (an ASTORE) stores
		 * the JsrInstruction's ReturnAddress in and
		 * the RET of this subroutine operates on.
		 */
		private int localVariable = UNSET;

		/** The instructions that belong to this subroutine. */
		private Set<InstructionHandle> instructions;

		/*
		 * Refer to the Subroutine interface for documentation.
		 */
		public boolean contains(InstructionHandle inst){
			return instructions.contains(inst);
		}

		/**
		 * The JSR or JSR_W instructions that define this
		 * subroutine by targeting it.
		 */
		private Set<InstructionHandle> theJSRs = new HashSet<InstructionHandle>();

		/**
		 * The RET instruction that leaves this subroutine.
		 */
		private InstructionHandle theRET;

		/**
		 * Returns a String representation of this object, merely
		 * for debugging purposes.
		 * (Internal) Warning: Verbosity on a problematic subroutine may cause
		 * stack overflow errors due to recursive subSubs() calls.
		 * Don't use this, then.
		 */
		public String toString(){
			String ret = "Subroutine: Local variable is '"+localVariable+"', JSRs are '"+theJSRs+"', RET is '"+theRET+"', Instructions: '"+instructions.toString()+"'.";

			ret += " Accessed local variable slots: '";
			int[] alv = getAccessedLocalsIndices();
			for (int i=0; i<alv.length; i++){
				ret += alv[i]+" ";
			}
			ret+="'.";

			ret += " Recursively (via subsub...routines) accessed local variable slots: '";
			alv = getRecursivelyAccessedLocalsIndices();
			for (int i=0; i<alv.length; i++){
				ret += alv[i]+" ";
			}
			ret+="'.";

			return ret;
		}

		/**
		 * Sets the leaving RET instruction. Must be invoked after all instructions are added.
		 * Must not be invoked for top-level 'subroutine'.
		 */
		void setLeavingRET() {
			if (localVariable == UNSET){
				throw new AssertionViolatedException("setLeavingRET() called for top-level 'subroutine' or forgot to set local variable first.");
			}
			InstructionHandle ret = null;
			for (final InstructionHandle actual : instructions) {
				if (actual.getInstruction() instanceof RET){
					if (ret != null){
						throw new StructuralCodeConstraintException("Subroutine with more then one RET detected: '"+ret+"' and '"+actual+"'.");
					}
					else{
						ret = actual;
					}
				}
			}
			if (ret == null){
				throw new StructuralCodeConstraintException("Subroutine without a RET detected.");
			}
			if (((RET) ret.getInstruction()).getIndex() != localVariable){
				throw new StructuralCodeConstraintException("Subroutine uses '"+ret+"' which does not match the correct local variable '"+localVariable+"'.");
			}
			theRET = ret;
		}

		/*
		 * Refer to the Subroutine interface for documentation.
		 */
		public InstructionHandle[] getEnteringJsrInstructions(){
			if (this == TOPLEVEL) {
				throw new AssertionViolatedException("getLeavingRET() called on top level pseudo-subroutine.");
			}
			InstructionHandle[] jsrs = new InstructionHandle[theJSRs.size()];
			return theJSRs.toArray(jsrs);
		}

		/**
		 * Adds a new JSR or JSR_W that has this subroutine as its target.
		 */
		public void addEnteringJsrInstruction(InstructionHandle jsrInst){
			if ( (jsrInst == null) || (! (jsrInst.getInstruction() instanceof JsrInstruction))){
				throw new AssertionViolatedException("Expecting JsrInstruction InstructionHandle.");
			}
			if (localVariable == UNSET){
				throw new AssertionViolatedException("Set the localVariable first!");
			}
			else{
				// Something is wrong when an ASTORE is targeted that does not operate on the same local variable than the rest of the
				// JsrInstruction-targets and the RET.
				// (We don't know out leader here so we cannot check if we're really targeted!)
				if (localVariable != ((ASTORE) (((JsrInstruction) jsrInst.getInstruction()).getTarget().getInstruction())).getIndex()){
					throw new AssertionViolatedException("Setting a wrong JsrInstruction.");
				}
			}
			theJSRs.add(jsrInst);
		}

		/*
		 * Refer to the Subroutine interface for documentation.
		 */
		public InstructionHandle getLeavingRET(){
			if (this == TOPLEVEL) {
				throw new AssertionViolatedException("getLeavingRET() called on top level pseudo-subroutine.");
			}
			return theRET;
		}

		/*
		 * Refer to the Subroutine interface for documentation.
		 */
		public InstructionHandle[] getInstructions(){
			InstructionHandle[] ret = new InstructionHandle[instructions.size()];
			return (InstructionHandle[]) instructions.toArray(ret);
		}

		/* Satisfies Subroutine.getRecursivelyAccessedLocalsIndices(). */
		public int[] getRecursivelyAccessedLocalsIndices(){
			final Set<Integer> s = new HashSet<Integer>();
			int[] lvs = getAccessedLocalsIndices();
			for (int j = 0; j < lvs.length; j++) {
				s.add(lvs[j]);
			}
			_getRecursivelyAccessedLocalsIndicesHelper(s, this.subSubs());
			
			int[] ret = new int[s.size()];
			int j = 0;
			for (final int v : s) {
				ret[j++] = v;
			}
			return ret;
		}

		/**
		 * A recursive helper method for getRecursivelyAccessedLocalsIndices().
		 * @see #getRecursivelyAccessedLocalsIndices()
		 */
		private void _getRecursivelyAccessedLocalsIndicesHelper(Set<Integer> s, Subroutine[] subs){
			for (final Subroutine sub : subs) {
				for (final int lv : sub.getAccessedLocalsIndices()) {
					s.add(lv);
				}
				
				if(sub.subSubs().length != 0) {
					_getRecursivelyAccessedLocalsIndicesHelper(s, sub.subSubs());
				}
			}
		}

		/*
		 * Satisfies Subroutine.getAccessedLocalIndices().
		 */
		public int[] getAccessedLocalsIndices(){
			//TODO: Implement caching.
			final Set<Integer> acc = new HashSet<Integer>();
			if (theRET == null && this != TOPLEVEL){
				throw new AssertionViolatedException("This subroutine object must be built up completely before calculating accessed locals.");
			}
			for (final InstructionHandle ih : instructions) {
				// RET is not a LocalVariableInstruction in the current version of BCEL.
				if (ih.getInstruction() instanceof LocalVariableInstruction || ih.getInstruction() instanceof RET){
					int idx = IndexedInstruction.class.cast(ih.getInstruction()).getIndex();
					acc.add(idx);
					// LONG? DOUBLE?.
					try {
						// LocalVariableInstruction instances are typed without the need to look into
						// the constant pool.
						if (ih.getInstruction() instanceof LocalVariableInstruction) {
							int s = LocalVariableInstruction.class.cast(ih.getInstruction()).getType(null).getSize();
							if (s == 2) acc.add(idx + 1);
						}
					} catch(final RuntimeException re) {
						throw new AssertionViolatedException("Oops. BCEL did not like NULL as a ConstantPoolGen object.");
					}
				}
			}

			int[] ret = new int[acc.size()];
			int j = 0;
			for (final int v : acc) {
				ret[j++] = v;
			}
			return ret;
		}

		/*
		 * Satisfies Subroutine.subSubs().
		 */
		public Subroutine[] subSubs(){
			final Set<Subroutine> h = new HashSet<Subroutine>();
			for (final InstructionHandle ih : instructions){
				final Instruction inst = ih.getInstruction();
				if (inst instanceof JsrInstruction){
					InstructionHandle targ = ((JsrInstruction) inst).getTarget();
					h.add(getSubroutine(targ));
				}
			}
			final Subroutine[] ret = new Subroutine[h.size()];
			return h.toArray(ret);
		}

		/*
		 * Sets the local variable slot the ASTORE that is targeted
		 * by the JsrInstructions of this subroutine operates on.
		 * This subroutine's RET operates on that same local variable
		 * slot, of course.
		 */
		void setLocalVariable(int i) {
			if (localVariable != UNSET){
				throw new AssertionViolatedException("localVariable set twice.");
			}
			else{
				localVariable = i;
			}
		}

		/**
		 * The default constructor.
		 */
		public SubroutineImpl() {
		}

        void setInstructions(final Set<InstructionHandle> _instructions) {
            this.instructions = _instructions;
        }
    }// end Inner Class SubrouteImpl

	/**
	 * The Hashtable containing the subroutines found.
	 * Key: InstructionHandle of the leader of the subroutine.
	 * Elements: SubroutineImpl objects.
	 */
	private Map<InstructionHandle, Subroutine> subroutines = new HashMap<InstructionHandle, Subroutine>();

	/**
	 * This is referring to a special subroutine, namely the
	 * top level. This is not really a subroutine but we use
	 * it to distinguish between top level instructions and
	 * unreachable instructions.
	 */
	public final Subroutine TOPLEVEL;

	/**
	 * Constructor.
	 * @param mg A MethodGen object representing method to
	 * create the Subroutine objects of.
	 */
	public Subroutines(MethodGen mg){

		InstructionHandle[] all = mg.getInstructionList().getInstructionHandles();
		CodeExceptionGen[] handlers = mg.getExceptionHandlers();

		// Define our "Toplevel" fake subroutine.
		TOPLEVEL = new SubroutineImpl();

		// Calculate "real" subroutines.
		Set<InstructionHandle> sub_leaders = new HashSet<InstructionHandle>(); // Elements: InstructionHandle
		for (final InstructionHandle ih : all) {
			Instruction inst = ih.getInstruction();
			if (inst instanceof JsrInstruction){
				sub_leaders.add(((JsrInstruction) inst).getTarget());
			}
		}

		// Build up the database.
		for (final InstructionHandle astore : sub_leaders){
			final SubroutineImpl sr = new SubroutineImpl();
			sr.setLocalVariable( ASTORE.class.cast(astore.getInstruction()).getIndex() );
			subroutines.put(astore, sr);
		}

		// Fake it a bit. We want a virtual "TopLevel" subroutine.
		subroutines.put(all[0], TOPLEVEL);
		sub_leaders.add(all[0]);

		// Tell the subroutines about their JsrInstructions.
		// Note that there cannot be a JSR targeting the top-level
		// since "Jsr 0" is disallowed in Pass 3a.
		// Instructions shared by a subroutine and the toplevel are
		// disallowed and checked below, after the BFS.
		for (final InstructionHandle ih : all){
			Instruction inst = ih.getInstruction();
			if (inst instanceof JsrInstruction){
				InstructionHandle leader = ((JsrInstruction) inst).getTarget();
				((SubroutineImpl) getSubroutine(leader)).addEnteringJsrInstruction(ih);
			}
		}

		// Now do a closure computation from every subroutine leader to find all the
		// instructions that belong to a subroutine.
		final Set<InstructionHandle> instructions_assigned = new HashSet<InstructionHandle>(); // we don't want to assign an instruction to two or more Subroutine objects.
		for (final InstructionHandle leader : sub_leaders){
            // set of InstructionHandles reachable from the top
            final Set<InstructionHandle> closure = new HashSet<InstructionHandle>();

            // Init Queue. Start with the entry point of closure.
			List<InstructionHandle> Q = new ArrayList<InstructionHandle>();
			Q.add(leader);

            while (!Q.isEmpty()) {
                while (!Q.isEmpty()) {
                    InstructionHandle u = (InstructionHandle) Q.remove(Q.size() - 1);
                    if (closure.add(u)) {
                        for (final InstructionHandle successor : getSuccessors(u)) {
                            Q.add(successor);
                        }
                    }
                }
                // check if exception handlers are reachable from the closure computed thus far.
                // conceptually, an exception handler is a successor of each instruction inside
                // the protected region, but the computation works faster if we don't implement it
                // in a straight-forward way. Instead, we occasionally check if the first instruction
                // of the protected region is in the closure, and if so, we know that the exception
                // handler should also be in the closure.
                //
                // "one instruction must be always in at-most one subroutine" JVM requirement
                // guarantees that the entire protected region always belongs to the same closure,
                // so just checking the start instruction is suffice.
                for(final CodeExceptionGen handler : handlers) {
                    if (closure.contains(handler.getStartPC())) {
                        InstructionHandle handlerPC = handler.getHandlerPC();
                        if (!closure.contains(handlerPC)) {
                            Q.add(handlerPC);
                        }
                    }
                }
            }
            // DFS ended above.
            SubroutineImpl.class.cast(leader == all[0] ? getTopLevel() : getSubroutine(leader)).setInstructions(closure);

            for (final InstructionHandle h : closure) {
                if (!instructions_assigned.add(h)) {
                    throw new StructuralCodeConstraintException("Instruction '" + h + "' is part of more than one subroutine (or of the top level and a subroutine).");
                }
            }

            if (leader != all[0]){// If we don't deal with the top-level 'subroutine'
				((SubroutineImpl) getSubroutine(leader)).setLeavingRET();
			}
		}

		// Now make sure no subroutine is calling a subroutine
		// that uses the same local variable for the RET as themselves
		// (recursively).
		// This includes that subroutines may not call themselves
		// recursively, even not through intermediate calls to other
		// subroutines.
		noRecursiveCalls(getTopLevel(), new HashSet<Integer>());

	}

	/**
	 * This (recursive) utility method makes sure that
	 * no subroutine is calling a subroutine
	 * that uses the same local variable for the RET as themselves
	 * (recursively).
	 * This includes that subroutines may not call themselves
	 * recursively, even not through intermediate calls to other
	 * subroutines.
	 *
	 * @throws StructuralCodeConstraintException if the above constraint is not satisfied.
	 */
	private void noRecursiveCalls(final Subroutine sub, final Set<Integer> set){
		for (final Subroutine subSub : sub.subSubs()) {
			int index = ((RET) (subSub.getLeavingRET().getInstruction())).getIndex();
			if (!set.add(index)) {
				// Don't use toString() here because of possibly infinite recursive subSubs() calls then.
				final SubroutineImpl si = (SubroutineImpl)subSub;
				throw new StructuralCodeConstraintException("Subroutine with local variable '" + si.localVariable + "', JSRs '" + si.theJSRs+"', RET '" + si.theRET + "' is called by a subroutine which uses the same local variable index as itself; maybe even a recursive call? JustIce's clean definition of a subroutine forbids both.");
			}

			noRecursiveCalls(subSub, set);

			set.remove(index);
		}
	}

	/**
	 * Returns the Subroutine object associated with the given
	 * leader (that is, the first instruction of the subroutine).
	 * You must not use this to get the top-level instructions
	 * modeled as a Subroutine object.
	 *
	 * @see #getTopLevel()
	 */
	public Subroutine getSubroutine(InstructionHandle leader){
		Subroutine ret = (Subroutine) subroutines.get(leader);

		if (ret == null){
			throw new AssertionViolatedException("Subroutine requested for an InstructionHandle that is not a leader of a subroutine.");
		}

		if (ret == TOPLEVEL){
			throw new AssertionViolatedException("TOPLEVEL special subroutine requested; use getTopLevel().");
		}

		return ret;
	}

	/**
	 * Returns the subroutine object associated with the
	 * given instruction. This is a costly operation, you
	 * should consider using getSubroutine(InstructionHandle).
	 * Returns 'null' if the given InstructionHandle lies
	 * in so-called 'dead code', i.e. code that can never
	 * be executed.
	 *
	 * @see #getSubroutine(InstructionHandle)
	 * @see #getTopLevel()
	 */
	public Subroutine subroutineOf(InstructionHandle any){
		for (final Subroutine s : subroutines.values()) {
			if (s.contains(any)) 
				return s;
		}
System.err.println("DEBUG: Please verify '" + any + "' lies in dead code.");
		return null;
		//throw new AssertionViolatedException("No subroutine for InstructionHandle found (DEAD CODE?).");
	}

	/**
	 * For easy handling, the piece of code that is <B>not</B> a
	 * subroutine, the top-level, is also modeled as a Subroutine
	 * object.
	 * It is a special Subroutine object where <B>you must not invoke
	 * getEnteringJsrInstructions() or getLeavingRET()</B>.
	 *
	 * @see Subroutine#getEnteringJsrInstructions()
	 * @see Subroutine#getLeavingRET()
	 */
	public Subroutine getTopLevel(){
		return TOPLEVEL;
	}

    static final InstructionHandle[] empty = new InstructionHandle[0];

    /**
	 * A utility method that calculates the successors of a given InstructionHandle
	 * <B>in the same subroutine</B>. That means, a RET does not have any successors
	 * as defined here. A JsrInstruction has its physical successor as its successor
	 * (opposed to its target) as defined here.
	 */
	private static InstructionHandle[] getSuccessors(InstructionHandle instruction){
		Instruction inst = instruction.getInstruction();

        if (inst instanceof RET){
			return empty;
		}

		// Terminates method normally.
		if (inst instanceof ReturnInstruction){
			return empty;
		}

		// Terminates method abnormally, because JustIce mandates
		// subroutines not to be protected by exception handlers.
		if (inst instanceof ATHROW){
			return empty;
		}

        final InstructionHandle[] single = new InstructionHandle[1];

        // See method comment.
		if (inst instanceof JsrInstruction){
			single[0] = instruction.getNext();
			return single;
		}

		if (inst instanceof GotoInstruction){
			single[0] = ((GotoInstruction) inst).getTarget();
			return single;
		}

		if (inst instanceof BranchInstruction){
			if (inst instanceof Select){
				// BCEL's getTargets() returns only the non-default targets,
				// thanks to Eli Tilevich for reporting.
				InstructionHandle[] matchTargets = ((Select) inst).getTargets();
				InstructionHandle[] ret = new InstructionHandle[matchTargets.length+1];
				ret[0] = ((Select) inst).getTarget();
				System.arraycopy(matchTargets, 0, ret, 1, matchTargets.length);
				return ret;
			}
			else{
                final InstructionHandle[] pair = new InstructionHandle[2];
				pair[0] = instruction.getNext();
				pair[1] = ((BranchInstruction) inst).getTarget();
				return pair;
			}
		}

		// default case: Fall through.
		single[0] = instruction.getNext();
		return single;
	}

	/**
	 * Returns a String representation of this object; merely for debugging puposes.
	 */
	public String toString(){
		return "---\n"+subroutines.toString()+"\n---\n";
	}
}
