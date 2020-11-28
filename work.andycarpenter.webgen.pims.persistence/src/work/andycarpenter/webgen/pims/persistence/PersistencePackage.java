/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import work.andycarpenter.webgen.pims.base.BasePackage;

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
	String eNS_URI = "http://cs.man.ac.uk/mdsd/webgen/persistence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-persistence";

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
	 * The feature id for the '<em><b>Orm Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__ORM_TECHNOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Database Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__DATABASE_TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Timestamp Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_CREATION = 5;

	/**
	 * The feature id for the '<em><b>Timestamp Updates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE__TIMESTAMP_UPDATES = 6;

	/**
	 * The number of structural features of the '<em>Persistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_FEATURE_COUNT = 7;

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
	int SERIALIZATION_GROUP = 1;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FeatureImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HEADER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DISPLAY_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FOOTER_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__HEADER_CLASS = FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DISPLAY_CLASS = FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FOOTER_CLASS = FEATURE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PERSISTENT_TYPE = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ORM_TYPE = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INTERFACE_TYPE = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SLUG_FIELDS = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIQUE = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PLACEHOLDER = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALIDATION_PATTERN = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 4;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__HEADER_CLASS = FEATURE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DISPLAY_CLASS = FEATURE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FOOTER_CLASS = FEATURE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_HEADER_CLASS = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_INPUT_CLASS = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_DISPLAY_CLASS = FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_FOOTER_CLASS = FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PSEUDO = FEATURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Serialization Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SERIALIZATION_MAX_DEPTH = FEATURE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.Label <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.Label
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 5;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl <em>Model Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabel()
	 * @generated
	 */
	int MODEL_LABEL = 6;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelFeatureImpl <em>Model Label Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelFeatureImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelFeature()
	 * @generated
	 */
	int MODEL_LABEL_FEATURE = 7;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl <em>Model Label Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAttribute()
	 * @generated
	 */
	int MODEL_LABEL_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__PART_OF = MODEL_LABEL_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__ATTRIBUTE = MODEL_LABEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_FEATURE_COUNT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Label Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ATTRIBUTE_OPERATION_COUNT = MODEL_LABEL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl <em>Model Label Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelAssociationImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getModelLabelAssociation()
	 * @generated
	 */
	int MODEL_LABEL_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__PART_OF = MODEL_LABEL_FEATURE__PART_OF;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__ASSOCIATION = MODEL_LABEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL = MODEL_LABEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION = MODEL_LABEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_FEATURE_COUNT = MODEL_LABEL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Label Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LABEL_ASSOCIATION_OPERATION_COUNT = MODEL_LABEL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.EntityImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

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
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEYS = BasePackage.CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABELS = BasePackage.CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UNIQUE = BasePackage.CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTAINER_UNIQUE = BasePackage.CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Auto Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_NAME = BasePackage.CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Auto Key Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_PERSISTENT_TYPE = BasePackage.CLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Auto Key Generation Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUTO_KEY_GENERATION_STRATEGY = BasePackage.CLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Implements User Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IMPLEMENTS_USER_INTERFACE = BasePackage.CLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Allow Form Type Customisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION = BasePackage.CLASSIFIER_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = BasePackage.CLASSIFIER_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = BasePackage.CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DataTypeAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDataTypeAttribute()
	 * @generated
	 */
	int DATA_TYPE_ATTRIBUTE = 11;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ATTRIBUTE__INTERFACE_TYPE = ATTRIBUTE__INTERFACE_TYPE;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl <em>Date Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DateAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateAttribute()
	 * @generated
	 */
	int DATE_ATTRIBUTE = 12;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE__INTERFACE_TYPE = ATTRIBUTE__INTERFACE_TYPE;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl <em>Url Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.UrlAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getUrlAttribute()
	 * @generated
	 */
	int URL_ATTRIBUTE = 13;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ATTRIBUTE__INTERFACE_TYPE = ATTRIBUTE__INTERFACE_TYPE;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceAttribute()
	 * @generated
	 */
	int RESOURCE_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DISPLAY_LABEL = ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PART_OF = ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__CARDINALITY = ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ORDERED = ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PRIMARY_KEY = ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DERIVED = ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__CUSTOMISE_SET = ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__TITLE = ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__EMPTY_DISPLAY_VALUE = ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ENCODE_URI_KEY = ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SINGLETON_NAME = ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PLURALISED_NAME = ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__COLUMN_NAME = ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS = ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__HIDDEN = ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE = ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__INTERFACE_TYPE = ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__SLUG_FIELDS = ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UNIQUE = ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__PLACEHOLDER = ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALIDATION_PATTERN = ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE__UPLOAD_PATH = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathElementImpl <em>Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPathElement()
	 * @generated
	 */
	int PATH_ELEMENT = 15;

	/**
	 * The number of structural features of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.StaticPathElementImpl <em>Static Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.StaticPathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getStaticPathElement()
	 * @generated
	 */
	int STATIC_PATH_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT__ELEMENT = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PATH_ELEMENT_OPERATION_COUNT = PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DatePathElementImpl <em>Date Path Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.DatePathElementImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDatePathElement()
	 * @generated
	 */
	int DATE_PATH_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT__FORMAT = PATH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT_FEATURE_COUNT = PATH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Path Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PATH_ELEMENT_OPERATION_COUNT = PATH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileAttributeImpl <em>File Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.FileAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileAttribute()
	 * @generated
	 */
	int FILE_ATTRIBUTE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__NAME = RESOURCE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DISPLAY_LABEL = RESOURCE_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PART_OF = RESOURCE_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__CARDINALITY = RESOURCE_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ORDERED = RESOURCE_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PRIMARY_KEY = RESOURCE_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DERIVED = RESOURCE_ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__CUSTOMISE_SET = RESOURCE_ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__TITLE = RESOURCE_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__EMPTY_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ENCODE_URI_KEY = RESOURCE_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SINGLETON_NAME = RESOURCE_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PLURALISED_NAME = RESOURCE_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__COLUMN_NAME = RESOURCE_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SERIALIZATION_GROUPS = RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__HEADER_CLASS = RESOURCE_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DISPLAY_CLASS = RESOURCE_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__FOOTER_CLASS = RESOURCE_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__HIDDEN = RESOURCE_ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__CONTAINER_UNIQUE = RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PERSISTENT_TYPE = RESOURCE_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__ORM_TYPE = RESOURCE_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__INTERFACE_TYPE = RESOURCE_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__SLUG_FIELDS = RESOURCE_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UNIQUE = RESOURCE_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__DEFAULT_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__PLACEHOLDER = RESOURCE_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALIDATION_PATTERN = RESOURCE_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE__UPLOAD_PATH = RESOURCE_ATTRIBUTE__UPLOAD_PATH;

	/**
	 * The number of structural features of the '<em>File Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ATTRIBUTE_OPERATION_COUNT = RESOURCE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.ImageAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getImageAttribute()
	 * @generated
	 */
	int IMAGE_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__NAME = RESOURCE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DISPLAY_LABEL = RESOURCE_ATTRIBUTE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PART_OF = RESOURCE_ATTRIBUTE__PART_OF;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__CARDINALITY = RESOURCE_ATTRIBUTE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ORDERED = RESOURCE_ATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PRIMARY_KEY = RESOURCE_ATTRIBUTE__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DERIVED = RESOURCE_ATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Customise Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__CUSTOMISE_SET = RESOURCE_ATTRIBUTE__CUSTOMISE_SET;

	/**
	 * The feature id for the '<em><b>Boolean Is Has Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE = RESOURCE_ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__TITLE = RESOURCE_ATTRIBUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD = RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_ADD;

	/**
	 * The feature id for the '<em><b>Collection Orm Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE = RESOURCE_ATTRIBUTE__COLLECTION_ORM_ALLOW_REMOVE;

	/**
	 * The feature id for the '<em><b>Default Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Empty Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__EMPTY_DISPLAY_VALUE = RESOURCE_ATTRIBUTE__EMPTY_DISPLAY_VALUE;

	/**
	 * The feature id for the '<em><b>Encode Uri Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ENCODE_URI_KEY = RESOURCE_ATTRIBUTE__ENCODE_URI_KEY;

	/**
	 * The feature id for the '<em><b>Singleton Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SINGLETON_NAME = RESOURCE_ATTRIBUTE__SINGLETON_NAME;

	/**
	 * The feature id for the '<em><b>Pluralised Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PLURALISED_NAME = RESOURCE_ATTRIBUTE__PLURALISED_NAME;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__COLUMN_NAME = RESOURCE_ATTRIBUTE__COLUMN_NAME;

	/**
	 * The feature id for the '<em><b>Serialization Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SERIALIZATION_GROUPS = RESOURCE_ATTRIBUTE__SERIALIZATION_GROUPS;

	/**
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__HEADER_CLASS = RESOURCE_ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DISPLAY_CLASS = RESOURCE_ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__FOOTER_CLASS = RESOURCE_ATTRIBUTE__FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__HIDDEN = RESOURCE_ATTRIBUTE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Container Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__CONTAINER_UNIQUE = RESOURCE_ATTRIBUTE__CONTAINER_UNIQUE;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PERSISTENT_TYPE = RESOURCE_ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__ORM_TYPE = RESOURCE_ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__INTERFACE_TYPE = RESOURCE_ATTRIBUTE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Slug Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__SLUG_FIELDS = RESOURCE_ATTRIBUTE__SLUG_FIELDS;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UNIQUE = RESOURCE_ATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__DEFAULT_VALUE = RESOURCE_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__PLACEHOLDER = RESOURCE_ATTRIBUTE__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALIDATION_PATTERN = RESOURCE_ATTRIBUTE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Maximum Upload Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE;

	/**
	 * The feature id for the '<em><b>Valid Upload Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES;

	/**
	 * The feature id for the '<em><b>Valid Upload Extensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Uploads Within Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE;

	/**
	 * The feature id for the '<em><b>Upload Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE__UPLOAD_PATH = RESOURCE_ATTRIBUTE__UPLOAD_PATH;

	/**
	 * The number of structural features of the '<em>Image Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE_FEATURE_COUNT = RESOURCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ATTRIBUTE_OPERATION_COUNT = RESOURCE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl <em>Location Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.LocationAttributeImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getLocationAttribute()
	 * @generated
	 */
	int LOCATION_ATTRIBUTE = 20;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__HEADER_CLASS = ATTRIBUTE__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__DISPLAY_CLASS = ATTRIBUTE__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__FOOTER_CLASS = ATTRIBUTE__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__PERSISTENT_TYPE = ATTRIBUTE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__ORM_TYPE = ATTRIBUTE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_ATTRIBUTE__INTERFACE_TYPE = ATTRIBUTE__INTERFACE_TYPE;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl <em>Association Without Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithoutContainmentImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithoutContainment()
	 * @generated
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT = 21;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__HEADER_CLASS = ASSOCIATION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__DISPLAY_CLASS = ASSOCIATION__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__FOOTER_CLASS = ASSOCIATION__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_HEADER_CLASS = ASSOCIATION__TARGET_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_INPUT_CLASS = ASSOCIATION__TARGET_INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_DISPLAY_CLASS = ASSOCIATION__TARGET_DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_FOOTER_CLASS = ASSOCIATION__TARGET_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITHOUT_CONTAINMENT__PSEUDO = ASSOCIATION__PSEUDO;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl <em>Association With Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationWithContainmentImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationWithContainment()
	 * @generated
	 */
	int ASSOCIATION_WITH_CONTAINMENT = 22;

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
	 * The feature id for the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__HEADER_CLASS = ASSOCIATION__HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__DISPLAY_CLASS = ASSOCIATION__DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__FOOTER_CLASS = ASSOCIATION__FOOTER_CLASS;

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
	 * The feature id for the '<em><b>Target Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_HEADER_CLASS = ASSOCIATION__TARGET_HEADER_CLASS;

	/**
	 * The feature id for the '<em><b>Target Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_INPUT_CLASS = ASSOCIATION__TARGET_INPUT_CLASS;

	/**
	 * The feature id for the '<em><b>Target Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_DISPLAY_CLASS = ASSOCIATION__TARGET_DISPLAY_CLASS;

	/**
	 * The feature id for the '<em><b>Target Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__TARGET_FOOTER_CLASS = ASSOCIATION__TARGET_FOOTER_CLASS;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_WITH_CONTAINMENT__PSEUDO = ASSOCIATION__PSEUDO;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl <em>Association Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.impl.AssociationKeyImpl
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getAssociationKey()
	 * @generated
	 */
	int ASSOCIATION_KEY = 23;

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
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies <em>Database Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDatabaseTechnologies()
	 * @generated
	 */
	int DATABASE_TECHNOLOGIES = 24;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.OrmTechnologies <em>Orm Technologies</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.OrmTechnologies
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getOrmTechnologies()
	 * @generated
	 */
	int ORM_TECHNOLOGIES = 25;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.Cardinality
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 26;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.isHasChoices <em>is Has Choices</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.isHasChoices
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getisHasChoices()
	 * @generated
	 */
	int IS_HAS_CHOICES = 27;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.persistence.DateDetails <em>Date Details</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.persistence.DateDetails
	 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDateDetails()
	 * @generated
	 */
	int DATE_DETAILS = 28;


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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getHeaderClass <em>Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getHeaderClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_HeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getDisplayClass <em>Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getDisplayClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_DisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Feature#getFooterClass <em>Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature#getFooterClass()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_FooterClass();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getPersistentType <em>Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getPersistentType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_PersistentType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getOrmType <em>Orm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getOrmType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_OrmType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Attribute#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute#getInterfaceType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_InterfaceType();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetHeaderClass <em>Target Header Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Header Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetHeaderClass()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetHeaderClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetInputClass <em>Target Input Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Input Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetInputClass()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetInputClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayClass <em>Target Display Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Display Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetDisplayClass()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetDisplayClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#getTargetFooterClass <em>Target Footer Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Footer Class</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#getTargetFooterClass()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetFooterClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Association#isPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Association#isPseudo()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Pseudo();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute#getAttribute()
	 * @see #getModelLabelAttribute()
	 * @generated
	 */
	EReference getModelLabelAttribute_Attribute();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation <em>Model Label Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Label Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation
	 * @generated
	 */
	EClass getModelLabelAssociation();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getAssociation()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EReference getModelLabelAssociation_Association();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getDynamicLabel <em>Dynamic Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Label</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getDynamicLabel()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EReference getModelLabelAssociation_DynamicLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#isIsSourceAssociation <em>Is Source Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Source Association</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#isIsSourceAssociation()
	 * @see #getModelLabelAssociation()
	 * @generated
	 */
	EAttribute getModelLabelAssociation_IsSourceAssociation();

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
	 * Returns the meta object for the reference list '{@link work.andycarpenter.webgen.pims.persistence.Entity#getContainerUnique <em>Container Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Unique</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getContainerUnique()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ContainerUnique();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.Entity#isAllowFormTypeCustomisation <em>Allow Form Type Customisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Form Type Customisation</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#isAllowFormTypeCustomisation()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_AllowFormTypeCustomisation();

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
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute <em>Resource Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute
	 * @generated
	 */
	EClass getResourceAttribute();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getMaximumUploadSize <em>Maximum Upload Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Upload Size</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getMaximumUploadSize()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_MaximumUploadSize();

	/**
	 * Returns the meta object for the attribute list '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getValidUploadMimeTypes <em>Valid Upload Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Mime Types</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getValidUploadMimeTypes()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_ValidUploadMimeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getValidUploadExtensions <em>Valid Upload Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Upload Extensions</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getValidUploadExtensions()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_ValidUploadExtensions();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute#isUploadsWithinWebsite <em>Uploads Within Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uploads Within Website</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute#isUploadsWithinWebsite()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EAttribute getResourceAttribute_UploadsWithinWebsite();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getUploadPath <em>Upload Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upload Path</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute#getUploadPath()
	 * @see #getResourceAttribute()
	 * @generated
	 */
	EReference getResourceAttribute_UploadPath();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.PathElement
	 * @generated
	 */
	EClass getPathElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.StaticPathElement <em>Static Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.StaticPathElement
	 * @generated
	 */
	EClass getStaticPathElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.StaticPathElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.StaticPathElement#getElement()
	 * @see #getStaticPathElement()
	 * @generated
	 */
	EAttribute getStaticPathElement_Element();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.DatePathElement <em>Date Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Path Element</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DatePathElement
	 * @generated
	 */
	EClass getDatePathElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.persistence.DatePathElement#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.DatePathElement#getFormat()
	 * @see #getDatePathElement()
	 * @generated
	 */
	EAttribute getDatePathElement_Format();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.FileAttribute <em>File Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.FileAttribute
	 * @generated
	 */
	EClass getFileAttribute();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.persistence.ImageAttribute <em>Image Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Attribute</em>'.
	 * @see work.andycarpenter.webgen.pims.persistence.ImageAttribute
	 * @generated
	 */
	EClass getImageAttribute();

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
		 * The meta object literal for the '<em><b>Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__HEADER_CLASS = eINSTANCE.getFeature_HeaderClass();

		/**
		 * The meta object literal for the '<em><b>Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DISPLAY_CLASS = eINSTANCE.getFeature_DisplayClass();

		/**
		 * The meta object literal for the '<em><b>Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__FOOTER_CLASS = eINSTANCE.getFeature_FooterClass();

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
		 * The meta object literal for the '<em><b>Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__PERSISTENT_TYPE = eINSTANCE.getAttribute_PersistentType();

		/**
		 * The meta object literal for the '<em><b>Orm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ORM_TYPE = eINSTANCE.getAttribute_OrmType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__INTERFACE_TYPE = eINSTANCE.getAttribute_InterfaceType();

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
		 * The meta object literal for the '<em><b>Target Header Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_HEADER_CLASS = eINSTANCE.getAssociation_TargetHeaderClass();

		/**
		 * The meta object literal for the '<em><b>Target Input Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_INPUT_CLASS = eINSTANCE.getAssociation_TargetInputClass();

		/**
		 * The meta object literal for the '<em><b>Target Display Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_DISPLAY_CLASS = eINSTANCE.getAssociation_TargetDisplayClass();

		/**
		 * The meta object literal for the '<em><b>Target Footer Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_FOOTER_CLASS = eINSTANCE.getAssociation_TargetFooterClass();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__PSEUDO = eINSTANCE.getAssociation_Pseudo();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ModelLabelFeatureImpl <em>Model Label Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ModelLabelFeatureImpl
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
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getModelLabelAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL_ATTRIBUTE__DATE_FORMAT = eINSTANCE.getModelLabelAttribute_DateFormat();

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
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ASSOCIATION__ASSOCIATION = eINSTANCE.getModelLabelAssociation_Association();

		/**
		 * The meta object literal for the '<em><b>Dynamic Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL = eINSTANCE.getModelLabelAssociation_DynamicLabel();

		/**
		 * The meta object literal for the '<em><b>Is Source Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION = eINSTANCE.getModelLabelAssociation_IsSourceAssociation();

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
		 * The meta object literal for the '<em><b>Container Unique</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONTAINER_UNIQUE = eINSTANCE.getEntity_ContainerUnique();

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
		 * The meta object literal for the '<em><b>Allow Form Type Customisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ALLOW_FORM_TYPE_CUSTOMISATION = eINSTANCE.getEntity_AllowFormTypeCustomisation();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl <em>Resource Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ResourceAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getResourceAttribute()
		 * @generated
		 */
		EClass RESOURCE_ATTRIBUTE = eINSTANCE.getResourceAttribute();

		/**
		 * The meta object literal for the '<em><b>Maximum Upload Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE = eINSTANCE.getResourceAttribute_MaximumUploadSize();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES = eINSTANCE.getResourceAttribute_ValidUploadMimeTypes();

		/**
		 * The meta object literal for the '<em><b>Valid Upload Extensions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS = eINSTANCE.getResourceAttribute_ValidUploadExtensions();

		/**
		 * The meta object literal for the '<em><b>Uploads Within Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE = eINSTANCE.getResourceAttribute_UploadsWithinWebsite();

		/**
		 * The meta object literal for the '<em><b>Upload Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ATTRIBUTE__UPLOAD_PATH = eINSTANCE.getResourceAttribute_UploadPath();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.PathElementImpl <em>Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getPathElement()
		 * @generated
		 */
		EClass PATH_ELEMENT = eINSTANCE.getPathElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.StaticPathElementImpl <em>Static Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.StaticPathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getStaticPathElement()
		 * @generated
		 */
		EClass STATIC_PATH_ELEMENT = eINSTANCE.getStaticPathElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_PATH_ELEMENT__ELEMENT = eINSTANCE.getStaticPathElement_Element();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.DatePathElementImpl <em>Date Path Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.DatePathElementImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getDatePathElement()
		 * @generated
		 */
		EClass DATE_PATH_ELEMENT = eINSTANCE.getDatePathElement();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PATH_ELEMENT__FORMAT = eINSTANCE.getDatePathElement_Format();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.FileAttributeImpl <em>File Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.FileAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getFileAttribute()
		 * @generated
		 */
		EClass FILE_ATTRIBUTE = eINSTANCE.getFileAttribute();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.persistence.impl.ImageAttributeImpl <em>Image Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.persistence.impl.ImageAttributeImpl
		 * @see work.andycarpenter.webgen.pims.persistence.impl.PersistencePackageImpl#getImageAttribute()
		 * @generated
		 */
		EClass IMAGE_ATTRIBUTE = eINSTANCE.getImageAttribute();

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
