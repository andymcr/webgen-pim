/**
 */
package work.andycarpenter.webgen.pims.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.persistence.SerializationGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getDefaultSerializationGroups <em>Default Serialization Groups</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection()
 * @model
 * @generated
 */
public interface ResourceSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.api.Resource#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource</em>' container reference.
	 * @see #setParentResource(Resource)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection_ParentResource()
	 * @see work.andycarpenter.webgen.pims.api.Resource#getSelections
	 * @model opposite="selections" required="true" transient="false"
	 * @generated
	 */
	Resource getParentResource();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getParentResource <em>Parent Resource</em>}' container reference.
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
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if selection.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tselection.name\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection_Selection()
	 * @model required="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

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
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.api.ResourceSelection#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

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
	 * @see work.andycarpenter.webgen.pims.api.ApiPackage#getResourceSelection_DefaultSerializationGroups()
	 * @model
	 * @generated
	 */
	EList<SerializationGroup> getDefaultSerializationGroups();

} // ResourceSelection
