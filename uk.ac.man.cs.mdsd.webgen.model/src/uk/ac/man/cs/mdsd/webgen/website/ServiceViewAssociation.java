/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ServiceViewAssociation#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceViewAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetMustBeInView'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL targetMustBeInView='not targetFeature.oclIsUndefined() implies targetFeature.partOf.view'"
 * @generated
 */
public interface ServiceViewAssociation extends NamedElement, ServiceAssociation, IncludedFeature {
	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(ServiceAssociation)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getServiceViewAssociation_TargetFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceAssociation getTargetFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ServiceViewAssociation#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(ServiceAssociation value);

} // ServiceViewAssociation
