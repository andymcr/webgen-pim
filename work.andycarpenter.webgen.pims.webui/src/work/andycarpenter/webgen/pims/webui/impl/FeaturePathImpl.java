/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl#getSuffixes <em>Suffixes</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl#getRootContainer <em>Root Container</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathImpl#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeaturePathImpl extends MinimalEObjectImpl.Container implements FeaturePath {
	/**
	 * The cached value of the '{@link #getSuffixes() <em>Suffixes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> suffixes;

	/**
	 * The cached setting delegate for the '{@link #getRootContainer() <em>Root Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootContainer()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROOT_CONTAINER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ExpressionPackage.Literals.EXPRESSION__ROOT_CONTAINER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.FEATURE_PATH__CONTAINING_TYPE).getSettingDelegate();

	/**
	 * The default value of the '{@link #isUseContainerAsContext() <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseContainerAsContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CONTAINER_AS_CONTEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseContainerAsContext() <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseContainerAsContext()
	 * @generated
	 * @ordered
	 */
	protected boolean useContainerAsContext = USE_CONTAINER_AS_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.FEATURE_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSuffixes() {
		if (suffixes == null) {
			suffixes = new EDataTypeUniqueEList<String>(String.class, this, WebuiPackage.FEATURE_PATH__SUFFIXES);
		}
		return suffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRootContainer() {
		return (EObject)ROOT_CONTAINER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRootContainer() {
		return (EObject)ROOT_CONTAINER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRootContainer() {
		return ROOT_CONTAINER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseContainerAsContext() {
		return useContainerAsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseContainerAsContext(boolean newUseContainerAsContext) {
		boolean oldUseContainerAsContext = useContainerAsContext;
		useContainerAsContext = newUseContainerAsContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FEATURE_PATH__USE_CONTAINER_AS_CONTEXT, oldUseContainerAsContext, useContainerAsContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.FEATURE_PATH__SUFFIXES:
				return getSuffixes();
			case WebuiPackage.FEATURE_PATH__ROOT_CONTAINER:
				if (resolve) return getRootContainer();
				return basicGetRootContainer();
			case WebuiPackage.FEATURE_PATH__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
			case WebuiPackage.FEATURE_PATH__USE_CONTAINER_AS_CONTEXT:
				return isUseContainerAsContext();
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
			case WebuiPackage.FEATURE_PATH__SUFFIXES:
				getSuffixes().clear();
				getSuffixes().addAll((Collection<? extends String>)newValue);
				return;
			case WebuiPackage.FEATURE_PATH__USE_CONTAINER_AS_CONTEXT:
				setUseContainerAsContext((Boolean)newValue);
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
			case WebuiPackage.FEATURE_PATH__SUFFIXES:
				getSuffixes().clear();
				return;
			case WebuiPackage.FEATURE_PATH__USE_CONTAINER_AS_CONTEXT:
				setUseContainerAsContext(USE_CONTAINER_AS_CONTEXT_EDEFAULT);
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
			case WebuiPackage.FEATURE_PATH__SUFFIXES:
				return suffixes != null && !suffixes.isEmpty();
			case WebuiPackage.FEATURE_PATH__ROOT_CONTAINER:
				return isSetRootContainer();
			case WebuiPackage.FEATURE_PATH__CONTAINING_TYPE:
				return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.FEATURE_PATH__USE_CONTAINER_AS_CONTEXT:
				return useContainerAsContext != USE_CONTAINER_AS_CONTEXT_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (suffixes: ");
		result.append(suffixes);
		result.append(", useContainerAsContext: ");
		result.append(useContainerAsContext);
		result.append(')');
		return result.toString();
	}

} //FeaturePathImpl
