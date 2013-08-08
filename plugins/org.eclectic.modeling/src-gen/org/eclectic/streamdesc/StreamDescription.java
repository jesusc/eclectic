/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.StreamDescription#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.StreamDescription#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.StreamDescription#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.StreamDescription#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.streamdesc.StreamdescPackage#getStreamDescription()
 * @model
 * @generated
 */
public interface StreamDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Name</em>' attribute.
	 * @see #setStreamName(String)
	 * @see org.eclectic.streamdesc.StreamdescPackage#getStreamDescription_StreamName()
	 * @model required="true"
	 * @generated
	 */
	String getStreamName();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.StreamDescription#getStreamName <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Name</em>' attribute.
	 * @see #getStreamName()
	 * @generated
	 */
	void setStreamName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Name</em>' attribute.
	 * @see #setMetamodelName(String)
	 * @see org.eclectic.streamdesc.StreamdescPackage#getStreamDescription_MetamodelName()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodelName();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.StreamDescription#getMetamodelName <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel Name</em>' attribute.
	 * @see #getMetamodelName()
	 * @generated
	 */
	void setMetamodelName(String value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.streamdesc.KeySpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see org.eclectic.streamdesc.StreamdescPackage#getStreamDescription_Keys()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeySpec> getKeys();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.streamdesc.SlidingWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see org.eclectic.streamdesc.StreamdescPackage#getStreamDescription_Windows()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlidingWindow> getWindows();

} // StreamDescription
