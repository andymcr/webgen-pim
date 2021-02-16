/**
 */
package work.andycarpenter.webgen.pims.webui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getUriElement <em>Uri Element</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDeleteAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='canOnlyDeleteSingletons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL canOnlyDeleteSingletons='if usedBy.oclIsKindOf(UnitElement) then\n\tusedBy.oclAsType(UnitElement).attribute.cardinality &lt;&gt; persistence::Cardinality::Many\nelse if usedBy.oclIsKindOf(UnitAssociation) then\n\tusedBy.oclAsType(UnitAssociation).association.cardinality &lt;&gt; persistence::Cardinality::Many\nelse\n\tusedBy.oclIsKindOf(CollectionUnit)\nendif endif\n'"
 * @generated
 */
public interface DeleteAction extends Action {
	/**
	 * Returns the value of the '<em><b>Requires Role</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Role</em>' attribute.
	 * @see #setRequiresRole(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDeleteAction_RequiresRole()
	 * @model default=""
	 * @generated
	 */
	String getRequiresRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getRequiresRole <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Role</em>' attribute.
	 * @see #getRequiresRole()
	 * @generated
	 */
	void setRequiresRole(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getDeleteAction_UriElement()
	 * @model default=""
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.webgen.pims.webui.DeleteAction#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

} // DeleteAction
