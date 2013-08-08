/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.FeatureMapping#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.FeatureMapping#getConstructorType <em>Constructor Type</em>}</li>
 *   <li>{@link org.eclectic.apidesc.FeatureMapping#getSetMethod <em>Set Method</em>}</li>
 *   <li>{@link org.eclectic.apidesc.FeatureMapping#getGetMethod <em>Get Method</em>}</li>
 *   <li>{@link org.eclectic.apidesc.FeatureMapping#isIsMultivalued <em>Is Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping()
 * @model abstract="true"
 * @generated
 */
public interface FeatureMapping extends EObject {

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.FeatureMapping#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Constructor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Type</em>' attribute.
	 * @see #setConstructorType(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping_ConstructorType()
	 * @model
	 * @generated
	 */
	String getConstructorType();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.FeatureMapping#getConstructorType <em>Constructor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Type</em>' attribute.
	 * @see #getConstructorType()
	 * @generated
	 */
	void setConstructorType(String value);

	/**
	 * Returns the value of the '<em><b>Set Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Method</em>' containment reference.
	 * @see #setSetMethod(SetMechanism)
	 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping_SetMethod()
	 * @model containment="true"
	 * @generated
	 */
	SetMechanism getSetMethod();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.FeatureMapping#getSetMethod <em>Set Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Method</em>' containment reference.
	 * @see #getSetMethod()
	 * @generated
	 */
	void setSetMethod(SetMechanism value);

	/**
	 * Returns the value of the '<em><b>Get Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Method</em>' containment reference.
	 * @see #setGetMethod(GetMechanism)
	 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping_GetMethod()
	 * @model containment="true"
	 * @generated
	 */
	GetMechanism getGetMethod();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.FeatureMapping#getGetMethod <em>Get Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Method</em>' containment reference.
	 * @see #getGetMethod()
	 * @generated
	 */
	void setGetMethod(GetMechanism value);

	/**
	 * Returns the value of the '<em><b>Is Multivalued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multivalued</em>' attribute.
	 * @see #setIsMultivalued(boolean)
	 * @see org.eclectic.apidesc.ApidescPackage#getFeatureMapping_IsMultivalued()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsMultivalued();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.FeatureMapping#isIsMultivalued <em>Is Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multivalued</em>' attribute.
	 * @see #isIsMultivalued()
	 * @generated
	 */
	void setIsMultivalued(boolean value);
} // FeatureMapping
