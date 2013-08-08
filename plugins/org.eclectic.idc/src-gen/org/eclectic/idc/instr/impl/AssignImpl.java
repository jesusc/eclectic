/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.InstrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.AssignImpl#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends InstructionWithResultImpl implements Assign {
	/**
	 * The cached value of the '{@link #getRightVariable() <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable rightVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRightVariable() {
		if (rightVariable != null && rightVariable.eIsProxy()) {
			InternalEObject oldRightVariable = (InternalEObject)rightVariable;
			rightVariable = (Variable)eResolveProxy(oldRightVariable);
			if (rightVariable != oldRightVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.ASSIGN__RIGHT_VARIABLE, oldRightVariable, rightVariable));
			}
		}
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRightVariable() {
		return rightVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightVariable(Variable newRightVariable, NotificationChain msgs) {
		Variable oldRightVariable = rightVariable;
		rightVariable = newRightVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.ASSIGN__RIGHT_VARIABLE, oldRightVariable, newRightVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightVariable(Variable newRightVariable) {
		if (newRightVariable != rightVariable) {
			NotificationChain msgs = null;
			if (rightVariable != null)
				msgs = ((InternalEObject)rightVariable).eInverseRemove(this, CorePackage.VARIABLE__ASSIGN_VARIABLES, Variable.class, msgs);
			if (newRightVariable != null)
				msgs = ((InternalEObject)newRightVariable).eInverseAdd(this, CorePackage.VARIABLE__ASSIGN_VARIABLES, Variable.class, msgs);
			msgs = basicSetRightVariable(newRightVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.ASSIGN__RIGHT_VARIABLE, newRightVariable, newRightVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				if (rightVariable != null)
					msgs = ((InternalEObject)rightVariable).eInverseRemove(this, CorePackage.VARIABLE__ASSIGN_VARIABLES, Variable.class, msgs);
				return basicSetRightVariable((Variable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				return basicSetRightVariable(null, msgs);
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
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				if (resolve) return getRightVariable();
				return basicGetRightVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				setRightVariable((Variable)newValue);
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
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				setRightVariable((Variable)null);
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
			case InstrPackage.ASSIGN__RIGHT_VARIABLE:
				return rightVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignImpl
