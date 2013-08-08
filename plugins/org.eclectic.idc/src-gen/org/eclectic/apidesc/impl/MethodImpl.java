/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import java.util.Collection;

import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.Method;

import org.eclectic.apidesc.ReturnKind;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getReturnVoid <em>Return Void</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getReturnArray <em>Return Array</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.MethodImpl#getReturnCollection <em>Return Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends EObjectImpl implements Method {
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
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterTypes;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnVoid() <em>Return Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVoid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_VOID_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getReturnVoid() <em>Return Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVoid()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnVoid = RETURN_VOID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnArray() <em>Return Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnArray()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_ARRAY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getReturnArray() <em>Return Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnArray()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnArray = RETURN_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnCollection() <em>Return Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_COLLECTION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getReturnCollection() <em>Return Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnCollection()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnCollection = RETURN_COLLECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterTypes() {
		if (parameterTypes == null) {
			parameterTypes = new EDataTypeUniqueEList<String>(String.class, this, ApidescPackage.METHOD__PARAMETER_TYPES);
		}
		return parameterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnVoid() {
		return returnVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnVoid(Boolean newReturnVoid) {
		Boolean oldReturnVoid = returnVoid;
		returnVoid = newReturnVoid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.METHOD__RETURN_VOID, oldReturnVoid, returnVoid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnArray() {
		return returnArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnArray(Boolean newReturnArray) {
		Boolean oldReturnArray = returnArray;
		returnArray = newReturnArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.METHOD__RETURN_ARRAY, oldReturnArray, returnArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnCollection() {
		return returnCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnCollection(Boolean newReturnCollection) {
		Boolean oldReturnCollection = returnCollection;
		returnCollection = newReturnCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.METHOD__RETURN_COLLECTION, oldReturnCollection, returnCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApidescPackage.METHOD__NAME:
				return getName();
			case ApidescPackage.METHOD__PARAMETER_TYPES:
				return getParameterTypes();
			case ApidescPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case ApidescPackage.METHOD__RETURN_VOID:
				return getReturnVoid();
			case ApidescPackage.METHOD__RETURN_ARRAY:
				return getReturnArray();
			case ApidescPackage.METHOD__RETURN_COLLECTION:
				return getReturnCollection();
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
			case ApidescPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case ApidescPackage.METHOD__PARAMETER_TYPES:
				getParameterTypes().clear();
				getParameterTypes().addAll((Collection<? extends String>)newValue);
				return;
			case ApidescPackage.METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case ApidescPackage.METHOD__RETURN_VOID:
				setReturnVoid((Boolean)newValue);
				return;
			case ApidescPackage.METHOD__RETURN_ARRAY:
				setReturnArray((Boolean)newValue);
				return;
			case ApidescPackage.METHOD__RETURN_COLLECTION:
				setReturnCollection((Boolean)newValue);
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
			case ApidescPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApidescPackage.METHOD__PARAMETER_TYPES:
				getParameterTypes().clear();
				return;
			case ApidescPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case ApidescPackage.METHOD__RETURN_VOID:
				setReturnVoid(RETURN_VOID_EDEFAULT);
				return;
			case ApidescPackage.METHOD__RETURN_ARRAY:
				setReturnArray(RETURN_ARRAY_EDEFAULT);
				return;
			case ApidescPackage.METHOD__RETURN_COLLECTION:
				setReturnCollection(RETURN_COLLECTION_EDEFAULT);
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
			case ApidescPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApidescPackage.METHOD__PARAMETER_TYPES:
				return parameterTypes != null && !parameterTypes.isEmpty();
			case ApidescPackage.METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case ApidescPackage.METHOD__RETURN_VOID:
				return RETURN_VOID_EDEFAULT == null ? returnVoid != null : !RETURN_VOID_EDEFAULT.equals(returnVoid);
			case ApidescPackage.METHOD__RETURN_ARRAY:
				return RETURN_ARRAY_EDEFAULT == null ? returnArray != null : !RETURN_ARRAY_EDEFAULT.equals(returnArray);
			case ApidescPackage.METHOD__RETURN_COLLECTION:
				return RETURN_COLLECTION_EDEFAULT == null ? returnCollection != null : !RETURN_COLLECTION_EDEFAULT.equals(returnCollection);
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
		result.append(", parameterTypes: ");
		result.append(parameterTypes);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", returnVoid: ");
		result.append(returnVoid);
		result.append(", returnArray: ");
		result.append(returnArray);
		result.append(", returnCollection: ");
		result.append(returnCollection);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
