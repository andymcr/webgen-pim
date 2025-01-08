/**
 */
package work.andycarpenter.webgen.pims.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see work.andycarpenter.webgen.pims.base.BaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/pim/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen_base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = work.andycarpenter.webgen.pims.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.NullLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__ROOT_CONTAINER = ExpressionPackage.LITERAL__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.BooleanLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ROOT_CONTAINER = ExpressionPackage.LITERAL__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.IntegerLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__ROOT_CONTAINER = ExpressionPackage.LITERAL__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.StringLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ROOT_CONTAINER = ExpressionPackage.LITERAL__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.TimeLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getTimeLiteral()
	 * @generated
	 */
	int TIME_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__ROOT_CONTAINER = ExpressionPackage.LITERAL__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.NamedElementImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNamedDisplayElement()
	 * @generated
	 */
	int NAMED_DISPLAY_ELEMENT = 8;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.ClassifierImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 9;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.DataTypeImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 10;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.EnumerationTypeImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.EnumerationLiteralImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 12;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.CurrentTimeImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCurrentTime()
	 * @generated
	 */
	int CURRENT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME__ROOT_CONTAINER = ExpressionPackage.VARIABLE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME__FORMAT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.CurrentUserImpl <em>Current User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.CurrentUserImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCurrentUser()
	 * @generated
	 */
	int CURRENT_USER = 6;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__ROOT_CONTAINER = ExpressionPackage.VARIABLE__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DISPLAY_LABEL = CLASSIFIER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PERSISTENT_TYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ORM_TYPE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__WAF_TYPE = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INTERFACE_TYPE = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VALIDATION_PATTERN = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DISPLAY_LABEL = DATA_TYPE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Persistent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__PERSISTENT_TYPE = DATA_TYPE__PERSISTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Orm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ORM_TYPE = DATA_TYPE__ORM_TYPE;

	/**
	 * The feature id for the '<em><b>Waf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__WAF_TYPE = DATA_TYPE__WAF_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INTERFACE_TYPE = DATA_TYPE__INTERFACE_TYPE;

	/**
	 * The feature id for the '<em><b>Validation Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__VALIDATION_PATTERN = DATA_TYPE__VALIDATION_PATTERN;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ENUMERATIONS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.FormalParameterList <em>Formal Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.FormalParameterList
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getFormalParameterList()
	 * @generated
	 */
	int FORMAL_PARAMETER_LIST = 13;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.FormalParameterImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formal For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__FORMAL_FOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__PLACEHOLDER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl <em>Reduce Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getReduceFunction()
	 * @generated
	 */
	int REDUCE_FUNCTION = 16;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.SizeFunctionImpl <em>Size Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.SizeFunctionImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getSizeFunction()
	 * @generated
	 */
	int SIZE_FUNCTION = 17;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.base.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.base.impl.CallableImpl
	 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 15;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__PARAMETERS = FORMAL_PARAMETER_LIST__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__ROOT_CONTAINER = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__BODY = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = FORMAL_PARAMETER_LIST_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_OPERATION_COUNT = FORMAL_PARAMETER_LIST_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION__ROOT_CONTAINER = ExpressionPackage.OPERAND__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION__VALUE = ExpressionPackage.OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION__CALLBACK = ExpressionPackage.OPERAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION__INITIAL = ExpressionPackage.OPERAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reduce Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION_FEATURE_COUNT = ExpressionPackage.OPERAND_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reduce Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_FUNCTION_OPERATION_COUNT = ExpressionPackage.OPERAND_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FUNCTION__ROOT_CONTAINER = ExpressionPackage.OPERAND__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FUNCTION__VALUE = ExpressionPackage.OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Size Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FUNCTION_FEATURE_COUNT = ExpressionPackage.OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Size Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FUNCTION_OPERATION_COUNT = ExpressionPackage.OPERAND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.TimeLiteral <em>Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.TimeLiteral
	 * @generated
	 */
	EClass getTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.TimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.TimeLiteral#getValue()
	 * @see #getTimeLiteral()
	 * @generated
	 */
	EAttribute getTimeLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see work.andycarpenter.webgen.pims.base.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.webgen.pims.base.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Display Element</em>'.
	 * @see work.andycarpenter.webgen.pims.base.NamedDisplayElement
	 * @generated
	 */
	EClass getNamedDisplayElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see work.andycarpenter.webgen.pims.base.NamedDisplayElement#getDisplayLabel()
	 * @see #getNamedDisplayElement()
	 * @generated
	 */
	EAttribute getNamedDisplayElement_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see work.andycarpenter.webgen.pims.base.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.DataType#getPersistentType <em>Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType#getPersistentType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_PersistentType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.DataType#getOrmType <em>Orm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orm Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType#getOrmType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_OrmType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.DataType#getWafType <em>Waf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waf Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType#getWafType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_WafType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.DataType#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType#getInterfaceType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.DataType#getValidationPattern <em>Validation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Pattern</em>'.
	 * @see work.andycarpenter.webgen.pims.base.DataType#getValidationPattern()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_ValidationPattern();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.base.EnumerationType#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see work.andycarpenter.webgen.pims.base.EnumerationType#getEnumerations()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Enumerations();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.base.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.CurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time</em>'.
	 * @see work.andycarpenter.webgen.pims.base.CurrentTime
	 * @generated
	 */
	EClass getCurrentTime();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.CurrentTime#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see work.andycarpenter.webgen.pims.base.CurrentTime#getFormat()
	 * @see #getCurrentTime()
	 * @generated
	 */
	EAttribute getCurrentTime_Format();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User</em>'.
	 * @see work.andycarpenter.webgen.pims.base.CurrentUser
	 * @generated
	 */
	EClass getCurrentUser();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter List</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameterList
	 * @generated
	 */
	EClass getFormalParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.base.FormalParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameterList#getParameters()
	 * @see #getFormalParameterList()
	 * @generated
	 */
	EReference getFormalParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getFormalFor <em>Formal For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formal For</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getFormalFor()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_FormalFor();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getDefaultValue()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getDataType()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_DataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getPlaceholder()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.base.FormalParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameter#getDescription()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Description();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.ReduceFunction <em>Reduce Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Function</em>'.
	 * @see work.andycarpenter.webgen.pims.base.ReduceFunction
	 * @generated
	 */
	EClass getReduceFunction();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.ReduceFunction#getValue()
	 * @see #getReduceFunction()
	 * @generated
	 */
	EReference getReduceFunction_Value();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callback</em>'.
	 * @see work.andycarpenter.webgen.pims.base.ReduceFunction#getCallback()
	 * @see #getReduceFunction()
	 * @generated
	 */
	EReference getReduceFunction_Callback();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.base.ReduceFunction#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see work.andycarpenter.webgen.pims.base.ReduceFunction#getInitial()
	 * @see #getReduceFunction()
	 * @generated
	 */
	EReference getReduceFunction_Initial();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.SizeFunction <em>Size Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Function</em>'.
	 * @see work.andycarpenter.webgen.pims.base.SizeFunction
	 * @generated
	 */
	EClass getSizeFunction();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.base.SizeFunction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.base.SizeFunction#getValue()
	 * @see #getSizeFunction()
	 * @generated
	 */
	EReference getSizeFunction_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.base.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see work.andycarpenter.webgen.pims.base.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.base.Callable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see work.andycarpenter.webgen.pims.base.Callable#getBody()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.NullLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.BooleanLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.IntegerLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.StringLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.TimeLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getTimeLiteral()
		 * @generated
		 */
		EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LITERAL__VALUE = eINSTANCE.getTimeLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.NamedElementImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getNamedDisplayElement()
		 * @generated
		 */
		EClass NAMED_DISPLAY_ELEMENT = eINSTANCE.getNamedDisplayElement();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = eINSTANCE.getNamedDisplayElement_DisplayLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.ClassifierImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.DataTypeImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Persistent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PERSISTENT_TYPE = eINSTANCE.getDataType_PersistentType();

		/**
		 * The meta object literal for the '<em><b>Orm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ORM_TYPE = eINSTANCE.getDataType_OrmType();

		/**
		 * The meta object literal for the '<em><b>Waf Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__WAF_TYPE = eINSTANCE.getDataType_WafType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__INTERFACE_TYPE = eINSTANCE.getDataType_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Validation Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__VALIDATION_PATTERN = eINSTANCE.getDataType_ValidationPattern();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.EnumerationTypeImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__ENUMERATIONS = eINSTANCE.getEnumerationType_Enumerations();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.EnumerationLiteralImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.CurrentTimeImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCurrentTime()
		 * @generated
		 */
		EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME__FORMAT = eINSTANCE.getCurrentTime_Format();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.CurrentUserImpl <em>Current User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.CurrentUserImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCurrentUser()
		 * @generated
		 */
		EClass CURRENT_USER = eINSTANCE.getCurrentUser();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.FormalParameterList <em>Formal Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.FormalParameterList
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getFormalParameterList()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getFormalParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.FormalParameterImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Formal For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__FORMAL_FOR = eINSTANCE.getFormalParameter_FormalFor();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DEFAULT_VALUE = eINSTANCE.getFormalParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__DATA_TYPE = eINSTANCE.getFormalParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__PLACEHOLDER = eINSTANCE.getFormalParameter_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DESCRIPTION = eINSTANCE.getFormalParameter_Description();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl <em>Reduce Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getReduceFunction()
		 * @generated
		 */
		EClass REDUCE_FUNCTION = eINSTANCE.getReduceFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_FUNCTION__VALUE = eINSTANCE.getReduceFunction_Value();

		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_FUNCTION__CALLBACK = eINSTANCE.getReduceFunction_Callback();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_FUNCTION__INITIAL = eINSTANCE.getReduceFunction_Initial();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.SizeFunctionImpl <em>Size Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.SizeFunctionImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getSizeFunction()
		 * @generated
		 */
		EClass SIZE_FUNCTION = eINSTANCE.getSizeFunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_FUNCTION__VALUE = eINSTANCE.getSizeFunction_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.base.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.base.impl.CallableImpl
		 * @see work.andycarpenter.webgen.pims.base.impl.BasePackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__BODY = eINSTANCE.getCallable_Body();

	}

} //BasePackage
