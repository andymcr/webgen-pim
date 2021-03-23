/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.DynamicUnitStyles;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getFieldListClass <em>Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getDefinitionFieldListClass <em>Definition Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getFieldLabelClass <em>Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getFieldValueClass <em>Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitStylesImpl#getAnchorClass <em>Anchor Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicUnitStylesImpl extends ContentUnitStylesImpl implements DynamicUnitStyles {
	/**
	 * The default value of the '{@link #getFieldListClass() <em>Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_LIST_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFieldListClass() <em>Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected String fieldListClass = FIELD_LIST_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitionFieldListClass() <em>Definition Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_FIELD_LIST_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefinitionFieldListClass() <em>Definition Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected String definitionFieldListClass = DEFINITION_FIELD_LIST_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldLabelClass() <em>Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFieldLabelClass() <em>Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String fieldLabelClass = FIELD_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldValueClass() <em>Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_VALUE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFieldValueClass() <em>Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected String fieldValueClass = FIELD_VALUE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getControlClass() <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlClass()
	 * @generated
	 * @ordered
	 */
	protected String controlClass = CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionNavigationClass() <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAVIGATION_CLASS_EDEFAULT = "";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicUnitStylesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.DYNAMIC_UNIT_STYLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldListClass() {
		return fieldListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldListClass(String newFieldListClass) {
		String oldFieldListClass = fieldListClass;
		fieldListClass = newFieldListClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS, oldFieldListClass, fieldListClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinitionFieldListClass() {
		return definitionFieldListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionFieldListClass(String newDefinitionFieldListClass) {
		String oldDefinitionFieldListClass = definitionFieldListClass;
		definitionFieldListClass = newDefinitionFieldListClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS, oldDefinitionFieldListClass, definitionFieldListClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldLabelClass() {
		return fieldLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldLabelClass(String newFieldLabelClass) {
		String oldFieldLabelClass = fieldLabelClass;
		fieldLabelClass = newFieldLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS, oldFieldLabelClass, fieldLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldValueClass() {
		return fieldValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldValueClass(String newFieldValueClass) {
		String oldFieldValueClass = fieldValueClass;
		fieldValueClass = newFieldValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS, oldFieldValueClass, fieldValueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getControlClass() {
		return controlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlClass(String newControlClass) {
		String oldControlClass = controlClass;
		controlClass = newControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__CONTROL_CLASS, oldControlClass, controlClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS, oldActionNavigationClass, actionNavigationClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT_STYLES__ANCHOR_CLASS, oldAnchorClass, anchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS:
				return getFieldListClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS:
				return getDefinitionFieldListClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS:
				return getFieldLabelClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS:
				return getFieldValueClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__CONTROL_CLASS:
				return getControlClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS:
				return getActionNavigationClass();
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ANCHOR_CLASS:
				return getAnchorClass();
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
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS:
				setFieldListClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS:
				setDefinitionFieldListClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS:
				setFieldLabelClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS:
				setFieldValueClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__CONTROL_CLASS:
				setControlClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ANCHOR_CLASS:
				setAnchorClass((String)newValue);
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
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS:
				setFieldListClass(FIELD_LIST_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS:
				setDefinitionFieldListClass(DEFINITION_FIELD_LIST_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS:
				setFieldLabelClass(FIELD_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS:
				setFieldValueClass(FIELD_VALUE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__CONTROL_CLASS:
				setControlClass(CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass(ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ANCHOR_CLASS:
				setAnchorClass(ANCHOR_CLASS_EDEFAULT);
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
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LIST_CLASS:
				return FIELD_LIST_CLASS_EDEFAULT == null ? fieldListClass != null : !FIELD_LIST_CLASS_EDEFAULT.equals(fieldListClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__DEFINITION_FIELD_LIST_CLASS:
				return DEFINITION_FIELD_LIST_CLASS_EDEFAULT == null ? definitionFieldListClass != null : !DEFINITION_FIELD_LIST_CLASS_EDEFAULT.equals(definitionFieldListClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_LABEL_CLASS:
				return FIELD_LABEL_CLASS_EDEFAULT == null ? fieldLabelClass != null : !FIELD_LABEL_CLASS_EDEFAULT.equals(fieldLabelClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__FIELD_VALUE_CLASS:
				return FIELD_VALUE_CLASS_EDEFAULT == null ? fieldValueClass != null : !FIELD_VALUE_CLASS_EDEFAULT.equals(fieldValueClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__CONTROL_CLASS:
				return CONTROL_CLASS_EDEFAULT == null ? controlClass != null : !CONTROL_CLASS_EDEFAULT.equals(controlClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ACTION_NAVIGATION_CLASS:
				return ACTION_NAVIGATION_CLASS_EDEFAULT == null ? actionNavigationClass != null : !ACTION_NAVIGATION_CLASS_EDEFAULT.equals(actionNavigationClass);
			case WebuiPackage.DYNAMIC_UNIT_STYLES__ANCHOR_CLASS:
				return ANCHOR_CLASS_EDEFAULT == null ? anchorClass != null : !ANCHOR_CLASS_EDEFAULT.equals(anchorClass);
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
		result.append(" (fieldListClass: ");
		result.append(fieldListClass);
		result.append(", definitionFieldListClass: ");
		result.append(definitionFieldListClass);
		result.append(", fieldLabelClass: ");
		result.append(fieldLabelClass);
		result.append(", fieldValueClass: ");
		result.append(fieldValueClass);
		result.append(", controlClass: ");
		result.append(controlClass);
		result.append(", actionNavigationClass: ");
		result.append(actionNavigationClass);
		result.append(", anchorClass: ");
		result.append(anchorClass);
		result.append(')');
		return result.toString();
	}

} //DynamicUnitStylesImpl
