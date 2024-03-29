/**
 */
package work.andycarpenter.webgen.pims.service;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.NamedElement;
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
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getOperations <em>Operations</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getRequires <em>Requires</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#getUses <em>Uses</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.Service#isUsesVichUploaderService <em>Uses Vich Uploader Service</em>}</li>
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
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_Requires()
	 * @model
	 * @generated
	 */
	EList<Repository> getRequires();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.service.Service}.
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
	EList<Service> getUses();

	/**
	 * Returns the value of the '<em><b>Uses Vich Uploader Service</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Vich Uploader Service</em>' attribute.
	 * @see #setUsesVichUploaderService(boolean)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getService_UsesVichUploaderService()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsesVichUploaderService();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.Service#isUsesVichUploaderService <em>Uses Vich Uploader Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Vich Uploader Service</em>' attribute.
	 * @see #isUsesVichUploaderService()
	 * @generated
	 */
	void setUsesVichUploaderService(boolean value);

} // Service
