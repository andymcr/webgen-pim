/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Order#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Order#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getOrder()
 * @model abstract="true"
 * @generated
 */
public interface Order extends FeatureVariableContext {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Selection#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' container reference.
	 * @see #setSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getOrder_Selection()
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getOrdering
	 * @model opposite="ordering" required="true" transient="false"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Order#getSelection <em>Selection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' container reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(AttributeVariable)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getOrder_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeVariable getAttribute();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Order#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='selection.referencableEntities()'"
	 * @generated
	 */
	EList<Entity> referencableEntities();

} // Order
