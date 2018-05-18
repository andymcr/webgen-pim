/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageIndexUnit()
 * @model
 * @generated
 */
public interface ImageIndexUnit extends CardsUnit, ImageUnit {
	/**
	 * Returns the value of the '<em><b>Overlay Title</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Title</em>' attribute.
	 * @see #setOverlayTitle(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageIndexUnit_OverlayTitle()
	 * @model default="false"
	 * @generated
	 */
	boolean isOverlayTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isOverlayTitle <em>Overlay Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Title</em>' attribute.
	 * @see #isOverlayTitle()
	 * @generated
	 */
	void setOverlayTitle(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Image Enlargement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Image Enlargement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Image Enlargement</em>' attribute.
	 * @see #setEnableImageEnlargement(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageIndexUnit_EnableImageEnlargement()
	 * @model
	 * @generated
	 */
	boolean isEnableImageEnlargement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Image Enlargement</em>' attribute.
	 * @see #isEnableImageEnlargement()
	 * @generated
	 */
	void setEnableImageEnlargement(boolean value);

	/**
	 * Returns the value of the '<em><b>Reveal Untruncated Content</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reveal Untruncated Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reveal Untruncated Content</em>' attribute.
	 * @see #setRevealUntruncatedContent(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageIndexUnit_RevealUntruncatedContent()
	 * @model default="false"
	 * @generated
	 */
	boolean isRevealUntruncatedContent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reveal Untruncated Content</em>' attribute.
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 */
	void setRevealUntruncatedContent(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,image_index_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageIndexUnit_StyleClass()
	 * @model default="unit,image_index_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageIndexUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // ImageIndexUnit
