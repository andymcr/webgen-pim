/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getEntityFeatures <em>Entity Features</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Entity#getAssociationEnds <em>Association Ends</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featureNameUniqueWithinEntity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featureNameUniqueWithinEntity='entityFeatures-&gt;isUnique(f | f.name)'"
 * @generated
 */
public interface Entity extends EntityOrView {
	/**
	 * Returns the value of the '<em><b>Entity Features</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityFeature}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Features</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_EntityFeatures()
	 * @see work.andycarpenter.webgen.pims.persistence.EntityFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<EntityFeature> getEntityFeatures();

	/**
	 * Returns the value of the '<em><b>Association Ends</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityAssociation}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.EntityAssociation#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Ends</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getEntity_AssociationEnds()
	 * @see work.andycarpenter.webgen.pims.persistence.EntityAssociation#getTargetEntity
	 * @model opposite="targetEntity"
	 * @generated
	 */
	EList<EntityAssociation> getAssociationEnds();

} // Entity
