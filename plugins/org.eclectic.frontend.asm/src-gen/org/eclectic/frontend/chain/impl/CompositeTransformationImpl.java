/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain.impl;

import java.util.Collection;

import org.eclectic.frontend.chain.ChainPackage;
import org.eclectic.frontend.chain.CompositeTransformation;
import org.eclectic.frontend.chain.TransformationExecution;

import org.eclectic.frontend.core.AnnotableElement;
import org.eclectic.frontend.core.Annotation;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.ImportedModel;
import org.eclectic.frontend.core.InlineModel;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.ModuleDefinition;
import org.eclectic.frontend.core.NamedElement;
import org.eclectic.frontend.core.RequireDeclaration;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.TransformationDefinitionParameter;
import org.eclectic.frontend.core.UseDeclaration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getAnnotatedWith <em>Annotated With</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getInModels <em>In Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getOutModels <em>Out Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getImportedModels <em>Imported Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getInlineModels <em>Inline Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTransformationImpl extends AvailableTransformationImpl implements CompositeTransformation {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;
	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;
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
	 * The cached value of the '{@link #getAnnotatedWith() <em>Annotated With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotatedWith;
	/**
	 * The cached value of the '{@link #getInModels() <em>In Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationDefinitionParameter> inModels;
	/**
	 * The cached value of the '{@link #getOutModels() <em>Out Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationDefinitionParameter> outModels;
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
	 * The cached value of the '{@link #getInlineModels() <em>Inline Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineModel> inlineModels;
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<UseDeclaration> uses;
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
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationExecution> executions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainPackage.Literals.COMPOSITE_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainPackage.COMPOSITE_TRANSFORMATION__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainPackage.COMPOSITE_TRANSFORMATION__FILE, oldFile, file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChainPackage.COMPOSITE_TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotatedWith() {
		if (annotatedWith == null) {
			annotatedWith = new EObjectWithInverseResolvingEList<Annotation>(Annotation.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH, CorePackage.ANNOTATION__ANNOTATED_ELEMENT);
		}
		return annotatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationDefinitionParameter> getInModels() {
		if (inModels == null) {
			inModels = new EObjectContainmentEList<TransformationDefinitionParameter>(TransformationDefinitionParameter.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS);
		}
		return inModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationDefinitionParameter> getOutModels() {
		if (outModels == null) {
			outModels = new EObjectContainmentEList<TransformationDefinitionParameter>(TransformationDefinitionParameter.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS);
		}
		return outModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedModel> getImportedModels() {
		if (importedModels == null) {
			importedModels = new EObjectContainmentEList<ImportedModel>(ImportedModel.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS);
		}
		return importedModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineModel> getInlineModels() {
		if (inlineModels == null) {
			inlineModels = new EObjectContainmentEList<InlineModel>(InlineModel.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS);
		}
		return inlineModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseDeclaration> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<UseDeclaration>(UseDeclaration.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequireDeclaration> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<RequireDeclaration>(RequireDeclaration.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationExecution> getExecutions() {
		if (executions == null) {
			executions = new EObjectContainmentEList<TransformationExecution>(TransformationExecution.class, this, ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedWith()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				return ((InternalEList<?>)getAnnotatedWith()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS:
				return ((InternalEList<?>)getInModels()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS:
				return ((InternalEList<?>)getOutModels()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS:
				return ((InternalEList<?>)getImportedModels()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS:
				return ((InternalEList<?>)getInlineModels()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS:
				return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
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
			case ChainPackage.COMPOSITE_TRANSFORMATION__ROW:
				return getRow();
			case ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN:
				return getColumn();
			case ChainPackage.COMPOSITE_TRANSFORMATION__FILE:
				return getFile();
			case ChainPackage.COMPOSITE_TRANSFORMATION__NAME:
				return getName();
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				return getAnnotatedWith();
			case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS:
				return getInModels();
			case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS:
				return getOutModels();
			case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS:
				return getImportedModels();
			case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS:
				return getInlineModels();
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS:
				return getAnnotations();
			case ChainPackage.COMPOSITE_TRANSFORMATION__USES:
				return getUses();
			case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES:
				return getRequires();
			case ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS:
				return getExecutions();
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
			case ChainPackage.COMPOSITE_TRANSFORMATION__ROW:
				setRow((Integer)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN:
				setColumn((Integer)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__FILE:
				setFile((String)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				getAnnotatedWith().clear();
				getAnnotatedWith().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS:
				getInModels().clear();
				getInModels().addAll((Collection<? extends TransformationDefinitionParameter>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS:
				getOutModels().clear();
				getOutModels().addAll((Collection<? extends TransformationDefinitionParameter>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS:
				getImportedModels().clear();
				getImportedModels().addAll((Collection<? extends ImportedModel>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS:
				getInlineModels().clear();
				getInlineModels().addAll((Collection<? extends InlineModel>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends UseDeclaration>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequireDeclaration>)newValue);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
				getExecutions().addAll((Collection<? extends TransformationExecution>)newValue);
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
			case ChainPackage.COMPOSITE_TRANSFORMATION__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				getAnnotatedWith().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS:
				getInModels().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS:
				getOutModels().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS:
				getImportedModels().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS:
				getInlineModels().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__USES:
				getUses().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES:
				getRequires().clear();
				return;
			case ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
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
			case ChainPackage.COMPOSITE_TRANSFORMATION__ROW:
				return row != ROW_EDEFAULT;
			case ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN:
				return column != COLUMN_EDEFAULT;
			case ChainPackage.COMPOSITE_TRANSFORMATION__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case ChainPackage.COMPOSITE_TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH:
				return annotatedWith != null && !annotatedWith.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS:
				return inModels != null && !inModels.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS:
				return outModels != null && !outModels.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS:
				return importedModels != null && !importedModels.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS:
				return inlineModels != null && !inlineModels.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__USES:
				return uses != null && !uses.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES:
				return requires != null && !requires.isEmpty();
			case ChainPackage.COMPOSITE_TRANSFORMATION__EXECUTIONS:
				return executions != null && !executions.isEmpty();
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
		if (baseClass == LocatedElement.class) {
			switch (derivedFeatureID) {
				case ChainPackage.COMPOSITE_TRANSFORMATION__ROW: return CorePackage.LOCATED_ELEMENT__ROW;
				case ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN: return CorePackage.LOCATED_ELEMENT__COLUMN;
				case ChainPackage.COMPOSITE_TRANSFORMATION__FILE: return CorePackage.LOCATED_ELEMENT__FILE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ChainPackage.COMPOSITE_TRANSFORMATION__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == AnnotableElement.class) {
			switch (derivedFeatureID) {
				case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH: return CorePackage.ANNOTABLE_ELEMENT__ANNOTATED_WITH;
				default: return -1;
			}
		}
		if (baseClass == ModuleDefinition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TransformationDefinition.class) {
			switch (derivedFeatureID) {
				case ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS: return CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;
				case ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS: return CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;
				case ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS: return CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;
				case ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS: return CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;
				case ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS: return CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;
				case ChainPackage.COMPOSITE_TRANSFORMATION__USES: return CorePackage.TRANSFORMATION_DEFINITION__USES;
				case ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES: return CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;
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
		if (baseClass == LocatedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCATED_ELEMENT__ROW: return ChainPackage.COMPOSITE_TRANSFORMATION__ROW;
				case CorePackage.LOCATED_ELEMENT__COLUMN: return ChainPackage.COMPOSITE_TRANSFORMATION__COLUMN;
				case CorePackage.LOCATED_ELEMENT__FILE: return ChainPackage.COMPOSITE_TRANSFORMATION__FILE;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return ChainPackage.COMPOSITE_TRANSFORMATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == AnnotableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.ANNOTABLE_ELEMENT__ANNOTATED_WITH: return ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATED_WITH;
				default: return -1;
			}
		}
		if (baseClass == ModuleDefinition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TransformationDefinition.class) {
			switch (baseFeatureID) {
				case CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS: return ChainPackage.COMPOSITE_TRANSFORMATION__IN_MODELS;
				case CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS: return ChainPackage.COMPOSITE_TRANSFORMATION__OUT_MODELS;
				case CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS: return ChainPackage.COMPOSITE_TRANSFORMATION__IMPORTED_MODELS;
				case CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS: return ChainPackage.COMPOSITE_TRANSFORMATION__INLINE_MODELS;
				case CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS: return ChainPackage.COMPOSITE_TRANSFORMATION__ANNOTATIONS;
				case CorePackage.TRANSFORMATION_DEFINITION__USES: return ChainPackage.COMPOSITE_TRANSFORMATION__USES;
				case CorePackage.TRANSFORMATION_DEFINITION__REQUIRES: return ChainPackage.COMPOSITE_TRANSFORMATION__REQUIRES;
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
		result.append(" (row: ");
		result.append(row);
		result.append(", column: ");
		result.append(column);
		result.append(", file: ");
		result.append(file);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompositeTransformationImpl
