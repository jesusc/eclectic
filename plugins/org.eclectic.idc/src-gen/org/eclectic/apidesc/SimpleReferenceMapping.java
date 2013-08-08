/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Reference Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.SimpleReferenceMapping#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getSimpleReferenceMapping()
 * @model
 * @generated
 */
public interface SimpleReferenceMapping extends FeatureMapping {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ClassMapping)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleReferenceMapping_Type()
	 * @model required="true"
	 * @generated
	 */
	ClassMapping getType();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleReferenceMapping#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassMapping value);
} // SimpleReferenceMapping
