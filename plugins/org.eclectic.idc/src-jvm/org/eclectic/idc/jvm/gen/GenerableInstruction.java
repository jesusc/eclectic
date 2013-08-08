package org.eclectic.idc.jvm.gen;

import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.MethodGen;
import org.eclectic.idc.jvm.context.GenScope;

public interface GenerableInstruction {

	void generate(GenScope scope);

}
