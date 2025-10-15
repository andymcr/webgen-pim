/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.base.NamedElement;
import work.andycarpenter.webgen.pims.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
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
} // CollectionFilter
