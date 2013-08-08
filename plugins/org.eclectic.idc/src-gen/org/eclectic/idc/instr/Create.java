/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.Variable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.Create#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Create#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Create#getConstructorParameters <em>Constructor Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelDefinition)
	 * @see org.eclectic.idc.instr.InstrPackage#getCreate_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Create#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getCreate_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Create#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Constructor Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.Set}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Parameters</em>' containment reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getCreate_ConstructorParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Set> getConstructorParameters();

} // Create
