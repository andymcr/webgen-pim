/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.expression.Predicate;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.CardsUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.BadgeImpl#getDisplayWhen <em>Display When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BadgeImpl extends MinimalEObjectImpl.Container implements Badge {
	/**
	 * The default value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected String iconName = ICON_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath value;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Attribute title;

	/**
	 * The cached value of the '{@link #getDisplayWhen() <em>Display When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate displayWhen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BadgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardsUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebuiPackage.BADGE__DISPLAYED_ON) return null;
		return (CardsUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(CardsUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebuiPackage.BADGE__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayedOn(CardsUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.BADGE__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebuiPackage.CARDS_UNIT__BADGES, CardsUnit.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconName() {
		return iconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconName(String newIconName) {
		String oldIconName = iconName;
		iconName = newIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePath getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(FeaturePath newValue, NotificationChain msgs) {
		FeaturePath oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__VALUE, oldValue, newValue);
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
	public void setValue(FeaturePath newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.BADGE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.BADGE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Attribute)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.BADGE__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(Attribute newTitle) {
		Attribute oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getDisplayWhen() {
		return displayWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayWhen(Predicate newDisplayWhen, NotificationChain msgs) {
		Predicate oldDisplayWhen = displayWhen;
		displayWhen = newDisplayWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__DISPLAY_WHEN, oldDisplayWhen, newDisplayWhen);
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
	public void setDisplayWhen(Predicate newDisplayWhen) {
		if (newDisplayWhen != displayWhen) {
			NotificationChain msgs = null;
			if (displayWhen != null)
				msgs = ((InternalEObject)displayWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.BADGE__DISPLAY_WHEN, null, msgs);
			if (newDisplayWhen != null)
				msgs = ((InternalEObject)newDisplayWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.BADGE__DISPLAY_WHEN, null, msgs);
			msgs = basicSetDisplayWhen(newDisplayWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.BADGE__DISPLAY_WHEN, newDisplayWhen, newDisplayWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.BADGE__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((CardsUnit)otherEnd, msgs);
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
			case WebuiPackage.BADGE__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebuiPackage.BADGE__VALUE:
				return basicSetValue(null, msgs);
			case WebuiPackage.BADGE__DISPLAY_WHEN:
				return basicSetDisplayWhen(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebuiPackage.BADGE__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.CARDS_UNIT__BADGES, CardsUnit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.BADGE__DISPLAYED_ON:
				return getDisplayedOn();
			case WebuiPackage.BADGE__ICON_NAME:
				return getIconName();
			case WebuiPackage.BADGE__VALUE:
				return getValue();
			case WebuiPackage.BADGE__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case WebuiPackage.BADGE__DISPLAY_WHEN:
				return getDisplayWhen();
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
			case WebuiPackage.BADGE__DISPLAYED_ON:
				setDisplayedOn((CardsUnit)newValue);
				return;
			case WebuiPackage.BADGE__ICON_NAME:
				setIconName((String)newValue);
				return;
			case WebuiPackage.BADGE__VALUE:
				setValue((FeaturePath)newValue);
				return;
			case WebuiPackage.BADGE__TITLE:
				setTitle((Attribute)newValue);
				return;
			case WebuiPackage.BADGE__DISPLAY_WHEN:
				setDisplayWhen((Predicate)newValue);
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
			case WebuiPackage.BADGE__DISPLAYED_ON:
				setDisplayedOn((CardsUnit)null);
				return;
			case WebuiPackage.BADGE__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.BADGE__VALUE:
				setValue((FeaturePath)null);
				return;
			case WebuiPackage.BADGE__TITLE:
				setTitle((Attribute)null);
				return;
			case WebuiPackage.BADGE__DISPLAY_WHEN:
				setDisplayWhen((Predicate)null);
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
			case WebuiPackage.BADGE__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebuiPackage.BADGE__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case WebuiPackage.BADGE__VALUE:
				return value != null;
			case WebuiPackage.BADGE__TITLE:
				return title != null;
			case WebuiPackage.BADGE__DISPLAY_WHEN:
				return displayWhen != null;
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
		result.append(" (iconName: ");
		result.append(iconName);
		result.append(')');
		return result.toString();
	}

} //BadgeImpl
