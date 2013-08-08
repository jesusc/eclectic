/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.mappings.Attribute2Attribute;
import org.eclectic.frontend.mappings.C2CModifier;
import org.eclectic.frontend.mappings.Class2Class;
import org.eclectic.frontend.mappings.ClassRef;
import org.eclectic.frontend.mappings.MappingCardinality;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Class2ClassImpl#getScopedAttributes <em>Scoped Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class2ClassImpl extends ClassMappingImpl implements Class2Class {
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
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<C2CModifier> modifiers;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassRef> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassRef> right;

	/**
	 * The cached value of the '{@link #getScopedAttributes() <em>Scoped Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute2Attribute> scopedAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.CLASS2_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.CLASS2_CLASS__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C2CModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<C2CModifier>(C2CModifier.class, this, MappingsPackage.CLASS2_CLASS__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassRef> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<ClassRef>(ClassRef.class, this, MappingsPackage.CLASS2_CLASS__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassRef> getRight() {
		if (right == null) {
			right = new EObjectContainmentEList<ClassRef>(ClassRef.class, this, MappingsPackage.CLASS2_CLASS__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute2Attribute> getScopedAttributes() {
		if (scopedAttributes == null) {
			scopedAttributes = new EObjectContainmentWithInverseEList<Attribute2Attribute>(Attribute2Attribute.class, this, MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT);
		}
		return scopedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScopedAttributes()).basicAdd(otherEnd, msgs);
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
			case MappingsPackage.CLASS2_CLASS__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CLASS2_CLASS__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CLASS2_CLASS__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				return ((InternalEList<?>)getScopedAttributes()).basicRemove(otherEnd, msgs);
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
			case MappingsPackage.CLASS2_CLASS__CARDINALITY:
				return getCardinality();
			case MappingsPackage.CLASS2_CLASS__MODIFIERS:
				return getModifiers();
			case MappingsPackage.CLASS2_CLASS__LEFT:
				return getLeft();
			case MappingsPackage.CLASS2_CLASS__RIGHT:
				return getRight();
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				return getScopedAttributes();
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
			case MappingsPackage.CLASS2_CLASS__CARDINALITY:
				setCardinality((MappingCardinality)newValue);
				return;
			case MappingsPackage.CLASS2_CLASS__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends C2CModifier>)newValue);
				return;
			case MappingsPackage.CLASS2_CLASS__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends ClassRef>)newValue);
				return;
			case MappingsPackage.CLASS2_CLASS__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends ClassRef>)newValue);
				return;
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				getScopedAttributes().clear();
				getScopedAttributes().addAll((Collection<? extends Attribute2Attribute>)newValue);
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
			case MappingsPackage.CLASS2_CLASS__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case MappingsPackage.CLASS2_CLASS__MODIFIERS:
				getModifiers().clear();
				return;
			case MappingsPackage.CLASS2_CLASS__LEFT:
				getLeft().clear();
				return;
			case MappingsPackage.CLASS2_CLASS__RIGHT:
				getRight().clear();
				return;
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				getScopedAttributes().clear();
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
			case MappingsPackage.CLASS2_CLASS__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case MappingsPackage.CLASS2_CLASS__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case MappingsPackage.CLASS2_CLASS__LEFT:
				return left != null && !left.isEmpty();
			case MappingsPackage.CLASS2_CLASS__RIGHT:
				return right != null && !right.isEmpty();
			case MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES:
				return scopedAttributes != null && !scopedAttributes.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Class2ClassImpl
