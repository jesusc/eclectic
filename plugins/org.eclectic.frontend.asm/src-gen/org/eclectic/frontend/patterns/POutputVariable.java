/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POutput Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.patterns.POutputVariable#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.patterns.PatternsPackage#getPOutputVariable()
 * @model
 * @generated
 */
public interface POutputVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(PObject)
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPOutputVariable_Object()
	 * @model required="true"
	 * @generated
	 */
	PObject getObject();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.patterns.POutputVariable#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(PObject value);

} // POutputVariable
