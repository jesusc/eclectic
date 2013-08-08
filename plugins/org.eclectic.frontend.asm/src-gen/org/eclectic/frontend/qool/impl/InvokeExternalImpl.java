/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import java.util.Collection;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Statement;

import org.eclectic.frontend.core.Variable;
import org.eclectic.frontend.qool.InvocationParameter;
import org.eclectic.frontend.qool.InvokeExternal;
import org.eclectic.frontend.qool.NamedInvocationParameter;
import org.eclectic.frontend.qool.QoolPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke External</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.impl.InvokeExternalImpl#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.InvokeExternalImpl#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.InvokeExternalImpl#getTraceAttributeName <em>Trace Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeExternalImpl extends InvokeTransformationImpl implements InvokeExternal {
	/**
	 * The cached value of the '{@link #getOutputResolutionSourceElement() <em>Output Resolution Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputResolutionSourceElement()
	 * @generated
	 * @ordered
	 */
	protected Expression outputResolutionSourceElement;

	/**
	 * The default value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected String queueName = QUEUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceAttributeName() <em>Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceAttributeName() <em>Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String traceAttributeName = TRACE_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeExternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.INVOKE_EXTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOutputResolutionSourceElement() {
		return outputResolutionSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputResolutionSourceElement(Expression newOutputResolutionSourceElement, NotificationChain msgs) {
		Expression oldOutputResolutionSourceElement = outputResolutionSourceElement;
		outputResolutionSourceElement = newOutputResolutionSourceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, oldOutputResolutionSourceElement, newOutputResolutionSourceElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputResolutionSourceElement(Expression newOutputResolutionSourceElement) {
		if (newOutputResolutionSourceElement != outputResolutionSourceElement) {
			NotificationChain msgs = null;
			if (outputResolutionSourceElement != null)
				msgs = ((InternalEObject)outputResolutionSourceElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, null, msgs);
			if (newOutputResolutionSourceElement != null)
				msgs = ((InternalEObject)newOutputResolutionSourceElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, null, msgs);
			msgs = basicSetOutputResolutionSourceElement(newOutputResolutionSourceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, newOutputResolutionSourceElement, newOutputResolutionSourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueName(String newQueueName) {
		String oldQueueName = queueName;
		queueName = newQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.INVOKE_EXTERNAL__QUEUE_NAME, oldQueueName, queueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceAttributeName() {
		return traceAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceAttributeName(String newTraceAttributeName) {
		String oldTraceAttributeName = traceAttributeName;
		traceAttributeName = newTraceAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME, oldTraceAttributeName, traceAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				return basicSetOutputResolutionSourceElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				return getOutputResolutionSourceElement();
			case QoolPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				return getQueueName();
			case QoolPackage.INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME:
				return getTraceAttributeName();
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
			case QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				setOutputResolutionSourceElement((Expression)newValue);
				return;
			case QoolPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				setQueueName((String)newValue);
				return;
			case QoolPackage.INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME:
				setTraceAttributeName((String)newValue);
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
			case QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				setOutputResolutionSourceElement((Expression)null);
				return;
			case QoolPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				setQueueName(QUEUE_NAME_EDEFAULT);
				return;
			case QoolPackage.INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME:
				setTraceAttributeName(TRACE_ATTRIBUTE_NAME_EDEFAULT);
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
			case QoolPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				return outputResolutionSourceElement != null;
			case QoolPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				return QUEUE_NAME_EDEFAULT == null ? queueName != null : !QUEUE_NAME_EDEFAULT.equals(queueName);
			case QoolPackage.INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME:
				return TRACE_ATTRIBUTE_NAME_EDEFAULT == null ? traceAttributeName != null : !TRACE_ATTRIBUTE_NAME_EDEFAULT.equals(traceAttributeName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (queueName: ");
		result.append(queueName);
		result.append(", traceAttributeName: ");
		result.append(traceAttributeName);
		result.append(')');
		return result.toString();
	}

} //InvokeExternalImpl
