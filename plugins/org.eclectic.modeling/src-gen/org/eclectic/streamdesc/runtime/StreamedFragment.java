/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streamed Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.runtime.StreamedFragment#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.StreamedFragment#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.StreamedFragment#getNonProxyElements <em>Non Proxy Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.StreamedFragment#getProxyElements <em>Proxy Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.StreamedFragment#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment()
 * @model
 * @generated
 */
public interface StreamedFragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.runtime.StreamedFragment#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Non Proxy Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Proxy Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Proxy Elements</em>' reference list.
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment_NonProxyElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getNonProxyElements();

	/**
	 * Returns the value of the '<em><b>Proxy Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Elements</em>' reference list.
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment_ProxyElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getProxyElements();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.streamdesc.runtime.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getStreamedFragment_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // StreamedFragment
