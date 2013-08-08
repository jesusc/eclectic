/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access By Feature Optimization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.AccessByFeatureOptimization#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.AccessByFeatureOptimization#isSpeculative <em>Speculative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getAccessByFeatureOptimization()
 * @model
 * @generated
 */
public interface AccessByFeatureOptimization extends QueueOptimization {
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
	 * @see org.eclectic.idc.qool.QoolPackage#getAccessByFeatureOptimization_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.AccessByFeatureOptimization#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Speculative</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speculative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speculative</em>' attribute.
	 * @see #setSpeculative(boolean)
	 * @see org.eclectic.idc.qool.QoolPackage#getAccessByFeatureOptimization_Speculative()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isSpeculative();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.AccessByFeatureOptimization#isSpeculative <em>Speculative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speculative</em>' attribute.
	 * @see #isSpeculative()
	 * @generated
	 */
	void setSpeculative(boolean value);

} // AccessByFeatureOptimization
