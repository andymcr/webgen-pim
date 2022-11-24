/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathVariable#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.PathVariable#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathVariable()
 * @model abstract="true"
 * @generated
 */
public interface PathVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Use Container As Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Container As Context</em>' attribute.
	 * @see #setUseContainerAsContext(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathVariable_UseContainerAsContext()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUseContainerAsContext();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.PathVariable#isUseContainerAsContext <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Container As Context</em>' attribute.
	 * @see #isUseContainerAsContext()
	 * @generated
	 */
	void setUseContainerAsContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getPathVariable_Context()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let contentType : persistence::Entity\n\t= if self.rootContainer.oclIsKindOf(DynamicUnit) then\n\t\t\tself.rootContainer.oclAsType(DynamicUnit).contentType\n\t\telse if self.rootContainer.oclIsKindOf(UnitField) then\n\t\t\tself.rootContainer.oclAsType(UnitField).displayedOn.contentType\n\t\telse if self.rootContainer.oclIsKindOf(Badge) then\n\t\t\tself.rootContainer.oclAsType(Badge).displayedOn.contentType\n\t\telse if self.rootContainer.oclIsKindOf(Action) then\n\t\t\tself.rootContainer.oclAsType(Action).parentUnit.contentType\n\t\telse\n\t\t\tnull\n\t\tendif endif endif endif\n\tin if useContainerAsContext = true then\n\t\t\tcontentType.containingType\n\t\telse\n\t\t\tcontentType\n\t\tendif'"
	 * @generated
	 */
	Entity getContext();

} // PathVariable
