/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.ExecutableUnit;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.QoolTransformation#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.QoolTransformation#getQueues <em>Queues</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.QoolTransformation#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.QoolTransformation#getInlineModels <em>Inline Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getQoolTransformation()
 * @model
 * @generated
 */
public interface QoolTransformation extends ExecutableUnit {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQoolTransformation_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Queues</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.Queue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queues</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQoolTransformation_Queues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Queue> getQueues();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.Queue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQoolTransformation_Provided()
	 * @model
	 * @generated
	 */
	EList<Queue> getProvided();

	/**
	 * Returns the value of the '<em><b>Inline Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.InlineModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Models</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQoolTransformation_InlineModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InlineModel> getInlineModels();

} // QoolTransformation
