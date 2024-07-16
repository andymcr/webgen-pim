/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.base.impl.NamedDisplayElementImpl;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.security.AuthorisationExpression;
import work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.InterfaceField;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getRequiresRole <em>Requires Role</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#isEscapeHTML <em>Escape HTML</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#isTruncate <em>Truncate</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#isDisableInput <em>Disable Input</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getValidationPattern <em>Validation Pattern</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#isRepeatedField <em>Repeated Field</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getSecondDisplayLabel <em>Second Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getSecondTitle <em>Second Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getSecondPlaceholder <em>Second Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.InterfaceFieldImpl#getSecondHelp <em>Second Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceFieldImpl extends NamedDisplayElementImpl implements InterfaceField {
	/**
	 * The default value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_ROLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRequiresRole() <em>Requires Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresRole()
	 * @generated
	 * @ordered
	 */
	protected String requiresRole = REQUIRES_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorisation() <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected AuthorisationExpression authorisation;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected String help = HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #isEscapeHTML() <em>Escape HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEscapeHTML()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESCAPE_HTML_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEscapeHTML() <em>Escape HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEscapeHTML()
	 * @generated
	 * @ordered
	 */
	protected boolean escapeHTML = ESCAPE_HTML_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionDisplayOption() <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionDisplayOptions COLLECTION_DISPLAY_OPTION_EDEFAULT = CollectionDisplayOptions.LINE_DIRECTION;

	/**
	 * The cached value of the '{@link #getCollectionDisplayOption() <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected CollectionDisplayOptions collectionDisplayOption = COLLECTION_DISPLAY_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTruncate() <em>Truncate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUNCATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTruncate() <em>Truncate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncate()
	 * @generated
	 * @ordered
	 */
	protected boolean truncate = TRUNCATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisableInput() <em>Disable Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableInput() <em>Disable Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableInput()
	 * @generated
	 * @ordered
	 */
	protected boolean disableInput = DISABLE_INPUT_EDEFAULT;

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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_PATTERN_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValidationPattern() <em>Validation Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationPattern()
	 * @generated
	 * @ordered
	 */
	protected String validationPattern = VALIDATION_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepeatedField() <em>Repeated Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatedField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEATED_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeatedField() <em>Repeated Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatedField()
	 * @generated
	 * @ordered
	 */
	protected boolean repeatedField = REPEATED_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondDisplayLabel() <em>Second Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_DISPLAY_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecondDisplayLabel() <em>Second Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String secondDisplayLabel = SECOND_DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondTitle() <em>Second Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_TITLE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecondTitle() <em>Second Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTitle()
	 * @generated
	 * @ordered
	 */
	protected String secondTitle = SECOND_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondPlaceholder() <em>Second Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_PLACEHOLDER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecondPlaceholder() <em>Second Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String secondPlaceholder = SECOND_PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondHelp() <em>Second Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_HELP_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSecondHelp() <em>Second Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondHelp()
	 * @generated
	 * @ordered
	 */
	protected String secondHelp = SECOND_HELP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.INTERFACE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON && newDisplayedOn != null)) {
			if (EcoreUtil.isAncestor(this, newDisplayedOn))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDisplayedOn != null)
				msgs = ((InternalEObject)newDisplayedOn).eInverseAdd(this, WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
			msgs = basicSetDisplayedOn(newDisplayedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequiresRole() {
		return requiresRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresRole(String newRequiresRole) {
		String oldRequiresRole = requiresRole;
		requiresRole = newRequiresRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE, oldRequiresRole, requiresRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorisationExpression getAuthorisation() {
		return authorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorisation(AuthorisationExpression newAuthorisation, NotificationChain msgs) {
		AuthorisationExpression oldAuthorisation = authorisation;
		authorisation = newAuthorisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__AUTHORISATION, oldAuthorisation, newAuthorisation);
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
	public void setAuthorisation(AuthorisationExpression newAuthorisation) {
		if (newAuthorisation != authorisation) {
			NotificationChain msgs = null;
			if (authorisation != null)
				msgs = ((InternalEObject)authorisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INTERFACE_FIELD__AUTHORISATION, null, msgs);
			if (newAuthorisation != null)
				msgs = ((InternalEObject)newAuthorisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INTERFACE_FIELD__AUTHORISATION, null, msgs);
			msgs = basicSetAuthorisation(newAuthorisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__AUTHORISATION, newAuthorisation, newAuthorisation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__HIDE_WHEN, oldHideWhen, newHideWhen);
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
				msgs = ((InternalEObject)hideWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INTERFACE_FIELD__HIDE_WHEN, null, msgs);
			if (newHideWhen != null)
				msgs = ((InternalEObject)newHideWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.INTERFACE_FIELD__HIDE_WHEN, null, msgs);
			msgs = basicSetHideWhen(newHideWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__HIDE_WHEN, newHideWhen, newHideWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelp(String newHelp) {
		String oldHelp = help;
		help = newHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__HELP, oldHelp, help));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEscapeHTML() {
		return escapeHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscapeHTML(boolean newEscapeHTML) {
		boolean oldEscapeHTML = escapeHTML;
		escapeHTML = newEscapeHTML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML, oldEscapeHTML, escapeHTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionDisplayOptions getCollectionDisplayOption() {
		return collectionDisplayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionDisplayOption(CollectionDisplayOptions newCollectionDisplayOption) {
		CollectionDisplayOptions oldCollectionDisplayOption = collectionDisplayOption;
		collectionDisplayOption = newCollectionDisplayOption == null ? COLLECTION_DISPLAY_OPTION_EDEFAULT : newCollectionDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION, oldCollectionDisplayOption, collectionDisplayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTruncate() {
		return truncate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruncate(boolean newTruncate) {
		boolean oldTruncate = truncate;
		truncate = newTruncate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__TRUNCATE, oldTruncate, truncate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisableInput() {
		return disableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableInput(boolean newDisableInput) {
		boolean oldDisableInput = disableInput;
		disableInput = newDisableInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT, oldDisableInput, disableInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRepeatedField() {
		return repeatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatedField(boolean newRepeatedField) {
		boolean oldRepeatedField = repeatedField;
		repeatedField = newRepeatedField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__REPEATED_FIELD, oldRepeatedField, repeatedField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecondDisplayLabel() {
		return secondDisplayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondDisplayLabel(String newSecondDisplayLabel) {
		String oldSecondDisplayLabel = secondDisplayLabel;
		secondDisplayLabel = newSecondDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL, oldSecondDisplayLabel, secondDisplayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecondTitle() {
		return secondTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondTitle(String newSecondTitle) {
		String oldSecondTitle = secondTitle;
		secondTitle = newSecondTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__SECOND_TITLE, oldSecondTitle, secondTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecondPlaceholder() {
		return secondPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondPlaceholder(String newSecondPlaceholder) {
		String oldSecondPlaceholder = secondPlaceholder;
		secondPlaceholder = newSecondPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER, oldSecondPlaceholder, secondPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecondHelp() {
		return secondHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondHelp(String newSecondHelp) {
		String oldSecondHelp = secondHelp;
		secondHelp = newSecondHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__SECOND_HELP, oldSecondHelp, secondHelp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationPattern() {
		return validationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationPattern(String newValidationPattern) {
		String oldValidationPattern = validationPattern;
		validationPattern = newValidationPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.INTERFACE_FIELD__VALIDATION_PATTERN, oldValidationPattern, validationPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDisplayedOn((DynamicUnit)otherEnd, msgs);
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
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebuiPackage.INTERFACE_FIELD__AUTHORISATION:
				return basicSetAuthorisation(null, msgs);
			case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				return eInternalContainer().eInverseRemove(this, WebuiPackage.DYNAMIC_UNIT__DISPLAY_FIELDS, DynamicUnit.class, msgs);
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
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				return getDisplayedOn();
			case WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE:
				return getRequiresRole();
			case WebuiPackage.INTERFACE_FIELD__AUTHORISATION:
				return getAuthorisation();
			case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN:
				return getHideWhen();
			case WebuiPackage.INTERFACE_FIELD__TITLE:
				return getTitle();
			case WebuiPackage.INTERFACE_FIELD__HELP:
				return getHelp();
			case WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML:
				return isEscapeHTML();
			case WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				return getCollectionDisplayOption();
			case WebuiPackage.INTERFACE_FIELD__TRUNCATE:
				return isTruncate();
			case WebuiPackage.INTERFACE_FIELD__DATE_FORMAT:
				return getDateFormat();
			case WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT:
				return isDisableInput();
			case WebuiPackage.INTERFACE_FIELD__REQUIRED:
				return isRequired();
			case WebuiPackage.INTERFACE_FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case WebuiPackage.INTERFACE_FIELD__PLACEHOLDER:
				return getPlaceholder();
			case WebuiPackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				return getValidationPattern();
			case WebuiPackage.INTERFACE_FIELD__REPEATED_FIELD:
				return isRepeatedField();
			case WebuiPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL:
				return getSecondDisplayLabel();
			case WebuiPackage.INTERFACE_FIELD__SECOND_TITLE:
				return getSecondTitle();
			case WebuiPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER:
				return getSecondPlaceholder();
			case WebuiPackage.INTERFACE_FIELD__SECOND_HELP:
				return getSecondHelp();
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
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE:
				setRequiresRole((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN:
				setHideWhen((Predicate)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__TITLE:
				setTitle((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__HELP:
				setHelp((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML:
				setEscapeHTML((Boolean)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__TRUNCATE:
				setTruncate((Boolean)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT:
				setDisableInput((Boolean)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				setValidationPattern((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__REPEATED_FIELD:
				setRepeatedField((Boolean)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL:
				setSecondDisplayLabel((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_TITLE:
				setSecondTitle((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER:
				setSecondPlaceholder((String)newValue);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_HELP:
				setSecondHelp((String)newValue);
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
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE:
				setRequiresRole(REQUIRES_ROLE_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)null);
				return;
			case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN:
				setHideWhen((Predicate)null);
				return;
			case WebuiPackage.INTERFACE_FIELD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__HELP:
				setHelp(HELP_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML:
				setEscapeHTML(ESCAPE_HTML_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption(COLLECTION_DISPLAY_OPTION_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__TRUNCATE:
				setTruncate(TRUNCATE_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT:
				setDisableInput(DISABLE_INPUT_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				setValidationPattern(VALIDATION_PATTERN_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__REPEATED_FIELD:
				setRepeatedField(REPEATED_FIELD_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL:
				setSecondDisplayLabel(SECOND_DISPLAY_LABEL_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_TITLE:
				setSecondTitle(SECOND_TITLE_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER:
				setSecondPlaceholder(SECOND_PLACEHOLDER_EDEFAULT);
				return;
			case WebuiPackage.INTERFACE_FIELD__SECOND_HELP:
				setSecondHelp(SECOND_HELP_EDEFAULT);
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
			case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE:
				return REQUIRES_ROLE_EDEFAULT == null ? requiresRole != null : !REQUIRES_ROLE_EDEFAULT.equals(requiresRole);
			case WebuiPackage.INTERFACE_FIELD__AUTHORISATION:
				return authorisation != null;
			case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN:
				return hideWhen != null;
			case WebuiPackage.INTERFACE_FIELD__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebuiPackage.INTERFACE_FIELD__HELP:
				return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
			case WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML:
				return escapeHTML != ESCAPE_HTML_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
				return collectionDisplayOption != COLLECTION_DISPLAY_OPTION_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__TRUNCATE:
				return truncate != TRUNCATE_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT:
				return disableInput != DISABLE_INPUT_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case WebuiPackage.INTERFACE_FIELD__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case WebuiPackage.INTERFACE_FIELD__VALIDATION_PATTERN:
				return VALIDATION_PATTERN_EDEFAULT == null ? validationPattern != null : !VALIDATION_PATTERN_EDEFAULT.equals(validationPattern);
			case WebuiPackage.INTERFACE_FIELD__REPEATED_FIELD:
				return repeatedField != REPEATED_FIELD_EDEFAULT;
			case WebuiPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL:
				return SECOND_DISPLAY_LABEL_EDEFAULT == null ? secondDisplayLabel != null : !SECOND_DISPLAY_LABEL_EDEFAULT.equals(secondDisplayLabel);
			case WebuiPackage.INTERFACE_FIELD__SECOND_TITLE:
				return SECOND_TITLE_EDEFAULT == null ? secondTitle != null : !SECOND_TITLE_EDEFAULT.equals(secondTitle);
			case WebuiPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER:
				return SECOND_PLACEHOLDER_EDEFAULT == null ? secondPlaceholder != null : !SECOND_PLACEHOLDER_EDEFAULT.equals(secondPlaceholder);
			case WebuiPackage.INTERFACE_FIELD__SECOND_HELP:
				return SECOND_HELP_EDEFAULT == null ? secondHelp != null : !SECOND_HELP_EDEFAULT.equals(secondHelp);
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
		if (baseClass == UnitField.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON: return WebuiPackage.UNIT_FIELD__DISPLAYED_ON;
				case WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE: return WebuiPackage.UNIT_FIELD__REQUIRES_ROLE;
				case WebuiPackage.INTERFACE_FIELD__AUTHORISATION: return WebuiPackage.UNIT_FIELD__AUTHORISATION;
				case WebuiPackage.INTERFACE_FIELD__HIDE_WHEN: return WebuiPackage.UNIT_FIELD__HIDE_WHEN;
				case WebuiPackage.INTERFACE_FIELD__TITLE: return WebuiPackage.UNIT_FIELD__TITLE;
				case WebuiPackage.INTERFACE_FIELD__HELP: return WebuiPackage.UNIT_FIELD__HELP;
				case WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML: return WebuiPackage.UNIT_FIELD__ESCAPE_HTML;
				case WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION: return WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION;
				case WebuiPackage.INTERFACE_FIELD__TRUNCATE: return WebuiPackage.UNIT_FIELD__TRUNCATE;
				case WebuiPackage.INTERFACE_FIELD__DATE_FORMAT: return WebuiPackage.UNIT_FIELD__DATE_FORMAT;
				case WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT: return WebuiPackage.UNIT_FIELD__DISABLE_INPUT;
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
		if (baseClass == UnitField.class) {
			switch (baseFeatureID) {
				case WebuiPackage.UNIT_FIELD__DISPLAYED_ON: return WebuiPackage.INTERFACE_FIELD__DISPLAYED_ON;
				case WebuiPackage.UNIT_FIELD__REQUIRES_ROLE: return WebuiPackage.INTERFACE_FIELD__REQUIRES_ROLE;
				case WebuiPackage.UNIT_FIELD__AUTHORISATION: return WebuiPackage.INTERFACE_FIELD__AUTHORISATION;
				case WebuiPackage.UNIT_FIELD__HIDE_WHEN: return WebuiPackage.INTERFACE_FIELD__HIDE_WHEN;
				case WebuiPackage.UNIT_FIELD__TITLE: return WebuiPackage.INTERFACE_FIELD__TITLE;
				case WebuiPackage.UNIT_FIELD__HELP: return WebuiPackage.INTERFACE_FIELD__HELP;
				case WebuiPackage.UNIT_FIELD__ESCAPE_HTML: return WebuiPackage.INTERFACE_FIELD__ESCAPE_HTML;
				case WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION: return WebuiPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION;
				case WebuiPackage.UNIT_FIELD__TRUNCATE: return WebuiPackage.INTERFACE_FIELD__TRUNCATE;
				case WebuiPackage.UNIT_FIELD__DATE_FORMAT: return WebuiPackage.INTERFACE_FIELD__DATE_FORMAT;
				case WebuiPackage.UNIT_FIELD__DISABLE_INPUT: return WebuiPackage.INTERFACE_FIELD__DISABLE_INPUT;
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
		result.append(" (requiresRole: ");
		result.append(requiresRole);
		result.append(", title: ");
		result.append(title);
		result.append(", help: ");
		result.append(help);
		result.append(", escapeHTML: ");
		result.append(escapeHTML);
		result.append(", collectionDisplayOption: ");
		result.append(collectionDisplayOption);
		result.append(", truncate: ");
		result.append(truncate);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", disableInput: ");
		result.append(disableInput);
		result.append(", required: ");
		result.append(required);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", validationPattern: ");
		result.append(validationPattern);
		result.append(", repeatedField: ");
		result.append(repeatedField);
		result.append(", secondDisplayLabel: ");
		result.append(secondDisplayLabel);
		result.append(", secondTitle: ");
		result.append(secondTitle);
		result.append(", secondPlaceholder: ");
		result.append(secondPlaceholder);
		result.append(", secondHelp: ");
		result.append(secondHelp);
		result.append(')');
		return result.toString();
	}

} //InterfaceFieldImpl
