/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.patterns.PReference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.patterns.PatternsPackage#getPReference()
 * @model
 * @generated
 */
public interface PReference extends PFeature {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.patterns.PObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPReference_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<PObject> getValue();

} // PReference
