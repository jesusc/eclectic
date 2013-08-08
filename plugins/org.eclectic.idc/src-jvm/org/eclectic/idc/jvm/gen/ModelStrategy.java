package org.eclectic.idc.jvm.gen;

import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.jvm.context.GenScope;

/**
 * For each different type of model, a different generation strategy
 * is needed. For instance, sometimes objects can be created directly
 * if we are dealing with a "Java API", while with regular models
 * we need to delegate to the model manager.
 * 
 * @author jesus
 */
public interface ModelStrategy {

	public abstract void genCreate(Create c, GenScope scope);

	public abstract void genSet(Set s, GenScope scope);

}
