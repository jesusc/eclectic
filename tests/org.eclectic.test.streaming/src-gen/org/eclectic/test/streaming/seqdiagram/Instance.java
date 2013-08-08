/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.seqdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Instance#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Instance#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId_hex <em>Object Id hex</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Instance#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Classifier {
	/**
	 * Returns the value of the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Name</em>' attribute.
	 * @see #setDebugName(String)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance_DebugName()
	 * @model
	 * @generated
	 */
	String getDebugName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Instance#getDebugName <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Name</em>' attribute.
	 * @see #getDebugName()
	 * @generated
	 */
	void setDebugName(String value);

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(int)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance_ObjectId()
	 * @model
	 * @generated
	 */
	int getObjectId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(int value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(int)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance_NodeId()
	 * @model
	 * @generated
	 */
	int getNodeId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Instance#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(int value);

	/**
	 * Returns the value of the '<em><b>Object Id hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id hex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id hex</em>' attribute.
	 * @see #setObjectId_hex(String)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance_ObjectId_hex()
	 * @model
	 * @generated
	 */
	String getObjectId_hex();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId_hex <em>Object Id hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id hex</em>' attribute.
	 * @see #getObjectId_hex()
	 * @generated
	 */
	void setObjectId_hex(String value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' reference.
	 * @see #setClazz(org.eclectic.test.streaming.seqdiagram.Class)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getInstance_Clazz()
	 * @model required="true"
	 * @generated
	 */
	org.eclectic.test.streaming.seqdiagram.Class getClazz();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Instance#getClazz <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(org.eclectic.test.streaming.seqdiagram.Class value);

} // Instance
