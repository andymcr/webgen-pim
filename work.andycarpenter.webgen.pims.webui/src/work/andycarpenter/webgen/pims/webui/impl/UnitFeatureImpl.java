/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
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
import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Path;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.webui.Action;
import work.andycarpenter.webgen.pims.webui.ActionContainer;
import work.andycarpenter.webgen.pims.webui.ContainerActionsPlacement;
import work.andycarpenter.webgen.pims.webui.InstanceActionsPlacement;
import work.andycarpenter.webgen.pims.webui.UnitFeature;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getContainerActionsPlacement <em>Container Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getInstanceActionsPlacement <em>Instance Actions Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getActionNavigationClass <em>Action Navigation Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getCollectionMaximumValues <em>Collection Maximum Values</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDisplayDefaultWhen <em>Display Default When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getEmptyCollectionDisplay <em>Empty Collection Display</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitFeatureImpl extends UnitFieldImpl implements UnitFeature {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.PATH__NAME).getSettingDelegate();

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
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForcedValue() <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression forcedValue;

	/**
	 * The default value of the '{@link #isCollectionUiAllowAdd() <em>Collection Ui Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_UI_ALLOW_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionUiAllowAdd() <em>Collection Ui Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionUiAllowAdd = COLLECTION_UI_ALLOW_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollectionUiAllowRemove() <em>Collection Ui Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_UI_ALLOW_REMOVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollectionUiAllowRemove() <em>Collection Ui Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectionUiAllowRemove()
	 * @generated
	 * @ordered
	 */
	protected boolean collectionUiAllowRemove = COLLECTION_UI_ALLOW_REMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionMaximumValues() <em>Collection Maximum Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionMaximumValues()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLECTION_MAXIMUM_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCollectionMaximumValues() <em>Collection Maximum Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionMaximumValues()
	 * @generated
	 * @ordered
	 */
	protected int collectionMaximumValues = COLLECTION_MAXIMUM_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDisplayValue() <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DISPLAY_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultDisplayValue() <em>Default Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultDisplayValue = DEFAULT_DISPLAY_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisplayDefaultWhen() <em>Display Default When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayDefaultWhen()
	 * @generated
	 * @ordered
	 */
	protected Predicate displayDefaultWhen;

	/**
	 * The default value of the '{@link #getEmptyCollectionDisplay() <em>Empty Collection Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyCollectionDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_COLLECTION_DISPLAY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEmptyCollectionDisplay() <em>Empty Collection Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyCollectionDisplay()
	 * @generated
	 * @ordered
	 */
	protected String emptyCollectionDisplay = EMPTY_COLLECTION_DISPLAY_EDEFAULT;

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
	 * The default value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOFOCUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutofocus()
	 * @generated
	 * @ordered
	 */
	protected boolean autofocus = AUTOFOCUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.UNIT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT, oldContainerActionsPlacement, containerActionsPlacement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT, oldInstanceActionsPlacement, instanceActionsPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, WebuiPackage.UNIT_FEATURE__ACTIONS, WebuiPackage.ACTION__USED_BY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS, oldActionNavigationClass, actionNavigationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getForcedValue() {
		return forcedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForcedValue(Expression newForcedValue, NotificationChain msgs) {
		Expression oldForcedValue = forcedValue;
		forcedValue = newForcedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__FORCED_VALUE, oldForcedValue, newForcedValue);
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
	public void setForcedValue(Expression newForcedValue) {
		if (newForcedValue != forcedValue) {
			NotificationChain msgs = null;
			if (forcedValue != null)
				msgs = ((InternalEObject)forcedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FEATURE__FORCED_VALUE, null, msgs);
			if (newForcedValue != null)
				msgs = ((InternalEObject)newForcedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FEATURE__FORCED_VALUE, null, msgs);
			msgs = basicSetForcedValue(newForcedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__FORCED_VALUE, newForcedValue, newForcedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollectionUiAllowAdd() {
		return collectionUiAllowAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionUiAllowAdd(boolean newCollectionUiAllowAdd) {
		boolean oldCollectionUiAllowAdd = collectionUiAllowAdd;
		collectionUiAllowAdd = newCollectionUiAllowAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD, oldCollectionUiAllowAdd, collectionUiAllowAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollectionUiAllowRemove() {
		return collectionUiAllowRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionUiAllowRemove(boolean newCollectionUiAllowRemove) {
		boolean oldCollectionUiAllowRemove = collectionUiAllowRemove;
		collectionUiAllowRemove = newCollectionUiAllowRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE, oldCollectionUiAllowRemove, collectionUiAllowRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollectionMaximumValues() {
		return collectionMaximumValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionMaximumValues(int newCollectionMaximumValues) {
		int oldCollectionMaximumValues = collectionMaximumValues;
		collectionMaximumValues = newCollectionMaximumValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES, oldCollectionMaximumValues, collectionMaximumValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDisplayValue() {
		return defaultDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDisplayValue(String newDefaultDisplayValue) {
		String oldDefaultDisplayValue = defaultDisplayValue;
		defaultDisplayValue = newDefaultDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE, oldDefaultDisplayValue, defaultDisplayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getDisplayDefaultWhen() {
		return displayDefaultWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayDefaultWhen(Predicate newDisplayDefaultWhen, NotificationChain msgs) {
		Predicate oldDisplayDefaultWhen = displayDefaultWhen;
		displayDefaultWhen = newDisplayDefaultWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN, oldDisplayDefaultWhen, newDisplayDefaultWhen);
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
	public void setDisplayDefaultWhen(Predicate newDisplayDefaultWhen) {
		if (newDisplayDefaultWhen != displayDefaultWhen) {
			NotificationChain msgs = null;
			if (displayDefaultWhen != null)
				msgs = ((InternalEObject)displayDefaultWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN, null, msgs);
			if (newDisplayDefaultWhen != null)
				msgs = ((InternalEObject)newDisplayDefaultWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN, null, msgs);
			msgs = basicSetDisplayDefaultWhen(newDisplayDefaultWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN, newDisplayDefaultWhen, newDisplayDefaultWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmptyCollectionDisplay() {
		return emptyCollectionDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyCollectionDisplay(String newEmptyCollectionDisplay) {
		String oldEmptyCollectionDisplay = emptyCollectionDisplay;
		emptyCollectionDisplay = newEmptyCollectionDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY, oldEmptyCollectionDisplay, emptyCollectionDisplay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__FOOTER, oldFooter, footer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutofocus() {
		return autofocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutofocus(boolean newAutofocus) {
		boolean oldAutofocus = autofocus;
		autofocus = newAutofocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__AUTOFOCUS, oldAutofocus, autofocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity contextEntity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String name() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WebuiPackage.UNIT_FEATURE__FORCED_VALUE:
				return basicSetForcedValue(null, msgs);
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				return basicSetDisplayDefaultWhen(null, msgs);
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
			case WebuiPackage.UNIT_FEATURE__NAME:
				return getName();
			case WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT:
				return getContainerActionsPlacement();
			case WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT:
				return getInstanceActionsPlacement();
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return getActions();
			case WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS:
				return getActionNavigationClass();
			case WebuiPackage.UNIT_FEATURE__DISPLAY_LABEL:
				return getDisplayLabel();
			case WebuiPackage.UNIT_FEATURE__REQUIRED:
				return isRequired();
			case WebuiPackage.UNIT_FEATURE__FORCED_VALUE:
				return getForcedValue();
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD:
				return isCollectionUiAllowAdd();
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				return isCollectionUiAllowRemove();
			case WebuiPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES:
				return getCollectionMaximumValues();
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				return getDefaultDisplayValue();
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				return getDisplayDefaultWhen();
			case WebuiPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY:
				return getEmptyCollectionDisplay();
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				return getFooter();
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				return isAutofocus();
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
			case WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT:
				setContainerActionsPlacement((ContainerActionsPlacement)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT:
				setInstanceActionsPlacement((InstanceActionsPlacement)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES:
				setCollectionMaximumValues((Integer)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				setDisplayDefaultWhen((Predicate)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY:
				setEmptyCollectionDisplay((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus((Boolean)newValue);
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
			case WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT:
				setContainerActionsPlacement(CONTAINER_ACTIONS_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT:
				setInstanceActionsPlacement(INSTANCE_ACTIONS_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				return;
			case WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS:
				setActionNavigationClass(ACTION_NAVIGATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__FORCED_VALUE:
				setForcedValue((Expression)null);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD:
				setCollectionUiAllowAdd(COLLECTION_UI_ALLOW_ADD_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				setCollectionUiAllowRemove(COLLECTION_UI_ALLOW_REMOVE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES:
				setCollectionMaximumValues(COLLECTION_MAXIMUM_VALUES_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue(DEFAULT_DISPLAY_VALUE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				setDisplayDefaultWhen((Predicate)null);
				return;
			case WebuiPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY:
				setEmptyCollectionDisplay(EMPTY_COLLECTION_DISPLAY_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus(AUTOFOCUS_EDEFAULT);
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
			case WebuiPackage.UNIT_FEATURE__NAME:
				return isSetName();
			case WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT:
				return containerActionsPlacement != CONTAINER_ACTIONS_PLACEMENT_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT:
				return instanceActionsPlacement != INSTANCE_ACTIONS_PLACEMENT_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS:
				return ACTION_NAVIGATION_CLASS_EDEFAULT == null ? actionNavigationClass != null : !ACTION_NAVIGATION_CLASS_EDEFAULT.equals(actionNavigationClass);
			case WebuiPackage.UNIT_FEATURE__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
			case WebuiPackage.UNIT_FEATURE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__FORCED_VALUE:
				return forcedValue != null;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD:
				return collectionUiAllowAdd != COLLECTION_UI_ALLOW_ADD_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
				return collectionUiAllowRemove != COLLECTION_UI_ALLOW_REMOVE_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES:
				return collectionMaximumValues != COLLECTION_MAXIMUM_VALUES_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				return DEFAULT_DISPLAY_VALUE_EDEFAULT == null ? defaultDisplayValue != null : !DEFAULT_DISPLAY_VALUE_EDEFAULT.equals(defaultDisplayValue);
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				return displayDefaultWhen != null;
			case WebuiPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY:
				return EMPTY_COLLECTION_DISPLAY_EDEFAULT == null ? emptyCollectionDisplay != null : !EMPTY_COLLECTION_DISPLAY_EDEFAULT.equals(emptyCollectionDisplay);
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				return autofocus != AUTOFOCUS_EDEFAULT;
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
		if (baseClass == Path.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_FEATURE__NAME: return PersistencePackage.PATH__NAME;
				default: return -1;
			}
		}
		if (baseClass == ActionContainer.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT: return WebuiPackage.ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT;
				case WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT: return WebuiPackage.ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT;
				case WebuiPackage.UNIT_FEATURE__ACTIONS: return WebuiPackage.ACTION_CONTAINER__ACTIONS;
				case WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS: return WebuiPackage.ACTION_CONTAINER__ACTION_NAVIGATION_CLASS;
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
		if (baseClass == Path.class) {
			switch (baseFeatureID) {
				case PersistencePackage.PATH__NAME: return WebuiPackage.UNIT_FEATURE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ActionContainer.class) {
			switch (baseFeatureID) {
				case WebuiPackage.ACTION_CONTAINER__CONTAINER_ACTIONS_PLACEMENT: return WebuiPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT;
				case WebuiPackage.ACTION_CONTAINER__INSTANCE_ACTIONS_PLACEMENT: return WebuiPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT;
				case WebuiPackage.ACTION_CONTAINER__ACTIONS: return WebuiPackage.UNIT_FEATURE__ACTIONS;
				case WebuiPackage.ACTION_CONTAINER__ACTION_NAVIGATION_CLASS: return WebuiPackage.UNIT_FEATURE__ACTION_NAVIGATION_CLASS;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Path.class) {
			switch (baseOperationID) {
				case PersistencePackage.PATH___CONTEXT_ENTITY: return WebuiPackage.UNIT_FEATURE___CONTEXT_ENTITY;
				case PersistencePackage.PATH___NAME: return WebuiPackage.UNIT_FEATURE___NAME;
				default: return -1;
			}
		}
		if (baseClass == ActionContainer.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebuiPackage.UNIT_FEATURE___CONTEXT_ENTITY:
				return contextEntity();
			case WebuiPackage.UNIT_FEATURE___NAME:
				return name();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", required: ");
		result.append(required);
		result.append(", collectionUiAllowAdd: ");
		result.append(collectionUiAllowAdd);
		result.append(", collectionUiAllowRemove: ");
		result.append(collectionUiAllowRemove);
		result.append(", collectionMaximumValues: ");
		result.append(collectionMaximumValues);
		result.append(", defaultDisplayValue: ");
		result.append(defaultDisplayValue);
		result.append(", emptyCollectionDisplay: ");
		result.append(emptyCollectionDisplay);
		result.append(", footer: ");
		result.append(footer);
		result.append(", autofocus: ");
		result.append(autofocus);
		result.append(')');
		return result.toString();
	}

} //UnitFeatureImpl
