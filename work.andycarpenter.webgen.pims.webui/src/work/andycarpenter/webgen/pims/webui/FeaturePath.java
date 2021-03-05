/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePath#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePath#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePath()
 * @model abstract="true"
 * @generated
 */
public interface FeaturePath extends Variable {

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePath_ContainingType()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if rootContainer.oclIsKindOf(DynamicUnit) then\n\tif useContainerAsContext then\n\t\trootContainer.oclAsType(DynamicUnit).containingType\n\telse\n\t\trootContainer.oclAsType(DynamicUnit).contentType\n\tendif\nelse\n\tlet directType : persistence::Entity\n\t\t= if rootContainer.oclIsKindOf(UnitField) then\n\t\t\t\trootContainer.oclAsType(UnitField).displayedOn.contentType\n\t\t\telse if rootContainer.oclIsKindOf(Action) then\n\t\t\t\trootContainer.oclAsType(Action).containingType\n\t\t\telse if rootContainer.oclIsTypeOf(Badge) then\n\t\t\t\trootContainer.oclAsType(Badge).displayedOn.contentType\n\t\t\telse\n\t\t\t\tnull\n\t\t\tendif endif endif\n\t\tin if useContainerAsContext then\n\t\t\t\tif directType.oclIsUndefined() then\n\t\t\t\t\tnull\n\t\t\t\telse\n\t\t\t\t\tdirectType.containingType\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tdirectType\n\t\t\tendif\nendif'"
	 * @generated
	 */
	Entity getContainingType();

	/**
	 * Returns the value of the '<em><b>Use Container As Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Container As Context</em>' attribute.
	 * @see #setUseContainerAsContext(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePath_UseContainerAsContext()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseContainerAsContext();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.FeaturePath#isUseContainerAsContext <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Container As Context</em>' attribute.
	 * @see #isUseContainerAsContext()
	 * @generated
	 */
	void setUseContainerAsContext(boolean value);
} // FeaturePath
