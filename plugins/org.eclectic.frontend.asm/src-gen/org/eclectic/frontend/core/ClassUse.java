/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.ClassUse#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.ClassUse#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.ClassUse#isStrictType <em>Strict Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getClassUse()
 * @model
 * @generated
 */
public interface ClassUse extends TypeExpression, ImplicitlyAnnotableElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(RepresentModel)
	 * @see org.eclectic.frontend.core.CorePackage#getClassUse_Model()
	 * @model required="true"
	 * @generated
	 */
	RepresentModel getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.ClassUse#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(RepresentModel value);

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
	 * @see org.eclectic.frontend.core.CorePackage#getClassUse_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.ClassUse#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Strict Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict Type</em>' attribute.
	 * @see #setStrictType(boolean)
	 * @see org.eclectic.frontend.core.CorePackage#getClassUse_StrictType()
	 * @model default="false"
	 * @generated
	 */
	boolean isStrictType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.ClassUse#isStrictType <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict Type</em>' attribute.
	 * @see #isStrictType()
	 * @generated
	 */
	void setStrictType(boolean value);

} // ClassUse
