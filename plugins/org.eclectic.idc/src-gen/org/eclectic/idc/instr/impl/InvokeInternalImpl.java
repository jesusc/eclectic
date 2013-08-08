/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;

import org.eclectic.idc.core.Variable;

import org.eclectic.idc.core.impl.InstructionImpl;

import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InvocationParameter;
import org.eclectic.idc.instr.InvokeInternal;

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
 * An implementation of the model object '<em><b>Invoke Internal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InvokeInternalImpl extends InvokeTransformationImpl implements InvokeInternal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeInternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.INVOKE_INTERNAL;
	}

} //InvokeInternalImpl
