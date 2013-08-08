package org.eclectic.idc.rewrite;

import java.util.LinkedList;
import java.util.List;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.CreationMechanism;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.SimpleClassMapping;
import org.eclectic.apidesc.jvmgen.ApiDescriptionJVMGen;
import org.eclectic.apidesc.jvmgen.CreationMechanismJVMGen;
import org.eclectic.apidesc.jvmgen.SimpleClassMappingJVMGen;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.qool.QIterator;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.Segment;
import org.eclectic.idc.rewrite.ReorderConstructorDependencies.ConstructorSetterSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This is an in-place transformation that reorders IDC
 * instructions so that constructor dependencies (specified in 
 * an API description model) appears before the "Create" instruction
 * that depends on them.
 * 
 * For example (from Uml2Swing example):
 * <pre>
 *   1  p3 <- create JPanel
 *  !2! b4 <- create BoxLayout
 *   3  t5 <- create trace_link
 *   4        set t5.s = src
 *   5        set t5.t = p3
 *   6        emit t5 to TraceQueue
 *   7        set p3.layout = b4
 *  [8]       set b4.container = p3
 *   9  n6 <- get src.name
 *  10        set p3.name
 *  11  l7 <- literal 0
 * [12]       set b4.axis = l7 
 *            ... 
 * </pre>
 * 
 * It should be rewritten so that, [8] and [9] are removed and !2! is modified 
 * in order to use the values used as in the instruction as parameters (eg., p3 and l7).
 * To do that, the instructions that compute the values used by these two instructions
 * must be (recursively) identified, and moved before !2! (if needed).
 *  
 * The process has several steps.
 * <ul>
 *   <li>Identification of the "set" instructions whose values will be used in the 
 *       constructor. Let user call these instructions "constructor setter".<li>
 *   <li>Compute the set of instructions each "constructor setter" depends on. 
 *       In the example, S([8])={1} and S([12])={11}. If the intersection of the sets
 *       contains Create instructions with constructor, then this means that the
 *       constructors are mutually recursive: an error is raised.</li>
 *   <li>Move the gathered instructions in the same order as they appear</li>
 * </ul>
 * 
 * @author jesus
 *
 */
public class ReorderConstructorDependencies {

	private ModelDefinition model;
	private ApiDescriptionJVMGen api;
	private CodeUnit unit;

	public ReorderConstructorDependencies(CodeUnit u, ModelDefinition m, ApiDescription desc) {
		this.unit  = u;
		this.model = m;
		this.api  = (ApiDescriptionJVMGen) desc;
	}

	private LinkedList<ConstructorSetterSet> identifyConstructorSetters(InstructionBlock block) {
		LinkedList<ConstructorSetterSet> csetList = new LinkedList<ConstructorSetterSet>();
		EList<Instruction> instructions = block.getInstructions();
		for(int i = 0; i < instructions.size(); i++) {
			Instruction instr = instructions.get(i);
			if ( instr instanceof Create ) {
				Create c = (Create) instr;
				if ( c.getModel() == model ) {
					SimpleClassMappingJVMGen classMapping = api.getMappingJVMGen(c.getClassName());				
					if ( classMapping.getCreationJVMGen().hasConstructorDependencies() ) {
						ConstructorSetterSet cset = findConstructorSetters(c, classMapping, block);
						csetList.add(cset);
					}
				}
			}
		}
		return csetList;
	}

	private ConstructorSetterSet findConstructorSetters(Create c, SimpleClassMappingJVMGen classMapping, InstructionBlock owningBlock) {		
		CreationMechanismJVMGen creation = classMapping.getCreationJVMGen();
		ConstructorSetterSet cset = new ConstructorSetterSet(c, creation);

		
		EList<Set> setters = c.getSetReceptors();
		for (Set set : setters) {
			FeatureMapping featureMapping = classMapping.getFeatureMapping(set.getFeatureName());			
			if ( creation.dependsOn(featureMapping) ) {
				cset.add(set);
			}
		}
		return cset;
	}
	
	/**
	 * Represents a set of "constructor setter"
	 * 
	 * @author jesus
	 */
	public class ConstructorSetterSet {
		private Create create;
		private LinkedList<Set> setters = new LinkedList<Set>();
		private CreationMechanismJVMGen creation;

		public ConstructorSetterSet(Create c, CreationMechanismJVMGen creation) {
			this.create = c;
			this.creation = creation;
		}

		public void add(Set set) {
			setters.add(set);
		}
	}


	private void moveDependencies(ConstructorSetterSet constructorSetterSet, InstructionBlock block) {
		EList<Instruction> blockInstructions = block.getInstructions();
		Create create = constructorSetterSet.create;
		int moveIdx = blockInstructions.indexOf(create);
		assert(moveIdx != -1);
		
		for(Set set : constructorSetterSet.setters) {
			AnalysableInstruction instr = (AnalysableInstruction) set;
			List<AnalysableInstruction> deps = instr.getDependencies();
			for(int i = 0; i < deps.size(); i++) {
				int instrIdx = blockInstructions.indexOf(deps.get(i));
				if ( moveIdx < instrIdx )
					blockInstructions.move(moveIdx, instrIdx);				
			}
			
			create.getConstructorParameters().add(set);
			
			// The alternative is to define (at the IDC level) constructor paramters as a set of setters
			//int paramIdx = constructorSetterSet.creation.parameterIndexOf(set.getFeatureName());
			//create.getConstructorParameters().set(paramIdx, set.getValue());			
			//blockInstructions.remove(instr);
		}
	}

	private void processBlock(InstructionBlock block) {
		LinkedList<ConstructorSetterSet> csetList = identifyConstructorSetters(block);
		for (ConstructorSetterSet constructorSetterSet : csetList) {
			moveDependencies(constructorSetterSet, block);			
		}
	}

	public void execute() {
		if ( unit instanceof QoolTransformation ) {
			reorderQool((QoolTransformation) unit);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void reorderQool(QoolTransformation t) {
		EList<Segment> segments = t.getSegments();
		for (Segment segment : segments) {
			visitSegment(segment);
		}
	}

	private void visitSegment(Segment segment) {
		EList<Instruction> instructions = segment.getInstructions();
		for (Instruction instruction : instructions) {
			visitInstruction(instruction);
		}
	}

	private void visitInstruction(Instruction instruction) {
		if ( instruction instanceof QIterator ) {
			QIterator it = (QIterator) instruction;
			processBlock(it);
			//for (Instruction instruction2 : it.getInstructions() ) {
			//	visitInstruction(instruction2);
			//}
		} else if ( instruction instanceof Create ) {
		//	processCreate((Create) instruction);
		} else {
			//throw new UnsupportedOperationException();
		}
	}

	

	private void processCreate(Create c) {
		if ( c.getModel() == model ) {
			 CreationMechanism mechanism = api.getCreationMechanism(c);
			 
		}
	}

}
