/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.persistence.ModelLabel;

import work.andycarpenter.webgen.pims.webui.FeaturePathLabel;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Path Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FeaturePathLabelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePathLabelImpl extends FeaturePathImpl implements FeaturePathLabel {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel label;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.FEATURE_PATH_LABEL__NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePathLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.FEATURE_PATH_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelLabel getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (ModelLabel)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.FEATURE_PATH_LABEL__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(ModelLabel newLabel) {
		ModelLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FEATURE_PATH_LABEL__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetName() {
		NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.FEATURE_PATH_LABEL__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case WebuiPackage.FEATURE_PATH_LABEL__NAME:
				return getName();
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
			case WebuiPackage.FEATURE_PATH_LABEL__LABEL:
				setLabel((ModelLabel)newValue);
				return;
			case WebuiPackage.FEATURE_PATH_LABEL__NAME:
				setName((String)newValue);
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
			case WebuiPackage.FEATURE_PATH_LABEL__LABEL:
				setLabel((ModelLabel)null);
				return;
			case WebuiPackage.FEATURE_PATH_LABEL__NAME:
				unsetName();
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
			case WebuiPackage.FEATURE_PATH_LABEL__LABEL:
				return label != null;
			case WebuiPackage.FEATURE_PATH_LABEL__NAME:
				return isSetName();
		}
		return super.eIsSet(featureID);
	}

} //FeaturePathLabelImpl
