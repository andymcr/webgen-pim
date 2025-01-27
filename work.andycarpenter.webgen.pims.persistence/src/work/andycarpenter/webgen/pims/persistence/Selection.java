/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.base.NamedElement;
import work.andycarpenter.webgen.pims.expression.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getFields <em>Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getJoins <em>Joins</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getCondition <em>Condition</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getLimit <em>Limit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath <em>Select Path</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getFilters <em>Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.Selection#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends NamedElement, FormalParameterList, FeatureVariableContext {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Repository#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' container reference.
	 * @see #setDefinedBy(Repository)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_DefinedBy()
	 * @see work.andycarpenter.webgen.pims.persistence.Repository#getSelections
	 * @model opposite="selections" required="true" transient="false"
	 * @generated
	 */
	Repository getDefinedBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#getDefinedBy <em>Defined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' container reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(Repository value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Distinct()
	 * @model
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Fields()
	 * @model
	 * @generated
	 */
	EList<Feature> getFields();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Joins()
	 * @model
	 * @generated
	 */
	EList<Association> getJoins();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Predicate)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getCondition();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Predicate value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Order}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Order#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Ordering()
	 * @see work.andycarpenter.webgen.pims.persistence.Order#getSelection
	 * @model opposite="selection" containment="true"
	 * @generated
	 */
	EList<Order> getOrdering();

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Limit()
	 * @model default="0"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Grouping()
	 * @model
	 * @generated
	 */
	EList<Feature> getGrouping();

	/**
	 * Returns the value of the '<em><b>Select Path</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Path</em>' containment reference.
	 * @see #setSelectPath(SelectionPath)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_SelectPath()
	 * @see work.andycarpenter.webgen.pims.persistence.SelectionPath#getSelection
	 * @model opposite="selection" containment="true"
	 * @generated
	 */
	SelectionPath getSelectPath();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#getSelectPath <em>Select Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Path</em>' containment reference.
	 * @see #getSelectPath()
	 * @generated
	 */
	void setSelectPath(SelectionPath value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.persistence.Filter}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.persistence.Filter#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_Filters()
	 * @see work.andycarpenter.webgen.pims.persistence.Filter#getSelection
	 * @model opposite="selection" containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#getSelection_MethodName()
	 * @model
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.persistence.Selection#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if joins-&gt;isEmpty() then\t\n\tOrderedSet{self.definedBy.serves}\nelse\n\tjoins-&gt;iterate(\n\t\tj; types : OrderedSet(Entity) = OrderedSet{self.definedBy.serves}\n\t\t| if types-&gt;includes(j.partOf) then\n\t\t\t\ttypes-&gt;append(j.targetEntity)\n\t\t\telse\n\t\t\t\ttypes-&gt;append(j.partOf)\n\t\t\tendif)\nendif'"
	 * @generated
	 */
	EList<Entity> referencableEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Entity selectionType();

} // Selection
