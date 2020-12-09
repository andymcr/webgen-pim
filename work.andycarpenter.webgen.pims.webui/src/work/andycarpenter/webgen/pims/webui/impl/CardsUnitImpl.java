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
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.InlineActionContainer;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getDefaultLocalAnchorClass <em>Default Local Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getRowClass <em>Row Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getCardHeaderClass <em>Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getCardBodyClass <em>Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getCardFooterClass <em>Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getUnitBadgeClass <em>Unit Badge Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CardsUnitImpl extends CollectionUnitImpl implements CardsUnit {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #getActionNavigationClass() <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAVIGATION_CLASS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getActionNavigationClass() <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected String actionNavigationClass = ACTION_NAVIGATION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultLocalAnchorClass() <em>Default Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDefaultLocalAnchorClass() <em>Default Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultLocalAnchorClass = DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getRowClass() <em>Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_CLASS_EDEFAULT = "row row-cols-1 row-cols-md-3 row-cols-lg-4 g-3";

	/**
	 * The cached value of the '{@link #getRowClass() <em>Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowClass()
	 * @generated
	 * @ordered
	 */
	protected String rowClass = ROW_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnClass() <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnClass()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_CLASS_EDEFAULT = "col";

	/**
	 * The cached value of the '{@link #getColumnClass() <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnClass()
	 * @generated
	 * @ordered
	 */
	protected String columnClass = COLUMN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardClass() <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_CLASS_EDEFAULT = "";

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
	protected static final String CARD_HEADER_CLASS_EDEFAULT = "";

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
	protected static final String CARD_BODY_CLASS_EDEFAULT = "";

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
	protected static final String CARD_FOOTER_CLASS_EDEFAULT = "";

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
	 * The default value of the '{@link #getUnitBadgeClass() <em>Unit Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_BADGE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnitBadgeClass() <em>Unit Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitBadgeClass()
	 * @generated
	 * @ordered
	 */
	protected String unitBadgeClass = UNIT_BADGE_CLASS_EDEFAULT;

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
	public EList<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebuiPackage.CARDS_UNIT__ACTIONS, WebuiPackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionNavigationClass() {
		return actionNavigationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionNavigationClass(String newActionNavigationClass) {
		String oldActionNavigationClass = actionNavigationClass;
		actionNavigationClass = newActionNavigationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS, oldActionNavigationClass, actionNavigationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultLocalAnchorClass() {
		return defaultLocalAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLocalAnchorClass(String newDefaultLocalAnchorClass) {
		String oldDefaultLocalAnchorClass = defaultLocalAnchorClass;
		defaultLocalAnchorClass = newDefaultLocalAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS, oldDefaultLocalAnchorClass, defaultLocalAnchorClass));
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
	public String getRowClass() {
		return rowClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowClass(String newRowClass) {
		String oldRowClass = rowClass;
		rowClass = newRowClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__ROW_CLASS, oldRowClass, rowClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnClass() {
		return columnClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnClass(String newColumnClass) {
		String oldColumnClass = columnClass;
		columnClass = newColumnClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__COLUMN_CLASS, oldColumnClass, columnClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__CARD_CLASS, oldCardClass, cardClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__CARD_HEADER_CLASS, oldCardHeaderClass, cardHeaderClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__CARD_BODY_CLASS, oldCardBodyClass, cardBodyClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__CARD_FOOTER_CLASS, oldCardFooterClass, cardFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitBadgeClass() {
		return unitBadgeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitBadgeClass(String newUnitBadgeClass) {
		String oldUnitBadgeClass = unitBadgeClass;
		unitBadgeClass = newUnitBadgeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__UNIT_BADGE_CLASS, oldUnitBadgeClass, unitBadgeClass));
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				return getActions();
			case WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS:
				return getActionNavigationClass();
			case WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS:
				return getDefaultLocalAnchorClass();
			case WebuiPackage.CARDS_UNIT__BADGES:
				return getBadges();
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return isOverlaySingleSelectAction();
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				return getRowClass();
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				return getColumnClass();
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				return getCardClass();
			case WebuiPackage.CARDS_UNIT__CARD_HEADER_CLASS:
				return getCardHeaderClass();
			case WebuiPackage.CARDS_UNIT__CARD_BODY_CLASS:
				return getCardBodyClass();
			case WebuiPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
				return getCardFooterClass();
			case WebuiPackage.CARDS_UNIT__UNIT_BADGE_CLASS:
				return getUnitBadgeClass();
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS:
				setDefaultLocalAnchorClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction((Boolean)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				setRowClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				setColumnClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				setCardClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_HEADER_CLASS:
				setCardHeaderClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_BODY_CLASS:
				setCardBodyClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
				setCardFooterClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__UNIT_BADGE_CLASS:
				setUnitBadgeClass((String)newValue);
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				getActions().clear();
				return;
			case WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass(ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS:
				setDefaultLocalAnchorClass(DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction(OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				setRowClass(ROW_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				setColumnClass(COLUMN_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				setCardClass(CARD_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_HEADER_CLASS:
				setCardHeaderClass(CARD_HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_BODY_CLASS:
				setCardBodyClass(CARD_BODY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
				setCardFooterClass(CARD_FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__UNIT_BADGE_CLASS:
				setUnitBadgeClass(UNIT_BADGE_CLASS_EDEFAULT);
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
			case WebuiPackage.CARDS_UNIT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS:
				return ACTION_NAVIGATION_CLASS_EDEFAULT == null ? actionNavigationClass != null : !ACTION_NAVIGATION_CLASS_EDEFAULT.equals(actionNavigationClass);
			case WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS:
				return DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT == null ? defaultLocalAnchorClass != null : !DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT.equals(defaultLocalAnchorClass);
			case WebuiPackage.CARDS_UNIT__BADGES:
				return badges != null && !badges.isEmpty();
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return overlaySingleSelectAction != OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				return ROW_CLASS_EDEFAULT == null ? rowClass != null : !ROW_CLASS_EDEFAULT.equals(rowClass);
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				return COLUMN_CLASS_EDEFAULT == null ? columnClass != null : !COLUMN_CLASS_EDEFAULT.equals(columnClass);
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
			case WebuiPackage.CARDS_UNIT__CARD_HEADER_CLASS:
				return CARD_HEADER_CLASS_EDEFAULT == null ? cardHeaderClass != null : !CARD_HEADER_CLASS_EDEFAULT.equals(cardHeaderClass);
			case WebuiPackage.CARDS_UNIT__CARD_BODY_CLASS:
				return CARD_BODY_CLASS_EDEFAULT == null ? cardBodyClass != null : !CARD_BODY_CLASS_EDEFAULT.equals(cardBodyClass);
			case WebuiPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
				return CARD_FOOTER_CLASS_EDEFAULT == null ? cardFooterClass != null : !CARD_FOOTER_CLASS_EDEFAULT.equals(cardFooterClass);
			case WebuiPackage.CARDS_UNIT__UNIT_BADGE_CLASS:
				return UNIT_BADGE_CLASS_EDEFAULT == null ? unitBadgeClass != null : !UNIT_BADGE_CLASS_EDEFAULT.equals(unitBadgeClass);
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
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.CARDS_UNIT__ACTIONS: return WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS;
				case WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS: return WebuiPackage.INLINE_ACTION_CONTAINER__ACTION_NAVIGATION_CLASS;
				case WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS: return WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS;
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
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebuiPackage.CARDS_UNIT__ACTIONS;
				case WebuiPackage.INLINE_ACTION_CONTAINER__ACTION_NAVIGATION_CLASS: return WebuiPackage.CARDS_UNIT__ACTION_NAVIGATION_CLASS;
				case WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS: return WebuiPackage.CARDS_UNIT__DEFAULT_LOCAL_ANCHOR_CLASS;
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
		result.append(" (actionNavigationClass: ");
		result.append(actionNavigationClass);
		result.append(", defaultLocalAnchorClass: ");
		result.append(defaultLocalAnchorClass);
		result.append(", overlaySingleSelectAction: ");
		result.append(overlaySingleSelectAction);
		result.append(", rowClass: ");
		result.append(rowClass);
		result.append(", columnClass: ");
		result.append(columnClass);
		result.append(", cardClass: ");
		result.append(cardClass);
		result.append(", cardHeaderClass: ");
		result.append(cardHeaderClass);
		result.append(", cardBodyClass: ");
		result.append(cardBodyClass);
		result.append(", cardFooterClass: ");
		result.append(cardFooterClass);
		result.append(", unitBadgeClass: ");
		result.append(unitBadgeClass);
		result.append(')');
		return result.toString();
	}

} //CardsUnitImpl
