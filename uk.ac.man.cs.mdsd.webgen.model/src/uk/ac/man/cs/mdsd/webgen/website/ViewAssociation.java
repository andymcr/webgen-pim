/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#isUseAssociationSource <em>Use Association Source</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation()
 * @model
 * @generated
 */
public interface ViewAssociation extends ViewFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_Name()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() or partOf.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tlet associationName : String\r\n\t\t= if association.oclIsTypeOf(ViewAssociation) then\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\telse if useAssociationSource then\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).name\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).targetFeatureName \r\n\t\t\tendif endif\r\n\tin if self.alias.oclIsUndefined() then\r\n\t\t\tassociationName\r\n\t\telse if alias <> \'\' then\r\n\t\t\talias\r\n\t\telse\r\n\t\t\tassociationName\r\n\t\tendif endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Use Association Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Association Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Association Source</em>' attribute.
	 * @see #setUseAssociationSource(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getViewAssociation_UseAssociationSource()
	 * @model
	 * @generated
	 */
	boolean isUseAssociationSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.ViewAssociation#isUseAssociationSource <em>Use Association Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Association Source</em>' attribute.
	 * @see #isUseAssociationSource()
	 * @generated
	 */
	void setUseAssociationSource(boolean value);

} // ViewAssociation
