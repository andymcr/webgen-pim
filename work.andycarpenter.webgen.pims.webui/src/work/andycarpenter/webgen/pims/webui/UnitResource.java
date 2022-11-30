/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.ResourceFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#getResource <em>Resource</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource()
 * @model
 * @generated
 */
public interface UnitResource extends UnitFeature {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(ResourceFeature)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_Resource()
	 * @model required="true"
	 * @generated
	 */
	ResourceFeature getResource();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceFeature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_Name()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if resource.oclIsUndefined() then\n\t\'\'\nelse\n\tresource.name\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // UnitResource
