/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
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
import work.andycarpenter.webgen.pims.webui.Action;
import work.andycarpenter.webgen.pims.webui.ActionContainer;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#isDisable <em>Disable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getFailureMessage <em>Failure Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getAnchorClass <em>Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.ActionImpl#getContainingTypes <em>Containing Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends NamedDisplayElementImpl implements Action {
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
	 * The cached value of the '{@link #getEnableWhen() <em>Enable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate enableWhen;

	/**
	 * The default value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_MESSAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected String confirmMessage = CONFIRM_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_MESSAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected String successMessage = SUCCESS_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailureMessage() <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_MESSAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFailureMessage() <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMessage()
	 * @generated
	 * @ordered
	 */
	protected String failureMessage = FAILURE_MESSAGE_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #getContainingTypes() <em>Containing Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.ACTION__CONTAINING_TYPES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionContainer getUsedBy() {
		if (eContainerFeatureID() != WebuiPackage.ACTION__USED_BY) return null;
		return (ActionContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBy(ActionContainer newUsedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsedBy, WebuiPackage.ACTION__USED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedBy(ActionContainer newUsedBy) {
		if (newUsedBy != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.ACTION__USED_BY && newUsedBy != null)) {
			if (EcoreUtil.isAncestor(this, newUsedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsedBy != null)
				msgs = ((InternalEObject)newUsedBy).eInverseAdd(this, WebuiPackage.ACTION_CONTAINER__ACTIONS, ActionContainer.class, msgs);
			msgs = basicSetUsedBy(newUsedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__USED_BY, newUsedBy, newUsedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__ICON_NAME, oldIconName, iconName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__DISABLE, oldDisable, disable));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__DISPLAY_WHEN, oldDisplayWhen, newDisplayWhen);
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
				msgs = ((InternalEObject)displayWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ACTION__DISPLAY_WHEN, null, msgs);
			if (newDisplayWhen != null)
				msgs = ((InternalEObject)newDisplayWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ACTION__DISPLAY_WHEN, null, msgs);
			msgs = basicSetDisplayWhen(newDisplayWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__DISPLAY_WHEN, newDisplayWhen, newDisplayWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getEnableWhen() {
		return enableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableWhen(Predicate newEnableWhen, NotificationChain msgs) {
		Predicate oldEnableWhen = enableWhen;
		enableWhen = newEnableWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__ENABLE_WHEN, oldEnableWhen, newEnableWhen);
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
	public void setEnableWhen(Predicate newEnableWhen) {
		if (newEnableWhen != enableWhen) {
			NotificationChain msgs = null;
			if (enableWhen != null)
				msgs = ((InternalEObject)enableWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ACTION__ENABLE_WHEN, null, msgs);
			if (newEnableWhen != null)
				msgs = ((InternalEObject)newEnableWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.ACTION__ENABLE_WHEN, null, msgs);
			msgs = basicSetEnableWhen(newEnableWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__ENABLE_WHEN, newEnableWhen, newEnableWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmMessage() {
		return confirmMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmMessage(String newConfirmMessage) {
		String oldConfirmMessage = confirmMessage;
		confirmMessage = newConfirmMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__CONFIRM_MESSAGE, oldConfirmMessage, confirmMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuccessMessage() {
		return successMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessMessage(String newSuccessMessage) {
		String oldSuccessMessage = successMessage;
		successMessage = newSuccessMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__SUCCESS_MESSAGE, oldSuccessMessage, successMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureMessage() {
		return failureMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureMessage(String newFailureMessage) {
		String oldFailureMessage = failureMessage;
		failureMessage = newFailureMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__FAILURE_MESSAGE, oldFailureMessage, failureMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__ANCHOR_CLASS, oldAnchorClass, anchorClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__HEADER_CLASS, oldHeaderClass, headerClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.ACTION__FOOTER_CLASS, oldFooterClass, footerClass));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.ACTION__USED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsedBy((ActionContainer)otherEnd, msgs);
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
			case WebuiPackage.ACTION__USED_BY:
				return basicSetUsedBy(null, msgs);
			case WebuiPackage.ACTION__DISPLAY_WHEN:
				return basicSetDisplayWhen(null, msgs);
			case WebuiPackage.ACTION__ENABLE_WHEN:
				return basicSetEnableWhen(null, msgs);
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
			case WebuiPackage.ACTION__USED_BY:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.ACTION_CONTAINER__ACTIONS, ActionContainer.class, msgs);
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
			case WebuiPackage.ACTION__USED_BY:
				return getUsedBy();
			case WebuiPackage.ACTION__ICON_NAME:
				return getIconName();
			case WebuiPackage.ACTION__DISABLE:
				return isDisable();
			case WebuiPackage.ACTION__DISPLAY_WHEN:
				return getDisplayWhen();
			case WebuiPackage.ACTION__ENABLE_WHEN:
				return getEnableWhen();
			case WebuiPackage.ACTION__CONFIRM_MESSAGE:
				return getConfirmMessage();
			case WebuiPackage.ACTION__SUCCESS_MESSAGE:
				return getSuccessMessage();
			case WebuiPackage.ACTION__FAILURE_MESSAGE:
				return getFailureMessage();
			case WebuiPackage.ACTION__ANCHOR_CLASS:
				return getAnchorClass();
			case WebuiPackage.ACTION__HEADER_CLASS:
				return getHeaderClass();
			case WebuiPackage.ACTION__FOOTER_CLASS:
				return getFooterClass();
			case WebuiPackage.ACTION__CONTAINING_TYPES:
				return getContainingTypes();
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
			case WebuiPackage.ACTION__USED_BY:
				setUsedBy((ActionContainer)newValue);
				return;
			case WebuiPackage.ACTION__ICON_NAME:
				setIconName((String)newValue);
				return;
			case WebuiPackage.ACTION__DISABLE:
				setDisable((Boolean)newValue);
				return;
			case WebuiPackage.ACTION__DISPLAY_WHEN:
				setDisplayWhen((Predicate)newValue);
				return;
			case WebuiPackage.ACTION__ENABLE_WHEN:
				setEnableWhen((Predicate)newValue);
				return;
			case WebuiPackage.ACTION__CONFIRM_MESSAGE:
				setConfirmMessage((String)newValue);
				return;
			case WebuiPackage.ACTION__SUCCESS_MESSAGE:
				setSuccessMessage((String)newValue);
				return;
			case WebuiPackage.ACTION__FAILURE_MESSAGE:
				setFailureMessage((String)newValue);
				return;
			case WebuiPackage.ACTION__ANCHOR_CLASS:
				setAnchorClass((String)newValue);
				return;
			case WebuiPackage.ACTION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebuiPackage.ACTION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebuiPackage.ACTION__CONTAINING_TYPES:
				getContainingTypes().clear();
				getContainingTypes().addAll((Collection<? extends Entity>)newValue);
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
			case WebuiPackage.ACTION__USED_BY:
				setUsedBy((ActionContainer)null);
				return;
			case WebuiPackage.ACTION__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.ACTION__DISABLE:
				setDisable(DISABLE_EDEFAULT);
				return;
			case WebuiPackage.ACTION__DISPLAY_WHEN:
				setDisplayWhen((Predicate)null);
				return;
			case WebuiPackage.ACTION__ENABLE_WHEN:
				setEnableWhen((Predicate)null);
				return;
			case WebuiPackage.ACTION__CONFIRM_MESSAGE:
				setConfirmMessage(CONFIRM_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.ACTION__SUCCESS_MESSAGE:
				setSuccessMessage(SUCCESS_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.ACTION__FAILURE_MESSAGE:
				setFailureMessage(FAILURE_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.ACTION__ANCHOR_CLASS:
				setAnchorClass(ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.ACTION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.ACTION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.ACTION__CONTAINING_TYPES:
				getContainingTypes().clear();
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
			case WebuiPackage.ACTION__USED_BY:
				return getUsedBy() != null;
			case WebuiPackage.ACTION__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case WebuiPackage.ACTION__DISABLE:
				return disable != DISABLE_EDEFAULT;
			case WebuiPackage.ACTION__DISPLAY_WHEN:
				return displayWhen != null;
			case WebuiPackage.ACTION__ENABLE_WHEN:
				return enableWhen != null;
			case WebuiPackage.ACTION__CONFIRM_MESSAGE:
				return CONFIRM_MESSAGE_EDEFAULT == null ? confirmMessage != null : !CONFIRM_MESSAGE_EDEFAULT.equals(confirmMessage);
			case WebuiPackage.ACTION__SUCCESS_MESSAGE:
				return SUCCESS_MESSAGE_EDEFAULT == null ? successMessage != null : !SUCCESS_MESSAGE_EDEFAULT.equals(successMessage);
			case WebuiPackage.ACTION__FAILURE_MESSAGE:
				return FAILURE_MESSAGE_EDEFAULT == null ? failureMessage != null : !FAILURE_MESSAGE_EDEFAULT.equals(failureMessage);
			case WebuiPackage.ACTION__ANCHOR_CLASS:
				return ANCHOR_CLASS_EDEFAULT == null ? anchorClass != null : !ANCHOR_CLASS_EDEFAULT.equals(anchorClass);
			case WebuiPackage.ACTION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebuiPackage.ACTION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebuiPackage.ACTION__CONTAINING_TYPES:
				return CONTAINING_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", confirmMessage: ");
		result.append(confirmMessage);
		result.append(", successMessage: ");
		result.append(successMessage);
		result.append(", failureMessage: ");
		result.append(failureMessage);
		result.append(", anchorClass: ");
		result.append(anchorClass);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
