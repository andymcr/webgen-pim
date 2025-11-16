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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilters <em>Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isFiltersUseAutoSubmit <em>Filters Use Auto Submit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearLabelOverride <em>Clear Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearIconOverride <em>Clear Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearTitleOverride <em>Clear Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchLabelOverride <em>Search Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchIconOverride <em>Search Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchTitleOverride <em>Search Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getEmptyMessage <em>Empty Message</em>}</li>
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
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.CollectionFilter}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_Filters()
	 * @see work.andycarpenter.webgen.pims.webui.CollectionFilter#getAffects
	 * @model opposite="affects" containment="true"
	 * @generated
	 */
	EList<CollectionFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Filters Use Auto Submit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters Use Auto Submit</em>' attribute.
	 * @see #setFiltersUseAutoSubmit(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_FiltersUseAutoSubmit()
	 * @model default="true"
	 * @generated
	 */
	boolean isFiltersUseAutoSubmit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#isFiltersUseAutoSubmit <em>Filters Use Auto Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filters Use Auto Submit</em>' attribute.
	 * @see #isFiltersUseAutoSubmit()
	 * @generated
	 */
	void setFiltersUseAutoSubmit(boolean value);

	/**
	 * Returns the value of the '<em><b>Clear Label Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Label Override</em>' attribute.
	 * @see #setClearLabelOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_ClearLabelOverride()
	 * @model
	 * @generated
	 */
	String getClearLabelOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearLabelOverride <em>Clear Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Label Override</em>' attribute.
	 * @see #getClearLabelOverride()
	 * @generated
	 */
	void setClearLabelOverride(String value);

	/**
	 * Returns the value of the '<em><b>Clear Icon Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Icon Override</em>' attribute.
	 * @see #setClearIconOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_ClearIconOverride()
	 * @model
	 * @generated
	 */
	String getClearIconOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearIconOverride <em>Clear Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Icon Override</em>' attribute.
	 * @see #getClearIconOverride()
	 * @generated
	 */
	void setClearIconOverride(String value);

	/**
	 * Returns the value of the '<em><b>Clear Title Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Title Override</em>' attribute.
	 * @see #setClearTitleOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_ClearTitleOverride()
	 * @model
	 * @generated
	 */
	String getClearTitleOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getClearTitleOverride <em>Clear Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Title Override</em>' attribute.
	 * @see #getClearTitleOverride()
	 * @generated
	 */
	void setClearTitleOverride(String value);

	/**
	 * Returns the value of the '<em><b>Search Label Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Label Override</em>' attribute.
	 * @see #setSearchLabelOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_SearchLabelOverride()
	 * @model
	 * @generated
	 */
	String getSearchLabelOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchLabelOverride <em>Search Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Label Override</em>' attribute.
	 * @see #getSearchLabelOverride()
	 * @generated
	 */
	void setSearchLabelOverride(String value);

	/**
	 * Returns the value of the '<em><b>Search Icon Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Icon Override</em>' attribute.
	 * @see #setSearchIconOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_SearchIconOverride()
	 * @model
	 * @generated
	 */
	String getSearchIconOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchIconOverride <em>Search Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Icon Override</em>' attribute.
	 * @see #getSearchIconOverride()
	 * @generated
	 */
	void setSearchIconOverride(String value);

	/**
	 * Returns the value of the '<em><b>Search Title Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Title Override</em>' attribute.
	 * @see #setSearchTitleOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionUnit_SearchTitleOverride()
	 * @model
	 * @generated
	 */
	String getSearchTitleOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getSearchTitleOverride <em>Search Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Title Override</em>' attribute.
	 * @see #getSearchTitleOverride()
	 * @generated
	 */
	void setSearchTitleOverride(String value);

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
