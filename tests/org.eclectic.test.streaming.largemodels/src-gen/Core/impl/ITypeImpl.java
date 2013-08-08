/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Core.impl;

import Core.CorePackage;
import Core.IField;
import Core.IInitializer;
import Core.IMethod;
import Core.IType;
import Core.ITypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Core.impl.ITypeImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getFullyQualifiedParametrizedName <em>Fully Qualified Parametrized Name</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link Core.impl.ITypeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ITypeImpl extends IMemberImpl implements IType {
	/**
	 * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedName = FULLY_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullyQualifiedParametrizedName() <em>Fully Qualified Parametrized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedParametrizedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedParametrizedName() <em>Fully Qualified Parametrized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedParametrizedName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedParametrizedName = FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<IInitializer> initializers;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<IField> fields;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<IMethod> methods;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<IType> types;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ITypeParameter> typeParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedName() {
		return fullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedName(String newFullyQualifiedName) {
		String oldFullyQualifiedName = fullyQualifiedName;
		fullyQualifiedName = newFullyQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ITYPE__FULLY_QUALIFIED_NAME, oldFullyQualifiedName, fullyQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedParametrizedName() {
		return fullyQualifiedParametrizedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedParametrizedName(String newFullyQualifiedParametrizedName) {
		String oldFullyQualifiedParametrizedName = fullyQualifiedParametrizedName;
		fullyQualifiedParametrizedName = newFullyQualifiedParametrizedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME, oldFullyQualifiedParametrizedName, fullyQualifiedParametrizedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IInitializer> getInitializers() {
		if (initializers == null) {
			initializers = new EObjectContainmentEList<IInitializer>(IInitializer.class, this, CorePackage.ITYPE__INITIALIZERS);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<IField>(IField.class, this, CorePackage.ITYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<IMethod>(IMethod.class, this, CorePackage.ITYPE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<IType>(IType.class, this, CorePackage.ITYPE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ITypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectResolvingEList<ITypeParameter>(ITypeParameter.class, this, CorePackage.ITYPE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ITYPE__INITIALIZERS:
				return ((InternalEList<?>)getInitializers()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case CorePackage.ITYPE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				return getFullyQualifiedParametrizedName();
			case CorePackage.ITYPE__INITIALIZERS:
				return getInitializers();
			case CorePackage.ITYPE__FIELDS:
				return getFields();
			case CorePackage.ITYPE__METHODS:
				return getMethods();
			case CorePackage.ITYPE__TYPES:
				return getTypes();
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				return getTypeParameters();
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName((String)newValue);
				return;
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				setFullyQualifiedParametrizedName((String)newValue);
				return;
			case CorePackage.ITYPE__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends IInitializer>)newValue);
				return;
			case CorePackage.ITYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends IField>)newValue);
				return;
			case CorePackage.ITYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends IMethod>)newValue);
				return;
			case CorePackage.ITYPE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends IType>)newValue);
				return;
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends ITypeParameter>)newValue);
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				setFullyQualifiedParametrizedName(FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT);
				return;
			case CorePackage.ITYPE__INITIALIZERS:
				getInitializers().clear();
				return;
			case CorePackage.ITYPE__FIELDS:
				getFields().clear();
				return;
			case CorePackage.ITYPE__METHODS:
				getMethods().clear();
				return;
			case CorePackage.ITYPE__TYPES:
				getTypes().clear();
				return;
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
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
			case CorePackage.ITYPE__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? fullyQualifiedName != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(fullyQualifiedName);
			case CorePackage.ITYPE__FULLY_QUALIFIED_PARAMETRIZED_NAME:
				return FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT == null ? fullyQualifiedParametrizedName != null : !FULLY_QUALIFIED_PARAMETRIZED_NAME_EDEFAULT.equals(fullyQualifiedParametrizedName);
			case CorePackage.ITYPE__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
			case CorePackage.ITYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case CorePackage.ITYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case CorePackage.ITYPE__TYPES:
				return types != null && !types.isEmpty();
			case CorePackage.ITYPE__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
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
		result.append(" (fullyQualifiedName: ");
		result.append(fullyQualifiedName);
		result.append(", fullyQualifiedParametrizedName: ");
		result.append(fullyQualifiedParametrizedName);
		result.append(')');
		return result.toString();
	}

} //ITypeImpl
