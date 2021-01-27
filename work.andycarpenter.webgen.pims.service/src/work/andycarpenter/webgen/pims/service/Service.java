/**
 */
package work.andycarpenter.webgen.pims.service;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.NamedElement;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getConstants <em>Constants</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getServes <em>Serves</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getOperations <em>Operations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.service.Constant}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.service.Constant#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_Constants()
	 * @see work.andycarpenter.webgen.pims.service.Constant#getDefinedBy
	 * @model opposite="definedBy" containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

	/**
	 * Returns the value of the '<em><b>Serves</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serves</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves</em>' reference.
	 * @see #setServes(Entity)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_Serves()
	 * @model
	 * @generated
	 */
	Entity getServes();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.Service#getServes <em>Serves</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves</em>' reference.
	 * @see #getServes()
	 * @generated
	 */
	void setServes(Entity value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.service.BusinessOperation}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_Operations()
	 * @see work.andycarpenter.webgen.pims.service.BusinessOperation#getDefinedBy
	 * @model opposite="definedBy" containment="true"
	 * @generated
	 */
	EList<BusinessOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_Uses()
	 * @model
	 * @generated
	 */
	EList<Repository> getUses();

} // Service
