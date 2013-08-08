/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.ImportedModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.RequiredQueue#getImportedModel <em>Imported Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getRequiredQueue()
 * @model
 * @generated
 */
public interface RequiredQueue extends Queue {

	/**
	 * Returns the value of the '<em><b>Imported Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.ImportedModel#getCapabilityQueues <em>Capability Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Model</em>' container reference.
	 * @see #setImportedModel(ImportedModel)
	 * @see org.eclectic.idc.qool.QoolPackage#getRequiredQueue_ImportedModel()
	 * @see org.eclectic.idc.core.ImportedModel#getCapabilityQueues
	 * @model opposite="capabilityQueues" required="true" transient="false"
	 * @generated
	 */
	ImportedModel getImportedModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.RequiredQueue#getImportedModel <em>Imported Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Model</em>' container reference.
	 * @see #getImportedModel()
	 * @generated
	 */
	void setImportedModel(ImportedModel value);
} // RequiredQueue
