/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.webui.Badge;
import work.andycarpenter.webgen.pims.webui.CardsUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getLocalCardClass <em>Local Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getLocalCardHeaderClass <em>Local Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getLocalCardBodyClass <em>Local Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getLocalCardFooterClass <em>Local Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getLocalBadgeClass <em>Local Badge Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CardsUnitImpl extends CollectionUnitImpl implements CardsUnit {
	/**
	 * The cached value of the '{@link #getBadges() <em>Badges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadges()
	 * @generated
	 * @ordered
	 */
	protected EList<Badge> badges;

	/**
	 * The default value of the '{@link #isOverlaySingleSelectAction() <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverlaySingleSelectAction() <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 * @ordered
	 */
	protected boolean overlaySingleSelectAction = OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCardClass() <em>Local Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CARD_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCardClass() <em>Local Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardClass()
	 * @generated
	 * @ordered
	 */
	protected String localCardClass = LOCAL_CARD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCardHeaderClass() <em>Local Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CARD_HEADER_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCardHeaderClass() <em>Local Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String localCardHeaderClass = LOCAL_CARD_HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCardBodyClass() <em>Local Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CARD_BODY_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCardBodyClass() <em>Local Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected String localCardBodyClass = LOCAL_CARD_BODY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalCardFooterClass() <em>Local Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CARD_FOOTER_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalCardFooterClass() <em>Local Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String localCardFooterClass = LOCAL_CARD_FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalBadgeClass() <em>Local Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_BADGE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalBadgeClass() <em>Local Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected String localBadgeClass = LOCAL_BADGE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardsUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CARDS_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Badge> getBadges() {
		if (badges == null) {
			badges = new EObjectContainmentWithInverseEList<Badge>(Badge.class, this, WebuiPackage.CARDS_UNIT__BADGES, WebuiPackage.BADGE__DISPLAYED_ON);
		}
		return badges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverlaySingleSelectAction() {
		return overlaySingleSelectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverlaySingleSelectAction(boolean newOverlaySingleSelectAction) {
		boolean oldOverlaySingleSelectAction = overlaySingleSelectAction;
		overlaySingleSelectAction = newOverlaySingleSelectAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION, oldOverlaySingleSelectAction, overlaySingleSelectAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCardClass() {
		return localCardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCardClass(String newLocalCardClass) {
		String oldLocalCardClass = localCardClass;
		localCardClass = newLocalCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__LOCAL_CARD_CLASS, oldLocalCardClass, localCardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCardHeaderClass() {
		return localCardHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCardHeaderClass(String newLocalCardHeaderClass) {
		String oldLocalCardHeaderClass = localCardHeaderClass;
		localCardHeaderClass = newLocalCardHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS, oldLocalCardHeaderClass, localCardHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCardBodyClass() {
		return localCardBodyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCardBodyClass(String newLocalCardBodyClass) {
		String oldLocalCardBodyClass = localCardBodyClass;
		localCardBodyClass = newLocalCardBodyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS, oldLocalCardBodyClass, localCardBodyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalCardFooterClass() {
		return localCardFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalCardFooterClass(String newLocalCardFooterClass) {
		String oldLocalCardFooterClass = localCardFooterClass;
		localCardFooterClass = newLocalCardFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS, oldLocalCardFooterClass, localCardFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalBadgeClass() {
		return localBadgeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalBadgeClass(String newLocalBadgeClass) {
		String oldLocalBadgeClass = localBadgeClass;
		localBadgeClass = newLocalBadgeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__LOCAL_BADGE_CLASS, oldLocalBadgeClass, localBadgeClass));
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBadges()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				return ((InternalEList<?>)getBadges()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				return getBadges();
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return isOverlaySingleSelectAction();
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
				return getLocalCardClass();
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
				return getLocalCardHeaderClass();
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
				return getLocalCardBodyClass();
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
				return getLocalCardFooterClass();
			case WebuiPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
				return getLocalBadgeClass();
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction((Boolean)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
				setLocalCardClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
				setLocalCardHeaderClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
				setLocalCardBodyClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
				setLocalCardFooterClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
				setLocalBadgeClass((String)newValue);
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction(OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
				setLocalCardClass(LOCAL_CARD_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
				setLocalCardHeaderClass(LOCAL_CARD_HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
				setLocalCardBodyClass(LOCAL_CARD_BODY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
				setLocalCardFooterClass(LOCAL_CARD_FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
				setLocalBadgeClass(LOCAL_BADGE_CLASS_EDEFAULT);
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
			case WebuiPackage.CARDS_UNIT__BADGES:
				return badges != null && !badges.isEmpty();
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return overlaySingleSelectAction != OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
				return LOCAL_CARD_CLASS_EDEFAULT == null ? localCardClass != null : !LOCAL_CARD_CLASS_EDEFAULT.equals(localCardClass);
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
				return LOCAL_CARD_HEADER_CLASS_EDEFAULT == null ? localCardHeaderClass != null : !LOCAL_CARD_HEADER_CLASS_EDEFAULT.equals(localCardHeaderClass);
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
				return LOCAL_CARD_BODY_CLASS_EDEFAULT == null ? localCardBodyClass != null : !LOCAL_CARD_BODY_CLASS_EDEFAULT.equals(localCardBodyClass);
			case WebuiPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
				return LOCAL_CARD_FOOTER_CLASS_EDEFAULT == null ? localCardFooterClass != null : !LOCAL_CARD_FOOTER_CLASS_EDEFAULT.equals(localCardFooterClass);
			case WebuiPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
				return LOCAL_BADGE_CLASS_EDEFAULT == null ? localBadgeClass != null : !LOCAL_BADGE_CLASS_EDEFAULT.equals(localBadgeClass);
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
		result.append(" (overlaySingleSelectAction: ");
		result.append(overlaySingleSelectAction);
		result.append(", localCardClass: ");
		result.append(localCardClass);
		result.append(", localCardHeaderClass: ");
		result.append(localCardHeaderClass);
		result.append(", localCardBodyClass: ");
		result.append(localCardBodyClass);
		result.append(", localCardFooterClass: ");
		result.append(localCardFooterClass);
		result.append(", localBadgeClass: ");
		result.append(localBadgeClass);
		result.append(')');
		return result.toString();
	}

} //CardsUnitImpl
