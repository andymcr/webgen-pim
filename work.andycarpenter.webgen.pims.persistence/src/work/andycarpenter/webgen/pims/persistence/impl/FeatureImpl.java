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
import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;
import work.andycarpenter.webgen.pims.persistence.Cardinality;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.SerializationGroup;
import work.andycarpenter.webgen.pims.persistence.isHasChoices;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isCustomiseSet <em>Customise Set</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getEmptyDisplayValue <em>Empty Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#isEncodeUriKey <em>Encode Uri Key</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl#getSerializationGroups <em>Serialization Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends NamedDisplayElementImpl implements Feature {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCustomiseSet() <em>Customise Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOMISE_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCustomiseSet() <em>Customise Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomiseSet()
	 * @generated
	 * @ordered
	 */
	protected boolean customiseSet = CUSTOMISE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooleanIsHasChoice() <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 * @ordered
	 */
	protected static final isHasChoices BOOLEAN_IS_HAS_CHOICE_EDEFAULT = isHasChoices.IS_A;

	/**
	 * The cached value of the '{@link #getBooleanIsHasChoice() <em>Boolean Is Has Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanIsHasChoice()
	 * @generated
	 * @ordered
	 */
	protected isHasChoices booleanIsHasChoice = BOOLEAN_IS_HAS_CHOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionOrmAllowAdd() <em>Collection Orm Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ORM_ALLOW_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionOrmAllowAdd() <em>Collection Orm Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionOrmAllowAdd = COLLECTION_ORM_ALLOW_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionOrmAllowRemove() <em>Collection Orm Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionOrmAllowRemove() <em>Collection Orm Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionOrmAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionOrmAllowRemove = COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDisplayValue() <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DISPLAY_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultDisplayValue() <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultDisplayValue = DEFAULT_DISPLAY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmptyDisplayValue() <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_DISPLAY_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEmptyDisplayValue() <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String emptyDisplayValue = EMPTY_DISPLAY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCODE_URI_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncodeUriKey() <em>Encode Uri Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncodeUriKey()
	 * @generated
	 * @ordered
	 */
	protected boolean encodeUriKey = ENCODE_URI_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLETON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected String singletonName = SINGLETON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLURALISED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected String pluralisedName = PLURALISED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerializationGroups() <em>Serialization Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializationGroup> serializationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getPartOf() {
		if (eContainerFeatureID() != PersistencePackage.FEATURE__PART_OF) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(Entity newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, PersistencePackage.FEATURE__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOf(Entity newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.FEATURE__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, PersistencePackage.ENTITY__FEATURES, Entity.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomiseSet() {
		return customiseSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomiseSet(boolean newCustomiseSet) {
		boolean oldCustomiseSet = customiseSet;
		customiseSet = newCustomiseSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__CUSTOMISE_SET, oldCustomiseSet, customiseSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public isHasChoices getBooleanIsHasChoice() {
		return booleanIsHasChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanIsHasChoice(isHasChoices newBooleanIsHasChoice) {
		isHasChoices oldBooleanIsHasChoice = booleanIsHasChoice;
		booleanIsHasChoice = newBooleanIsHasChoice == null ? BOOLEAN_IS_HAS_CHOICE_EDEFAULT : newBooleanIsHasChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE, oldBooleanIsHasChoice, booleanIsHasChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollectionOrmAllowAdd() {
		return collectionOrmAllowAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionOrmAllowAdd(boolean newCollectionOrmAllowAdd) {
		boolean oldCollectionOrmAllowAdd = collectionOrmAllowAdd;
		collectionOrmAllowAdd = newCollectionOrmAllowAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD, oldCollectionOrmAllowAdd, collectionOrmAllowAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollectionOrmAllowRemove() {
		return collectionOrmAllowRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionOrmAllowRemove(boolean newCollectionOrmAllowRemove) {
		boolean oldCollectionOrmAllowRemove = collectionOrmAllowRemove;
		collectionOrmAllowRemove = newCollectionOrmAllowRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE, oldCollectionOrmAllowRemove, collectionOrmAllowRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDisplayValue() {
		return defaultDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDisplayValue(String newDefaultDisplayValue) {
		String oldDefaultDisplayValue = defaultDisplayValue;
		defaultDisplayValue = newDefaultDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE, oldDefaultDisplayValue, defaultDisplayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmptyDisplayValue() {
		return emptyDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyDisplayValue(String newEmptyDisplayValue) {
		String oldEmptyDisplayValue = emptyDisplayValue;
		emptyDisplayValue = newEmptyDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE, oldEmptyDisplayValue, emptyDisplayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEncodeUriKey() {
		return encodeUriKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncodeUriKey(boolean newEncodeUriKey) {
		boolean oldEncodeUriKey = encodeUriKey;
		encodeUriKey = newEncodeUriKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__ENCODE_URI_KEY, oldEncodeUriKey, encodeUriKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSingletonName() {
		return singletonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingletonName(String newSingletonName) {
		String oldSingletonName = singletonName;
		singletonName = newSingletonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__SINGLETON_NAME, oldSingletonName, singletonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPluralisedName() {
		return pluralisedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPluralisedName(String newPluralisedName) {
		String oldPluralisedName = pluralisedName;
		pluralisedName = newPluralisedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SerializationGroup> getSerializationGroups() {
		if (serializationGroups == null) {
			serializationGroups = new EObjectResolvingEList<SerializationGroup>(SerializationGroup.class, this, PersistencePackage.FEATURE__SERIALIZATION_GROUPS);
		}
		return serializationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.FEATURE__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((Entity)otherEnd, msgs);
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
			case PersistencePackage.FEATURE__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case PersistencePackage.FEATURE__PART_OF:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.ENTITY__FEATURES, Entity.class, msgs);
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
			case PersistencePackage.FEATURE__PART_OF:
				return getPartOf();
			case PersistencePackage.FEATURE__CARDINALITY:
				return getCardinality();
			case PersistencePackage.FEATURE__ORDERED:
				return isOrdered();
			case PersistencePackage.FEATURE__PRIMARY_KEY:
				return isPrimaryKey();
			case PersistencePackage.FEATURE__DERIVED:
				return isDerived();
			case PersistencePackage.FEATURE__CUSTOMISE_SET:
				return isCustomiseSet();
			case PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return getBooleanIsHasChoice();
			case PersistencePackage.FEATURE__TITLE:
				return getTitle();
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return isCollectionOrmAllowAdd();
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return isCollectionOrmAllowRemove();
			case PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE:
				return getDefaultDisplayValue();
			case PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE:
				return getEmptyDisplayValue();
			case PersistencePackage.FEATURE__ENCODE_URI_KEY:
				return isEncodeUriKey();
			case PersistencePackage.FEATURE__SINGLETON_NAME:
				return getSingletonName();
			case PersistencePackage.FEATURE__PLURALISED_NAME:
				return getPluralisedName();
			case PersistencePackage.FEATURE__COLUMN_NAME:
				return getColumnName();
			case PersistencePackage.FEATURE__SERIALIZATION_GROUPS:
				return getSerializationGroups();
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
			case PersistencePackage.FEATURE__PART_OF:
				setPartOf((Entity)newValue);
				return;
			case PersistencePackage.FEATURE__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case PersistencePackage.FEATURE__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__CUSTOMISE_SET:
				setCustomiseSet((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice((isHasChoices)newValue);
				return;
			case PersistencePackage.FEATURE__TITLE:
				setTitle((String)newValue);
				return;
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue((String)newValue);
				return;
			case PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE:
				setEmptyDisplayValue((String)newValue);
				return;
			case PersistencePackage.FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey((Boolean)newValue);
				return;
			case PersistencePackage.FEATURE__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case PersistencePackage.FEATURE__PLURALISED_NAME:
				setPluralisedName((String)newValue);
				return;
			case PersistencePackage.FEATURE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case PersistencePackage.FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
				getSerializationGroups().addAll((Collection<? extends SerializationGroup>)newValue);
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
			case PersistencePackage.FEATURE__PART_OF:
				setPartOf((Entity)null);
				return;
			case PersistencePackage.FEATURE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__CUSTOMISE_SET:
				setCustomiseSet(CUSTOMISE_SET_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
				setBooleanIsHasChoice(BOOLEAN_IS_HAS_CHOICE_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
				setCollectionOrmAllowAdd(COLLECTION_ORM_ALLOW_ADD_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				setCollectionOrmAllowRemove(COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue(DEFAULT_DISPLAY_VALUE_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE:
				setEmptyDisplayValue(EMPTY_DISPLAY_VALUE_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__ENCODE_URI_KEY:
				setEncodeUriKey(ENCODE_URI_KEY_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case PersistencePackage.FEATURE__SERIALIZATION_GROUPS:
				getSerializationGroups().clear();
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
			case PersistencePackage.FEATURE__PART_OF:
				return getPartOf() != null;
			case PersistencePackage.FEATURE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case PersistencePackage.FEATURE__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case PersistencePackage.FEATURE__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case PersistencePackage.FEATURE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case PersistencePackage.FEATURE__CUSTOMISE_SET:
				return customiseSet != CUSTOMISE_SET_EDEFAULT;
			case PersistencePackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
				return booleanIsHasChoice != BOOLEAN_IS_HAS_CHOICE_EDEFAULT;
			case PersistencePackage.FEATURE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
				return collectionOrmAllowAdd != COLLECTION_ORM_ALLOW_ADD_EDEFAULT;
			case PersistencePackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
				return collectionOrmAllowRemove != COLLECTION_ORM_ALLOW_REMOVE_EDEFAULT;
			case PersistencePackage.FEATURE__DEFAULT_DISPLAY_VALUE:
				return DEFAULT_DISPLAY_VALUE_EDEFAULT == null ? defaultDisplayValue != null : !DEFAULT_DISPLAY_VALUE_EDEFAULT.equals(defaultDisplayValue);
			case PersistencePackage.FEATURE__EMPTY_DISPLAY_VALUE:
				return EMPTY_DISPLAY_VALUE_EDEFAULT == null ? emptyDisplayValue != null : !EMPTY_DISPLAY_VALUE_EDEFAULT.equals(emptyDisplayValue);
			case PersistencePackage.FEATURE__ENCODE_URI_KEY:
				return encodeUriKey != ENCODE_URI_KEY_EDEFAULT;
			case PersistencePackage.FEATURE__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case PersistencePackage.FEATURE__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
			case PersistencePackage.FEATURE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case PersistencePackage.FEATURE__SERIALIZATION_GROUPS:
				return serializationGroups != null && !serializationGroups.isEmpty();
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", derived: ");
		result.append(derived);
		result.append(", customiseSet: ");
		result.append(customiseSet);
		result.append(", booleanIsHasChoice: ");
		result.append(booleanIsHasChoice);
		result.append(", title: ");
		result.append(title);
		result.append(", collectionOrmAllowAdd: ");
		result.append(collectionOrmAllowAdd);
		result.append(", collectionOrmAllowRemove: ");
		result.append(collectionOrmAllowRemove);
		result.append(", defaultDisplayValue: ");
		result.append(defaultDisplayValue);
		result.append(", emptyDisplayValue: ");
		result.append(emptyDisplayValue);
		result.append(", encodeUriKey: ");
		result.append(encodeUriKey);
		result.append(", singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
