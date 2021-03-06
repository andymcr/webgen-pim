/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.base.FormalParameter;
import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.base.impl.NamedElementImpl;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.Order;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.persistence.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getSelectPath <em>Select Path</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getPathType <em>Path Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.persistence.impl.SelectionImpl#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionImpl extends NamedElementImpl implements Selection {
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
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> fields;

	/**
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> joins;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Predicate condition;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> ordering;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> grouping;

	/**
	 * The cached value of the '{@link #getSelectPath() <em>Select Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> selectPath;

	/**
	 * The cached setting delegate for the '{@link #getPathType() <em>Path Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PATH_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.SELECTION__PATH_TYPE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FormalParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<FormalParameter>(FormalParameter.class, this, PersistencePackage.SELECTION__PARAMETERS, BasePackage.FORMAL_PARAMETER__FORMAL_FOR);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getDefinedBy() {
		if (eContainerFeatureID() != PersistencePackage.SELECTION__DEFINED_BY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedBy(Repository newDefinedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinedBy, PersistencePackage.SELECTION__DEFINED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinedBy(Repository newDefinedBy) {
		if (newDefinedBy != eInternalContainer() || (eContainerFeatureID() != PersistencePackage.SELECTION__DEFINED_BY && newDefinedBy != null)) {
			if (EcoreUtil.isAncestor(this, newDefinedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinedBy != null)
				msgs = ((InternalEObject)newDefinedBy).eInverseAdd(this, PersistencePackage.REPOSITORY__SELECTIONS, Repository.class, msgs);
			msgs = basicSetDefinedBy(newDefinedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__DEFINED_BY, newDefinedBy, newDefinedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.SELECTION__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getJoins() {
		if (joins == null) {
			joins = new EObjectResolvingEList<Association>(Association.class, this, PersistencePackage.SELECTION__JOINS);
		}
		return joins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Predicate newCondition, NotificationChain msgs) {
		Predicate oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Predicate newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.SELECTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistencePackage.SELECTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrdering() {
		if (ordering == null) {
			ordering = new EObjectContainmentEList<Order>(Order.class, this, PersistencePackage.SELECTION__ORDERING);
		}
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getGrouping() {
		if (grouping == null) {
			grouping = new EObjectResolvingEList<Feature>(Feature.class, this, PersistencePackage.SELECTION__GROUPING);
		}
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getSelectPath() {
		if (selectPath == null) {
			selectPath = new EObjectResolvingEList<Association>(Association.class, this, PersistencePackage.SELECTION__SELECT_PATH);
		}
		return selectPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getPathType() {
		return (Entity)PATH_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetPathType() {
		return (Entity)PATH_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPathType() {
		return PATH_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentWithInverseEList<Filter>(Filter.class, this, PersistencePackage.SELECTION__FILTERS, PersistencePackage.FILTER__SELECTION);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.SELECTION__METHOD_NAME, oldMethodName, methodName));
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
			case PersistencePackage.SELECTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case PersistencePackage.SELECTION__DEFINED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinedBy((Repository)otherEnd, msgs);
			case PersistencePackage.SELECTION__FILTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFilters()).basicAdd(otherEnd, msgs);
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
			case PersistencePackage.SELECTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case PersistencePackage.SELECTION__DEFINED_BY:
				return basicSetDefinedBy(null, msgs);
			case PersistencePackage.SELECTION__CONDITION:
				return basicSetCondition(null, msgs);
			case PersistencePackage.SELECTION__ORDERING:
				return ((InternalEList<?>)getOrdering()).basicRemove(otherEnd, msgs);
			case PersistencePackage.SELECTION__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case PersistencePackage.SELECTION__DEFINED_BY:
				return eInternalContainer().eInverseRemove(this, PersistencePackage.REPOSITORY__SELECTIONS, Repository.class, msgs);
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
			case PersistencePackage.SELECTION__PARAMETERS:
				return getParameters();
			case PersistencePackage.SELECTION__DEFINED_BY:
				return getDefinedBy();
			case PersistencePackage.SELECTION__DISTINCT:
				return isDistinct();
			case PersistencePackage.SELECTION__FIELDS:
				return getFields();
			case PersistencePackage.SELECTION__JOINS:
				return getJoins();
			case PersistencePackage.SELECTION__CONDITION:
				return getCondition();
			case PersistencePackage.SELECTION__ORDERING:
				return getOrdering();
			case PersistencePackage.SELECTION__LIMIT:
				return getLimit();
			case PersistencePackage.SELECTION__GROUPING:
				return getGrouping();
			case PersistencePackage.SELECTION__SELECT_PATH:
				return getSelectPath();
			case PersistencePackage.SELECTION__PATH_TYPE:
				if (resolve) return getPathType();
				return basicGetPathType();
			case PersistencePackage.SELECTION__FILTERS:
				return getFilters();
			case PersistencePackage.SELECTION__METHOD_NAME:
				return getMethodName();
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
			case PersistencePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case PersistencePackage.SELECTION__DEFINED_BY:
				setDefinedBy((Repository)newValue);
				return;
			case PersistencePackage.SELECTION__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case PersistencePackage.SELECTION__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.SELECTION__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Association>)newValue);
				return;
			case PersistencePackage.SELECTION__CONDITION:
				setCondition((Predicate)newValue);
				return;
			case PersistencePackage.SELECTION__ORDERING:
				getOrdering().clear();
				getOrdering().addAll((Collection<? extends Order>)newValue);
				return;
			case PersistencePackage.SELECTION__LIMIT:
				setLimit((Integer)newValue);
				return;
			case PersistencePackage.SELECTION__GROUPING:
				getGrouping().clear();
				getGrouping().addAll((Collection<? extends Feature>)newValue);
				return;
			case PersistencePackage.SELECTION__SELECT_PATH:
				getSelectPath().clear();
				getSelectPath().addAll((Collection<? extends Association>)newValue);
				return;
			case PersistencePackage.SELECTION__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case PersistencePackage.SELECTION__METHOD_NAME:
				setMethodName((String)newValue);
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
			case PersistencePackage.SELECTION__PARAMETERS:
				getParameters().clear();
				return;
			case PersistencePackage.SELECTION__DEFINED_BY:
				setDefinedBy((Repository)null);
				return;
			case PersistencePackage.SELECTION__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case PersistencePackage.SELECTION__FIELDS:
				getFields().clear();
				return;
			case PersistencePackage.SELECTION__JOINS:
				getJoins().clear();
				return;
			case PersistencePackage.SELECTION__CONDITION:
				setCondition((Predicate)null);
				return;
			case PersistencePackage.SELECTION__ORDERING:
				getOrdering().clear();
				return;
			case PersistencePackage.SELECTION__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case PersistencePackage.SELECTION__GROUPING:
				getGrouping().clear();
				return;
			case PersistencePackage.SELECTION__SELECT_PATH:
				getSelectPath().clear();
				return;
			case PersistencePackage.SELECTION__FILTERS:
				getFilters().clear();
				return;
			case PersistencePackage.SELECTION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
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
			case PersistencePackage.SELECTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case PersistencePackage.SELECTION__DEFINED_BY:
				return getDefinedBy() != null;
			case PersistencePackage.SELECTION__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case PersistencePackage.SELECTION__FIELDS:
				return fields != null && !fields.isEmpty();
			case PersistencePackage.SELECTION__JOINS:
				return joins != null && !joins.isEmpty();
			case PersistencePackage.SELECTION__CONDITION:
				return condition != null;
			case PersistencePackage.SELECTION__ORDERING:
				return ordering != null && !ordering.isEmpty();
			case PersistencePackage.SELECTION__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case PersistencePackage.SELECTION__GROUPING:
				return grouping != null && !grouping.isEmpty();
			case PersistencePackage.SELECTION__SELECT_PATH:
				return selectPath != null && !selectPath.isEmpty();
			case PersistencePackage.SELECTION__PATH_TYPE:
				return isSetPathType();
			case PersistencePackage.SELECTION__FILTERS:
				return filters != null && !filters.isEmpty();
			case PersistencePackage.SELECTION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
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
				case PersistencePackage.SELECTION__PARAMETERS: return BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS;
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
				case BasePackage.FORMAL_PARAMETER_LIST__PARAMETERS: return PersistencePackage.SELECTION__PARAMETERS;
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
		result.append(" (distinct: ");
		result.append(distinct);
		result.append(", limit: ");
		result.append(limit);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl
