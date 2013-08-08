/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns.impl;

import java.util.Collection;

import org.eclectic.frontend.core.impl.LocatedElementImpl;
import org.eclectic.frontend.patterns.PObject;
import org.eclectic.frontend.patterns.POutputVariable;
import org.eclectic.frontend.patterns.Pattern;
import org.eclectic.frontend.patterns.PatternsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.patterns.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.patterns.impl.PatternImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclectic.frontend.patterns.impl.PatternImpl#getOutputVariables <em>Output Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends LocatedElementImpl implements Pattern {
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
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PObject> objects;

	/**
	 * The cached value of the '{@link #getOutputVariables() <em>Output Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<POutputVariable> outputVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<PObject>(PObject.class, this, PatternsPackage.PATTERN__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<POutputVariable> getOutputVariables() {
		if (outputVariables == null) {
			outputVariables = new EObjectContainmentEList<POutputVariable>(POutputVariable.class, this, PatternsPackage.PATTERN__OUTPUT_VARIABLES);
		}
		return outputVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.PATTERN__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case PatternsPackage.PATTERN__OUTPUT_VARIABLES:
				return ((InternalEList<?>)getOutputVariables()).basicRemove(otherEnd, msgs);
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
			case PatternsPackage.PATTERN__NAME:
				return getName();
			case PatternsPackage.PATTERN__OBJECTS:
				return getObjects();
			case PatternsPackage.PATTERN__OUTPUT_VARIABLES:
				return getOutputVariables();
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
			case PatternsPackage.PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternsPackage.PATTERN__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends PObject>)newValue);
				return;
			case PatternsPackage.PATTERN__OUTPUT_VARIABLES:
				getOutputVariables().clear();
				getOutputVariables().addAll((Collection<? extends POutputVariable>)newValue);
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
			case PatternsPackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternsPackage.PATTERN__OBJECTS:
				getObjects().clear();
				return;
			case PatternsPackage.PATTERN__OUTPUT_VARIABLES:
				getOutputVariables().clear();
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
			case PatternsPackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternsPackage.PATTERN__OBJECTS:
				return objects != null && !objects.isEmpty();
			case PatternsPackage.PATTERN__OUTPUT_VARIABLES:
				return outputVariables != null && !outputVariables.isEmpty();
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

} //PatternImpl
