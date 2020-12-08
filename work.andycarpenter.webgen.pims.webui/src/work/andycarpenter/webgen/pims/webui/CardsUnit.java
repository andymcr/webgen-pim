/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cards Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getBadges <em>Badges</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getRowClass <em>Row Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getColumnClass <em>Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardClass <em>Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardHeaderClass <em>Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardBodyClass <em>Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardFooterClass <em>Card Footer Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit()
 * @model abstract="true"
 * @generated
 */
public interface CardsUnit extends CollectionUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.webgen.pims.webui.Badge}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn <em>Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Badges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_Badges()
	 * @see work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn
	 * @model opposite="displayedOn" containment="true"
	 * @generated
	 */
	EList<Badge> getBadges();

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
	 * Returns the value of the '<em><b>Row Class</b></em>' attribute.
	 * The default value is <code>"row row-cols-1 row-cols-md-3 row-cols-lg-4 g-3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Class</em>' attribute.
	 * @see #setRowClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_RowClass()
	 * @model default="row row-cols-1 row-cols-md-3 row-cols-lg-4 g-3" ordered="false"
	 * @generated
	 */
	String getRowClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getRowClass <em>Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Class</em>' attribute.
	 * @see #getRowClass()
	 * @generated
	 */
	void setRowClass(String value);

	/**
	 * Returns the value of the '<em><b>Column Class</b></em>' attribute.
	 * The default value is <code>"col"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Class</em>' attribute.
	 * @see #setColumnClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_ColumnClass()
	 * @model default="col" ordered="false"
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
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' attribute.
	 * @see #setCardClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardClass()
	 * @model default="" ordered="false"
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

	/**
	 * Returns the value of the '<em><b>Card Header Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Header Class</em>' attribute.
	 * @see #setCardHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardHeaderClass()
	 * @model default=""
	 * @generated
	 */
	String getCardHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardHeaderClass <em>Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Header Class</em>' attribute.
	 * @see #getCardHeaderClass()
	 * @generated
	 */
	void setCardHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Card Body Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Body Class</em>' attribute.
	 * @see #setCardBodyClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardBodyClass()
	 * @model default=""
	 * @generated
	 */
	String getCardBodyClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardBodyClass <em>Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Body Class</em>' attribute.
	 * @see #getCardBodyClass()
	 * @generated
	 */
	void setCardBodyClass(String value);

	/**
	 * Returns the value of the '<em><b>Card Footer Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Footer Class</em>' attribute.
	 * @see #setCardFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardFooterClass()
	 * @model default=""
	 * @generated
	 */
	String getCardFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getCardFooterClass <em>Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Footer Class</em>' attribute.
	 * @see #getCardFooterClass()
	 * @generated
	 */
	void setCardFooterClass(String value);

} // CardsUnit
