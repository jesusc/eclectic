package org.eclectic.idc.scheduling.jvmgen;

import org.eclectic.idc.scheduling.ParallelTransformation;
import org.eclectic.idc.scheduling.impl.SchedulingFactoryImpl;

public class SchedulingFactoryJVMGen extends SchedulingFactoryImpl {
	@Override
	public ParallelTransformation createParallelTransformation() {
		return new ParallelTransformationJVMGen();
	}
}
