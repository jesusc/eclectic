/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.InstructionBlock#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getInstructionBlock()
 * @model abstract="true"
 * @generated
 */
public interface InstructionBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getInstructionBlock_Instructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // InstructionBlock
