/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Variable Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#getReferencableEntities <em>Referencable Entities</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureVariableContext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FeatureVariableContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Referencable Entities</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencable Entities</em>' reference list.
	 * @see #isSetReferencableEntities()
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getFeatureVariableContext_ReferencableEntities()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='referencableEntities()'"
	 * @generated
	 */
	EList<Entity> getReferencableEntities();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.persistence.FeatureVariableContext#getReferencableEntities <em>Referencable Entities</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referencable Entities</em>' reference list is set.
	 * @see #getReferencableEntities()
	 * @generated
	 */
	boolean isSetReferencableEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Entity> referencableEntities();

} // FeatureVariableContext
