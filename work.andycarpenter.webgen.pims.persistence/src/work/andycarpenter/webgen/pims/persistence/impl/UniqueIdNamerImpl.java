/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.UniqueIdNamer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Id Namer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UniqueIdNamerImpl extends FileNamerImpl implements UniqueIdNamer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueIdNamerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.UNIQUE_ID_NAMER;
	}

} //UniqueIdNamerImpl
