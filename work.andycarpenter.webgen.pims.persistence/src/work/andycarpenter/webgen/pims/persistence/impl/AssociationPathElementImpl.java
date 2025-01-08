/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl#getAssociationSource <em>Association Source</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl#getAssociationTarget <em>Association Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationPathElementImpl extends PathRootImpl implements AssociationPathElement {
	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getValueDisplay() <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDisplay()
	 * @generated
	 * @ordered
	 */
	protected ModelLabel valueDisplay;

	/**
	 * The cached setting delegate for the '{@link #getAssociationSource() <em>Association Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationSource()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATION_SOURCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociationTarget() <em>Association Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationTarget()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATION_TARGET__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationPathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ASSOCIATION_PATH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(Association newAssociation) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelLabel getValueDisplay() {
		if (valueDisplay != null && valueDisplay.eIsProxy()) {
			InternalEObject oldValueDisplay = (InternalEObject)valueDisplay;
			valueDisplay = (ModelLabel)eResolveProxy(oldValueDisplay);
			if (valueDisplay != oldValueDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
			}
		}
		return valueDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabel basicGetValueDisplay() {
		return valueDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueDisplay(ModelLabel newValueDisplay) {
		ModelLabel oldValueDisplay = valueDisplay;
		valueDisplay = newValueDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getAssociationSource() {
		return (Entity)ASSOCIATION_SOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAssociationSource() {
		return (Entity)ASSOCIATION_SOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssociationSource() {
		return ASSOCIATION_SOURCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getAssociationTarget() {
		return (Entity)ASSOCIATION_TARGET__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAssociationTarget() {
		return (Entity)ASSOCIATION_TARGET__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAssociationTarget() {
		return ASSOCIATION_TARGET__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String name() {
		if (getAssociation() == null) {
			return "";
		} else {
			if (isSourceAssociation()) {
				return getAssociation().getName();
			} else {
				if (getAssociation().getTargetFeatureName() == "") {
					return "inv" + getAssociation().getName();
				} else {
					return getAssociation().getTargetFeatureName();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSourceAssociation() {
		if (getAssociation() == null || contextEntity() == null) {
			return true;
		} else {
			return contextEntity().getAssociations().contains(getAssociation());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Entity leafEntity() {
		if (getAssociation() == null) {
			return null;
		} else {
			if (getChildFeature() == null) {
				return getAssociationTarget();
			} else {
				if (getChildFeature() instanceof AssociationPathElement) {
					return ((AssociationPathElement) getChildFeature()).leafEntity();
				} else {
					return getAssociationTarget();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE:
				if (resolve) return getAssociationSource();
				return basicGetAssociationSource();
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET:
				if (resolve) return getAssociationTarget();
				return basicGetAssociationTarget();
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
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)newValue);
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
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)null);
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
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION:
				return association != null;
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY:
				return valueDisplay != null;
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE:
				return isSetAssociationSource();
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET:
				return isSetAssociationTarget();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION:
				return isSourceAssociation();
			case PersistencePackage.ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY:
				return leafEntity();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssociationPathElementImpl
