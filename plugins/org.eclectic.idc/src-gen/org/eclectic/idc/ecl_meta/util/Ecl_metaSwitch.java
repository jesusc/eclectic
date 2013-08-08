/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta.util;

import org.eclectic.idc.ecl_meta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.ecl_meta.Ecl_metaPackage
 * @generated
 */
public class Ecl_metaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ecl_metaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecl_metaSwitch() {
		if (modelPackage == null) {
			modelPackage = Ecl_metaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ecl_metaPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KPACKAGE: {
				KPackage kPackage = (KPackage)theEObject;
				T result = caseKPackage(kPackage);
				if (result == null) result = caseNamedElement(kPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KMETAMODEL: {
				KMetamodel kMetamodel = (KMetamodel)theEObject;
				T result = caseKMetamodel(kMetamodel);
				if (result == null) result = caseKPackage(kMetamodel);
				if (result == null) result = caseNamedElement(kMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KCLASSIFIER: {
				KClassifier kClassifier = (KClassifier)theEObject;
				T result = caseKClassifier(kClassifier);
				if (result == null) result = caseNamedElement(kClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KDATA_TYPE: {
				KDataType kDataType = (KDataType)theEObject;
				T result = caseKDataType(kDataType);
				if (result == null) result = caseKClassifier(kDataType);
				if (result == null) result = caseNamedElement(kDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KPRIMITIVE_TYPE: {
				KPrimitiveType kPrimitiveType = (KPrimitiveType)theEObject;
				T result = caseKPrimitiveType(kPrimitiveType);
				if (result == null) result = caseKDataType(kPrimitiveType);
				if (result == null) result = caseKClassifier(kPrimitiveType);
				if (result == null) result = caseNamedElement(kPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KENUMERATION: {
				KEnumeration kEnumeration = (KEnumeration)theEObject;
				T result = caseKEnumeration(kEnumeration);
				if (result == null) result = caseKDataType(kEnumeration);
				if (result == null) result = caseKClassifier(kEnumeration);
				if (result == null) result = caseNamedElement(kEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KENUM_LITERAL: {
				KEnumLiteral kEnumLiteral = (KEnumLiteral)theEObject;
				T result = caseKEnumLiteral(kEnumLiteral);
				if (result == null) result = caseNamedElement(kEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KCLASS: {
				KClass kClass = (KClass)theEObject;
				T result = caseKClass(kClass);
				if (result == null) result = caseKClassifier(kClass);
				if (result == null) result = caseNamedElement(kClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE: {
				KStructuralFeature kStructuralFeature = (KStructuralFeature)theEObject;
				T result = caseKStructuralFeature(kStructuralFeature);
				if (result == null) result = caseNamedElement(kStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KATTRIBUTE: {
				KAttribute kAttribute = (KAttribute)theEObject;
				T result = caseKAttribute(kAttribute);
				if (result == null) result = caseKStructuralFeature(kAttribute);
				if (result == null) result = caseNamedElement(kAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ecl_metaPackage.KREFERENCE: {
				KReference kReference = (KReference)theEObject;
				T result = caseKReference(kReference);
				if (result == null) result = caseKStructuralFeature(kReference);
				if (result == null) result = caseNamedElement(kReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPackage(KPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KMetamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KMetamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKMetamodel(KMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKClassifier(KClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKDataType(KDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPrimitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPrimitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPrimitiveType(KPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEnumeration(KEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEnumLiteral(KEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKClass(KClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKStructuralFeature(KStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKAttribute(KAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKReference(KReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ecl_metaSwitch
