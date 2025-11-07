/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.webui.ContentUnit;
import work.andycarpenter.webgen.pims.webui.EditUnit;
import work.andycarpenter.webgen.pims.webui.Message;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getDisableWhen <em>Disable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getCancelLabelOverride <em>Cancel Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getCancelIconOverride <em>Cancel Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getSaveLabelOverride <em>Save Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getSaveIconOverride <em>Save Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getUnitInputGroupClass <em>Unit Input Group Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EditUnitImpl extends SingletonUnitImpl implements EditUnit {
	/**
	 * The default value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CAPTCHA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected boolean useCaptcha = USE_CAPTCHA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisableWhen() <em>Disable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate disableWhen;

	/**
	 * The cached value of the '{@link #getConfirmDestination() <em>Confirm Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmDestination()
	 * @generated
	 * @ordered
	 */
	protected ContentUnit confirmDestination;

	/**
	 * The cached value of the '{@link #getCancelDestination() <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected ContentUnit cancelDestination;

	/**
	 * The default value of the '{@link #getCancelLabelOverride() <em>Cancel Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_LABEL_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelLabelOverride() <em>Cancel Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected String cancelLabelOverride = CANCEL_LABEL_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelIconOverride() <em>Cancel Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelIconOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_ICON_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelIconOverride() <em>Cancel Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelIconOverride()
	 * @generated
	 * @ordered
	 */
	protected String cancelIconOverride = CANCEL_ICON_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveLabelOverride() <em>Save Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_LABEL_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveLabelOverride() <em>Save Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected String saveLabelOverride = SAVE_LABEL_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveIconOverride() <em>Save Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveIconOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_ICON_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveIconOverride() <em>Save Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveIconOverride()
	 * @generated
	 * @ordered
	 */
	protected String saveIconOverride = SAVE_ICON_OVERRIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfirmMessage() <em>Confirm Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmMessage()
	 * @generated
	 * @ordered
	 */
	protected Message confirmMessage;

	/**
	 * The cached value of the '{@link #getSuccessMessage() <em>Success Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected Message successMessage;

	/**
	 * The default value of the '{@link #getUnitInputGroupClass() <em>Unit Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_INPUT_GROUP_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnitInputGroupClass() <em>Unit Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String unitInputGroupClass = UNIT_INPUT_GROUP_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.EDIT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseCaptcha() {
		return useCaptcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCaptcha(boolean newUseCaptcha) {
		boolean oldUseCaptcha = useCaptcha;
		useCaptcha = newUseCaptcha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__USE_CAPTCHA, oldUseCaptcha, useCaptcha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getDisableWhen() {
		return disableWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableWhen(Predicate newDisableWhen, NotificationChain msgs) {
		Predicate oldDisableWhen = disableWhen;
		disableWhen = newDisableWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__DISABLE_WHEN, oldDisableWhen, newDisableWhen);
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
	public void setDisableWhen(Predicate newDisableWhen) {
		if (newDisableWhen != disableWhen) {
			NotificationChain msgs = null;
			if (disableWhen != null)
				msgs = ((InternalEObject)disableWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__DISABLE_WHEN, null, msgs);
			if (newDisableWhen != null)
				msgs = ((InternalEObject)newDisableWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__DISABLE_WHEN, null, msgs);
			msgs = basicSetDisableWhen(newDisableWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__DISABLE_WHEN, newDisableWhen, newDisableWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit getConfirmDestination() {
		if (confirmDestination != null && confirmDestination.eIsProxy()) {
			InternalEObject oldConfirmDestination = (InternalEObject)confirmDestination;
			confirmDestination = (ContentUnit)eResolveProxy(oldConfirmDestination);
			if (confirmDestination != oldConfirmDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
			}
		}
		return confirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnit basicGetConfirmDestination() {
		return confirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmDestination(ContentUnit newConfirmDestination) {
		ContentUnit oldConfirmDestination = confirmDestination;
		confirmDestination = newConfirmDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION, oldConfirmDestination, confirmDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getConfirmMessage() {
		return confirmMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmMessage(Message newConfirmMessage, NotificationChain msgs) {
		Message oldConfirmMessage = confirmMessage;
		confirmMessage = newConfirmMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE, oldConfirmMessage, newConfirmMessage);
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
	public void setConfirmMessage(Message newConfirmMessage) {
		if (newConfirmMessage != confirmMessage) {
			NotificationChain msgs = null;
			if (confirmMessage != null)
				msgs = ((InternalEObject)confirmMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE, null, msgs);
			if (newConfirmMessage != null)
				msgs = ((InternalEObject)newConfirmMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE, null, msgs);
			msgs = basicSetConfirmMessage(newConfirmMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE, newConfirmMessage, newConfirmMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message getSuccessMessage() {
		return successMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessMessage(Message newSuccessMessage, NotificationChain msgs) {
		Message oldSuccessMessage = successMessage;
		successMessage = newSuccessMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE, oldSuccessMessage, newSuccessMessage);
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
	public void setSuccessMessage(Message newSuccessMessage) {
		if (newSuccessMessage != successMessage) {
			NotificationChain msgs = null;
			if (successMessage != null)
				msgs = ((InternalEObject)successMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE, null, msgs);
			if (newSuccessMessage != null)
				msgs = ((InternalEObject)newSuccessMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE, null, msgs);
			msgs = basicSetSuccessMessage(newSuccessMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE, newSuccessMessage, newSuccessMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentUnit getCancelDestination() {
		if (cancelDestination != null && cancelDestination.eIsProxy()) {
			InternalEObject oldCancelDestination = (InternalEObject)cancelDestination;
			cancelDestination = (ContentUnit)eResolveProxy(oldCancelDestination);
			if (cancelDestination != oldCancelDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
			}
		}
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentUnit basicGetCancelDestination() {
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelDestination(ContentUnit newCancelDestination) {
		ContentUnit oldCancelDestination = cancelDestination;
		cancelDestination = newCancelDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancelLabelOverride() {
		return cancelLabelOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelLabelOverride(String newCancelLabelOverride) {
		String oldCancelLabelOverride = cancelLabelOverride;
		cancelLabelOverride = newCancelLabelOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE, oldCancelLabelOverride, cancelLabelOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancelIconOverride() {
		return cancelIconOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelIconOverride(String newCancelIconOverride) {
		String oldCancelIconOverride = cancelIconOverride;
		cancelIconOverride = newCancelIconOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE, oldCancelIconOverride, cancelIconOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveLabelOverride() {
		return saveLabelOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveLabelOverride(String newSaveLabelOverride) {
		String oldSaveLabelOverride = saveLabelOverride;
		saveLabelOverride = newSaveLabelOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE, oldSaveLabelOverride, saveLabelOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveIconOverride() {
		return saveIconOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveIconOverride(String newSaveIconOverride) {
		String oldSaveIconOverride = saveIconOverride;
		saveIconOverride = newSaveIconOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE, oldSaveIconOverride, saveIconOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitInputGroupClass() {
		return unitInputGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitInputGroupClass(String newUnitInputGroupClass) {
		String oldUnitInputGroupClass = unitInputGroupClass;
		unitInputGroupClass = newUnitInputGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__UNIT_INPUT_GROUP_CLASS, oldUnitInputGroupClass, unitInputGroupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				return basicSetDisableWhen(null, msgs);
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				return basicSetConfirmMessage(null, msgs);
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				return basicSetSuccessMessage(null, msgs);
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
			case WebuiPackage.EDIT_UNIT__USE_CAPTCHA:
				return isUseCaptcha();
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				return getDisableWhen();
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				if (resolve) return getConfirmDestination();
				return basicGetConfirmDestination();
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE:
				return getCancelLabelOverride();
			case WebuiPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE:
				return getCancelIconOverride();
			case WebuiPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE:
				return getSaveLabelOverride();
			case WebuiPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE:
				return getSaveIconOverride();
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				return getConfirmMessage();
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				return getSuccessMessage();
			case WebuiPackage.EDIT_UNIT__UNIT_INPUT_GROUP_CLASS:
				return getUnitInputGroupClass();
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
			case WebuiPackage.EDIT_UNIT__USE_CAPTCHA:
				setUseCaptcha((Boolean)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				setDisableWhen((Predicate)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((ContentUnit)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((ContentUnit)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE:
				setCancelLabelOverride((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE:
				setCancelIconOverride((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE:
				setSaveLabelOverride((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE:
				setSaveIconOverride((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				setConfirmMessage((Message)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				setSuccessMessage((Message)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__UNIT_INPUT_GROUP_CLASS:
				setUnitInputGroupClass((String)newValue);
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
			case WebuiPackage.EDIT_UNIT__USE_CAPTCHA:
				setUseCaptcha(USE_CAPTCHA_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				setDisableWhen((Predicate)null);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((ContentUnit)null);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((ContentUnit)null);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE:
				setCancelLabelOverride(CANCEL_LABEL_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE:
				setCancelIconOverride(CANCEL_ICON_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE:
				setSaveLabelOverride(SAVE_LABEL_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE:
				setSaveIconOverride(SAVE_ICON_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				setConfirmMessage((Message)null);
				return;
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				setSuccessMessage((Message)null);
				return;
			case WebuiPackage.EDIT_UNIT__UNIT_INPUT_GROUP_CLASS:
				setUnitInputGroupClass(UNIT_INPUT_GROUP_CLASS_EDEFAULT);
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
			case WebuiPackage.EDIT_UNIT__USE_CAPTCHA:
				return useCaptcha != USE_CAPTCHA_EDEFAULT;
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				return disableWhen != null;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				return confirmDestination != null;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE:
				return CANCEL_LABEL_OVERRIDE_EDEFAULT == null ? cancelLabelOverride != null : !CANCEL_LABEL_OVERRIDE_EDEFAULT.equals(cancelLabelOverride);
			case WebuiPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE:
				return CANCEL_ICON_OVERRIDE_EDEFAULT == null ? cancelIconOverride != null : !CANCEL_ICON_OVERRIDE_EDEFAULT.equals(cancelIconOverride);
			case WebuiPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE:
				return SAVE_LABEL_OVERRIDE_EDEFAULT == null ? saveLabelOverride != null : !SAVE_LABEL_OVERRIDE_EDEFAULT.equals(saveLabelOverride);
			case WebuiPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE:
				return SAVE_ICON_OVERRIDE_EDEFAULT == null ? saveIconOverride != null : !SAVE_ICON_OVERRIDE_EDEFAULT.equals(saveIconOverride);
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				return confirmMessage != null;
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				return successMessage != null;
			case WebuiPackage.EDIT_UNIT__UNIT_INPUT_GROUP_CLASS:
				return UNIT_INPUT_GROUP_CLASS_EDEFAULT == null ? unitInputGroupClass != null : !UNIT_INPUT_GROUP_CLASS_EDEFAULT.equals(unitInputGroupClass);
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
		result.append(" (useCaptcha: ");
		result.append(useCaptcha);
		result.append(", cancelLabelOverride: ");
		result.append(cancelLabelOverride);
		result.append(", cancelIconOverride: ");
		result.append(cancelIconOverride);
		result.append(", saveLabelOverride: ");
		result.append(saveLabelOverride);
		result.append(", saveIconOverride: ");
		result.append(saveIconOverride);
		result.append(", unitInputGroupClass: ");
		result.append(unitInputGroupClass);
		result.append(')');
		return result.toString();
	}

} //EditUnitImpl
