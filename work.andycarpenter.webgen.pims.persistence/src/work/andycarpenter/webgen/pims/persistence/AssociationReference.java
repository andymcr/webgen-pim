/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationReference()
 * @model abstract="true"
 * @generated
 */
public interface AssociationReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationReference_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\t\'\'\nelse\n\tassociation.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationReference_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getAssociation <em>Association</em>}' reference.
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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationReference_ValueDisplay()
	 * @model
	 * @generated
	 */
	ModelLabel getValueDisplay();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.FeatureChildPath#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(FeatureChildPath)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getAssociationReference_ChildFeature()
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureChildPath#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	FeatureChildPath getChildFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(FeatureChildPath value);

} // AssociationReference
