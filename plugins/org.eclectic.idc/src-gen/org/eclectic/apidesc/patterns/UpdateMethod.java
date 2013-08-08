/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclectic.apidesc.Method;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.UpdateMethod#getInterest <em>Interest</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.patterns.PatternsPackage#getUpdateMethod()
 * @model
 * @generated
 */
public interface UpdateMethod extends Method {

	/**
	 * Returns the value of the '<em><b>Interest</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interest</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interest</em>' attribute list.
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getUpdateMethod_Interest()
	 * @model
	 * @generated
	 */
	EList<Integer> getInterest();
} // UpdateMethod
