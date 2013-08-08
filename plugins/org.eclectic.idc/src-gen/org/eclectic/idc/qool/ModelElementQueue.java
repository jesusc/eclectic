/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.extensions.Extension;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.ModelElementQueue#getType_ <em>Type </em>}</li>
 *   <li>{@link org.eclectic.idc.qool.ModelElementQueue#getAdditionals <em>Additionals</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.ModelElementQueue#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getModelElementQueue()
 * @model
 * @generated
 */
public interface ModelElementQueue extends Queue {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' containment reference.
	 * @see #setType_(TypeInfo)
	 * @see org.eclectic.idc.qool.QoolPackage#getModelElementQueue_Type_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeInfo getType_();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.ModelElementQueue#getType_ <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' containment reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(TypeInfo value);

	/**
	 * Returns the value of the '<em><b>Additionals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.TypeInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionals</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getModelElementQueue_Additionals()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeInfo> getAdditionals();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Extension)
	 * @see org.eclectic.idc.qool.QoolPackage#getModelElementQueue_Extension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Extension getExtension();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.ModelElementQueue#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Extension value);

} // ModelElementQueue
