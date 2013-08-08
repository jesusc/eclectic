/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.impl.LocatedElementImpl;
import org.eclectic.frontend.mappings.C2CModifier;
import org.eclectic.frontend.mappings.ClassDef;
import org.eclectic.frontend.mappings.Context;
import org.eclectic.frontend.mappings.MappingElement;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.mappings.MatchedElement;
import org.eclectic.frontend.mappings.Section;

import org.eclectic.frontend.mappings.Tag;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ContextImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends LocatedElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedElement> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedElement> right;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingElement> mappings;

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
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedElement> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<MatchedElement>(MatchedElement.class, this, MappingsPackage.CONTEXT__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedElement> getRight() {
		if (right == null) {
			right = new EObjectContainmentEList<MatchedElement>(MatchedElement.class, this, MappingsPackage.CONTEXT__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingElement> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<MappingElement>(MappingElement.class, this, MappingsPackage.CONTEXT__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C2CModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<C2CModifier>(C2CModifier.class, this, MappingsPackage.CONTEXT__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, MappingsPackage.CONTEXT__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, MappingsPackage.CONTEXT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.CONTEXT__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CONTEXT__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CONTEXT__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CONTEXT__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CONTEXT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case MappingsPackage.CONTEXT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case MappingsPackage.CONTEXT__LEFT:
				return getLeft();
			case MappingsPackage.CONTEXT__RIGHT:
				return getRight();
			case MappingsPackage.CONTEXT__MAPPINGS:
				return getMappings();
			case MappingsPackage.CONTEXT__MODIFIERS:
				return getModifiers();
			case MappingsPackage.CONTEXT__SECTIONS:
				return getSections();
			case MappingsPackage.CONTEXT__TAGS:
				return getTags();
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
			case MappingsPackage.CONTEXT__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends MatchedElement>)newValue);
				return;
			case MappingsPackage.CONTEXT__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends MatchedElement>)newValue);
				return;
			case MappingsPackage.CONTEXT__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends MappingElement>)newValue);
				return;
			case MappingsPackage.CONTEXT__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends C2CModifier>)newValue);
				return;
			case MappingsPackage.CONTEXT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case MappingsPackage.CONTEXT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case MappingsPackage.CONTEXT__LEFT:
				getLeft().clear();
				return;
			case MappingsPackage.CONTEXT__RIGHT:
				getRight().clear();
				return;
			case MappingsPackage.CONTEXT__MAPPINGS:
				getMappings().clear();
				return;
			case MappingsPackage.CONTEXT__MODIFIERS:
				getModifiers().clear();
				return;
			case MappingsPackage.CONTEXT__SECTIONS:
				getSections().clear();
				return;
			case MappingsPackage.CONTEXT__TAGS:
				getTags().clear();
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
			case MappingsPackage.CONTEXT__LEFT:
				return left != null && !left.isEmpty();
			case MappingsPackage.CONTEXT__RIGHT:
				return right != null && !right.isEmpty();
			case MappingsPackage.CONTEXT__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case MappingsPackage.CONTEXT__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case MappingsPackage.CONTEXT__SECTIONS:
				return sections != null && !sections.isEmpty();
			case MappingsPackage.CONTEXT__TAGS:
				return tags != null && !tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
