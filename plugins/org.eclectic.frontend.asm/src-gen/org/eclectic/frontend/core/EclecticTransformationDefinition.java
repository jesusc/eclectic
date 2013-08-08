/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclectic Transformation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.EclecticTransformationDefinition#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getEclecticTransformationDefinition()
 * @model
 * @generated
 */
public interface EclecticTransformationDefinition extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.TransformationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getEclecticTransformationDefinition_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationDefinition> getTransformations();

} // EclecticTransformationDefinition
