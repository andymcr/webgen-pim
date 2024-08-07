/**
 */
package work.andycarpenter.webgen.pims.image.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.image.BackgroundFilter;
import work.andycarpenter.webgen.pims.image.BackgroundPositions;
import work.andycarpenter.webgen.pims.image.Image;
import work.andycarpenter.webgen.pims.image.ImageFactory;
import work.andycarpenter.webgen.pims.image.ImageFilter;
import work.andycarpenter.webgen.pims.image.ImageManipulation;
import work.andycarpenter.webgen.pims.image.ImagePackage;
import work.andycarpenter.webgen.pims.image.ThumbnailFilter;
import work.andycarpenter.webgen.pims.image.ThumbnailModes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagePackageImpl extends EPackageImpl implements ImagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageManipulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thumbnailFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backgroundPositionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thumbnailModesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see work.andycarpenter.webgen.pims.image.ImagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImagePackageImpl() {
		super(eNS_URI, ImageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ImagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImagePackage init() {
		if (isInited) return (ImagePackage)EPackage.Registry.INSTANCE.getEPackage(ImagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImagePackageImpl theImagePackage = registeredImagePackage instanceof ImagePackageImpl ? (ImagePackageImpl)registeredImagePackage : new ImagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImagePackage.createPackageContents();

		// Initialize created meta-data
		theImagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagePackage.eNS_URI, theImagePackage);
		return theImagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImage_Manipulations() {
		return (EReference)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageManipulation() {
		return imageManipulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageManipulation_JpegQuality() {
		return (EAttribute)imageManipulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageManipulation_Filters() {
		return (EReference)imageManipulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackgroundFilter() {
		return backgroundFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundFilter_Color() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundFilter_Width() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundFilter_Height() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundFilter_Position() {
		return (EAttribute)backgroundFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageFilter() {
		return imageFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThumbnailFilter() {
		return thumbnailFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThumbnailFilter_Width() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThumbnailFilter_Height() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThumbnailFilter_Mode() {
		return (EAttribute)thumbnailFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBackgroundPositions() {
		return backgroundPositionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getThumbnailModes() {
		return thumbnailModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageFactory getImageFactory() {
		return (ImageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__MANIPULATIONS);

		imageManipulationEClass = createEClass(IMAGE_MANIPULATION);
		createEAttribute(imageManipulationEClass, IMAGE_MANIPULATION__JPEG_QUALITY);
		createEReference(imageManipulationEClass, IMAGE_MANIPULATION__FILTERS);

		backgroundFilterEClass = createEClass(BACKGROUND_FILTER);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__COLOR);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__WIDTH);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__HEIGHT);
		createEAttribute(backgroundFilterEClass, BACKGROUND_FILTER__POSITION);

		imageFilterEClass = createEClass(IMAGE_FILTER);

		thumbnailFilterEClass = createEClass(THUMBNAIL_FILTER);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__WIDTH);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__HEIGHT);
		createEAttribute(thumbnailFilterEClass, THUMBNAIL_FILTER__MODE);

		// Create enums
		backgroundPositionsEEnum = createEEnum(BACKGROUND_POSITIONS);
		thumbnailModesEEnum = createEEnum(THUMBNAIL_MODES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imageManipulationEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		backgroundFilterEClass.getESuperTypes().add(this.getImageFilter());
		thumbnailFilterEClass.getESuperTypes().add(this.getImageFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_Manipulations(), this.getImageManipulation(), null, "manipulations", null, 0, -1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageManipulationEClass, ImageManipulation.class, "ImageManipulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageManipulation_JpegQuality(), ecorePackage.getEInt(), "jpegQuality", "-1", 0, 1, ImageManipulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageManipulation_Filters(), this.getImageFilter(), null, "filters", null, 0, -1, ImageManipulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundFilterEClass, BackgroundFilter.class, "BackgroundFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackgroundFilter_Color(), ecorePackage.getEString(), "color", "#fff", 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundFilter_Position(), this.getBackgroundPositions(), "position", "Center", 0, 1, BackgroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageFilterEClass, ImageFilter.class, "ImageFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thumbnailFilterEClass, ThumbnailFilter.class, "ThumbnailFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThumbnailFilter_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThumbnailFilter_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThumbnailFilter_Mode(), this.getThumbnailModes(), "mode", null, 0, 1, ThumbnailFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backgroundPositionsEEnum, BackgroundPositions.class, "BackgroundPositions");
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP_LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.TOP_RIGHT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.CENTER);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.RIGHT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM_LEFT);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM);
		addEEnumLiteral(backgroundPositionsEEnum, BackgroundPositions.BOTTOM_RIGHT);

		initEEnum(thumbnailModesEEnum, ThumbnailModes.class, "ThumbnailModes");
		addEEnumLiteral(thumbnailModesEEnum, ThumbnailModes.CROP);
		addEEnumLiteral(thumbnailModesEEnum, ThumbnailModes.RESIZE);

		// Create resource
		createResource(eNS_URI);
	}

} //ImagePackageImpl
