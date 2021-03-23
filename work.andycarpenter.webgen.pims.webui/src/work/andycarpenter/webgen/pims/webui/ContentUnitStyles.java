/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit Styles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnitStyles()
 * @model abstract="true"
 * @generated
 */
public interface ContentUnitStyles extends EObject {
	/**
	 * Returns the value of the '<em><b>Section Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Class</em>' attribute.
	 * @see #setSectionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnitStyles_SectionClass()
	 * @model default=""
	 * @generated
	 */
	String getSectionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getSectionClass <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Class</em>' attribute.
	 * @see #getSectionClass()
	 * @generated
	 */
	void setSectionClass(String value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnitStyles_CaptionClass()
	 * @model default=""
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getContentUnitStyles_ContentClass()
	 * @model default=""
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ContentUnitStyles#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // ContentUnitStyles
