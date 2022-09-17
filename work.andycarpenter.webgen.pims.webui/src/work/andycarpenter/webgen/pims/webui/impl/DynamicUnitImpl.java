/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.webui.Action;
import work.andycarpenter.webgen.pims.webui.ActionContainer;
import work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement;
import work.andycarpenter.webgen.pims.webui.RouteActual;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getContainerActionsPlacement <em>Container Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getInstanceActionsPlacement <em>Instance Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getContainingType <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getRouteActuals <em>Route Actuals</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getDisplayFields <em>Display Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#isHasWhenFieldsEmptyAddImplicitFields <em>Has When Fields Empty Add Implicit Fields</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getMessageWhenHidden <em>Message When Hidden</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalFieldListClass <em>Local Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalFieldLabelClass <em>Local Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalFieldValueClass <em>Local Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalControlClass <em>Local Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalInstanceControlClass <em>Local Instance Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalAnchorClass <em>Local Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.DynamicUnitImpl#getLocalInstanceAnchorClass <em>Local Instance Anchor Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicUnitImpl extends ContentUnitImpl implements DynamicUnit {
	/**
	 * The default value of the '{@link #getContainerActionsPlacement() <em>Container Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerActionsPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final ContainerActionsPlacement CONTAINER_ACTIONS_PLACEMENT_EDEFAULT = ContainerActionsPlacement.ABOVE;

	/**
	 * The cached value of the '{@link #getContainerActionsPlacement() <em>Container Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerActionsPlacement()
	 * @generated
	 * @ordered
	 */
	protected ContainerActionsPlacement containerActionsPlacement = CONTAINER_ACTIONS_PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceActionsPlacement() <em>Instance Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceActionsPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceActionsPlacement INSTANCE_ACTIONS_PLACEMENT_EDEFAULT = InstanceActionsPlacement.FOOTER;

	/**
	 * The cached value of the '{@link #getInstanceActionsPlacement() <em>Instance Actions Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceActionsPlacement()
	 * @generated
	 * @ordered
	 */
	protected InstanceActionsPlacement instanceActionsPlacement = INSTANCE_ACTIONS_PLACEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The default value of the '{@link #getActionNavigationClass() <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAVIGATION_CLASS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getActionNavigationClass() <em>Action Navigation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionNavigationClass()
	 * @generated
	 * @ordered
	 */
	protected String actionNavigationClass = ACTION_NAVIGATION_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Entity contentType;

	/**
	 * The cached setting delegate for the '{@link #getContainingType() <em>Containing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTAINING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.DYNAMIC_UNIT__CONTAINING_TYPE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRouteActuals() <em>Route Actuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteActuals()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteActual> routeActuals;

	/**
	 * The cached value of the '{@link #getDisplayFields() <em>Display Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFields()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitField> displayFields;

	/**
	 * The default value of the '{@link #isHasWhenFieldsEmptyAddImplicitFields() <em>Has When Fields Empty Add Implicit Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasWhenFieldsEmptyAddImplicitFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasWhenFieldsEmptyAddImplicitFields() <em>Has When Fields Empty Add Implicit Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasWhenFieldsEmptyAddImplicitFields()
	 * @generated
	 * @ordered
	 */
	protected boolean hasWhenFieldsEmptyAddImplicitFields = HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHideWhen() <em>Hide When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate hideWhen;

	/**
	 * The default value of the '{@link #getMessageWhenHidden() <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWhenHidden()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WHEN_HIDDEN_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getMessageWhenHidden() <em>Message When Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWhenHidden()
	 * @generated
	 * @ordered
	 */
	protected String messageWhenHidden = MESSAGE_WHEN_HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected String footer = FOOTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFieldListClass() <em>Local Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FIELD_LIST_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalFieldListClass() <em>Local Field List Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldListClass()
	 * @generated
	 * @ordered
	 */
	protected String localFieldListClass = LOCAL_FIELD_LIST_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFieldLabelClass() <em>Local Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FIELD_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalFieldLabelClass() <em>Local Field Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String localFieldLabelClass = LOCAL_FIELD_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFieldValueClass() <em>Local Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FIELD_VALUE_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalFieldValueClass() <em>Local Field Value Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFieldValueClass()
	 * @generated
	 * @ordered
	 */
	protected String localFieldValueClass = LOCAL_FIELD_VALUE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalControlClass() <em>Local Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalControlClass() <em>Local Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalControlClass()
	 * @generated
	 * @ordered
	 */
	protected String localControlClass = LOCAL_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalInstanceControlClass() <em>Local Instance Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInstanceControlClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_INSTANCE_CONTROL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalInstanceControlClass() <em>Local Instance Control Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInstanceControlClass()
	 * @generated
	 * @ordered
	 */
	protected String localInstanceControlClass = LOCAL_INSTANCE_CONTROL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalAnchorClass() <em>Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalAnchorClass() <em>Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String localAnchorClass = LOCAL_ANCHOR_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalInstanceAnchorClass() <em>Local Instance Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInstanceAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_INSTANCE_ANCHOR_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLocalInstanceAnchorClass() <em>Local Instance Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInstanceAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String localInstanceAnchorClass = LOCAL_INSTANCE_ANCHOR_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.DYNAMIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerActionsPlacement getContainerActionsPlacement() {
		return containerActionsPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerActionsPlacement(ContainerActionsPlacement newContainerActionsPlacement) {
		ContainerActionsPlacement oldContainerActionsPlacement = containerActionsPlacement;
		containerActionsPlacement = newContainerActionsPlacement == null ? CONTAINER_ACTIONS_PLACEMENT_EDEFAULT : newContainerActionsPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT, oldContainerActionsPlacement, containerActionsPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceActionsPlacement getInstanceActionsPlacement() {
		return instanceActionsPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceActionsPlacement(InstanceActionsPlacement newInstanceActionsPlacement) {
		InstanceActionsPlacement oldInstanceActionsPlacement = instanceActionsPlacement;
		instanceActionsPlacement = newInstanceActionsPlacement == null ? INSTANCE_ACTIONS_PLACEMENT_EDEFAULT : newInstanceActionsPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT, oldInstanceActionsPlacement, instanceActionsPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, WebuiPackage.DYNAMIC_UNIT__ACTIONS, WebuiPackage.ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActionNavigationClass() {
		return actionNavigationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionNavigationClass(String newActionNavigationClass) {
		String oldActionNavigationClass = actionNavigationClass;
		actionNavigationClass = newActionNavigationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS, oldActionNavigationClass, actionNavigationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Entity)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(Entity newContentType) {
		Entity oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetContainingType() {
		return (Entity)CONTAINING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetContainingType() {
		return CONTAINING_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteActual> getRouteActuals() {
		if (routeActuals == null) {
			routeActuals = new EObjectContainmentWithInverseEList<RouteActual>(RouteActual.class, this, WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS, WebuiPackage.ROUTE_ACTUAL__ACTUAL_FOR);
		}
		return routeActuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnitField> getDisplayFields() {
		if (displayFields == null) {
			displayFields = new EObjectContainmentWithInverseEList<UnitField>(UnitField.class, this, WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, WebuiPackage.UNIT_FIELD__DISPLAYED_ON);
		}
		return displayFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasWhenFieldsEmptyAddImplicitFields() {
		return hasWhenFieldsEmptyAddImplicitFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasWhenFieldsEmptyAddImplicitFields(boolean newHasWhenFieldsEmptyAddImplicitFields) {
		boolean oldHasWhenFieldsEmptyAddImplicitFields = hasWhenFieldsEmptyAddImplicitFields;
		hasWhenFieldsEmptyAddImplicitFields = newHasWhenFieldsEmptyAddImplicitFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS, oldHasWhenFieldsEmptyAddImplicitFields, hasWhenFieldsEmptyAddImplicitFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getHideWhen() {
		return hideWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHideWhen(Predicate newHideWhen, NotificationChain msgs) {
		Predicate oldHideWhen = hideWhen;
		hideWhen = newHideWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, oldHideWhen, newHideWhen);
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
	public void setHideWhen(Predicate newHideWhen) {
		if (newHideWhen != hideWhen) {
			NotificationChain msgs = null;
			if (hideWhen != null)
				msgs = ((InternalEObject)hideWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, null, msgs);
			if (newHideWhen != null)
				msgs = ((InternalEObject)newHideWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, null, msgs);
			msgs = basicSetHideWhen(newHideWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN, newHideWhen, newHideWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWhenHidden() {
		return messageWhenHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWhenHidden(String newMessageWhenHidden) {
		String oldMessageWhenHidden = messageWhenHidden;
		messageWhenHidden = newMessageWhenHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN, oldMessageWhenHidden, messageWhenHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(String newFooter) {
		String oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalFieldListClass() {
		return localFieldListClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalFieldListClass(String newLocalFieldListClass) {
		String oldLocalFieldListClass = localFieldListClass;
		localFieldListClass = newLocalFieldListClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS, oldLocalFieldListClass, localFieldListClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalFieldLabelClass() {
		return localFieldLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalFieldLabelClass(String newLocalFieldLabelClass) {
		String oldLocalFieldLabelClass = localFieldLabelClass;
		localFieldLabelClass = newLocalFieldLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS, oldLocalFieldLabelClass, localFieldLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalFieldValueClass() {
		return localFieldValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalFieldValueClass(String newLocalFieldValueClass) {
		String oldLocalFieldValueClass = localFieldValueClass;
		localFieldValueClass = newLocalFieldValueClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS, oldLocalFieldValueClass, localFieldValueClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalControlClass() {
		return localControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalControlClass(String newLocalControlClass) {
		String oldLocalControlClass = localControlClass;
		localControlClass = newLocalControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS, oldLocalControlClass, localControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalInstanceControlClass() {
		return localInstanceControlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalInstanceControlClass(String newLocalInstanceControlClass) {
		String oldLocalInstanceControlClass = localInstanceControlClass;
		localInstanceControlClass = newLocalInstanceControlClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS, oldLocalInstanceControlClass, localInstanceControlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalAnchorClass() {
		return localAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalAnchorClass(String newLocalAnchorClass) {
		String oldLocalAnchorClass = localAnchorClass;
		localAnchorClass = newLocalAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS, oldLocalAnchorClass, localAnchorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalInstanceAnchorClass() {
		return localInstanceAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalInstanceAnchorClass(String newLocalInstanceAnchorClass) {
		String oldLocalInstanceAnchorClass = localInstanceAnchorClass;
		localInstanceAnchorClass = newLocalInstanceAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS, oldLocalInstanceAnchorClass, localInstanceAnchorClass));
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
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRouteActuals()).basicAdd(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayFields()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				return ((InternalEList<?>)getRouteActuals()).basicRemove(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return ((InternalEList<?>)getDisplayFields()).basicRemove(otherEnd, msgs);
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return basicSetHideWhen(null, msgs);
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
			case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
				return getContainerActionsPlacement();
			case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
				return getInstanceActionsPlacement();
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				return getActions();
			case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS:
				return getActionNavigationClass();
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case WebuiPackage.DYNAMIC_UNIT__CONTAINING_TYPE:
				if (resolve) return getContainingType();
				return basicGetContainingType();
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				return getRouteActuals();
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return getDisplayFields();
			case WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
				return isHasWhenFieldsEmptyAddImplicitFields();
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return getHideWhen();
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				return getMessageWhenHidden();
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				return getHeader();
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				return getFooter();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
				return getLocalFieldListClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
				return getLocalFieldLabelClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
				return getLocalFieldValueClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
				return getLocalControlClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
				return getLocalInstanceControlClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
				return getLocalAnchorClass();
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
				return getLocalInstanceAnchorClass();
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
			case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
				setContainerActionsPlacement((ContainerActionsPlacement)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
				setInstanceActionsPlacement((InstanceActionsPlacement)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE:
				setContentType((Entity)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				getRouteActuals().clear();
				getRouteActuals().addAll((Collection<? extends RouteActual>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				getDisplayFields().addAll((Collection<? extends UnitField>)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
				setHasWhenFieldsEmptyAddImplicitFields((Boolean)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				setHideWhen((Predicate)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				setMessageWhenHidden((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				setHeader((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
				setLocalFieldListClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
				setLocalFieldLabelClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
				setLocalFieldValueClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
				setLocalControlClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
				setLocalInstanceControlClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
				setLocalAnchorClass((String)newValue);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
				setLocalInstanceAnchorClass((String)newValue);
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
			case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
				setContainerActionsPlacement(CONTAINER_ACTIONS_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
				setInstanceActionsPlacement(INSTANCE_ACTIONS_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				getActions().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass(ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE:
				setContentType((Entity)null);
				return;
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				getRouteActuals().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				getDisplayFields().clear();
				return;
			case WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
				setHasWhenFieldsEmptyAddImplicitFields(HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				setHideWhen((Predicate)null);
				return;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				setMessageWhenHidden(MESSAGE_WHEN_HIDDEN_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
				setLocalFieldListClass(LOCAL_FIELD_LIST_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
				setLocalFieldLabelClass(LOCAL_FIELD_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
				setLocalFieldValueClass(LOCAL_FIELD_VALUE_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
				setLocalControlClass(LOCAL_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
				setLocalInstanceControlClass(LOCAL_INSTANCE_CONTROL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
				setLocalAnchorClass(LOCAL_ANCHOR_CLASS_EDEFAULT);
				return;
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
				setLocalInstanceAnchorClass(LOCAL_INSTANCE_ANCHOR_CLASS_EDEFAULT);
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
			case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
				return containerActionsPlacement != CONTAINER_ACTIONS_PLACEMENT_EDEFAULT;
			case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
				return instanceActionsPlacement != INSTANCE_ACTIONS_PLACEMENT_EDEFAULT;
			case WebuiPackage.DYNAMIC_UNIT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS:
				return ACTION_NAVIGATION_CLASS_EDEFAULT == null ? actionNavigationClass != null : !ACTION_NAVIGATION_CLASS_EDEFAULT.equals(actionNavigationClass);
			case WebuiPackage.DYNAMIC_UNIT__CONTENT_TYPE:
				return contentType != null;
			case WebuiPackage.DYNAMIC_UNIT__CONTAINING_TYPE:
				return isSetContainingType();
			case WebuiPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
				return routeActuals != null && !routeActuals.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
				return displayFields != null && !displayFields.isEmpty();
			case WebuiPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
				return hasWhenFieldsEmptyAddImplicitFields != HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS_EDEFAULT;
			case WebuiPackage.DYNAMIC_UNIT__HIDE_WHEN:
				return hideWhen != null;
			case WebuiPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
				return MESSAGE_WHEN_HIDDEN_EDEFAULT == null ? messageWhenHidden != null : !MESSAGE_WHEN_HIDDEN_EDEFAULT.equals(messageWhenHidden);
			case WebuiPackage.DYNAMIC_UNIT__HEADER:
				return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
			case WebuiPackage.DYNAMIC_UNIT__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
				return LOCAL_FIELD_LIST_CLASS_EDEFAULT == null ? localFieldListClass != null : !LOCAL_FIELD_LIST_CLASS_EDEFAULT.equals(localFieldListClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
				return LOCAL_FIELD_LABEL_CLASS_EDEFAULT == null ? localFieldLabelClass != null : !LOCAL_FIELD_LABEL_CLASS_EDEFAULT.equals(localFieldLabelClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
				return LOCAL_FIELD_VALUE_CLASS_EDEFAULT == null ? localFieldValueClass != null : !LOCAL_FIELD_VALUE_CLASS_EDEFAULT.equals(localFieldValueClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
				return LOCAL_CONTROL_CLASS_EDEFAULT == null ? localControlClass != null : !LOCAL_CONTROL_CLASS_EDEFAULT.equals(localControlClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
				return LOCAL_INSTANCE_CONTROL_CLASS_EDEFAULT == null ? localInstanceControlClass != null : !LOCAL_INSTANCE_CONTROL_CLASS_EDEFAULT.equals(localInstanceControlClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
				return LOCAL_ANCHOR_CLASS_EDEFAULT == null ? localAnchorClass != null : !LOCAL_ANCHOR_CLASS_EDEFAULT.equals(localAnchorClass);
			case WebuiPackage.DYNAMIC_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
				return LOCAL_INSTANCE_ANCHOR_CLASS_EDEFAULT == null ? localInstanceAnchorClass != null : !LOCAL_INSTANCE_ANCHOR_CLASS_EDEFAULT.equals(localInstanceAnchorClass);
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
		if (baseClass == ActionContainer.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT: return WebuiPackage.ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT;
				case WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT: return WebuiPackage.ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT;
				case WebuiPackage.DYNAMIC_UNIT__ACTIONS: return WebuiPackage.ACTION_CONTAINER__ACTIONS;
				case WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS: return WebuiPackage.ACTION_CONTAINER__ACTION_NAVIGATION_CLASS;
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
		if (baseClass == ActionContainer.class) {
			switch (baseFeatureID) {
				case WebuiPackage.ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT: return WebuiPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT;
				case WebuiPackage.ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT: return WebuiPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT;
				case WebuiPackage.ACTION_CONTAINER__ACTIONS: return WebuiPackage.DYNAMIC_UNIT__ACTIONS;
				case WebuiPackage.ACTION_CONTAINER__ACTION_NAVIGATION_CLASS: return WebuiPackage.DYNAMIC_UNIT__ACTION_NAVIGATION_CLASS;
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
		result.append(" (containerActionsPlacement: ");
		result.append(containerActionsPlacement);
		result.append(", instanceActionsPlacement: ");
		result.append(instanceActionsPlacement);
		result.append(", actionNavigationClass: ");
		result.append(actionNavigationClass);
		result.append(", hasWhenFieldsEmptyAddImplicitFields: ");
		result.append(hasWhenFieldsEmptyAddImplicitFields);
		result.append(", messageWhenHidden: ");
		result.append(messageWhenHidden);
		result.append(", header: ");
		result.append(header);
		result.append(", footer: ");
		result.append(footer);
		result.append(", localFieldListClass: ");
		result.append(localFieldListClass);
		result.append(", localFieldLabelClass: ");
		result.append(localFieldLabelClass);
		result.append(", localFieldValueClass: ");
		result.append(localFieldValueClass);
		result.append(", localControlClass: ");
		result.append(localControlClass);
		result.append(", localInstanceControlClass: ");
		result.append(localInstanceControlClass);
		result.append(", localAnchorClass: ");
		result.append(localAnchorClass);
		result.append(", localInstanceAnchorClass: ");
		result.append(localInstanceAnchorClass);
		result.append(')');
		return result.toString();
	}

} //DynamicUnitImpl
