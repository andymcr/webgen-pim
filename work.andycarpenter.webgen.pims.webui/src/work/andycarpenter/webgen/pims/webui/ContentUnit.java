/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.security.AuthorisationExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getController <em>Controller</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isCreateDefaultUriElement <em>Create Default Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getPurposeSummary <em>Purpose Summary</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriParent <em>Uri Parent</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#isOmitCaption <em>Omit Caption</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalCaptionClass <em>Local Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getLocalContentClass <em>Local Content Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnit extends NamedDisplayElement {
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
	 * @model default="true" required="true"
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
	 * Returns the value of the '<em><b>Authorisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorisation</em>' containment reference.
	 * @see #setAuthorisation(AuthorisationExpression)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_Authorisation()
	 * @model containment="true"
	 * @generated
	 */
	AuthorisationExpression getAuthorisation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getAuthorisation <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorisation</em>' containment reference.
	 * @see #getAuthorisation()
	 * @generated
	 */
	void setAuthorisation(AuthorisationExpression value);

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
	 * Returns the value of the '<em><b>Uri Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Parent</em>' reference.
	 * @see #setUriParent(ContentUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_UriParent()
	 * @model
	 * @generated
	 */
	ContentUnit getUriParent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getUriParent <em>Uri Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Parent</em>' reference.
	 * @see #getUriParent()
	 * @generated
	 */
	void setUriParent(ContentUnit value);

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
	 * @model default=""
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
	 * @model required="true"
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
	 * @model default=""
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
	 * Returns the value of the '<em><b>Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Controller#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' container reference.
	 * @see #setController(Controller)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnit_Controller()
	 * @see work.andycarpenter.webgen.pims.webui.Controller#getUnits
	 * @model opposite="units" required="true" transient="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnit#getController <em>Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' container reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // ContentUnit
