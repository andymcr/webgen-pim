/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.Operand;
import work.andycarpenter.webgen.pims.expression.PredicateIsEmpty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.impl.PredicateIsEmptyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateIsEmptyImpl extends ExpressionImpl implements PredicateIsEmpty {
	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Operand value;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateIsEmptyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.PREDICATE_IS_EMPTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.PREDICATE_IS_EMPTY__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operand getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Operand newValue, NotificationChain msgs) {
		Operand oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.PREDICATE_IS_EMPTY__VALUE, oldValue, newValue);
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
	public void setValue(Operand newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.PREDICATE_IS_EMPTY__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.PREDICATE_IS_EMPTY__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.PREDICATE_IS_EMPTY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.PREDICATE_IS_EMPTY__VALUE:
				return basicSetValue(null, msgs);
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
			case ExpressionPackage.PREDICATE_IS_EMPTY__NEGATED:
				return isNegated();
			case ExpressionPackage.PREDICATE_IS_EMPTY__VALUE:
				return getValue();
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
			case ExpressionPackage.PREDICATE_IS_EMPTY__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case ExpressionPackage.PREDICATE_IS_EMPTY__VALUE:
				setValue((Operand)newValue);
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
			case ExpressionPackage.PREDICATE_IS_EMPTY__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case ExpressionPackage.PREDICATE_IS_EMPTY__VALUE:
				setValue((Operand)null);
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
			case ExpressionPackage.PREDICATE_IS_EMPTY__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case ExpressionPackage.PREDICATE_IS_EMPTY__VALUE:
				return value != null;
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
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //PredicateIsEmptyImpl
