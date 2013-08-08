/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Equals Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getPropertyEqualsPredicate()
 * @model
 * @generated
 */
public interface PropertyEqualsPredicate extends QMatchPredicate {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclectic.idc.qool.QoolPackage#getPropertyEqualsPredicate_PropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Variable)
	 * @see org.eclectic.idc.qool.QoolPackage#getPropertyEqualsPredicate_Value()
	 * @model required="true"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);

} // PropertyEqualsPredicate
