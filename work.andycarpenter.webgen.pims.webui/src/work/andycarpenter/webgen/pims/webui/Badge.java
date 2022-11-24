/**
 */
package work.andycarpenter.webgen.pims.webui;

import org.eclipse.emf.ecore.EObject;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getValue <em>Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayWhen <em>Display When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.Badge#getLocalBadgeClass <em>Local Badge Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge()
 * @model
 * @generated
 */
public interface Badge extends EObject {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.webgen.pims.webui.CardsUnit#getBadges <em>Badges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(CardsUnit)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_DisplayedOn()
	 * @see work.andycarpenter.webgen.pims.webui.CardsUnit#getBadges
	 * @model opposite="badges" required="true" transient="false"
	 * @generated
	 */
	CardsUnit getDisplayedOn();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(CardsUnit value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_IconName()
	 * @model default=""
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(FeaturePath)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_Value()
	 * @model containment="true"
	 * @generated
	 */
	FeaturePath getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FeaturePath value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(Attribute)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_Title()
	 * @model
	 * @generated
	 */
	Attribute getTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Attribute value);

	/**
	 * Returns the value of the '<em><b>Display When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display When</em>' containment reference.
	 * @see #setDisplayWhen(Predicate)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_DisplayWhen()
	 * @model containment="true"
	 * @generated
	 */
	Predicate getDisplayWhen();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getDisplayWhen <em>Display When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display When</em>' containment reference.
	 * @see #getDisplayWhen()
	 * @generated
	 */
	void setDisplayWhen(Predicate value);

	/**
	 * Returns the value of the '<em><b>Local Badge Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Badge Class</em>' attribute.
	 * @see #setLocalBadgeClass(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getBadge_LocalBadgeClass()
	 * @model default=""
	 * @generated
	 */
	String getLocalBadgeClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.Badge#getLocalBadgeClass <em>Local Badge Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Badge Class</em>' attribute.
	 * @see #getLocalBadgeClass()
	 * @generated
	 */
	void setLocalBadgeClass(String value);

} // Badge
