/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalCaptionClass <em>Local Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalContentClass <em>Local Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPageDisplayedOn <em>Page Displayed On</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Page#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(Page)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_DisplayedOn()
	 * @see work.andycarpenter.webgen.pims.webui.Page#getUnits
	 * @model opposite="units" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Page getDisplayedOn();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(Page value);

	/**
	 * Returns the value of the '<em><b>Create Default Uri Element</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Default Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Default Uri Element</em>' attribute.
	 * @see #setCreateDefaultUriElement(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_CreateDefaultUriElement()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreateDefaultUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Default Uri Element</em>' attribute.
	 * @see #isCreateDefaultUriElement()
	 * @generated
	 */
	void setCreateDefaultUriElement(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_RequiresRole()
	 * @model default=""
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

	/**
	 * Returns the value of the '<em><b>Purpose Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Summary</em>' attribute.
	 * @see #setPurposeSummary(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_PurposeSummary()
	 * @model
	 * @generated
	 */
	String getPurposeSummary();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Summary</em>' attribute.
	 * @see #getPurposeSummary()
	 * @generated
	 */
	void setPurposeSummary(String value);

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' attribute.
	 * @see #setAlternative(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_Alternative()
	 * @model
	 * @generated
	 */
	String getAlternative();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAlternative <em>Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' attribute.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(String value);

	/**
	 * Returns the value of the '<em><b>Section Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Class</em>' attribute.
	 * @see #setSectionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_SectionClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getSectionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getSectionClass <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Class</em>' attribute.
	 * @see #getSectionClass()
	 * @generated
	 */
	void setSectionClass(String value);

	/**
	 * Returns the value of the '<em><b>Omit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Caption</em>' attribute.
	 * @see #setOmitCaption(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_OmitCaption()
	 * @model
	 * @generated
	 */
	boolean isOmitCaption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Caption</em>' attribute.
	 * @see #isOmitCaption()
	 * @generated
	 */
	void setOmitCaption(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Caption Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Caption Class</em>' attribute.
	 * @see #setLocalCaptionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_LocalCaptionClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalCaptionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalCaptionClass <em>Local Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Caption Class</em>' attribute.
	 * @see #getLocalCaptionClass()
	 * @generated
	 */
	void setLocalCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Content Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Content Class</em>' attribute.
	 * @see #setLocalContentClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_LocalContentClass()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getLocalContentClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalContentClass <em>Local Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Content Class</em>' attribute.
	 * @see #getLocalContentClass()
	 * @generated
	 */
	void setLocalContentClass(String value);

	/**
	 * Returns the value of the '<em><b>Page Displayed On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Displayed On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Displayed On</em>' reference.
	 * @see #isSetPageDisplayedOn()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_PageDisplayedOn()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if displayedOn.oclIsTypeOf(Page) then\r\n\tdisplayedOn.oclAsType(Page)\r\nelse\r\n\tdisplayedOn.oclAsType(UnitAssociation).displayedOn.pageDisplayedOn\r\nendif'"
	 * @generated
	 */
	Page getPageDisplayedOn();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPageDisplayedOn <em>Page Displayed On</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Displayed On</em>' reference is set.
	 * @see #getPageDisplayedOn()
	 * @generated
	 */
	boolean isSetPageDisplayedOn();

} // ContentUnit
