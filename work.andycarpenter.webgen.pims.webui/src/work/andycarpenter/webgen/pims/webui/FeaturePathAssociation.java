/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePathAssociation#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathAssociation()
 * @model
 * @generated
 */
public interface FeaturePathAssociation extends FeaturePath, AssociationReference {
	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\n\tif self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(CollectionUnit) then\n\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(CollectionUnit).contentType-&gt;includes(association.partOf)\n\telse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(SingletonUnit) then\n\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(SingletonUnit).contentType = association.partOf\n\telse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(UnitField) then\n\t\tlet unit : DynamicUnit = self.oclAsType(ecore::EObject).eContainer().oclAsType(UnitField).displayedOn\n\t\t\tin if unit.oclIsKindOf(CollectionUnit) then\n\t\t\t\t\tunit.oclAsType(CollectionUnit).contentType-&gt;includes(association.partOf)\n\t\t\t\telse\n\t\t\t\t\tunit.oclAsType(SingletonUnit).contentType = association.partOf\n\t\t\t\tendif\n\telse if self.oclAsType(ecore::EObject).eContainer().oclIsTypeOf(Badge) then\n\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Badge).displayedOn.contentType-&gt;includes(self.association.partOf)\n\telse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(expression::Expression) then\n\t\tif rootContainer.oclIsKindOf(CollectionUnit) then\n\t\t\tlet collectionUnit : CollectionUnit = rootContainer.oclAsType(CollectionUnit)\n\t\t\tin if collectionUnit.containingType.oclIsUndefined() then\n\t\t\t\t\tcollectionUnit.containingType.associations-&gt;includes(association.partOf)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\telse if rootContainer.oclIsKindOf(SingletonUnit) then\n\t\t\trootContainer.oclAsType(SingletonUnit).contentType = association.partOf\n\t\telse if rootContainer.oclIsKindOf(UnitField) then\n\t\t\tlet unit : DynamicUnit = rootContainer.oclAsType(UnitField).displayedOn\n\t\t\t\tin if unit.oclIsKindOf(CollectionUnit) then\n\t\t\t\t\t\tunit.oclAsType(CollectionUnit).contentType-&gt;includes(association.partOf)\n\t\t\t\t\telse\n\t\t\t\t\t\tunit.oclAsType(SingletonUnit).contentType = association.partOf\n\t\t\t\t\tendif\n\t\telse\n\t\t\ttrue\n\t\tendif endif endif\n\telse\n\t\ttrue\n\tendif endif endif endif endif'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathAssociation_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.partOf\n\telse\n\t\tassociation.targetEntity\n\tendif\nendif'"
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePathAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif'"
	 * @generated
	 */
	Entity getTargetEntity();

} // FeaturePathAssociation
