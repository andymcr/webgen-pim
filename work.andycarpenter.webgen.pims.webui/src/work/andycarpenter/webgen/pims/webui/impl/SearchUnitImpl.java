/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.webgen.pims.webui.IndexUnit;
import work.andycarpenter.webgen.pims.webui.SearchUnit;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.SearchUnitImpl#getResultsDestination <em>Results Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchUnitImpl extends ControlUnitImpl implements SearchUnit {
	/**
	 * The cached value of the '{@link #getResultsDestination() <em>Results Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsDestination()
	 * @generated
	 * @ordered
	 */
	protected IndexUnit resultsDestination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.SEARCH_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexUnit getResultsDestination() {
		if (resultsDestination != null && resultsDestination.eIsProxy()) {
			InternalEObject oldResultsDestination = (InternalEObject)resultsDestination;
			resultsDestination = (IndexUnit)eResolveProxy(oldResultsDestination);
			if (resultsDestination != oldResultsDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION, oldResultsDestination, resultsDestination));
			}
		}
		return resultsDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnit basicGetResultsDestination() {
		return resultsDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultsDestination(IndexUnit newResultsDestination) {
		IndexUnit oldResultsDestination = resultsDestination;
		resultsDestination = newResultsDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION, oldResultsDestination, resultsDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				if (resolve) return getResultsDestination();
				return basicGetResultsDestination();
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
			case WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				setResultsDestination((IndexUnit)newValue);
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
			case WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				setResultsDestination((IndexUnit)null);
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
			case WebuiPackage.SEARCH_UNIT__RESULTS_DESTINATION:
				return resultsDestination != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchUnitImpl
