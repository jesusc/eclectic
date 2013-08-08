/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.MethodLibrary#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getMethodLibrary()
 * @model
 * @generated
 */
public interface MethodLibrary extends CodeUnit {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.MethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.eclectic.idc.core.CorePackage#getMethodLibrary_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodDefinition> getMethods();

} // MethodLibrary
