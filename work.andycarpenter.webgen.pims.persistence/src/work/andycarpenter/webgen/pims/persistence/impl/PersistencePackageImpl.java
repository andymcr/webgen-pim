/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.persistence.Asc;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.AssociationKey;
import work.andycarpenter.webgen.pims.persistence.AssociationPathElement;
import work.andycarpenter.webgen.pims.persistence.AssociationVariable;
import work.andycarpenter.webgen.pims.persistence.AssociationWithContainment;
import work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.AttributePathElement;
import work.andycarpenter.webgen.pims.persistence.AttributeVariable;
import work.andycarpenter.webgen.pims.persistence.Base64Namer;
import work.andycarpenter.webgen.pims.persistence.Cardinality;
import work.andycarpenter.webgen.pims.persistence.ChildAssociation;
import work.andycarpenter.webgen.pims.persistence.ChildAttribute;
import work.andycarpenter.webgen.pims.persistence.ChildFeature;
import work.andycarpenter.webgen.pims.persistence.ChildResource;
import work.andycarpenter.webgen.pims.persistence.DataTypeAttribute;
import work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies;
import work.andycarpenter.webgen.pims.persistence.DateAttribute;
import work.andycarpenter.webgen.pims.persistence.DateDetails;
import work.andycarpenter.webgen.pims.persistence.DateTimeDirectory;
import work.andycarpenter.webgen.pims.persistence.Desc;
import work.andycarpenter.webgen.pims.persistence.DirectoryNamer;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.FeatureVariable;
import work.andycarpenter.webgen.pims.persistence.FeatureVariableContext;
import work.andycarpenter.webgen.pims.persistence.FileNamer;
import work.andycarpenter.webgen.pims.persistence.FileResource;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.HashNamer;
import work.andycarpenter.webgen.pims.persistence.ImageResource;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.LocationAttribute;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation;
import work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute;
import work.andycarpenter.webgen.pims.persistence.ModelLabelFeature;
import work.andycarpenter.webgen.pims.persistence.Order;
import work.andycarpenter.webgen.pims.persistence.OriginalNamer;
import work.andycarpenter.webgen.pims.persistence.OrmTechnologies;
import work.andycarpenter.webgen.pims.persistence.ParameterVariable;
import work.andycarpenter.webgen.pims.persistence.Path;
import work.andycarpenter.webgen.pims.persistence.PathRoot;
import work.andycarpenter.webgen.pims.persistence.Persistence;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.PropertyDirectory;
import work.andycarpenter.webgen.pims.persistence.PropertyNamer;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.persistence.ResourceFeature;
import work.andycarpenter.webgen.pims.persistence.ResourcePathElement;
import work.andycarpenter.webgen.pims.persistence.ResourceVariable;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.persistence.SelectionPath;
import work.andycarpenter.webgen.pims.persistence.SerializationGroup;
import work.andycarpenter.webgen.pims.persistence.SlugNamer;
import work.andycarpenter.webgen.pims.persistence.SmartUniqueNamer;
import work.andycarpenter.webgen.pims.persistence.SubDirectory;
import work.andycarpenter.webgen.pims.persistence.UniqueIdNamer;
import work.andycarpenter.webgen.pims.persistence.UrlAttribute;
import work.andycarpenter.webgen.pims.persistence.isHasChoices;
import work.andycarpenter.webgen.pims.persistence.util.PersistenceValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistencePackageImpl extends EPackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueIdNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originalNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64NamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartUniqueNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slugNamerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationWithoutContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationWithContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ascEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureVariableContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ormTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isHasChoicesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateDetailsEEnum = null;

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
	 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersistencePackageImpl() {
		super(eNS_URI, PersistenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PersistencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersistencePackage init() {
		if (isInited) return (PersistencePackage)EPackage.Registry.INSTANCE.getEPackage(PersistencePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPersistencePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PersistencePackageImpl thePersistencePackage = registeredPersistencePackage instanceof PersistencePackageImpl ? (PersistencePackageImpl)registeredPersistencePackage : new PersistencePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePersistencePackage.createPackageContents();

		// Initialize created meta-data
		thePersistencePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePersistencePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PersistenceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePersistencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersistencePackage.eNS_URI, thePersistencePackage);
		return thePersistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistence() {
		return persistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistence_SerializationGroups() {
		return (EReference)persistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistence_DataTypes() {
		return (EReference)persistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistence_Entities() {
		return (EReference)persistenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistence_Repositories() {
		return (EReference)persistenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistence_OrmTechnology() {
		return (EAttribute)persistenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistence_DatabaseTechnology() {
		return (EAttribute)persistenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistence_TimestampCreation() {
		return (EAttribute)persistenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistence_TimestampUpdates() {
		return (EAttribute)persistenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSerializationGroup() {
		return serializationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_PartOf() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Cardinality() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Ordered() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_PrimaryKey() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Derived() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_CustomiseSet() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_BooleanIsHasChoice() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Title() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_CollectionOrmAllowAdd() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_CollectionOrmAllowRemove() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_DefaultDisplayValue() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_EmptyDisplayValue() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_EncodeUriKey() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_SingletonName() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_PluralisedName() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_ColumnName() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_SerializationGroups() {
		return (EReference)featureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Hidden() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_ContainerUnique() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_SlugFields() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Unique() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_DefaultValue() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Placeholder() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_ValidationPattern() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Keys() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_TargetEntity() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_Bidirectional() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_Unique() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_PivotTableName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_TargetFeatureName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_TargetPrimaryKey() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_TargetColumnName() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_TargetDisplayLabel() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociation_SerializationMaxDepth() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelLabel() {
		return modelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelLabel_LabelFor() {
		return (EReference)modelLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelLabel_Format() {
		return (EAttribute)modelLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelLabel_Customise() {
		return (EAttribute)modelLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelLabel_Features() {
		return (EReference)modelLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelLabel_SerializationGroups() {
		return (EReference)modelLabelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelLabelFeature() {
		return modelLabelFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelLabelFeature_PartOf() {
		return (EReference)modelLabelFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelLabelAttribute() {
		return modelLabelAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelLabelAttribute_DateFormat() {
		return (EAttribute)modelLabelAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelLabelAttribute__ContextEntity() {
		return modelLabelAttributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelLabelAssociation() {
		return modelLabelAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelLabelAssociation__ContextEntity() {
		return modelLabelAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_SingletonName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_PluralisedName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Keys() {
		return (EReference)entityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Associations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_AssociationEnds() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_AllFeatures() {
		return (EReference)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_AllAssociations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_ContainingAssociation() {
		return (EReference)entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_ContainingType() {
		return (EReference)entityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Labels() {
		return (EReference)entityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Unique() {
		return (EReference)entityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Repository() {
		return (EReference)entityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_TableName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_AutoKeyName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_AutoKeyPersistentType() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_AutoKeyGenerationStrategy() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_ImplementsUserInterface() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_ImplementsResetPasswordInterface() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTypeAttribute() {
		return dataTypeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataTypeAttribute_DataType() {
		return (EReference)dataTypeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeAttribute_ObfuscateFormFields() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeAttribute_CaseInsensitive() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTypeAttribute_Encrypt() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateAttribute() {
		return dateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateAttribute_Details() {
		return (EAttribute)dateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateAttribute_Format() {
		return (EAttribute)dateAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrlAttribute() {
		return urlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUrlAttribute_DisplayValue() {
		return (EAttribute)urlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceFeature() {
		return resourceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceFeature_MaximumUploadSize() {
		return (EAttribute)resourceFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceFeature_ValidUploadMimeTypes() {
		return (EAttribute)resourceFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceFeature_ValidUploadExtensions() {
		return (EAttribute)resourceFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceFeature_UriPrefix() {
		return (EAttribute)resourceFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceFeature_BaseUploadDirectory() {
		return (EAttribute)resourceFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceFeature_DirectoryNamer() {
		return (EReference)resourceFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceFeature_FileNamer() {
		return (EReference)resourceFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectoryNamer() {
		return directoryNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubDirectory() {
		return subDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubDirectory_CharactersPerDirectory() {
		return (EAttribute)subDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubDirectory_DirectoryCount() {
		return (EAttribute)subDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyDirectory() {
		return propertyDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyDirectory_Attribte() {
		return (EReference)propertyDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimeDirectory() {
		return dateTimeDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeDirectory_Format() {
		return (EAttribute)dateTimeDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDateTimeDirectory_Attribute() {
		return (EReference)dateTimeDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileNamer() {
		return fileNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniqueIdNamer() {
		return uniqueIdNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOriginalNamer() {
		return originalNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyNamer() {
		return propertyNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyNamer_Attribute() {
		return (EReference)propertyNamerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashNamer() {
		return hashNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashNamer_Algorithm() {
		return (EAttribute)hashNamerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashNamer_Length() {
		return (EAttribute)hashNamerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64Namer() {
		return base64NamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64Namer_Length() {
		return (EAttribute)base64NamerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmartUniqueNamer() {
		return smartUniqueNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlugNamer() {
		return slugNamerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileResource() {
		return fileResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageResource() {
		return imageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationAttribute() {
		return locationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationWithoutContainment() {
		return associationWithoutContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationWithoutContainment_TargetCardinality() {
		return (EAttribute)associationWithoutContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationWithoutContainment_TargetUnique() {
		return (EAttribute)associationWithoutContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationWithContainment() {
		return associationWithContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationWithContainment_SourceVisible() {
		return (EAttribute)associationWithContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationKey() {
		return associationKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationKey_KeyFor() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationKey_SourceFeature() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationKey_TargetFeature() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_Name() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPath__ContextEntity() {
		return pathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPath__Name() {
		return pathEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationPathElement() {
		return associationPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationPathElement_Association() {
		return (EReference)associationPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationPathElement_ValueDisplay() {
		return (EReference)associationPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationPathElement_AssociationSource() {
		return (EReference)associationPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationPathElement_AssociationTarget() {
		return (EReference)associationPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssociationPathElement__Name() {
		return associationPathElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssociationPathElement__IsSourceAssociation() {
		return associationPathElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssociationPathElement__LeafEntity() {
		return associationPathElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributePathElement() {
		return attributePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributePathElement_Attribute() {
		return (EReference)attributePathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttributePathElement__Name() {
		return attributePathElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourcePathElement() {
		return resourcePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourcePathElement_Resource() {
		return (EReference)resourcePathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourcePathElement__Name() {
		return resourcePathElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathRoot() {
		return pathRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathRoot_ChildFeature() {
		return (EReference)pathRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildFeature() {
		return childFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildFeature_Parent() {
		return (EReference)childFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildAssociation() {
		return childAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getChildAssociation__ContextEntity() {
		return childAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildAttribute() {
		return childAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getChildAttribute__ContextEntity() {
		return childAttributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildResource() {
		return childResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getChildResource__ContextEntity() {
		return childResourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureVariable() {
		return featureVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureVariable_UseContainerAsContext() {
		return (EAttribute)featureVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationVariable() {
		return associationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssociationVariable__IsSourceAssociation() {
		return associationVariableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeVariable() {
		return attributeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceVariable() {
		return resourceVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterVariable() {
		return parameterVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterVariable_Formal() {
		return (EReference)parameterVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterVariable__ContextEntity() {
		return parameterVariableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterVariable__Name() {
		return parameterVariableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Serves() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Selections() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_FindAll() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_FindOne() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_DefinedBy() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_Distinct() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Fields() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Joins() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Condition() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Ordering() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_Limit() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Grouping() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_SelectPath() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Filters() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_MethodName() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelection__ReferencableEntities() {
		return selectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelection__SelectionType() {
		return selectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectionPath() {
		return selectionPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectionPath_Selection() {
		return (EReference)selectionPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSelectionPath__ContextEntity() {
		return selectionPathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_Selection() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_Attribute() {
		return (EReference)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrder__ReferencableEntities() {
		return orderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsc() {
		return ascEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesc() {
		return descEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_Selection() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_Condition() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilter_MethodName() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFilter__ReferencableEntities() {
		return filterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureVariableContext() {
		return featureVariableContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureVariableContext_ReferencableEntities() {
		return (EReference)featureVariableContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureVariableContext__ReferencableEntities() {
		return featureVariableContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatabaseTechnologies() {
		return databaseTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrmTechnologies() {
		return ormTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getisHasChoices() {
		return isHasChoicesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateDetails() {
		return dateDetailsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceFactory getPersistenceFactory() {
		return (PersistenceFactory)getEFactoryInstance();
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
		persistenceEClass = createEClass(PERSISTENCE);
		createEReference(persistenceEClass, PERSISTENCE__SERIALIZATION_GROUPS);
		createEReference(persistenceEClass, PERSISTENCE__DATA_TYPES);
		createEReference(persistenceEClass, PERSISTENCE__ENTITIES);
		createEReference(persistenceEClass, PERSISTENCE__REPOSITORIES);
		createEAttribute(persistenceEClass, PERSISTENCE__ORM_TECHNOLOGY);
		createEAttribute(persistenceEClass, PERSISTENCE__DATABASE_TECHNOLOGY);
		createEAttribute(persistenceEClass, PERSISTENCE__TIMESTAMP_CREATION);
		createEAttribute(persistenceEClass, PERSISTENCE__TIMESTAMP_UPDATES);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__SINGLETON_NAME);
		createEAttribute(entityEClass, ENTITY__PLURALISED_NAME);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__ASSOCIATIONS);
		createEReference(entityEClass, ENTITY__ASSOCIATION_ENDS);
		createEReference(entityEClass, ENTITY__ALL_FEATURES);
		createEReference(entityEClass, ENTITY__ALL_ASSOCIATIONS);
		createEReference(entityEClass, ENTITY__CONTAINING_ASSOCIATION);
		createEReference(entityEClass, ENTITY__CONTAINING_TYPE);
		createEReference(entityEClass, ENTITY__KEYS);
		createEReference(entityEClass, ENTITY__LABELS);
		createEReference(entityEClass, ENTITY__UNIQUE);
		createEReference(entityEClass, ENTITY__REPOSITORY);
		createEAttribute(entityEClass, ENTITY__TABLE_NAME);
		createEAttribute(entityEClass, ENTITY__AUTO_KEY_NAME);
		createEAttribute(entityEClass, ENTITY__AUTO_KEY_PERSISTENT_TYPE);
		createEAttribute(entityEClass, ENTITY__AUTO_KEY_GENERATION_STRATEGY);
		createEAttribute(entityEClass, ENTITY__IMPLEMENTS_USER_INTERFACE);
		createEAttribute(entityEClass, ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE);

		serializationGroupEClass = createEClass(SERIALIZATION_GROUP);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__PART_OF);
		createEAttribute(featureEClass, FEATURE__CARDINALITY);
		createEAttribute(featureEClass, FEATURE__ORDERED);
		createEAttribute(featureEClass, FEATURE__PRIMARY_KEY);
		createEAttribute(featureEClass, FEATURE__DERIVED);
		createEAttribute(featureEClass, FEATURE__CUSTOMISE_SET);
		createEAttribute(featureEClass, FEATURE__BOOLEAN_IS_HAS_CHOICE);
		createEAttribute(featureEClass, FEATURE__TITLE);
		createEAttribute(featureEClass, FEATURE__COLLECTION_ORM_ALLOW_ADD);
		createEAttribute(featureEClass, FEATURE__COLLECTION_ORM_ALLOW_REMOVE);
		createEAttribute(featureEClass, FEATURE__DEFAULT_DISPLAY_VALUE);
		createEAttribute(featureEClass, FEATURE__EMPTY_DISPLAY_VALUE);
		createEAttribute(featureEClass, FEATURE__ENCODE_URI_KEY);
		createEAttribute(featureEClass, FEATURE__SINGLETON_NAME);
		createEAttribute(featureEClass, FEATURE__PLURALISED_NAME);
		createEAttribute(featureEClass, FEATURE__COLUMN_NAME);
		createEReference(featureEClass, FEATURE__SERIALIZATION_GROUPS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__HIDDEN);
		createEAttribute(attributeEClass, ATTRIBUTE__CONTAINER_UNIQUE);
		createEReference(attributeEClass, ATTRIBUTE__SLUG_FIELDS);
		createEAttribute(attributeEClass, ATTRIBUTE__UNIQUE);
		createEReference(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__PLACEHOLDER);
		createEAttribute(attributeEClass, ATTRIBUTE__VALIDATION_PATTERN);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__KEYS);
		createEReference(associationEClass, ASSOCIATION__TARGET_ENTITY);
		createEAttribute(associationEClass, ASSOCIATION__BIDIRECTIONAL);
		createEAttribute(associationEClass, ASSOCIATION__UNIQUE);
		createEAttribute(associationEClass, ASSOCIATION__PIVOT_TABLE_NAME);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_FEATURE_NAME);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_PRIMARY_KEY);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_COLUMN_NAME);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_DISPLAY_LABEL);
		createEAttribute(associationEClass, ASSOCIATION__SERIALIZATION_MAX_DEPTH);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__NAME);
		createEOperation(pathEClass, PATH___CONTEXT_ENTITY);
		createEOperation(pathEClass, PATH___NAME);

		pathRootEClass = createEClass(PATH_ROOT);
		createEReference(pathRootEClass, PATH_ROOT__CHILD_FEATURE);

		associationPathElementEClass = createEClass(ASSOCIATION_PATH_ELEMENT);
		createEReference(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT__ASSOCIATION);
		createEReference(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT__VALUE_DISPLAY);
		createEReference(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT__ASSOCIATION_SOURCE);
		createEReference(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT__ASSOCIATION_TARGET);
		createEOperation(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT___NAME);
		createEOperation(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT___IS_SOURCE_ASSOCIATION);
		createEOperation(associationPathElementEClass, ASSOCIATION_PATH_ELEMENT___LEAF_ENTITY);

		attributePathElementEClass = createEClass(ATTRIBUTE_PATH_ELEMENT);
		createEReference(attributePathElementEClass, ATTRIBUTE_PATH_ELEMENT__ATTRIBUTE);
		createEOperation(attributePathElementEClass, ATTRIBUTE_PATH_ELEMENT___NAME);

		resourcePathElementEClass = createEClass(RESOURCE_PATH_ELEMENT);
		createEReference(resourcePathElementEClass, RESOURCE_PATH_ELEMENT__RESOURCE);
		createEOperation(resourcePathElementEClass, RESOURCE_PATH_ELEMENT___NAME);

		childFeatureEClass = createEClass(CHILD_FEATURE);
		createEReference(childFeatureEClass, CHILD_FEATURE__PARENT);

		childAssociationEClass = createEClass(CHILD_ASSOCIATION);
		createEOperation(childAssociationEClass, CHILD_ASSOCIATION___CONTEXT_ENTITY);

		childAttributeEClass = createEClass(CHILD_ATTRIBUTE);
		createEOperation(childAttributeEClass, CHILD_ATTRIBUTE___CONTEXT_ENTITY);

		childResourceEClass = createEClass(CHILD_RESOURCE);
		createEOperation(childResourceEClass, CHILD_RESOURCE___CONTEXT_ENTITY);

		dataTypeAttributeEClass = createEClass(DATA_TYPE_ATTRIBUTE);
		createEReference(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__DATA_TYPE);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__ENCRYPT);

		dateAttributeEClass = createEClass(DATE_ATTRIBUTE);
		createEAttribute(dateAttributeEClass, DATE_ATTRIBUTE__DETAILS);
		createEAttribute(dateAttributeEClass, DATE_ATTRIBUTE__FORMAT);

		urlAttributeEClass = createEClass(URL_ATTRIBUTE);
		createEAttribute(urlAttributeEClass, URL_ATTRIBUTE__DISPLAY_VALUE);

		resourceFeatureEClass = createEClass(RESOURCE_FEATURE);
		createEAttribute(resourceFeatureEClass, RESOURCE_FEATURE__MAXIMUM_UPLOAD_SIZE);
		createEAttribute(resourceFeatureEClass, RESOURCE_FEATURE__VALID_UPLOAD_MIME_TYPES);
		createEAttribute(resourceFeatureEClass, RESOURCE_FEATURE__VALID_UPLOAD_EXTENSIONS);
		createEAttribute(resourceFeatureEClass, RESOURCE_FEATURE__URI_PREFIX);
		createEAttribute(resourceFeatureEClass, RESOURCE_FEATURE__BASE_UPLOAD_DIRECTORY);
		createEReference(resourceFeatureEClass, RESOURCE_FEATURE__DIRECTORY_NAMER);
		createEReference(resourceFeatureEClass, RESOURCE_FEATURE__FILE_NAMER);

		directoryNamerEClass = createEClass(DIRECTORY_NAMER);

		subDirectoryEClass = createEClass(SUB_DIRECTORY);
		createEAttribute(subDirectoryEClass, SUB_DIRECTORY__CHARACTERS_PER_DIRECTORY);
		createEAttribute(subDirectoryEClass, SUB_DIRECTORY__DIRECTORY_COUNT);

		propertyDirectoryEClass = createEClass(PROPERTY_DIRECTORY);
		createEReference(propertyDirectoryEClass, PROPERTY_DIRECTORY__ATTRIBTE);

		dateTimeDirectoryEClass = createEClass(DATE_TIME_DIRECTORY);
		createEAttribute(dateTimeDirectoryEClass, DATE_TIME_DIRECTORY__FORMAT);
		createEReference(dateTimeDirectoryEClass, DATE_TIME_DIRECTORY__ATTRIBUTE);

		fileNamerEClass = createEClass(FILE_NAMER);

		uniqueIdNamerEClass = createEClass(UNIQUE_ID_NAMER);

		originalNamerEClass = createEClass(ORIGINAL_NAMER);

		propertyNamerEClass = createEClass(PROPERTY_NAMER);
		createEReference(propertyNamerEClass, PROPERTY_NAMER__ATTRIBUTE);

		hashNamerEClass = createEClass(HASH_NAMER);
		createEAttribute(hashNamerEClass, HASH_NAMER__ALGORITHM);
		createEAttribute(hashNamerEClass, HASH_NAMER__LENGTH);

		base64NamerEClass = createEClass(BASE64_NAMER);
		createEAttribute(base64NamerEClass, BASE64_NAMER__LENGTH);

		smartUniqueNamerEClass = createEClass(SMART_UNIQUE_NAMER);

		slugNamerEClass = createEClass(SLUG_NAMER);

		fileResourceEClass = createEClass(FILE_RESOURCE);

		imageResourceEClass = createEClass(IMAGE_RESOURCE);

		locationAttributeEClass = createEClass(LOCATION_ATTRIBUTE);

		associationWithoutContainmentEClass = createEClass(ASSOCIATION_WITHOUT_CONTAINMENT);
		createEAttribute(associationWithoutContainmentEClass, ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY);
		createEAttribute(associationWithoutContainmentEClass, ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE);

		associationWithContainmentEClass = createEClass(ASSOCIATION_WITH_CONTAINMENT);
		createEAttribute(associationWithContainmentEClass, ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE);

		associationKeyEClass = createEClass(ASSOCIATION_KEY);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__KEY_FOR);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__SOURCE_FEATURE);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__TARGET_FEATURE);

		labelEClass = createEClass(LABEL);

		modelLabelEClass = createEClass(MODEL_LABEL);
		createEReference(modelLabelEClass, MODEL_LABEL__LABEL_FOR);
		createEAttribute(modelLabelEClass, MODEL_LABEL__FORMAT);
		createEAttribute(modelLabelEClass, MODEL_LABEL__CUSTOMISE);
		createEReference(modelLabelEClass, MODEL_LABEL__FEATURES);
		createEReference(modelLabelEClass, MODEL_LABEL__SERIALIZATION_GROUPS);

		modelLabelFeatureEClass = createEClass(MODEL_LABEL_FEATURE);
		createEReference(modelLabelFeatureEClass, MODEL_LABEL_FEATURE__PART_OF);

		modelLabelAssociationEClass = createEClass(MODEL_LABEL_ASSOCIATION);
		createEOperation(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION___CONTEXT_ENTITY);

		modelLabelAttributeEClass = createEClass(MODEL_LABEL_ATTRIBUTE);
		createEAttribute(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE__DATE_FORMAT);
		createEOperation(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE___CONTEXT_ENTITY);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__SERVES);
		createEReference(repositoryEClass, REPOSITORY__SELECTIONS);
		createEReference(repositoryEClass, REPOSITORY__FIND_ALL);
		createEReference(repositoryEClass, REPOSITORY__FIND_ONE);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__DEFINED_BY);
		createEAttribute(selectionEClass, SELECTION__DISTINCT);
		createEReference(selectionEClass, SELECTION__FIELDS);
		createEReference(selectionEClass, SELECTION__JOINS);
		createEReference(selectionEClass, SELECTION__CONDITION);
		createEReference(selectionEClass, SELECTION__ORDERING);
		createEAttribute(selectionEClass, SELECTION__LIMIT);
		createEReference(selectionEClass, SELECTION__GROUPING);
		createEReference(selectionEClass, SELECTION__SELECT_PATH);
		createEReference(selectionEClass, SELECTION__FILTERS);
		createEAttribute(selectionEClass, SELECTION__METHOD_NAME);
		createEOperation(selectionEClass, SELECTION___REFERENCABLE_ENTITIES);
		createEOperation(selectionEClass, SELECTION___SELECTION_TYPE);

		selectionPathEClass = createEClass(SELECTION_PATH);
		createEReference(selectionPathEClass, SELECTION_PATH__SELECTION);
		createEOperation(selectionPathEClass, SELECTION_PATH___CONTEXT_ENTITY);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__SELECTION);
		createEReference(orderEClass, ORDER__ATTRIBUTE);
		createEOperation(orderEClass, ORDER___REFERENCABLE_ENTITIES);

		ascEClass = createEClass(ASC);

		descEClass = createEClass(DESC);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__SELECTION);
		createEReference(filterEClass, FILTER__CONDITION);
		createEAttribute(filterEClass, FILTER__METHOD_NAME);
		createEOperation(filterEClass, FILTER___REFERENCABLE_ENTITIES);

		featureVariableContextEClass = createEClass(FEATURE_VARIABLE_CONTEXT);
		createEReference(featureVariableContextEClass, FEATURE_VARIABLE_CONTEXT__REFERENCABLE_ENTITIES);
		createEOperation(featureVariableContextEClass, FEATURE_VARIABLE_CONTEXT___REFERENCABLE_ENTITIES);

		featureVariableEClass = createEClass(FEATURE_VARIABLE);
		createEAttribute(featureVariableEClass, FEATURE_VARIABLE__USE_CONTAINER_AS_CONTEXT);

		associationVariableEClass = createEClass(ASSOCIATION_VARIABLE);
		createEOperation(associationVariableEClass, ASSOCIATION_VARIABLE___IS_SOURCE_ASSOCIATION);

		attributeVariableEClass = createEClass(ATTRIBUTE_VARIABLE);

		resourceVariableEClass = createEClass(RESOURCE_VARIABLE);

		parameterVariableEClass = createEClass(PARAMETER_VARIABLE);
		createEReference(parameterVariableEClass, PARAMETER_VARIABLE__FORMAL);
		createEOperation(parameterVariableEClass, PARAMETER_VARIABLE___CONTEXT_ENTITY);
		createEOperation(parameterVariableEClass, PARAMETER_VARIABLE___NAME);

		// Create enums
		databaseTechnologiesEEnum = createEEnum(DATABASE_TECHNOLOGIES);
		ormTechnologiesEEnum = createEEnum(ORM_TECHNOLOGIES);
		cardinalityEEnum = createEEnum(CARDINALITY);
		isHasChoicesEEnum = createEEnum(IS_HAS_CHOICES);
		dateDetailsEEnum = createEEnum(DATE_DETAILS);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(theBasePackage.getClassifier());
		serializationGroupEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		featureEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		attributeEClass.getESuperTypes().add(this.getLabel());
		associationEClass.getESuperTypes().add(this.getFeature());
		pathRootEClass.getESuperTypes().add(this.getPath());
		associationPathElementEClass.getESuperTypes().add(this.getPathRoot());
		attributePathElementEClass.getESuperTypes().add(this.getPath());
		resourcePathElementEClass.getESuperTypes().add(this.getPath());
		childFeatureEClass.getESuperTypes().add(this.getPath());
		childAssociationEClass.getESuperTypes().add(this.getAssociationPathElement());
		childAssociationEClass.getESuperTypes().add(this.getChildFeature());
		childAttributeEClass.getESuperTypes().add(this.getAttributePathElement());
		childAttributeEClass.getESuperTypes().add(this.getChildFeature());
		childResourceEClass.getESuperTypes().add(this.getResourcePathElement());
		childResourceEClass.getESuperTypes().add(this.getChildFeature());
		dataTypeAttributeEClass.getESuperTypes().add(this.getAttribute());
		dateAttributeEClass.getESuperTypes().add(this.getAttribute());
		urlAttributeEClass.getESuperTypes().add(this.getAttribute());
		resourceFeatureEClass.getESuperTypes().add(this.getFeature());
		subDirectoryEClass.getESuperTypes().add(this.getDirectoryNamer());
		propertyDirectoryEClass.getESuperTypes().add(this.getDirectoryNamer());
		dateTimeDirectoryEClass.getESuperTypes().add(this.getDirectoryNamer());
		uniqueIdNamerEClass.getESuperTypes().add(this.getFileNamer());
		originalNamerEClass.getESuperTypes().add(this.getFileNamer());
		propertyNamerEClass.getESuperTypes().add(this.getFileNamer());
		hashNamerEClass.getESuperTypes().add(this.getFileNamer());
		base64NamerEClass.getESuperTypes().add(this.getFileNamer());
		smartUniqueNamerEClass.getESuperTypes().add(this.getFileNamer());
		slugNamerEClass.getESuperTypes().add(this.getFileNamer());
		fileResourceEClass.getESuperTypes().add(this.getResourceFeature());
		imageResourceEClass.getESuperTypes().add(this.getResourceFeature());
		locationAttributeEClass.getESuperTypes().add(this.getAttribute());
		associationWithoutContainmentEClass.getESuperTypes().add(this.getAssociation());
		associationWithContainmentEClass.getESuperTypes().add(this.getAssociation());
		modelLabelEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		modelLabelEClass.getESuperTypes().add(this.getLabel());
		modelLabelAssociationEClass.getESuperTypes().add(this.getAssociationPathElement());
		modelLabelAssociationEClass.getESuperTypes().add(this.getModelLabelFeature());
		modelLabelAttributeEClass.getESuperTypes().add(this.getAttributePathElement());
		modelLabelAttributeEClass.getESuperTypes().add(this.getModelLabelFeature());
		repositoryEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		selectionEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		selectionEClass.getESuperTypes().add(theBasePackage.getFormalParameterList());
		selectionEClass.getESuperTypes().add(this.getFeatureVariableContext());
		selectionPathEClass.getESuperTypes().add(this.getAssociationPathElement());
		orderEClass.getESuperTypes().add(this.getFeatureVariableContext());
		ascEClass.getESuperTypes().add(this.getOrder());
		descEClass.getESuperTypes().add(this.getOrder());
		filterEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		filterEClass.getESuperTypes().add(theBasePackage.getFormalParameterList());
		filterEClass.getESuperTypes().add(this.getFeatureVariableContext());
		featureVariableEClass.getESuperTypes().add(theExpressionPackage.getVariable());
		associationVariableEClass.getESuperTypes().add(this.getAssociationPathElement());
		associationVariableEClass.getESuperTypes().add(this.getFeatureVariable());
		attributeVariableEClass.getESuperTypes().add(this.getAttributePathElement());
		attributeVariableEClass.getESuperTypes().add(this.getFeatureVariable());
		resourceVariableEClass.getESuperTypes().add(this.getResourcePathElement());
		resourceVariableEClass.getESuperTypes().add(this.getFeatureVariable());
		parameterVariableEClass.getESuperTypes().add(this.getPathRoot());
		parameterVariableEClass.getESuperTypes().add(theExpressionPackage.getVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(persistenceEClass, Persistence.class, "Persistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistence_SerializationGroups(), this.getSerializationGroup(), null, "serializationGroups", null, 0, -1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistence_DataTypes(), theBasePackage.getDataType(), null, "dataTypes", null, 0, -1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistence_Entities(), this.getEntity(), null, "entities", null, 0, -1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistence_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistence_OrmTechnology(), this.getOrmTechnologies(), "ormTechnology", "Kohana", 0, 1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistence_DatabaseTechnology(), this.getDatabaseTechnologies(), "databaseTechnology", "MySql", 1, 1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersistence_TimestampCreation(), ecorePackage.getEBoolean(), "timestampCreation", "true", 0, 1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistence_TimestampUpdates(), ecorePackage.getEBoolean(), "timestampUpdates", "true", 0, 1, Persistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_SingletonName(), ecorePackage.getEString(), "singletonName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_PluralisedName(), ecorePackage.getEString(), "pluralisedName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Features(), this.getFeature(), this.getFeature_PartOf(), "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Associations(), this.getAssociation(), null, "associations", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AssociationEnds(), this.getAssociation(), this.getAssociation_TargetEntity(), "associationEnds", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AllFeatures(), this.getFeature(), null, "allFeatures", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AllAssociations(), this.getAssociation(), null, "allAssociations", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ContainingAssociation(), this.getAssociationWithContainment(), null, "containingAssociation", null, 0, 1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ContainingType(), this.getEntity(), null, "containingType", null, 0, 1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Keys(), this.getFeature(), null, "keys", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Labels(), this.getModelLabel(), this.getModelLabel_LabelFor(), "labels", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Unique(), this.getFeature(), null, "unique", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Repository(), this.getRepository(), this.getRepository_Serves(), "repository", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_AutoKeyName(), ecorePackage.getEString(), "autoKeyName", "id", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_AutoKeyPersistentType(), ecorePackage.getEString(), "autoKeyPersistentType", "integer", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_AutoKeyGenerationStrategy(), ecorePackage.getEString(), "autoKeyGenerationStrategy", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_ImplementsUserInterface(), ecorePackage.getEBoolean(), "implementsUserInterface", "false", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_ImplementsResetPasswordInterface(), ecorePackage.getEBoolean(), "implementsResetPasswordInterface", "false", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializationGroupEClass, SerializationGroup.class, "SerializationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_PartOf(), this.getEntity(), this.getEntity_Features(), "partOf", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Cardinality(), this.getCardinality(), "cardinality", "Optional", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Ordered(), ecorePackage.getEBoolean(), "ordered", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Derived(), ecorePackage.getEBoolean(), "derived", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CustomiseSet(), ecorePackage.getEBoolean(), "customiseSet", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_BooleanIsHasChoice(), this.getisHasChoices(), "booleanIsHasChoice", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Title(), ecorePackage.getEString(), "title", "", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CollectionOrmAllowAdd(), ecorePackage.getEBoolean(), "collectionOrmAllowAdd", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CollectionOrmAllowRemove(), ecorePackage.getEBoolean(), "collectionOrmAllowRemove", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DefaultDisplayValue(), ecorePackage.getEString(), "defaultDisplayValue", "", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_EmptyDisplayValue(), ecorePackage.getEString(), "emptyDisplayValue", "", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_EncodeUriKey(), ecorePackage.getEBoolean(), "encodeUriKey", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_SingletonName(), ecorePackage.getEString(), "singletonName", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_PluralisedName(), ecorePackage.getEString(), "pluralisedName", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_SerializationGroups(), this.getSerializationGroup(), null, "serializationGroups", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Hidden(), ecorePackage.getEBoolean(), "hidden", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_ContainerUnique(), ecorePackage.getEBoolean(), "containerUnique", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_SlugFields(), this.getAttribute(), null, "slugFields", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Unique(), ecorePackage.getEBoolean(), "unique", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_DefaultValue(), theExpressionPackage.getExpression(), null, "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_Placeholder(), ecorePackage.getEString(), "placeholder", "", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Keys(), this.getAssociationKey(), this.getAssociationKey_KeyFor(), "keys", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_TargetEntity(), this.getEntity(), this.getEntity_AssociationEnds(), "targetEntity", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Unique(), ecorePackage.getEBoolean(), "unique", "true", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_PivotTableName(), ecorePackage.getEString(), "pivotTableName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetFeatureName(), ecorePackage.getEString(), "targetFeatureName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetPrimaryKey(), ecorePackage.getEBoolean(), "targetPrimaryKey", "false", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetColumnName(), ecorePackage.getEString(), "targetColumnName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetDisplayLabel(), ecorePackage.getEString(), "targetDisplayLabel", "", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SerializationMaxDepth(), ecorePackage.getEInt(), "serializationMaxDepth", "1", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, Path.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getPath__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPath__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pathRootEClass, PathRoot.class, "PathRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathRoot_ChildFeature(), this.getChildFeature(), this.getChildFeature_Parent(), "childFeature", null, 0, 1, PathRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationPathElementEClass, AssociationPathElement.class, "AssociationPathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationPathElement_Association(), this.getAssociation(), null, "association", null, 1, 1, AssociationPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationPathElement_ValueDisplay(), this.getModelLabel(), null, "valueDisplay", null, 0, 1, AssociationPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationPathElement_AssociationSource(), this.getEntity(), null, "associationSource", null, 0, 1, AssociationPathElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationPathElement_AssociationTarget(), this.getEntity(), null, "associationTarget", null, 0, 1, AssociationPathElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAssociationPathElement__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssociationPathElement__IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssociationPathElement__LeafEntity(), this.getEntity(), "leafEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributePathElementEClass, AttributePathElement.class, "AttributePathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributePathElement_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AttributePathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttributePathElement__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourcePathElementEClass, ResourcePathElement.class, "ResourcePathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePathElement_Resource(), this.getResourceFeature(), null, "resource", null, 1, 1, ResourcePathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResourcePathElement__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childFeatureEClass, ChildFeature.class, "ChildFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildFeature_Parent(), this.getPathRoot(), this.getPathRoot_ChildFeature(), "parent", null, 0, 1, ChildFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childAssociationEClass, ChildAssociation.class, "ChildAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getChildAssociation__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childAttributeEClass, ChildAttribute.class, "ChildAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getChildAttribute__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childResourceEClass, ChildResource.class, "ChildResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getChildResource__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTypeAttributeEClass, DataTypeAttribute.class, "DataTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeAttribute_DataType(), theBasePackage.getDataType(), null, "dataType", null, 1, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_CaseInsensitive(), ecorePackage.getEBoolean(), "caseInsensitive", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dateAttributeEClass, DateAttribute.class, "DateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateAttribute_Details(), this.getDateDetails(), "details", "DateOnly", 1, 1, DateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateAttribute_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(urlAttributeEClass, UrlAttribute.class, "UrlAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlAttribute_DisplayValue(), ecorePackage.getEString(), "displayValue", null, 0, 1, UrlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceFeatureEClass, ResourceFeature.class, "ResourceFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceFeature_MaximumUploadSize(), ecorePackage.getEString(), "maximumUploadSize", "0", 0, 1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceFeature_ValidUploadMimeTypes(), ecorePackage.getEString(), "validUploadMimeTypes", null, 0, -1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceFeature_ValidUploadExtensions(), ecorePackage.getEString(), "validUploadExtensions", null, 0, -1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceFeature_UriPrefix(), ecorePackage.getEString(), "uriPrefix", null, 0, 1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceFeature_BaseUploadDirectory(), ecorePackage.getEString(), "baseUploadDirectory", null, 1, 1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFeature_DirectoryNamer(), this.getDirectoryNamer(), null, "directoryNamer", null, 0, 1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFeature_FileNamer(), this.getFileNamer(), null, "fileNamer", null, 1, 1, ResourceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directoryNamerEClass, DirectoryNamer.class, "DirectoryNamer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subDirectoryEClass, SubDirectory.class, "SubDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubDirectory_CharactersPerDirectory(), ecorePackage.getEInt(), "charactersPerDirectory", "2", 0, 1, SubDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubDirectory_DirectoryCount(), ecorePackage.getEInt(), "directoryCount", "1", 0, 1, SubDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyDirectoryEClass, PropertyDirectory.class, "PropertyDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyDirectory_Attribte(), this.getAttribute(), null, "attribte", null, 1, 1, PropertyDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeDirectoryEClass, DateTimeDirectory.class, "DateTimeDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeDirectory_Format(), ecorePackage.getEString(), "format", "Y/m/d", 1, 1, DateTimeDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateTimeDirectory_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, DateTimeDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileNamerEClass, FileNamer.class, "FileNamer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueIdNamerEClass, UniqueIdNamer.class, "UniqueIdNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(originalNamerEClass, OriginalNamer.class, "OriginalNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyNamerEClass, PropertyNamer.class, "PropertyNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyNamer_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, PropertyNamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashNamerEClass, HashNamer.class, "HashNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashNamer_Algorithm(), ecorePackage.getEString(), "algorithm", "sha1", 0, 1, HashNamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHashNamer_Length(), ecorePackage.getEInt(), "length", "0", 1, 1, HashNamer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64NamerEClass, Base64Namer.class, "Base64Namer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Namer_Length(), ecorePackage.getEInt(), "length", "10", 1, 1, Base64Namer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartUniqueNamerEClass, SmartUniqueNamer.class, "SmartUniqueNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slugNamerEClass, SlugNamer.class, "SlugNamer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileResourceEClass, FileResource.class, "FileResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageResourceEClass, ImageResource.class, "ImageResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationAttributeEClass, LocationAttribute.class, "LocationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationWithoutContainmentEClass, AssociationWithoutContainment.class, "AssociationWithoutContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationWithoutContainment_TargetCardinality(), this.getCardinality(), "targetCardinality", "Required", 1, 1, AssociationWithoutContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationWithoutContainment_TargetUnique(), ecorePackage.getEBoolean(), "targetUnique", "true", 1, 1, AssociationWithoutContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationWithContainmentEClass, AssociationWithContainment.class, "AssociationWithContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationWithContainment_SourceVisible(), ecorePackage.getEBoolean(), "sourceVisible", "true", 0, 1, AssociationWithContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationKeyEClass, AssociationKey.class, "AssociationKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationKey_KeyFor(), this.getAssociation(), this.getAssociation_Keys(), "keyFor", null, 1, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationKey_SourceFeature(), this.getFeature(), null, "sourceFeature", null, 1, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationKey_TargetFeature(), this.getFeature(), null, "targetFeature", null, 0, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelLabelEClass, ModelLabel.class, "ModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabel_LabelFor(), this.getEntity(), this.getEntity_Labels(), "labelFor", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabel_Format(), ecorePackage.getEString(), "format", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabel_Customise(), ecorePackage.getEBoolean(), "customise", "false", 0, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabel_Features(), this.getModelLabelFeature(), this.getModelLabelFeature_PartOf(), "features", null, 0, -1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabel_SerializationGroups(), this.getSerializationGroup(), null, "serializationGroups", null, 0, -1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelFeatureEClass, ModelLabelFeature.class, "ModelLabelFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelFeature_PartOf(), this.getModelLabel(), this.getModelLabel_Features(), "partOf", null, 1, 1, ModelLabelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelAssociationEClass, ModelLabelAssociation.class, "ModelLabelAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModelLabelAssociation__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelLabelAttributeEClass, ModelLabelAttribute.class, "ModelLabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelLabelAttribute_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, ModelLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getModelLabelAttribute__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Serves(), this.getEntity(), this.getEntity_Repository(), "serves", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Selections(), this.getSelection(), this.getSelection_DefinedBy(), "selections", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_FindAll(), this.getSelection(), null, "findAll", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_FindOne(), this.getSelection(), null, "findOne", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_DefinedBy(), this.getRepository(), this.getRepository_Selections(), "definedBy", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Fields(), this.getFeature(), null, "fields", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Joins(), this.getAssociation(), null, "joins", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Condition(), theExpressionPackage.getPredicate(), null, "condition", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Ordering(), this.getOrder(), this.getOrder_Selection(), "ordering", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Limit(), ecorePackage.getEInt(), "limit", "0", 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Grouping(), this.getFeature(), null, "grouping", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_SelectPath(), this.getSelectionPath(), this.getSelectionPath_Selection(), "selectPath", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Filters(), this.getFilter(), this.getFilter_Selection(), "filters", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSelection__ReferencableEntities(), this.getEntity(), "referencableEntities", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSelection__SelectionType(), this.getEntity(), "selectionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(selectionPathEClass, SelectionPath.class, "SelectionPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectionPath_Selection(), this.getSelection(), this.getSelection_SelectPath(), "selection", null, 1, 1, SelectionPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSelectionPath__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Selection(), this.getSelection(), this.getSelection_Ordering(), "selection", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Attribute(), this.getAttributeVariable(), null, "attribute", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrder__ReferencableEntities(), this.getEntity(), "referencableEntities", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(ascEClass, Asc.class, "Asc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Selection(), this.getSelection(), this.getSelection_Filters(), "selection", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_Condition(), theExpressionPackage.getPredicate(), null, "condition", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFilter__ReferencableEntities(), this.getEntity(), "referencableEntities", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureVariableContextEClass, FeatureVariableContext.class, "FeatureVariableContext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureVariableContext_ReferencableEntities(), this.getEntity(), null, "referencableEntities", null, 0, -1, FeatureVariableContext.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getFeatureVariableContext__ReferencableEntities(), this.getEntity(), "referencableEntities", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureVariableEClass, FeatureVariable.class, "FeatureVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureVariable_UseContainerAsContext(), ecorePackage.getEBoolean(), "useContainerAsContext", "false", 0, 1, FeatureVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationVariableEClass, AssociationVariable.class, "AssociationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAssociationVariable__IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeVariableEClass, AttributeVariable.class, "AttributeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceVariableEClass, ResourceVariable.class, "ResourceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterVariable_Formal(), theBasePackage.getFormalParameter(), null, "formal", null, 1, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterVariable__ContextEntity(), this.getEntity(), "contextEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterVariable__Name(), ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(databaseTechnologiesEEnum, DatabaseTechnologies.class, "DatabaseTechnologies");
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.MY_SQL);
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.ORACLE);

		initEEnum(ormTechnologiesEEnum, OrmTechnologies.class, "OrmTechnologies");
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.JPA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DATA_MAPPER);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.IDIORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.KOHANA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DOCTRINE_ORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DOCTRINE_ODM);

		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.REQUIRED);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MANY);

		initEEnum(isHasChoicesEEnum, isHasChoices.class, "isHasChoices");
		addEEnumLiteral(isHasChoicesEEnum, isHasChoices.IS_A);
		addEEnumLiteral(isHasChoicesEEnum, isHasChoices.HAS_A);

		initEEnum(dateDetailsEEnum, DateDetails.class, "DateDetails");
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.TIME_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_AND_TIME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (persistenceEClass,
		   source,
		   new String[] {
			   "constraints", "classifierNameUnique"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "constraints", "featureNameUniqueWithinEntity keysFromLocalFeatures"
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "constraints", "primaryKeyRequired"
		   });
		addAnnotation
		  (associationWithoutContainmentEClass,
		   source,
		   new String[] {
			   "constraints", "oneToManyAssociationsMustBeBidirectional"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (persistenceEClass,
		   source,
		   new String[] {
			   "classifierNameUnique", "dataTypes->isUnique(name) and entities->isUnique(name)"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "featureNameUniqueWithinEntity", "features->isUnique(f | f.name)",
			   "keysFromLocalFeatures", "allFeatures->includesAll(keys)"
		   });
		addAnnotation
		  (getEntity_Attributes(),
		   source,
		   new String[] {
			   "derivation", "features->select(f | f.oclIsKindOf(Attribute)).oclAsType(Attribute)->asOrderedSet()"
		   });
		addAnnotation
		  (getEntity_Associations(),
		   source,
		   new String[] {
			   "derivation", "features->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()"
		   });
		addAnnotation
		  (getEntity_AllFeatures(),
		   source,
		   new String[] {
			   "derivation", "features->union(associationEnds->select(e | e.bidirectional))->asOrderedSet()"
		   });
		addAnnotation
		  (getEntity_AllAssociations(),
		   source,
		   new String[] {
			   "derivation", "allFeatures\n\t->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asSet()\n\t->union(associationEnds)->asOrderedSet()"
		   });
		addAnnotation
		  (getEntity_ContainingAssociation(),
		   source,
		   new String[] {
			   "derivation", "associationEnds->any(e | e.oclIsTypeOf(AssociationWithContainment)).oclAsType(AssociationWithContainment)"
		   });
		addAnnotation
		  (getEntity_ContainingType(),
		   source,
		   new String[] {
			   "derivation", "if containingAssociation.oclIsUndefined() then\n\tnull\nelse\n\tcontainingAssociation.partOf\nendif"
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "primaryKeyRequired", "primaryKey implies cardinality <> Cardinality::Optional"
		   });
		addAnnotation
		  (getPath_Name(),
		   source,
		   new String[] {
			   "derivation", "name()"
		   });
		addAnnotation
		  (getAssociationPathElement_AssociationSource(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation() then\n\t\tassociation.partOf\n\telse\n\t\tassociation.targetEntity\n\tendif\nendif"
		   });
		addAnnotation
		  (getAssociationPathElement_AssociationTarget(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\tnull\nelse\n\tif isSourceAssociation() then\n\t\tassociation.targetEntity\n\telse\n\t\tassociation.partOf\n\tendif\nendif"
		   });
		addAnnotation
		  (getAttributePathElement__Name(),
		   source,
		   new String[] {
			   "body", "if attribute.oclIsUndefined() then\n\t\'\'\nelse\n\tattribute.name\nendif"
		   });
		addAnnotation
		  (getResourcePathElement__Name(),
		   source,
		   new String[] {
			   "body", "if resource.oclIsUndefined() then\n\t\'\'\nelse\n\tresource.name\nendif"
		   });
		addAnnotation
		  (associationWithoutContainmentEClass,
		   source,
		   new String[] {
			   "oneToManyAssociationsMustBeBidirectional", "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional"
		   });
		addAnnotation
		  (getSelection__ReferencableEntities(),
		   source,
		   new String[] {
			   "body", "if joins->isEmpty() then\t\n\tOrderedSet{self.definedBy.serves}\nelse\n\tjoins->iterate(\n\t\tj; types : OrderedSet(Entity) = OrderedSet{self.definedBy.serves}\n\t\t| if types->includes(j.partOf) then\n\t\t\t\ttypes->append(j.targetEntity)\n\t\t\telse\n\t\t\t\ttypes->append(j.partOf)\n\t\t\tendif)\nendif"
		   });
		addAnnotation
		  (getOrder__ReferencableEntities(),
		   source,
		   new String[] {
			   "body", "selection.referencableEntities()"
		   });
		addAnnotation
		  (getFilter__ReferencableEntities(),
		   source,
		   new String[] {
			   "body", "selection.referencableEntities()"
		   });
		addAnnotation
		  (getFeatureVariableContext_ReferencableEntities(),
		   source,
		   new String[] {
			   "derivation", "referencableEntities()"
		   });
		addAnnotation
		  (getParameterVariable__Name(),
		   source,
		   new String[] {
			   "derivation", "if formal.oclIsUndefined() then\n\t\'\'\nelse\n\tformal.name\nendif"
		   });
	}

} //PersistencePackageImpl
