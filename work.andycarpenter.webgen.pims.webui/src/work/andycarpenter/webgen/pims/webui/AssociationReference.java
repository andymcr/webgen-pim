/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getAssociation <em>Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getValueDisplay <em>Value Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getChildFeature <em>Child Feature</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAssociationReference()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AssociationReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAssociationReference_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\t\'\'\nelse\n\tassociation.name\nendif\n'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAssociationReference_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getAssociation <em>Association</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Value Display</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Display</em>' reference.
	 * @see #setValueDisplay(ModelLabel)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAssociationReference_ValueDisplay()
	 * @model ordered="false"
	 * @generated
	 */
	ModelLabel getValueDisplay();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getValueDisplay <em>Value Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Display</em>' reference.
	 * @see #getValueDisplay()
	 * @generated
	 */
	void setValueDisplay(ModelLabel value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.ChildPath#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildPath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAssociationReference_ChildFeature()
	 * @see work.andycarpenter.webgen.pims.webui.ChildPath#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	ChildPath getChildFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.AssociationReference#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildPath value);

} // AssociationReference
