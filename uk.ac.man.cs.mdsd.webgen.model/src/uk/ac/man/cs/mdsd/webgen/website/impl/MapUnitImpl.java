/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.ac.man.cs.mdsd.webgen.website.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.website.MapUnit;
import uk.ac.man.cs.mdsd.webgen.website.SelectTarget;
import uk.ac.man.cs.mdsd.webgen.website.ServiceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#getSelectionFeatures <em>Selection Features</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#getDefaultZoomLevel <em>Default Zoom Level</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.MapUnitImpl#getPlaceName <em>Place Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapUnitImpl extends EditUnitImpl implements MapUnit {
	/**
	 * The cached value of the '{@link #getSelectionFeatures() <em>Selection Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityAttribute> selectionFeatures;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_ZOOM_LEVEL_EDEFAULT = 12;

	/**
	 * The cached value of the '{@link #getDefaultZoomLevel() <em>Default Zoom Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultZoomLevel()
	 * @generated
	 * @ordered
	 */
	protected int defaultZoomLevel = DEFAULT_ZOOM_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = "unit,map_unit,framed";

	/**
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected String styleClass = STYLE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ServiceAttribute location;

	/**
	 * The cached value of the '{@link #getPlaceName() <em>Place Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceName()
	 * @generated
	 * @ordered
	 */
	protected ServiceAttribute placeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.MAP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EntityAttribute> getSelectionFeatures() {
		if (selectionFeatures == null) {
			selectionFeatures = new EObjectResolvingEList<EntityAttribute>(EntityAttribute.class, this, WebsitePackage.MAP_UNIT__SELECTION_FEATURES);
		}
		return selectionFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MAP_UNIT__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultZoomLevel() {
		return defaultZoomLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultZoomLevel(int newDefaultZoomLevel) {
		int oldDefaultZoomLevel = defaultZoomLevel;
		defaultZoomLevel = newDefaultZoomLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL, oldDefaultZoomLevel, defaultZoomLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		String oldStyleClass = styleClass;
		styleClass = newStyleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MAP_UNIT__STYLE_CLASS, oldStyleClass, styleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute getPlaceName() {
		if (placeName != null && placeName.eIsProxy()) {
			InternalEObject oldPlaceName = (InternalEObject)placeName;
			placeName = (ServiceAttribute)eResolveProxy(oldPlaceName);
			if (placeName != oldPlaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
			}
		}
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute basicGetPlaceName() {
		return placeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceName(ServiceAttribute newPlaceName) {
		ServiceAttribute oldPlaceName = placeName;
		placeName = newPlaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MAP_UNIT__PLACE_NAME, oldPlaceName, placeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (ServiceAttribute)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.MAP_UNIT__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ServiceAttribute newLocation) {
		ServiceAttribute oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.MAP_UNIT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.MAP_UNIT__SELECTION_FEATURES:
				return getSelectionFeatures();
			case WebsitePackage.MAP_UNIT__READ_ONLY:
				return isReadOnly();
			case WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return getDefaultZoomLevel();
			case WebsitePackage.MAP_UNIT__STYLE_CLASS:
				return getStyleClass();
			case WebsitePackage.MAP_UNIT__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case WebsitePackage.MAP_UNIT__PLACE_NAME:
				if (resolve) return getPlaceName();
				return basicGetPlaceName();
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
			case WebsitePackage.MAP_UNIT__SELECTION_FEATURES:
				getSelectionFeatures().clear();
				getSelectionFeatures().addAll((Collection<? extends EntityAttribute>)newValue);
				return;
			case WebsitePackage.MAP_UNIT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel((Integer)newValue);
				return;
			case WebsitePackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case WebsitePackage.MAP_UNIT__LOCATION:
				setLocation((ServiceAttribute)newValue);
				return;
			case WebsitePackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((ServiceAttribute)newValue);
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
			case WebsitePackage.MAP_UNIT__SELECTION_FEATURES:
				getSelectionFeatures().clear();
				return;
			case WebsitePackage.MAP_UNIT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				setDefaultZoomLevel(DEFAULT_ZOOM_LEVEL_EDEFAULT);
				return;
			case WebsitePackage.MAP_UNIT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case WebsitePackage.MAP_UNIT__LOCATION:
				setLocation((ServiceAttribute)null);
				return;
			case WebsitePackage.MAP_UNIT__PLACE_NAME:
				setPlaceName((ServiceAttribute)null);
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
			case WebsitePackage.MAP_UNIT__SELECTION_FEATURES:
				return selectionFeatures != null && !selectionFeatures.isEmpty();
			case WebsitePackage.MAP_UNIT__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WebsitePackage.MAP_UNIT__DEFAULT_ZOOM_LEVEL:
				return defaultZoomLevel != DEFAULT_ZOOM_LEVEL_EDEFAULT;
			case WebsitePackage.MAP_UNIT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? styleClass != null : !STYLE_CLASS_EDEFAULT.equals(styleClass);
			case WebsitePackage.MAP_UNIT__LOCATION:
				return location != null;
			case WebsitePackage.MAP_UNIT__PLACE_NAME:
				return placeName != null;
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
		if (baseClass == SelectTarget.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.MAP_UNIT__SELECTION_FEATURES: return WebsitePackage.SELECT_TARGET__SELECTION_FEATURES;
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
		if (baseClass == SelectTarget.class) {
			switch (baseFeatureID) {
				case WebsitePackage.SELECT_TARGET__SELECTION_FEATURES: return WebsitePackage.MAP_UNIT__SELECTION_FEATURES;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(", defaultZoomLevel: ");
		result.append(defaultZoomLevel);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //MapUnitImpl
