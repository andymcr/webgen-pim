/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.base.impl.ClassifierImpl;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.EntityFeature;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAssociationEnds <em>Association Ends</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAllFeatures <em>All Features</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAllAssociations <em>All Associations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getContainerUnique <em>Container Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#isImplementsUserInterface <em>Implements User Interface</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ClassifierImpl implements Entity {
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached setting delegate for the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ATTRIBUTES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__ATTRIBUTES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociations() <em>Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__ASSOCIATIONS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAssociationEnds() <em>Association Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associationEnds;

	/**
	 * The cached setting delegate for the '{@link #getAllFeatures() <em>All Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFeatures()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_FEATURES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__ALL_FEATURES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAssociations() <em>All Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_ASSOCIATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__ALL_ASSOCIATIONS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> keys;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLabel> labels;

	/**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityFeature> unique;

	/**
	 * The cached value of the '{@link #getContainerUnique() <em>Container Unique</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerUnique()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityFeature> containerUnique;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoKeyName() <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_NAME_EDEFAULT = "id";

	/**
	 * The cached value of the '{@link #getAutoKeyName() <em>Auto Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyName()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyName = AUTO_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoKeyPersistentType() <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_PERSISTENT_TYPE_EDEFAULT = "integer";

	/**
	 * The cached value of the '{@link #getAutoKeyPersistentType() <em>Auto Key Persistent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyPersistentType()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyPersistentType = AUTO_KEY_PERSISTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoKeyGenerationStrategy() <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_KEY_GENERATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoKeyGenerationStrategy() <em>Auto Key Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoKeyGenerationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String autoKeyGenerationStrategy = AUTO_KEY_GENERATION_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #isImplementsUserInterface() <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsUserInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTS_USER_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplementsUserInterface() <em>Implements User Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsUserInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean implementsUserInterface = IMPLEMENTS_USER_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowFormTypeCustomisation() <em>Allow Form Type Customisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFormTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowFormTypeCustomisation() <em>Allow Form Type Customisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFormTypeCustomisation()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFormTypeCustomisation = ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingletonName() {
		return singletonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonName(String newSingletonName) {
		String oldSingletonName = singletonName;
		singletonName = newSingletonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__SINGLETON_NAME, oldSingletonName, singletonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluralisedName() {
		return pluralisedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralisedName(String newPluralisedName) {
		String oldPluralisedName = pluralisedName;
		pluralisedName = newPluralisedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, PersistencePackage.ENTITY__FEATURES, PersistencePackage.FEATURE__PART_OF);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.ENTITY__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)ATTRIBUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAssociations() {
		return (EList<Association>)ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new EObjectWithInverseResolvingEList<Association>(Association.class, this, PersistencePackage.ENTITY__ASSOCIATION_ENDS, PersistencePackage.ASSOCIATION__TARGET_ENTITY);
		}
		return associationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getAllFeatures() {
		return (EList<Feature>)ALL_FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Association> getAllAssociations() {
		return (EList<Association>)ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentWithInverseEList<ModelLabel>(ModelLabel.class, this, PersistencePackage.ENTITY__LABELS, PersistencePackage.MODEL_LABEL__LABEL_FOR);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityFeature> getUnique() {
		if (unique == null) {
			unique = new EObjectResolvingEList<EntityFeature>(EntityFeature.class, this, PersistencePackage.ENTITY__UNIQUE);
		}
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityFeature> getContainerUnique() {
		if (containerUnique == null) {
			containerUnique = new EObjectResolvingEList<EntityFeature>(EntityFeature.class, this, PersistencePackage.ENTITY__CONTAINER_UNIQUE);
		}
		return containerUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyName() {
		return autoKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyName(String newAutoKeyName) {
		String oldAutoKeyName = autoKeyName;
		autoKeyName = newAutoKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__AUTO_KEY_NAME, oldAutoKeyName, autoKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyPersistentType() {
		return autoKeyPersistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyPersistentType(String newAutoKeyPersistentType) {
		String oldAutoKeyPersistentType = autoKeyPersistentType;
		autoKeyPersistentType = newAutoKeyPersistentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE, oldAutoKeyPersistentType, autoKeyPersistentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoKeyGenerationStrategy() {
		return autoKeyGenerationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyGenerationStrategy(String newAutoKeyGenerationStrategy) {
		String oldAutoKeyGenerationStrategy = autoKeyGenerationStrategy;
		autoKeyGenerationStrategy = newAutoKeyGenerationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY, oldAutoKeyGenerationStrategy, autoKeyGenerationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplementsUserInterface() {
		return implementsUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsUserInterface(boolean newImplementsUserInterface) {
		boolean oldImplementsUserInterface = implementsUserInterface;
		implementsUserInterface = newImplementsUserInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE, oldImplementsUserInterface, implementsUserInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowFormTypeCustomisation() {
		return allowFormTypeCustomisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowFormTypeCustomisation(boolean newAllowFormTypeCustomisation) {
		boolean oldAllowFormTypeCustomisation = allowFormTypeCustomisation;
		allowFormTypeCustomisation = newAllowFormTypeCustomisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION, oldAllowFormTypeCustomisation, allowFormTypeCustomisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.ENTITY__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationEnds()).basicAdd(otherEnd, msgs);
			case PersistencePackage.ENTITY__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
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
			case PersistencePackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				return ((InternalEList<?>)getAssociationEnds()).basicRemove(otherEnd, msgs);
			case PersistencePackage.ENTITY__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.ENTITY__SINGLETON_NAME:
				return getSingletonName();
			case PersistencePackage.ENTITY__PLURALISED_NAME:
				return getPluralisedName();
			case PersistencePackage.ENTITY__FEATURES:
				return getFeatures();
			case PersistencePackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case PersistencePackage.ENTITY__ASSOCIATIONS:
				return getAssociations();
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				return getAssociationEnds();
			case PersistencePackage.ENTITY__ALL_FEATURES:
				return getAllFeatures();
			case PersistencePackage.ENTITY__ALL_ASSOCIATIONS:
				return getAllAssociations();
			case PersistencePackage.ENTITY__KEYS:
				return getKeys();
			case PersistencePackage.ENTITY__LABELS:
				return getLabels();
			case PersistencePackage.ENTITY__UNIQUE:
				return getUnique();
			case PersistencePackage.ENTITY__CONTAINER_UNIQUE:
				return getContainerUnique();
			case PersistencePackage.ENTITY__TABLE_NAME:
				return getTableName();
			case PersistencePackage.ENTITY__AUTO_KEY_NAME:
				return getAutoKeyName();
			case PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
				return getAutoKeyPersistentType();
			case PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
				return getAutoKeyGenerationStrategy();
			case PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
				return isImplementsUserInterface();
			case PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION:
				return isAllowFormTypeCustomisation();
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
			case PersistencePackage.ENTITY__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case PersistencePackage.ENTITY__PLURALISED_NAME:
				setPluralisedName((String)newValue);
				return;
			case PersistencePackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				getAssociationEnds().addAll((Collection<? extends Association>)newValue);
				return;
			case PersistencePackage.ENTITY__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends ModelLabel>)newValue);
				return;
			case PersistencePackage.ENTITY__UNIQUE:
				getUnique().clear();
				getUnique().addAll((Collection<? extends EntityFeature>)newValue);
				return;
			case PersistencePackage.ENTITY__CONTAINER_UNIQUE:
				getContainerUnique().clear();
				getContainerUnique().addAll((Collection<? extends EntityFeature>)newValue);
				return;
			case PersistencePackage.ENTITY__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_NAME:
				setAutoKeyName((String)newValue);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType((String)newValue);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy((String)newValue);
				return;
			case PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
				setImplementsUserInterface((Boolean)newValue);
				return;
			case PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION:
				setAllowFormTypeCustomisation((Boolean)newValue);
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
			case PersistencePackage.ENTITY__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				getAssociationEnds().clear();
				return;
			case PersistencePackage.ENTITY__KEYS:
				getKeys().clear();
				return;
			case PersistencePackage.ENTITY__LABELS:
				getLabels().clear();
				return;
			case PersistencePackage.ENTITY__UNIQUE:
				getUnique().clear();
				return;
			case PersistencePackage.ENTITY__CONTAINER_UNIQUE:
				getContainerUnique().clear();
				return;
			case PersistencePackage.ENTITY__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_NAME:
				setAutoKeyName(AUTO_KEY_NAME_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
				setAutoKeyPersistentType(AUTO_KEY_PERSISTENT_TYPE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
				setAutoKeyGenerationStrategy(AUTO_KEY_GENERATION_STRATEGY_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
				setImplementsUserInterface(IMPLEMENTS_USER_INTERFACE_EDEFAULT);
				return;
			case PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION:
				setAllowFormTypeCustomisation(ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT);
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
			case PersistencePackage.ENTITY__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case PersistencePackage.ENTITY__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
			case PersistencePackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case PersistencePackage.ENTITY__ATTRIBUTES:
				return ATTRIBUTES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY__ASSOCIATIONS:
				return ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY__ASSOCIATION_ENDS:
				return associationEnds != null && !associationEnds.isEmpty();
			case PersistencePackage.ENTITY__ALL_FEATURES:
				return ALL_FEATURES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY__ALL_ASSOCIATIONS:
				return ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PersistencePackage.ENTITY__KEYS:
				return keys != null && !keys.isEmpty();
			case PersistencePackage.ENTITY__LABELS:
				return labels != null && !labels.isEmpty();
			case PersistencePackage.ENTITY__UNIQUE:
				return unique != null && !unique.isEmpty();
			case PersistencePackage.ENTITY__CONTAINER_UNIQUE:
				return containerUnique != null && !containerUnique.isEmpty();
			case PersistencePackage.ENTITY__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case PersistencePackage.ENTITY__AUTO_KEY_NAME:
				return AUTO_KEY_NAME_EDEFAULT == null ? autoKeyName != null : !AUTO_KEY_NAME_EDEFAULT.equals(autoKeyName);
			case PersistencePackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
				return AUTO_KEY_PERSISTENT_TYPE_EDEFAULT == null ? autoKeyPersistentType != null : !AUTO_KEY_PERSISTENT_TYPE_EDEFAULT.equals(autoKeyPersistentType);
			case PersistencePackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
				return AUTO_KEY_GENERATION_STRATEGY_EDEFAULT == null ? autoKeyGenerationStrategy != null : !AUTO_KEY_GENERATION_STRATEGY_EDEFAULT.equals(autoKeyGenerationStrategy);
			case PersistencePackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
				return implementsUserInterface != IMPLEMENTS_USER_INTERFACE_EDEFAULT;
			case PersistencePackage.ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION:
				return allowFormTypeCustomisation != ALLOW_FORM_TYPE_CUSTOMISATION_EDEFAULT;
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
		result.append(" (singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", autoKeyName: ");
		result.append(autoKeyName);
		result.append(", autoKeyPersistentType: ");
		result.append(autoKeyPersistentType);
		result.append(", autoKeyGenerationStrategy: ");
		result.append(autoKeyGenerationStrategy);
		result.append(", implementsUserInterface: ");
		result.append(implementsUserInterface);
		result.append(", allowFormTypeCustomisation: ");
		result.append(allowFormTypeCustomisation);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
