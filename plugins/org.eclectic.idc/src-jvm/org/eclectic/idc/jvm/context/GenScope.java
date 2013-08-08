package org.eclectic.idc.jvm.context;

import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.OuterVariableSet;
import org.eclectic.idc.jvm.runtime.IdcException;

/**
 * This class represents a scope (a set of accessible variables)
 * whose accessing instructions are being generated.
 *
 * It features a mechanism to keep track of the correspondence
 * between IDC variables and JVM variables (e.g., local variables),
 * to facilitate loading. 
 * <ul>
 *   <il>LocalVariables: a local variable with the same name as the IDC variable
 *       is created. Finding a correspondence is done by looking up by name.
 *       This is possible because in IDC variable names are unique.
 *   </il>
 * </ul>
 * 
 * @author Jesus Sanchez Cuadrado
 *
 */
public class GenScope {
	private TransformationContext context;
	private GenScope parent = null;
	private ClassGen cg;
	private MethodGen currentMethod;
	protected InstructionFactory ifact;
	private OuterVariableSet outers = new OuterVariableSet();
	private int nextId = 0;
	
	/**
	 * Construct a new (root) scope.
	 * 
	 * @param context The transformation that is being generated.
	 */
	public GenScope(TransformationContext context, ClassGen cg) {
		this.context = context;
		this.cg      = cg;
		this.ifact   = new InstructionFactory(cg);
	}

	/**
	 * Construct a new scope from an existing one, its parent.
	 * 
	 * @param parentScope the parent scope.
	 */
	public GenScope(GenScope parentScope, ClassGen cg) {
		this(parentScope.context, cg);
		this.parent  = parentScope;
		this.context = parentScope.context;
	}

	/**
	 * @return the transformation context being generated.
	 */
	public TransformationContext getTransformationContext() {	
		return context;
	}

	/**
	 * @return the ClassGen associated with the scope.
	 */
	public ClassGen getClassGen() {
		return cg;
	}

	/**
	 * @return the current MethodGen
	 */
	public MethodGen getCurrentMethod() {
		return currentMethod;
	}
	
	/**
	 * Sets mg as the method being currently generated.
	 * @param mg the generator object for the method.
	 */
	public void processMethod(MethodGen mg) {
		currentMethod = mg;
	}

	/**
	 * @return the instruction factory associated with the current class.
	 */
	public InstructionFactory getInstructionFactory() {
		return ifact;
	}

	/**
	 * @return the constant pool of the current class.
	 */
	public ConstantPoolGen getConstantPool() {
		return cg.getConstantPool();
	}
	
	/**
	 * Check whether this scope corresponds to a root transformation.
	 * @return true if it is a root scope.
	 */
	public boolean isRoot() {
		return this.parent == null;
	}
	
	/**
	 * @return the list of variables that are in the outer scope.
	 */
	public OuterVariableSet getOuterVariables() {
		return outers;
	}

	/**
	 * Creates a new local variable to hold the value of a given
	 * IDC variable.
	 * 
	 * @precondition A method is currently being generated 
	 * (i.e., {@link GenScope#processMethod(MethodGen)} has been called).
	 * 
	 * @param idc The original idc variable
	 * @param name The variable name 
	 * @param type The type of the variable
	 * @return The newly created variable. 
	 */
	public LocalVariableGen newLocalVariable(Variable idc, ObjectType type) {
		if ( currentMethod == null ) throw new IllegalStateException(); 
			
		LocalVariableGen lvg = currentMethod.addLocalVariable(idc.getName(), type, null, null);
		return lvg;
	}

	public InstructionList getInstructionList() {
		if ( currentMethod == null ) throw new IllegalStateException(); 
		return currentMethod.getInstructionList();
	}

	/**
	 * Given an IDC variable whose value is going to be used, this
	 * method skips its (transitively) if its real value is in another
	 * variable (typically this happens with Assign instructions).
	 * 
	 * The skip_assign flag of the compiler must be set for this
	 * method to have effect.
	 *  
	 * @param var
	 * @return 
	 */
	public Variable getRealVariable(Variable var) {
		// It should do something like...
		// Variable no_assign_receptor = CompilerFlags.use_assign ? receptor
		// 		: MetaclassFinder.getRealVariable(receptor);
		return var;
	}

	/**
	 * Loads a variable, generating the corresponding instructions.
	 * 
	 * Additionally, if the variable is a local variable of the 
	 * enclosing scope (i.e., a closure accessing an outer variable)
	 * it is added to the outer variable list.
	 * 
	 * 
	 * @param variable
	 * @param il
	 */
	public void loadVariable(Variable variable, InstructionList il) {
		boolean isLocal = loadLocalVariable(variable, il);
		if ( ! isLocal ) {
			boolean isOuter = loadOuterVariable(variable, il);
			if ( isOuter ) {
				outers.add(variable);
			} else {
				throw new IdcException("No way of loading: " + variable.getName());
			}
		}
	}

	protected boolean loadOuterVariable(Variable variable, InstructionList il) {
		throw new UnsupportedOperationException("loadOuterVariable - For variable " + variable.getName());
	}
	
	/*
	protected boolean loadOuterVariable(Variable variable, InstructionList il) {
		if ( isRoot() || parent.currentMethod == null ) return false;
		
		if ( ! parent.loadLocalVariable(variable, il) ) {
			return parent.loadOuterVariable(variable, il);
		}
		
		return true;
	}
	*/
	
	protected boolean loadLocalVariable(Variable variable, InstructionList il) {
		if ( currentMethod == null ) throw new IllegalStateException(); 

		for (LocalVariableGen lvg : currentMethod.getLocalVariables()) {
			if (lvg.getName().equals( variable.getName()) ) {
				il.append(new ALOAD(lvg.getIndex()));
				return true;
			}
		}					
		return false;
	}

	public String uniqueId(String string) {
		return string + ++nextId;
	}

	/**
	 * 
	 * @param realReceptor
	 */
	public void generateGetModel(Variable receptor) {
		CommonGen.generateGetModel(receptor, this);
	}

	public void generateGetModelManager() {
		CommonGen.generateGetModelManager(this);
	}

	public void generateGetModel(String name) {
		CommonGen.generateGetModel(name, this);		
	}

	public void generateGetTransformation() {
		CommonGen.generateGetTransformation(this);		
	}
}
