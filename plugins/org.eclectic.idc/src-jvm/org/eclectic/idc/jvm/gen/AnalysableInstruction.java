package org.eclectic.idc.jvm.gen;

import java.util.List;

/**
 * Functions common to instructions that can be analysed,
 * for instance to analyse dependencies.
 * 
 * @author jesus
 */
public interface AnalysableInstruction {
	
	/**
	 * @return the list of instructions this instruction depends on,
	 * through the values they generate.
	 */
	List<AnalysableInstruction> getDependencies();
}
