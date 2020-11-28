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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.UPDATE_UNIT__ON_SAVE_CONTINUE_EDITING:
				return isOnSaveContinueEditing();
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
		result.append(')');
		return result.toString();
	}

} //UpdateUnitImpl
