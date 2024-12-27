/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.common.util.EList;
import work.andycarpenter.webgen.pims.persistence.FeatureVariableContext;

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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalRowClass <em>Local Row Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalColumnClass <em>Local Column Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardClass <em>Local Card Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardHeaderClass <em>Local Card Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardBodyClass <em>Local Card Body Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardFooterClass <em>Local Card Footer Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalBadgeClass <em>Local Badge Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit()
 * @model abstract="true"
 * @generated
 */
public interface CardsUnit extends CollectionUnit, FeatureVariableContext {
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Local Row Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Row Class</em>' attribute.
	 * @see #setLocalRowClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalRowClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalRowClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalRowClass <em>Local Row Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Row Class</em>' attribute.
	 * @see #getLocalRowClass()
	 * @generated
	 */
	void setLocalRowClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Column Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Column Class</em>' attribute.
	 * @see #setLocalColumnClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalColumnClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalColumnClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalColumnClass <em>Local Column Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Column Class</em>' attribute.
	 * @see #getLocalColumnClass()
	 * @generated
	 */
	void setLocalColumnClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Card Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Card Class</em>' attribute.
	 * @see #setLocalCardClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalCardClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalCardClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardClass <em>Local Card Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Card Class</em>' attribute.
	 * @see #getLocalCardClass()
	 * @generated
	 */
	void setLocalCardClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Card Header Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Card Header Class</em>' attribute.
	 * @see #setLocalCardHeaderClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalCardHeaderClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalCardHeaderClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardHeaderClass <em>Local Card Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Card Header Class</em>' attribute.
	 * @see #getLocalCardHeaderClass()
	 * @generated
	 */
	void setLocalCardHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Card Body Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Card Body Class</em>' attribute.
	 * @see #setLocalCardBodyClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalCardBodyClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalCardBodyClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardBodyClass <em>Local Card Body Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Card Body Class</em>' attribute.
	 * @see #getLocalCardBodyClass()
	 * @generated
	 */
	void setLocalCardBodyClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Card Footer Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Card Footer Class</em>' attribute.
	 * @see #setLocalCardFooterClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalCardFooterClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalCardFooterClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalCardFooterClass <em>Local Card Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Card Footer Class</em>' attribute.
	 * @see #getLocalCardFooterClass()
	 * @generated
	 */
	void setLocalCardFooterClass(String value);

	/**
	 * Returns the value of the '<em><b>Local Badge Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Badge Class</em>' attribute.
	 * @see #setLocalBadgeClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getCardsUnit_LocalBadgeClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalBadgeClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getLocalBadgeClass <em>Local Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Badge Class</em>' attribute.
	 * @see #getLocalBadgeClass()
	 * @generated
	 */
	void setLocalBadgeClass(String value);

} // CardsUnit
