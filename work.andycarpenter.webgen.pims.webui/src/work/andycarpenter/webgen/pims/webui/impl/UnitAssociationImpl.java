/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.ChildFeature;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.Path;
import work.andycarpenter.webgen.pims.persistence.PathRoot;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Selection;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getAssociationSource <em>Association Source</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getAssociationTarget <em>Association Target</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#getCollectionSortBy <em>Collection Sort By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitAssociationImpl#isUseAutocomplete <em>Use Autocomplete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitAssociationImpl extends UnitFeatureImpl implements UnitAssociation {
	/**
	 * The cached value of the '{@link #getChildFeature() <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeature()
	 * @generated
	 * @ordered
	 */
	protected ChildFeature childFeature;

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
	 * @generated NOT
	 */
	@Override
	public Entity contextEntity() {
		return getDisplayedOn().getContentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChildFeature getChildFeature() {
		return childFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildFeature(ChildFeature newChildFeature, NotificationChain msgs) {
		ChildFeature oldChildFeature = childFeature;
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
	public void setChildFeature(ChildFeature newChildFeature) {
		if (newChildFeature != childFeature) {
			NotificationChain msgs = null;
			if (childFeature != null)
				msgs = ((InternalEObject)childFeature).eInverseRemove(this, PersistencePackage.CHILD_FEATURE__PARENT, ChildFeature.class, msgs);
			if (newChildFeature != null)
				msgs = ((InternalEObject)newChildFeature).eInverseAdd(this, PersistencePackage.CHILD_FEATURE__PARENT, ChildFeature.class, msgs);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				if (childFeature != null)
					msgs = ((InternalEObject)childFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE, null, msgs);
				return basicSetChildFeature((ChildFeature)otherEnd, msgs);
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return getChildFeature();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				if (resolve) return getValueDisplay();
				return basicGetValueDisplay();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_SOURCE:
				if (resolve) return getAssociationSource();
				return basicGetAssociationSource();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_TARGET:
				if (resolve) return getAssociationTarget();
				return basicGetAssociationTarget();
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)newValue);
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				setChildFeature((ChildFeature)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				setValueDisplay((ModelLabel)null);
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
			case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
				return childFeature != null;
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY:
				return valueDisplay != null;
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_SOURCE:
				return isSetAssociationSource();
			case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_TARGET:
				return isSetAssociationTarget();
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
				default: return -1;
			}
		}
		if (baseClass == PathRoot.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE: return PersistencePackage.PATH_ROOT__CHILD_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == AssociationPathElement.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION: return PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION;
				case WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY: return PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY;
				case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_SOURCE: return PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE;
				case WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_TARGET: return PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET;
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
				default: return -1;
			}
		}
		if (baseClass == PathRoot.class) {
			switch (baseFeatureID) {
				case PersistencePackage.PATH_ROOT__CHILD_FEATURE: return WebuiPackage.UNIT_ASSOCIATION__CHILD_FEATURE;
				default: return -1;
			}
		}
		if (baseClass == AssociationPathElement.class) {
			switch (baseFeatureID) {
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION: return WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION;
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY: return WebuiPackage.UNIT_ASSOCIATION__VALUE_DISPLAY;
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE: return WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_SOURCE;
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET: return WebuiPackage.UNIT_ASSOCIATION__ASSOCIATION_TARGET;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Path.class) {
			switch (baseOperationID) {
				case PersistencePackage.PATH___CONTEXT_ENTITY: return WebuiPackage.UNIT_ASSOCIATION___CONTEXT_ENTITY;
				case PersistencePackage.PATH___NAME: return WebuiPackage.UNIT_ASSOCIATION___NAME;
				default: return -1;
			}
		}
		if (baseClass == PathRoot.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AssociationPathElement.class) {
			switch (baseOperationID) {
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT___NAME: return WebuiPackage.UNIT_ASSOCIATION___NAME;
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION: return WebuiPackage.UNIT_ASSOCIATION___IS_SOURCE_ASSOCIATION;
				case PersistencePackage.ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY: return WebuiPackage.UNIT_ASSOCIATION___LEAF_ENTITY;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebuiPackage.UNIT_ASSOCIATION___NAME:
				return name();
			case WebuiPackage.UNIT_ASSOCIATION___IS_SOURCE_ASSOCIATION:
				return isSourceAssociation();
			case WebuiPackage.UNIT_ASSOCIATION___LEAF_ENTITY:
				return leafEntity();
			case WebuiPackage.UNIT_ASSOCIATION___CONTEXT_ENTITY:
				return contextEntity();
		}
		return super.eInvoke(operationID, arguments);
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
