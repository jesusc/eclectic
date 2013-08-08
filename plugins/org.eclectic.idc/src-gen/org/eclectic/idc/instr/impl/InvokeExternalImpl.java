/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.NamedElement;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.instr.InvocationParameter;
import org.eclectic.idc.instr.InvokeExternal;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.NamedInvocationParameter;
import org.eclectic.idc.instr.Set;

import org.eclectic.idc.qool.QEmit;
import org.eclectic.idc.qool.QoolPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke External</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeExternalImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeExternalImpl#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeExternalImpl#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeExternalImpl#getSrcTraceAttributeName <em>Src Trace Attribute Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeExternalImpl#getTgtTraceAttributeName <em>Tgt Trace Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeExternalImpl extends InvokeTransformationImpl implements InvokeExternal {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedInvocationParameter> parameters;

	/**
	 * The cached value of the '{@link #getOutputResolutionSourceElement() <em>Output Resolution Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputResolutionSourceElement()
	 * @generated
	 * @ordered
	 */
	protected Variable outputResolutionSourceElement;

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
	 * The default value of the '{@link #getSrcTraceAttributeName() <em>Src Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_TRACE_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcTraceAttributeName() <em>Src Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String srcTraceAttributeName = SRC_TRACE_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTgtTraceAttributeName() <em>Tgt Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TGT_TRACE_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTgtTraceAttributeName() <em>Tgt Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtTraceAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String tgtTraceAttributeName = TGT_TRACE_ATTRIBUTE_NAME_EDEFAULT;

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
		return InstrPackage.Literals.INVOKE_EXTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedInvocationParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<NamedInvocationParameter>(NamedInvocationParameter.class, this, InstrPackage.INVOKE_EXTERNAL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getOutputResolutionSourceElement() {
		if (outputResolutionSourceElement != null && outputResolutionSourceElement.eIsProxy()) {
			InternalEObject oldOutputResolutionSourceElement = (InternalEObject)outputResolutionSourceElement;
			outputResolutionSourceElement = (Variable)eResolveProxy(oldOutputResolutionSourceElement);
			if (outputResolutionSourceElement != oldOutputResolutionSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, oldOutputResolutionSourceElement, outputResolutionSourceElement));
			}
		}
		return outputResolutionSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetOutputResolutionSourceElement() {
		return outputResolutionSourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputResolutionSourceElement(Variable newOutputResolutionSourceElement) {
		Variable oldOutputResolutionSourceElement = outputResolutionSourceElement;
		outputResolutionSourceElement = newOutputResolutionSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT, oldOutputResolutionSourceElement, outputResolutionSourceElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_EXTERNAL__QUEUE_NAME, oldQueueName, queueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcTraceAttributeName() {
		return srcTraceAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcTraceAttributeName(String newSrcTraceAttributeName) {
		String oldSrcTraceAttributeName = srcTraceAttributeName;
		srcTraceAttributeName = newSrcTraceAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME, oldSrcTraceAttributeName, srcTraceAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTgtTraceAttributeName() {
		return tgtTraceAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgtTraceAttributeName(String newTgtTraceAttributeName) {
		String oldTgtTraceAttributeName = tgtTraceAttributeName;
		tgtTraceAttributeName = newTgtTraceAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME, oldTgtTraceAttributeName, tgtTraceAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.INVOKE_EXTERNAL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case InstrPackage.INVOKE_EXTERNAL__PARAMETERS:
				return getParameters();
			case InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				if (resolve) return getOutputResolutionSourceElement();
				return basicGetOutputResolutionSourceElement();
			case InstrPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				return getQueueName();
			case InstrPackage.INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME:
				return getSrcTraceAttributeName();
			case InstrPackage.INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME:
				return getTgtTraceAttributeName();
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
			case InstrPackage.INVOKE_EXTERNAL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends NamedInvocationParameter>)newValue);
				return;
			case InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				setOutputResolutionSourceElement((Variable)newValue);
				return;
			case InstrPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				setQueueName((String)newValue);
				return;
			case InstrPackage.INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME:
				setSrcTraceAttributeName((String)newValue);
				return;
			case InstrPackage.INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME:
				setTgtTraceAttributeName((String)newValue);
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
			case InstrPackage.INVOKE_EXTERNAL__PARAMETERS:
				getParameters().clear();
				return;
			case InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				setOutputResolutionSourceElement((Variable)null);
				return;
			case InstrPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				setQueueName(QUEUE_NAME_EDEFAULT);
				return;
			case InstrPackage.INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME:
				setSrcTraceAttributeName(SRC_TRACE_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case InstrPackage.INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME:
				setTgtTraceAttributeName(TGT_TRACE_ATTRIBUTE_NAME_EDEFAULT);
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
			case InstrPackage.INVOKE_EXTERNAL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case InstrPackage.INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT:
				return outputResolutionSourceElement != null;
			case InstrPackage.INVOKE_EXTERNAL__QUEUE_NAME:
				return QUEUE_NAME_EDEFAULT == null ? queueName != null : !QUEUE_NAME_EDEFAULT.equals(queueName);
			case InstrPackage.INVOKE_EXTERNAL__SRC_TRACE_ATTRIBUTE_NAME:
				return SRC_TRACE_ATTRIBUTE_NAME_EDEFAULT == null ? srcTraceAttributeName != null : !SRC_TRACE_ATTRIBUTE_NAME_EDEFAULT.equals(srcTraceAttributeName);
			case InstrPackage.INVOKE_EXTERNAL__TGT_TRACE_ATTRIBUTE_NAME:
				return TGT_TRACE_ATTRIBUTE_NAME_EDEFAULT == null ? tgtTraceAttributeName != null : !TGT_TRACE_ATTRIBUTE_NAME_EDEFAULT.equals(tgtTraceAttributeName);
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
		result.append(", srcTraceAttributeName: ");
		result.append(srcTraceAttributeName);
		result.append(", tgtTraceAttributeName: ");
		result.append(tgtTraceAttributeName);
		result.append(')');
		return result.toString();
	}

} //InvokeExternalImpl
