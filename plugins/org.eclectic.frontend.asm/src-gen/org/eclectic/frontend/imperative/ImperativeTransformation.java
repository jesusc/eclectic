/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative;

import org.eclectic.frontend.core.TransformationDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.imperative.ImperativeTransformation#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.imperative.ImperativePackage#getImperativeTransformation()
 * @model
 * @generated
 */
public interface ImperativeTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.imperative.MethodDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getImperativeTransformation_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodDefinition> getMethods();

} // ImperativeTransformation
