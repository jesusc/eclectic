/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.ModelDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.ModelLink#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.ModelLink#getCallee <em>Callee</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.scheduling.SchedulingPackage#getModelLink()
 * @model
 * @generated
 */
public interface ModelLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' reference.
	 * @see #setCaller(ModelDefinition)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getModelLink_Caller()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getCaller();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.ModelLink#getCaller <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(ModelDefinition value);

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(ModelDefinition)
	 * @see org.eclectic.idc.scheduling.SchedulingPackage#getModelLink_Callee()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getCallee();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.scheduling.ModelLink#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(ModelDefinition value);

} // ModelLink
