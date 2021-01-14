/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;

import work.andycarpenter.webgen.pims.expression.Predicate;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.InlineActionContainer;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getContainingTypes <em>Containing Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#isDisable <em>Disable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getAnchorClass <em>Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InlineActionImpl#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InlineActionImpl extends NamedDisplayElementImpl implements InlineAction {
	/**
	 * The cached setting delegate for the '{@link #getContainingTypes() <em>Containing Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.INLINE_ACTION__CONTAINING_TYPES).getSettingDelegate();

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
	 * The default value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisable() <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisable()
	 * @generated
	 * @ordered
	 */
	protected boolean disable = DISABLE_EDEFAULT;

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
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorClass() <em>Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAnchorClass() <em>Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String anchorClass = ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.INLINE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InlineActionContainer getUsedBy() {
		if (eContainerFeatureID() != WebuiPackage.INLINE_ACTION__USED_BY) return null;
		return (InlineActionContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(InlineActionContainer newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, WebuiPackage.INLINE_ACTION__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedBy(InlineActionContainer newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.INLINE_ACTION__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS, InlineActionContainer.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__USED_BY, newUsedBy, newUsedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entity> getContainingTypes() {
		return (EList<Entity>)CONTAINING_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisable() {
		return disable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisable(boolean newDisable) {
		boolean oldDisable = disable;
		disable = newDisable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__DISABLE, oldDisable, disable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__DISPLAY_WHEN, oldDisplayWhen, newDisplayWhen);
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
				msgs = ((InternalEObject)displayWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INLINE_ACTION__DISPLAY_WHEN, null, msgs);
			if (newDisplayWhen != null)
				msgs = ((InternalEObject)newDisplayWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INLINE_ACTION__DISPLAY_WHEN, null, msgs);
			msgs = basicSetDisplayWhen(newDisplayWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__DISPLAY_WHEN, newDisplayWhen, newDisplayWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnchorClass() {
		return anchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorClass(String newAnchorClass) {
		String oldAnchorClass = anchorClass;
		anchorClass = newAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__ANCHOR_CLASS, oldAnchorClass, anchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INLINE_ACTION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.INLINE_ACTION__USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsedBy((InlineActionContainer)otherEnd, msgs);
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				return basicSetUsedBy(null, msgs);
			case WebuiPackage.INLINE_ACTION__DISPLAY_WHEN:
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS, InlineActionContainer.class, msgs);
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				return getUsedBy();
			case WebuiPackage.INLINE_ACTION__CONTAINING_TYPES:
				return getContainingTypes();
			case WebuiPackage.INLINE_ACTION__ICON_NAME:
				return getIconName();
			case WebuiPackage.INLINE_ACTION__DISABLE:
				return isDisable();
			case WebuiPackage.INLINE_ACTION__DISPLAY_WHEN:
				return getDisplayWhen();
			case WebuiPackage.INLINE_ACTION__HEADER:
				return getHeader();
			case WebuiPackage.INLINE_ACTION__FOOTER:
				return getFooter();
			case WebuiPackage.INLINE_ACTION__ANCHOR_CLASS:
				return getAnchorClass();
			case WebuiPackage.INLINE_ACTION__HEADER_CLASS:
				return getHeaderClass();
			case WebuiPackage.INLINE_ACTION__FOOTER_CLASS:
				return getFooterClass();
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				setUsedBy((InlineActionContainer)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__ICON_NAME:
				setIconName((String)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__DISABLE:
				setDisable((Boolean)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__DISPLAY_WHEN:
				setDisplayWhen((Predicate)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__HEADER:
				setHeader((String)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__ANCHOR_CLASS:
				setAnchorClass((String)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebuiPackage.INLINE_ACTION__FOOTER_CLASS:
				setFooterClass((String)newValue);
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				setUsedBy((InlineActionContainer)null);
				return;
			case WebuiPackage.INLINE_ACTION__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__DISABLE:
				setDisable(DISABLE_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__DISPLAY_WHEN:
				setDisplayWhen((Predicate)null);
				return;
			case WebuiPackage.INLINE_ACTION__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__ANCHOR_CLASS:
				setAnchorClass(ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.INLINE_ACTION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
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
			case WebuiPackage.INLINE_ACTION__USED_BY:
				return getUsedBy() != null;
			case WebuiPackage.INLINE_ACTION__CONTAINING_TYPES:
				return CONTAINING_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case WebuiPackage.INLINE_ACTION__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case WebuiPackage.INLINE_ACTION__DISABLE:
				return disable != DISABLE_EDEFAULT;
			case WebuiPackage.INLINE_ACTION__DISPLAY_WHEN:
				return displayWhen != null;
			case WebuiPackage.INLINE_ACTION__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebuiPackage.INLINE_ACTION__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.INLINE_ACTION__ANCHOR_CLASS:
				return ANCHOR_CLASS_EDEFAULT == null ? anchorClass != null : !ANCHOR_CLASS_EDEFAULT.equals(anchorClass);
			case WebuiPackage.INLINE_ACTION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebuiPackage.INLINE_ACTION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
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
		result.append(", disable: ");
		result.append(disable);
		result.append(", header: ");
		result.append(header);
		result.append(", footer: ");
		result.append(footer);
		result.append(", anchorClass: ");
		result.append(anchorClass);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //InlineActionImpl
