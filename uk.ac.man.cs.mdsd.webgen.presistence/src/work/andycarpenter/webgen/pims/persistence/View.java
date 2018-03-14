/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.View#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.View#getViewFeatures <em>View Features</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getView()
 * @model
 * @generated
 */
public interface View extends EntityOrView {
	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.EntityOrView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getView_Encapsulates()
	 * @model
	 * @generated
	 */
	EList<EntityOrView> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>View Features</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.ViewFeature}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.ViewFeature#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Features</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getView_ViewFeatures()
	 * @see work.andycarpenter.webgen.pims.persistence.ViewFeature#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<ViewFeature> getViewFeatures();

} // View
