/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.ModelDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Of Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.KindOfPredicate#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.KindOfPredicate#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getKindOfPredicate()
 * @model
 * @generated
 */
public interface KindOfPredicate extends QMatchPredicate {
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
	 * @see org.eclectic.idc.qool.QoolPackage#getKindOfPredicate_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.KindOfPredicate#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelDefinition)
	 * @see org.eclectic.idc.qool.QoolPackage#getKindOfPredicate_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.KindOfPredicate#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

} // KindOfPredicate
