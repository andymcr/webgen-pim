/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Label Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelAssociation()
 * @model
 * @generated
 */
public interface ModelLabelAssociation extends ModelLabelFeature {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Value Display</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Display</em>' reference.
	 * @see #setValueDisplay(ModelLabel)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelAssociation_ValueDisplay()
	 * @model
	 * @generated
	 */
	ModelLabel getValueDisplay();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getModelLabelAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\n\tpartOf.labelFor.features-&gt;includes(association)'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

} // ModelLabelAssociation
