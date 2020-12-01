/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.expression.Expression;

import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.webui.InlineAction;
import work.andycarpenter.webgen.pims.webui.InlineActionContainer;
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
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDefaultLocalAnchorClass <em>Default Local Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isCollectionUiAllowAdd <em>Collection Ui Allow Add</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isCollectionUiAllowRemove <em>Collection Ui Allow Remove</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDefaultDisplayValue <em>Default Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDisplayDefaultWhen <em>Display Default When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getEmptyDisplayValue <em>Empty Display Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#isAutofocus <em>Autofocus</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getInputGroupClass <em>Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getInputLabelClass <em>Input Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getInputElementClass <em>Input Element Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFeatureImpl#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitFeatureImpl extends UnitFieldImpl implements UnitFeature {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineAction> actions;

	/**
	 * The default value of the '{@link #getDefaultLocalAnchorClass() <em>Default Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDefaultLocalAnchorClass() <em>Default Local Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocalAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String defaultLocalAnchorClass = DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getEmptyDisplayValue() <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_DISPLAY_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEmptyDisplayValue() <em>Empty Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String emptyDisplayValue = EMPTY_DISPLAY_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputGroupClass() <em>Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_GROUP_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInputGroupClass() <em>Input Group Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGroupClass()
	 * @generated
	 * @ordered
	 */
	protected String inputGroupClass = INPUT_GROUP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputLabelClass() <em>Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_LABEL_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInputLabelClass() <em>Input Label Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLabelClass()
	 * @generated
	 * @ordered
	 */
	protected String inputLabelClass = INPUT_LABEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputElementClass() <em>Input Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElementClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_ELEMENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInputElementClass() <em>Input Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElementClass()
	 * @generated
	 * @ordered
	 */
	protected String inputElementClass = INPUT_ELEMENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;

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
	public EList<InlineAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<InlineAction>(InlineAction.class, this, WebuiPackage.UNIT_FEATURE__ACTIONS, WebuiPackage.INLINE_ACTION__USED_BY);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultLocalAnchorClass() {
		return defaultLocalAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLocalAnchorClass(String newDefaultLocalAnchorClass) {
		String oldDefaultLocalAnchorClass = defaultLocalAnchorClass;
		defaultLocalAnchorClass = newDefaultLocalAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS, oldDefaultLocalAnchorClass, defaultLocalAnchorClass));
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
	public String getEmptyDisplayValue() {
		return emptyDisplayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyDisplayValue(String newEmptyDisplayValue) {
		String oldEmptyDisplayValue = emptyDisplayValue;
		emptyDisplayValue = newEmptyDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__EMPTY_DISPLAY_VALUE, oldEmptyDisplayValue, emptyDisplayValue));
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
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputGroupClass() {
		return inputGroupClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputGroupClass(String newInputGroupClass) {
		String oldInputGroupClass = inputGroupClass;
		inputGroupClass = newInputGroupClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__INPUT_GROUP_CLASS, oldInputGroupClass, inputGroupClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputLabelClass() {
		return inputLabelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputLabelClass(String newInputLabelClass) {
		String oldInputLabelClass = inputLabelClass;
		inputLabelClass = newInputLabelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__INPUT_LABEL_CLASS, oldInputLabelClass, inputLabelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputElementClass() {
		return inputElementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputElementClass(String newInputElementClass) {
		String oldInputElementClass = inputElementClass;
		inputElementClass = newInputElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__INPUT_ELEMENT_CLASS, oldInputElementClass, inputElementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FEATURE__FOOTER_CLASS, oldFooterClass, footerClass));
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return getActions();
			case WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS:
				return getDefaultLocalAnchorClass();
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
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				return getDefaultDisplayValue();
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				return getDisplayDefaultWhen();
			case WebuiPackage.UNIT_FEATURE__EMPTY_DISPLAY_VALUE:
				return getEmptyDisplayValue();
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				return getFooter();
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				return isAutofocus();
			case WebuiPackage.UNIT_FEATURE__HEADER_CLASS:
				return getHeaderClass();
			case WebuiPackage.UNIT_FEATURE__INPUT_GROUP_CLASS:
				return getInputGroupClass();
			case WebuiPackage.UNIT_FEATURE__INPUT_LABEL_CLASS:
				return getInputLabelClass();
			case WebuiPackage.UNIT_FEATURE__INPUT_ELEMENT_CLASS:
				return getInputElementClass();
			case WebuiPackage.UNIT_FEATURE__DISPLAY_CLASS:
				return getDisplayClass();
			case WebuiPackage.UNIT_FEATURE__FOOTER_CLASS:
				return getFooterClass();
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends InlineAction>)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS:
				setDefaultLocalAnchorClass((String)newValue);
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
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				setDisplayDefaultWhen((Predicate)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__EMPTY_DISPLAY_VALUE:
				setEmptyDisplayValue((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				setFooter((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_GROUP_CLASS:
				setInputGroupClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_LABEL_CLASS:
				setInputLabelClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_ELEMENT_CLASS:
				setInputElementClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER_CLASS:
				setFooterClass((String)newValue);
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				getActions().clear();
				return;
			case WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS:
				setDefaultLocalAnchorClass(DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT);
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
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				setDefaultDisplayValue(DEFAULT_DISPLAY_VALUE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				setDisplayDefaultWhen((Predicate)null);
				return;
			case WebuiPackage.UNIT_FEATURE__EMPTY_DISPLAY_VALUE:
				setEmptyDisplayValue(EMPTY_DISPLAY_VALUE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				setAutofocus(AUTOFOCUS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_GROUP_CLASS:
				setInputGroupClass(INPUT_GROUP_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_LABEL_CLASS:
				setInputLabelClass(INPUT_LABEL_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__INPUT_ELEMENT_CLASS:
				setInputElementClass(INPUT_ELEMENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FEATURE__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
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
			case WebuiPackage.UNIT_FEATURE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS:
				return DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT == null ? defaultLocalAnchorClass != null : !DEFAULT_LOCAL_ANCHOR_CLASS_EDEFAULT.equals(defaultLocalAnchorClass);
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
			case WebuiPackage.UNIT_FEATURE__DEFAULT_DISPLAY_VALUE:
				return DEFAULT_DISPLAY_VALUE_EDEFAULT == null ? defaultDisplayValue != null : !DEFAULT_DISPLAY_VALUE_EDEFAULT.equals(defaultDisplayValue);
			case WebuiPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
				return displayDefaultWhen != null;
			case WebuiPackage.UNIT_FEATURE__EMPTY_DISPLAY_VALUE:
				return EMPTY_DISPLAY_VALUE_EDEFAULT == null ? emptyDisplayValue != null : !EMPTY_DISPLAY_VALUE_EDEFAULT.equals(emptyDisplayValue);
			case WebuiPackage.UNIT_FEATURE__FOOTER:
				return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
			case WebuiPackage.UNIT_FEATURE__AUTOFOCUS:
				return autofocus != AUTOFOCUS_EDEFAULT;
			case WebuiPackage.UNIT_FEATURE__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebuiPackage.UNIT_FEATURE__INPUT_GROUP_CLASS:
				return INPUT_GROUP_CLASS_EDEFAULT == null ? inputGroupClass != null : !INPUT_GROUP_CLASS_EDEFAULT.equals(inputGroupClass);
			case WebuiPackage.UNIT_FEATURE__INPUT_LABEL_CLASS:
				return INPUT_LABEL_CLASS_EDEFAULT == null ? inputLabelClass != null : !INPUT_LABEL_CLASS_EDEFAULT.equals(inputLabelClass);
			case WebuiPackage.UNIT_FEATURE__INPUT_ELEMENT_CLASS:
				return INPUT_ELEMENT_CLASS_EDEFAULT == null ? inputElementClass != null : !INPUT_ELEMENT_CLASS_EDEFAULT.equals(inputElementClass);
			case WebuiPackage.UNIT_FEATURE__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebuiPackage.UNIT_FEATURE__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
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
		if (baseClass == InlineActionContainer.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.UNIT_FEATURE__ACTIONS: return WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS;
				case WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS: return WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS;
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
		if (baseClass == InlineActionContainer.class) {
			switch (baseFeatureID) {
				case WebuiPackage.INLINE_ACTION_CONTAINER__ACTIONS: return WebuiPackage.UNIT_FEATURE__ACTIONS;
				case WebuiPackage.INLINE_ACTION_CONTAINER__DEFAULT_LOCAL_ANCHOR_CLASS: return WebuiPackage.UNIT_FEATURE__DEFAULT_LOCAL_ANCHOR_CLASS;
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
		result.append(" (defaultLocalAnchorClass: ");
		result.append(defaultLocalAnchorClass);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(", required: ");
		result.append(required);
		result.append(", collectionUiAllowAdd: ");
		result.append(collectionUiAllowAdd);
		result.append(", collectionUiAllowRemove: ");
		result.append(collectionUiAllowRemove);
		result.append(", defaultDisplayValue: ");
		result.append(defaultDisplayValue);
		result.append(", emptyDisplayValue: ");
		result.append(emptyDisplayValue);
		result.append(", footer: ");
		result.append(footer);
		result.append(", autofocus: ");
		result.append(autofocus);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", inputGroupClass: ");
		result.append(inputGroupClass);
		result.append(", inputLabelClass: ");
		result.append(inputLabelClass);
		result.append(", inputElementClass: ");
		result.append(inputElementClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(')');
		return result.toString();
	}

} //UnitFeatureImpl
