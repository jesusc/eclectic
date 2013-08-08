package org.eclectic.idc.instr.jvmgen;

import java.util.LinkedList;
import java.util.List;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.instr.LiteralKind;
import org.eclectic.idc.instr.impl.LiteralImpl;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.runtime.IdcException;

public class LiteralJVMGen extends LiteralImpl implements GenerableInstruction, AnalysableInstruction {

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);
	
		switch (kind.getValue()) {
		case LiteralKind.BOOLEAN_VALUE:
			if (getBooleanValue()) {
				il.append(InstructionConstants.ICONST_1);
			} else {
				il.append(InstructionConstants.ICONST_0);
			}
			il.append(ifact.createInvoke(Boolean.class.getName(), "valueOf",
					new ObjectType(Boolean.class.getName()),
					new Type[] { Type.BOOLEAN }, Constants.INVOKESTATIC));
			break;
		case LiteralKind.STRING_VALUE:
			lvg.setStart(il.append(new LDC(cpg.addString(getStringValue()))));
			break;
		case LiteralKind.NULL_VALUE:
			lvg.setStart(il.append(InstructionConstants.ACONST_NULL));
			break;
		case LiteralKind.INTEGER_VALUE:
			//lvg.setStart(il.append(new LDC(cpg.addInteger(intValue))));
			//il.append(new LDC(cpg.addInteger(intValue)));
			il.append(ifact.createConstant(intValue));
			il.append(ifact.createInvoke(Integer.class.getName(), "valueOf",
					new ObjectType(Integer.class.getName()),
					new Type[] { Type.INT }, Constants.INVOKESTATIC));
			break;
		case LiteralKind.DOUBLE_VALUE:
			//lvg.setStart(il.append(new LDC(cpg.addDouble(doubleValue))));
			lvg.setStart(il.append(ifact.createConstant(doubleValue)));
			il.append(ifact.createInvoke(Double.class.getName(), "valueOf",
					new ObjectType(Double.class.getName()), 
					new Type[] { Type.DOUBLE }, Constants.INVOKESTATIC));
			break;
		default:
			throw new IdcException("Not supported literal");
			// break;
		}
		il.append(new ASTORE(lvg.getIndex()));
	}

	@Override
	public List<AnalysableInstruction> getDependencies() {
		return new LinkedList<AnalysableInstruction>();
	}

}
