/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Repository#getServes <em>Serves</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Repository#getSelections <em>Selections</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindAll <em>Find All</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindOne <em>Find One</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Serves</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Entity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' reference.
	 * @see #setServes(Entity)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getRepository_Serves()
	 * @see work.andycarpenter.webgen.pims.persistence.Entity#getRepository
	 * @model opposite="repository" required="true"
	 * @generated
	 */
	Entity getServes();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Repository#getServes <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' reference.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(Entity value);

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Selection}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getRepository_Selections()
	 * @see work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy
	 * @model opposite="definedBy" containment="true"
	 * @generated
	 */
	EList<Selection> getSelections();

	/**
	 * Returns the value of the '<em><b>Find All</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find All</em>' reference.
	 * @see #setFindAll(Selection)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getRepository_FindAll()
	 * @model
	 * @generated
	 */
	Selection getFindAll();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindAll <em>Find All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find All</em>' reference.
	 * @see #getFindAll()
	 * @generated
	 */
	void setFindAll(Selection value);

	/**
	 * Returns the value of the '<em><b>Find One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find One</em>' reference.
	 * @see #setFindOne(Selection)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getRepository_FindOne()
	 * @model
	 * @generated
	 */
	Selection getFindOne();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Repository#getFindOne <em>Find One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find One</em>' reference.
	 * @see #getFindOne()
	 * @generated
	 */
	void setFindOne(Selection value);

} // Repository
