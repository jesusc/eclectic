/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.runtime;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Proxy Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getIsProxyAnnotation()
 * @model
 * @generated
 */
public interface IsProxyAnnotation extends Annotation {

	/**
	 * Returns the value of the '<em><b>Reference Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Source</em>' reference.
	 * @see #setReferenceSource(EObject)
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getIsProxyAnnotation_ReferenceSource()
	 * @model required="true"
	 * @generated
	 */
	EObject getReferenceSource();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceSource <em>Reference Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Source</em>' reference.
	 * @see #getReferenceSource()
	 * @generated
	 */
	void setReferenceSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see org.eclectic.streamdesc.runtime.RuntimePackage#getIsProxyAnnotation_ReferenceName()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.runtime.IsProxyAnnotation#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);
} // IsProxyAnnotation
