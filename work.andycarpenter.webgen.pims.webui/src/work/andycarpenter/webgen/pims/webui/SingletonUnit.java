/**
 */
package work.andycarpenter.webgen.pims.webui;

import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSingletonUnit()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyTitleWithSingletons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyTitleWithSingletons='not title.oclIsUndefined() implies \n\tif title.oclIsKindOf(persistence::Attribute) then\n\t\ttitle.oclAsType(persistence::Attribute).cardinality &lt;&gt; persistence::Cardinality::Many\n\telse\n\t\ttrue\n\tendif'"
 * @generated
 */
public interface SingletonUnit extends DynamicUnit {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' reference.
	 * @see #setTitle(Label)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSingletonUnit_Title()
	 * @model ordered="false"
	 * @generated
	 */
	Label getTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getTitle <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Label value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(Entity)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getSingletonUnit_ContentType()
	 * @model required="true"
	 * @generated
	 */
	Entity getContentType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.SingletonUnit#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(Entity value);

} // SingletonUnit
