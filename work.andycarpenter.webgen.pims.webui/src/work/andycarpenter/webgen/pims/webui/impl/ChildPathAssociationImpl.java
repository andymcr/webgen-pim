/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.AssociationReference;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.FeatureChildPath;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.impl.FeatureChildPathImpl;
import work.andycarpenter.webgen.pims.webui.ChildPathAssociation;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Path Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ChildPathAssociationImpl#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildPathAssociationImpl extends FeatureChildPathImpl implements ChildPathAssociation {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ASSOCIATION_REFERENCE__NAME).getSettingDelegate();

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
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureChildPath childFeature;

	/**
	 * The cached setting delegate for the '{@link #isIsSourceAssociation() <em>Is Source Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.CHILD_PATH_ASSOCIATION__TARGET_ENTITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.CHILD_PATH_ASSOCIATION__CONTAINING_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildPathAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CHILD_PATH_ASSOCIATION;
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
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureChildPath getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(FeatureChildPath newChildFeature, NotificationChain msgs) {
		FeatureChildPath oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildFeature(FeatureChildPath newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, PersistencePackage.FEATURE_CHILD_PATH__PART_OF, FeatureChildPath.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, PersistencePackage.FEATURE_CHILD_PATH__PART_OF, FeatureChildPath.class, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSourceAssociation() {
		return (Boolean)IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTargetEntity() {
		return (Entity)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return (Entity)TARGET_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				if (childFeature != null)
					msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE, null, msgs);
				return basicSetChildFeature((FeatureChildPath)otherEnd, msgs);
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				return basicSetChildFeature(null, msgs);
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				return getName();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CONTAINING_TYPE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)newValue);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((FeatureChildPath)newValue);
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)null);
				return;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((FeatureChildPath)null);
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
			case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY:
				return valueDisplay != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebuiPackage.CHILD_PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.CHILD_PATH_ASSOCIATION__TARGET_ENTITY:
				return TARGET_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.CHILD_PATH_ASSOCIATION__CONTAINING_TYPE:
				return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == AssociationReference.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.CHILD_PATH_ASSOCIATION__NAME: return PersistencePackage.ASSOCIATION_REFERENCE__NAME;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION: return PersistencePackage.ASSOCIATION_REFERENCE__ASSOCIATION;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY: return PersistencePackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY;
				case WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE: return PersistencePackage.ASSOCIATION_REFERENCE__CHILD_FEATURE;
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
		if (baseClass == AssociationReference.class) {
			switch (baseFeatureID) {
				case PersistencePackage.ASSOCIATION_REFERENCE__NAME: return WebuiPackage.CHILD_PATH_ASSOCIATION__NAME;
				case PersistencePackage.ASSOCIATION_REFERENCE__ASSOCIATION: return WebuiPackage.CHILD_PATH_ASSOCIATION__ASSOCIATION;
				case PersistencePackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY: return WebuiPackage.CHILD_PATH_ASSOCIATION__VALUE_DISPLAY;
				case PersistencePackage.ASSOCIATION_REFERENCE__CHILD_FEATURE: return WebuiPackage.CHILD_PATH_ASSOCIATION__CHILD_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ChildPathAssociationImpl
