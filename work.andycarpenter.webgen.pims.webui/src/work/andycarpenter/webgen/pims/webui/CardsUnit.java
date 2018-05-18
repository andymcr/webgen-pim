/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getUnitTitle <em>Unit Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardClass <em>Card Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit()
 * @model abstract="true"
 * @generated
 */
public interface CardsUnit extends CollectionUnit, InlineActionContainer {
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
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_UnitTitle()
	 * @model ordered="false"
	 * @generated
	 */
	Label getUnitTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getUnitTitle <em>Unit Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Title</em>' reference.
	 * @see #getUnitTitle()
	 * @generated
	 */
	void setUnitTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #setOmitFieldLabels(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_OmitFieldLabels()
	 * @model default="false" ordered="false"
	 * @generated
	 */
	boolean isOmitFieldLabels();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
	 * @see #isOmitFieldLabels()
	 * @generated
	 */
	void setOmitFieldLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Overlay Single Select Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay Single Select Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay Single Select Action</em>' attribute.
	 * @see #setOverlaySingleSelectAction(boolean)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_OverlaySingleSelectAction()
	 * @model
	 * @generated
	 */
	boolean isOverlaySingleSelectAction();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Single Select Action</em>' attribute.
	 * @see #isOverlaySingleSelectAction()
	 * @generated
	 */
	void setOverlaySingleSelectAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>"row"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_ContentClass()
	 * @model default="row" ordered="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

	/**
	 * Returns the value of the '<em><b>Column Class</b></em>' attribute.
	 * The default value is <code>"col s12 m6 l3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Class</em>' attribute.
	 * @see #setColumnClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_ColumnClass()
	 * @model default="col s12 m6 l3" ordered="false"
	 * @generated
	 */
	String getColumnClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getColumnClass <em>Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Class</em>' attribute.
	 * @see #getColumnClass()
	 * @generated
	 */
	void setColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Card Class</b></em>' attribute.
	 * The default value is <code>"card hoverable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' attribute.
	 * @see #setCardClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardClass()
	 * @model default="card hoverable" ordered="false"
	 * @generated
	 */
	String getCardClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardClass <em>Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Class</em>' attribute.
	 * @see #getCardClass()
	 * @generated
	 */
	void setCardClass(String value);

} // CardsUnit
