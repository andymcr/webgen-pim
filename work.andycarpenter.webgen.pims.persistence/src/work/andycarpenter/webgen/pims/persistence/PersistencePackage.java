/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.persistence.PersistenceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/pim/persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen_persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PersistenceImpl <em>Persistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistenceImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPersistence()
	 * @generated
	 */
	int PERSISTENCE = 0;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__SERIALIZATION_GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATA_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__REPOSITORIES = 3;

	/**
	 * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__ORM_TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Database Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_TECHNOLOGY = 5;

	/**
	 * The feature id for the '<em><b>Timestamp Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_CREATION = 6;

	/**
	 * The feature id for the '<em><b>Timestamp Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_UPDATES = 7;

	/**
	 * The number of structural features of the '<em>Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SerializationGroupImpl <em>Serialization Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SerializationGroupImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSerializationGroup()
	 * @generated
	 */
	int SERIALIZATION_GROUP = 2;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.Label <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.Label
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 37;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl <em>Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabel()
	 * @generated
	 */
	int MODEL_LABEL = 38;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature <em>Model Label Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelFeature
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelFeature()
	 * @generated
	 */
	int MODEL_LABEL_FEATURE = 39;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl <em>Model Label Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAttribute()
	 * @generated
	 */
	int MODEL_LABEL_ATTRIBUTE = 41;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl <em>Model Label Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAssociation()
	 * @generated
	 */
	int MODEL_LABEL_ASSOCIATION = 40;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.EntityImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = BasePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISPLAY_LABEL = BasePackage.CLASSIFIER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SINGLETON_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PLURALISED_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = BasePackage.CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = BasePackage.CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATIONS = BasePackage.CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Association Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATION_ENDS = BasePackage.CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALL_FEATURES = BasePackage.CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Associations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALL_ASSOCIATIONS = BasePackage.CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containing Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTAINING_ASSOCIATION = BasePackage.CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTAINING_TYPE = BasePackage.CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEYS = BasePackage.CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABELS = BasePackage.CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UNIQUE = BasePackage.CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = BasePackage.CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_PERSISTENT_TYPE = BasePackage.CLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_GENERATION_STRATEGY = BasePackage.CLASSIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Implements User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPLEMENTS_USER_INTERFACE = BasePackage.CLASSIFIER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Implements Reset Password Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE = BasePackage.CLASSIFIER_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = BasePackage.CLASSIFIER_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = BasePackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Serialization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serialization Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_GROUP_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PART_OF = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CARDINALITY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ORDERED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PRIMARY_KEY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DERIVED = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CUSTOMISE_SET = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BOOLEAN_IS_HAS_CHOICE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TITLE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLLECTION_ORM_ALLOW_ADD = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLLECTION_ORM_ALLOW_REMOVE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEFAULT_DISPLAY_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EMPTY_DISPLAY_VALUE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ENCODE_URI_KEY = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SINGLETON_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PLURALISED_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLUMN_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SERIALIZATION_GROUPS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DISPLAY_LABEL = FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PART_OF = FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CARDINALITY = FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ORDERED = FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRIMARY_KEY = FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DERIVED = FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CUSTOMISE_SET = FEATURE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = FEATURE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = FEATURE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_DISPLAY_VALUE = FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EMPTY_DISPLAY_VALUE = FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SINGLETON_NAME = FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PLURALISED_NAME = FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLUMN_NAME = FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HIDDEN = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINER_UNIQUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SLUG_FIELDS = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIQUE = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PLACEHOLDER = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALIDATION_PATTERN = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DISPLAY_LABEL = FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PART_OF = FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CARDINALITY = FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ORDERED = FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PRIMARY_KEY = FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DERIVED = FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CUSTOMISE_SET = FEATURE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BOOLEAN_IS_HAS_CHOICE = FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COLLECTION_ORM_ALLOW_ADD = FEATURE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE = FEATURE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DEFAULT_DISPLAY_VALUE = FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EMPTY_DISPLAY_VALUE = FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SINGLETON_NAME = FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PLURALISED_NAME = FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COLUMN_NAME = FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__KEYS = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_ENTITY = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__BIDIRECTIONAL = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UNIQUE = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PIVOT_TABLE_NAME = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_FEATURE_NAME = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_PRIMARY_KEY = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_COLUMN_NAME = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_DISPLAY_LABEL = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SERIALIZATION_MAX_DEPTH = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDataTypeAttribute()
	 * @generated
	 */
	int DATA_TYPE_ATTRIBUTE = 15;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateAttribute()
	 * @generated
	 */
	int DATE_ATTRIBUTE = 16;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl <em>Url Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getUrlAttribute()
	 * @generated
	 */
	int URL_ATTRIBUTE = 17;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl <em>Resource Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceFeature()
	 * @generated
	 */
	int RESOURCE_FEATURE = 18;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DirectoryNamerImpl <em>Directory Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DirectoryNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDirectoryNamer()
	 * @generated
	 */
	int DIRECTORY_NAMER = 19;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl <em>Sub Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSubDirectory()
	 * @generated
	 */
	int SUB_DIRECTORY = 20;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PropertyDirectoryImpl <em>Property Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PropertyDirectoryImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPropertyDirectory()
	 * @generated
	 */
	int PROPERTY_DIRECTORY = 21;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DateTimeDirectoryImpl <em>Date Time Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DateTimeDirectoryImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateTimeDirectory()
	 * @generated
	 */
	int DATE_TIME_DIRECTORY = 22;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileNamerImpl <em>File Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FileNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileNamer()
	 * @generated
	 */
	int FILE_NAMER = 23;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.UniqueIdNamerImpl <em>Unique Id Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.UniqueIdNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getUniqueIdNamer()
	 * @generated
	 */
	int UNIQUE_ID_NAMER = 24;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.OriginalNamerImpl <em>Original Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.OriginalNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOriginalNamer()
	 * @generated
	 */
	int ORIGINAL_NAMER = 25;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PropertyNamerImpl <em>Property Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PropertyNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPropertyNamer()
	 * @generated
	 */
	int PROPERTY_NAMER = 26;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.HashNamerImpl <em>Hash Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.HashNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getHashNamer()
	 * @generated
	 */
	int HASH_NAMER = 27;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.Base64NamerImpl <em>Base64 Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.Base64NamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getBase64Namer()
	 * @generated
	 */
	int BASE64_NAMER = 28;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SmartUniqueNamerImpl <em>Smart Unique Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SmartUniqueNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSmartUniqueNamer()
	 * @generated
	 */
	int SMART_UNIQUE_NAMER = 29;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SlugNamerImpl <em>Slug Namer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SlugNamerImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSlugNamer()
	 * @generated
	 */
	int SLUG_NAMER = 30;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileResourceImpl <em>File Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FileResourceImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileResource()
	 * @generated
	 */
	int FILE_RESOURCE = 31;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ImageResourceImpl <em>Image Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ImageResourceImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getImageResource()
	 * @generated
	 */
	int IMAGE_RESOURCE = 32;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl <em>Location Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLocationAttribute()
	 * @generated
	 */
	int LOCATION_ATTRIBUTE = 33;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl <em>Association Without Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithoutContainment()
	 * @generated
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT = 34;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl <em>Association With Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithContainment()
	 * @generated
	 */
	int ASSOCIATION_WITH_CONTAINMENT = 35;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl <em>Association Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationKey()
	 * @generated
	 */
	int ASSOCIATION_KEY = 36;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PathImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___CONTEXT_ENTITY = 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___NAME = 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathRootImpl <em>Path Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PathRootImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPathRoot()
	 * @generated
	 */
	int PATH_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT__NAME = PATH__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT__CHILD_FEATURE = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT_FEATURE_COUNT = PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT___CONTEXT_ENTITY = PATH___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT___NAME = PATH___NAME;

	/**
	 * The number of operations of the '<em>Path Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ROOT_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl <em>Association Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationPathElement()
	 * @generated
	 */
	int ASSOCIATION_PATH_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__NAME = PATH_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__CHILD_FEATURE = PATH_ROOT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__ASSOCIATION = PATH_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY = PATH_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE = PATH_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET = PATH_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT = PATH_ROOT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT___CONTEXT_ENTITY = PATH_ROOT___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT___NAME = PATH_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Source Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION = PATH_ROOT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Leaf Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY = PATH_ROOT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT = PATH_ROOT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributePathElementImpl <em>Attribute Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributePathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttributePathElement()
	 * @generated
	 */
	int ATTRIBUTE_PATH_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT__NAME = PATH__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT = PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT___CONTEXT_ENTITY = PATH___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT___NAME = PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT = PATH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourcePathElementImpl <em>Resource Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourcePathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourcePathElement()
	 * @generated
	 */
	int RESOURCE_PATH_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT__NAME = PATH__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT__RESOURCE = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT_FEATURE_COUNT = PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT___CONTEXT_ENTITY = PATH___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT___NAME = PATH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PATH_ELEMENT_OPERATION_COUNT = PATH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature <em>Child Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.ChildFeature
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildFeature()
	 * @generated
	 */
	int CHILD_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE__NAME = PATH__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE__PARENT = PATH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_FEATURE_COUNT = PATH_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE___CONTEXT_ENTITY = PATH___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE___NAME = PATH___NAME;

	/**
	 * The number of operations of the '<em>Child Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_OPERATION_COUNT = PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildAssociationImpl <em>Child Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildAssociationImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildAssociation()
	 * @generated
	 */
	int CHILD_ASSOCIATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__NAME = ASSOCIATION_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__CHILD_FEATURE = ASSOCIATION_PATH_ELEMENT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__ASSOCIATION = ASSOCIATION_PATH_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__VALUE_DISPLAY = ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__ASSOCIATION_SOURCE = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__ASSOCIATION_TARGET = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION__PARENT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION___NAME = ASSOCIATION_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Is Source Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION___IS_SOURCE_ASSOCIATION = ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION;

	/**
	 * The operation id for the '<em>Leaf Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION___LEAF_ENTITY = ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION___CONTEXT_ENTITY = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Child Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildAttributeImpl <em>Child Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildAttribute()
	 * @generated
	 */
	int CHILD_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE__NAME = ATTRIBUTE_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE__ATTRIBUTE = ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE__PARENT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE___NAME = ATTRIBUTE_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE___CONTEXT_ENTITY = ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Child Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildResourceImpl <em>Child Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildResourceImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildResource()
	 * @generated
	 */
	int CHILD_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE__NAME = RESOURCE_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE__RESOURCE = RESOURCE_PATH_ELEMENT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE__PARENT = RESOURCE_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE_FEATURE_COUNT = RESOURCE_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE___NAME = RESOURCE_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE___CONTEXT_ENTITY = RESOURCE_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Child Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RESOURCE_OPERATION_COUNT = RESOURCE_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PART_OF = ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CARDINALITY = ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ORDERED = ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DERIVED = ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CUSTOMISE_SET = ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__EMPTY_DISPLAY_VALUE = ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ENCODE_URI_KEY = ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SINGLETON_NAME = ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PLURALISED_NAME = ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SERIALIZATION_GROUPS = ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__HIDDEN = ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CONTAINER_UNIQUE = ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__SLUG_FIELDS = ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__UNIQUE = ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PLACEHOLDER = ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__VALIDATION_PATTERN = ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DATA_TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ENCRYPT = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PART_OF = ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__CARDINALITY = ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ORDERED = ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DERIVED = ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__CUSTOMISE_SET = ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__EMPTY_DISPLAY_VALUE = ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ENCODE_URI_KEY = ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SINGLETON_NAME = ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PLURALISED_NAME = ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SERIALIZATION_GROUPS = ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__HIDDEN = ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__CONTAINER_UNIQUE = ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__SLUG_FIELDS = ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__UNIQUE = ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PLACEHOLDER = ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__VALIDATION_PATTERN = ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DETAILS = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__FORMAT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PART_OF = ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__CARDINALITY = ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ORDERED = ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DERIVED = ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__CUSTOMISE_SET = ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__EMPTY_DISPLAY_VALUE = ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ENCODE_URI_KEY = ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SINGLETON_NAME = ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PLURALISED_NAME = ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SERIALIZATION_GROUPS = ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__HIDDEN = ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__CONTAINER_UNIQUE = ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__SLUG_FIELDS = ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__UNIQUE = ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PLACEHOLDER = ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__VALIDATION_PATTERN = ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__DISPLAY_LABEL = FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__PART_OF = FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__CARDINALITY = FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__ORDERED = FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__PRIMARY_KEY = FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__DERIVED = FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__CUSTOMISE_SET = FEATURE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__BOOLEAN_IS_HAS_CHOICE = FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__TITLE = FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_ADD = FEATURE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_REMOVE = FEATURE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__DEFAULT_DISPLAY_VALUE = FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__EMPTY_DISPLAY_VALUE = FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__ENCODE_URI_KEY = FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__SINGLETON_NAME = FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__PLURALISED_NAME = FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__COLUMN_NAME = FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__SERIALIZATION_GROUPS = FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__URI_PREFIX = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Directory Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__DIRECTORY_NAMER = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>File Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE__FILE_NAMER = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Resource Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_NAMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Directory Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_NAMER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Characters Per Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY = DIRECTORY_NAMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directory Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DIRECTORY__DIRECTORY_COUNT = DIRECTORY_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DIRECTORY_FEATURE_COUNT = DIRECTORY_NAMER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_DIRECTORY_OPERATION_COUNT = DIRECTORY_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DIRECTORY__ATTRIBTE = DIRECTORY_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DIRECTORY_FEATURE_COUNT = DIRECTORY_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DIRECTORY_OPERATION_COUNT = DIRECTORY_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DIRECTORY__FORMAT = DIRECTORY_NAMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DIRECTORY__ATTRIBUTE = DIRECTORY_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date Time Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DIRECTORY_FEATURE_COUNT = DIRECTORY_NAMER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date Time Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_DIRECTORY_OPERATION_COUNT = DIRECTORY_NAMER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>File Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAMER_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Unique Id Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ID_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique Id Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_ID_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Original Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Original Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINAL_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMER__ATTRIBUTE = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_NAMER__ALGORITHM = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_NAMER__LENGTH = FILE_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hash Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hash Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_NAMER__LENGTH = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base64 Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base64 Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Smart Unique Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_UNIQUE_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smart Unique Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_UNIQUE_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Slug Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLUG_NAMER_FEATURE_COUNT = FILE_NAMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slug Namer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLUG_NAMER_OPERATION_COUNT = FILE_NAMER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__NAME = RESOURCE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__DISPLAY_LABEL = RESOURCE_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__PART_OF = RESOURCE_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__CARDINALITY = RESOURCE_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__ORDERED = RESOURCE_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__PRIMARY_KEY = RESOURCE_FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__DERIVED = RESOURCE_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__CUSTOMISE_SET = RESOURCE_FEATURE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__TITLE = RESOURCE_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__COLLECTION_ORM_ALLOW_ADD = RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__COLLECTION_ORM_ALLOW_REMOVE = RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__DEFAULT_DISPLAY_VALUE = RESOURCE_FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__EMPTY_DISPLAY_VALUE = RESOURCE_FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__ENCODE_URI_KEY = RESOURCE_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__SINGLETON_NAME = RESOURCE_FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__PLURALISED_NAME = RESOURCE_FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__COLUMN_NAME = RESOURCE_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__SERIALIZATION_GROUPS = RESOURCE_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__MAXIMUM_UPLOAD_SIZE = RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__VALID_UPLOAD_MIME_TYPES = RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__VALID_UPLOAD_EXTENSIONS = RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uri Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__URI_PREFIX = RESOURCE_FEATURE__URI_PREFIX;

	/**
	 * The feature id for the '<em><b>Base Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__BASE_UPLOAD_DIRECTORY = RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Directory Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__DIRECTORY_NAMER = RESOURCE_FEATURE__DIRECTORY_NAMER;

	/**
	 * The feature id for the '<em><b>File Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__FILE_NAMER = RESOURCE_FEATURE__FILE_NAMER;

	/**
	 * The number of structural features of the '<em>File Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE_OPERATION_COUNT = RESOURCE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__NAME = RESOURCE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__DISPLAY_LABEL = RESOURCE_FEATURE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__PART_OF = RESOURCE_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__CARDINALITY = RESOURCE_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__ORDERED = RESOURCE_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__PRIMARY_KEY = RESOURCE_FEATURE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__DERIVED = RESOURCE_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__CUSTOMISE_SET = RESOURCE_FEATURE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_FEATURE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__TITLE = RESOURCE_FEATURE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__COLLECTION_ORM_ALLOW_ADD = RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__COLLECTION_ORM_ALLOW_REMOVE = RESOURCE_FEATURE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__DEFAULT_DISPLAY_VALUE = RESOURCE_FEATURE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__EMPTY_DISPLAY_VALUE = RESOURCE_FEATURE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__ENCODE_URI_KEY = RESOURCE_FEATURE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__SINGLETON_NAME = RESOURCE_FEATURE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__PLURALISED_NAME = RESOURCE_FEATURE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__COLUMN_NAME = RESOURCE_FEATURE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__SERIALIZATION_GROUPS = RESOURCE_FEATURE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__MAXIMUM_UPLOAD_SIZE = RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__VALID_UPLOAD_MIME_TYPES = RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__VALID_UPLOAD_EXTENSIONS = RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uri Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__URI_PREFIX = RESOURCE_FEATURE__URI_PREFIX;

	/**
	 * The feature id for the '<em><b>Base Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__BASE_UPLOAD_DIRECTORY = RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Directory Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__DIRECTORY_NAMER = RESOURCE_FEATURE__DIRECTORY_NAMER;

	/**
	 * The feature id for the '<em><b>File Namer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__FILE_NAMER = RESOURCE_FEATURE__FILE_NAMER;

	/**
	 * The number of structural features of the '<em>Image Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE_OPERATION_COUNT = RESOURCE_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PART_OF = ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__CARDINALITY = ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ORDERED = ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DERIVED = ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__CUSTOMISE_SET = ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__EMPTY_DISPLAY_VALUE = ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ENCODE_URI_KEY = ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SINGLETON_NAME = ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PLURALISED_NAME = ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SERIALIZATION_GROUPS = ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__HIDDEN = ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__CONTAINER_UNIQUE = ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__SLUG_FIELDS = ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__UNIQUE = ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PLACEHOLDER = ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__VALIDATION_PATTERN = ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The number of structural features of the '<em>Location Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DISPLAY_LABEL = ASSOCIATION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PART_OF = ASSOCIATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__CARDINALITY = ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__ORDERED = ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PRIMARY_KEY = ASSOCIATION__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DERIVED = ASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__CUSTOMISE_SET = ASSOCIATION__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__BOOLEAN_IS_HAS_CHOICE = ASSOCIATION__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TITLE = ASSOCIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLLECTION_ORM_ALLOW_ADD = ASSOCIATION__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLLECTION_ORM_ALLOW_REMOVE = ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DEFAULT_DISPLAY_VALUE = ASSOCIATION__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__EMPTY_DISPLAY_VALUE = ASSOCIATION__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__ENCODE_URI_KEY = ASSOCIATION__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SINGLETON_NAME = ASSOCIATION__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PLURALISED_NAME = ASSOCIATION__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__COLUMN_NAME = ASSOCIATION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SERIALIZATION_GROUPS = ASSOCIATION__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__KEYS = ASSOCIATION__KEYS;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_ENTITY = ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__BIDIRECTIONAL = ASSOCIATION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__UNIQUE = ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PIVOT_TABLE_NAME = ASSOCIATION__PIVOT_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_FEATURE_NAME = ASSOCIATION__TARGET_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_PRIMARY_KEY = ASSOCIATION__TARGET_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_COLUMN_NAME = ASSOCIATION__TARGET_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_DISPLAY_LABEL = ASSOCIATION__TARGET_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__SERIALIZATION_MAX_DEPTH = ASSOCIATION__SERIALIZATION_MAX_DEPTH;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association Without Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Association Without Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DISPLAY_LABEL = ASSOCIATION__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PART_OF = ASSOCIATION__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__CARDINALITY = ASSOCIATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__ORDERED = ASSOCIATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PRIMARY_KEY = ASSOCIATION__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DERIVED = ASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__CUSTOMISE_SET = ASSOCIATION__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__BOOLEAN_IS_HAS_CHOICE = ASSOCIATION__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TITLE = ASSOCIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLLECTION_ORM_ALLOW_ADD = ASSOCIATION__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLLECTION_ORM_ALLOW_REMOVE = ASSOCIATION__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DEFAULT_DISPLAY_VALUE = ASSOCIATION__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__EMPTY_DISPLAY_VALUE = ASSOCIATION__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__ENCODE_URI_KEY = ASSOCIATION__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SINGLETON_NAME = ASSOCIATION__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PLURALISED_NAME = ASSOCIATION__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__COLUMN_NAME = ASSOCIATION__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SERIALIZATION_GROUPS = ASSOCIATION__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__KEYS = ASSOCIATION__KEYS;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_ENTITY = ASSOCIATION__TARGET_ENTITY;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__BIDIRECTIONAL = ASSOCIATION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__UNIQUE = ASSOCIATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Pivot Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PIVOT_TABLE_NAME = ASSOCIATION__PIVOT_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Target Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_FEATURE_NAME = ASSOCIATION__TARGET_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Target Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_PRIMARY_KEY = ASSOCIATION__TARGET_PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_COLUMN_NAME = ASSOCIATION__TARGET_COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Target Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_DISPLAY_LABEL = ASSOCIATION__TARGET_DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SERIALIZATION_MAX_DEPTH = ASSOCIATION__SERIALIZATION_MAX_DEPTH;

	/**
	 * The feature id for the '<em><b>Source Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association With Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association With Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__KEY_FOR = 0;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__SOURCE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY__TARGET_FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Association Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Association Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_KEY_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__LABEL_FOR = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FORMAT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__CUSTOMISE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__FEATURES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL__SERIALIZATION_GROUPS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Model Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE__PART_OF = 0;

	/**
	 * The number of structural features of the '<em>Model Label Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Label Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__NAME = ASSOCIATION_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__CHILD_FEATURE = ASSOCIATION_PATH_ELEMENT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__ASSOCIATION = ASSOCIATION_PATH_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__VALUE_DISPLAY = ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__ASSOCIATION_SOURCE = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__ASSOCIATION_TARGET = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__PART_OF = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION___NAME = ASSOCIATION_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Is Source Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION___IS_SOURCE_ASSOCIATION = ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION;

	/**
	 * The operation id for the '<em>Leaf Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION___LEAF_ENTITY = ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION___CONTEXT_ENTITY = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_OPERATION_COUNT = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__NAME = ATTRIBUTE_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__ATTRIBUTE = ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__PART_OF = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE___NAME = ATTRIBUTE_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE___CONTEXT_ENTITY = ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureVariableImpl <em>Feature Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FeatureVariableImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeatureVariable()
	 * @generated
	 */
	int FEATURE_VARIABLE = 50;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationVariableImpl <em>Association Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationVariableImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationVariable()
	 * @generated
	 */
	int ASSOCIATION_VARIABLE = 51;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeVariableImpl <em>Attribute Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributeVariableImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttributeVariable()
	 * @generated
	 */
	int ATTRIBUTE_VARIABLE = 52;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceVariableImpl <em>Resource Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceVariableImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceVariable()
	 * @generated
	 */
	int RESOURCE_VARIABLE = 53;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ParameterVariableImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getParameterVariable()
	 * @generated
	 */
	int PARAMETER_VARIABLE = 54;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Serves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SERVES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SELECTIONS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Find All</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FIND_ALL = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Find One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FIND_ONE = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__NAME = BasePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__PARAMETERS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__REFERENCABLE_ENTITIES = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__DEFINED_BY = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__DISTINCT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__FIELDS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__JOINS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__CONDITION = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ORDERING = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__LIMIT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__GROUPING = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Select Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECT_PATH = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__FILTERS = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__METHOD_NAME = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = BasePackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION___REFERENCABLE_ENTITIES = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Selection Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION___SELECTION_TYPE = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = BasePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionPathImpl <em>Selection Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.SelectionPathImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSelectionPath()
	 * @generated
	 */
	int SELECTION_PATH = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__NAME = ASSOCIATION_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__CHILD_FEATURE = ASSOCIATION_PATH_ELEMENT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__ASSOCIATION = ASSOCIATION_PATH_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__VALUE_DISPLAY = ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__ASSOCIATION_SOURCE = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__ASSOCIATION_TARGET = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH__SELECTION = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH_FEATURE_COUNT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH___NAME = ASSOCIATION_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Is Source Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH___IS_SOURCE_ASSOCIATION = ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION;

	/**
	 * The operation id for the '<em>Leaf Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH___LEAF_ENTITY = ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH___CONTEXT_ENTITY = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PATH_OPERATION_COUNT = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext <em>Feature Variable Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeatureVariableContext()
	 * @generated
	 */
	int FEATURE_VARIABLE_CONTEXT = 49;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_CONTEXT__REFERENCABLE_ENTITIES = 0;

	/**
	 * The number of structural features of the '<em>Feature Variable Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_CONTEXT___REFERENCABLE_ENTITIES = 0;

	/**
	 * The number of operations of the '<em>Feature Variable Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.OrderImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 45;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__REFERENCABLE_ENTITIES = FEATURE_VARIABLE_CONTEXT__REFERENCABLE_ENTITIES;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SELECTION = FEATURE_VARIABLE_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ATTRIBUTE = FEATURE_VARIABLE_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = FEATURE_VARIABLE_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___REFERENCABLE_ENTITIES = FEATURE_VARIABLE_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = FEATURE_VARIABLE_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AscImpl <em>Asc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AscImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAsc()
	 * @generated
	 */
	int ASC = 46;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC__REFERENCABLE_ENTITIES = ORDER__REFERENCABLE_ENTITIES;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC__SELECTION = ORDER__SELECTION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC__ATTRIBUTE = ORDER__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Asc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC___REFERENCABLE_ENTITIES = ORDER___REFERENCABLE_ENTITIES;

	/**
	 * The number of operations of the '<em>Asc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASC_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DescImpl <em>Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DescImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDesc()
	 * @generated
	 */
	int DESC = 47;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__REFERENCABLE_ENTITIES = ORDER__REFERENCABLE_ENTITIES;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__SELECTION = ORDER__SELECTION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC__ATTRIBUTE = ORDER__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC___REFERENCABLE_ENTITIES = ORDER___REFERENCABLE_ENTITIES;

	/**
	 * The number of operations of the '<em>Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESC_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FilterImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PARAMETERS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__REFERENCABLE_ENTITIES = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__SELECTION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CONDITION = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__METHOD_NAME = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Referencable Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER___REFERENCABLE_ENTITIES = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE__ROOT_CONTAINER = ExpressionPackage.VARIABLE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VARIABLE_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__NAME = ASSOCIATION_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__CHILD_FEATURE = ASSOCIATION_PATH_ELEMENT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__ASSOCIATION = ASSOCIATION_PATH_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__VALUE_DISPLAY = ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY;

	/**
	 * The feature id for the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__ASSOCIATION_SOURCE = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE;

	/**
	 * The feature id for the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__ASSOCIATION_TARGET = ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__ROOT_CONTAINER = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE__USE_CONTAINER_AS_CONTEXT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE_FEATURE_COUNT = ASSOCIATION_PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE___CONTEXT_ENTITY = ASSOCIATION_PATH_ELEMENT___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE___NAME = ASSOCIATION_PATH_ELEMENT___NAME;

	/**
	 * The operation id for the '<em>Leaf Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE___LEAF_ENTITY = ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY;

	/**
	 * The operation id for the '<em>Is Source Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE___IS_SOURCE_ASSOCIATION = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_VARIABLE_OPERATION_COUNT = ASSOCIATION_PATH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE__NAME = ATTRIBUTE_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE__ATTRIBUTE = ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE__ROOT_CONTAINER = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE__USE_CONTAINER_AS_CONTEXT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE_FEATURE_COUNT = ATTRIBUTE_PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE___CONTEXT_ENTITY = ATTRIBUTE_PATH_ELEMENT___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE___NAME = ATTRIBUTE_PATH_ELEMENT___NAME;

	/**
	 * The number of operations of the '<em>Attribute Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VARIABLE_OPERATION_COUNT = ATTRIBUTE_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE__NAME = RESOURCE_PATH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE__RESOURCE = RESOURCE_PATH_ELEMENT__RESOURCE;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE__ROOT_CONTAINER = RESOURCE_PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Container As Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE__USE_CONTAINER_AS_CONTEXT = RESOURCE_PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE_FEATURE_COUNT = RESOURCE_PATH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE___CONTEXT_ENTITY = RESOURCE_PATH_ELEMENT___CONTEXT_ENTITY;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE___NAME = RESOURCE_PATH_ELEMENT___NAME;

	/**
	 * The number of operations of the '<em>Resource Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VARIABLE_OPERATION_COUNT = RESOURCE_PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__NAME = PATH_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__CHILD_FEATURE = PATH_ROOT__CHILD_FEATURE;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__ROOT_CONTAINER = PATH_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE__FORMAL = PATH_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE_FEATURE_COUNT = PATH_ROOT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Context Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE___CONTEXT_ENTITY = PATH_ROOT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE___NAME = PATH_ROOT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VARIABLE_OPERATION_COUNT = PATH_ROOT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies <em>Database Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDatabaseTechnologies()
	 * @generated
	 */
	int DATABASE_TECHNOLOGIES = 55;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.OrmTechnologies <em>Orm Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.OrmTechnologies
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOrmTechnologies()
	 * @generated
	 */
	int ORM_TECHNOLOGIES = 56;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 57;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.isHasChoices <em>is Has Choices</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getisHasChoices()
	 * @generated
	 */
	int IS_HAS_CHOICES = 58;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.DateDetails <em>Date Details</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateDetails()
	 * @generated
	 */
	int DATE_DETAILS = 59;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Persistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence
	 * @generated
	 */
	EClass getPersistence();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serialization Groups</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getSerializationGroups()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_SerializationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getDataTypes()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getEntities()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getRepositories()
	 * @see #getPersistence()
	 * @generated
	 */
	EReference getPersistence_Repositories();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getOrmTechnology <em>Orm Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Technology</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getOrmTechnology()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_OrmTechnology();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Persistence#getDatabaseTechnology <em>Database Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Technology</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#getDatabaseTechnology()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_DatabaseTechnology();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Persistence#isTimestampCreation <em>Timestamp Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp Creation</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#isTimestampCreation()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_TimestampCreation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Persistence#isTimestampUpdates <em>Timestamp Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp Updates</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence#isTimestampUpdates()
	 * @see #getPersistence()
	 * @generated
	 */
	EAttribute getPersistence_TimestampUpdates();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.SerializationGroup <em>Serialization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialization Group</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SerializationGroup
	 * @generated
	 */
	EClass getSerializationGroup();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.Feature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getPartOf()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_PartOf();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isOrdered()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isPrimaryKey()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isDerived()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Derived();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCustomiseSet <em>Customise Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customise Set</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isCustomiseSet()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CustomiseSet();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getBooleanIsHasChoice <em>Boolean Is Has Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Is Has Choice</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getBooleanIsHasChoice()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_BooleanIsHasChoice();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getTitle()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Title();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowAdd <em>Collection Orm Allow Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Orm Allow Add</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowAdd()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CollectionOrmAllowAdd();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowRemove <em>Collection Orm Allow Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Orm Allow Remove</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isCollectionOrmAllowRemove()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_CollectionOrmAllowRemove();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getDefaultDisplayValue <em>Default Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Display Value</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getDefaultDisplayValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DefaultDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getEmptyDisplayValue <em>Empty Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Display Value</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getEmptyDisplayValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_EmptyDisplayValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#isEncodeUriKey <em>Encode Uri Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encode Uri Key</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#isEncodeUriKey()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_EncodeUriKey();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getSingletonName <em>Singleton Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getSingletonName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_SingletonName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getPluralisedName <em>Pluralised Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluralised Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getPluralisedName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_PluralisedName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getColumnName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_ColumnName();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Feature#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serialization Groups</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getSerializationGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SerializationGroups();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#isHidden()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isContainerUnique <em>Container Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#isContainerUnique()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ContainerUnique();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getSlugFields <em>Slug Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Slug Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getSlugFields()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SlugFields();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#isUnique()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Unique();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getPlaceholder()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getValidationPattern()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Association#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getKeys()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Keys();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetEntity()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetEntity();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#isBidirectional()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Bidirectional();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#isUnique()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Unique();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getPivotTableName <em>Pivot Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pivot Table Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getPivotTableName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_PivotTableName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFeatureName <em>Target Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Feature Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetFeatureName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetFeatureName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#isTargetPrimaryKey <em>Target Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Primary Key</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#isTargetPrimaryKey()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetColumnName <em>Target Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Column Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetColumnName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetColumnName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayLabel <em>Target Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Display Label</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayLabel()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetDisplayLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getSerializationMaxDepth <em>Serialization Max Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialization Max Depth</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getSerializationMaxDepth()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SerializationMaxDepth();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel
	 * @generated
	 */
	EClass getModelLabel();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getLabelFor <em>Label For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Label For</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getLabelFor()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_LabelFor();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getFormat()
	 * @see #getModelLabel()
	 * @generated
	 */
	EAttribute getModelLabel_Format();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#isCustomise <em>Customise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customise</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#isCustomise()
	 * @see #getModelLabel()
	 * @generated
	 */
	EAttribute getModelLabel_Customise();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getFeatures()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_Features();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel#getSerializationGroups <em>Serialization Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serialization Groups</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel#getSerializationGroups()
	 * @see #getModelLabel()
	 * @generated
	 */
	EReference getModelLabel_SerializationGroups();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature <em>Model Label Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelFeature
	 * @generated
	 */
	EClass getModelLabelFeature();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Part Of</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelFeature#getPartOf()
	 * @see #getModelLabelFeature()
	 * @generated
	 */
	EReference getModelLabelFeature_PartOf();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute <em>Model Label Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute
	 * @generated
	 */
	EClass getModelLabelAttribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#getDateFormat()
	 * @see #getModelLabelAttribute()
	 * @generated
	 */
	EAttribute getModelLabelAttribute_DateFormat();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#contextEntity()
	 * @generated
	 */
	EOperation getModelLabelAttribute__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation <em>Model Label Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation
	 * @generated
	 */
	EClass getModelLabelAssociation();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#contextEntity()
	 * @generated
	 */
	EOperation getModelLabelAssociation__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getSingletonName <em>Singleton Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getSingletonName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_SingletonName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getPluralisedName <em>Pluralised Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pluralised Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getPluralisedName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_PluralisedName();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Features();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getKeys()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Keys();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associations</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAssociations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Associations();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds <em>Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association Ends</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AssociationEnds();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAllFeatures <em>All Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Features</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAllFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AllFeatures();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAllAssociations <em>All Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Associations</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAllAssociations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AllAssociations();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Entity#getContainingAssociation <em>Containing Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getContainingAssociation()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ContainingAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Entity#getContainingType <em>Containing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getContainingType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ContainingType();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getLabels()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Labels();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getUnique()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Unique();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Entity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getRepository()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Repository();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getTableName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_TableName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyName <em>Auto Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_AutoKeyName();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyPersistentType <em>Auto Key Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Persistent Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyPersistentType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_AutoKeyPersistentType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyGenerationStrategy <em>Auto Key Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Key Generation Strategy</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getAutoKeyGenerationStrategy()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_AutoKeyGenerationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#isImplementsUserInterface <em>Implements User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements User Interface</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#isImplementsUserInterface()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ImplementsUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#isImplementsResetPasswordInterface <em>Implements Reset Password Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements Reset Password Interface</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#isImplementsResetPasswordInterface()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ImplementsResetPasswordInterface();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute <em>Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute
	 * @generated
	 */
	EClass getDataTypeAttribute();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#getDataType()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EReference getDataTypeAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isObfuscateFormFields <em>Obfuscate Form Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obfuscate Form Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isObfuscateFormFields()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_ObfuscateFormFields();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isCaseInsensitive <em>Case Insensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Insensitive</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isCaseInsensitive()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_CaseInsensitive();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isEncrypt <em>Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypt</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute#isEncrypt()
	 * @see #getDataTypeAttribute()
	 * @generated
	 */
	EAttribute getDataTypeAttribute_Encrypt();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.DateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateAttribute
	 * @generated
	 */
	EClass getDateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DateAttribute#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateAttribute#getDetails()
	 * @see #getDateAttribute()
	 * @generated
	 */
	EAttribute getDateAttribute_Details();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DateAttribute#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateAttribute#getFormat()
	 * @see #getDateAttribute()
	 * @generated
	 */
	EAttribute getDateAttribute_Format();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.UrlAttribute <em>Url Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.UrlAttribute
	 * @generated
	 */
	EClass getUrlAttribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.UrlAttribute#getDisplayValue <em>Display Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Value</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.UrlAttribute#getDisplayValue()
	 * @see #getUrlAttribute()
	 * @generated
	 */
	EAttribute getUrlAttribute_DisplayValue();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature <em>Resource Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature
	 * @generated
	 */
	EClass getResourceFeature();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getMaximumUploadSize <em>Maximum Upload Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Upload Size</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getMaximumUploadSize()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EAttribute getResourceFeature_MaximumUploadSize();

	/**
	 * Returns the meta object for the attribute list '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Mime Types</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadMimeTypes()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EAttribute getResourceFeature_ValidUploadMimeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadExtensions <em>Valid Upload Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Extensions</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getValidUploadExtensions()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EAttribute getResourceFeature_ValidUploadExtensions();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getUriPrefix <em>Uri Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Prefix</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getUriPrefix()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EAttribute getResourceFeature_UriPrefix();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getBaseUploadDirectory <em>Base Upload Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Upload Directory</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getBaseUploadDirectory()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EAttribute getResourceFeature_BaseUploadDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getDirectoryNamer <em>Directory Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directory Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getDirectoryNamer()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EReference getResourceFeature_DirectoryNamer();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.ResourceFeature#getFileNamer <em>File Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceFeature#getFileNamer()
	 * @see #getResourceFeature()
	 * @generated
	 */
	EReference getResourceFeature_FileNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.DirectoryNamer <em>Directory Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DirectoryNamer
	 * @generated
	 */
	EClass getDirectoryNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.SubDirectory <em>Sub Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Directory</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SubDirectory
	 * @generated
	 */
	EClass getSubDirectory();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getCharactersPerDirectory <em>Characters Per Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characters Per Directory</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SubDirectory#getCharactersPerDirectory()
	 * @see #getSubDirectory()
	 * @generated
	 */
	EAttribute getSubDirectory_CharactersPerDirectory();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.SubDirectory#getDirectoryCount <em>Directory Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Count</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SubDirectory#getDirectoryCount()
	 * @see #getSubDirectory()
	 * @generated
	 */
	EAttribute getSubDirectory_DirectoryCount();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.PropertyDirectory <em>Property Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Directory</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PropertyDirectory
	 * @generated
	 */
	EClass getPropertyDirectory();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.PropertyDirectory#getAttribte <em>Attribte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribte</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PropertyDirectory#getAttribte()
	 * @see #getPropertyDirectory()
	 * @generated
	 */
	EReference getPropertyDirectory_Attribte();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.DateTimeDirectory <em>Date Time Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Directory</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateTimeDirectory
	 * @generated
	 */
	EClass getDateTimeDirectory();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DateTimeDirectory#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateTimeDirectory#getFormat()
	 * @see #getDateTimeDirectory()
	 * @generated
	 */
	EAttribute getDateTimeDirectory_Format();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.DateTimeDirectory#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateTimeDirectory#getAttribute()
	 * @see #getDateTimeDirectory()
	 * @generated
	 */
	EReference getDateTimeDirectory_Attribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.FileNamer <em>File Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FileNamer
	 * @generated
	 */
	EClass getFileNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.UniqueIdNamer <em>Unique Id Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Id Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.UniqueIdNamer
	 * @generated
	 */
	EClass getUniqueIdNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.OriginalNamer <em>Original Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Original Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.OriginalNamer
	 * @generated
	 */
	EClass getOriginalNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.PropertyNamer <em>Property Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PropertyNamer
	 * @generated
	 */
	EClass getPropertyNamer();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.PropertyNamer#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PropertyNamer#getAttribute()
	 * @see #getPropertyNamer()
	 * @generated
	 */
	EReference getPropertyNamer_Attribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.HashNamer <em>Hash Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.HashNamer
	 * @generated
	 */
	EClass getHashNamer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.HashNamer#getAlgorithm()
	 * @see #getHashNamer()
	 * @generated
	 */
	EAttribute getHashNamer_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.HashNamer#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.HashNamer#getLength()
	 * @see #getHashNamer()
	 * @generated
	 */
	EAttribute getHashNamer_Length();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Base64Namer <em>Base64 Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Base64Namer
	 * @generated
	 */
	EClass getBase64Namer();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Base64Namer#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Base64Namer#getLength()
	 * @see #getBase64Namer()
	 * @generated
	 */
	EAttribute getBase64Namer_Length();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.SmartUniqueNamer <em>Smart Unique Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Unique Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SmartUniqueNamer
	 * @generated
	 */
	EClass getSmartUniqueNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.SlugNamer <em>Slug Namer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slug Namer</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SlugNamer
	 * @generated
	 */
	EClass getSlugNamer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.FileResource <em>File Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FileResource
	 * @generated
	 */
	EClass getFileResource();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ImageResource <em>Image Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ImageResource
	 * @generated
	 */
	EClass getImageResource();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.LocationAttribute <em>Location Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.LocationAttribute
	 * @generated
	 */
	EClass getLocationAttribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment <em>Association Without Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Without Containment</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment
	 * @generated
	 */
	EClass getAssociationWithoutContainment();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#getTargetCardinality()
	 * @see #getAssociationWithoutContainment()
	 * @generated
	 */
	EAttribute getAssociationWithoutContainment_TargetCardinality();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#isTargetUnique <em>Target Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment#isTargetUnique()
	 * @see #getAssociationWithoutContainment()
	 * @generated
	 */
	EAttribute getAssociationWithoutContainment_TargetUnique();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithContainment <em>Association With Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association With Containment</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithContainment
	 * @generated
	 */
	EClass getAssociationWithContainment();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithContainment#isSourceVisible <em>Source Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Visible</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithContainment#isSourceVisible()
	 * @see #getAssociationWithContainment()
	 * @generated
	 */
	EAttribute getAssociationWithContainment_SourceVisible();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey <em>Association Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Key</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey
	 * @generated
	 */
	EClass getAssociationKey();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor <em>Key For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Key For</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey#getKeyFor()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_KeyFor();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey#getSourceFeature()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_SourceFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey#getTargetFeature()
	 * @see #getAssociationKey()
	 * @generated
	 */
	EReference getAssociationKey_TargetFeature();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Path#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Path#getName()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Name();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Path#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Path#contextEntity()
	 * @generated
	 */
	EOperation getPath__ContextEntity();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Path#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Path#name()
	 * @generated
	 */
	EOperation getPath__Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement <em>Association Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement
	 * @generated
	 */
	EClass getAssociationPathElement();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociation()
	 * @see #getAssociationPathElement()
	 * @generated
	 */
	EReference getAssociationPathElement_Association();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getValueDisplay <em>Value Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Display</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getValueDisplay()
	 * @see #getAssociationPathElement()
	 * @generated
	 */
	EReference getAssociationPathElement_ValueDisplay();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationSource <em>Association Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association Source</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationSource()
	 * @see #getAssociationPathElement()
	 * @generated
	 */
	EReference getAssociationPathElement_AssociationSource();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationTarget <em>Association Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association Target</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationTarget()
	 * @see #getAssociationPathElement()
	 * @generated
	 */
	EReference getAssociationPathElement_AssociationTarget();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#name()
	 * @generated
	 */
	EOperation getAssociationPathElement__Name();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#isSourceAssociation() <em>Is Source Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Source Association</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#isSourceAssociation()
	 * @generated
	 */
	EOperation getAssociationPathElement__IsSourceAssociation();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#leafEntity() <em>Leaf Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Leaf Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationPathElement#leafEntity()
	 * @generated
	 */
	EOperation getAssociationPathElement__LeafEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AttributePathElement <em>Attribute Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AttributePathElement
	 * @generated
	 */
	EClass getAttributePathElement();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.AttributePathElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AttributePathElement#getAttribute()
	 * @see #getAttributePathElement()
	 * @generated
	 */
	EReference getAttributePathElement_Attribute();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.AttributePathElement#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.AttributePathElement#name()
	 * @generated
	 */
	EOperation getAttributePathElement__Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement <em>Resource Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourcePathElement
	 * @generated
	 */
	EClass getResourcePathElement();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourcePathElement#getResource()
	 * @see #getResourcePathElement()
	 * @generated
	 */
	EReference getResourcePathElement_Resource();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourcePathElement#name()
	 * @generated
	 */
	EOperation getResourcePathElement__Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.PathRoot <em>Path Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Root</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PathRoot
	 * @generated
	 */
	EClass getPathRoot();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.PathRoot#getChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PathRoot#getChildFeature()
	 * @see #getPathRoot()
	 * @generated
	 */
	EReference getPathRoot_ChildFeature();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature <em>Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Feature</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildFeature
	 * @generated
	 */
	EClass getChildFeature();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildFeature#getParent()
	 * @see #getChildFeature()
	 * @generated
	 */
	EReference getChildFeature_Parent();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ChildAssociation <em>Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildAssociation
	 * @generated
	 */
	EClass getChildAssociation();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ChildAssociation#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildAssociation#contextEntity()
	 * @generated
	 */
	EOperation getChildAssociation__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ChildAttribute <em>Child Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildAttribute
	 * @generated
	 */
	EClass getChildAttribute();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ChildAttribute#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildAttribute#contextEntity()
	 * @generated
	 */
	EOperation getChildAttribute__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ChildResource <em>Child Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Resource</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildResource
	 * @generated
	 */
	EClass getChildResource();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ChildResource#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ChildResource#contextEntity()
	 * @generated
	 */
	EOperation getChildResource__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariable <em>Feature Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariable
	 * @generated
	 */
	EClass getFeatureVariable();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariable#isUseContainerAsContext <em>Use Container As Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Container As Context</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariable#isUseContainerAsContext()
	 * @see #getFeatureVariable()
	 * @generated
	 */
	EAttribute getFeatureVariable_UseContainerAsContext();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AssociationVariable <em>Association Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationVariable
	 * @generated
	 */
	EClass getAssociationVariable();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.AssociationVariable#isSourceAssociation() <em>Is Source Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Source Association</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationVariable#isSourceAssociation()
	 * @generated
	 */
	EOperation getAssociationVariable__IsSourceAssociation();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.AttributeVariable <em>Attribute Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.AttributeVariable
	 * @generated
	 */
	EClass getAttributeVariable();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ResourceVariable <em>Resource Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceVariable
	 * @generated
	 */
	EClass getResourceVariable();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable <em>Parameter Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ParameterVariable
	 * @generated
	 */
	EClass getParameterVariable();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ParameterVariable#getFormal()
	 * @see #getParameterVariable()
	 * @generated
	 */
	EReference getParameterVariable_Formal();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ParameterVariable#contextEntity()
	 * @generated
	 */
	EOperation getParameterVariable__ContextEntity();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.ParameterVariable#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.ParameterVariable#name()
	 * @generated
	 */
	EOperation getParameterVariable__Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Repository#getServes <em>Serves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serves</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository#getServes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Serves();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Repository#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository#getSelections()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Selections();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindAll <em>Find All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find All</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository#getFindAll()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_FindAll();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindOne <em>Find One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Find One</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository#getFindOne()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_FindOne();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined By</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_DefinedBy();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Selection#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#isDistinct()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Distinct();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Selection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getFields()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Fields();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Selection#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Joins</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getJoins()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Joins();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.Selection#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getCondition()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Selection#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordering</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getOrdering()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Selection#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getLimit()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Limit();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Selection#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouping</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getGrouping()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Grouping();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath <em>Select Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Path</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_SelectPath();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.Selection#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getFilters()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Filters();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Selection#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getMethodName()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_MethodName();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Selection#referencableEntities() <em>Referencable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referencable Entities</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#referencableEntities()
	 * @generated
	 */
	EOperation getSelection__ReferencableEntities();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Selection#selectionType() <em>Selection Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Selection Type</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#selectionType()
	 * @generated
	 */
	EOperation getSelection__SelectionType();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.SelectionPath <em>Selection Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Path</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SelectionPath
	 * @generated
	 */
	EClass getSelectionPath();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection()
	 * @see #getSelectionPath()
	 * @generated
	 */
	EReference getSelectionPath_Selection();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.SelectionPath#contextEntity() <em>Context Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Entity</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.SelectionPath#contextEntity()
	 * @generated
	 */
	EOperation getSelectionPath__ContextEntity();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.Order#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Order#getSelection()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.Order#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Order#getAttribute()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Attribute();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Order#referencableEntities() <em>Referencable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referencable Entities</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Order#referencableEntities()
	 * @generated
	 */
	EOperation getOrder__ReferencableEntities();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Asc <em>Asc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asc</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Asc
	 * @generated
	 */
	EClass getAsc();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desc</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Desc
	 * @generated
	 */
	EClass getDesc();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.persistence.Filter#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Selection</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter#getSelection()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.persistence.Filter#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter#getCondition()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Condition();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Filter#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter#getMethodName()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_MethodName();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.Filter#referencableEntities() <em>Referencable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referencable Entities</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter#referencableEntities()
	 * @generated
	 */
	EOperation getFilter__ReferencableEntities();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext <em>Feature Variable Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Variable Context</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext
	 * @generated
	 */
	EClass getFeatureVariableContext();

	/**
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#getReferencableEntities <em>Referencable Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencable Entities</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#getReferencableEntities()
	 * @see #getFeatureVariableContext()
	 * @generated
	 */
	EReference getFeatureVariableContext_ReferencableEntities();

	/**
	 * Returns the meta object for the '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#referencableEntities() <em>Referencable Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referencable Entities</em>' operation.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#referencableEntities()
	 * @generated
	 */
	EOperation getFeatureVariableContext__ReferencableEntities();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies <em>Database Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Technologies</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies
	 * @generated
	 */
	EEnum getDatabaseTechnologies();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.persistence.OrmTechnologies <em>Orm Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm Technologies</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.OrmTechnologies
	 * @generated
	 */
	EEnum getOrmTechnologies();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.persistence.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.persistence.isHasChoices <em>is Has Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>is Has Choices</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @generated
	 */
	EEnum getisHasChoices();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.persistence.DateDetails <em>Date Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Details</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
	 * @generated
	 */
	EEnum getDateDetails();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PersistenceImpl <em>Persistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistenceImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPersistence()
		 * @generated
		 */
		EClass PERSISTENCE = eINSTANCE.getPersistence();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__SERIALIZATION_GROUPS = eINSTANCE.getPersistence_SerializationGroups();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__DATA_TYPES = eINSTANCE.getPersistence_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__ENTITIES = eINSTANCE.getPersistence_Entities();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE__REPOSITORIES = eINSTANCE.getPersistence_Repositories();

		/**
		 * The meta object literal for the '<em><b>Orm Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__ORM_TECHNOLOGY = eINSTANCE.getPersistence_OrmTechnology();

		/**
		 * The meta object literal for the '<em><b>Database Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__DATABASE_TECHNOLOGY = eINSTANCE.getPersistence_DatabaseTechnology();

		/**
		 * The meta object literal for the '<em><b>Timestamp Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__TIMESTAMP_CREATION = eINSTANCE.getPersistence_TimestampCreation();

		/**
		 * The meta object literal for the '<em><b>Timestamp Updates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE__TIMESTAMP_UPDATES = eINSTANCE.getPersistence_TimestampUpdates();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SerializationGroupImpl <em>Serialization Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SerializationGroupImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSerializationGroup()
		 * @generated
		 */
		EClass SERIALIZATION_GROUP = eINSTANCE.getSerializationGroup();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PART_OF = eINSTANCE.getFeature_PartOf();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CARDINALITY = eINSTANCE.getFeature_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ORDERED = eINSTANCE.getFeature_Ordered();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__PRIMARY_KEY = eINSTANCE.getFeature_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DERIVED = eINSTANCE.getFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>Customise Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CUSTOMISE_SET = eINSTANCE.getFeature_CustomiseSet();

		/**
		 * The meta object literal for the '<em><b>Boolean Is Has Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__BOOLEAN_IS_HAS_CHOICE = eINSTANCE.getFeature_BooleanIsHasChoice();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TITLE = eINSTANCE.getFeature_Title();

		/**
		 * The meta object literal for the '<em><b>Collection Orm Allow Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COLLECTION_ORM_ALLOW_ADD = eINSTANCE.getFeature_CollectionOrmAllowAdd();

		/**
		 * The meta object literal for the '<em><b>Collection Orm Allow Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COLLECTION_ORM_ALLOW_REMOVE = eINSTANCE.getFeature_CollectionOrmAllowRemove();

		/**
		 * The meta object literal for the '<em><b>Default Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DEFAULT_DISPLAY_VALUE = eINSTANCE.getFeature_DefaultDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Empty Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__EMPTY_DISPLAY_VALUE = eINSTANCE.getFeature_EmptyDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Encode Uri Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ENCODE_URI_KEY = eINSTANCE.getFeature_EncodeUriKey();

		/**
		 * The meta object literal for the '<em><b>Singleton Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SINGLETON_NAME = eINSTANCE.getFeature_SingletonName();

		/**
		 * The meta object literal for the '<em><b>Pluralised Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__PLURALISED_NAME = eINSTANCE.getFeature_PluralisedName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__COLUMN_NAME = eINSTANCE.getFeature_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SERIALIZATION_GROUPS = eINSTANCE.getFeature_SerializationGroups();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__HIDDEN = eINSTANCE.getAttribute_Hidden();

		/**
		 * The meta object literal for the '<em><b>Container Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTAINER_UNIQUE = eINSTANCE.getAttribute_ContainerUnique();

		/**
		 * The meta object literal for the '<em><b>Slug Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SLUG_FIELDS = eINSTANCE.getAttribute_SlugFields();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UNIQUE = eINSTANCE.getAttribute_Unique();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PLACEHOLDER = eINSTANCE.getAttribute_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALIDATION_PATTERN = eINSTANCE.getAttribute_ValidationPattern();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__KEYS = eINSTANCE.getAssociation_Keys();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_ENTITY = eINSTANCE.getAssociation_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__BIDIRECTIONAL = eINSTANCE.getAssociation_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__UNIQUE = eINSTANCE.getAssociation_Unique();

		/**
		 * The meta object literal for the '<em><b>Pivot Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__PIVOT_TABLE_NAME = eINSTANCE.getAssociation_PivotTableName();

		/**
		 * The meta object literal for the '<em><b>Target Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_FEATURE_NAME = eINSTANCE.getAssociation_TargetFeatureName();

		/**
		 * The meta object literal for the '<em><b>Target Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_PRIMARY_KEY = eINSTANCE.getAssociation_TargetPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Target Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_COLUMN_NAME = eINSTANCE.getAssociation_TargetColumnName();

		/**
		 * The meta object literal for the '<em><b>Target Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_DISPLAY_LABEL = eINSTANCE.getAssociation_TargetDisplayLabel();

		/**
		 * The meta object literal for the '<em><b>Serialization Max Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SERIALIZATION_MAX_DEPTH = eINSTANCE.getAssociation_SerializationMaxDepth();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.Label <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.Label
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl <em>Model Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabel()
		 * @generated
		 */
		EClass MODEL_LABEL = eINSTANCE.getModelLabel();

		/**
		 * The meta object literal for the '<em><b>Label For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__LABEL_FOR = eINSTANCE.getModelLabel_LabelFor();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL__FORMAT = eINSTANCE.getModelLabel_Format();

		/**
		 * The meta object literal for the '<em><b>Customise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL__CUSTOMISE = eINSTANCE.getModelLabel_Customise();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__FEATURES = eINSTANCE.getModelLabel_Features();

		/**
		 * The meta object literal for the '<em><b>Serialization Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL__SERIALIZATION_GROUPS = eINSTANCE.getModelLabel_SerializationGroups();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature <em>Model Label Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelFeature
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelFeature()
		 * @generated
		 */
		EClass MODEL_LABEL_FEATURE = eINSTANCE.getModelLabelFeature();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_FEATURE__PART_OF = eINSTANCE.getModelLabelFeature_PartOf();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl <em>Model Label Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAttribute()
		 * @generated
		 */
		EClass MODEL_LABEL_ATTRIBUTE = eINSTANCE.getModelLabelAttribute();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = eINSTANCE.getModelLabelAttribute_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_LABEL_ATTRIBUTE___CONTEXT_ENTITY = eINSTANCE.getModelLabelAttribute__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl <em>Model Label Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAssociation()
		 * @generated
		 */
		EClass MODEL_LABEL_ASSOCIATION = eINSTANCE.getModelLabelAssociation();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_LABEL_ASSOCIATION___CONTEXT_ENTITY = eINSTANCE.getModelLabelAssociation__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.EntityImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Singleton Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SINGLETON_NAME = eINSTANCE.getEntity_SingletonName();

		/**
		 * The meta object literal for the '<em><b>Pluralised Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PLURALISED_NAME = eINSTANCE.getEntity_PluralisedName();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KEYS = eINSTANCE.getEntity_Keys();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ASSOCIATIONS = eINSTANCE.getEntity_Associations();

		/**
		 * The meta object literal for the '<em><b>Association Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ASSOCIATION_ENDS = eINSTANCE.getEntity_AssociationEnds();

		/**
		 * The meta object literal for the '<em><b>All Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ALL_FEATURES = eINSTANCE.getEntity_AllFeatures();

		/**
		 * The meta object literal for the '<em><b>All Associations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ALL_ASSOCIATIONS = eINSTANCE.getEntity_AllAssociations();

		/**
		 * The meta object literal for the '<em><b>Containing Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONTAINING_ASSOCIATION = eINSTANCE.getEntity_ContainingAssociation();

		/**
		 * The meta object literal for the '<em><b>Containing Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONTAINING_TYPE = eINSTANCE.getEntity_ContainingType();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__LABELS = eINSTANCE.getEntity_Labels();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__UNIQUE = eINSTANCE.getEntity_Unique();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REPOSITORY = eINSTANCE.getEntity_Repository();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TABLE_NAME = eINSTANCE.getEntity_TableName();

		/**
		 * The meta object literal for the '<em><b>Auto Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUTO_KEY_NAME = eINSTANCE.getEntity_AutoKeyName();

		/**
		 * The meta object literal for the '<em><b>Auto Key Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUTO_KEY_PERSISTENT_TYPE = eINSTANCE.getEntity_AutoKeyPersistentType();

		/**
		 * The meta object literal for the '<em><b>Auto Key Generation Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUTO_KEY_GENERATION_STRATEGY = eINSTANCE.getEntity_AutoKeyGenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Implements User Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IMPLEMENTS_USER_INTERFACE = eINSTANCE.getEntity_ImplementsUserInterface();

		/**
		 * The meta object literal for the '<em><b>Implements Reset Password Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE = eINSTANCE.getEntity_ImplementsResetPasswordInterface();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDataTypeAttribute()
		 * @generated
		 */
		EClass DATA_TYPE_ATTRIBUTE = eINSTANCE.getDataTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_ATTRIBUTE__DATA_TYPE = eINSTANCE.getDataTypeAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Obfuscate Form Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS = eINSTANCE.getDataTypeAttribute_ObfuscateFormFields();

		/**
		 * The meta object literal for the '<em><b>Case Insensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE = eINSTANCE.getDataTypeAttribute_CaseInsensitive();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_ATTRIBUTE__ENCRYPT = eINSTANCE.getDataTypeAttribute_Encrypt();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateAttribute()
		 * @generated
		 */
		EClass DATE_ATTRIBUTE = eINSTANCE.getDateAttribute();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_ATTRIBUTE__DETAILS = eINSTANCE.getDateAttribute_Details();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_ATTRIBUTE__FORMAT = eINSTANCE.getDateAttribute_Format();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl <em>Url Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getUrlAttribute()
		 * @generated
		 */
		EClass URL_ATTRIBUTE = eINSTANCE.getUrlAttribute();

		/**
		 * The meta object literal for the '<em><b>Display Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_ATTRIBUTE__DISPLAY_VALUE = eINSTANCE.getUrlAttribute_DisplayValue();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl <em>Resource Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceFeatureImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceFeature()
		 * @generated
		 */
		EClass RESOURCE_FEATURE = eINSTANCE.getResourceFeature();

		/**
		 * The meta object literal for the '<em><b>Maximum Upload Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE = eINSTANCE.getResourceFeature_MaximumUploadSize();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES = eINSTANCE.getResourceFeature_ValidUploadMimeTypes();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Extensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS = eINSTANCE.getResourceFeature_ValidUploadExtensions();

		/**
		 * The meta object literal for the '<em><b>Uri Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FEATURE__URI_PREFIX = eINSTANCE.getResourceFeature_UriPrefix();

		/**
		 * The meta object literal for the '<em><b>Base Upload Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY = eINSTANCE.getResourceFeature_BaseUploadDirectory();

		/**
		 * The meta object literal for the '<em><b>Directory Namer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FEATURE__DIRECTORY_NAMER = eINSTANCE.getResourceFeature_DirectoryNamer();

		/**
		 * The meta object literal for the '<em><b>File Namer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FEATURE__FILE_NAMER = eINSTANCE.getResourceFeature_FileNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DirectoryNamerImpl <em>Directory Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DirectoryNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDirectoryNamer()
		 * @generated
		 */
		EClass DIRECTORY_NAMER = eINSTANCE.getDirectoryNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl <em>Sub Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SubDirectoryImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSubDirectory()
		 * @generated
		 */
		EClass SUB_DIRECTORY = eINSTANCE.getSubDirectory();

		/**
		 * The meta object literal for the '<em><b>Characters Per Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY = eINSTANCE.getSubDirectory_CharactersPerDirectory();

		/**
		 * The meta object literal for the '<em><b>Directory Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_DIRECTORY__DIRECTORY_COUNT = eINSTANCE.getSubDirectory_DirectoryCount();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PropertyDirectoryImpl <em>Property Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PropertyDirectoryImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPropertyDirectory()
		 * @generated
		 */
		EClass PROPERTY_DIRECTORY = eINSTANCE.getPropertyDirectory();

		/**
		 * The meta object literal for the '<em><b>Attribte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_DIRECTORY__ATTRIBTE = eINSTANCE.getPropertyDirectory_Attribte();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DateTimeDirectoryImpl <em>Date Time Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DateTimeDirectoryImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateTimeDirectory()
		 * @generated
		 */
		EClass DATE_TIME_DIRECTORY = eINSTANCE.getDateTimeDirectory();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_DIRECTORY__FORMAT = eINSTANCE.getDateTimeDirectory_Format();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_TIME_DIRECTORY__ATTRIBUTE = eINSTANCE.getDateTimeDirectory_Attribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileNamerImpl <em>File Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FileNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileNamer()
		 * @generated
		 */
		EClass FILE_NAMER = eINSTANCE.getFileNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.UniqueIdNamerImpl <em>Unique Id Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.UniqueIdNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getUniqueIdNamer()
		 * @generated
		 */
		EClass UNIQUE_ID_NAMER = eINSTANCE.getUniqueIdNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.OriginalNamerImpl <em>Original Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.OriginalNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOriginalNamer()
		 * @generated
		 */
		EClass ORIGINAL_NAMER = eINSTANCE.getOriginalNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PropertyNamerImpl <em>Property Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PropertyNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPropertyNamer()
		 * @generated
		 */
		EClass PROPERTY_NAMER = eINSTANCE.getPropertyNamer();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_NAMER__ATTRIBUTE = eINSTANCE.getPropertyNamer_Attribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.HashNamerImpl <em>Hash Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.HashNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getHashNamer()
		 * @generated
		 */
		EClass HASH_NAMER = eINSTANCE.getHashNamer();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_NAMER__ALGORITHM = eINSTANCE.getHashNamer_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_NAMER__LENGTH = eINSTANCE.getHashNamer_Length();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.Base64NamerImpl <em>Base64 Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.Base64NamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getBase64Namer()
		 * @generated
		 */
		EClass BASE64_NAMER = eINSTANCE.getBase64Namer();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_NAMER__LENGTH = eINSTANCE.getBase64Namer_Length();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SmartUniqueNamerImpl <em>Smart Unique Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SmartUniqueNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSmartUniqueNamer()
		 * @generated
		 */
		EClass SMART_UNIQUE_NAMER = eINSTANCE.getSmartUniqueNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SlugNamerImpl <em>Slug Namer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SlugNamerImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSlugNamer()
		 * @generated
		 */
		EClass SLUG_NAMER = eINSTANCE.getSlugNamer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileResourceImpl <em>File Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FileResourceImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileResource()
		 * @generated
		 */
		EClass FILE_RESOURCE = eINSTANCE.getFileResource();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ImageResourceImpl <em>Image Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ImageResourceImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getImageResource()
		 * @generated
		 */
		EClass IMAGE_RESOURCE = eINSTANCE.getImageResource();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl <em>Location Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLocationAttribute()
		 * @generated
		 */
		EClass LOCATION_ATTRIBUTE = eINSTANCE.getLocationAttribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl <em>Association Without Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithoutContainment()
		 * @generated
		 */
		EClass ASSOCIATION_WITHOUT_CONTAINMENT = eINSTANCE.getAssociationWithoutContainment();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY = eINSTANCE.getAssociationWithoutContainment_TargetCardinality();

		/**
		 * The meta object literal for the '<em><b>Target Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE = eINSTANCE.getAssociationWithoutContainment_TargetUnique();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl <em>Association With Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithContainment()
		 * @generated
		 */
		EClass ASSOCIATION_WITH_CONTAINMENT = eINSTANCE.getAssociationWithContainment();

		/**
		 * The meta object literal for the '<em><b>Source Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE = eINSTANCE.getAssociationWithContainment_SourceVisible();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl <em>Association Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationKey()
		 * @generated
		 */
		EClass ASSOCIATION_KEY = eINSTANCE.getAssociationKey();

		/**
		 * The meta object literal for the '<em><b>Key For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__KEY_FOR = eINSTANCE.getAssociationKey_KeyFor();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__SOURCE_FEATURE = eINSTANCE.getAssociationKey_SourceFeature();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_KEY__TARGET_FEATURE = eINSTANCE.getAssociationKey_TargetFeature();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PathImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__NAME = eINSTANCE.getPath_Name();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___CONTEXT_ENTITY = eINSTANCE.getPath__ContextEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___NAME = eINSTANCE.getPath__Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl <em>Association Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationPathElement()
		 * @generated
		 */
		EClass ASSOCIATION_PATH_ELEMENT = eINSTANCE.getAssociationPathElement();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PATH_ELEMENT__ASSOCIATION = eINSTANCE.getAssociationPathElement_Association();

		/**
		 * The meta object literal for the '<em><b>Value Display</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY = eINSTANCE.getAssociationPathElement_ValueDisplay();

		/**
		 * The meta object literal for the '<em><b>Association Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE = eINSTANCE.getAssociationPathElement_AssociationSource();

		/**
		 * The meta object literal for the '<em><b>Association Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET = eINSTANCE.getAssociationPathElement_AssociationTarget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_PATH_ELEMENT___NAME = eINSTANCE.getAssociationPathElement__Name();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION = eINSTANCE.getAssociationPathElement__IsSourceAssociation();

		/**
		 * The meta object literal for the '<em><b>Leaf Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY = eINSTANCE.getAssociationPathElement__LeafEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributePathElementImpl <em>Attribute Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributePathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttributePathElement()
		 * @generated
		 */
		EClass ATTRIBUTE_PATH_ELEMENT = eINSTANCE.getAttributePathElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE = eINSTANCE.getAttributePathElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_PATH_ELEMENT___NAME = eINSTANCE.getAttributePathElement__Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourcePathElementImpl <em>Resource Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourcePathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourcePathElement()
		 * @generated
		 */
		EClass RESOURCE_PATH_ELEMENT = eINSTANCE.getResourcePathElement();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PATH_ELEMENT__RESOURCE = eINSTANCE.getResourcePathElement_Resource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_PATH_ELEMENT___NAME = eINSTANCE.getResourcePathElement__Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathRootImpl <em>Path Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PathRootImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPathRoot()
		 * @generated
		 */
		EClass PATH_ROOT = eINSTANCE.getPathRoot();

		/**
		 * The meta object literal for the '<em><b>Child Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ROOT__CHILD_FEATURE = eINSTANCE.getPathRoot_ChildFeature();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.ChildFeature <em>Child Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.ChildFeature
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildFeature()
		 * @generated
		 */
		EClass CHILD_FEATURE = eINSTANCE.getChildFeature();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_FEATURE__PARENT = eINSTANCE.getChildFeature_Parent();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildAssociationImpl <em>Child Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildAssociationImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildAssociation()
		 * @generated
		 */
		EClass CHILD_ASSOCIATION = eINSTANCE.getChildAssociation();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHILD_ASSOCIATION___CONTEXT_ENTITY = eINSTANCE.getChildAssociation__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildAttributeImpl <em>Child Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildAttribute()
		 * @generated
		 */
		EClass CHILD_ATTRIBUTE = eINSTANCE.getChildAttribute();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHILD_ATTRIBUTE___CONTEXT_ENTITY = eINSTANCE.getChildAttribute__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ChildResourceImpl <em>Child Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ChildResourceImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getChildResource()
		 * @generated
		 */
		EClass CHILD_RESOURCE = eINSTANCE.getChildResource();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHILD_RESOURCE___CONTEXT_ENTITY = eINSTANCE.getChildResource__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureVariableImpl <em>Feature Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FeatureVariableImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeatureVariable()
		 * @generated
		 */
		EClass FEATURE_VARIABLE = eINSTANCE.getFeatureVariable();

		/**
		 * The meta object literal for the '<em><b>Use Container As Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT = eINSTANCE.getFeatureVariable_UseContainerAsContext();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationVariableImpl <em>Association Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationVariableImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationVariable()
		 * @generated
		 */
		EClass ASSOCIATION_VARIABLE = eINSTANCE.getAssociationVariable();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_VARIABLE___IS_SOURCE_ASSOCIATION = eINSTANCE.getAssociationVariable__IsSourceAssociation();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeVariableImpl <em>Attribute Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributeVariableImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttributeVariable()
		 * @generated
		 */
		EClass ATTRIBUTE_VARIABLE = eINSTANCE.getAttributeVariable();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceVariableImpl <em>Resource Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceVariableImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceVariable()
		 * @generated
		 */
		EClass RESOURCE_VARIABLE = eINSTANCE.getResourceVariable();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ParameterVariableImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getParameterVariable()
		 * @generated
		 */
		EClass PARAMETER_VARIABLE = eINSTANCE.getParameterVariable();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VARIABLE__FORMAL = eINSTANCE.getParameterVariable_Formal();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VARIABLE___CONTEXT_ENTITY = eINSTANCE.getParameterVariable__ContextEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_VARIABLE___NAME = eINSTANCE.getParameterVariable__Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.RepositoryImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Serves</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SERVES = eINSTANCE.getRepository_Serves();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SELECTIONS = eINSTANCE.getRepository_Selections();

		/**
		 * The meta object literal for the '<em><b>Find All</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FIND_ALL = eINSTANCE.getRepository_FindAll();

		/**
		 * The meta object literal for the '<em><b>Find One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FIND_ONE = eINSTANCE.getRepository_FindOne();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__DEFINED_BY = eINSTANCE.getSelection_DefinedBy();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__DISTINCT = eINSTANCE.getSelection_Distinct();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__FIELDS = eINSTANCE.getSelection_Fields();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__JOINS = eINSTANCE.getSelection_Joins();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__CONDITION = eINSTANCE.getSelection_Condition();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__ORDERING = eINSTANCE.getSelection_Ordering();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__LIMIT = eINSTANCE.getSelection_Limit();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__GROUPING = eINSTANCE.getSelection_Grouping();

		/**
		 * The meta object literal for the '<em><b>Select Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__SELECT_PATH = eINSTANCE.getSelection_SelectPath();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__FILTERS = eINSTANCE.getSelection_Filters();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__METHOD_NAME = eINSTANCE.getSelection_MethodName();

		/**
		 * The meta object literal for the '<em><b>Referencable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECTION___REFERENCABLE_ENTITIES = eINSTANCE.getSelection__ReferencableEntities();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECTION___SELECTION_TYPE = eINSTANCE.getSelection__SelectionType();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionPathImpl <em>Selection Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.SelectionPathImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getSelectionPath()
		 * @generated
		 */
		EClass SELECTION_PATH = eINSTANCE.getSelectionPath();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_PATH__SELECTION = eINSTANCE.getSelectionPath_Selection();

		/**
		 * The meta object literal for the '<em><b>Context Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECTION_PATH___CONTEXT_ENTITY = eINSTANCE.getSelectionPath__ContextEntity();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.OrderImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__SELECTION = eINSTANCE.getOrder_Selection();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ATTRIBUTE = eINSTANCE.getOrder_Attribute();

		/**
		 * The meta object literal for the '<em><b>Referencable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___REFERENCABLE_ENTITIES = eINSTANCE.getOrder__ReferencableEntities();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AscImpl <em>Asc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.AscImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAsc()
		 * @generated
		 */
		EClass ASC = eINSTANCE.getAsc();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DescImpl <em>Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DescImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDesc()
		 * @generated
		 */
		EClass DESC = eINSTANCE.getDesc();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FilterImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__SELECTION = eINSTANCE.getFilter_Selection();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__CONDITION = eINSTANCE.getFilter_Condition();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__METHOD_NAME = eINSTANCE.getFilter_MethodName();

		/**
		 * The meta object literal for the '<em><b>Referencable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILTER___REFERENCABLE_ENTITIES = eINSTANCE.getFilter__ReferencableEntities();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext <em>Feature Variable Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.FeatureVariableContext
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeatureVariableContext()
		 * @generated
		 */
		EClass FEATURE_VARIABLE_CONTEXT = eINSTANCE.getFeatureVariableContext();

		/**
		 * The meta object literal for the '<em><b>Referencable Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VARIABLE_CONTEXT__REFERENCABLE_ENTITIES = eINSTANCE.getFeatureVariableContext_ReferencableEntities();

		/**
		 * The meta object literal for the '<em><b>Referencable Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE_VARIABLE_CONTEXT___REFERENCABLE_ENTITIES = eINSTANCE.getFeatureVariableContext__ReferencableEntities();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies <em>Database Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDatabaseTechnologies()
		 * @generated
		 */
		EEnum DATABASE_TECHNOLOGIES = eINSTANCE.getDatabaseTechnologies();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.OrmTechnologies <em>Orm Technologies</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.OrmTechnologies
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOrmTechnologies()
		 * @generated
		 */
		EEnum ORM_TECHNOLOGIES = eINSTANCE.getOrmTechnologies();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.isHasChoices <em>is Has Choices</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getisHasChoices()
		 * @generated
		 */
		EEnum IS_HAS_CHOICES = eINSTANCE.getisHasChoices();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.DateDetails <em>Date Details</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateDetails()
		 * @generated
		 */
		EEnum DATE_DETAILS = eINSTANCE.getDateDetails();

	}

} //PersistencePackage
