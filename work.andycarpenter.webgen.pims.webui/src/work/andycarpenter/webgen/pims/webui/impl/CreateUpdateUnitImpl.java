/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.CreateUpdateUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Update Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl#isOnSaveContinueEditing <em>On Save Continue Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl#getCreateUriElement <em>Create Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CreateUpdateUnitImpl#getClearLabel <em>Clear Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateUpdateUnitImpl extends EditUnitImpl implements CreateUpdateUnit {
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
	 * The default value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_URI_ELEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCreateUriElement() <em>Create Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateUriElement()
	 * @generated
	 * @ordered
	 */
	protected String createUriElement = CREATE_URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearLabel() <em>Clear Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabel()
	 * @generated
	 * @ordered
	 */
	protected String clearLabel = CLEAR_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateUpdateUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.CREATE_UPDATE_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING, oldOnSaveContinueEditing, onSaveContinueEditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateUriElement() {
		return createUriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateUriElement(String newCreateUriElement) {
		String oldCreateUriElement = createUriElement;
		createUriElement = newCreateUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT, oldCreateUriElement, createUriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClearLabel() {
		return clearLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearLabel(String newClearLabel) {
		String oldClearLabel = clearLabel;
		clearLabel = newClearLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL, oldClearLabel, clearLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				return isOnSaveContinueEditing();
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return getCreateUriElement();
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return getClearLabel();
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
			case WebuiPackage.CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				setOnSaveContinueEditing((Boolean)newValue);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement((String)newValue);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel((String)newValue);
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
			case WebuiPackage.CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				setOnSaveContinueEditing(ON_SAVE_CONTINUE_EDITING_EDEFAULT);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				setCreateUriElement(CREATE_URI_ELEMENT_EDEFAULT);
				return;
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				setClearLabel(CLEAR_LABEL_EDEFAULT);
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
			case WebuiPackage.CREATE_UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				return onSaveContinueEditing != ON_SAVE_CONTINUE_EDITING_EDEFAULT;
			case WebuiPackage.CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT:
				return CREATE_URI_ELEMENT_EDEFAULT == null ? createUriElement != null : !CREATE_URI_ELEMENT_EDEFAULT.equals(createUriElement);
			case WebuiPackage.CREATE_UPDATE_UNIT__CLEAR_LABEL:
				return CLEAR_LABEL_EDEFAULT == null ? clearLabel != null : !CLEAR_LABEL_EDEFAULT.equals(clearLabel);
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
		result.append(", createUriElement: ");
		result.append(createUriElement);
		result.append(", clearLabel: ");
		result.append(clearLabel);
		result.append(')');
		return result.toString();
	}

} //CreateUpdateUnitImpl
