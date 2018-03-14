/**
 */
package work.andycarpenter.webgen.pims.image;

import org.eclipse.emf.common.util.EList;

import work.andycarpenter.webgen.pims.base.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manipulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.image.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.image.ImageManipulation#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.image.ImagePackage#getImageManipulation()
 * @model
 * @generated
 */
public interface ImageManipulation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Jpeg Quality</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jpeg Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpeg Quality</em>' attribute.
	 * @see #setJpegQuality(int)
	 * @see work.andycarpenter.webgen.pims.image.ImagePackage#getImageManipulation_JpegQuality()
	 * @model default="-1"
	 * @generated
	 */
	int getJpegQuality();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.image.ImageManipulation#getJpegQuality <em>Jpeg Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpeg Quality</em>' attribute.
	 * @see #getJpegQuality()
	 * @generated
	 */
	void setJpegQuality(int value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.image.ImageFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.image.ImagePackage#getImageManipulation_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageFilter> getFilters();

} // ImageManipulation
