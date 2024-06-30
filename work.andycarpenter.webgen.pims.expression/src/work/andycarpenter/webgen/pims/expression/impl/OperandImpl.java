/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.Operand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OperandImpl extends ExpressionImpl implements Operand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.OPERAND;
	}

} //OperandImpl
