/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.Path;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.PathImpl#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PathImpl extends MinimalEObjectImpl.Container implements Path {
	/**
	 * The cached setting delegate for the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH__CONTAINING_TYPE).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.PATH;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.PATH__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebuiPackage.PATH__CONTAINING_TYPE:
				return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //PathImpl
