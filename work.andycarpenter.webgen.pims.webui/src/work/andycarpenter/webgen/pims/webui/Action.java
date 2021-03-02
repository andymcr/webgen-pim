/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#isDisable <em>Disable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getEnableWhen <em>Enable When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getConfirmMessage <em>Confirm Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getFailureMessage <em>Failure Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getAnchorClass <em>Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Action#getContainingTypes <em>Containing Types</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.ActionContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' container reference.
	 * @see #setUsedBy(ActionContainer)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_UsedBy()
	 * @see work.andycarpenter.webgen.pims.webui.ActionContainer#getActions
	 * @model opposite="actions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ActionContainer getUsedBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getUsedBy <em>Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' container reference.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(ActionContainer value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_IconName()
	 * @model default=""
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_Disable()
	 * @model
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

	/**
	 * Returns the value of the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display When</em>' containment reference.
	 * @see #setDisplayWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_DisplayWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisplayWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getDisplayWhen <em>Display When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display When</em>' containment reference.
	 * @see #getDisplayWhen()
	 * @generated
	 */
	void setDisplayWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Enable When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable When</em>' containment reference.
	 * @see #setEnableWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_EnableWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getEnableWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getEnableWhen <em>Enable When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable When</em>' containment reference.
	 * @see #getEnableWhen()
	 * @generated
	 */
	void setEnableWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Confirm Message</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Message</em>' attribute.
	 * @see #setConfirmMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_ConfirmMessage()
	 * @model default="" ordered="false"
	 * @generated
	 */
	String getConfirmMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getConfirmMessage <em>Confirm Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Message</em>' attribute.
	 * @see #getConfirmMessage()
	 * @generated
	 */
	void setConfirmMessage(String value);

	/**
	 * Returns the value of the '<em><b>Success Message</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Message</em>' attribute.
	 * @see #setSuccessMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_SuccessMessage()
	 * @model default=""
	 * @generated
	 */
	String getSuccessMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getSuccessMessage <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Message</em>' attribute.
	 * @see #getSuccessMessage()
	 * @generated
	 */
	void setSuccessMessage(String value);

	/**
	 * Returns the value of the '<em><b>Failure Message</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Message</em>' attribute.
	 * @see #setFailureMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_FailureMessage()
	 * @model default=""
	 * @generated
	 */
	String getFailureMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getFailureMessage <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Message</em>' attribute.
	 * @see #getFailureMessage()
	 * @generated
	 */
	void setFailureMessage(String value);

	/**
	 * Returns the value of the '<em><b>Anchor Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Class</em>' attribute.
	 * @see #setAnchorClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_AnchorClass()
	 * @model default=""
	 * @generated
	 */
	String getAnchorClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getAnchorClass <em>Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Class</em>' attribute.
	 * @see #getAnchorClass()
	 * @generated
	 */
	void setAnchorClass(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_HeaderClass()
	 * @model
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getHeaderClass <em>Header Class</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_FooterClass()
	 * @model
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Action#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Containing Types</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Types</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAction_ContainingTypes()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if usedBy.oclIsKindOf(DynamicUnit) then\n\tusedBy.oclAsType(DynamicUnit).contentTypes\nelse if usedBy.oclIsKindOf(UnitFeature) then\n\tusedBy.oclAsType(UnitFeature).displayedOn.contentTypes\nelse\n\tOrderedSet{}\nendif endif'"
	 * @generated
	 */
	EList<Entity> getContainingTypes();

} // Action
