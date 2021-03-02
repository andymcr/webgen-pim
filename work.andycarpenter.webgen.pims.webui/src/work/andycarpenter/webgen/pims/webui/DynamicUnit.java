/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContentTypes <em>Content Types</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldListClass <em>Local Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldLabelClass <em>Local Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldValueClass <em>Local Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalControlClass <em>Local Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalAnchorClass <em>Local Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featuresMustBeFromContentType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featuresMustBeFromContentType='let entities : OrderedSet(persistence::Entity)\n\t= if self.oclIsKindOf(SingletonUnit) then\n\t\t\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\n\t\telse if self.oclIsKindOf(CollectionUnit) then\n\t\t\tself.oclAsType(CollectionUnit).contentType\n\t\telse\n\t\t\tOrderedSet{}\n\t\tendif endif\n\tin let features : Collection(persistence::Feature)\n\t\t= entities-&gt;collect(eov | eov.allFeatures)\n\t\tin displayFields\n\t\t\t-&gt;select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\n\t\t\t-&gt;select(f | \n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\n\t\t\t\telse\n\t\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\n\t\t\t\tendif)\n\t\t\t-&gt;forAll(f | \n\t\t\t\tif f.oclIsTypeOf(UnitElement) then\n\t\t\t\t\tfeatures-&gt;includes(f.oclAsType(UnitElement).attribute)\n\t\t\t\telse\n\t\t\t\t\tfeatures-&gt;includes(f.oclAsType(UnitAssociation).association)\n\t\t\t\tendif)'"
 * @generated
 */
public interface DynamicUnit extends ContentUnit, ActionContainer {
	/**
	 * Returns the value of the '<em><b>Content Types</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Types</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_ContentTypes()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(SingletonUnit) then\n\tOrderedSet{self.oclAsType(SingletonUnit).contentType}\nelse if self.oclIsKindOf(CollectionUnit) then\n\tself.oclAsType(CollectionUnit).contentType\nelse\n\tOrderedSet{}\nendif endif'"
	 * @generated
	 */
	EList<Entity> getContentTypes();

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
	 * Returns the value of the '<em><b>Local Field List Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Field List Class</em>' attribute.
	 * @see #setLocalFieldListClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalFieldListClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalFieldListClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldListClass <em>Local Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Field List Class</em>' attribute.
	 * @see #getLocalFieldListClass()
	 * @generated
	 */
	void setLocalFieldListClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Field Label Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Field Label Class</em>' attribute.
	 * @see #setLocalFieldLabelClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalFieldLabelClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalFieldLabelClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldLabelClass <em>Local Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Field Label Class</em>' attribute.
	 * @see #getLocalFieldLabelClass()
	 * @generated
	 */
	void setLocalFieldLabelClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Field Value Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Field Value Class</em>' attribute.
	 * @see #setLocalFieldValueClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalFieldValueClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalFieldValueClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldValueClass <em>Local Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Field Value Class</em>' attribute.
	 * @see #getLocalFieldValueClass()
	 * @generated
	 */
	void setLocalFieldValueClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Control Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Control Class</em>' attribute.
	 * @see #setLocalControlClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalControlClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalControlClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalControlClass <em>Local Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Control Class</em>' attribute.
	 * @see #getLocalControlClass()
	 * @generated
	 */
	void setLocalControlClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Anchor Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Anchor Class</em>' attribute.
	 * @see #setLocalAnchorClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalAnchorClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalAnchorClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalAnchorClass <em>Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Anchor Class</em>' attribute.
	 * @see #getLocalAnchorClass()
	 * @generated
	 */
	void setLocalAnchorClass(String value);

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

} // DynamicUnit
