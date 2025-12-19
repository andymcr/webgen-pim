/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.base.NamedElement;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getAffects <em>Affects</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getPlaceholderOverride <em>Placeholder Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getTitleOverride <em>Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getHelp <em>Help</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter()
 * @model abstract="true"
 * @generated
 */
public interface CollectionFilter extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' container reference.
	 * @see #setAffects(CollectionUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter_Affects()
	 * @see work.andycarpenter.webgen.pims.webui.CollectionUnit#getFilters
	 * @model opposite="filters" required="true" transient="false"
	 * @generated
	 */
	CollectionUnit getAffects();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getAffects <em>Affects</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affects</em>' container reference.
	 * @see #getAffects()
	 * @generated
	 */
	void setAffects(CollectionUnit value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Placeholder Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder Override</em>' attribute.
	 * @see #setPlaceholderOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter_PlaceholderOverride()
	 * @model default=""
	 * @generated
	 */
	String getPlaceholderOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getPlaceholderOverride <em>Placeholder Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder Override</em>' attribute.
	 * @see #getPlaceholderOverride()
	 * @generated
	 */
	void setPlaceholderOverride(String value);

	/**
	 * Returns the value of the '<em><b>Title Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Override</em>' attribute.
	 * @see #setTitleOverride(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter_TitleOverride()
	 * @model default=""
	 * @generated
	 */
	String getTitleOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getTitleOverride <em>Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Override</em>' attribute.
	 * @see #getTitleOverride()
	 * @generated
	 */
	void setTitleOverride(String value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see #setHelp(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCollectionFilter_Help()
	 * @model default=""
	 * @generated
	 */
	String getHelp();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CollectionFilter#getHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #getHelp()
	 * @generated
	 */
	void setHelp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if affects.selection.oclIsUndefined() then\t\n\tOrderedSet{affects.contentType}\nelse\n\taffects.selection.referencableEntities()\nendif'"
	 * @generated
	 */
	EList<Entity> referencableEntities();
} // CollectionFilter
