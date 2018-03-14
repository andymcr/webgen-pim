/**
 */
package work.andycarpenter.webgen.pims.service;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getUses <em>Uses</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getResultType <em>Result Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getBusinessOperation()
 * @model
 * @generated
 */
public interface BusinessOperation extends NamedElement, FormalParameterList {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.service.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' container reference.
	 * @see #setDefinedBy(Service)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getBusinessOperation_DefinedBy()
	 * @see work.andycarpenter.webgen.pims.service.Service#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	Service getDefinedBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getDefinedBy <em>Defined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' container reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(Service value);

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
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getBusinessOperation_Uses()
	 * @model
	 * @generated
	 */
	EList<Service> getUses();

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.service.OperationResultTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.service.OperationResultTypes
	 * @see #setResultType(OperationResultTypes)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getBusinessOperation_ResultType()
	 * @model required="true"
	 * @generated
	 */
	OperationResultTypes getResultType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.service.OperationResultTypes
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(OperationResultTypes value);

	/**
	 * Returns the value of the '<em><b>Result Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Mime Type</em>' attribute.
	 * @see #setResultMimeType(String)
	 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getBusinessOperation_ResultMimeType()
	 * @model
	 * @generated
	 */
	String getResultMimeType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.service.BusinessOperation#getResultMimeType <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Mime Type</em>' attribute.
	 * @see #getResultMimeType()
	 * @generated
	 */
	void setResultMimeType(String value);

} // BusinessOperation
