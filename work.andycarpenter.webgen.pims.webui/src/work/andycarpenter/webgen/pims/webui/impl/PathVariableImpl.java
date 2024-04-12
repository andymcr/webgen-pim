/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.PathVariable;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl#getRootContainer <em>Root Container</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathVariableImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PathVariableImpl extends MinimalEObjectImpl.Container implements PathVariable {
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
	protected PathVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.PATH_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT, oldUseContainerAsContext, useContainerAsContext));
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
			case WebuiPackage.PATH_VARIABLE__ROOT_CONTAINER:
				if (resolve) return getRootContainer();
				return basicGetRootContainer();
			case WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				return isUseContainerAsContext();
			case WebuiPackage.PATH_VARIABLE__CONTEXT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT:
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
			case WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT:
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
			case WebuiPackage.PATH_VARIABLE__ROOT_CONTAINER:
				return isSetRootContainer();
			case WebuiPackage.PATH_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				return useContainerAsContext != USE_CONTAINER_AS_CONTEXT_EDEFAULT;
			case WebuiPackage.PATH_VARIABLE__CONTEXT:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useContainerAsContext: ");
		result.append(useContainerAsContext);
		result.append(')');
		return result.toString();
	}

} //PathVariableImpl
