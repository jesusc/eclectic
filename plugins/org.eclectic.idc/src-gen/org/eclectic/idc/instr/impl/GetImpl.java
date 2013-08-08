/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.GetKind;
import org.eclectic.idc.instr.InstrPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.GetImpl#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.GetImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.GetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.GetImpl#getMaybeCollection <em>Maybe Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetImpl extends InstructionWithResultImpl implements Get {
	/**
	 * The cached value of the '{@link #getReceptor() <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptor()
	 * @generated
	 * @ordered
	 */
	protected Variable receptor;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final GetKind KIND_EDEFAULT = GetKind.PLAIN_GET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GetKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaybeCollection() <em>Maybe Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaybeCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAYBE_COLLECTION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMaybeCollection() <em>Maybe Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaybeCollection()
	 * @generated
	 * @ordered
	 */
	protected Boolean maybeCollection = MAYBE_COLLECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.GET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReceptor() {
		if (receptor != null && receptor.eIsProxy()) {
			InternalEObject oldReceptor = (InternalEObject)receptor;
			receptor = (Variable)eResolveProxy(oldReceptor);
			if (receptor != oldReceptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.GET__RECEPTOR, oldReceptor, receptor));
			}
		}
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReceptor() {
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceptor(Variable newReceptor, NotificationChain msgs) {
		Variable oldReceptor = receptor;
		receptor = newReceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.GET__RECEPTOR, oldReceptor, newReceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptor(Variable newReceptor) {
		if (newReceptor != receptor) {
			NotificationChain msgs = null;
			if (receptor != null)
				msgs = ((InternalEObject)receptor).eInverseRemove(this, CorePackage.VARIABLE__GET_RECEPTORS, Variable.class, msgs);
			if (newReceptor != null)
				msgs = ((InternalEObject)newReceptor).eInverseAdd(this, CorePackage.VARIABLE__GET_RECEPTORS, Variable.class, msgs);
			msgs = basicSetReceptor(newReceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.GET__RECEPTOR, newReceptor, newReceptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.GET__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(GetKind newKind) {
		GetKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.GET__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMaybeCollection() {
		return maybeCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaybeCollection(Boolean newMaybeCollection) {
		Boolean oldMaybeCollection = maybeCollection;
		maybeCollection = newMaybeCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.GET__MAYBE_COLLECTION, oldMaybeCollection, maybeCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.GET__RECEPTOR:
				if (receptor != null)
					msgs = ((InternalEObject)receptor).eInverseRemove(this, CorePackage.VARIABLE__GET_RECEPTORS, Variable.class, msgs);
				return basicSetReceptor((Variable)otherEnd, msgs);
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
			case InstrPackage.GET__RECEPTOR:
				return basicSetReceptor(null, msgs);
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
			case InstrPackage.GET__RECEPTOR:
				if (resolve) return getReceptor();
				return basicGetReceptor();
			case InstrPackage.GET__FEATURE_NAME:
				return getFeatureName();
			case InstrPackage.GET__KIND:
				return getKind();
			case InstrPackage.GET__MAYBE_COLLECTION:
				return getMaybeCollection();
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
			case InstrPackage.GET__RECEPTOR:
				setReceptor((Variable)newValue);
				return;
			case InstrPackage.GET__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case InstrPackage.GET__KIND:
				setKind((GetKind)newValue);
				return;
			case InstrPackage.GET__MAYBE_COLLECTION:
				setMaybeCollection((Boolean)newValue);
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
			case InstrPackage.GET__RECEPTOR:
				setReceptor((Variable)null);
				return;
			case InstrPackage.GET__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case InstrPackage.GET__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InstrPackage.GET__MAYBE_COLLECTION:
				setMaybeCollection(MAYBE_COLLECTION_EDEFAULT);
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
			case InstrPackage.GET__RECEPTOR:
				return receptor != null;
			case InstrPackage.GET__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case InstrPackage.GET__KIND:
				return kind != KIND_EDEFAULT;
			case InstrPackage.GET__MAYBE_COLLECTION:
				return MAYBE_COLLECTION_EDEFAULT == null ? maybeCollection != null : !MAYBE_COLLECTION_EDEFAULT.equals(maybeCollection);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(", kind: ");
		result.append(kind);
		result.append(", maybeCollection: ");
		result.append(maybeCollection);
		result.append(')');
		return result.toString();
	}

} //GetImpl
