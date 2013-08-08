/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.FeatureRef#getReferredElement <em>Referred Element</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.FeatureRef#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.FeatureRef#isMultivalued <em>Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureRef()
 * @model
 * @generated
 */
public interface FeatureRef extends MetamodelElementRef, Feature2Feature {
	/**
	 * Returns the value of the '<em><b>Referred Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Element</em>' reference.
	 * @see #setReferredElement(MatchedElement)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureRef_ReferredElement()
	 * @model required="true"
	 * @generated
	 */
	MatchedElement getReferredElement();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.FeatureRef#getReferredElement <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Element</em>' reference.
	 * @see #getReferredElement()
	 * @generated
	 */
	void setReferredElement(MatchedElement value);

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureRef_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.FeatureRef#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeatureRef_Multivalued()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultivalued();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.FeatureRef#isMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #isMultivalued()
	 * @generated
	 */
	void setMultivalued(boolean value);

} // FeatureRef
