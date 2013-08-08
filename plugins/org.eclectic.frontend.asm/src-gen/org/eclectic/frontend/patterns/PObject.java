/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.patterns.PObject#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.patterns.PObject#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.patterns.PatternsPackage#getPObject()
 * @model
 * @generated
 */
public interface PObject extends Variable, LocatedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClassUse)
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPObject_Type()
	 * @model containment="true"
	 * @generated
	 */
	ClassUse getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.patterns.PObject#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassUse value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.patterns.PFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPObject_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<PFeature> getFeatures();

} // PObject
