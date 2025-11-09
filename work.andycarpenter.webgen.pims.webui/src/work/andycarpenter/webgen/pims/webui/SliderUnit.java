/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getShowTime <em>Show Time</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getTransitionTime <em>Transition Time</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSliderUnit()
 * @model
 * @generated
 */
public interface SliderUnit extends CollectionUnit, ImageUnit {
	/**
	 * Returns the value of the '<em><b>Show Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Time</em>' attribute.
	 * @see #setShowTime(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSliderUnit_ShowTime()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getShowTime();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getShowTime <em>Show Time</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(int)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSliderUnit_TransitionTime()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getTransitionTime();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SliderUnit#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	void setTransitionTime(int value);

} // SliderUnit
