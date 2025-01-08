/**
 */
package work.andycarpenter.webgen.pims.persistence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationSource <em>Association Source</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationTarget <em>Association Target</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationPathElement()
 * @model abstract="true"
 * @generated
 */
public interface AssociationPathElement extends PathRoot {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationPathElement_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociation <em>Association</em>}' reference.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationPathElement_ValueDisplay()
	 * @model
	 * @generated
	 */
	ModelLabel getValueDisplay();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Association Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Source</em>' reference.
	 * @see #isSetAssociationSource()
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationPathElement_AssociationSource()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation() then\n\t\tassociation.partOf\n\telse\n\t\tassociation.targetEntity\n\tendif\nendif'"
	 * @generated
	 */
	Entity getAssociationSource();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationSource <em>Association Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Association Source</em>' reference is set.
	 * @see #getAssociationSource()
	 * @generated
	 */
	boolean isSetAssociationSource();

	/**
	 * Returns the value of the '<em><b>Association Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Target</em>' reference.
	 * @see #isSetAssociationTarget()
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationPathElement_AssociationTarget()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation() then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif'"
	 * @generated
	 */
	Entity getAssociationTarget();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationPathElement#getAssociationTarget <em>Association Target</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Association Target</em>' reference is set.
	 * @see #getAssociationTarget()
	 * @generated
	 */
	boolean isSetAssociationTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSourceAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Entity leafEntity();

} // AssociationPathElement
