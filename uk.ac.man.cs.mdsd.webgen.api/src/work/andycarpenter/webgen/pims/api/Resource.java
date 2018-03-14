/**
 */
package work.andycarpenter.webgen.pims.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.persistence.SerializationGroup;

import work.andycarpenter.webgen.pims.service.Selection;
import work.andycarpenter.webgen.pims.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getService <em>Service</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#isEnableDefaultGetAll <em>Enable Default Get All</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#isEnableDefaultGetOne <em>Enable Default Get One</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getGetAll <em>Get All</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getGetOne <em>Get One</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getSelections <em>Selections</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getDefaultSerializationGroups <em>Default Serialization Groups</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.Resource#getChildResources <em>Child Resources</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.api.Resource#getChildResources <em>Child Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource</em>' container reference.
	 * @see #setParentResource(Resource)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_ParentResource()
	 * @see work.andycarpenter.webgen.pims.api.Resource#getChildResources
	 * @model opposite="childResources" transient="false"
	 * @generated
	 */
	Resource getParentResource();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getParentResource <em>Parent Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource</em>' container reference.
	 * @see #getParentResource()
	 * @generated
	 */
	void setParentResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if service.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tservice.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_Service()
	 * @model required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Enable Default Get All</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Default Get All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Default Get All</em>' attribute.
	 * @see #setEnableDefaultGetAll(boolean)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_EnableDefaultGetAll()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableDefaultGetAll();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#isEnableDefaultGetAll <em>Enable Default Get All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Default Get All</em>' attribute.
	 * @see #isEnableDefaultGetAll()
	 * @generated
	 */
	void setEnableDefaultGetAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Default Get One</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Default Get One</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Default Get One</em>' attribute.
	 * @see #setEnableDefaultGetOne(boolean)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_EnableDefaultGetOne()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnableDefaultGetOne();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#isEnableDefaultGetOne <em>Enable Default Get One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Default Get One</em>' attribute.
	 * @see #isEnableDefaultGetOne()
	 * @generated
	 */
	void setEnableDefaultGetOne(boolean value);

	/**
	 * Returns the value of the '<em><b>Get All</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get All</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All</em>' reference.
	 * @see #setGetAll(Selection)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_GetAll()
	 * @model
	 * @generated
	 */
	Selection getGetAll();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getGetAll <em>Get All</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get All</em>' reference.
	 * @see #getGetAll()
	 * @generated
	 */
	void setGetAll(Selection value);

	/**
	 * Returns the value of the '<em><b>Get One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get One</em>' reference.
	 * @see #setGetOne(Selection)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_GetOne()
	 * @model
	 * @generated
	 */
	Selection getGetOne();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.Resource#getGetOne <em>Get One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get One</em>' reference.
	 * @see #getGetOne()
	 * @generated
	 */
	void setGetOne(Selection value);

	/**
	 * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.api.ResourceSelection}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_Selections()
	 * @see work.andycarpenter.webgen.pims.api.ResourceSelection#getParentResource
	 * @model opposite="parentResource" containment="true"
	 * @generated
	 */
	EList<ResourceSelection> getSelections();

	/**
	 * Returns the value of the '<em><b>Default Serialization Groups</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Serialization Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Serialization Groups</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_DefaultSerializationGroups()
	 * @model
	 * @generated
	 */
	EList<SerializationGroup> getDefaultSerializationGroups();

	/**
	 * Returns the value of the '<em><b>Child Resources</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.api.Resource}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.api.Resource#getParentResource <em>Parent Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Resources</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResource_ChildResources()
	 * @see work.andycarpenter.webgen.pims.api.Resource#getParentResource
	 * @model opposite="parentResource" containment="true"
	 * @generated
	 */
	EList<Resource> getChildResources();

} // Resource
