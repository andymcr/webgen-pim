/**
 */
package work.andycarpenter.webgen.pims.service.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.base.FormalParameter;
import work.andycarpenter.webgen.pims.base.FormalParameterList;

import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;

import work.andycarpenter.webgen.pims.service.BusinessOperation;
import work.andycarpenter.webgen.pims.service.OperationResultTypes;
import work.andycarpenter.webgen.pims.service.Service;
import work.andycarpenter.webgen.pims.service.ServicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.BusinessOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.BusinessOperationImpl#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.BusinessOperationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.BusinessOperationImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.service.impl.BusinessOperationImpl#getResultMimeType <em>Result Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessOperationImpl extends NamedElementImpl implements BusinessOperation {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameter> parameters;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> uses;

	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationResultTypes RESULT_TYPE_EDEFAULT = OperationResultTypes.NONE;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected OperationResultTypes resultType = RESULT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultMimeType() <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultMimeType() <em>Result Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultMimeType()
	 * @generated
	 * @ordered
	 */
	protected String resultMimeType = RESULT_MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.BUSINESS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<FormalParameter>(FormalParameter.class, this, ServicePackage.BUSINESS_OPERATION__PARAMETERS, BasePackage.FORMAL_PARAMETER__FORMAL_FOR);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getDefinedBy() {
		if (eContainerFeatureID() != ServicePackage.BUSINESS_OPERATION__DEFINED_BY) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedBy(Service newDefinedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedBy, ServicePackage.BUSINESS_OPERATION__DEFINED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedBy(Service newDefinedBy) {
		if (newDefinedBy != eInternalContainer() || (eContainerFeatureID() != ServicePackage.BUSINESS_OPERATION__DEFINED_BY && newDefinedBy != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedBy != null)
				msgs = ((InternalEObject)newDefinedBy).eInverseAdd(this, ServicePackage.SERVICE__OPERATIONS, Service.class, msgs);
			msgs = basicSetDefinedBy(newDefinedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.BUSINESS_OPERATION__DEFINED_BY, newDefinedBy, newDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.BUSINESS_OPERATION__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationResultTypes getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(OperationResultTypes newResultType) {
		OperationResultTypes oldResultType = resultType;
		resultType = newResultType == null ? RESULT_TYPE_EDEFAULT : newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.BUSINESS_OPERATION__RESULT_TYPE, oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultMimeType() {
		return resultMimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultMimeType(String newResultMimeType) {
		String oldResultMimeType = resultMimeType;
		resultMimeType = newResultMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE, oldResultMimeType, resultMimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedBy((Service)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				return basicSetDefinedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.SERVICE__OPERATIONS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				return getParameters();
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				return getDefinedBy();
			case ServicePackage.BUSINESS_OPERATION__USES:
				return getUses();
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				return getResultType();
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				return getResultMimeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				setDefinedBy((Service)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType((OperationResultTypes)newValue);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				setResultMimeType((String)newValue);
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
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				setDefinedBy((Service)null);
				return;
			case ServicePackage.BUSINESS_OPERATION__USES:
				getUses().clear();
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				setResultType(RESULT_TYPE_EDEFAULT);
				return;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				setResultMimeType(RESULT_MIME_TYPE_EDEFAULT);
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
			case ServicePackage.BUSINESS_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ServicePackage.BUSINESS_OPERATION__DEFINED_BY:
				return getDefinedBy() != null;
			case ServicePackage.BUSINESS_OPERATION__USES:
				return uses != null && !uses.isEmpty();
			case ServicePackage.BUSINESS_OPERATION__RESULT_TYPE:
				return resultType != RESULT_TYPE_EDEFAULT;
			case ServicePackage.BUSINESS_OPERATION__RESULT_MIME_TYPE:
				return RESULT_MIME_TYPE_EDEFAULT == null ? resultMimeType != null : !RESULT_MIME_TYPE_EDEFAULT.equals(resultMimeType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FormalParameterList.class) {
			switch (derivedFeatureID) {
				case ServicePackage.BUSINESS_OPERATION__PARAMETERS: return BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FormalParameterList.class) {
			switch (baseFeatureID) {
				case BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS: return ServicePackage.BUSINESS_OPERATION__PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (resultType: ");
		result.append(resultType);
		result.append(", resultMimeType: ");
		result.append(resultMimeType);
		result.append(')');
		return result.toString();
	}

} //BusinessOperationImpl
