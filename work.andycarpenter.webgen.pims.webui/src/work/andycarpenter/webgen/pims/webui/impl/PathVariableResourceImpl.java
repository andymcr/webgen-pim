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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.Variable;

import work.andycarpenter.webgen.pims.persistence.Entity;

import work.andycarpenter.webgen.pims.webui.PathVariable;
import work.andycarpenter.webgen.pims.webui.PathVariableResource;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Variable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl#getSuffixes <em>Suffixes</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl#getRootContainer <em>Root Container</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableResourceImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathVariableResourceImpl extends PathResourceImpl implements PathVariableResource {
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
	 * The cached setting delegate for the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTEXT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH_VARIABLE__CONTEXT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathVariableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.PATH_VARIABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSuffixes() {
		if (suffixes == null) {
			suffixes = new EDataTypeUniqueEList<String>(String.class, this, WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT, oldUseContainerAsContext, useContainerAsContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContext() {
		return (Entity)CONTEXT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContext() {
		return (Entity)CONTEXT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES:
				return getSuffixes();
			case WebuiPackage.PATH_VARIABLE_RESOURCE__ROOT_CONTAINER:
				if (resolve) return getRootContainer();
				return basicGetRootContainer();
			case WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT:
				return isUseContainerAsContext();
			case WebuiPackage.PATH_VARIABLE_RESOURCE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES:
				getSuffixes().clear();
				getSuffixes().addAll((Collection<? extends String>)newValue);
				return;
			case WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT:
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
			case WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES:
				getSuffixes().clear();
				return;
			case WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT:
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
			case WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES:
				return suffixes != null && !suffixes.isEmpty();
			case WebuiPackage.PATH_VARIABLE_RESOURCE__ROOT_CONTAINER:
				return isSetRootContainer();
			case WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT:
				return useContainerAsContext != USE_CONTAINER_AS_CONTEXT_EDEFAULT;
			case WebuiPackage.PATH_VARIABLE_RESOURCE__CONTEXT:
				return CONTEXT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES: return ExpressionPackage.EXPRESSION__SUFFIXES;
				case WebuiPackage.PATH_VARIABLE_RESOURCE__ROOT_CONTAINER: return ExpressionPackage.EXPRESSION__ROOT_CONTAINER;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PathVariable.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT: return WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT;
				case WebuiPackage.PATH_VARIABLE_RESOURCE__CONTEXT: return WebuiPackage.PATH_VARIABLE__CONTEXT;
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
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case ExpressionPackage.EXPRESSION__SUFFIXES: return WebuiPackage.PATH_VARIABLE_RESOURCE__SUFFIXES;
				case ExpressionPackage.EXPRESSION__ROOT_CONTAINER: return WebuiPackage.PATH_VARIABLE_RESOURCE__ROOT_CONTAINER;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PathVariable.class) {
			switch (baseFeatureID) {
				case WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT: return WebuiPackage.PATH_VARIABLE_RESOURCE__USE_CONTAINER_AS_CONTEXT;
				case WebuiPackage.PATH_VARIABLE__CONTEXT: return WebuiPackage.PATH_VARIABLE_RESOURCE__CONTEXT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (suffixes: ");
		result.append(suffixes);
		result.append(", useContainerAsContext: ");
		result.append(useContainerAsContext);
		result.append(')');
		return result.toString();
	}

} //PathVariableResourceImpl
