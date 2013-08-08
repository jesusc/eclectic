/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core.impl;

import java.util.Collection;

import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.ImportedModel;
import org.eclectic.idc.core.ModelDefinition;

import org.eclectic.idc.core.NamedElement;
import org.eclectic.idc.core.RequireDeclaration;
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
 * An implementation of the model object '<em><b>Code Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#isMain <em>Main</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getAdditionalModels <em>Additional Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getImportedModels <em>Imported Models</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.CodeUnitImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CodeUnitImpl extends LocatedElementImpl implements CodeUnit {
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
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMain()
	 * @generated
	 * @ordered
	 */
	protected boolean main = MAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDefinition> models;

	/**
	 * The cached value of the '{@link #getAdditionalModels() <em>Additional Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDefinition> additionalModels;

	/**
	 * The cached value of the '{@link #getImportedModels() <em>Imported Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedModel> importedModels;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireDeclaration> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CODE_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CODE_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CODE_UNIT__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(boolean newMain) {
		boolean oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CODE_UNIT__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDefinition> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<ModelDefinition>(ModelDefinition.class, this, CorePackage.CODE_UNIT__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDefinition> getAdditionalModels() {
		if (additionalModels == null) {
			additionalModels = new EObjectContainmentEList<ModelDefinition>(ModelDefinition.class, this, CorePackage.CODE_UNIT__ADDITIONAL_MODELS);
		}
		return additionalModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedModel> getImportedModels() {
		if (importedModels == null) {
			importedModels = new EObjectContainmentEList<ImportedModel>(ImportedModel.class, this, CorePackage.CODE_UNIT__IMPORTED_MODELS);
		}
		return importedModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequireDeclaration> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<RequireDeclaration>(RequireDeclaration.class, this, CorePackage.CODE_UNIT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CODE_UNIT__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case CorePackage.CODE_UNIT__ADDITIONAL_MODELS:
				return ((InternalEList<?>)getAdditionalModels()).basicRemove(otherEnd, msgs);
			case CorePackage.CODE_UNIT__IMPORTED_MODELS:
				return ((InternalEList<?>)getImportedModels()).basicRemove(otherEnd, msgs);
			case CorePackage.CODE_UNIT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CODE_UNIT__NAME:
				return getName();
			case CorePackage.CODE_UNIT__QUALIFIER:
				return getQualifier();
			case CorePackage.CODE_UNIT__MAIN:
				return isMain();
			case CorePackage.CODE_UNIT__MODELS:
				return getModels();
			case CorePackage.CODE_UNIT__ADDITIONAL_MODELS:
				return getAdditionalModels();
			case CorePackage.CODE_UNIT__IMPORTED_MODELS:
				return getImportedModels();
			case CorePackage.CODE_UNIT__REQUIRES:
				return getRequires();
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
			case CorePackage.CODE_UNIT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.CODE_UNIT__QUALIFIER:
				setQualifier((String)newValue);
				return;
			case CorePackage.CODE_UNIT__MAIN:
				setMain((Boolean)newValue);
				return;
			case CorePackage.CODE_UNIT__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends ModelDefinition>)newValue);
				return;
			case CorePackage.CODE_UNIT__ADDITIONAL_MODELS:
				getAdditionalModels().clear();
				getAdditionalModels().addAll((Collection<? extends ModelDefinition>)newValue);
				return;
			case CorePackage.CODE_UNIT__IMPORTED_MODELS:
				getImportedModels().clear();
				getImportedModels().addAll((Collection<? extends ImportedModel>)newValue);
				return;
			case CorePackage.CODE_UNIT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequireDeclaration>)newValue);
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
			case CorePackage.CODE_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.CODE_UNIT__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case CorePackage.CODE_UNIT__MAIN:
				setMain(MAIN_EDEFAULT);
				return;
			case CorePackage.CODE_UNIT__MODELS:
				getModels().clear();
				return;
			case CorePackage.CODE_UNIT__ADDITIONAL_MODELS:
				getAdditionalModels().clear();
				return;
			case CorePackage.CODE_UNIT__IMPORTED_MODELS:
				getImportedModels().clear();
				return;
			case CorePackage.CODE_UNIT__REQUIRES:
				getRequires().clear();
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
			case CorePackage.CODE_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.CODE_UNIT__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case CorePackage.CODE_UNIT__MAIN:
				return main != MAIN_EDEFAULT;
			case CorePackage.CODE_UNIT__MODELS:
				return models != null && !models.isEmpty();
			case CorePackage.CODE_UNIT__ADDITIONAL_MODELS:
				return additionalModels != null && !additionalModels.isEmpty();
			case CorePackage.CODE_UNIT__IMPORTED_MODELS:
				return importedModels != null && !importedModels.isEmpty();
			case CorePackage.CODE_UNIT__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.CODE_UNIT__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return CorePackage.CODE_UNIT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(", main: ");
		result.append(main);
		result.append(')');
		return result.toString();
	}

} //CodeUnitImpl
