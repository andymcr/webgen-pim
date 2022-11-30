/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.SlugNamer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slug Namer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SlugNamerImpl extends FileNamerImpl implements SlugNamer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlugNamerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.SLUG_NAMER;
	}

} //SlugNamerImpl
