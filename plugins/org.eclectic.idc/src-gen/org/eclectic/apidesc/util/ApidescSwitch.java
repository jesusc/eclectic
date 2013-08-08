/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.util;

import org.eclectic.apidesc.*;

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
 * @see org.eclectic.apidesc.ApidescPackage
 * @generated
 */
public class ApidescSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApidescPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApidescSwitch() {
		if (modelPackage == null) {
			modelPackage = ApidescPackage.eINSTANCE;
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
			case ApidescPackage.API_DESCRIPTION: {
				ApiDescription apiDescription = (ApiDescription)theEObject;
				T result = caseApiDescription(apiDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.CLASS_MAPPING: {
				ClassMapping classMapping = (ClassMapping)theEObject;
				T result = caseClassMapping(classMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SIMPLE_CLASS_MAPPING: {
				SimpleClassMapping simpleClassMapping = (SimpleClassMapping)theEObject;
				T result = caseSimpleClassMapping(simpleClassMapping);
				if (result == null) result = caseClassMapping(simpleClassMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.CREATION_MECHANISM: {
				CreationMechanism creationMechanism = (CreationMechanism)theEObject;
				T result = caseCreationMechanism(creationMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SET_FEATURE: {
				SetFeature setFeature = (SetFeature)theEObject;
				T result = caseSetFeature(setFeature);
				if (result == null) result = caseStatement(setFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseCreationMechanism(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.FEATURE_MAPPING: {
				FeatureMapping featureMapping = (FeatureMapping)theEObject;
				T result = caseFeatureMapping(featureMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SET_MECHANISM: {
				SetMechanism setMechanism = (SetMechanism)theEObject;
				T result = caseSetMechanism(setMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SIMPLE_SET: {
				SimpleSet simpleSet = (SimpleSet)theEObject;
				T result = caseSimpleSet(simpleSet);
				if (result == null) result = caseSetMechanism(simpleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.GET_MECHANISM: {
				GetMechanism getMechanism = (GetMechanism)theEObject;
				T result = caseGetMechanism(getMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SIMPLE_GET: {
				SimpleGet simpleGet = (SimpleGet)theEObject;
				T result = caseSimpleGet(simpleGet);
				if (result == null) result = caseGetMechanism(simpleGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.GENERIC_GET: {
				GenericGet genericGet = (GenericGet)theEObject;
				T result = caseGenericGet(genericGet);
				if (result == null) result = caseSimpleGet(genericGet);
				if (result == null) result = caseGetMechanism(genericGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.GENERIC_SET: {
				GenericSet genericSet = (GenericSet)theEObject;
				T result = caseGenericSet(genericSet);
				if (result == null) result = caseSimpleSet(genericSet);
				if (result == null) result = caseSetMechanism(genericSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.ATTRIBUTE_MAPPING: {
				AttributeMapping attributeMapping = (AttributeMapping)theEObject;
				T result = caseAttributeMapping(attributeMapping);
				if (result == null) result = caseFeatureMapping(attributeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SIMPLE_ATTRIBUTE_MAPPING: {
				SimpleAttributeMapping simpleAttributeMapping = (SimpleAttributeMapping)theEObject;
				T result = caseSimpleAttributeMapping(simpleAttributeMapping);
				if (result == null) result = caseAttributeMapping(simpleAttributeMapping);
				if (result == null) result = caseFeatureMapping(simpleAttributeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.SIMPLE_REFERENCE_MAPPING: {
				SimpleReferenceMapping simpleReferenceMapping = (SimpleReferenceMapping)theEObject;
				T result = caseSimpleReferenceMapping(simpleReferenceMapping);
				if (result == null) result = caseFeatureMapping(simpleReferenceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApidescPackage.DECLARED_ELEMENT: {
				DeclaredElement declaredElement = (DeclaredElement)theEObject;
				T result = caseDeclaredElement(declaredElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiDescription(ApiDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMapping(ClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleClassMapping(SimpleClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationMechanism(CreationMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetFeature(SetFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMapping(FeatureMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMechanism(SetMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSet(SimpleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMechanism(GetMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleGet(SimpleGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericGet(GenericGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericSet(GenericSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMapping(AttributeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttributeMapping(SimpleAttributeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Reference Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Reference Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleReferenceMapping(SimpleReferenceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredElement(DeclaredElement object) {
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

} //ApidescSwitch
