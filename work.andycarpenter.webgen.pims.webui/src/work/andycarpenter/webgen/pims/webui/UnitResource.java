/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.ImageResource;
import work.andycarpenter.webgen.pims.persistence.ResourcePathElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDeletable <em>Is Deletable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDownloadable <em>Is Downloadable</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#isShowImageWhenEditing <em>Show Image When Editing</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.UnitResource#getImageFilter <em>Image Filter</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource()
 * @model
 * @generated
 */
public interface UnitResource extends UnitFeature, ResourcePathElement {
	/**
	 * Returns the value of the '<em><b>Is Deletable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Deletable</em>' attribute.
	 * @see #setIsDeletable(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_IsDeletable()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsDeletable();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDeletable <em>Is Deletable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deletable</em>' attribute.
	 * @see #isIsDeletable()
	 * @generated
	 */
	void setIsDeletable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Downloadable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Downloadable</em>' attribute.
	 * @see #setIsDownloadable(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_IsDownloadable()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsDownloadable();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isIsDownloadable <em>Is Downloadable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Downloadable</em>' attribute.
	 * @see #isIsDownloadable()
	 * @generated
	 */
	void setIsDownloadable(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Image When Editing</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Image When Editing</em>' attribute.
	 * @see #setShowImageWhenEditing(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_ShowImageWhenEditing()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowImageWhenEditing();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#isShowImageWhenEditing <em>Show Image When Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Image When Editing</em>' attribute.
	 * @see #isShowImageWhenEditing()
	 * @generated
	 */
	void setShowImageWhenEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Filter</em>' reference.
	 * @see #setImageFilter(ImageResource)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getUnitResource_ImageFilter()
	 * @model
	 * @generated
	 */
	ImageResource getImageFilter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.UnitResource#getImageFilter <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Filter</em>' reference.
	 * @see #getImageFilter()
	 * @generated
	 */
	void setImageFilter(ImageResource value);

} // UnitResource
