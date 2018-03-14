/**
 */
package work.andycarpenter.webgen.pims.service;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Order#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getOrder()
 * @model abstract="true"
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Variable)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getOrder_Path()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory=''"
	 * @generated
	 */
	Variable getPath();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.Order#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Variable value);

} // Order
