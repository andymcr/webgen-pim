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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.webui.CollectionUnit;
import work.andycarpenter.webgen.pims.webui.FeaturePath;
import work.andycarpenter.webgen.pims.webui.PaginationControlPlacements;
import work.andycarpenter.webgen.pims.webui.WebuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getUnitTitle <em>Unit Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getElementTitle <em>Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isTruncateElementTitle <em>Truncate Element Title</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isOmitContainerLoad <em>Omit Container Load</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getSupportedFilters <em>Supported Filters</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPaginationControlPlacement <em>Pagination Control Placement</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getNextPageIconName <em>Next Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPreviousPageIconName <em>Previous Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getFirstPageIconName <em>First Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getLastPageIconName <em>Last Page Icon Name</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPaginationClass <em>Pagination Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPaginationElementClass <em>Pagination Element Class</em>}</li>
 *   <li>{@link work.andycarpenter.webgen.pims.webui.impl.CollectionUnitImpl#getPaginationAnchorClass <em>Pagination Anchor Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollectionUnitImpl extends DynamicUnitImpl implements CollectionUnit {
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
	protected FeaturePath elementTitle;

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
	 * The default value of the '{@link #isOmitContainerLoad() <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitContainerLoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CONTAINER_LOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitContainerLoad() <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitContainerLoad()
	 * @generated
	 * @ordered
	 */
	protected boolean omitContainerLoad = OMIT_CONTAINER_LOAD_EDEFAULT;

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
	 * The cached value of the '{@link #getSupportedFilters() <em>Supported Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> supportedFilters;

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
	 * The default value of the '{@link #getPaginationControlPlacement() <em>Pagination Control Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationControlPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final PaginationControlPlacements PAGINATION_CONTROL_PLACEMENT_EDEFAULT = PaginationControlPlacements.BELOW;

	/**
	 * The cached value of the '{@link #getPaginationControlPlacement() <em>Pagination Control Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationControlPlacement()
	 * @generated
	 * @ordered
	 */
	protected PaginationControlPlacements paginationControlPlacement = PAGINATION_CONTROL_PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_NPAGES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected int nextNpages = NEXT_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int PREVIOUS_NPAGES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected int previousNpages = PREVIOUS_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_LABEL_EDEFAULT = "&gt;";

	/**
	 * The cached value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String nextPageLabel = NEXT_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextPageIconName() <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_ICON_NAME_EDEFAULT = "chevron_right";

	/**
	 * The cached value of the '{@link #getNextPageIconName() <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String nextPageIconName = NEXT_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_PAGE_LABEL_EDEFAULT = "&lt;";

	/**
	 * The cached value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String previousPageLabel = PREVIOUS_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousPageIconName() <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_PAGE_ICON_NAME_EDEFAULT = "chevron_left";

	/**
	 * The cached value of the '{@link #getPreviousPageIconName() <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String previousPageIconName = PREVIOUS_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DISABLED_PAGE_LINKS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useDisabledPageLinks = USE_DISABLED_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FIRST_LAST_PAGE_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useFirstLastPageLinks = USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_LABEL_EDEFAULT = "<<";

	/**
	 * The cached value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String firstPageLabel = FIRST_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageIconName() <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_ICON_NAME_EDEFAULT = "first_page";

	/**
	 * The cached value of the '{@link #getFirstPageIconName() <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String firstPageIconName = FIRST_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_LABEL_EDEFAULT = ">>";

	/**
	 * The cached value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String lastPageLabel = LAST_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPageIconName() <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_ICON_NAME_EDEFAULT = "last_page";

	/**
	 * The cached value of the '{@link #getLastPageIconName() <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String lastPageIconName = LAST_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaginationClass() <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGINATION_CLASS_EDEFAULT = "pagination";

	/**
	 * The cached value of the '{@link #getPaginationClass() <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationClass()
	 * @generated
	 * @ordered
	 */
	protected String paginationClass = PAGINATION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaginationElementClass() <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationElementClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGINATION_ELEMENT_CLASS_EDEFAULT = "page-item";

	/**
	 * The cached value of the '{@link #getPaginationElementClass() <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationElementClass()
	 * @generated
	 * @ordered
	 */
	protected String paginationElementClass = PAGINATION_ELEMENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaginationAnchorClass() <em>Pagination Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGINATION_ANCHOR_CLASS_EDEFAULT = "page-link";

	/**
	 * The cached value of the '{@link #getPaginationAnchorClass() <em>Pagination Anchor Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationAnchorClass()
	 * @generated
	 * @ordered
	 */
	protected String paginationAnchorClass = PAGINATION_ANCHOR_CLASS_EDEFAULT;

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
	public FeaturePath getElementTitle() {
		return elementTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementTitle(FeaturePath newElementTitle, NotificationChain msgs) {
		FeaturePath oldElementTitle = elementTitle;
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
	public void setElementTitle(FeaturePath newElementTitle) {
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
	public boolean isOmitContainerLoad() {
		return omitContainerLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOmitContainerLoad(boolean newOmitContainerLoad) {
		boolean oldOmitContainerLoad = omitContainerLoad;
		omitContainerLoad = newOmitContainerLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD, oldOmitContainerLoad, omitContainerLoad));
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
	public EList<Filter> getSupportedFilters() {
		if (supportedFilters == null) {
			supportedFilters = new EObjectResolvingEList<Filter>(Filter.class, this, WebuiPackage.COLLECTION_UNIT__SUPPORTED_FILTERS);
		}
		return supportedFilters;
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
	public PaginationControlPlacements getPaginationControlPlacement() {
		return paginationControlPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginationControlPlacement(PaginationControlPlacements newPaginationControlPlacement) {
		PaginationControlPlacements oldPaginationControlPlacement = paginationControlPlacement;
		paginationControlPlacement = newPaginationControlPlacement == null ? PAGINATION_CONTROL_PLACEMENT_EDEFAULT : newPaginationControlPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT, oldPaginationControlPlacement, paginationControlPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNextNpages() {
		return nextNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextNpages(int newNextNpages) {
		int oldNextNpages = nextNpages;
		nextNpages = newNextNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__NEXT_NPAGES, oldNextNpages, nextNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPreviousNpages() {
		return previousNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousNpages(int newPreviousNpages) {
		int oldPreviousNpages = previousNpages;
		previousNpages = newPreviousNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PREVIOUS_NPAGES, oldPreviousNpages, previousNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextPageLabel() {
		return nextPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextPageLabel(String newNextPageLabel) {
		String oldNextPageLabel = nextPageLabel;
		nextPageLabel = newNextPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL, oldNextPageLabel, nextPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextPageIconName() {
		return nextPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextPageIconName(String newNextPageIconName) {
		String oldNextPageIconName = nextPageIconName;
		nextPageIconName = newNextPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME, oldNextPageIconName, nextPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousPageLabel() {
		return previousPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousPageLabel(String newPreviousPageLabel) {
		String oldPreviousPageLabel = previousPageLabel;
		previousPageLabel = newPreviousPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL, oldPreviousPageLabel, previousPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviousPageIconName() {
		return previousPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousPageIconName(String newPreviousPageIconName) {
		String oldPreviousPageIconName = previousPageIconName;
		previousPageIconName = newPreviousPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME, oldPreviousPageIconName, previousPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseDisabledPageLinks() {
		return useDisabledPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseDisabledPageLinks(boolean newUseDisabledPageLinks) {
		boolean oldUseDisabledPageLinks = useDisabledPageLinks;
		useDisabledPageLinks = newUseDisabledPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS, oldUseDisabledPageLinks, useDisabledPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseFirstLastPageLinks() {
		return useFirstLastPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseFirstLastPageLinks(boolean newUseFirstLastPageLinks) {
		boolean oldUseFirstLastPageLinks = useFirstLastPageLinks;
		useFirstLastPageLinks = newUseFirstLastPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS, oldUseFirstLastPageLinks, useFirstLastPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstPageLabel() {
		return firstPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstPageLabel(String newFirstPageLabel) {
		String oldFirstPageLabel = firstPageLabel;
		firstPageLabel = newFirstPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL, oldFirstPageLabel, firstPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstPageIconName() {
		return firstPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstPageIconName(String newFirstPageIconName) {
		String oldFirstPageIconName = firstPageIconName;
		firstPageIconName = newFirstPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME, oldFirstPageIconName, firstPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastPageLabel() {
		return lastPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPageLabel(String newLastPageLabel) {
		String oldLastPageLabel = lastPageLabel;
		lastPageLabel = newLastPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__LAST_PAGE_LABEL, oldLastPageLabel, lastPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastPageIconName() {
		return lastPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPageIconName(String newLastPageIconName) {
		String oldLastPageIconName = lastPageIconName;
		lastPageIconName = newLastPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME, oldLastPageIconName, lastPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaginationClass() {
		return paginationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginationClass(String newPaginationClass) {
		String oldPaginationClass = paginationClass;
		paginationClass = newPaginationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PAGINATION_CLASS, oldPaginationClass, paginationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaginationElementClass() {
		return paginationElementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginationElementClass(String newPaginationElementClass) {
		String oldPaginationElementClass = paginationElementClass;
		paginationElementClass = newPaginationElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS, oldPaginationElementClass, paginationElementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaginationAnchorClass() {
		return paginationAnchorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginationAnchorClass(String newPaginationAnchorClass) {
		String oldPaginationAnchorClass = paginationAnchorClass;
		paginationAnchorClass = newPaginationAnchorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebuiPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS, oldPaginationAnchorClass, paginationAnchorClass));
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
			case WebuiPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD:
				return isOmitContainerLoad();
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				if (resolve) return getFindElementSelection();
				return basicGetFindElementSelection();
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
			case WebuiPackage.COLLECTION_UNIT__SUPPORTED_FILTERS:
				return getSupportedFilters();
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return getEmptyMessage();
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				return isOmitFieldLabels();
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return getDefaultPaginationSize();
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				return getMaximumPaginationSize();
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT:
				return getPaginationControlPlacement();
			case WebuiPackage.COLLECTION_UNIT__NEXT_NPAGES:
				return getNextNpages();
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				return getPreviousNpages();
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				return getNextPageLabel();
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME:
				return getNextPageIconName();
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				return getPreviousPageLabel();
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME:
				return getPreviousPageIconName();
			case WebuiPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				return isUseDisabledPageLinks();
			case WebuiPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return isUseFirstLastPageLinks();
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				return getFirstPageLabel();
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME:
				return getFirstPageIconName();
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				return getLastPageLabel();
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME:
				return getLastPageIconName();
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CLASS:
				return getPaginationClass();
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS:
				return getPaginationElementClass();
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS:
				return getPaginationAnchorClass();
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
				setElementTitle((FeaturePath)newValue);
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
			case WebuiPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD:
				setOmitContainerLoad((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				setFilter((Filter)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__SUPPORTED_FILTERS:
				getSupportedFilters().clear();
				getSupportedFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage((String)newValue);
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
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT:
				setPaginationControlPlacement((PaginationControlPlacements)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_NPAGES:
				setNextNpages((Integer)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages((Integer)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME:
				setNextPageIconName((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME:
				setPreviousPageIconName((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks((Boolean)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME:
				setFirstPageIconName((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME:
				setLastPageIconName((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CLASS:
				setPaginationClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS:
				setPaginationElementClass((String)newValue);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS:
				setPaginationAnchorClass((String)newValue);
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
				setElementTitle((FeaturePath)null);
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
			case WebuiPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD:
				setOmitContainerLoad(OMIT_CONTAINER_LOAD_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				setFilter((Filter)null);
				return;
			case WebuiPackage.COLLECTION_UNIT__SUPPORTED_FILTERS:
				getSupportedFilters().clear();
				return;
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				setEmptyMessage(EMPTY_MESSAGE_EDEFAULT);
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
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT:
				setPaginationControlPlacement(PAGINATION_CONTROL_PLACEMENT_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_NPAGES:
				setNextNpages(NEXT_NPAGES_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages(PREVIOUS_NPAGES_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel(NEXT_PAGE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME:
				setNextPageIconName(NEXT_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel(PREVIOUS_PAGE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME:
				setPreviousPageIconName(PREVIOUS_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks(USE_DISABLED_PAGE_LINKS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks(USE_FIRST_LAST_PAGE_LINKS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel(FIRST_PAGE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME:
				setFirstPageIconName(FIRST_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel(LAST_PAGE_LABEL_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME:
				setLastPageIconName(LAST_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CLASS:
				setPaginationClass(PAGINATION_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS:
				setPaginationElementClass(PAGINATION_ELEMENT_CLASS_EDEFAULT);
				return;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS:
				setPaginationAnchorClass(PAGINATION_ANCHOR_CLASS_EDEFAULT);
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
			case WebuiPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD:
				return omitContainerLoad != OMIT_CONTAINER_LOAD_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION:
				return findElementSelection != null;
			case WebuiPackage.COLLECTION_UNIT__FILTER:
				return filter != null;
			case WebuiPackage.COLLECTION_UNIT__SUPPORTED_FILTERS:
				return supportedFilters != null && !supportedFilters.isEmpty();
			case WebuiPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
				return EMPTY_MESSAGE_EDEFAULT == null ? emptyMessage != null : !EMPTY_MESSAGE_EDEFAULT.equals(emptyMessage);
			case WebuiPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
				return omitFieldLabels != OMIT_FIELD_LABELS_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
				return defaultPaginationSize != DEFAULT_PAGINATION_SIZE_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
				return maximumPaginationSize != MAXIMUM_PAGINATION_SIZE_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT:
				return paginationControlPlacement != PAGINATION_CONTROL_PLACEMENT_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__NEXT_NPAGES:
				return nextNpages != NEXT_NPAGES_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
				return previousNpages != PREVIOUS_NPAGES_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
				return NEXT_PAGE_LABEL_EDEFAULT == null ? nextPageLabel != null : !NEXT_PAGE_LABEL_EDEFAULT.equals(nextPageLabel);
			case WebuiPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME:
				return NEXT_PAGE_ICON_NAME_EDEFAULT == null ? nextPageIconName != null : !NEXT_PAGE_ICON_NAME_EDEFAULT.equals(nextPageIconName);
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
				return PREVIOUS_PAGE_LABEL_EDEFAULT == null ? previousPageLabel != null : !PREVIOUS_PAGE_LABEL_EDEFAULT.equals(previousPageLabel);
			case WebuiPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME:
				return PREVIOUS_PAGE_ICON_NAME_EDEFAULT == null ? previousPageIconName != null : !PREVIOUS_PAGE_ICON_NAME_EDEFAULT.equals(previousPageIconName);
			case WebuiPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
				return useDisabledPageLinks != USE_DISABLED_PAGE_LINKS_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return useFirstLastPageLinks != USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
				return FIRST_PAGE_LABEL_EDEFAULT == null ? firstPageLabel != null : !FIRST_PAGE_LABEL_EDEFAULT.equals(firstPageLabel);
			case WebuiPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME:
				return FIRST_PAGE_ICON_NAME_EDEFAULT == null ? firstPageIconName != null : !FIRST_PAGE_ICON_NAME_EDEFAULT.equals(firstPageIconName);
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
				return LAST_PAGE_LABEL_EDEFAULT == null ? lastPageLabel != null : !LAST_PAGE_LABEL_EDEFAULT.equals(lastPageLabel);
			case WebuiPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME:
				return LAST_PAGE_ICON_NAME_EDEFAULT == null ? lastPageIconName != null : !LAST_PAGE_ICON_NAME_EDEFAULT.equals(lastPageIconName);
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_CLASS:
				return PAGINATION_CLASS_EDEFAULT == null ? paginationClass != null : !PAGINATION_CLASS_EDEFAULT.equals(paginationClass);
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS:
				return PAGINATION_ELEMENT_CLASS_EDEFAULT == null ? paginationElementClass != null : !PAGINATION_ELEMENT_CLASS_EDEFAULT.equals(paginationElementClass);
			case WebuiPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS:
				return PAGINATION_ANCHOR_CLASS_EDEFAULT == null ? paginationAnchorClass != null : !PAGINATION_ANCHOR_CLASS_EDEFAULT.equals(paginationAnchorClass);
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
		result.append(" (truncateElementTitle: ");
		result.append(truncateElementTitle);
		result.append(", omitContainerLoad: ");
		result.append(omitContainerLoad);
		result.append(", emptyMessage: ");
		result.append(emptyMessage);
		result.append(", omitFieldLabels: ");
		result.append(omitFieldLabels);
		result.append(", defaultPaginationSize: ");
		result.append(defaultPaginationSize);
		result.append(", maximumPaginationSize: ");
		result.append(maximumPaginationSize);
		result.append(", paginationControlPlacement: ");
		result.append(paginationControlPlacement);
		result.append(", nextNpages: ");
		result.append(nextNpages);
		result.append(", previousNpages: ");
		result.append(previousNpages);
		result.append(", nextPageLabel: ");
		result.append(nextPageLabel);
		result.append(", nextPageIconName: ");
		result.append(nextPageIconName);
		result.append(", previousPageLabel: ");
		result.append(previousPageLabel);
		result.append(", previousPageIconName: ");
		result.append(previousPageIconName);
		result.append(", useDisabledPageLinks: ");
		result.append(useDisabledPageLinks);
		result.append(", useFirstLastPageLinks: ");
		result.append(useFirstLastPageLinks);
		result.append(", firstPageLabel: ");
		result.append(firstPageLabel);
		result.append(", firstPageIconName: ");
		result.append(firstPageIconName);
		result.append(", lastPageLabel: ");
		result.append(lastPageLabel);
		result.append(", lastPageIconName: ");
		result.append(lastPageIconName);
		result.append(", paginationClass: ");
		result.append(paginationClass);
		result.append(", paginationElementClass: ");
		result.append(paginationElementClass);
		result.append(", paginationAnchorClass: ");
		result.append(paginationAnchorClass);
		result.append(')');
		return result.toString();
	}

} //CollectionUnitImpl
