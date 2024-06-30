/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.Literal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralImpl extends OperandImpl implements Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.LITERAL;
	}

} //LiteralImpl
