/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = work.andycarpenter.webgen.pims.expression.impl.ExpressionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Predicate Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Boolean Variable</em>'.
	 * @generated
	 */
	PredicateBooleanVariable createPredicateBooleanVariable();

	/**
	 * Returns a new object of class '<em>Predicate Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Boolean Operator</em>'.
	 * @generated
	 */
	PredicateBooleanOperator createPredicateBooleanOperator();

	/**
	 * Returns a new object of class '<em>Predicate Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Equality Operator</em>'.
	 * @generated
	 */
	PredicateEqualityOperator createPredicateEqualityOperator();

	/**
	 * Returns a new object of class '<em>Predicate Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Comparison Operator</em>'.
	 * @generated
	 */
	PredicateComparisonOperator createPredicateComparisonOperator();

	/**
	 * Returns a new object of class '<em>Predicate In Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate In Operator</em>'.
	 * @generated
	 */
	PredicateInOperator createPredicateInOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Operator</em>'.
	 * @generated
	 */
	PredicateIsOperator createPredicateIsOperator();

	/**
	 * Returns a new object of class '<em>Predicate Like Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Like Operator</em>'.
	 * @generated
	 */
	PredicateLikeOperator createPredicateLikeOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Empty</em>'.
	 * @generated
	 */
	PredicateIsEmpty createPredicateIsEmpty();

	/**
	 * Returns a new object of class '<em>Predicate Is Member Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Member Of</em>'.
	 * @generated
	 */
	PredicateIsMemberOf createPredicateIsMemberOf();

	/**
	 * Returns a new object of class '<em>Predicate Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Null</em>'.
	 * @generated
	 */
	PredicateIsNull createPredicateIsNull();

	/**
	 * Returns a new object of class '<em>Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Operation</em>'.
	 * @generated
	 */
	ArithmeticOperation createArithmeticOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
