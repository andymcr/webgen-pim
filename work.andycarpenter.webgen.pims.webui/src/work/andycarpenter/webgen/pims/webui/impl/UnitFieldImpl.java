/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import work.andycarpenter.webgen.pims.expression.Predicate;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.security.AuthorisationExpression;
import work.andycarpenter.webgen.pims.webui.CollectionDisplayOptions;
import work.andycarpenter.webgen.pims.webui.DynamicUnit;
import work.andycarpenter.webgen.pims.webui.UnitField;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getReferencableEntities <em>Referencable Entities</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getHideWhen <em>Hide When</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#isEscapeHTML <em>Escape HTML</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#isTruncate <em>Truncate</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.UnitFieldImpl#isDisableInput <em>Disable Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitFieldImpl extends MinimalEObjectImpl.Container implements UnitField {
	/**
	 * The cached setting delegate for the '{@link #getReferencableEntities() <em>Referencable Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencableEntities()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFERENCABLE_ENTITIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PersistencePackage.Literals.FEATURE_VARIABLE_CONTEXT__REFERENCABLE_ENTITIES).getSettingDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.UNIT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entity> getReferencableEntities() {
		return (EList<Entity>)REFERENCABLE_ENTITIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReferencableEntities() {
		return REFERENCABLE_ENTITIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicUnit getDisplayedOn() {
		if (eContainerFeatureID() != WebuiPackage.UNIT_FIELD__DISPLAYED_ON) return null;
		return (DynamicUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayedOn(DynamicUnit newDisplayedOn, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDisplayedOn, WebuiPackage.UNIT_FIELD__DISPLAYED_ON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayedOn(DynamicUnit newDisplayedOn) {
		if (newDisplayedOn != eInternalContainer() || (eContainerFeatureID() != WebuiPackage.UNIT_FIELD__DISPLAYED_ON && newDisplayedOn != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__DISPLAYED_ON, newDisplayedOn, newDisplayedOn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__AUTHORISATION, oldAuthorisation, newAuthorisation);
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
				msgs = ((InternalEObject)authorisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FIELD__AUTHORISATION, null, msgs);
			if (newAuthorisation != null)
				msgs = ((InternalEObject)newAuthorisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FIELD__AUTHORISATION, null, msgs);
			msgs = basicSetAuthorisation(newAuthorisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__AUTHORISATION, newAuthorisation, newAuthorisation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__HIDE_WHEN, oldHideWhen, newHideWhen);
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
				msgs = ((InternalEObject)hideWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FIELD__HIDE_WHEN, null, msgs);
			if (newHideWhen != null)
				msgs = ((InternalEObject)newHideWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.UNIT_FIELD__HIDE_WHEN, null, msgs);
			msgs = basicSetHideWhen(newHideWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__HIDE_WHEN, newHideWhen, newHideWhen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__HELP, oldHelp, help));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__ESCAPE_HTML, oldEscapeHTML, escapeHTML));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION, oldCollectionDisplayOption, collectionDisplayOption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__TRUNCATE, oldTruncate, truncate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__DATE_FORMAT, oldDateFormat, dateFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.UNIT_FIELD__DISABLE_INPUT, oldDisableInput, disableInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Entity> referencableEntities() {
		final EList<Entity> entities = new BasicEList<Entity>();
		if (getDisplayedOn().getContentType() != null) {
			entities.add(getDisplayedOn().getContentType());
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
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
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
				return basicSetDisplayedOn(null, msgs);
			case WebuiPackage.UNIT_FIELD__AUTHORISATION:
				return basicSetAuthorisation(null, msgs);
			case WebuiPackage.UNIT_FIELD__HIDE_WHEN:
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
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
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
			case WebuiPackage.UNIT_FIELD__REFERENCABLE_ENTITIES:
				return getReferencableEntities();
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
				return getDisplayedOn();
			case WebuiPackage.UNIT_FIELD__AUTHORISATION:
				return getAuthorisation();
			case WebuiPackage.UNIT_FIELD__HIDE_WHEN:
				return getHideWhen();
			case WebuiPackage.UNIT_FIELD__TITLE:
				return getTitle();
			case WebuiPackage.UNIT_FIELD__HELP:
				return getHelp();
			case WebuiPackage.UNIT_FIELD__ESCAPE_HTML:
				return isEscapeHTML();
			case WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION:
				return getCollectionDisplayOption();
			case WebuiPackage.UNIT_FIELD__TRUNCATE:
				return isTruncate();
			case WebuiPackage.UNIT_FIELD__DATE_FORMAT:
				return getDateFormat();
			case WebuiPackage.UNIT_FIELD__DISABLE_INPUT:
				return isDisableInput();
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
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__HIDE_WHEN:
				setHideWhen((Predicate)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__TITLE:
				setTitle((String)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__HELP:
				setHelp((String)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__ESCAPE_HTML:
				setEscapeHTML((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption((CollectionDisplayOptions)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__TRUNCATE:
				setTruncate((Boolean)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case WebuiPackage.UNIT_FIELD__DISABLE_INPUT:
				setDisableInput((Boolean)newValue);
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
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
				setDisplayedOn((DynamicUnit)null);
				return;
			case WebuiPackage.UNIT_FIELD__AUTHORISATION:
				setAuthorisation((AuthorisationExpression)null);
				return;
			case WebuiPackage.UNIT_FIELD__HIDE_WHEN:
				setHideWhen((Predicate)null);
				return;
			case WebuiPackage.UNIT_FIELD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__HELP:
				setHelp(HELP_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__ESCAPE_HTML:
				setEscapeHTML(ESCAPE_HTML_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION:
				setCollectionDisplayOption(COLLECTION_DISPLAY_OPTION_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__TRUNCATE:
				setTruncate(TRUNCATE_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case WebuiPackage.UNIT_FIELD__DISABLE_INPUT:
				setDisableInput(DISABLE_INPUT_EDEFAULT);
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
			case WebuiPackage.UNIT_FIELD__REFERENCABLE_ENTITIES:
				return isSetReferencableEntities();
			case WebuiPackage.UNIT_FIELD__DISPLAYED_ON:
				return getDisplayedOn() != null;
			case WebuiPackage.UNIT_FIELD__AUTHORISATION:
				return authorisation != null;
			case WebuiPackage.UNIT_FIELD__HIDE_WHEN:
				return hideWhen != null;
			case WebuiPackage.UNIT_FIELD__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WebuiPackage.UNIT_FIELD__HELP:
				return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
			case WebuiPackage.UNIT_FIELD__ESCAPE_HTML:
				return escapeHTML != ESCAPE_HTML_EDEFAULT;
			case WebuiPackage.UNIT_FIELD__COLLECTION_DISPLAY_OPTION:
				return collectionDisplayOption != COLLECTION_DISPLAY_OPTION_EDEFAULT;
			case WebuiPackage.UNIT_FIELD__TRUNCATE:
				return truncate != TRUNCATE_EDEFAULT;
			case WebuiPackage.UNIT_FIELD__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case WebuiPackage.UNIT_FIELD__DISABLE_INPUT:
				return disableInput != DISABLE_INPUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebuiPackage.UNIT_FIELD___REFERENCABLE_ENTITIES:
				return referencableEntities();
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
		result.append(" (title: ");
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
		result.append(')');
		return result.toString();
	}

} //UnitFieldImpl
