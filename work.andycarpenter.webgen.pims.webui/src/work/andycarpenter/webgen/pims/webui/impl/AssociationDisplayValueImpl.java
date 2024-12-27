/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.ecore.EClass;
import work.andycarpenter.webgen.pims.persistence.impl.AssociationPathElementImpl;
import work.andycarpenter.webgen.pims.webui.AssociationDisplayValue;
import work.andycarpenter.webgen.pims.webui.ValueContext;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Display Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssociationDisplayValueImpl extends AssociationPathElementImpl implements AssociationDisplayValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationDisplayValueImpl() {
		super();
	}

	public String name() {
		if (getAssociation() == null) {
			return "No association";
		} else {
//			if (eContainer() instanceof ValueContext) {
//				final ValueContext valueContext = (ValueContext) eContainer();
//				return valueContext.referencableEntities().stream()
//					.anyMatch(e -> e.getAssociations().contains(getAssociation()));
//			} else {
				return getAssociation().getName();
//			}		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSourceAssociation() {
		if (getAssociation() == null) {
			return true;
		} else {
			if (eContainer() instanceof ValueContext) {
				final ValueContext valueContext = (ValueContext) eContainer();
				return valueContext.valueEntities().stream()
					.anyMatch(e -> e.getAssociations().contains(getAssociation()));
			} else {
				return true;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.ASSOCIATION_DISPLAY_VALUE;
	}

} //AssociationDisplayValueImpl
