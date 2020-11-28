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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#isOverlaySingleSelectAction <em>Overlay Single Select Action</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getRowClass <em>Row Class</em>}</li>
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
	 * The default value is <code>"container"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_ContentClass()
	 * @model default="container" ordered="false"
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
	 * The default value is <code>"card rounded shadow-sm h-100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Class</em>' attribute.
	 * @see #setCardClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_CardClass()
	 * @model default="card rounded shadow-sm h-100" ordered="false"
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
