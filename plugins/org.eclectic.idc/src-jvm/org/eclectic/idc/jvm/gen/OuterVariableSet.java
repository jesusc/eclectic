package org.eclectic.idc.jvm.gen;

import java.util.HashSet;

import org.eclectic.idc.core.Variable;

public class OuterVariableSet {
	private HashSet<Variable> outer = new HashSet<Variable>();
	
	public void add(Variable v) {
		outer.add(v);
	}

	public HashSet<Variable> get() {
		return outer;
	}
}
