/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.image.ImageManipulation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getShowMissingImageWhen <em>Show Missing Image When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImageFilter <em>Image Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImageFilter <em>Missing Image Filter</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ImageUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Path Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #setImagePathFeature(FeaturePath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit_ImagePathFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getImagePathFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImagePathFeature <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path Feature</em>' containment reference.
	 * @see #getImagePathFeature()
	 * @generated
	 */
	void setImagePathFeature(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Filter</em>' reference.
	 * @see #setImageFilter(ImageManipulation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit_ImageFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getImageFilter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getImageFilter <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Filter</em>' reference.
	 * @see #getImageFilter()
	 * @generated
	 */
	void setImageFilter(ImageManipulation value);

	/**
	 * Returns the value of the '<em><b>Missing Image Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Image Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Image Filter</em>' reference.
	 * @see #setMissingImageFilter(ImageManipulation)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit_MissingImageFilter()
	 * @model
	 * @generated
	 */
	ImageManipulation getMissingImageFilter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImageFilter <em>Missing Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Image Filter</em>' reference.
	 * @see #getMissingImageFilter()
	 * @generated
	 */
	void setMissingImageFilter(ImageManipulation value);

	/**
	 * Returns the value of the '<em><b>Missing Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing Image Path</em>' attribute.
	 * @see #setMissingImagePath(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit_MissingImagePath()
	 * @model
	 * @generated
	 */
	String getMissingImagePath();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getMissingImagePath <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing Image Path</em>' attribute.
	 * @see #getMissingImagePath()
	 * @generated
	 */
	void setMissingImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Show Missing Image When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Missing Image When</em>' containment reference.
	 * @see #setShowMissingImageWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getImageUnit_ShowMissingImageWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getShowMissingImageWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.ImageUnit#getShowMissingImageWhen <em>Show Missing Image When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Missing Image When</em>' containment reference.
	 * @see #getShowMissingImageWhen()
	 * @generated
	 */
	void setShowMissingImageWhen(Predicate value);

} // ImageUnit
