package org.apache.commons.javaflow.bytecode.transformation.bcel.analyser;

import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.JsrInstruction;

/**
 * List of {@link InstructionContext} that represents a sequence of an execution.
 *
 * <p>
 * This object is immutable.
 * The sequence is represented in left-associative style; that is,
 * a sequence of [a,b,c,d] is represented as prev=[a,b,c] and last=d.
 *
 */
public final class ExecutionPath {
    /**
     * Singleton {@link ExecutionPath} that represents an empty sequence [].
     */
    public static final ExecutionPath EMPTY = new ExecutionPath(null,null);

    private final ExecutionPath prev;
    private final InstructionContext last;

    private ExecutionPath(ExecutionPath prev, InstructionContext last) {
        this.prev = prev;
        this.last = last;
    }

    /**
     * Creates a new {@link ExecutionPath} that has
     * <tt>[... list in this ExecutionPath ..., ins]</tt>.
     */
    public ExecutionPath append(InstructionContext ins) {
        return new ExecutionPath(this,ins);
    }

    /**
     * Returns the InstructionContextImpl with an JSR/JSR_W
     * that was last in the ExecutionChain, without
     * a corresponding RET, i.e.
     * we were called by this one.
     * Returns null if we were called from the top level.
     */
    public InstructionContext lastExecutionJSR(){
        int retcount = 0;

        for( ExecutionPath ptr = this; ptr!=EMPTY; ptr=ptr.prev) {
            Instruction i = ptr.last.getInstruction().getInstruction();
            if (i instanceof RET) retcount++;
            if (i instanceof JsrInstruction){
                retcount--;
                if (retcount == -1)
                    return ptr.last;
            }
        }

        return null;
    }

    /**
     * Returns a human readable representation.
     */
    public String toString() {
        if(this==EMPTY)
            return "";
        else {
            return prev.toString()+"\n"+last.toString();
        }
    }
}
