/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;

import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.IfElseBlock;
import org.eclectic.idc.instr.IfInstr;
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
 * An implementation of the model object '<em><b>If Instr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.IfInstrImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.IfInstrImpl#getElsifs <em>Elsifs</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.IfInstrImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfInstrImpl extends InstructionWithResultImpl implements IfInstr {
	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected IfBranch then;

	/**
	 * The cached value of the '{@link #getElsifs() <em>Elsifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsifs()
	 * @generated
	 * @ordered
	 */
	protected EList<IfBranch> elsifs;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected IfElseBlock elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfInstrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.IF_INSTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBranch getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(IfBranch newThen, NotificationChain msgs) {
		IfBranch oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.IF_INSTR__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(IfBranch newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_INSTR__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_INSTR__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.IF_INSTR__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfBranch> getElsifs() {
		if (elsifs == null) {
			elsifs = new EObjectContainmentEList<IfBranch>(IfBranch.class, this, InstrPackage.IF_INSTR__ELSIFS);
		}
		return elsifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseBlock getElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBlock(IfElseBlock newElseBlock, NotificationChain msgs) {
		IfElseBlock oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.IF_INSTR__ELSE_BLOCK, oldElseBlock, newElseBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(IfElseBlock newElseBlock) {
		if (newElseBlock != elseBlock) {
			NotificationChain msgs = null;
			if (elseBlock != null)
				msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_INSTR__ELSE_BLOCK, null, msgs);
			if (newElseBlock != null)
				msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrPackage.IF_INSTR__ELSE_BLOCK, null, msgs);
			msgs = basicSetElseBlock(newElseBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.IF_INSTR__ELSE_BLOCK, newElseBlock, newElseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.IF_INSTR__THEN:
				return basicSetThen(null, msgs);
			case InstrPackage.IF_INSTR__ELSIFS:
				return ((InternalEList<?>)getElsifs()).basicRemove(otherEnd, msgs);
			case InstrPackage.IF_INSTR__ELSE_BLOCK:
				return basicSetElseBlock(null, msgs);
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
			case InstrPackage.IF_INSTR__THEN:
				return getThen();
			case InstrPackage.IF_INSTR__ELSIFS:
				return getElsifs();
			case InstrPackage.IF_INSTR__ELSE_BLOCK:
				return getElseBlock();
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
			case InstrPackage.IF_INSTR__THEN:
				setThen((IfBranch)newValue);
				return;
			case InstrPackage.IF_INSTR__ELSIFS:
				getElsifs().clear();
				getElsifs().addAll((Collection<? extends IfBranch>)newValue);
				return;
			case InstrPackage.IF_INSTR__ELSE_BLOCK:
				setElseBlock((IfElseBlock)newValue);
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
			case InstrPackage.IF_INSTR__THEN:
				setThen((IfBranch)null);
				return;
			case InstrPackage.IF_INSTR__ELSIFS:
				getElsifs().clear();
				return;
			case InstrPackage.IF_INSTR__ELSE_BLOCK:
				setElseBlock((IfElseBlock)null);
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
			case InstrPackage.IF_INSTR__THEN:
				return then != null;
			case InstrPackage.IF_INSTR__ELSIFS:
				return elsifs != null && !elsifs.isEmpty();
			case InstrPackage.IF_INSTR__ELSE_BLOCK:
				return elseBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //IfInstrImpl
