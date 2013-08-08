/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.seqdiagram.impl;

import java.util.Collection;

import org.eclectic.test.streaming.seqdiagram.Classifier;
import org.eclectic.test.streaming.seqdiagram.Message;
import org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.MessageImpl#getFollowingMessages <em>Following Messages</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.MessageImpl#getSourceClassifier <em>Source Classifier</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.MessageImpl#getTargetClassifier <em>Target Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The cached value of the '{@link #getFollowingMessages() <em>Following Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> followingMessages;

	/**
	 * The cached value of the '{@link #getSourceClassifier() <em>Source Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier sourceClassifier;

	/**
	 * The cached value of the '{@link #getTargetClassifier() <em>Target Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier targetClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeqdiagramPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getFollowingMessages() {
		if (followingMessages == null) {
			followingMessages = new EObjectResolvingEList<Message>(Message.class, this, SeqdiagramPackage.MESSAGE__FOLLOWING_MESSAGES);
		}
		return followingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSourceClassifier() {
		if (sourceClassifier != null && sourceClassifier.eIsProxy()) {
			InternalEObject oldSourceClassifier = (InternalEObject)sourceClassifier;
			sourceClassifier = (Classifier)eResolveProxy(oldSourceClassifier);
			if (sourceClassifier != oldSourceClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER, oldSourceClassifier, sourceClassifier));
			}
		}
		return sourceClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSourceClassifier() {
		return sourceClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClassifier(Classifier newSourceClassifier) {
		Classifier oldSourceClassifier = sourceClassifier;
		sourceClassifier = newSourceClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER, oldSourceClassifier, sourceClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getTargetClassifier() {
		if (targetClassifier != null && targetClassifier.eIsProxy()) {
			InternalEObject oldTargetClassifier = (InternalEObject)targetClassifier;
			targetClassifier = (Classifier)eResolveProxy(oldTargetClassifier);
			if (targetClassifier != oldTargetClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER, oldTargetClassifier, targetClassifier));
			}
		}
		return targetClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetTargetClassifier() {
		return targetClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassifier(Classifier newTargetClassifier) {
		Classifier oldTargetClassifier = targetClassifier;
		targetClassifier = newTargetClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER, oldTargetClassifier, targetClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeqdiagramPackage.MESSAGE__FOLLOWING_MESSAGES:
				return getFollowingMessages();
			case SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER:
				if (resolve) return getSourceClassifier();
				return basicGetSourceClassifier();
			case SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER:
				if (resolve) return getTargetClassifier();
				return basicGetTargetClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SeqdiagramPackage.MESSAGE__FOLLOWING_MESSAGES:
				getFollowingMessages().clear();
				getFollowingMessages().addAll((Collection<? extends Message>)newValue);
				return;
			case SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER:
				setSourceClassifier((Classifier)newValue);
				return;
			case SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER:
				setTargetClassifier((Classifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SeqdiagramPackage.MESSAGE__FOLLOWING_MESSAGES:
				getFollowingMessages().clear();
				return;
			case SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER:
				setSourceClassifier((Classifier)null);
				return;
			case SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER:
				setTargetClassifier((Classifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SeqdiagramPackage.MESSAGE__FOLLOWING_MESSAGES:
				return followingMessages != null && !followingMessages.isEmpty();
			case SeqdiagramPackage.MESSAGE__SOURCE_CLASSIFIER:
				return sourceClassifier != null;
			case SeqdiagramPackage.MESSAGE__TARGET_CLASSIFIER:
				return targetClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageImpl
