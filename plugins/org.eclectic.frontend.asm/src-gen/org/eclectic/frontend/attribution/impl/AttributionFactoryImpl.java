/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution.impl;

import org.eclectic.frontend.attribution.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributionFactoryImpl extends EFactoryImpl implements AttributionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributionFactory init() {
		try {
			AttributionFactory theAttributionFactory = (AttributionFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/attributionL"); 
			if (theAttributionFactory != null) {
				return theAttributionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION: return createAttributionTransformation();
			case AttributionPackage.INHERITED_ATTRIBUTE_DCL: return createInheritedAttributeDcl();
			case AttributionPackage.SYNTHESIZED_ATTRIBUTE_DCL: return createSynthesizedAttributeDcl();
			case AttributionPackage.ATTRIBUTION_RULE: return createAttributionRule();
			case AttributionPackage.RULE_SELF: return createRuleSelf();
			case AttributionPackage.ATTRIBUTE_INIT: return createAttributeInit();
			case AttributionPackage.ATTRIBUTE_USE: return createAttributeUse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributionTransformation createAttributionTransformation() {
		AttributionTransformationImpl attributionTransformation = new AttributionTransformationImpl();
		return attributionTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedAttributeDcl createInheritedAttributeDcl() {
		InheritedAttributeDclImpl inheritedAttributeDcl = new InheritedAttributeDclImpl();
		return inheritedAttributeDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynthesizedAttributeDcl createSynthesizedAttributeDcl() {
		SynthesizedAttributeDclImpl synthesizedAttributeDcl = new SynthesizedAttributeDclImpl();
		return synthesizedAttributeDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributionRule createAttributionRule() {
		AttributionRuleImpl attributionRule = new AttributionRuleImpl();
		return attributionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSelf createRuleSelf() {
		RuleSelfImpl ruleSelf = new RuleSelfImpl();
		return ruleSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeInit createAttributeInit() {
		AttributeInitImpl attributeInit = new AttributeInitImpl();
		return attributeInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUse createAttributeUse() {
		AttributeUseImpl attributeUse = new AttributeUseImpl();
		return attributeUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributionPackage getAttributionPackage() {
		return (AttributionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttributionPackage getPackage() {
		return AttributionPackage.eINSTANCE;
	}

} //AttributionFactoryImpl
