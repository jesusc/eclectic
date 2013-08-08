/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.ObjectSyntax#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getObjectSyntax()
 * @model
 * @generated
 */
public interface ObjectSyntax extends ReferenceAssignment {

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectInstantiation)
	 * @see org.eclectic.frontend.tao.TaoPackage#getObjectSyntax_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectInstantiation getObject();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.tao.ObjectSyntax#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectInstantiation value);
} // ObjectSyntax
