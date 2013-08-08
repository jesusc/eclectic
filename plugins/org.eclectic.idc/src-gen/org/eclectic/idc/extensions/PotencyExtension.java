/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.extensions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potency Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.extensions.PotencyExtension#getPotency <em>Potency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.extensions.ExtensionsPackage#getPotencyExtension()
 * @model
 * @generated
 */
public interface PotencyExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potency</em>' attribute.
	 * @see #setPotency(Integer)
	 * @see org.eclectic.idc.extensions.ExtensionsPackage#getPotencyExtension_Potency()
	 * @model required="true"
	 * @generated
	 */
	Integer getPotency();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.extensions.PotencyExtension#getPotency <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potency</em>' attribute.
	 * @see #getPotency()
	 * @generated
	 */
	void setPotency(Integer value);

} // PotencyExtension
