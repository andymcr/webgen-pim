/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see work.andycarpenter.webgen.pims.expression.ExpressionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/pim/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webgen-expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ROOT_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.OperandImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 1;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__ROOT_CONTAINER = EXPRESSION__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.LiteralImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ROOT_CONTAINER = OPERAND__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.VariableImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ROOT_CONTAINER = OPERAND__ROOT_CONTAINER;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = OPERAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.Predicate <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.Predicate
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 4;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__ROOT_CONTAINER = EXPRESSION__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NEGATED = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanVariableImpl <em>Predicate Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanVariableImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateBooleanVariable()
	 * @generated
	 */
	int PREDICATE_BOOLEAN_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_VARIABLE__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_VARIABLE__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_VARIABLE__VARIABLE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_VARIABLE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_VARIABLE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateBooleanOperator()
	 * @generated
	 */
	int PREDICATE_BOOLEAN_OPERATOR = 6;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__PREDICATES = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_BOOLEAN_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateEqualityOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateEqualityOperator()
	 * @generated
	 */
	int PREDICATE_EQUALITY_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Equality Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EQUALITY_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateComparisonOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateComparisonOperator()
	 * @generated
	 */
	int PREDICATE_COMPARISON_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__OPERATOR = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_COMPARISON_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateInOperatorImpl <em>Predicate In Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateInOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateInOperator()
	 * @generated
	 */
	int PREDICATE_IN_OPERATOR = 9;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate In Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IN_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsOperator()
	 * @generated
	 */
	int PREDICATE_IS_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Is Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateLikeOperatorImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateLikeOperator()
	 * @generated
	 */
	int PREDICATE_LIKE_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__LEFT = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR__RIGHT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate Like Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LIKE_OPERATOR_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsEmpty()
	 * @generated
	 */
	int PREDICATE_IS_EMPTY = 12;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY__VALUE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_EMPTY_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsNullImpl <em>Predicate Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsNullImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsNull()
	 * @generated
	 */
	int PREDICATE_IS_NULL = 13;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__ROOT_CONTAINER = PREDICATE__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__NEGATED = PREDICATE__NEGATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL__VALUE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_IS_NULL_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.impl.ArithmeticOperationImpl
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getArithmeticOperation()
	 * @generated
	 */
	int ARITHMETIC_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__ROOT_CONTAINER = EXPRESSION__ROOT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__OPERANDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arithmetic Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperator
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 15;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.BooleanOperator
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 16;

	/**
	 * The meta object id for the '{@link work.andycarpenter.webgen.pims.expression.ComparisionOperator <em>Comparision Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.webgen.pims.expression.ComparisionOperator
	 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getComparisionOperator()
	 * @generated
	 */
	int COMPARISION_OPERATOR = 17;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.webgen.pims.expression.Expression#getRootContainer <em>Root Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Container</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Expression#getRootContainer()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_RootContainer();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.expression.Predicate#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.Predicate#isNegated()
	 * @see #getPredicate()
	 * @generated
	 */
	EAttribute getPredicate_Negated();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable <em>Predicate Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Boolean Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable
	 * @generated
	 */
	EClass getPredicateBooleanVariable();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable#getVariable()
	 * @see #getPredicateBooleanVariable()
	 * @generated
	 */
	EReference getPredicateBooleanVariable_Variable();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator <em>Predicate Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Boolean Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator
	 * @generated
	 */
	EClass getPredicateBooleanOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getPredicates()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EReference getPredicateBooleanOperator_Predicates();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator#getOperator()
	 * @see #getPredicateBooleanOperator()
	 * @generated
	 */
	EAttribute getPredicateBooleanOperator_Operator();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator <em>Predicate Equality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Equality Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator
	 * @generated
	 */
	EClass getPredicateEqualityOperator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator#getLeft()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator#getRight()
	 * @see #getPredicateEqualityOperator()
	 * @generated
	 */
	EReference getPredicateEqualityOperator_Right();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator <em>Predicate Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Comparison Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator
	 * @generated
	 */
	EClass getPredicateComparisonOperator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getLeft()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Left();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getOperator()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EAttribute getPredicateComparisonOperator_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator#getRight()
	 * @see #getPredicateComparisonOperator()
	 * @generated
	 */
	EReference getPredicateComparisonOperator_Right();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateInOperator <em>Predicate In Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate In Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateInOperator
	 * @generated
	 */
	EClass getPredicateInOperator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateInOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateInOperator#getLeft()
	 * @see #getPredicateInOperator()
	 * @generated
	 */
	EReference getPredicateInOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateInOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateInOperator#getRight()
	 * @see #getPredicateInOperator()
	 * @generated
	 */
	EReference getPredicateInOperator_Right();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateIsOperator <em>Predicate Is Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsOperator
	 * @generated
	 */
	EClass getPredicateIsOperator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateIsOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsOperator#getLeft()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateIsOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsOperator#getRight()
	 * @see #getPredicateIsOperator()
	 * @generated
	 */
	EReference getPredicateIsOperator_Right();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateLikeOperator <em>Predicate Like Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Like Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateLikeOperator
	 * @generated
	 */
	EClass getPredicateLikeOperator();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateLikeOperator#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateLikeOperator#getLeft()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Left();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateLikeOperator#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateLikeOperator#getRight()
	 * @see #getPredicateLikeOperator()
	 * @generated
	 */
	EReference getPredicateLikeOperator_Right();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateIsEmpty <em>Predicate Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Empty</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsEmpty
	 * @generated
	 */
	EClass getPredicateIsEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateIsEmpty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsEmpty#getValue()
	 * @see #getPredicateIsEmpty()
	 * @generated
	 */
	EReference getPredicateIsEmpty_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.PredicateIsNull <em>Predicate Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Is Null</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsNull
	 * @generated
	 */
	EClass getPredicateIsNull();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.webgen.pims.expression.PredicateIsNull#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.PredicateIsNull#getValue()
	 * @see #getPredicateIsNull()
	 * @generated
	 */
	EReference getPredicateIsNull_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation <em>Arithmetic Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operation</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperation
	 * @generated
	 */
	EClass getArithmeticOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperands()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EReference getArithmeticOperation_Operands();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperation#getOperator()
	 * @see #getArithmeticOperation()
	 * @generated
	 */
	EAttribute getArithmeticOperation_Operator();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.expression.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the meta object for enum '{@link work.andycarpenter.webgen.pims.expression.ComparisionOperator <em>Comparision Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparision Operator</em>'.
	 * @see work.andycarpenter.webgen.pims.expression.ComparisionOperator
	 * @generated
	 */
	EEnum getComparisionOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Root Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ROOT_CONTAINER = eINSTANCE.getExpression_RootContainer();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.OperandImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.LiteralImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.VariableImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.Predicate <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.Predicate
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE__NEGATED = eINSTANCE.getPredicate_Negated();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanVariableImpl <em>Predicate Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanVariableImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateBooleanVariable()
		 * @generated
		 */
		EClass PREDICATE_BOOLEAN_VARIABLE = eINSTANCE.getPredicateBooleanVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_BOOLEAN_VARIABLE__VARIABLE = eINSTANCE.getPredicateBooleanVariable_Variable();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanOperatorImpl <em>Predicate Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateBooleanOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateBooleanOperator()
		 * @generated
		 */
		EClass PREDICATE_BOOLEAN_OPERATOR = eINSTANCE.getPredicateBooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_BOOLEAN_OPERATOR__PREDICATES = eINSTANCE.getPredicateBooleanOperator_Predicates();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_BOOLEAN_OPERATOR__OPERATOR = eINSTANCE.getPredicateBooleanOperator_Operator();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateEqualityOperatorImpl <em>Predicate Equality Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateEqualityOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateEqualityOperator()
		 * @generated
		 */
		EClass PREDICATE_EQUALITY_OPERATOR = eINSTANCE.getPredicateEqualityOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__LEFT = eINSTANCE.getPredicateEqualityOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_EQUALITY_OPERATOR__RIGHT = eINSTANCE.getPredicateEqualityOperator_Right();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateComparisonOperatorImpl <em>Predicate Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateComparisonOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateComparisonOperator()
		 * @generated
		 */
		EClass PREDICATE_COMPARISON_OPERATOR = eINSTANCE.getPredicateComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__LEFT = eINSTANCE.getPredicateComparisonOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICATE_COMPARISON_OPERATOR__OPERATOR = eINSTANCE.getPredicateComparisonOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_COMPARISON_OPERATOR__RIGHT = eINSTANCE.getPredicateComparisonOperator_Right();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateInOperatorImpl <em>Predicate In Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateInOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateInOperator()
		 * @generated
		 */
		EClass PREDICATE_IN_OPERATOR = eINSTANCE.getPredicateInOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IN_OPERATOR__LEFT = eINSTANCE.getPredicateInOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IN_OPERATOR__RIGHT = eINSTANCE.getPredicateInOperator_Right();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsOperatorImpl <em>Predicate Is Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsOperator()
		 * @generated
		 */
		EClass PREDICATE_IS_OPERATOR = eINSTANCE.getPredicateIsOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__LEFT = eINSTANCE.getPredicateIsOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_OPERATOR__RIGHT = eINSTANCE.getPredicateIsOperator_Right();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateLikeOperatorImpl <em>Predicate Like Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateLikeOperatorImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateLikeOperator()
		 * @generated
		 */
		EClass PREDICATE_LIKE_OPERATOR = eINSTANCE.getPredicateLikeOperator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__LEFT = eINSTANCE.getPredicateLikeOperator_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LIKE_OPERATOR__RIGHT = eINSTANCE.getPredicateLikeOperator_Right();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl <em>Predicate Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsEmpty()
		 * @generated
		 */
		EClass PREDICATE_IS_EMPTY = eINSTANCE.getPredicateIsEmpty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_EMPTY__VALUE = eINSTANCE.getPredicateIsEmpty_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsNullImpl <em>Predicate Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.PredicateIsNullImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getPredicateIsNull()
		 * @generated
		 */
		EClass PREDICATE_IS_NULL = eINSTANCE.getPredicateIsNull();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_IS_NULL__VALUE = eINSTANCE.getPredicateIsNull_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.impl.ArithmeticOperationImpl
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getArithmeticOperation()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATION = eINSTANCE.getArithmeticOperation();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OPERATION__OPERANDS = eINSTANCE.getArithmeticOperation_Operands();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATION__OPERATOR = eINSTANCE.getArithmeticOperation_Operator();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.ArithmeticOperator
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.BooleanOperator
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.webgen.pims.expression.ComparisionOperator <em>Comparision Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.webgen.pims.expression.ComparisionOperator
		 * @see work.andycarpenter.webgen.pims.expression.impl.ExpressionPackageImpl#getComparisionOperator()
		 * @generated
		 */
		EEnum COMPARISION_OPERATOR = eINSTANCE.getComparisionOperator();

	}

} //ExpressionPackage
