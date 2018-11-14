/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.service.Filter;
import work.andycarpenter.webgen.pims.service.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#isIsSourceAssociation <em>Is Source Association</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getOptions <em>Options</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getFilteredOptions <em>Filtered Options</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='optionsValidChoice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL optionsValidChoice='not options.oclIsUndefined() implies\r\n\tdisplayedOn.pageDisplayedOn.webUI.services.services\r\n\t\t-&gt;select(s : service::Service | not s.serves.oclIsUndefined())\r\n\t\t-&gt;select(s : service::Service | s.serves = targetEntity)\r\n\t\t-&gt;collect(s : service::Service | s.selections)\r\n\t\t-&gt;includes(options)'"
 * @generated
 */
public interface UnitAssociation extends UnitFeature, UnitContainer, AssociationReference {
	/**
	 * Returns the value of the '<em><b>Is Source Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Source Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Source Association</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_IsSourceAssociation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not association.oclIsUndefined() implies\n\tif displayedOn.oclIsKindOf(SingletonUnit) then\n\t\tdisplayedOn.oclAsType(SingletonUnit).contentType.associations-&gt;includes(association)\n\telse if displayedOn.oclIsKindOf(CollectionUnit) then\n\t\tdisplayedOn.oclAsType(CollectionUnit).contentType-&gt;collect(e | e.associations)-&gt;includes(association)\n\telse\n\t\tfalse\n\tendif endif'"
	 * @generated
	 */
	boolean isIsSourceAssociation();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.partOf\n\telse\n\t\tassociation.targetEntity\n\tendif\nendif'"
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif'"
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference.
	 * @see #setOptions(Selection)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_Options()
	 * @model
	 * @generated
	 */
	Selection getOptions();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getOptions <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Selection value);

	/**
	 * Returns the value of the '<em><b>Filtered Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtered Options</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered Options</em>' reference.
	 * @see #setFilteredOptions(Filter)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_FilteredOptions()
	 * @model
	 * @generated
	 */
	Filter getFilteredOptions();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getFilteredOptions <em>Filtered Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtered Options</em>' reference.
	 * @see #getFilteredOptions()
	 * @generated
	 */
	void setFilteredOptions(Filter value);

} // UnitAssociation
