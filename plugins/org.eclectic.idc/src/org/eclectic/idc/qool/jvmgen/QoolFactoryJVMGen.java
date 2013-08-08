package org.eclectic.idc.qool.jvmgen;

import org.eclectic.idc.core.NormalFunction;
import org.eclectic.idc.core.impl.CoreFactoryImpl;
import org.eclectic.idc.qool.LocalQueue;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.QEmit;
import org.eclectic.idc.qool.QForAll;
import org.eclectic.idc.qool.QMatch;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.RequiredQueue;
import org.eclectic.idc.qool.Segment;
import org.eclectic.idc.qool.impl.QoolFactoryImpl;

public class QoolFactoryJVMGen extends QoolFactoryImpl {

	@Override
	public QoolTransformation createQoolTransformation() {
		return new QoolTransformationJVMGen();
	}
	
	@Override
	public Segment createSegment() {
		return new QoolSegmentJVMGen();
	}
	
	@Override
	public QForAll createQForAll() {
		return new QForAllJVMGen();
	}
	
	@Override
	public QEmit createQEmit() {
		return new QEmitJVMGen();
	}
	
	@Override
	public ModelElementQueue createModelElementQueue() {
		return new ModelElementQueueJVMGen();
	}
	
	@Override
	public LocalQueue createLocalQueue() {
		return new LocalQueueJVMGen();
	}
	
	@Override
	public RequiredQueue createRequiredQueue() {
		return new RequiredQueueJVMGen();
	}
	
	@Override
	public QMatch createQMatch() {
		return new QMatchJVMGen();
	}
	
}
