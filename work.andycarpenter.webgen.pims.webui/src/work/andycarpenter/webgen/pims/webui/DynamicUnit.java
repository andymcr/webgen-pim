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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContentType <em>Content Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getRouteActuals <em>Route Actuals</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#isHasWhenFieldsEmptyAddImplicitFields <em>Has When Fields Empty Add Implicit Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldListClass <em>Local Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldLabelClass <em>Local Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalFieldValueClass <em>Local Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalControlClass <em>Local Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceControlClass <em>Local Instance Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalAnchorClass <em>Local Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceActionClass <em>Local Instance Action Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='featuresMustBeFromContentType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL featuresMustBeFromContentType='displayFields\n\t-&gt;select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\n\t-&gt;select(f | \n\t\tif f.oclIsKindOf(UnitElement) then\n\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\n\t\telse\n\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\n\t\tendif)\n\t-&gt;forAll(f | \n\t\tif f.oclIsKindOf(UnitElement) then\n\t\t\tcontentType.allFeatures-&gt;includes(f.oclAsType(UnitElement).attribute)\n\t\telse\n\t\t\tcontentType.allFeatures-&gt;includes(f.oclAsType(UnitAssociation).association)\n\t\tendif)'"
 * @generated
 */
public interface DynamicUnit extends ContentUnit, ActionContainer {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(Entity)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	Entity getContentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Entity value);

	/**
	 * Returns the value of the '<em><b>Containing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Type</em>' reference.
	 * @see #isSetContainingType()
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_ContainingType()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.oclIsKindOf(CollectionUnit) then\n\tlet collectionUnit : CollectionUnit = self.oclAsType(CollectionUnit)\n\tin if not collectionUnit.findContainerSelection.oclIsUndefined() then\n\t\t\tcollectionUnit.findContainerSelection.definedBy.serves\n\t\telse if not collectionUnit.selection.oclIsUndefined() then\n\t\t\tif collectionUnit.selection.selectPath-&gt;notEmpty() then\n\t\t\t\tcollectionUnit.selection.pathType\n\t\t\telse\n\t\t\t\tcontentType.containingType\n\t\t\tendif\n\t\telse\n\t\t\tcontentType.containingType\n\t\tendif endif\n else if self.oclIsKindOf(DetailsUnit) then\n\tlet detailsUnit : DetailsUnit = self.oclAsType(DetailsUnit)\n\tin if not detailsUnit.selection.oclIsUndefined() then\n\t\tif detailsUnit.selection.selectPath-&gt;notEmpty() then\n\t\t\tdetailsUnit.selection.pathType\n\t\telse\n\t\t\tdetailsUnit.contentType.containingType\n\t\tendif\n\telse\n\t\tcontentType.containingType\n\tendif\nelse\n\tcontentType.containingType\nendif endif\n'"
	 * @generated
	 */
	Entity getContainingType();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getContainingType <em>Containing Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Containing Type</em>' reference is set.
	 * @see #getContainingType()
	 * @generated
	 */
	boolean isSetContainingType();

	/**
	 * Returns the value of the '<em><b>Route Actuals</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.RouteActual}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.RouteActual#getActualFor <em>Actual For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Actuals</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_RouteActuals()
	 * @see work.andycarpenter.webgen.pims.webui.RouteActual#getActualFor
	 * @model opposite="actualFor" containment="true"
	 * @generated
	 */
	EList<RouteActual> getRouteActuals();

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
	 * Returns the value of the '<em><b>Has When Fields Empty Add Implicit Fields</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has When Fields Empty Add Implicit Fields</em>' attribute.
	 * @see #setHasWhenFieldsEmptyAddImplicitFields(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isHasWhenFieldsEmptyAddImplicitFields();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#isHasWhenFieldsEmptyAddImplicitFields <em>Has When Fields Empty Add Implicit Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has When Fields Empty Add Implicit Fields</em>' attribute.
	 * @see #isHasWhenFieldsEmptyAddImplicitFields()
	 * @generated
	 */
	void setHasWhenFieldsEmptyAddImplicitFields(boolean value);

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
	 * Returns the value of the '<em><b>Local Instance Control Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Instance Control Class</em>' attribute.
	 * @see #setLocalInstanceControlClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalInstanceControlClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalInstanceControlClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceControlClass <em>Local Instance Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Instance Control Class</em>' attribute.
	 * @see #getLocalInstanceControlClass()
	 * @generated
	 */
	void setLocalInstanceControlClass(String value);

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
	 * Returns the value of the '<em><b>Local Instance Action Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Instance Action Class</em>' attribute.
	 * @see #setLocalInstanceActionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDynamicUnit_LocalInstanceActionClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalInstanceActionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DynamicUnit#getLocalInstanceActionClass <em>Local Instance Action Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Instance Action Class</em>' attribute.
	 * @see #getLocalInstanceActionClass()
	 * @generated
	 */
	void setLocalInstanceActionClass(String value);

} // DynamicUnit
