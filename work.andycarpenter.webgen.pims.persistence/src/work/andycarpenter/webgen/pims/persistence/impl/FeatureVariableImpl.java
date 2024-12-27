/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.expression.impl.VariableImpl;

import work.andycarpenter.webgen.pims.persistence.FeatureVariable;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.FeatureVariableImpl#isUseContainerAsContext <em>Use Container As Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureVariableImpl extends VariableImpl implements FeatureVariable {
	/**
	 * The default value of the '{@link #isUseContainerAsContext() <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseContainerAsContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CONTAINER_AS_CONTEXT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseContainerAsContext() <em>Use Container As Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseContainerAsContext()
	 * @generated
	 * @ordered
	 */
	protected boolean useContainerAsContext = USE_CONTAINER_AS_CONTEXT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.FEATURE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseContainerAsContext() {
		return useContainerAsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseContainerAsContext(boolean newUseContainerAsContext) {
		boolean oldUseContainerAsContext = useContainerAsContext;
		useContainerAsContext = newUseContainerAsContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT, oldUseContainerAsContext, useContainerAsContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				return isUseContainerAsContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				setUseContainerAsContext((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				setUseContainerAsContext(USE_CONTAINER_AS_CONTEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT:
				return useContainerAsContext != USE_CONTAINER_AS_CONTEXT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useContainerAsContext: ");
		result.append(useContainerAsContext);
		result.append(')');
		return result.toString();
	}

} //FeatureVariableImpl
