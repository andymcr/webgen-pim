/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isOverlayTitle <em>Overlay Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageCardsUnit()
 * @model
 * @generated
 */
public interface ImageCardsUnit extends CardsUnit, ImageUnit {
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageCardsUnit_OverlayTitle()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isOverlayTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isOverlayTitle <em>Overlay Title</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageCardsUnit_EnableImageEnlargement()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnableImageEnlargement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isEnableImageEnlargement <em>Enable Image Enlargement</em>}' attribute.
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageCardsUnit_RevealUntruncatedContent()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRevealUntruncatedContent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageCardsUnit#isRevealUntruncatedContent <em>Reveal Untruncated Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reveal Untruncated Content</em>' attribute.
	 * @see #isRevealUntruncatedContent()
	 * @generated
	 */
	void setRevealUntruncatedContent(boolean value);

} // ImageCardsUnit
