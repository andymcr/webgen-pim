/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.UpdateUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UpdateUnitImpl#isDisplayEmptyForm <em>Display Empty Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateUnitImpl extends EditUnitImpl implements UpdateUnit {
	/**
	 * The default value of the '{@link #isOnSaveContinueEditing() <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_SAVE_CONTINUE_EDITING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnSaveContinueEditing() <em>On Save Continue Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnSaveContinueEditing()
	 * @generated
	 * @ordered
	 */
	protected boolean onSaveContinueEditing = ON_SAVE_CONTINUE_EDITING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayEmptyForm() <em>Display Empty Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayEmptyForm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_EMPTY_FORM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplayEmptyForm() <em>Display Empty Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayEmptyForm()
	 * @generated
	 * @ordered
	 */
	protected boolean displayEmptyForm = DISPLAY_EMPTY_FORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.UPDATE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOnSaveContinueEditing() {
		return onSaveContinueEditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnSaveContinueEditing(boolean newOnSaveContinueEditing) {
		boolean oldOnSaveContinueEditing = onSaveContinueEditing;
		onSaveContinueEditing = newOnSaveContinueEditing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING, oldOnSaveContinueEditing, onSaveContinueEditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayEmptyForm() {
		return displayEmptyForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayEmptyForm(boolean newDisplayEmptyForm) {
		boolean oldDisplayEmptyForm = displayEmptyForm;
		displayEmptyForm = newDisplayEmptyForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UPDATE_UNIT__DISPLAY_EMPTY_FORM, oldDisplayEmptyForm, displayEmptyForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				return isOnSaveContinueEditing();
			case WebuiPackage.UPDATE_UNIT__DISPLAY_EMPTY_FORM:
				return isDisplayEmptyForm();
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
			case WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				setOnSaveContinueEditing((Boolean)newValue);
				return;
			case WebuiPackage.UPDATE_UNIT__DISPLAY_EMPTY_FORM:
				setDisplayEmptyForm((Boolean)newValue);
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
			case WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				setOnSaveContinueEditing(ON_SAVE_CONTINUE_EDITING_EDEFAULT);
				return;
			case WebuiPackage.UPDATE_UNIT__DISPLAY_EMPTY_FORM:
				setDisplayEmptyForm(DISPLAY_EMPTY_FORM_EDEFAULT);
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
			case WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				return onSaveContinueEditing != ON_SAVE_CONTINUE_EDITING_EDEFAULT;
			case WebuiPackage.UPDATE_UNIT__DISPLAY_EMPTY_FORM:
				return displayEmptyForm != DISPLAY_EMPTY_FORM_EDEFAULT;
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
		result.append(" (onSaveContinueEditing: ");
		result.append(onSaveContinueEditing);
		result.append(", displayEmptyForm: ");
		result.append(displayEmptyForm);
		result.append(')');
		return result.toString();
	}

} //UpdateUnitImpl
