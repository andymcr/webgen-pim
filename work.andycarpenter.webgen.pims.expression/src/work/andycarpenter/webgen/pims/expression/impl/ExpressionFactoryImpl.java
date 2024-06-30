/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import work.andycarpenter.webgen.pims.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try {
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
			if (theExpressionFactory != null) {
				return theExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionPackage.PREDICATE_BOOLEAN_VARIABLE: return createPredicateBooleanVariable();
			case ExpressionPackage.PREDICATE_BOOLEAN_OPERATOR: return createPredicateBooleanOperator();
			case ExpressionPackage.PREDICATE_EQUALITY_OPERATOR: return createPredicateEqualityOperator();
			case ExpressionPackage.PREDICATE_COMPARISON_OPERATOR: return createPredicateComparisonOperator();
			case ExpressionPackage.PREDICATE_IN_OPERATOR: return createPredicateInOperator();
			case ExpressionPackage.PREDICATE_IS_OPERATOR: return createPredicateIsOperator();
			case ExpressionPackage.PREDICATE_LIKE_OPERATOR: return createPredicateLikeOperator();
			case ExpressionPackage.PREDICATE_IS_EMPTY: return createPredicateIsEmpty();
			case ExpressionPackage.PREDICATE_IS_NULL: return createPredicateIsNull();
			case ExpressionPackage.ARITHMETIC_OPERATION: return createArithmeticOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExpressionPackage.ARITHMETIC_OPERATOR:
				return createArithmeticOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.COMPARISION_OPERATOR:
				return createComparisionOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExpressionPackage.ARITHMETIC_OPERATOR:
				return convertArithmeticOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.COMPARISION_OPERATOR:
				return convertComparisionOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateBooleanVariable createPredicateBooleanVariable() {
		PredicateBooleanVariableImpl predicateBooleanVariable = new PredicateBooleanVariableImpl();
		return predicateBooleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateBooleanOperator createPredicateBooleanOperator() {
		PredicateBooleanOperatorImpl predicateBooleanOperator = new PredicateBooleanOperatorImpl();
		return predicateBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateEqualityOperator createPredicateEqualityOperator() {
		PredicateEqualityOperatorImpl predicateEqualityOperator = new PredicateEqualityOperatorImpl();
		return predicateEqualityOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateComparisonOperator createPredicateComparisonOperator() {
		PredicateComparisonOperatorImpl predicateComparisonOperator = new PredicateComparisonOperatorImpl();
		return predicateComparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateInOperator createPredicateInOperator() {
		PredicateInOperatorImpl predicateInOperator = new PredicateInOperatorImpl();
		return predicateInOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateIsOperator createPredicateIsOperator() {
		PredicateIsOperatorImpl predicateIsOperator = new PredicateIsOperatorImpl();
		return predicateIsOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateLikeOperator createPredicateLikeOperator() {
		PredicateLikeOperatorImpl predicateLikeOperator = new PredicateLikeOperatorImpl();
		return predicateLikeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateIsEmpty createPredicateIsEmpty() {
		PredicateIsEmptyImpl predicateIsEmpty = new PredicateIsEmptyImpl();
		return predicateIsEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredicateIsNull createPredicateIsNull() {
		PredicateIsNullImpl predicateIsNull = new PredicateIsNullImpl();
		return predicateIsNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArithmeticOperation createArithmeticOperation() {
		ArithmeticOperationImpl arithmeticOperation = new ArithmeticOperationImpl();
		return arithmeticOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperator createArithmeticOperatorFromString(EDataType eDataType, String initialValue) {
		ArithmeticOperator result = ArithmeticOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisionOperator createComparisionOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisionOperator result = ComparisionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
