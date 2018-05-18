/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.image.ImageManipulation;
import work.andycarpenter.webgen.pims.persistence.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gallery Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getUnitTitle <em>Unit Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getTransitionTime <em>Transition Time</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit()
 * @model
 * @generated
 */
public interface GalleryUnit extends ImageUnit {
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_UnitTitle()
	 * @model ordered="false"
	 * @generated
	 */
	Label getUnitTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getUnitTitle <em>Unit Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Title</em>' reference.
	 * @see #getUnitTitle()
	 * @generated
	 */
	void setUnitTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Full Size Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Size Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Size Filter</em>' reference.
	 * @see #setFullSizeFilter(ImageManipulation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_FullSizeFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getFullSizeFilter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getFullSizeFilter <em>Full Size Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Size Filter</em>' reference.
	 * @see #getFullSizeFilter()
	 * @generated
	 */
	void setFullSizeFilter(ImageManipulation value);

	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_ShowTime()
	 * @model default="-1"
	 * @generated
	 */
	int getShowTime();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getShowTime <em>Show Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Time</em>' attribute.
	 * @see #getShowTime()
	 * @generated
	 */
	void setShowTime(int value);

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_TransitionTime()
	 * @model default="-1"
	 * @generated
	 */
	int getTransitionTime();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(int value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,gallery_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_StyleClass()
	 * @model default="unit,gallery_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"gallery_content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getGalleryUnit_ContentClass()
	 * @model default="gallery_content" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.GalleryUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // GalleryUnit
