/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Path#getContainingType <em>Containing Type</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPath()
 * @model abstract="true"
 * @generated
 */
public interface Path extends EObject {

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPath_ContainingType()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(ChildPath) then\n\tself.oclAsType(ChildPath).parent.targetEntity\nelse if self.oclIsTypeOf(UnitAssociation) then\n\tself.oclAsType(UnitAssociation).displayedOn.contentType\nelse if self.oclIsKindOf(PathVariable) then\n\tlet variable : PathVariable\n\t\t= self.oclAsType(PathVariable)\n\t\tin let contentType : persistence::Entity\n\t\t\t= if variable .rootContainer.oclIsKindOf(DynamicUnit) then\n\t\t\t\t\tvariable .rootContainer.oclAsType(DynamicUnit).contentType\n\t\t\t\telse if variable .rootContainer.oclIsKindOf(UnitField) then\n\t\t\t\t\tvariable .rootContainer.oclAsType(UnitField).displayedOn.contentType\n\t\t\t\telse if variable .rootContainer.oclIsKindOf(Badge) then\n\t\t\t\t\tvariable .rootContainer.oclAsType(Badge).displayedOn.contentType\n\t\t\t\telse if variable .rootContainer.oclIsKindOf(Action) then\n\t\t\t\t\tvariable .rootContainer.oclAsType(Action).parentUnit.contentType\n\t\t\t\telse\n\t\t\t\t\tnull\n\t\t\t\tendif endif endif endif\n\t\t\tin if variable.useContainerAsContext = true then\n\t\t\t\t\tcontentType.containingType\n\t\t\t\telse\n\t\t\t\t\tcontentType\n\t\t\t\tendif\nelse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(DynamicUnit) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(DynamicUnit).contentType\nelse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(SelectAction) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(SelectAction).parentUnit.contentType\nelse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Badge) then\n\tself.oclAsType(ecore::EObject).eContainer().oclAsType(Badge).displayedOn.contentType\nelse if self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(Message) then\n\tnull -- self.oclAsType(ecore::EObject).eContainer().oclAsType(Message).contentType\nelse\n\tnull\nendif endif endif endif endif endif endif'"
	 * @generated
	 */
	Entity getContainingType();
} // Path
