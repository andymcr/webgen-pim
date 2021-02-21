/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.webui.EditUnit;
import work.andycarpenter.webgen.pims.webui.Page;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getDisableWhen <em>Disable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getConfirmDestination <em>Confirm Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getCancelLabel <em>Cancel Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#isCustomiseValues <em>Customise Values</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.EditUnitImpl#getUnitInputGroupClass <em>Unit Input Group Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EditUnitImpl extends SingletonUnitImpl implements EditUnit {
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
	protected Page confirmDestination;

	/**
	 * The default value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String confirmLabel = CONFIRM_LABEL_EDEFAULT;

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
	 * The cached value of the '{@link #getCancelDestination() <em>Cancel Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected Page cancelDestination;

	/**
	 * The default value of the '{@link #getCancelLabel() <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelLabel() <em>Cancel Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelLabel()
	 * @generated
	 * @ordered
	 */
	protected String cancelLabel = CANCEL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomiseValues() <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMISE_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomiseValues() <em>Customise Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseValues()
	 * @generated
	 * @ordered
	 */
	protected boolean customiseValues = CUSTOMISE_VALUES_EDEFAULT;

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
	public Page getConfirmDestination() {
		if (confirmDestination != null && confirmDestination.eIsProxy()) {
			InternalEObject oldConfirmDestination = (InternalEObject)confirmDestination;
			confirmDestination = (Page)eResolveProxy(oldConfirmDestination);
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
	public Page basicGetConfirmDestination() {
		return confirmDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmDestination(Page newConfirmDestination) {
		Page oldConfirmDestination = confirmDestination;
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
	public String getConfirmLabel() {
		return confirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmLabel(String newConfirmLabel) {
		String oldConfirmLabel = confirmLabel;
		confirmLabel = newConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_LABEL, oldConfirmLabel, confirmLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE, oldConfirmMessage, confirmMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE, oldSuccessMessage, successMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getCancelDestination() {
		if (cancelDestination != null && cancelDestination.eIsProxy()) {
			InternalEObject oldCancelDestination = (InternalEObject)cancelDestination;
			cancelDestination = (Page)eResolveProxy(oldCancelDestination);
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
	public Page basicGetCancelDestination() {
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelDestination(Page newCancelDestination) {
		Page oldCancelDestination = cancelDestination;
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
	public String getCancelLabel() {
		return cancelLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelLabel(String newCancelLabel) {
		String oldCancelLabel = cancelLabel;
		cancelLabel = newCancelLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CANCEL_LABEL, oldCancelLabel, cancelLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomiseValues() {
		return customiseValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomiseValues(boolean newCustomiseValues) {
		boolean oldCustomiseValues = customiseValues;
		customiseValues = newCustomiseValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES, oldCustomiseValues, customiseValues));
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
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				return getDisableWhen();
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				if (resolve) return getConfirmDestination();
				return basicGetConfirmDestination();
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				return getConfirmLabel();
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				return getConfirmMessage();
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				return getSuccessMessage();
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				if (resolve) return getCancelDestination();
				return basicGetCancelDestination();
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				return getCancelLabel();
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
				return isCustomiseValues();
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
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				setDisableWhen((Predicate)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				setConfirmMessage((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				setSuccessMessage((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel((String)newValue);
				return;
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
				setCustomiseValues((Boolean)newValue);
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
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				setDisableWhen((Predicate)null);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				setConfirmDestination((Page)null);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				setConfirmLabel(CONFIRM_LABEL_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				setConfirmMessage(CONFIRM_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				setSuccessMessage(SUCCESS_MESSAGE_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				setCancelDestination((Page)null);
				return;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				setCancelLabel(CANCEL_LABEL_EDEFAULT);
				return;
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
				setCustomiseValues(CUSTOMISE_VALUES_EDEFAULT);
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
			case WebuiPackage.EDIT_UNIT__DISABLE_WHEN:
				return disableWhen != null;
			case WebuiPackage.EDIT_UNIT__CONFIRM_DESTINATION:
				return confirmDestination != null;
			case WebuiPackage.EDIT_UNIT__CONFIRM_LABEL:
				return CONFIRM_LABEL_EDEFAULT == null ? confirmLabel != null : !CONFIRM_LABEL_EDEFAULT.equals(confirmLabel);
			case WebuiPackage.EDIT_UNIT__CONFIRM_MESSAGE:
				return CONFIRM_MESSAGE_EDEFAULT == null ? confirmMessage != null : !CONFIRM_MESSAGE_EDEFAULT.equals(confirmMessage);
			case WebuiPackage.EDIT_UNIT__SUCCESS_MESSAGE:
				return SUCCESS_MESSAGE_EDEFAULT == null ? successMessage != null : !SUCCESS_MESSAGE_EDEFAULT.equals(successMessage);
			case WebuiPackage.EDIT_UNIT__CANCEL_DESTINATION:
				return cancelDestination != null;
			case WebuiPackage.EDIT_UNIT__CANCEL_LABEL:
				return CANCEL_LABEL_EDEFAULT == null ? cancelLabel != null : !CANCEL_LABEL_EDEFAULT.equals(cancelLabel);
			case WebuiPackage.EDIT_UNIT__CUSTOMISE_VALUES:
				return customiseValues != CUSTOMISE_VALUES_EDEFAULT;
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
		result.append(" (confirmLabel: ");
		result.append(confirmLabel);
		result.append(", confirmMessage: ");
		result.append(confirmMessage);
		result.append(", successMessage: ");
		result.append(successMessage);
		result.append(", cancelLabel: ");
		result.append(cancelLabel);
		result.append(", customiseValues: ");
		result.append(customiseValues);
		result.append(", unitInputGroupClass: ");
		result.append(unitInputGroupClass);
		result.append(')');
		return result.toString();
	}

} //EditUnitImpl
