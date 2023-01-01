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
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.webui.ChildPath;
import work.andycarpenter.webgen.pims.webui.Path;
import work.andycarpenter.webgen.pims.webui.PathAssociation;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getCollectionSortBy <em>Collection Sort By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#isUseAutocomplete <em>Use Autocomplete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitAssociationImpl extends UnitFeatureImpl implements UnitAssociation {
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
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH_ASSOCIATION__NAME).getSettingDelegate();

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
	protected EStructuralFeature.Internal.SettingDelegate IS_SOURCE_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH_ASSOCIATION__SOURCE_ENTITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ENTITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.PATH_ASSOCIATION__TARGET_ENTITY).getSettingDelegate();

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
	 * The cached value of the '{@link #getCollectionSortBy() <em>Collection Sort By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionSortBy()
	 * @generated
	 * @ordered
	 */
	protected Attribute collectionSortBy;

	/**
	 * The default value of the '{@link #isUseAutocomplete() <em>Use Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAutocomplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_AUTOCOMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAutocomplete() <em>Use Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAutocomplete()
	 * @generated
	 * @ordered
	 */
	protected boolean useAutocomplete = USE_AUTOCOMPLETE_EDEFAULT;

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
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, WebuiPackage.CHILD_PATH__PARENT, ChildPath.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, WebuiPackage.CHILD_PATH__PARENT, ChildPath.class, msgs);
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
	public Attribute getCollectionSortBy() {
		if (collectionSortBy != null && collectionSortBy.eIsProxy()) {
			InternalEObject oldCollectionSortBy = (InternalEObject)collectionSortBy;
			collectionSortBy = (Attribute)eResolveProxy(oldCollectionSortBy);
			if (collectionSortBy != oldCollectionSortBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY, oldCollectionSortBy, collectionSortBy));
			}
		}
		return collectionSortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetCollectionSortBy() {
		return collectionSortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionSortBy(Attribute newCollectionSortBy) {
		Attribute oldCollectionSortBy = collectionSortBy;
		collectionSortBy = newCollectionSortBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY, oldCollectionSortBy, collectionSortBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAutocomplete() {
		return useAutocomplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAutocomplete(boolean newUseAutocomplete) {
		boolean oldUseAutocomplete = useAutocomplete;
		useAutocomplete = newUseAutocomplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE, oldUseAutocomplete, useAutocomplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case WebuiPackage.UNIT_ASSOCIATION__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				return getName();
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
			case WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY:
				if (resolve) return getCollectionSortBy();
				return basicGetCollectionSortBy();
			case WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE:
				return isUseAutocomplete();
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
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				setName((String)newValue);
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
			case WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY:
				setCollectionSortBy((Attribute)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE:
				setUseAutocomplete((Boolean)newValue);
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
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				unsetName();
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
			case WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY:
				setCollectionSortBy((Attribute)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE:
				setUseAutocomplete(USE_AUTOCOMPLETE_EDEFAULT);
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
			case WebuiPackage.UNIT_ASSOCIATION__CONTAINING_TYPE:
				return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebuiPackage.UNIT_ASSOCIATION__NAME:
				return isSetName();
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
			case WebuiPackage.UNIT_ASSOCIATION__COLLECTION_SORT_BY:
				return collectionSortBy != null;
			case WebuiPackage.UNIT_ASSOCIATION__USE_AUTOCOMPLETE:
				return useAutocomplete != USE_AUTOCOMPLETE_EDEFAULT;
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
		if (baseClass == Path.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_ASSOCIATION__CONTAINING_TYPE: return WebuiPackage.PATH__CONTAINING_TYPE;
				default: return -1;
			}
		}
		if (baseClass == PathAssociation.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION: return WebuiPackage.PATH_ASSOCIATION__ASSOCIATION;
				case WebuiPackage.UNIT_ASSOCIATION__NAME: return WebuiPackage.PATH_ASSOCIATION__NAME;
				case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY: return WebuiPackage.PATH_ASSOCIATION__VALUE_DISPLAY;
				case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE: return WebuiPackage.PATH_ASSOCIATION__CHILD_FEATURE;
				case WebuiPackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION: return WebuiPackage.PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION;
				case WebuiPackage.UNIT_ASSOCIATION__SOURCE_ENTITY: return WebuiPackage.PATH_ASSOCIATION__SOURCE_ENTITY;
				case WebuiPackage.UNIT_ASSOCIATION__TARGET_ENTITY: return WebuiPackage.PATH_ASSOCIATION__TARGET_ENTITY;
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
		if (baseClass == Path.class) {
			switch (baseFeatureID) {
				case WebuiPackage.PATH__CONTAINING_TYPE: return WebuiPackage.UNIT_ASSOCIATION__CONTAINING_TYPE;
				default: return -1;
			}
		}
		if (baseClass == PathAssociation.class) {
			switch (baseFeatureID) {
				case WebuiPackage.PATH_ASSOCIATION__ASSOCIATION: return WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION;
				case WebuiPackage.PATH_ASSOCIATION__NAME: return WebuiPackage.UNIT_ASSOCIATION__NAME;
				case WebuiPackage.PATH_ASSOCIATION__VALUE_DISPLAY: return WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY;
				case WebuiPackage.PATH_ASSOCIATION__CHILD_FEATURE: return WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE;
				case WebuiPackage.PATH_ASSOCIATION__IS_SOURCE_ASSOCIATION: return WebuiPackage.UNIT_ASSOCIATION__IS_SOURCE_ASSOCIATION;
				case WebuiPackage.PATH_ASSOCIATION__SOURCE_ENTITY: return WebuiPackage.UNIT_ASSOCIATION__SOURCE_ENTITY;
				case WebuiPackage.PATH_ASSOCIATION__TARGET_ENTITY: return WebuiPackage.UNIT_ASSOCIATION__TARGET_ENTITY;
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
		result.append(" (useAutocomplete: ");
		result.append(useAutocomplete);
		result.append(')');
		return result.toString();
	}

} //UnitAssociationImpl
