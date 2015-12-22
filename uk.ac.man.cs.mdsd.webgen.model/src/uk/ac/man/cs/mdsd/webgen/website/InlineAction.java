/**
 */
package uk.ac.man.cs.mdsd.webgen.website;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#isDisable <em>Disable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getHeader <em>Header</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyLinkToSingletonFeatures'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyLinkToSingletonFeatures='usedBy.oclIsKindOf(UnitFeature) implies\r\n\tif usedBy.oclIsKindOf(UnitElement) then\r\n\t\tlet attribute : UnitElement = usedBy.oclAsType(UnitElement)\r\n\t\tin not attribute.attribute.oclIsUndefined() implies\r\n\t\t\tif attribute.attribute.oclIsTypeOf(EncapsulatedAttribute) then\r\n\t\t\t\tattribute.attribute.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tattribute.attribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\t\t\tendif\r\n\telse\r\n\t\tlet association : UnitAssociation = usedBy.oclAsType(UnitAssociation)\r\n\t\tin not association.association.oclIsUndefined() implies\r\n\t\t\tif association.association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\t\t\tassociation.association.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\t\t\telse if association.association.oclIsTypeOf(ViewAssociation) then\r\n\t\t\t\tlet viewAssociation : ViewAssociation = association.association.oclAsType(ViewAssociation)\r\n\t\t\t\tin if association.useAssociationSource then\r\n\t\t\t\t\t\tviewAssociation.cardinality <> Cardinality::Many\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tviewAssociation.opposite.cardinality <> Cardinality::Many\r\n\t\t\t\t\tendif\r\n\t\t\telse\r\n\t\t\t\tlet entityAssociation : EntityAssociation = association.association.oclAsType(EntityAssociation)\r\n\t\t\t\tin if association.useAssociationSource then\r\n\t\t\t\t\t\tentityAssociation.cardinality <> Cardinality::Many\r\n\t\t\t\t\telse if entityAssociation.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\t\t\t\ttrue\r\n\t\t\t\t\telse\r\n\t\t\t\t\t\tentityAssociation.oclAsType(AssociationWithoutContainment).targetCardinality <> Cardinality::Many\r\n\t\t\t\t\tendif endif\r\n\t\t\tendif endif\r\n\tendif'"
 * @generated
 */
public interface InlineAction extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(InlineActionContainer)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_UsedBy()
	 * @see uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer#getActions
	 * @model opposite="actions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InlineActionContainer getUsedBy();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getUsedBy <em>Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' container reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(InlineActionContainer value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_Disable()
	 * @model
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_Footer()
	 * @model
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_HeaderClass()
	 * @model
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#getInlineAction_FooterClass()
	 * @model
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.webgen.website.InlineAction#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // InlineAction
