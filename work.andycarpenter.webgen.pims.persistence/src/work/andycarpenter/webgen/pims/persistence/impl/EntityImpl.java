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
import work.andycarpenter.webgen.pims.persistence.AssociationWithContainment;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Repository;

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
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getContainingAssociation <em>Containing Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyName <em>Auto Key Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#isImplementsUserInterface <em>Implements User Interface</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl#isImplementsResetPasswordInterface <em>Implements Reset Password Interface</em>}</li>
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
	 * The cached setting delegate for the '{@link #getContainingAssociation() <em>Containing Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__CONTAINING_ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.ENTITY__CONTAINING_TYPE).getSettingDelegate();

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
	protected EList<Feature> unique;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

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
	 * The default value of the '{@link #isImplementsResetPasswordInterface() <em>Implements Reset Password Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsResetPasswordInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTS_RESET_PASSWORD_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplementsResetPasswordInterface() <em>Implements Reset Password Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplementsResetPasswordInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean implementsResetPasswordInterface = IMPLEMENTS_RESET_PASSWORD_INTERFACE_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__SINGLETON_NAME, oldSingletonName, singletonName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)ATTRIBUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Association> getAssociations() {
		return (EList<Association>)ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<Feature> getAllFeatures() {
		return (EList<Feature>)ALL_FEATURES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Association> getAllAssociations() {
		return (EList<Association>)ALL_ASSOCIATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationWithContainment getContainingAssociation() {
		return (AssociationWithContainment)CONTAINING_ASSOCIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationWithContainment basicGetContainingAssociation() {
		return (AssociationWithContainment)CONTAINING_ASSOCIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainingAssociation() {
		return CONTAINING_ASSOCIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainingType() {
		return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<Feature> getUnique() {
		if (unique == null) {
			unique = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.ENTITY__UNIQUE);
		}
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (Repository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.ENTITY__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, PersistencePackage.REPOSITORY__SERVES, Repository.class, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, PersistencePackage.REPOSITORY__SERVES, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getAutoKeyName() {
		return autoKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getAutoKeyPersistentType() {
		return autoKeyPersistentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getAutoKeyGenerationStrategy() {
		return autoKeyGenerationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isImplementsUserInterface() {
		return implementsUserInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public boolean isImplementsResetPasswordInterface() {
		return implementsResetPasswordInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementsResetPasswordInterface(boolean newImplementsResetPasswordInterface) {
		boolean oldImplementsResetPasswordInterface = implementsResetPasswordInterface;
		implementsResetPasswordInterface = newImplementsResetPasswordInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE, oldImplementsResetPasswordInterface, implementsResetPasswordInterface));
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
			case PersistencePackage.ENTITY__REPOSITORY:
				if (repository != null)
					msgs = ((InternalEObject)repository).eInverseRemove(this, PersistencePackage.REPOSITORY__SERVES, Repository.class, msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
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
			case PersistencePackage.ENTITY__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case PersistencePackage.ENTITY__CONTAINING_ASSOCIATION:
				if (resolve) return getContainingAssociation();
				return basicGetContainingAssociation();
			case PersistencePackage.ENTITY__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
			case PersistencePackage.ENTITY__KEYS:
				return getKeys();
			case PersistencePackage.ENTITY__LABELS:
				return getLabels();
			case PersistencePackage.ENTITY__UNIQUE:
				return getUnique();
			case PersistencePackage.ENTITY__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
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
			case PersistencePackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE:
				return isImplementsResetPasswordInterface();
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
				getUnique().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.ENTITY__REPOSITORY:
				setRepository((Repository)newValue);
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
			case PersistencePackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE:
				setImplementsResetPasswordInterface((Boolean)newValue);
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
			case PersistencePackage.ENTITY__REPOSITORY:
				setRepository((Repository)null);
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
			case PersistencePackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE:
				setImplementsResetPasswordInterface(IMPLEMENTS_RESET_PASSWORD_INTERFACE_EDEFAULT);
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
			case PersistencePackage.ENTITY__CONTAINING_ASSOCIATION:
				return isSetContainingAssociation();
			case PersistencePackage.ENTITY__CONTAINING_TYPE:
				return isSetContainingType();
			case PersistencePackage.ENTITY__KEYS:
				return keys != null && !keys.isEmpty();
			case PersistencePackage.ENTITY__LABELS:
				return labels != null && !labels.isEmpty();
			case PersistencePackage.ENTITY__UNIQUE:
				return unique != null && !unique.isEmpty();
			case PersistencePackage.ENTITY__REPOSITORY:
				return repository != null;
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
			case PersistencePackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE:
				return implementsResetPasswordInterface != IMPLEMENTS_RESET_PASSWORD_INTERFACE_EDEFAULT;
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
		result.append(", implementsResetPasswordInterface: ");
		result.append(implementsResetPasswordInterface);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
