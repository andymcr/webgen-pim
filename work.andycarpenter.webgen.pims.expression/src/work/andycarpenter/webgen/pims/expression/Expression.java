/**
 */
package work.andycarpenter.webgen.pims.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.Expression#getRootContainer <em>Root Container</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Container</em>' reference.
	 * @see #isSetRootContainer()
	 * @see work.andycarpenter.webgen.pims.expression.ExpressionPackage#getExpression_RootContainer()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Expression) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Expression).rootContainer\nelse\n\tself.oclAsType(ecore::EObject).eContainer()\nendif'"
	 * @generated
	 */
	EObject getRootContainer();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.expression.Expression#getRootContainer <em>Root Container</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root Container</em>' reference is set.
	 * @see #getRootContainer()
	 * @generated
	 */
	boolean isSetRootContainer();

} // Expression
