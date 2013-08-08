/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.TransformationDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionTransformation#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionTransformation#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionTransformation()
 * @model
 * @generated
 */
public interface AttributionTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.attribution.AttributeDcl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionTransformation_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDcl> getAttributes();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.attribution.AttributionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionTransformation_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributionRule> getRules();

} // AttributionTransformation
