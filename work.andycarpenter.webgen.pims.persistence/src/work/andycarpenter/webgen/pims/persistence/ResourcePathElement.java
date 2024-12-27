/**
 */
package work.andycarpenter.webgen.pims.persistence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourcePathElement()
 * @model abstract="true"
 * @generated
 */
public interface ResourcePathElement extends Path {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(ResourceFeature)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getResourcePathElement_Resource()
	 * @model required="true"
	 * @generated
	 */
	ResourceFeature getResource();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.ResourcePathElement#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if resource.oclIsUndefined() then\n\t\'\'\nelse\n\tresource.name\nendif'"
	 * @generated
	 */
	String name();

} // ResourcePathElement
