/**
 */
package work.andycarpenter.webgen.pims.webui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.webui.CollectionFilter;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.DisplayValue;
import work.andycarpenter.webgen.pims.webui.SelectableUnit;
import work.andycarpenter.webgen.pims.webui.ValueContext;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getValueEntities <em>Value Entities</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getUnitTitle <em>Unit Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getElementTitle <em>Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isTruncateElementTitle <em>Truncate Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isFiltersUseAutoSubmit <em>Filters Use Auto Submit</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getClearLabelOverride <em>Clear Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getClearIconOverride <em>Clear Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getClearTitleOverride <em>Clear Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSearchLabelOverride <em>Search Label Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSearchIconOverride <em>Search Icon Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSearchTitleOverride <em>Search Title Override</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getEmptyMessage <em>Empty Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollectionUnitImpl extends DynamicUnitImpl implements CollectionUnit {
	/**
	 * The cached setting delegate for the '{@link #getValueEntities() <em>Value Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueEntities()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VALUE_ENTITIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)WebuiPackage.Literals.VALUE_CONTEXT__VALUE_ENTITIES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getUnitTitle() <em>Unit Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitTitle()
	 * @generated
	 * @ordered
	 */
	protected Label unitTitle;

	/**
	 * The cached value of the '{@link #getElementTitle() <em>Element Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementTitle()
	 * @generated
	 * @ordered
	 */
	protected DisplayValue elementTitle;

	/**
	 * The default value of the '{@link #isTruncateElementTitle() <em>Truncate Element Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncateElementTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUNCATE_ELEMENT_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTruncateElementTitle() <em>Truncate Element Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncateElementTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean truncateElementTitle = TRUNCATE_ELEMENT_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getFindContainerSelection() <em>Find Container Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindContainerSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection findContainerSelection;

	/**
	 * The cached value of the '{@link #getFindElementSelection() <em>Find Element Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindElementSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection findElementSelection;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionFilter> filters;

	/**
	 * The default value of the '{@link #isFiltersUseAutoSubmit() <em>Filters Use Auto Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltersUseAutoSubmit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERS_USE_AUTO_SUBMIT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFiltersUseAutoSubmit() <em>Filters Use Auto Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiltersUseAutoSubmit()
	 * @generated
	 * @ordered
	 */
	protected boolean filtersUseAutoSubmit = FILTERS_USE_AUTO_SUBMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearLabelOverride() <em>Clear Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_LABEL_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearLabelOverride() <em>Clear Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected String clearLabelOverride = CLEAR_LABEL_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearIconOverride() <em>Clear Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearIconOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_ICON_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearIconOverride() <em>Clear Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearIconOverride()
	 * @generated
	 * @ordered
	 */
	protected String clearIconOverride = CLEAR_ICON_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClearTitleOverride() <em>Clear Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CLEAR_TITLE_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClearTitleOverride() <em>Clear Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected String clearTitleOverride = CLEAR_TITLE_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchLabelOverride() <em>Search Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_LABEL_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchLabelOverride() <em>Search Label Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchLabelOverride()
	 * @generated
	 * @ordered
	 */
	protected String searchLabelOverride = SEARCH_LABEL_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchIconOverride() <em>Search Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchIconOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_ICON_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchIconOverride() <em>Search Icon Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchIconOverride()
	 * @generated
	 * @ordered
	 */
	protected String searchIconOverride = SEARCH_ICON_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchTitleOverride() <em>Search Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_TITLE_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchTitleOverride() <em>Search Title Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchTitleOverride()
	 * @generated
	 * @ordered
	 */
	protected String searchTitleOverride = SEARCH_TITLE_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_FIELD_LABELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitFieldLabels() <em>Omit Field Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitFieldLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean omitFieldLabels = OMIT_FIELD_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_PAGINATION_SIZE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultPaginationSize = DEFAULT_PAGINATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPaginationSize() <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_PAGINATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumPaginationSize() <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected int maximumPaginationSize = MAXIMUM_PAGINATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected String emptyMessage = EMPTY_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebuiPackage.Literals.COLLECTION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Entity containingType() {
		if (getFindContainerSelection() != null) {
			return getFindContainerSelection().getDefinedBy().getServes();
		} else if (getSelection() != null) {
			return getSelection().selectionType();
		} else if (contentType != null) {
			return contentType.getContainingType();
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isContained() {
		return containingType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Entity> referencableEntities() {
		final EList<Entity> entities = new BasicEList<Entity>();
		if (getContentType() != null) {
			entities.add(getContentType());
		}
		if (isContained()) {
			entities.add(containingType());
		}

		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entity> getValueEntities() {
		return (EList<Entity>)VALUE_ENTITIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValueEntities() {
		return VALUE_ENTITIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Entity> valueEntities() {
		return referencableEntities();
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
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
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
	public Label getUnitTitle() {
		if (unitTitle != null && unitTitle.eIsProxy()) {
			InternalEObject oldUnitTitle = (InternalEObject)unitTitle;
			unitTitle = (Label)eResolveProxy(oldUnitTitle);
			if (unitTitle != oldUnitTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_UNIT__UNIT_TITLE, oldUnitTitle, unitTitle));
			}
		}
		return unitTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetUnitTitle() {
		return unitTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitTitle(Label newUnitTitle) {
		Label oldUnitTitle = unitTitle;
		unitTitle = newUnitTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__UNIT_TITLE, oldUnitTitle, unitTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayValue getElementTitle() {
		return elementTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementTitle(DisplayValue newElementTitle, NotificationChain msgs) {
		DisplayValue oldElementTitle = elementTitle;
		elementTitle = newElementTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE, oldElementTitle, newElementTitle);
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
	public void setElementTitle(DisplayValue newElementTitle) {
		if (newElementTitle != elementTitle) {
			NotificationChain msgs = null;
			if (elementTitle != null)
				msgs = ((InternalEObject)elementTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE, null, msgs);
			if (newElementTitle != null)
				msgs = ((InternalEObject)newElementTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE, null, msgs);
			msgs = basicSetElementTitle(newElementTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE, newElementTitle, newElementTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTruncateElementTitle() {
		return truncateElementTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTruncateElementTitle(boolean newTruncateElementTitle) {
		boolean oldTruncateElementTitle = truncateElementTitle;
		truncateElementTitle = newTruncateElementTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE, oldTruncateElementTitle, truncateElementTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_UNIT__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getFindContainerSelection() {
		if (findContainerSelection != null && findContainerSelection.eIsProxy()) {
			InternalEObject oldFindContainerSelection = (InternalEObject)findContainerSelection;
			findContainerSelection = (Selection)eResolveProxy(oldFindContainerSelection);
			if (findContainerSelection != oldFindContainerSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION, oldFindContainerSelection, findContainerSelection));
			}
		}
		return findContainerSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindContainerSelection() {
		return findContainerSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindContainerSelection(Selection newFindContainerSelection) {
		Selection oldFindContainerSelection = findContainerSelection;
		findContainerSelection = newFindContainerSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION, oldFindContainerSelection, findContainerSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection getFindElementSelection() {
		if (findElementSelection != null && findElementSelection.eIsProxy()) {
			InternalEObject oldFindElementSelection = (InternalEObject)findElementSelection;
			findElementSelection = (Selection)eResolveProxy(oldFindElementSelection);
			if (findElementSelection != oldFindElementSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION, oldFindElementSelection, findElementSelection));
			}
		}
		return findElementSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindElementSelection() {
		return findElementSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindElementSelection(Selection newFindElementSelection) {
		Selection oldFindElementSelection = findElementSelection;
		findElementSelection = newFindElementSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION, oldFindElementSelection, findElementSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollectionFilter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentWithInverseEList<CollectionFilter>(CollectionFilter.class, this, WebuiPackage.COLLECTION_UNIT__FILTERS, WebuiPackage.COLLECTION_FILTER__AFFECTS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFiltersUseAutoSubmit() {
		return filtersUseAutoSubmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiltersUseAutoSubmit(boolean newFiltersUseAutoSubmit) {
		boolean oldFiltersUseAutoSubmit = filtersUseAutoSubmit;
		filtersUseAutoSubmit = newFiltersUseAutoSubmit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT, oldFiltersUseAutoSubmit, filtersUseAutoSubmit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClearLabelOverride() {
		return clearLabelOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearLabelOverride(String newClearLabelOverride) {
		String oldClearLabelOverride = clearLabelOverride;
		clearLabelOverride = newClearLabelOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE, oldClearLabelOverride, clearLabelOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClearIconOverride() {
		return clearIconOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearIconOverride(String newClearIconOverride) {
		String oldClearIconOverride = clearIconOverride;
		clearIconOverride = newClearIconOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE, oldClearIconOverride, clearIconOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClearTitleOverride() {
		return clearTitleOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearTitleOverride(String newClearTitleOverride) {
		String oldClearTitleOverride = clearTitleOverride;
		clearTitleOverride = newClearTitleOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE, oldClearTitleOverride, clearTitleOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSearchLabelOverride() {
		return searchLabelOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchLabelOverride(String newSearchLabelOverride) {
		String oldSearchLabelOverride = searchLabelOverride;
		searchLabelOverride = newSearchLabelOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE, oldSearchLabelOverride, searchLabelOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSearchIconOverride() {
		return searchIconOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchIconOverride(String newSearchIconOverride) {
		String oldSearchIconOverride = searchIconOverride;
		searchIconOverride = newSearchIconOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE, oldSearchIconOverride, searchIconOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSearchTitleOverride() {
		return searchTitleOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchTitleOverride(String newSearchTitleOverride) {
		String oldSearchTitleOverride = searchTitleOverride;
		searchTitleOverride = newSearchTitleOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE, oldSearchTitleOverride, searchTitleOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (Filter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebuiPackage.COLLECTION_UNIT__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(Filter newFilter) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmptyMessage() {
		return emptyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyMessage(String newEmptyMessage) {
		String oldEmptyMessage = emptyMessage;
		emptyMessage = newEmptyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE, oldEmptyMessage, emptyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOmitFieldLabels() {
		return omitFieldLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitFieldLabels(boolean newOmitFieldLabels) {
		boolean oldOmitFieldLabels = omitFieldLabels;
		omitFieldLabels = newOmitFieldLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS, oldOmitFieldLabels, omitFieldLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDefaultPaginationSize() {
		return defaultPaginationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPaginationSize(int newDefaultPaginationSize) {
		int oldDefaultPaginationSize = defaultPaginationSize;
		defaultPaginationSize = newDefaultPaginationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE, oldDefaultPaginationSize, defaultPaginationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumPaginationSize() {
		return maximumPaginationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumPaginationSize(int newMaximumPaginationSize) {
		int oldMaximumPaginationSize = maximumPaginationSize;
		maximumPaginationSize = newMaximumPaginationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE, oldMaximumPaginationSize, maximumPaginationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
				return basicSetElementTitle(null, msgs);
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebuiPackage.COLLECTION_UNIT__VALUE_ENTITIES:
				return getValueEntities();
			case WebuiPackage.COLLECTION_UNIT__UNIT_TITLE:
				if (resolve) return getUnitTitle();
				return basicGetUnitTitle();
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
				return getElementTitle();
			case WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
				return isTruncateElementTitle();
			case WebuiPackage.COLLECTION_UNIT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION:
				if (resolve) return getFindContainerSelection();
				return basicGetFindContainerSelection();
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				if (resolve) return getFindElementSelection();
				return basicGetFindElementSelection();
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
				return getFilters();
			case WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT:
				return isFiltersUseAutoSubmit();
			case WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
				return getClearLabelOverride();
			case WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
				return getClearIconOverride();
			case WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE:
				return getClearTitleOverride();
			case WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
				return getSearchLabelOverride();
			case WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
				return getSearchIconOverride();
			case WebuiPackage.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE:
				return getSearchTitleOverride();
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return getDefaultPaginationSize();
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				return getMaximumPaginationSize();
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return getEmptyMessage();
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
			case WebuiPackage.COLLECTION_UNIT__UNIT_TITLE:
				setUnitTitle((Label)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
				setElementTitle((DisplayValue)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
				setTruncateElementTitle((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION:
				setFindContainerSelection((Selection)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				setFilter((Filter)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends CollectionFilter>)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT:
				setFiltersUseAutoSubmit((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
				setClearLabelOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
				setClearIconOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE:
				setClearTitleOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
				setSearchLabelOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
				setSearchIconOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE:
				setSearchTitleOverride((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize((Integer)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				setMaximumPaginationSize((Integer)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage((String)newValue);
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
			case WebuiPackage.COLLECTION_UNIT__UNIT_TITLE:
				setUnitTitle((Label)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
				setElementTitle((DisplayValue)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
				setTruncateElementTitle(TRUNCATE_ELEMENT_TITLE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__SELECTION:
				setSelection((Selection)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION:
				setFindContainerSelection((Selection)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				setFilter((Filter)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
				getFilters().clear();
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT:
				setFiltersUseAutoSubmit(FILTERS_USE_AUTO_SUBMIT_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
				setClearLabelOverride(CLEAR_LABEL_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
				setClearIconOverride(CLEAR_ICON_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE:
				setClearTitleOverride(CLEAR_TITLE_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
				setSearchLabelOverride(SEARCH_LABEL_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
				setSearchIconOverride(SEARCH_ICON_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE:
				setSearchTitleOverride(SEARCH_TITLE_OVERRIDE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				setOmitFieldLabels(OMIT_FIELD_LABELS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize(DEFAULT_PAGINATION_SIZE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				setMaximumPaginationSize(MAXIMUM_PAGINATION_SIZE_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage(EMPTY_MESSAGE_EDEFAULT);
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
			case WebuiPackage.COLLECTION_UNIT__VALUE_ENTITIES:
				return isSetValueEntities();
			case WebuiPackage.COLLECTION_UNIT__UNIT_TITLE:
				return unitTitle != null;
			case WebuiPackage.COLLECTION_UNIT__ELEMENT_TITLE:
				return elementTitle != null;
			case WebuiPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
				return truncateElementTitle != TRUNCATE_ELEMENT_TITLE_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__SELECTION:
				return selection != null;
			case WebuiPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION:
				return findContainerSelection != null;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				return findElementSelection != null;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				return filter != null;
			case WebuiPackage.COLLECTION_UNIT__FILTERS:
				return filters != null && !filters.isEmpty();
			case WebuiPackage.COLLECTION_UNIT__FILTERS_USE_AUTO_SUBMIT:
				return filtersUseAutoSubmit != FILTERS_USE_AUTO_SUBMIT_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
				return CLEAR_LABEL_OVERRIDE_EDEFAULT == null ? clearLabelOverride != null : !CLEAR_LABEL_OVERRIDE_EDEFAULT.equals(clearLabelOverride);
			case WebuiPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
				return CLEAR_ICON_OVERRIDE_EDEFAULT == null ? clearIconOverride != null : !CLEAR_ICON_OVERRIDE_EDEFAULT.equals(clearIconOverride);
			case WebuiPackage.COLLECTION_UNIT__CLEAR_TITLE_OVERRIDE:
				return CLEAR_TITLE_OVERRIDE_EDEFAULT == null ? clearTitleOverride != null : !CLEAR_TITLE_OVERRIDE_EDEFAULT.equals(clearTitleOverride);
			case WebuiPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
				return SEARCH_LABEL_OVERRIDE_EDEFAULT == null ? searchLabelOverride != null : !SEARCH_LABEL_OVERRIDE_EDEFAULT.equals(searchLabelOverride);
			case WebuiPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
				return SEARCH_ICON_OVERRIDE_EDEFAULT == null ? searchIconOverride != null : !SEARCH_ICON_OVERRIDE_EDEFAULT.equals(searchIconOverride);
			case WebuiPackage.COLLECTION_UNIT__SEARCH_TITLE_OVERRIDE:
				return SEARCH_TITLE_OVERRIDE_EDEFAULT == null ? searchTitleOverride != null : !SEARCH_TITLE_OVERRIDE_EDEFAULT.equals(searchTitleOverride);
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return defaultPaginationSize != DEFAULT_PAGINATION_SIZE_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				return maximumPaginationSize != MAXIMUM_PAGINATION_SIZE_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return EMPTY_MESSAGE_EDEFAULT == null ? emptyMessage != null : !EMPTY_MESSAGE_EDEFAULT.equals(emptyMessage);
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
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ValueContext.class) {
			switch (derivedFeatureID) {
				case WebuiPackage.COLLECTION_UNIT__VALUE_ENTITIES: return WebuiPackage.VALUE_CONTEXT__VALUE_ENTITIES;
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
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ValueContext.class) {
			switch (baseFeatureID) {
				case WebuiPackage.VALUE_CONTEXT__VALUE_ENTITIES: return WebuiPackage.COLLECTION_UNIT__VALUE_ENTITIES;
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
		if (baseClass == SelectableUnit.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ValueContext.class) {
			switch (baseOperationID) {
				case WebuiPackage.VALUE_CONTEXT___VALUE_ENTITIES: return WebuiPackage.COLLECTION_UNIT___VALUE_ENTITIES;
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
			case WebuiPackage.COLLECTION_UNIT___IS_CONTAINED:
				return isContained();
			case WebuiPackage.COLLECTION_UNIT___VALUE_ENTITIES:
				return valueEntities();
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
		result.append(" (truncateElementTitle: ");
		result.append(truncateElementTitle);
		result.append(", filtersUseAutoSubmit: ");
		result.append(filtersUseAutoSubmit);
		result.append(", clearLabelOverride: ");
		result.append(clearLabelOverride);
		result.append(", clearIconOverride: ");
		result.append(clearIconOverride);
		result.append(", clearTitleOverride: ");
		result.append(clearTitleOverride);
		result.append(", searchLabelOverride: ");
		result.append(searchLabelOverride);
		result.append(", searchIconOverride: ");
		result.append(searchIconOverride);
		result.append(", searchTitleOverride: ");
		result.append(searchTitleOverride);
		result.append(", omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(", defaultPaginationSize: ");
		result.append(defaultPaginationSize);
		result.append(", maximumPaginationSize: ");
		result.append(maximumPaginationSize);
		result.append(", emptyMessage: ");
		result.append(emptyMessage);
		result.append(')');
		return result.toString();
	}

} //CollectionUnitImpl
