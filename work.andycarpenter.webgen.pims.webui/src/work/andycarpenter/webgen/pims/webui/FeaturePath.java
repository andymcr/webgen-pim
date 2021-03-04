/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePath#getContainingTypes <em>Containing Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.FeaturePath#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePath()
 * @model abstract="true"
 * @generated
 */
public interface FeaturePath extends Variable {

	/**
	 * Returns the value of the '<em><b>Containing Types</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Types</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getFeaturePath_ContainingTypes()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='let directTypes : OrderedSet(persistence::Entity)\n\t= if rootContainer.oclIsKindOf(DynamicUnit) then\n\t\t\trootContainer.oclAsType(DynamicUnit).contentTypes\n\t\telse if rootContainer.oclIsKindOf(UnitField) then\n\t\t\trootContainer.oclAsType(UnitField).displayedOn.contentTypes\n\t\telse if rootContainer.oclIsKindOf(Action) then\n\t\t\trootContainer.oclAsType(Action).containingTypes\n\t\telse if rootContainer.oclIsTypeOf(Badge) then\n\t\t\trootContainer.oclAsType(Badge).displayedOn.contentTypes\n\t\telse\n\t\t\tOrderedSet{}\n\t\tendif endif endif endif\n\tin if useContainerAsContext then\n\t\t\tdirectTypes\n\t\t\t\t-&gt;select(e | not e.containingAssociation.oclIsUndefined())\n\t\t\t\t-&gt;collect(e | e.containingType)\n\t\t\t\t-&gt;asOrderedSet()\n\t\telse\n\t\t\tdirectTypes\n\t\tendif'"
	 * @generated
	 */
	EList<Entity> getContainingTypes();

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
