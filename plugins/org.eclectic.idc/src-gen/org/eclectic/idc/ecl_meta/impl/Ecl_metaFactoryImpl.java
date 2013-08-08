/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta.impl;

import org.eclectic.idc.ecl_meta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Ecl_metaFactoryImpl extends EFactoryImpl implements Ecl_metaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ecl_metaFactory init() {
		try {
			Ecl_metaFactory theEcl_metaFactory = (Ecl_metaFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/ecl_meta"); 
			if (theEcl_metaFactory != null) {
				return theEcl_metaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ecl_metaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecl_metaFactoryImpl() {
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
			case Ecl_metaPackage.NAMED_ELEMENT: return createNamedElement();
			case Ecl_metaPackage.KPACKAGE: return createKPackage();
			case Ecl_metaPackage.KMETAMODEL: return createKMetamodel();
			case Ecl_metaPackage.KPRIMITIVE_TYPE: return createKPrimitiveType();
			case Ecl_metaPackage.KENUMERATION: return createKEnumeration();
			case Ecl_metaPackage.KENUM_LITERAL: return createKEnumLiteral();
			case Ecl_metaPackage.KCLASS: return createKClass();
			case Ecl_metaPackage.KATTRIBUTE: return createKAttribute();
			case Ecl_metaPackage.KREFERENCE: return createKReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPackage createKPackage() {
		KPackageImpl kPackage = new KPackageImpl();
		return kPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KMetamodel createKMetamodel() {
		KMetamodelImpl kMetamodel = new KMetamodelImpl();
		return kMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPrimitiveType createKPrimitiveType() {
		KPrimitiveTypeImpl kPrimitiveType = new KPrimitiveTypeImpl();
		return kPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEnumeration createKEnumeration() {
		KEnumerationImpl kEnumeration = new KEnumerationImpl();
		return kEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEnumLiteral createKEnumLiteral() {
		KEnumLiteralImpl kEnumLiteral = new KEnumLiteralImpl();
		return kEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KClass createKClass() {
		KClassImpl kClass = new KClassImpl();
		return kClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KAttribute createKAttribute() {
		KAttributeImpl kAttribute = new KAttributeImpl();
		return kAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KReference createKReference() {
		KReferenceImpl kReference = new KReferenceImpl();
		return kReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecl_metaPackage getEcl_metaPackage() {
		return (Ecl_metaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ecl_metaPackage getPackage() {
		return Ecl_metaPackage.eINSTANCE;
	}

} //Ecl_metaFactoryImpl
