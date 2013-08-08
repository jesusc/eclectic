/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.koan;

import org.eclectic.frontend.core.TraceInterface;
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
 *   <li>{@link org.eclectic.frontend.koan.KoanTransformation#getTraceInterface <em>Trace Interface</em>}</li>
 *   <li>{@link org.eclectic.frontend.koan.KoanTransformation#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.koan.KoanPackage#getKoanTransformation()
 * @model
 * @generated
 */
public interface KoanTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Trace Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Interface</em>' containment reference.
	 * @see #setTraceInterface(TraceInterface)
	 * @see org.eclectic.frontend.koan.KoanPackage#getKoanTransformation_TraceInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TraceInterface getTraceInterface();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.koan.KoanTransformation#getTraceInterface <em>Trace Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Interface</em>' containment reference.
	 * @see #getTraceInterface()
	 * @generated
	 */
	void setTraceInterface(TraceInterface value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.koan.KoanRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.eclectic.frontend.koan.KoanPackage#getKoanTransformation_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<KoanRule> getRules();

} // KoanTransformation
