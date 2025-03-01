/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.Selection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getUnitTitle <em>Unit Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getElementTitle <em>Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isTruncateElementTitle <em>Truncate Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilter <em>Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSupportedFilters <em>Supported Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationControlPlacement <em>Pagination Control Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationClass <em>Pagination Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationAnchorClass <em>Pagination Anchor Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyTitleWithSingletons selectionMustNotBeSingleton'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyTitleWithSingletons='not unitTitle.oclIsUndefined() implies \n\tif unitTitle.oclIsKindOf(persistence::Attribute) then\n\t\tunitTitle.oclAsType(persistence::Attribute).cardinality &lt;&gt; persistence::Cardinality::Many\n\telse\n\t\ttrue\n\tendif' selectionMustNotBeSingleton='not selection.oclIsUndefined() implies\n\tselection.limit &lt;&gt; 1'"
 * @generated
 */
public interface CollectionUnit extends DynamicUnit, SelectableUnit, ValueContext {
	/**
	 * Returns the value of the '<em><b>Unit Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Title</em>' reference.
	 * @see #setUnitTitle(Label)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_UnitTitle()
	 * @model
	 * @generated
	 */
	Label getUnitTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getUnitTitle <em>Unit Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Title</em>' reference.
	 * @see #getUnitTitle()
	 * @generated
	 */
	void setUnitTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Element Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Title</em>' containment reference.
	 * @see #setElementTitle(DisplayValue)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_ElementTitle()
	 * @model containment="true"
	 * @generated
	 */
	DisplayValue getElementTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getElementTitle <em>Element Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Title</em>' containment reference.
	 * @see #getElementTitle()
	 * @generated
	 */
	void setElementTitle(DisplayValue value);

	/**
	 * Returns the value of the '<em><b>Truncate Element Title</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Truncate Element Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Truncate Element Title</em>' attribute.
	 * @see #setTruncateElementTitle(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_TruncateElementTitle()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTruncateElementTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isTruncateElementTitle <em>Truncate Element Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncate Element Title</em>' attribute.
	 * @see #isTruncateElementTitle()
	 * @generated
	 */
	void setTruncateElementTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_Selection()
	 * @model
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Find Container Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Container Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Container Selection</em>' reference.
	 * @see #setFindContainerSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_FindContainerSelection()
	 * @model
	 * @generated
	 */
	Selection getFindContainerSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindContainerSelection <em>Find Container Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Container Selection</em>' reference.
	 * @see #getFindContainerSelection()
	 * @generated
	 */
	void setFindContainerSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Find Element Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Element Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Element Selection</em>' reference.
	 * @see #setFindElementSelection(Selection)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_FindElementSelection()
	 * @model
	 * @generated
	 */
	Selection getFindElementSelection();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFindElementSelection <em>Find Element Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Element Selection</em>' reference.
	 * @see #getFindElementSelection()
	 * @generated
	 */
	void setFindElementSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_Filter()
	 * @model
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Supported Filters</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Filters</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_SupportedFilters()
	 * @model
	 * @generated
	 */
	EList<Filter> getSupportedFilters();

	/**
	 * Returns the value of the '<em><b>Empty Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Message</em>' attribute.
	 * @see #setEmptyMessage(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_EmptyMessage()
	 * @model
	 * @generated
	 */
	String getEmptyMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Message</em>' attribute.
	 * @see #getEmptyMessage()
	 * @generated
	 */
	void setEmptyMessage(String value);

	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_OmitFieldLabels()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Pagination Size</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #setDefaultPaginationSize(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_DefaultPaginationSize()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getDefaultPaginationSize();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #getDefaultPaginationSize()
	 * @generated
	 */
	void setDefaultPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Pagination Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #setMaximumPaginationSize(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_MaximumPaginationSize()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMaximumPaginationSize();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Pagination Size</em>' attribute.
	 * @see #getMaximumPaginationSize()
	 * @generated
	 */
	void setMaximumPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Pagination Control Placement</b></em>' attribute.
	 * The default value is <code>"Below"</code>.
	 * The literals are from the enumeration {@link work.andycarpenter.webgen.pims.webui.PaginationControlPlacements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Control Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Control Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
	 * @see #setPaginationControlPlacement(PaginationControlPlacements)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PaginationControlPlacement()
	 * @model default="Below"
	 * @generated
	 */
	PaginationControlPlacements getPaginationControlPlacement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationControlPlacement <em>Pagination Control Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Control Placement</em>' attribute.
	 * @see work.andycarpenter.webgen.pims.webui.PaginationControlPlacements
	 * @see #getPaginationControlPlacement()
	 * @generated
	 */
	void setPaginationControlPlacement(PaginationControlPlacements value);

	/**
	 * Returns the value of the '<em><b>Next Npages</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Npages</em>' attribute.
	 * @see #setNextNpages(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_NextNpages()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getNextNpages();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextNpages <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Npages</em>' attribute.
	 * @see #getNextNpages()
	 * @generated
	 */
	void setNextNpages(int value);

	/**
	 * Returns the value of the '<em><b>Previous Npages</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Npages</em>' attribute.
	 * @see #setPreviousNpages(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PreviousNpages()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getPreviousNpages();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousNpages <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Npages</em>' attribute.
	 * @see #getPreviousNpages()
	 * @generated
	 */
	void setPreviousNpages(int value);

	/**
	 * Returns the value of the '<em><b>Next Page Label</b></em>' attribute.
	 * The default value is <code>"&gt;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Label</em>' attribute.
	 * @see #setNextPageLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_NextPageLabel()
	 * @model default="&amp;gt;"
	 * @generated
	 */
	String getNextPageLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageLabel <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Label</em>' attribute.
	 * @see #getNextPageLabel()
	 * @generated
	 */
	void setNextPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Next Page Icon Name</b></em>' attribute.
	 * The default value is <code>"chevron_right"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #setNextPageIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_NextPageIconName()
	 * @model default="chevron_right"
	 * @generated
	 */
	String getNextPageIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getNextPageIconName <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Icon Name</em>' attribute.
	 * @see #getNextPageIconName()
	 * @generated
	 */
	void setNextPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Label</b></em>' attribute.
	 * The default value is <code>"&lt;"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Label</em>' attribute.
	 * @see #setPreviousPageLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PreviousPageLabel()
	 * @model default="&amp;lt;"
	 * @generated
	 */
	String getPreviousPageLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageLabel <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Label</em>' attribute.
	 * @see #getPreviousPageLabel()
	 * @generated
	 */
	void setPreviousPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Icon Name</b></em>' attribute.
	 * The default value is <code>"chevron_left"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #setPreviousPageIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PreviousPageIconName()
	 * @model default="chevron_left"
	 * @generated
	 */
	String getPreviousPageIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPreviousPageIconName <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Icon Name</em>' attribute.
	 * @see #getPreviousPageIconName()
	 * @generated
	 */
	void setPreviousPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Use Disabled Page Links</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Disabled Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #setUseDisabledPageLinks(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_UseDisabledPageLinks()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUseDisabledPageLinks();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Disabled Page Links</em>' attribute.
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 */
	void setUseDisabledPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use First Last Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #setUseFirstLastPageLinks(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_UseFirstLastPageLinks()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUseFirstLastPageLinks();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 */
	void setUseFirstLastPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>First Page Label</b></em>' attribute.
	 * The default value is <code>"<<"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Label</em>' attribute.
	 * @see #setFirstPageLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_FirstPageLabel()
	 * @model default="&lt;&lt;"
	 * @generated
	 */
	String getFirstPageLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageLabel <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Label</em>' attribute.
	 * @see #getFirstPageLabel()
	 * @generated
	 */
	void setFirstPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>First Page Icon Name</b></em>' attribute.
	 * The default value is <code>"first_page"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Icon Name</em>' attribute.
	 * @see #setFirstPageIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_FirstPageIconName()
	 * @model default="first_page"
	 * @generated
	 */
	String getFirstPageIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFirstPageIconName <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Icon Name</em>' attribute.
	 * @see #getFirstPageIconName()
	 * @generated
	 */
	void setFirstPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Label</b></em>' attribute.
	 * The default value is <code>">>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Label</em>' attribute.
	 * @see #setLastPageLabel(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_LastPageLabel()
	 * @model default="&gt;&gt;"
	 * @generated
	 */
	String getLastPageLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageLabel <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Label</em>' attribute.
	 * @see #getLastPageLabel()
	 * @generated
	 */
	void setLastPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Icon Name</b></em>' attribute.
	 * The default value is <code>"last_page"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #setLastPageIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_LastPageIconName()
	 * @model default="last_page"
	 * @generated
	 */
	String getLastPageIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getLastPageIconName <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Icon Name</em>' attribute.
	 * @see #getLastPageIconName()
	 * @generated
	 */
	void setLastPageIconName(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Class</b></em>' attribute.
	 * The default value is <code>"pagination"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Class</em>' attribute.
	 * @see #setPaginationClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PaginationClass()
	 * @model default="pagination"
	 * @generated
	 */
	String getPaginationClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationClass <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Class</em>' attribute.
	 * @see #getPaginationClass()
	 * @generated
	 */
	void setPaginationClass(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Element Class</b></em>' attribute.
	 * The default value is <code>"page-item"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination Element Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #setPaginationElementClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PaginationElementClass()
	 * @model default="page-item"
	 * @generated
	 */
	String getPaginationElementClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationElementClass <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Element Class</em>' attribute.
	 * @see #getPaginationElementClass()
	 * @generated
	 */
	void setPaginationElementClass(String value);

	/**
	 * Returns the value of the '<em><b>Pagination Anchor Class</b></em>' attribute.
	 * The default value is <code>"page-link"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination Anchor Class</em>' attribute.
	 * @see #setPaginationAnchorClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_PaginationAnchorClass()
	 * @model default="page-link"
	 * @generated
	 */
	String getPaginationAnchorClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getPaginationAnchorClass <em>Pagination Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination Anchor Class</em>' attribute.
	 * @see #getPaginationAnchorClass()
	 * @generated
	 */
	void setPaginationAnchorClass(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Entity containingType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isContained();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Entity> referencableEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Entity> valueEntities();

} // CollectionUnit
