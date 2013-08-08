/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import java.util.Collection;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ApidescPackage;

import org.eclectic.apidesc.ClassMapping;
import org.eclectic.apidesc.DeclaredElement;
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
 * An implementation of the model object '<em><b>Api Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.ApiDescriptionImpl#getApiName <em>Api Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.ApiDescriptionImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.ApiDescriptionImpl#getMapperClassName <em>Mapper Class Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.ApiDescriptionImpl#getClassMappings <em>Class Mappings</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.ApiDescriptionImpl#getDeclaredElements <em>Declared Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApiDescriptionImpl extends EObjectImpl implements ApiDescription {
	/**
	 * The default value of the '{@link #getApiName() <em>Api Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiName()
	 * @generated
	 * @ordered
	 */
	protected static final String API_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiName() <em>Api Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiName()
	 * @generated
	 * @ordered
	 */
	protected String apiName = API_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected String metamodelName = METAMODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapperClassName() <em>Mapper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapperClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapperClassName() <em>Mapper Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapperClassName()
	 * @generated
	 * @ordered
	 */
	protected String mapperClassName = MAPPER_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassMappings() <em>Class Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassMapping> classMappings;

	/**
	 * The cached value of the '{@link #getDeclaredElements() <em>Declared Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclaredElement> declaredElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.API_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiName() {
		return apiName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiName(String newApiName) {
		String oldApiName = apiName;
		apiName = newApiName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.API_DESCRIPTION__API_NAME, oldApiName, apiName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelName() {
		return metamodelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelName(String newMetamodelName) {
		String oldMetamodelName = metamodelName;
		metamodelName = newMetamodelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.API_DESCRIPTION__METAMODEL_NAME, oldMetamodelName, metamodelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapperClassName() {
		return mapperClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapperClassName(String newMapperClassName) {
		String oldMapperClassName = mapperClassName;
		mapperClassName = newMapperClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.API_DESCRIPTION__MAPPER_CLASS_NAME, oldMapperClassName, mapperClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassMapping> getClassMappings() {
		if (classMappings == null) {
			classMappings = new EObjectContainmentEList<ClassMapping>(ClassMapping.class, this, ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS);
		}
		return classMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclaredElement> getDeclaredElements() {
		if (declaredElements == null) {
			declaredElements = new EObjectContainmentEList<DeclaredElement>(DeclaredElement.class, this, ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS);
		}
		return declaredElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS:
				return ((InternalEList<?>)getClassMappings()).basicRemove(otherEnd, msgs);
			case ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS:
				return ((InternalEList<?>)getDeclaredElements()).basicRemove(otherEnd, msgs);
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
			case ApidescPackage.API_DESCRIPTION__API_NAME:
				return getApiName();
			case ApidescPackage.API_DESCRIPTION__METAMODEL_NAME:
				return getMetamodelName();
			case ApidescPackage.API_DESCRIPTION__MAPPER_CLASS_NAME:
				return getMapperClassName();
			case ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS:
				return getClassMappings();
			case ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS:
				return getDeclaredElements();
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
			case ApidescPackage.API_DESCRIPTION__API_NAME:
				setApiName((String)newValue);
				return;
			case ApidescPackage.API_DESCRIPTION__METAMODEL_NAME:
				setMetamodelName((String)newValue);
				return;
			case ApidescPackage.API_DESCRIPTION__MAPPER_CLASS_NAME:
				setMapperClassName((String)newValue);
				return;
			case ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS:
				getClassMappings().clear();
				getClassMappings().addAll((Collection<? extends ClassMapping>)newValue);
				return;
			case ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS:
				getDeclaredElements().clear();
				getDeclaredElements().addAll((Collection<? extends DeclaredElement>)newValue);
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
			case ApidescPackage.API_DESCRIPTION__API_NAME:
				setApiName(API_NAME_EDEFAULT);
				return;
			case ApidescPackage.API_DESCRIPTION__METAMODEL_NAME:
				setMetamodelName(METAMODEL_NAME_EDEFAULT);
				return;
			case ApidescPackage.API_DESCRIPTION__MAPPER_CLASS_NAME:
				setMapperClassName(MAPPER_CLASS_NAME_EDEFAULT);
				return;
			case ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS:
				getClassMappings().clear();
				return;
			case ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS:
				getDeclaredElements().clear();
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
			case ApidescPackage.API_DESCRIPTION__API_NAME:
				return API_NAME_EDEFAULT == null ? apiName != null : !API_NAME_EDEFAULT.equals(apiName);
			case ApidescPackage.API_DESCRIPTION__METAMODEL_NAME:
				return METAMODEL_NAME_EDEFAULT == null ? metamodelName != null : !METAMODEL_NAME_EDEFAULT.equals(metamodelName);
			case ApidescPackage.API_DESCRIPTION__MAPPER_CLASS_NAME:
				return MAPPER_CLASS_NAME_EDEFAULT == null ? mapperClassName != null : !MAPPER_CLASS_NAME_EDEFAULT.equals(mapperClassName);
			case ApidescPackage.API_DESCRIPTION__CLASS_MAPPINGS:
				return classMappings != null && !classMappings.isEmpty();
			case ApidescPackage.API_DESCRIPTION__DECLARED_ELEMENTS:
				return declaredElements != null && !declaredElements.isEmpty();
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
		result.append(" (apiName: ");
		result.append(apiName);
		result.append(", metamodelName: ");
		result.append(metamodelName);
		result.append(", mapperClassName: ");
		result.append(mapperClassName);
		result.append(')');
		return result.toString();
	}

} //ApiDescriptionImpl
