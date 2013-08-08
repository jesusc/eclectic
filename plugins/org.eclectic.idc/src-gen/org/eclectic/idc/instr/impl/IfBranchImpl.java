/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.core.impl.InstructionBlockImpl;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.IfElseBlock;
import org.eclectic.idc.instr.InstrPackage;

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
 * An implementation of the model object '<em><b>If Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.IfBranchImpl#getBooleanVariable <em>Boolean Variable</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.IfBranchImpl#getIfBlock <em>If Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfBranchImpl extends InstructionBlockImpl implements IfBranch {
	/**
	 * The cached value of the '{@link #getBooleanVariable() <em>Boolean Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable booleanVariable;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected IfElseBlock ifBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.IF_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getBooleanVariable() {
		if (booleanVariable != null && booleanVariable.eIsProxy()) {
			InternalEObject oldBooleanVariable = (InternalEObject)booleanVariable;
			booleanVariable = (Variable)eResolveProxy(oldBooleanVariable);
			if (booleanVariable != oldBooleanVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE, oldBooleanVariable, booleanVariable));
			}
		}
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetBooleanVariable() {
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanVariable(Variable newBooleanVariable, NotificationChain msgs) {
		Variable oldBooleanVariable = booleanVariable;
		booleanVariable = newBooleanVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE, oldBooleanVariable, newBooleanVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanVariable(Variable newBooleanVariable) {
		if (newBooleanVariable != booleanVariable) {
			NotificationChain msgs = null;
			if (booleanVariable != null)
				msgs = ((InternalEObject)booleanVariable).eInverseRemove(this, CorePackage.VARIABLE__IF_CONDITIONS, Variable.class, msgs);
			if (newBooleanVariable != null)
				msgs = ((InternalEObject)newBooleanVariable).eInverseAdd(this, CorePackage.VARIABLE__IF_CONDITIONS, Variable.class, msgs);
			msgs = basicSetBooleanVariable(newBooleanVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE, newBooleanVariable, newBooleanVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseBlock getIfBlock() {
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBlock(IfElseBlock newIfBlock, NotificationChain msgs) {
		IfElseBlock oldIfBlock = ifBlock;
		ifBlock = newIfBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.IF_BRANCH__IF_BLOCK, oldIfBlock, newIfBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBlock(IfElseBlock newIfBlock) {
		if (newIfBlock != ifBlock) {
			NotificationChain msgs = null;
			if (ifBlock != null)
				msgs = ((InternalEObject)ifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_BRANCH__IF_BLOCK, null, msgs);
			if (newIfBlock != null)
				msgs = ((InternalEObject)newIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_BRANCH__IF_BLOCK, null, msgs);
			msgs = basicSetIfBlock(newIfBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.IF_BRANCH__IF_BLOCK, newIfBlock, newIfBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				if (booleanVariable != null)
					msgs = ((InternalEObject)booleanVariable).eInverseRemove(this, CorePackage.VARIABLE__IF_CONDITIONS, Variable.class, msgs);
				return basicSetBooleanVariable((Variable)otherEnd, msgs);
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
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				return basicSetBooleanVariable(null, msgs);
			case InstrPackage.IF_BRANCH__IF_BLOCK:
				return basicSetIfBlock(null, msgs);
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
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				if (resolve) return getBooleanVariable();
				return basicGetBooleanVariable();
			case InstrPackage.IF_BRANCH__IF_BLOCK:
				return getIfBlock();
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
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				setBooleanVariable((Variable)newValue);
				return;
			case InstrPackage.IF_BRANCH__IF_BLOCK:
				setIfBlock((IfElseBlock)newValue);
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
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				setBooleanVariable((Variable)null);
				return;
			case InstrPackage.IF_BRANCH__IF_BLOCK:
				setIfBlock((IfElseBlock)null);
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
			case InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE:
				return booleanVariable != null;
			case InstrPackage.IF_BRANCH__IF_BLOCK:
				return ifBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //IfBranchImpl
