/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getOptions <em>Options</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getCollectionSortBy <em>Collection Sort By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#isUseAutocomplete <em>Use Autocomplete</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='optionsValidChoice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL optionsValidChoice='not options.oclIsUndefined() and not association.oclIsUndefined() implies\n\tdisplayedOn.controller.webUI.persistence.repositories\n\t\t-&gt;select(r : persistence::Repository | r.serves = association.targetEntity)\n\t\t-&gt;collect(r : persistence::Repository | r.selections)\n\t\t-&gt;includes(options)'"
 * @generated
 */
public interface UnitAssociation extends UnitFeature, AssociationPathElement {
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
	 * Returns the value of the '<em><b>Collection Sort By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Sort By</em>' reference.
	 * @see #setCollectionSortBy(Attribute)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_CollectionSortBy()
	 * @model
	 * @generated
	 */
	Attribute getCollectionSortBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#getCollectionSortBy <em>Collection Sort By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Sort By</em>' reference.
	 * @see #getCollectionSortBy()
	 * @generated
	 */
	void setCollectionSortBy(Attribute value);

	/**
	 * Returns the value of the '<em><b>Use Autocomplete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Autocomplete</em>' attribute.
	 * @see #setUseAutocomplete(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitAssociation_UseAutocomplete()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUseAutocomplete();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitAssociation#isUseAutocomplete <em>Use Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Autocomplete</em>' attribute.
	 * @see #isUseAutocomplete()
	 * @generated
	 */
	void setUseAutocomplete(boolean value);

} // UnitAssociation
