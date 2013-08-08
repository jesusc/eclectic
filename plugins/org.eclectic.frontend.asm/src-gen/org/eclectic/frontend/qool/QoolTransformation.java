/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.InlineModel;
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
 *   <li>{@link org.eclectic.frontend.qool.QoolTransformation#getQueues <em>Queues</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.QoolTransformation#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getQoolTransformation()
 * @model
 * @generated
 */
public interface QoolTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Queues</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.qool.QoolQueue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.QoolPackage#getQoolTransformation_Queues()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoolQueue> getQueues();

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.qool.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.QoolPackage#getQoolTransformation_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

} // QoolTransformation
