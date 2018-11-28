/**
 */
package work.andycarpenter.webgen.pims.webui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate <em>Element Date</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateCardsUnit()
 * @model
 * @generated
 */
public interface DateCardsUnit extends CardsUnit {
	/**
	 * Returns the value of the '<em><b>Element Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Date</em>' containment reference.
	 * @see #setElementDate(FeaturePath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateCardsUnit_ElementDate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeaturePath getElementDate();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getElementDate <em>Element Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Date</em>' containment reference.
	 * @see #getElementDate()
	 * @generated
	 */
	void setElementDate(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute.
	 * The default value is <code>"unit,cards_unit,date_cards_unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute.
	 * @see #setStyleClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDateCardsUnit_StyleClass()
	 * @model default="unit,cards_unit,date_cards_unit" ordered="false"
	 * @generated
	 */
	String getStyleClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DateCardsUnit#getStyleClass <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Class</em>' attribute.
	 * @see #getStyleClass()
	 * @generated
	 */
	void setStyleClass(String value);

} // DateCardsUnit
