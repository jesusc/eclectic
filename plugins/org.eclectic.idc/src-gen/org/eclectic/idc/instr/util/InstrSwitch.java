/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.util;

import org.eclectic.idc.core.FunctionDef;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.LocatedElement;
import org.eclectic.idc.core.NamedElement;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.instr.InstrPackage
 * @generated
 */
public class InstrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrSwitch() {
		if (modelPackage == null) {
			modelPackage = InstrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InstrPackage.INSTRUCTION_WITH_RESULT: {
				InstructionWithResult instructionWithResult = (InstructionWithResult)theEObject;
				T result = caseInstructionWithResult(instructionWithResult);
				if (result == null) result = caseVariable(instructionWithResult);
				if (result == null) result = caseInstruction(instructionWithResult);
				if (result == null) result = caseNamedElement(instructionWithResult);
				if (result == null) result = caseLocatedElement(instructionWithResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseInstructionWithResult(create);
				if (result == null) result = caseVariable(create);
				if (result == null) result = caseInstruction(create);
				if (result == null) result = caseNamedElement(create);
				if (result == null) result = caseLocatedElement(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseInstruction(set);
				if (result == null) result = caseLocatedElement(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.GET: {
				Get get = (Get)theEObject;
				T result = caseGet(get);
				if (result == null) result = caseInstructionWithResult(get);
				if (result == null) result = caseVariable(get);
				if (result == null) result = caseInstruction(get);
				if (result == null) result = caseNamedElement(get);
				if (result == null) result = caseLocatedElement(get);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseInstructionWithResult(literal);
				if (result == null) result = caseVariable(literal);
				if (result == null) result = caseInstruction(literal);
				if (result == null) result = caseNamedElement(literal);
				if (result == null) result = caseLocatedElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.CLOSURE_DEF: {
				ClosureDef closureDef = (ClosureDef)theEObject;
				T result = caseClosureDef(closureDef);
				if (result == null) result = caseFunctionDef(closureDef);
				if (result == null) result = caseInstructionWithResult(closureDef);
				if (result == null) result = caseInstructionBlock(closureDef);
				if (result == null) result = caseVariable(closureDef);
				if (result == null) result = caseInstruction(closureDef);
				if (result == null) result = caseLocatedElement(closureDef);
				if (result == null) result = caseNamedElement(closureDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseInstructionWithResult(assign);
				if (result == null) result = caseVariable(assign);
				if (result == null) result = caseInstruction(assign);
				if (result == null) result = caseNamedElement(assign);
				if (result == null) result = caseLocatedElement(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.IF_INSTR: {
				IfInstr ifInstr = (IfInstr)theEObject;
				T result = caseIfInstr(ifInstr);
				if (result == null) result = caseInstructionWithResult(ifInstr);
				if (result == null) result = caseVariable(ifInstr);
				if (result == null) result = caseInstruction(ifInstr);
				if (result == null) result = caseNamedElement(ifInstr);
				if (result == null) result = caseLocatedElement(ifInstr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.IF_BRANCH: {
				IfBranch ifBranch = (IfBranch)theEObject;
				T result = caseIfBranch(ifBranch);
				if (result == null) result = caseInstructionBlock(ifBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.IF_ELSE_BLOCK: {
				IfElseBlock ifElseBlock = (IfElseBlock)theEObject;
				T result = caseIfElseBlock(ifElseBlock);
				if (result == null) result = caseInstructionBlock(ifElseBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.METHOD_CALL: {
				MethodCall methodCall = (MethodCall)theEObject;
				T result = caseMethodCall(methodCall);
				if (result == null) result = caseInstructionWithResult(methodCall);
				if (result == null) result = caseVariable(methodCall);
				if (result == null) result = caseInstruction(methodCall);
				if (result == null) result = caseNamedElement(methodCall);
				if (result == null) result = caseLocatedElement(methodCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.READ_META: {
				ReadMeta readMeta = (ReadMeta)theEObject;
				T result = caseReadMeta(readMeta);
				if (result == null) result = caseInstructionWithResult(readMeta);
				if (result == null) result = caseVariable(readMeta);
				if (result == null) result = caseInstruction(readMeta);
				if (result == null) result = caseNamedElement(readMeta);
				if (result == null) result = caseLocatedElement(readMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.INVOKE_TRANSFORMATION: {
				InvokeTransformation invokeTransformation = (InvokeTransformation)theEObject;
				T result = caseInvokeTransformation(invokeTransformation);
				if (result == null) result = caseInstructionWithResult(invokeTransformation);
				if (result == null) result = caseVariable(invokeTransformation);
				if (result == null) result = caseInstruction(invokeTransformation);
				if (result == null) result = caseNamedElement(invokeTransformation);
				if (result == null) result = caseLocatedElement(invokeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.INVOKE_EXTERNAL: {
				InvokeExternal invokeExternal = (InvokeExternal)theEObject;
				T result = caseInvokeExternal(invokeExternal);
				if (result == null) result = caseInvokeTransformation(invokeExternal);
				if (result == null) result = caseInstructionWithResult(invokeExternal);
				if (result == null) result = caseVariable(invokeExternal);
				if (result == null) result = caseInstruction(invokeExternal);
				if (result == null) result = caseNamedElement(invokeExternal);
				if (result == null) result = caseLocatedElement(invokeExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.INVOKE_INTERNAL: {
				InvokeInternal invokeInternal = (InvokeInternal)theEObject;
				T result = caseInvokeInternal(invokeInternal);
				if (result == null) result = caseInvokeTransformation(invokeInternal);
				if (result == null) result = caseInstructionWithResult(invokeInternal);
				if (result == null) result = caseVariable(invokeInternal);
				if (result == null) result = caseInstruction(invokeInternal);
				if (result == null) result = caseNamedElement(invokeInternal);
				if (result == null) result = caseLocatedElement(invokeInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.INVOCATION_PARAMETER: {
				InvocationParameter invocationParameter = (InvocationParameter)theEObject;
				T result = caseInvocationParameter(invocationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstrPackage.NAMED_INVOCATION_PARAMETER: {
				NamedInvocationParameter namedInvocationParameter = (NamedInvocationParameter)theEObject;
				T result = caseNamedInvocationParameter(namedInvocationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction With Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction With Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionWithResult(InstructionWithResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGet(Get object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closure Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closure Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosureDef(ClosureDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Instr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Instr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfInstr(IfInstr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfBranch(IfBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Else Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Else Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfElseBlock(IfElseBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCall(MethodCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadMeta(ReadMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeTransformation(InvokeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeExternal(InvokeExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeInternal(InvokeInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationParameter(InvocationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Invocation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedInvocationParameter(NamedInvocationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionBlock(InstructionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDef(FunctionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InstrSwitch
