/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature2 Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Feature2Feature#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Feature2Feature#getConverter <em>Converter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeature2Feature()
 * @model abstract="true"
 * @generated
 */
public interface Feature2Feature extends MappingElement {

	/**
	 * Returns the value of the '<em><b>Left Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Feature</em>' containment reference.
	 * @see #setLeftFeature(FeatureRef)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeature2Feature_LeftFeature()
	 * @model containment="true"
	 * @generated
	 */
	FeatureRef getLeftFeature();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Feature2Feature#getLeftFeature <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Feature</em>' containment reference.
	 * @see #getLeftFeature()
	 * @generated
	 */
	void setLeftFeature(FeatureRef value);

	/**
	 * Returns the value of the '<em><b>Converter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter</em>' containment reference.
	 * @see #setConverter(Converter)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getFeature2Feature_Converter()
	 * @model containment="true"
	 * @generated
	 */
	Converter getConverter();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Feature2Feature#getConverter <em>Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converter</em>' containment reference.
	 * @see #getConverter()
	 * @generated
	 */
	void setConverter(Converter value);
} // Feature2Feature
