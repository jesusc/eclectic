/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.InlineFeature#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.InlineFeature#isMultivalued <em>Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getInlineFeature()
 * @model
 * @generated
 */
public interface InlineFeature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeExpression)
	 * @see org.eclectic.frontend.core.CorePackage#getInlineFeature_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeExpression getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.InlineFeature#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeExpression value);

	/**
	 * Returns the value of the '<em><b>Multivalued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued</em>' attribute.
	 * @see #setMultivalued(boolean)
	 * @see org.eclectic.frontend.core.CorePackage#getInlineFeature_Multivalued()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.InlineFeature#isMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #isMultivalued()
	 * @generated
	 */
	void setMultivalued(boolean value);

} // InlineFeature
