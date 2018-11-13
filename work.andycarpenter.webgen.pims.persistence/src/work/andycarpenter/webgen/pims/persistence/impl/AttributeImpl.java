/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import work.andycarpenter.webgen.pims.expression.Expression;

import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#isContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getPersistentType <em>Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getOrmType <em>Orm Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getSlugFields <em>Slug Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl#getInputClass <em>Input Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isContainerUnique() <em>Container Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainerUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainerUnique() <em>Container Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainerUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean containerUnique = CONTAINER_UNIQUE_EDEFAULT;

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
	protected static final String ORM_TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_TYPE_EDEFAULT = null;

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
	 * The cached value of the '{@link #getSlugFields() <em>Slug Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlugFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> slugFields;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValue;

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
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainerUnique() {
		return containerUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerUnique(boolean newContainerUnique) {
		boolean oldContainerUnique = containerUnique;
		containerUnique = newContainerUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__CONTAINER_UNIQUE, oldContainerUnique, containerUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistentType() {
		return persistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentType(String newPersistentType) {
		String oldPersistentType = persistentType;
		persistentType = newPersistentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__PERSISTENT_TYPE, oldPersistentType, persistentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrmType() {
		return ormType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrmType(String newOrmType) {
		String oldOrmType = ormType;
		ormType = newOrmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__ORM_TYPE, oldOrmType, ormType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceType(String newInterfaceType) {
		String oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getSlugFields() {
		if (slugFields == null) {
			slugFields = new EObjectResolvingEList<Attribute>(Attribute.class, this, PersistencePackage.ATTRIBUTE__SLUG_FIELDS);
		}
		return slugFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(Expression newDefaultValue, NotificationChain msgs) {
		Expression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Expression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.ATTRIBUTE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationPattern() {
		return validationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationPattern(String newValidationPattern) {
		String oldValidationPattern = validationPattern;
		validationPattern = newValidationPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ATTRIBUTE__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.ATTRIBUTE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case PersistencePackage.ATTRIBUTE__HIDDEN:
				return isHidden();
			case PersistencePackage.ATTRIBUTE__CONTAINER_UNIQUE:
				return isContainerUnique();
			case PersistencePackage.ATTRIBUTE__PERSISTENT_TYPE:
				return getPersistentType();
			case PersistencePackage.ATTRIBUTE__ORM_TYPE:
				return getOrmType();
			case PersistencePackage.ATTRIBUTE__INTERFACE_TYPE:
				return getInterfaceType();
			case PersistencePackage.ATTRIBUTE__SLUG_FIELDS:
				return getSlugFields();
			case PersistencePackage.ATTRIBUTE__UNIQUE:
				return isUnique();
			case PersistencePackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case PersistencePackage.ATTRIBUTE__VALIDATION_PATTERN:
				return getValidationPattern();
			case PersistencePackage.ATTRIBUTE__INPUT_CLASS:
				return getInputClass();
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
			case PersistencePackage.ATTRIBUTE__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__CONTAINER_UNIQUE:
				setContainerUnique((Boolean)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__PERSISTENT_TYPE:
				setPersistentType((String)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__ORM_TYPE:
				setOrmType((String)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__INTERFACE_TYPE:
				setInterfaceType((String)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__SLUG_FIELDS:
				getSlugFields().clear();
				getSlugFields().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Expression)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__VALIDATION_PATTERN:
				setValidationPattern((String)newValue);
				return;
			case PersistencePackage.ATTRIBUTE__INPUT_CLASS:
				setInputClass((String)newValue);
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
			case PersistencePackage.ATTRIBUTE__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__CONTAINER_UNIQUE:
				setContainerUnique(CONTAINER_UNIQUE_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__PERSISTENT_TYPE:
				setPersistentType(PERSISTENT_TYPE_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__ORM_TYPE:
				setOrmType(ORM_TYPE_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__SLUG_FIELDS:
				getSlugFields().clear();
				return;
			case PersistencePackage.ATTRIBUTE__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((Expression)null);
				return;
			case PersistencePackage.ATTRIBUTE__VALIDATION_PATTERN:
				setValidationPattern(VALIDATION_PATTERN_EDEFAULT);
				return;
			case PersistencePackage.ATTRIBUTE__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
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
			case PersistencePackage.ATTRIBUTE__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
			case PersistencePackage.ATTRIBUTE__CONTAINER_UNIQUE:
				return containerUnique != CONTAINER_UNIQUE_EDEFAULT;
			case PersistencePackage.ATTRIBUTE__PERSISTENT_TYPE:
				return PERSISTENT_TYPE_EDEFAULT == null ? persistentType != null : !PERSISTENT_TYPE_EDEFAULT.equals(persistentType);
			case PersistencePackage.ATTRIBUTE__ORM_TYPE:
				return ORM_TYPE_EDEFAULT == null ? ormType != null : !ORM_TYPE_EDEFAULT.equals(ormType);
			case PersistencePackage.ATTRIBUTE__INTERFACE_TYPE:
				return INTERFACE_TYPE_EDEFAULT == null ? interfaceType != null : !INTERFACE_TYPE_EDEFAULT.equals(interfaceType);
			case PersistencePackage.ATTRIBUTE__SLUG_FIELDS:
				return slugFields != null && !slugFields.isEmpty();
			case PersistencePackage.ATTRIBUTE__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case PersistencePackage.ATTRIBUTE__DEFAULT_VALUE:
				return defaultValue != null;
			case PersistencePackage.ATTRIBUTE__VALIDATION_PATTERN:
				return VALIDATION_PATTERN_EDEFAULT == null ? validationPattern != null : !VALIDATION_PATTERN_EDEFAULT.equals(validationPattern);
			case PersistencePackage.ATTRIBUTE__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
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
		result.append(" (hidden: ");
		result.append(hidden);
		result.append(", containerUnique: ");
		result.append(containerUnique);
		result.append(", persistentType: ");
		result.append(persistentType);
		result.append(", ormType: ");
		result.append(ormType);
		result.append(", interfaceType: ");
		result.append(interfaceType);
		result.append(", unique: ");
		result.append(unique);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
