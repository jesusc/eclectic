/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative.impl;

import java.util.Collection;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.Statement;

import org.eclectic.frontend.core.impl.LocatedElementImpl;

import org.eclectic.frontend.imperative.ImperativePackage;
import org.eclectic.frontend.imperative.MethodDefinition;
import org.eclectic.frontend.imperative.MethodParameter;

import org.eclectic.frontend.imperative.MethodSelf;
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
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl#getSelf <em>Self</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends LocatedElementImpl implements MethodDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodParameter> formalParameters;

	/**
	 * The cached value of the '{@link #getSelf() <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelf()
	 * @generated
	 * @ordered
	 */
	protected MethodSelf self;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassUse type;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativePackage.Literals.METHOD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativePackage.METHOD_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodParameter> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList<MethodParameter>(MethodParameter.class, this, ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSelf getSelf() {
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelf(MethodSelf newSelf, NotificationChain msgs) {
		MethodSelf oldSelf = self;
		self = newSelf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativePackage.METHOD_DEFINITION__SELF, oldSelf, newSelf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelf(MethodSelf newSelf) {
		if (newSelf != self) {
			NotificationChain msgs = null;
			if (self != null)
				msgs = ((InternalEObject)self).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativePackage.METHOD_DEFINITION__SELF, null, msgs);
			if (newSelf != null)
				msgs = ((InternalEObject)newSelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativePackage.METHOD_DEFINITION__SELF, null, msgs);
			msgs = basicSetSelf(newSelf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativePackage.METHOD_DEFINITION__SELF, newSelf, newSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ClassUse newType, NotificationChain msgs) {
		ClassUse oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativePackage.METHOD_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassUse newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativePackage.METHOD_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativePackage.METHOD_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativePackage.METHOD_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, ImperativePackage.METHOD_DEFINITION__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS:
				return ((InternalEList<?>)getFormalParameters()).basicRemove(otherEnd, msgs);
			case ImperativePackage.METHOD_DEFINITION__SELF:
				return basicSetSelf(null, msgs);
			case ImperativePackage.METHOD_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ImperativePackage.METHOD_DEFINITION__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case ImperativePackage.METHOD_DEFINITION__NAME:
				return getName();
			case ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS:
				return getFormalParameters();
			case ImperativePackage.METHOD_DEFINITION__SELF:
				return getSelf();
			case ImperativePackage.METHOD_DEFINITION__TYPE:
				return getType();
			case ImperativePackage.METHOD_DEFINITION__STATEMENTS:
				return getStatements();
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
			case ImperativePackage.METHOD_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends MethodParameter>)newValue);
				return;
			case ImperativePackage.METHOD_DEFINITION__SELF:
				setSelf((MethodSelf)newValue);
				return;
			case ImperativePackage.METHOD_DEFINITION__TYPE:
				setType((ClassUse)newValue);
				return;
			case ImperativePackage.METHOD_DEFINITION__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
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
			case ImperativePackage.METHOD_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
			case ImperativePackage.METHOD_DEFINITION__SELF:
				setSelf((MethodSelf)null);
				return;
			case ImperativePackage.METHOD_DEFINITION__TYPE:
				setType((ClassUse)null);
				return;
			case ImperativePackage.METHOD_DEFINITION__STATEMENTS:
				getStatements().clear();
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
			case ImperativePackage.METHOD_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImperativePackage.METHOD_DEFINITION__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
			case ImperativePackage.METHOD_DEFINITION__SELF:
				return self != null;
			case ImperativePackage.METHOD_DEFINITION__TYPE:
				return type != null;
			case ImperativePackage.METHOD_DEFINITION__STATEMENTS:
				return statements != null && !statements.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodDefinitionImpl
