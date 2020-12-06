/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.service.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getServicesUsed <em>Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getSupportActions <em>Support Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getControlClass <em>Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldListClass <em>Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldLabelClass <em>Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldValueClass <em>Field Value Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featuresMustBeFromContentType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featuresMustBeFromContentType='let entities : OrderedSet(persistence::Entity)\n\t= OrderedSet{}\n\tin let eovFeatures : Collection(persistence::Feature)\n\t\t= entities-&gt;collect(eov | eov.allFeatures)\n\t\tin displayFields\n\t\t\t-&gt;select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\n\t\t\t-&gt;select(f | \n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\n\t\t\t\telse\n\t\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\n\t\t\t\tendif)\n\t\t\t-&gt;forAll(f | \n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\t\t\teovFeatures-&gt;includes(f.oclAsType(UnitElement).attribute)\n\t\t\t\telse\n\t\t\t\t\teovFeatures-&gt;includes(f.oclAsType(UnitAssociation).association)\n\t\t\t\tendif)'"
 * @generated
 */
public interface DynamicUnit extends ContentUnit {
	/**
	 * Returns the value of the '<em><b>Display Fields</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.UnitField}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Fields</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_DisplayFields()
	 * @see work.andycarpenter.webgen.pims.webui.UnitField#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<UnitField> getDisplayFields();

	/**
	 * Returns the value of the '<em><b>Services Used</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Used</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Used</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_ServicesUsed()
	 * @model
	 * @generated
	 */
	EList<Service> getServicesUsed();

	/**
	 * Returns the value of the '<em><b>Hide When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide When</em>' containment reference.
	 * @see #setHideWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_HideWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getHideWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen <em>Hide When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide When</em>' containment reference.
	 * @see #getHideWhen()
	 * @generated
	 */
	void setHideWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Message When Hidden</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message When Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message When Hidden</em>' attribute.
	 * @see #setMessageWhenHidden(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_MessageWhenHidden()
	 * @model default=""
	 * @generated
	 */
	String getMessageWhenHidden();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message When Hidden</em>' attribute.
	 * @see #getMessageWhenHidden()
	 * @generated
	 */
	void setMessageWhenHidden(String value);

	/**
	 * Returns the value of the '<em><b>Support Actions</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.UnitSupportAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Actions</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_SupportActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitSupportAction> getSupportActions();

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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader <em>Header</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_Footer()
	 * @model
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * The default value is <code>"unit_header"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_HeaderClass()
	 * @model default="unit_header"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Control Class</b></em>' attribute.
	 * The default value is <code>"unit_control"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Class</em>' attribute.
	 * @see #setControlClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_ControlClass()
	 * @model default="unit_control"
	 * @generated
	 */
	String getControlClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getControlClass <em>Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Class</em>' attribute.
	 * @see #getControlClass()
	 * @generated
	 */
	void setControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * The default value is <code>"unit_footer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_FooterClass()
	 * @model default="unit_footer"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Field List Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field List Class</em>' attribute.
	 * @see #setFieldListClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_FieldListClass()
	 * @model default=""
	 * @generated
	 */
	String getFieldListClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldListClass <em>Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field List Class</em>' attribute.
	 * @see #getFieldListClass()
	 * @generated
	 */
	void setFieldListClass(String value);

	/**
	 * Returns the value of the '<em><b>Field Label Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Label Class</em>' attribute.
	 * @see #setFieldLabelClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_FieldLabelClass()
	 * @model default=""
	 * @generated
	 */
	String getFieldLabelClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldLabelClass <em>Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Label Class</em>' attribute.
	 * @see #getFieldLabelClass()
	 * @generated
	 */
	void setFieldLabelClass(String value);

	/**
	 * Returns the value of the '<em><b>Field Value Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Value Class</em>' attribute.
	 * @see #setFieldValueClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_FieldValueClass()
	 * @model default=""
	 * @generated
	 */
	String getFieldValueClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFieldValueClass <em>Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Value Class</em>' attribute.
	 * @see #getFieldValueClass()
	 * @generated
	 */
	void setFieldValueClass(String value);

} // DynamicUnit
