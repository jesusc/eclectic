/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.TypeInfo#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.idc.core.TypeInfo#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.eclectic.idc.core.TypeInfo#isIsList <em>Is List</em>}</li>
 *   <li>{@link org.eclectic.idc.core.TypeInfo#isStrictType <em>Strict Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getTypeInfo()
 * @model
 * @generated
 */
public interface TypeInfo extends EObject {
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
	 * @see org.eclectic.idc.core.CorePackage#getTypeInfo_Model()
	 * @model
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.TypeInfo#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see org.eclectic.idc.core.CorePackage#getTypeInfo_ClassifierName()
	 * @model
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.TypeInfo#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Is List</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is List</em>' attribute.
	 * @see #setIsList(boolean)
	 * @see org.eclectic.idc.core.CorePackage#getTypeInfo_IsList()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsList();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.TypeInfo#isIsList <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is List</em>' attribute.
	 * @see #isIsList()
	 * @generated
	 */
	void setIsList(boolean value);

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
	 * @see org.eclectic.idc.core.CorePackage#getTypeInfo_StrictType()
	 * @model default="false"
	 * @generated
	 */
	boolean isStrictType();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.TypeInfo#isStrictType <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict Type</em>' attribute.
	 * @see #isStrictType()
	 * @generated
	 */
	void setStrictType(boolean value);

} // TypeInfo
