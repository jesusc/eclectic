/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Variable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getInputViewFilter <em>Input View Filter</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getEntryPointName <em>Entry Point Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeTransformation#getEntryPointParameters <em>Entry Point Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation()
 * @model abstract="true"
 * @generated
 */
public interface InvokeTransformation extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Name</em>' attribute.
	 * @see #setTransformationName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_TransformationName()
	 * @model required="true"
	 * @generated
	 */
	String getTransformationName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeTransformation#getTransformationName <em>Transformation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Name</em>' attribute.
	 * @see #getTransformationName()
	 * @generated
	 */
	void setTransformationName(String value);

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.InvocationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_SourceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvocationParameter> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.InvocationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_TargetModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvocationParameter> getTargetModels();

	/**
	 * Returns the value of the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input View Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input View Filter</em>' reference.
	 * @see #setInputViewFilter(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_InputViewFilter()
	 * @model
	 * @generated
	 */
	Variable getInputViewFilter();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeTransformation#getInputViewFilter <em>Input View Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input View Filter</em>' reference.
	 * @see #getInputViewFilter()
	 * @generated
	 */
	void setInputViewFilter(Variable value);

	/**
	 * Returns the value of the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Name</em>' attribute.
	 * @see #setEntryPointName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_EntryPointName()
	 * @model
	 * @generated
	 */
	String getEntryPointName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeTransformation#getEntryPointName <em>Entry Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point Name</em>' attribute.
	 * @see #getEntryPointName()
	 * @generated
	 */
	void setEntryPointName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Point Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Parameters</em>' reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeTransformation_EntryPointParameters()
	 * @model
	 * @generated
	 */
	EList<Variable> getEntryPointParameters();

} // InvokeTransformation
