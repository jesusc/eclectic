/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.seqdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Message#getFollowingMessages <em>Following Messages</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Message#getSourceClassifier <em>Source Classifier</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.Message#getTargetClassifier <em>Target Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Following Messages</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.test.streaming.seqdiagram.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following Messages</em>' reference list.
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getMessage_FollowingMessages()
	 * @model
	 * @generated
	 */
	EList<Message> getFollowingMessages();

	/**
	 * Returns the value of the '<em><b>Source Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Classifier</em>' reference.
	 * @see #setSourceClassifier(Classifier)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getMessage_SourceClassifier()
	 * @model
	 * @generated
	 */
	Classifier getSourceClassifier();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Message#getSourceClassifier <em>Source Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Classifier</em>' reference.
	 * @see #getSourceClassifier()
	 * @generated
	 */
	void setSourceClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Target Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Classifier</em>' reference.
	 * @see #setTargetClassifier(Classifier)
	 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage#getMessage_TargetClassifier()
	 * @model required="true"
	 * @generated
	 */
	Classifier getTargetClassifier();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.seqdiagram.Message#getTargetClassifier <em>Target Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Classifier</em>' reference.
	 * @see #getTargetClassifier()
	 * @generated
	 */
	void setTargetClassifier(Classifier value);

} // Message
