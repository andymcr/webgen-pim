/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.CardsUnitStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cards Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl#getCardHeaderClass <em>Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl#getCardBodyClass <em>Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl#getCardFooterClass <em>Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitStylesImpl#getBadgeClass <em>Badge Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardsUnitStylesImpl extends CollectionStylesImpl implements CardsUnitStyles {
	/**
	 * The default value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_CLASS_EDEFAULT = "card";

	/**
	 * The cached value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected String cardClass = CARD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardHeaderClass() <em>Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_HEADER_CLASS_EDEFAULT = "card-heder";

	/**
	 * The cached value of the '{@link #getCardHeaderClass() <em>Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String cardHeaderClass = CARD_HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardBodyClass() <em>Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_BODY_CLASS_EDEFAULT = "card-body";

	/**
	 * The cached value of the '{@link #getCardBodyClass() <em>Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardBodyClass()
	 * @generated
	 * @ordered
	 */
	protected String cardBodyClass = CARD_BODY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardFooterClass() <em>Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_FOOTER_CLASS_EDEFAULT = "card-footer";

	/**
	 * The cached value of the '{@link #getCardFooterClass() <em>Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String cardFooterClass = CARD_FOOTER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBadgeClass() <em>Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String BADGE_CLASS_EDEFAULT = "badge";

	/**
	 * The cached value of the '{@link #getBadgeClass() <em>Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected String badgeClass = BADGE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardsUnitStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CARDS_UNIT_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardClass() {
		return cardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardClass(String newCardClass) {
		String oldCardClass = cardClass;
		cardClass = newCardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT_STYLES__CARD_CLASS, oldCardClass, cardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardHeaderClass() {
		return cardHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardHeaderClass(String newCardHeaderClass) {
		String oldCardHeaderClass = cardHeaderClass;
		cardHeaderClass = newCardHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT_STYLES__CARD_HEADER_CLASS, oldCardHeaderClass, cardHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardBodyClass() {
		return cardBodyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardBodyClass(String newCardBodyClass) {
		String oldCardBodyClass = cardBodyClass;
		cardBodyClass = newCardBodyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT_STYLES__CARD_BODY_CLASS, oldCardBodyClass, cardBodyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardFooterClass() {
		return cardFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardFooterClass(String newCardFooterClass) {
		String oldCardFooterClass = cardFooterClass;
		cardFooterClass = newCardFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT_STYLES__CARD_FOOTER_CLASS, oldCardFooterClass, cardFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBadgeClass() {
		return badgeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBadgeClass(String newBadgeClass) {
		String oldBadgeClass = badgeClass;
		badgeClass = newBadgeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT_STYLES__BADGE_CLASS, oldBadgeClass, badgeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_CLASS:
				return getCardClass();
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_HEADER_CLASS:
				return getCardHeaderClass();
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_BODY_CLASS:
				return getCardBodyClass();
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_FOOTER_CLASS:
				return getCardFooterClass();
			case WebuiPackage.CARDS_UNIT_STYLES__BADGE_CLASS:
				return getBadgeClass();
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
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_CLASS:
				setCardClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_HEADER_CLASS:
				setCardHeaderClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_BODY_CLASS:
				setCardBodyClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_FOOTER_CLASS:
				setCardFooterClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__BADGE_CLASS:
				setBadgeClass((String)newValue);
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
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_CLASS:
				setCardClass(CARD_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_HEADER_CLASS:
				setCardHeaderClass(CARD_HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_BODY_CLASS:
				setCardBodyClass(CARD_BODY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_FOOTER_CLASS:
				setCardFooterClass(CARD_FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT_STYLES__BADGE_CLASS:
				setBadgeClass(BADGE_CLASS_EDEFAULT);
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
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_HEADER_CLASS:
				return CARD_HEADER_CLASS_EDEFAULT == null ? cardHeaderClass != null : !CARD_HEADER_CLASS_EDEFAULT.equals(cardHeaderClass);
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_BODY_CLASS:
				return CARD_BODY_CLASS_EDEFAULT == null ? cardBodyClass != null : !CARD_BODY_CLASS_EDEFAULT.equals(cardBodyClass);
			case WebuiPackage.CARDS_UNIT_STYLES__CARD_FOOTER_CLASS:
				return CARD_FOOTER_CLASS_EDEFAULT == null ? cardFooterClass != null : !CARD_FOOTER_CLASS_EDEFAULT.equals(cardFooterClass);
			case WebuiPackage.CARDS_UNIT_STYLES__BADGE_CLASS:
				return BADGE_CLASS_EDEFAULT == null ? badgeClass != null : !BADGE_CLASS_EDEFAULT.equals(badgeClass);
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
		result.append(" (cardClass: ");
		result.append(cardClass);
		result.append(", cardHeaderClass: ");
		result.append(cardHeaderClass);
		result.append(", cardBodyClass: ");
		result.append(cardBodyClass);
		result.append(", cardFooterClass: ");
		result.append(cardFooterClass);
		result.append(", badgeClass: ");
		result.append(badgeClass);
		result.append(')');
		return result.toString();
	}

} //CardsUnitStylesImpl
