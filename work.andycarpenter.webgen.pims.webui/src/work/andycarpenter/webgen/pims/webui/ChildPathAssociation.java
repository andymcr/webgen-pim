/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.AssociationReference;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.FeatureChildPath;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Path Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ChildPathAssociation#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAssociation()
 * @model
 * @generated
 */
public interface ChildPathAssociation extends FeatureChildPath, AssociationReference {
	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\r\n\tif partOf.oclIsTypeOf(UnitAssociation) then\r\n\t\tpartOf.oclAsType(UnitAssociation).targetEntity.associations-&gt;includes(association)\r\n\telse if partOf.oclIsTypeOf(FeaturePathAssociation) then\r\n\t\tpartOf.oclAsType(FeaturePathAssociation).targetEntity.associations-&gt;includes(association)\r\n\telse\r\n\t\tpartOf.oclAsType(ChildPathAssociation).targetEntity.associations-&gt;includes(association)\r\n\tendif endif'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif'"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getChildPathAssociation_ContainingType()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if partOf.oclIsTypeOf(UnitAssociation) then\n\tpartOf.oclAsType(UnitAssociation).targetEntity\nelse if partOf.oclIsTypeOf(FeaturePathAssociation) then\n\tpartOf.oclAsType(FeaturePathAssociation).targetEntity\nelse\n\tpartOf.oclAsType(ChildPathAssociation).targetEntity\nendif endif'"
	 * @generated
	 */
	Entity getContainingType();

} // ChildPathAssociation
