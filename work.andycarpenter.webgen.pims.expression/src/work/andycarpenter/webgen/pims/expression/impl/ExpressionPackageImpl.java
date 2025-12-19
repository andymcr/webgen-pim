/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import work.andycarpenter.webgen.pims.expression.ArithmeticOperation;
import work.andycarpenter.webgen.pims.expression.ArithmeticOperator;
import work.andycarpenter.webgen.pims.expression.BooleanOperator;
import work.andycarpenter.webgen.pims.expression.ComparisionOperator;
import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.ExpressionFactory;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.Literal;
import work.andycarpenter.webgen.pims.expression.Operand;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.expression.PredicateBooleanOperator;
import work.andycarpenter.webgen.pims.expression.PredicateBooleanVariable;
import work.andycarpenter.webgen.pims.expression.PredicateComparisonOperator;
import work.andycarpenter.webgen.pims.expression.PredicateEqualityOperator;
import work.andycarpenter.webgen.pims.expression.PredicateInOperator;
import work.andycarpenter.webgen.pims.expression.PredicateIsEmpty;
import work.andycarpenter.webgen.pims.expression.PredicateIsMemberOf;
import work.andycarpenter.webgen.pims.expression.PredicateIsNull;
import work.andycarpenter.webgen.pims.expression.PredicateIsOperator;
import work.andycarpenter.webgen.pims.expression.PredicateLikeOperator;
import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateBooleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEqualityOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateComparisonOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateInOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateLikeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsMemberOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisionOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited) return (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpressionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpressionPackageImpl theExpressionPackage = registeredExpressionPackage instanceof ExpressionPackageImpl ? (ExpressionPackageImpl)registeredExpressionPackage : new ExpressionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_RootContainer() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicate_Negated() {
		return (EAttribute)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateBooleanVariable() {
		return predicateBooleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateBooleanVariable_Variable() {
		return (EReference)predicateBooleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateBooleanOperator() {
		return predicateBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateBooleanOperator_Predicates() {
		return (EReference)predicateBooleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicateBooleanOperator_Operator() {
		return (EAttribute)predicateBooleanOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateEqualityOperator() {
		return predicateEqualityOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateEqualityOperator_Left() {
		return (EReference)predicateEqualityOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateEqualityOperator_Right() {
		return (EReference)predicateEqualityOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateComparisonOperator() {
		return predicateComparisonOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateComparisonOperator_Left() {
		return (EReference)predicateComparisonOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicateComparisonOperator_Operator() {
		return (EAttribute)predicateComparisonOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateComparisonOperator_Right() {
		return (EReference)predicateComparisonOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateInOperator() {
		return predicateInOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateInOperator_Left() {
		return (EReference)predicateInOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateInOperator_Right() {
		return (EReference)predicateInOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateIsOperator() {
		return predicateIsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsOperator_Left() {
		return (EReference)predicateIsOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsOperator_Right() {
		return (EReference)predicateIsOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateLikeOperator() {
		return predicateLikeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateLikeOperator_Left() {
		return (EReference)predicateLikeOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateLikeOperator_Right() {
		return (EReference)predicateLikeOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateIsEmpty() {
		return predicateIsEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsEmpty_Value() {
		return (EReference)predicateIsEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateIsMemberOf() {
		return predicateIsMemberOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsMemberOf_Left() {
		return (EReference)predicateIsMemberOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsMemberOf_Right() {
		return (EReference)predicateIsMemberOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateIsNull() {
		return predicateIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateIsNull_Value() {
		return (EReference)predicateIsNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArithmeticOperation() {
		return arithmeticOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArithmeticOperation_Operands() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArithmeticOperation_Operator() {
		return (EAttribute)arithmeticOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparisionOperator() {
		return comparisionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__ROOT_CONTAINER);

		operandEClass = createEClass(OPERAND);

		literalEClass = createEClass(LITERAL);

		variableEClass = createEClass(VARIABLE);

		predicateEClass = createEClass(PREDICATE);
		createEAttribute(predicateEClass, PREDICATE__NEGATED);

		predicateBooleanOperatorEClass = createEClass(PREDICATE_BOOLEAN_OPERATOR);
		createEReference(predicateBooleanOperatorEClass, PREDICATE_BOOLEAN_OPERATOR__PREDICATES);
		createEAttribute(predicateBooleanOperatorEClass, PREDICATE_BOOLEAN_OPERATOR__OPERATOR);

		predicateBooleanVariableEClass = createEClass(PREDICATE_BOOLEAN_VARIABLE);
		createEReference(predicateBooleanVariableEClass, PREDICATE_BOOLEAN_VARIABLE__VARIABLE);

		predicateComparisonOperatorEClass = createEClass(PREDICATE_COMPARISON_OPERATOR);
		createEReference(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__LEFT);
		createEAttribute(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__OPERATOR);
		createEReference(predicateComparisonOperatorEClass, PREDICATE_COMPARISON_OPERATOR__RIGHT);

		predicateEqualityOperatorEClass = createEClass(PREDICATE_EQUALITY_OPERATOR);
		createEReference(predicateEqualityOperatorEClass, PREDICATE_EQUALITY_OPERATOR__LEFT);
		createEReference(predicateEqualityOperatorEClass, PREDICATE_EQUALITY_OPERATOR__RIGHT);

		predicateInOperatorEClass = createEClass(PREDICATE_IN_OPERATOR);
		createEReference(predicateInOperatorEClass, PREDICATE_IN_OPERATOR__LEFT);
		createEReference(predicateInOperatorEClass, PREDICATE_IN_OPERATOR__RIGHT);

		predicateIsOperatorEClass = createEClass(PREDICATE_IS_OPERATOR);
		createEReference(predicateIsOperatorEClass, PREDICATE_IS_OPERATOR__LEFT);
		createEReference(predicateIsOperatorEClass, PREDICATE_IS_OPERATOR__RIGHT);

		predicateIsEmptyEClass = createEClass(PREDICATE_IS_EMPTY);
		createEReference(predicateIsEmptyEClass, PREDICATE_IS_EMPTY__VALUE);

		predicateIsMemberOfEClass = createEClass(PREDICATE_IS_MEMBER_OF);
		createEReference(predicateIsMemberOfEClass, PREDICATE_IS_MEMBER_OF__LEFT);
		createEReference(predicateIsMemberOfEClass, PREDICATE_IS_MEMBER_OF__RIGHT);

		predicateIsNullEClass = createEClass(PREDICATE_IS_NULL);
		createEReference(predicateIsNullEClass, PREDICATE_IS_NULL__VALUE);

		predicateLikeOperatorEClass = createEClass(PREDICATE_LIKE_OPERATOR);
		createEReference(predicateLikeOperatorEClass, PREDICATE_LIKE_OPERATOR__LEFT);
		createEReference(predicateLikeOperatorEClass, PREDICATE_LIKE_OPERATOR__RIGHT);

		arithmeticOperationEClass = createEClass(ARITHMETIC_OPERATION);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__OPERANDS);
		createEAttribute(arithmeticOperationEClass, ARITHMETIC_OPERATION__OPERATOR);

		// Create enums
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
		comparisionOperatorEEnum = createEEnum(COMPARISION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operandEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getOperand());
		variableEClass.getESuperTypes().add(this.getOperand());
		predicateEClass.getESuperTypes().add(this.getExpression());
		predicateBooleanOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateBooleanVariableEClass.getESuperTypes().add(this.getPredicate());
		predicateComparisonOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateEqualityOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateInOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateIsOperatorEClass.getESuperTypes().add(this.getPredicate());
		predicateIsEmptyEClass.getESuperTypes().add(this.getPredicate());
		predicateIsMemberOfEClass.getESuperTypes().add(this.getPredicate());
		predicateIsNullEClass.getESuperTypes().add(this.getPredicate());
		predicateLikeOperatorEClass.getESuperTypes().add(this.getPredicate());
		arithmeticOperationEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_RootContainer(), ecorePackage.getEObject(), null, "rootContainer", null, 0, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicate_Negated(), ecorePackage.getEBoolean(), "negated", "false", 0, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateBooleanOperatorEClass, PredicateBooleanOperator.class, "PredicateBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateBooleanOperator_Predicates(), this.getPredicate(), null, "predicates", null, 2, -1, PredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateBooleanOperator_Operator(), this.getBooleanOperator(), "operator", "And", 1, 1, PredicateBooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateBooleanVariableEClass, PredicateBooleanVariable.class, "PredicateBooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateBooleanVariable_Variable(), this.getVariable(), null, "variable", null, 0, 1, PredicateBooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateComparisonOperatorEClass, PredicateComparisonOperator.class, "PredicateComparisonOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateComparisonOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPredicateComparisonOperator_Operator(), this.getComparisionOperator(), "operator", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateComparisonOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateComparisonOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateEqualityOperatorEClass, PredicateEqualityOperator.class, "PredicateEqualityOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateEqualityOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateEqualityOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateEqualityOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateInOperatorEClass, PredicateInOperator.class, "PredicateInOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateInOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateInOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateInOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateInOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsOperatorEClass, PredicateIsOperator.class, "PredicateIsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsOperator_Left(), this.getExpression(), null, "left", null, 1, 1, PredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateIsOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateIsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsEmptyEClass, PredicateIsEmpty.class, "PredicateIsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsEmpty_Value(), this.getVariable(), null, "value", null, 0, 1, PredicateIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsMemberOfEClass, PredicateIsMemberOf.class, "PredicateIsMemberOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsMemberOf_Left(), this.getVariable(), null, "left", null, 1, 1, PredicateIsMemberOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateIsMemberOf_Right(), this.getVariable(), null, "right", null, 1, 1, PredicateIsMemberOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateIsNullEClass, PredicateIsNull.class, "PredicateIsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateIsNull_Value(), this.getVariable(), null, "value", null, 0, 1, PredicateIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateLikeOperatorEClass, PredicateLikeOperator.class, "PredicateLikeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicateLikeOperator_Left(), this.getVariable(), null, "left", null, 1, 1, PredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateLikeOperator_Right(), this.getExpression(), null, "right", null, 1, 1, PredicateLikeOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticOperationEClass, ArithmeticOperation.class, "ArithmeticOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticOperation_Operands(), this.getExpression(), null, "operands", null, 2, -1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArithmeticOperation_Operator(), this.getArithmeticOperator(), "operator", null, 1, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.ADD);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SUBTRACT);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULTIPLY);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVIDE);

		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);

		initEEnum(comparisionOperatorEEnum, ComparisionOperator.class, "ComparisionOperator");
		addEEnumLiteral(comparisionOperatorEEnum, ComparisionOperator.GREATER_THAN);
		addEEnumLiteral(comparisionOperatorEEnum, ComparisionOperator.LESS_THAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (getExpression_RootContainer(),
		   source,
		   new String[] {
			   "derivation", "if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Expression) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Expression).rootContainer\nelse\n\tself.oclAsType(ecore::EObject).eContainer()\nendif"
		   });
	}

} //ExpressionPackageImpl
