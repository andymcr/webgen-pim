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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getDefaultAnchorClass <em>Default Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getRowClass <em>Row Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CardsUnitImpl#getCardClass <em>Card Class</em>}</li>
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
	 * The default value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ANCHOR_CLASS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDefaultAnchorClass() <em>Default Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultAnchorClass = DEFAULT_ANCHOR_CLASS_EDEFAULT;

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
	 * The default value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_FIELD_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitFieldLabels = OMIT_FIELD_LABELS_EDEFAULT;

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
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "container";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

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
	protected static final String CARD_CLASS_EDEFAULT = "card rounded shadow h-100";

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
	public String getDefaultAnchorClass() {
		return defaultAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAnchorClass(String newDefaultAnchorClass) {
		String oldDefaultAnchorClass = defaultAnchorClass;
		defaultAnchorClass = newDefaultAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS, oldDefaultAnchorClass, defaultAnchorClass));
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
	public boolean isOmitFieldLabels() {
		return omitFieldLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitFieldLabels(boolean newOmitFieldLabels) {
		boolean oldOmitFieldLabels = omitFieldLabels;
		omitFieldLabels = newOmitFieldLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS, oldOmitFieldLabels, omitFieldLabels));
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
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CARDS_UNIT__CONTENT_CLASS, oldContentClass, contentClass));
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
			case WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS:
				return getDefaultAnchorClass();
			case WebuiPackage.CARDS_UNIT__BADGES:
				return getBadges();
			case WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return isOverlaySingleSelectAction();
			case WebuiPackage.CARDS_UNIT__CONTENT_CLASS:
				return getContentClass();
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				return getRowClass();
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				return getColumnClass();
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				return getCardClass();
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
			case WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass((String)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels((Boolean)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction((Boolean)newValue);
				return;
			case WebuiPackage.CARDS_UNIT__CONTENT_CLASS:
				setContentClass((String)newValue);
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
			case WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS:
				setDefaultAnchorClass(DEFAULT_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__BADGES:
				getBadges().clear();
				return;
			case WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels(OMIT_FIELD_LABELS_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				setOverlaySingleSelectAction(OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT);
				return;
			case WebuiPackage.CARDS_UNIT__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
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
			case WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS:
				return DEFAULT_ANCHOR_CLASS_EDEFAULT == null ? defaultAnchorClass != null : !DEFAULT_ANCHOR_CLASS_EDEFAULT.equals(defaultAnchorClass);
			case WebuiPackage.CARDS_UNIT__BADGES:
				return badges != null && !badges.isEmpty();
			case WebuiPackage.CARDS_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
			case WebuiPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
				return overlaySingleSelectAction != OVERLAY_SINGLE_SELECT_ACTION_EDEFAULT;
			case WebuiPackage.CARDS_UNIT__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
			case WebuiPackage.CARDS_UNIT__ROW_CLASS:
				return ROW_CLASS_EDEFAULT == null ? rowClass != null : !ROW_CLASS_EDEFAULT.equals(rowClass);
			case WebuiPackage.CARDS_UNIT__COLUMN_CLASS:
				return COLUMN_CLASS_EDEFAULT == null ? columnClass != null : !COLUMN_CLASS_EDEFAULT.equals(columnClass);
			case WebuiPackage.CARDS_UNIT__CARD_CLASS:
				return CARD_CLASS_EDEFAULT == null ? cardClass != null : !CARD_CLASS_EDEFAULT.equals(cardClass);
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
				case WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS: return WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_ANCHOR_CLASS;
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
				case WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_ANCHOR_CLASS: return WebuiPackage.CARDS_UNIT__DEFAULT_ANCHOR_CLASS;
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
		result.append(" (defaultAnchorClass: ");
		result.append(defaultAnchorClass);
		result.append(", omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(", overlaySingleSelectAction: ");
		result.append(overlaySingleSelectAction);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(", rowClass: ");
		result.append(rowClass);
		result.append(", columnClass: ");
		result.append(columnClass);
		result.append(", cardClass: ");
		result.append(cardClass);
		result.append(')');
		return result.toString();
	}

} //CardsUnitImpl
