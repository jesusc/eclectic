/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.MappingCardinality;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.mappings.Reference2Reference;

import org.eclectic.frontend.mappings.ReferenceRef;
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
 * An implementation of the model object '<em><b>Reference2 Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Reference2ReferenceImpl#getResolverName <em>Resolver Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Reference2ReferenceImpl extends Feature2FeatureImpl implements Reference2Reference {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final MappingCardinality CARDINALITY_EDEFAULT = MappingCardinality.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected MappingCardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceRef> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceRef> right;

	/**
	 * The default value of the '{@link #getResolverName() <em>Resolver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolverName() <em>Resolver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolverName()
	 * @generated
	 * @ordered
	 */
	protected String resolverName = RESOLVER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reference2ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.REFERENCE2_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(MappingCardinality newCardinality) {
		MappingCardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.REFERENCE2_REFERENCE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRef> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<ReferenceRef>(ReferenceRef.class, this, MappingsPackage.REFERENCE2_REFERENCE__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceRef> getRight() {
		if (right == null) {
			right = new EObjectContainmentEList<ReferenceRef>(ReferenceRef.class, this, MappingsPackage.REFERENCE2_REFERENCE__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolverName() {
		return resolverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolverName(String newResolverName) {
		String oldResolverName = resolverName;
		resolverName = newResolverName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.REFERENCE2_REFERENCE__RESOLVER_NAME, oldResolverName, resolverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.REFERENCE2_REFERENCE__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case MappingsPackage.REFERENCE2_REFERENCE__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
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
			case MappingsPackage.REFERENCE2_REFERENCE__CARDINALITY:
				return getCardinality();
			case MappingsPackage.REFERENCE2_REFERENCE__LEFT:
				return getLeft();
			case MappingsPackage.REFERENCE2_REFERENCE__RIGHT:
				return getRight();
			case MappingsPackage.REFERENCE2_REFERENCE__RESOLVER_NAME:
				return getResolverName();
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
			case MappingsPackage.REFERENCE2_REFERENCE__CARDINALITY:
				setCardinality((MappingCardinality)newValue);
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends ReferenceRef>)newValue);
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends ReferenceRef>)newValue);
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__RESOLVER_NAME:
				setResolverName((String)newValue);
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
			case MappingsPackage.REFERENCE2_REFERENCE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__LEFT:
				getLeft().clear();
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__RIGHT:
				getRight().clear();
				return;
			case MappingsPackage.REFERENCE2_REFERENCE__RESOLVER_NAME:
				setResolverName(RESOLVER_NAME_EDEFAULT);
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
			case MappingsPackage.REFERENCE2_REFERENCE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case MappingsPackage.REFERENCE2_REFERENCE__LEFT:
				return left != null && !left.isEmpty();
			case MappingsPackage.REFERENCE2_REFERENCE__RIGHT:
				return right != null && !right.isEmpty();
			case MappingsPackage.REFERENCE2_REFERENCE__RESOLVER_NAME:
				return RESOLVER_NAME_EDEFAULT == null ? resolverName != null : !RESOLVER_NAME_EDEFAULT.equals(resolverName);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", resolverName: ");
		result.append(resolverName);
		result.append(')');
		return result.toString();
	}

} //Reference2ReferenceImpl
