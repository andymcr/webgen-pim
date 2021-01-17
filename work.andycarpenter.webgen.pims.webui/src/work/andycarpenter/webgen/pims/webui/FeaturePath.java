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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if rootContainer.oclIsKindOf(DynamicUnit) then\n\trootContainer.oclAsType(DynamicUnit).contentTypes\nelse if rootContainer.oclIsKindOf(UnitField) then\n\trootContainer.oclAsType(UnitField).displayedOn.contentTypes\nelse if rootContainer.oclIsKindOf(InlineAction) then\n\trootContainer.oclAsType(InlineAction).containingTypes\nelse if rootContainer.oclIsTypeOf(Badge) then\n\trootContainer.oclAsType(Badge).displayedOn.contentTypes\nelse\n\tOrderedSet{}\nendif endif endif endif'"
	 * @generated
	 */
	EList<Entity> getContainingTypes();
} // FeaturePath
