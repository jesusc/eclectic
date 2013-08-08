package org.eclectic.idc.jvm;

public class JVMCompilerOptions {
	public class CompilerOptions {
		public boolean emit = true;
		public boolean profiler = false;
		public boolean verbose = false;
		public boolean use_assign = true;
		public int transformation_execution_order = 0;
		public int tests_to_run = 1;
		public boolean pre_instrument_classes = false;
	}

	public CompilerOptions compilerOptions = new CompilerOptions();
	// private EclecticOptions eclecticOptions;


}
