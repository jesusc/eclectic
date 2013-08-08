/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.PropertyWrite#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.PropertyWrite#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.PropertyWrite#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getPropertyWrite()
 * @model
 * @generated
 */
public interface PropertyWrite extends Expression {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.eclectic.frontend.core.CorePackage#getPropertyWrite_Property()
	 * @model required="true"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.PropertyWrite#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Variable)
	 * @see org.eclectic.frontend.core.CorePackage#getPropertyWrite_Receptor()
	 * @model required="true"
	 * @generated
	 */
	Variable getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.PropertyWrite#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Variable value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.eclectic.frontend.core.CorePackage#getPropertyWrite_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.PropertyWrite#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // PropertyWrite
