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
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.service.Filter;
import work.andycarpenter.webgen.pims.service.Selection;
import work.andycarpenter.webgen.pims.webui.AssociationReference;
import work.andycarpenter.webgen.pims.webui.ChildPath;
import work.andycarpenter.webgen.pims.webui.UnitAssociation;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getFilteredOptions <em>Filtered Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitAssociationImpl extends UnitFeatureImpl implements UnitAssociation {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.ASSOCIATION_REFERENCE__NAME).getSettingDelegate();

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
	protected ChildPath childFeature;

	/**
	 * The cached setting delegate for the '{@link #isIsSourceAssociation() <em>Is Source Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSourceAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.UNIT_ASSOCIATION__SOURCE_ENTITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.UNIT_ASSOCIATION__TARGET_ENTITY).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Selection options;

	/**
	 * The cached value of the '{@link #getFilteredOptions() <em>Filtered Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredOptions()
	 * @generated
	 * @ordered
	 */
	protected Filter filteredOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.UNIT_ASSOCIATION;
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
	public boolean isSetName() {
		return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION, oldAssociation, association));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY, oldValueDisplay, valueDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildPath getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(ChildPath newChildFeature, NotificationChain msgs) {
		ChildPath oldChildFeature = childFeature;
		childFeature = newChildFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE, oldChildFeature, newChildFeature);
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
	public void setChildFeature(ChildPath newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, WebuiPackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, WebuiPackage.CHILD_PATH__PART_OF, ChildPath.class, msgs);
			msgs = basicSetChildFeature(newChildFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE, newChildFeature, newChildFeature));
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
	public Entity getSourceEntity() {
		return (Entity)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		return (Entity)SOURCE_ENTITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
	public Selection getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (Selection)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_ASSOCIATION__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(Selection newOptions) {
		Selection oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter getFilteredOptions() {
		if (filteredOptions != null && filteredOptions.eIsProxy()) {
			InternalEObject oldFilteredOptions = (InternalEObject)filteredOptions;
			filteredOptions = (Filter)eResolveProxy(oldFilteredOptions);
			if (filteredOptions != oldFilteredOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS, oldFilteredOptions, filteredOptions));
			}
		}
		return filteredOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter basicGetFilteredOptions() {
		return filteredOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilteredOptions(Filter newFilteredOptions) {
		Filter oldFilteredOptions = filteredOptions;
		filteredOptions = newFilteredOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS, oldFilteredOptions, filteredOptions));
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				if (childFeature != null)
					msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
				return basicSetChildFeature((ChildPath)otherEnd, msgs);
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				return getName();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebuiPackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return isIsSourceAssociation();
			case WebuiPackage.UNIT_ASSOCIATION__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case WebuiPackage.UNIT_ASSOCIATION__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case WebuiPackage.UNIT_ASSOCIATION__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
			case WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS:
				if (resolve) return getFilteredOptions();
				return basicGetFilteredOptions();
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
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildPath)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__OPTIONS:
				setOptions((Selection)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS:
				setFilteredOptions((Filter)newValue);
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
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildPath)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__OPTIONS:
				setOptions((Selection)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS:
				setFilteredOptions((Filter)null);
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
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				return isSetName();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				return valueDisplay != null;
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebuiPackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION:
				return IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.UNIT_ASSOCIATION__SOURCE_ENTITY:
				return SOURCE_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.UNIT_ASSOCIATION__TARGET_ENTITY:
				return TARGET_ENTITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.UNIT_ASSOCIATION__OPTIONS:
				return options != null;
			case WebuiPackage.UNIT_ASSOCIATION__FILTERED_OPTIONS:
				return filteredOptions != null;
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
				case WebuiPackage.UNIT_ASSOCIATION__NAME: return WebuiPackage.ASSOCIATION_REFERENCE__NAME;
				case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION: return WebuiPackage.ASSOCIATION_REFERENCE__ASSOCIATION;
				case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY: return WebuiPackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY;
				case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE: return WebuiPackage.ASSOCIATION_REFERENCE__CHILD_FEATURE;
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
				case WebuiPackage.ASSOCIATION_REFERENCE__NAME: return WebuiPackage.UNIT_ASSOCIATION__NAME;
				case WebuiPackage.ASSOCIATION_REFERENCE__ASSOCIATION: return WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION;
				case WebuiPackage.ASSOCIATION_REFERENCE__VALUE_DISPLAY: return WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY;
				case WebuiPackage.ASSOCIATION_REFERENCE__CHILD_FEATURE: return WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UnitAssociationImpl
