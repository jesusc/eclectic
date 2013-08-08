/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.core.UseDeclaration;
import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ConverterImpl#getIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ConverterImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.ConverterImpl#getConverterName <em>Converter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConverterImpl extends EObjectImpl implements Converter {
	/**
	 * The default value of the '{@link #getIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EXTERNAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExternal()
	 * @generated
	 * @ordered
	 */
	protected Boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected UseDeclaration module;

	/**
	 * The default value of the '{@link #getConverterName() <em>Converter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConverterName() <em>Converter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverterName()
	 * @generated
	 * @ordered
	 */
	protected String converterName = CONVERTER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConverterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.CONVERTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(Boolean newIsExternal) {
		Boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.CONVERTER__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseDeclaration getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = (UseDeclaration)eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingsPackage.CONVERTER__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseDeclaration basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(UseDeclaration newModule) {
		UseDeclaration oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.CONVERTER__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConverterName() {
		return converterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverterName(String newConverterName) {
		String oldConverterName = converterName;
		converterName = newConverterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.CONVERTER__CONVERTER_NAME, oldConverterName, converterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingsPackage.CONVERTER__IS_EXTERNAL:
				return getIsExternal();
			case MappingsPackage.CONVERTER__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case MappingsPackage.CONVERTER__CONVERTER_NAME:
				return getConverterName();
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
			case MappingsPackage.CONVERTER__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case MappingsPackage.CONVERTER__MODULE:
				setModule((UseDeclaration)newValue);
				return;
			case MappingsPackage.CONVERTER__CONVERTER_NAME:
				setConverterName((String)newValue);
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
			case MappingsPackage.CONVERTER__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case MappingsPackage.CONVERTER__MODULE:
				setModule((UseDeclaration)null);
				return;
			case MappingsPackage.CONVERTER__CONVERTER_NAME:
				setConverterName(CONVERTER_NAME_EDEFAULT);
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
			case MappingsPackage.CONVERTER__IS_EXTERNAL:
				return IS_EXTERNAL_EDEFAULT == null ? isExternal != null : !IS_EXTERNAL_EDEFAULT.equals(isExternal);
			case MappingsPackage.CONVERTER__MODULE:
				return module != null;
			case MappingsPackage.CONVERTER__CONVERTER_NAME:
				return CONVERTER_NAME_EDEFAULT == null ? converterName != null : !CONVERTER_NAME_EDEFAULT.equals(converterName);
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
		result.append(" (isExternal: ");
		result.append(isExternal);
		result.append(", converterName: ");
		result.append(converterName);
		result.append(')');
		return result.toString();
	}

} //ConverterImpl
