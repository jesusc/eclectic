package org.eclectic.idc.instr.jvmgen;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.IfInstr;
import org.eclectic.idc.instr.InvokeExternal;
import org.eclectic.idc.instr.InvokeInternal;
import org.eclectic.idc.instr.Literal;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.ReadMeta;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.instr.impl.InstrFactoryImpl;

public class InstrFactoryJVMGen extends InstrFactoryImpl {

	@Override
	public ReadMeta createReadMeta() {
		return new ReadMetaJVMGen();
	}

	@Override
	public Create createCreate() {
		return new CreateJVMGen();
	}
	
	@Override
	public Literal createLiteral() {
		return new LiteralJVMGen();
	}

	@Override
	public Set createSet() {
		return new SetJVMGen();
	}

	@Override
	public Get createGet() {
		return new GetJVMGen();
	}

	@Override
	public Assign createAssign() {
		return new AssignJVMGen();
	}

	@Override
	public MethodCall createMethodCall() {
		return new MethodCallJVMGen();
	}

	@Override
	public ClosureDef createClosureDef() {
		return new ClosureDefJVMGen();
	}

	@Override
	public IfInstr createIfInstr() {
		return new IfInstrJVMGen();
	}

	@Override
	public IfBranch createIfBranch() {
		return new IfBranchJVMGen();
	}

	@Override
	public InvokeExternal createInvokeExternal() {
		return new InvokeExternalJVMGen();
	}
	
	@Override
	public InvokeInternal createInvokeInternal() {
		return new InvokeInternalJVMGen();
	}
}