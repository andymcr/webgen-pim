/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.FormUnitStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.FormUnitStylesImpl#getInputGroupClass <em>Input Group Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormUnitStylesImpl extends DynamicUnitStylesImpl implements FormUnitStyles {
	/**
	 * The default value of the '{@link #getInputGroupClass() <em>Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_GROUP_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInputGroupClass() <em>Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String inputGroupClass = INPUT_GROUP_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormUnitStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.FORM_UNIT_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputGroupClass() {
		return inputGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputGroupClass(String newInputGroupClass) {
		String oldInputGroupClass = inputGroupClass;
		inputGroupClass = newInputGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.FORM_UNIT_STYLES__INPUT_GROUP_CLASS, oldInputGroupClass, inputGroupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.FORM_UNIT_STYLES__INPUT_GROUP_CLASS:
				return getInputGroupClass();
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
			case WebuiPackage.FORM_UNIT_STYLES__INPUT_GROUP_CLASS:
				setInputGroupClass((String)newValue);
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
			case WebuiPackage.FORM_UNIT_STYLES__INPUT_GROUP_CLASS:
				setInputGroupClass(INPUT_GROUP_CLASS_EDEFAULT);
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
			case WebuiPackage.FORM_UNIT_STYLES__INPUT_GROUP_CLASS:
				return INPUT_GROUP_CLASS_EDEFAULT == null ? inputGroupClass != null : !INPUT_GROUP_CLASS_EDEFAULT.equals(inputGroupClass);
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
		result.append(" (inputGroupClass: ");
		result.append(inputGroupClass);
		result.append(')');
		return result.toString();
	}

} //FormUnitStylesImpl
