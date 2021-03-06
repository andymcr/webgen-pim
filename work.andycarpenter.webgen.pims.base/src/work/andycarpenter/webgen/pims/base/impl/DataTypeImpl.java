/**
 */
package work.andycarpenter.webgen.pims.base.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.base.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl#getWafType <em>Waf Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * The default value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistentType() <em>Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentType()
	 * @generated
	 * @ordered
	 */
	protected String persistentType = PERSISTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmType()
	 * @generated
	 * @ordered
	 */
	protected static final String ORM_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getOrmType() <em>Orm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrmType()
	 * @generated
	 * @ordered
	 */
	protected String ormType = ORM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWafType() <em>Waf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWafType()
	 * @generated
	 * @ordered
	 */
	protected static final String WAF_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWafType() <em>Waf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWafType()
	 * @generated
	 * @ordered
	 */
	protected String wafType = WAF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected String interfaceType = INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected String validationPattern = VALIDATION_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersistentType() {
		return persistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistentType(String newPersistentType) {
		String oldPersistentType = persistentType;
		persistentType = newPersistentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATA_TYPE__PERSISTENT_TYPE, oldPersistentType, persistentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrmType() {
		return ormType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrmType(String newOrmType) {
		String oldOrmType = ormType;
		ormType = newOrmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATA_TYPE__ORM_TYPE, oldOrmType, ormType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWafType() {
		return wafType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWafType(String newWafType) {
		String oldWafType = wafType;
		wafType = newWafType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATA_TYPE__WAF_TYPE, oldWafType, wafType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceType(String newInterfaceType) {
		String oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATA_TYPE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationPattern() {
		return validationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationPattern(String newValidationPattern) {
		String oldValidationPattern = validationPattern;
		validationPattern = newValidationPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATA_TYPE__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.DATA_TYPE__PERSISTENT_TYPE:
				return getPersistentType();
			case BasePackage.DATA_TYPE__ORM_TYPE:
				return getOrmType();
			case BasePackage.DATA_TYPE__WAF_TYPE:
				return getWafType();
			case BasePackage.DATA_TYPE__INTERFACE_TYPE:
				return getInterfaceType();
			case BasePackage.DATA_TYPE__VALIDATION_PATTERN:
				return getValidationPattern();
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
			case BasePackage.DATA_TYPE__PERSISTENT_TYPE:
				setPersistentType((String)newValue);
				return;
			case BasePackage.DATA_TYPE__ORM_TYPE:
				setOrmType((String)newValue);
				return;
			case BasePackage.DATA_TYPE__WAF_TYPE:
				setWafType((String)newValue);
				return;
			case BasePackage.DATA_TYPE__INTERFACE_TYPE:
				setInterfaceType((String)newValue);
				return;
			case BasePackage.DATA_TYPE__VALIDATION_PATTERN:
				setValidationPattern((String)newValue);
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
			case BasePackage.DATA_TYPE__PERSISTENT_TYPE:
				setPersistentType(PERSISTENT_TYPE_EDEFAULT);
				return;
			case BasePackage.DATA_TYPE__ORM_TYPE:
				setOrmType(ORM_TYPE_EDEFAULT);
				return;
			case BasePackage.DATA_TYPE__WAF_TYPE:
				setWafType(WAF_TYPE_EDEFAULT);
				return;
			case BasePackage.DATA_TYPE__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case BasePackage.DATA_TYPE__VALIDATION_PATTERN:
				setValidationPattern(VALIDATION_PATTERN_EDEFAULT);
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
			case BasePackage.DATA_TYPE__PERSISTENT_TYPE:
				return PERSISTENT_TYPE_EDEFAULT == null ? persistentType != null : !PERSISTENT_TYPE_EDEFAULT.equals(persistentType);
			case BasePackage.DATA_TYPE__ORM_TYPE:
				return ORM_TYPE_EDEFAULT == null ? ormType != null : !ORM_TYPE_EDEFAULT.equals(ormType);
			case BasePackage.DATA_TYPE__WAF_TYPE:
				return WAF_TYPE_EDEFAULT == null ? wafType != null : !WAF_TYPE_EDEFAULT.equals(wafType);
			case BasePackage.DATA_TYPE__INTERFACE_TYPE:
				return INTERFACE_TYPE_EDEFAULT == null ? interfaceType != null : !INTERFACE_TYPE_EDEFAULT.equals(interfaceType);
			case BasePackage.DATA_TYPE__VALIDATION_PATTERN:
				return VALIDATION_PATTERN_EDEFAULT == null ? validationPattern != null : !VALIDATION_PATTERN_EDEFAULT.equals(validationPattern);
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
		result.append(" (persistentType: ");
		result.append(persistentType);
		result.append(", ormType: ");
		result.append(ormType);
		result.append(", wafType: ");
		result.append(wafType);
		result.append(", interfaceType: ");
		result.append(interfaceType);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
