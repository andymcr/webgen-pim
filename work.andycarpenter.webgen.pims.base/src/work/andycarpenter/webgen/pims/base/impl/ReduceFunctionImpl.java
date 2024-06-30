/**
 */
package work.andycarpenter.webgen.pims.base.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.base.Callable;
import work.andycarpenter.webgen.pims.base.ReduceFunction;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.expression.impl.OperandImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.base.impl.ReduceFunctionImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReduceFunctionImpl extends OperandImpl implements ReduceFunction {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Variable value;
	/**
	 * The cached value of the '{@link #getCallback() <em>Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallback()
	 * @generated
	 * @ordered
	 */
	protected Callable callback;
	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Expression initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.REDUCE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Variable newValue, NotificationChain msgs) {
		Variable oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Variable newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callable getCallback() {
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallback(Callable newCallback, NotificationChain msgs) {
		Callable oldCallback = callback;
		callback = newCallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__CALLBACK, oldCallback, newCallback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallback(Callable newCallback) {
		if (newCallback != callback) {
			NotificationChain msgs = null;
			if (callback != null)
				msgs = ((InternalEObject)callback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__CALLBACK, null, msgs);
			if (newCallback != null)
				msgs = ((InternalEObject)newCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__CALLBACK, null, msgs);
			msgs = basicSetCallback(newCallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__CALLBACK, newCallback, newCallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitial(Expression newInitial, NotificationChain msgs) {
		Expression oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__INITIAL, oldInitial, newInitial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(Expression newInitial) {
		if (newInitial != initial) {
			NotificationChain msgs = null;
			if (initial != null)
				msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__INITIAL, null, msgs);
			if (newInitial != null)
				msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.REDUCE_FUNCTION__INITIAL, null, msgs);
			msgs = basicSetInitial(newInitial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.REDUCE_FUNCTION__INITIAL, newInitial, newInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.REDUCE_FUNCTION__VALUE:
				return basicSetValue(null, msgs);
			case BasePackage.REDUCE_FUNCTION__CALLBACK:
				return basicSetCallback(null, msgs);
			case BasePackage.REDUCE_FUNCTION__INITIAL:
				return basicSetInitial(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.REDUCE_FUNCTION__VALUE:
				return getValue();
			case BasePackage.REDUCE_FUNCTION__CALLBACK:
				return getCallback();
			case BasePackage.REDUCE_FUNCTION__INITIAL:
				return getInitial();
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
			case BasePackage.REDUCE_FUNCTION__VALUE:
				setValue((Variable)newValue);
				return;
			case BasePackage.REDUCE_FUNCTION__CALLBACK:
				setCallback((Callable)newValue);
				return;
			case BasePackage.REDUCE_FUNCTION__INITIAL:
				setInitial((Expression)newValue);
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
			case BasePackage.REDUCE_FUNCTION__VALUE:
				setValue((Variable)null);
				return;
			case BasePackage.REDUCE_FUNCTION__CALLBACK:
				setCallback((Callable)null);
				return;
			case BasePackage.REDUCE_FUNCTION__INITIAL:
				setInitial((Expression)null);
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
			case BasePackage.REDUCE_FUNCTION__VALUE:
				return value != null;
			case BasePackage.REDUCE_FUNCTION__CALLBACK:
				return callback != null;
			case BasePackage.REDUCE_FUNCTION__INITIAL:
				return initial != null;
		}
		return super.eIsSet(featureID);
	}

} //ReduceFunctionImpl
