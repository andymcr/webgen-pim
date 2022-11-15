/**
 */
package work.andycarpenter.webgen.pims.persistence.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import work.andycarpenter.webgen.pims.base.BasePackage;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.persistence.Asc;
import work.andycarpenter.webgen.pims.persistence.Association;
import work.andycarpenter.webgen.pims.persistence.AssociationKey;
import work.andycarpenter.webgen.pims.persistence.AssociationReference;
import work.andycarpenter.webgen.pims.persistence.AssociationWithContainment;
import work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment;
import work.andycarpenter.webgen.pims.persistence.Attribute;
import work.andycarpenter.webgen.pims.persistence.Cardinality;
import work.andycarpenter.webgen.pims.persistence.DataTypeAttribute;
import work.andycarpenter.webgen.pims.persistence.DatabaseTechnologies;
import work.andycarpenter.webgen.pims.persistence.DateAttribute;
import work.andycarpenter.webgen.pims.persistence.DateDetails;
import work.andycarpenter.webgen.pims.persistence.DatePathElement;
import work.andycarpenter.webgen.pims.persistence.Desc;
import work.andycarpenter.webgen.pims.persistence.Entity;
import work.andycarpenter.webgen.pims.persistence.Feature;
import work.andycarpenter.webgen.pims.persistence.FeatureChildPath;
import work.andycarpenter.webgen.pims.persistence.FileAttribute;
import work.andycarpenter.webgen.pims.persistence.Filter;
import work.andycarpenter.webgen.pims.persistence.ImageAttribute;
import work.andycarpenter.webgen.pims.persistence.Label;
import work.andycarpenter.webgen.pims.persistence.LocationAttribute;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation;
import work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute;
import work.andycarpenter.webgen.pims.persistence.ModelLabelFeature;
import work.andycarpenter.webgen.pims.persistence.Order;
import work.andycarpenter.webgen.pims.persistence.OrmTechnologies;
import work.andycarpenter.webgen.pims.persistence.PathElement;
import work.andycarpenter.webgen.pims.persistence.Persistence;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.PersistencePackage;
import work.andycarpenter.webgen.pims.persistence.Repository;
import work.andycarpenter.webgen.pims.persistence.RepositoryFeatureReference;
import work.andycarpenter.webgen.pims.persistence.ResourceAttribute;
import work.andycarpenter.webgen.pims.persistence.Selection;
import work.andycarpenter.webgen.pims.persistence.SerializationGroup;
import work.andycarpenter.webgen.pims.persistence.StaticPathElement;
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
	private EClass associationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureChildPathEClass = null;

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
	private EClass resourceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageAttributeEClass = null;

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
	private EClass repositoryFeatureReferenceEClass = null;

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
	public EClass getAssociationReference() {
		return associationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationReference_Name() {
		return (EAttribute)associationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationReference_Association() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationReference_ValueDisplay() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationReference_ChildFeature() {
		return (EReference)associationReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureChildPath() {
		return featureChildPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureChildPath_PartOf() {
		return (EReference)featureChildPathEClass.getEStructuralFeatures().get(0);
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
	public EReference getModelLabelAttribute_Attribute() {
		return (EReference)modelLabelAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelLabelAttribute_DateFormat() {
		return (EAttribute)modelLabelAttributeEClass.getEStructuralFeatures().get(1);
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
	public EReference getModelLabelAssociation_Association() {
		return (EReference)modelLabelAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelLabelAssociation_ValueDisplay() {
		return (EReference)modelLabelAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelLabelAssociation_IsSourceAssociation() {
		return (EAttribute)modelLabelAssociationEClass.getEStructuralFeatures().get(2);
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
	public EClass getResourceAttribute() {
		return resourceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAttribute_MaximumUploadSize() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAttribute_ValidUploadMimeTypes() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAttribute_ValidUploadExtensions() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceAttribute_UploadsWithinWebsite() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceAttribute_UploadPath() {
		return (EReference)resourceAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathElement() {
		return pathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticPathElement() {
		return staticPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaticPathElement_Element() {
		return (EAttribute)staticPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatePathElement() {
		return datePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatePathElement_Format() {
		return (EAttribute)datePathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileAttribute() {
		return fileAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageAttribute() {
		return imageAttributeEClass;
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
	public EReference getSelection_PathType() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelection_Filters() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelection_MethodName() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(11);
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
	public EReference getOrder_Path() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
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
	public EClass getRepositoryFeatureReference() {
		return repositoryFeatureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryFeatureReference_Name() {
		return (EAttribute)repositoryFeatureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepositoryFeatureReference_Feature() {
		return (EReference)repositoryFeatureReferenceEClass.getEStructuralFeatures().get(1);
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

		associationReferenceEClass = createEClass(ASSOCIATION_REFERENCE);
		createEAttribute(associationReferenceEClass, ASSOCIATION_REFERENCE__NAME);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__ASSOCIATION);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__VALUE_DISPLAY);
		createEReference(associationReferenceEClass, ASSOCIATION_REFERENCE__CHILD_FEATURE);

		featureChildPathEClass = createEClass(FEATURE_CHILD_PATH);
		createEReference(featureChildPathEClass, FEATURE_CHILD_PATH__PART_OF);

		labelEClass = createEClass(LABEL);

		modelLabelEClass = createEClass(MODEL_LABEL);
		createEReference(modelLabelEClass, MODEL_LABEL__LABEL_FOR);
		createEAttribute(modelLabelEClass, MODEL_LABEL__FORMAT);
		createEAttribute(modelLabelEClass, MODEL_LABEL__CUSTOMISE);
		createEReference(modelLabelEClass, MODEL_LABEL__FEATURES);
		createEReference(modelLabelEClass, MODEL_LABEL__SERIALIZATION_GROUPS);

		modelLabelFeatureEClass = createEClass(MODEL_LABEL_FEATURE);
		createEReference(modelLabelFeatureEClass, MODEL_LABEL_FEATURE__PART_OF);

		modelLabelAttributeEClass = createEClass(MODEL_LABEL_ATTRIBUTE);
		createEReference(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE__ATTRIBUTE);
		createEAttribute(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE__DATE_FORMAT);

		modelLabelAssociationEClass = createEClass(MODEL_LABEL_ASSOCIATION);
		createEReference(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__ASSOCIATION);
		createEReference(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__VALUE_DISPLAY);
		createEAttribute(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION);

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

		resourceAttributeEClass = createEClass(RESOURCE_ATTRIBUTE);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE);
		createEReference(resourceAttributeEClass, RESOURCE_ATTRIBUTE__UPLOAD_PATH);

		pathElementEClass = createEClass(PATH_ELEMENT);

		staticPathElementEClass = createEClass(STATIC_PATH_ELEMENT);
		createEAttribute(staticPathElementEClass, STATIC_PATH_ELEMENT__ELEMENT);

		datePathElementEClass = createEClass(DATE_PATH_ELEMENT);
		createEAttribute(datePathElementEClass, DATE_PATH_ELEMENT__FORMAT);

		fileAttributeEClass = createEClass(FILE_ATTRIBUTE);

		imageAttributeEClass = createEClass(IMAGE_ATTRIBUTE);

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
		createEReference(selectionEClass, SELECTION__PATH_TYPE);
		createEReference(selectionEClass, SELECTION__FILTERS);
		createEAttribute(selectionEClass, SELECTION__METHOD_NAME);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__PATH);

		ascEClass = createEClass(ASC);

		descEClass = createEClass(DESC);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__SELECTION);
		createEReference(filterEClass, FILTER__CONDITION);
		createEAttribute(filterEClass, FILTER__METHOD_NAME);

		repositoryFeatureReferenceEClass = createEClass(REPOSITORY_FEATURE_REFERENCE);
		createEAttribute(repositoryFeatureReferenceEClass, REPOSITORY_FEATURE_REFERENCE__NAME);
		createEReference(repositoryFeatureReferenceEClass, REPOSITORY_FEATURE_REFERENCE__FEATURE);

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
		modelLabelEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		modelLabelEClass.getESuperTypes().add(this.getLabel());
		modelLabelAttributeEClass.getESuperTypes().add(this.getModelLabelFeature());
		modelLabelAssociationEClass.getESuperTypes().add(this.getModelLabelFeature());
		dataTypeAttributeEClass.getESuperTypes().add(this.getAttribute());
		dateAttributeEClass.getESuperTypes().add(this.getAttribute());
		urlAttributeEClass.getESuperTypes().add(this.getAttribute());
		resourceAttributeEClass.getESuperTypes().add(this.getAttribute());
		staticPathElementEClass.getESuperTypes().add(this.getPathElement());
		datePathElementEClass.getESuperTypes().add(this.getPathElement());
		fileAttributeEClass.getESuperTypes().add(this.getResourceAttribute());
		imageAttributeEClass.getESuperTypes().add(this.getResourceAttribute());
		locationAttributeEClass.getESuperTypes().add(this.getAttribute());
		associationWithoutContainmentEClass.getESuperTypes().add(this.getAssociation());
		associationWithContainmentEClass.getESuperTypes().add(this.getAssociation());
		repositoryEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		selectionEClass.getESuperTypes().add(theBasePackage.getNamedElement());
		selectionEClass.getESuperTypes().add(theBasePackage.getFormalParameterList());
		ascEClass.getESuperTypes().add(this.getOrder());
		descEClass.getESuperTypes().add(this.getOrder());
		filterEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		filterEClass.getESuperTypes().add(theBasePackage.getFormalParameterList());
		repositoryFeatureReferenceEClass.getESuperTypes().add(theExpressionPackage.getVariable());

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

		initEClass(associationReferenceEClass, AssociationReference.class, "AssociationReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_Association(), this.getAssociation(), null, "association", null, 1, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_ValueDisplay(), this.getModelLabel(), null, "valueDisplay", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationReference_ChildFeature(), this.getFeatureChildPath(), this.getFeatureChildPath_PartOf(), "childFeature", null, 0, 1, AssociationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureChildPathEClass, FeatureChildPath.class, "FeatureChildPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureChildPath_PartOf(), this.getAssociationReference(), this.getAssociationReference_ChildFeature(), "partOf", null, 0, 1, FeatureChildPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelLabelEClass, ModelLabel.class, "ModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabel_LabelFor(), this.getEntity(), this.getEntity_Labels(), "labelFor", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabel_Format(), ecorePackage.getEString(), "format", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabel_Customise(), ecorePackage.getEBoolean(), "customise", "false", 0, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabel_Features(), this.getModelLabelFeature(), this.getModelLabelFeature_PartOf(), "features", null, 0, -1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabel_SerializationGroups(), this.getSerializationGroup(), null, "serializationGroups", null, 0, -1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelFeatureEClass, ModelLabelFeature.class, "ModelLabelFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelFeature_PartOf(), this.getModelLabel(), this.getModelLabel_Features(), "partOf", null, 1, 1, ModelLabelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelAttributeEClass, ModelLabelAttribute.class, "ModelLabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, ModelLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabelAttribute_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, ModelLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelLabelAssociationEClass, ModelLabelAssociation.class, "ModelLabelAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelAssociation_Association(), this.getAssociation(), null, "association", null, 1, 1, ModelLabelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabelAssociation_ValueDisplay(), this.getModelLabel(), null, "valueDisplay", null, 0, 1, ModelLabelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabelAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, ModelLabelAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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

		initEClass(resourceAttributeEClass, ResourceAttribute.class, "ResourceAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAttribute_MaximumUploadSize(), ecorePackage.getEInt(), "maximumUploadSize", "-1", 0, 1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_ValidUploadMimeTypes(), ecorePackage.getEString(), "validUploadMimeTypes", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_ValidUploadExtensions(), ecorePackage.getEString(), "validUploadExtensions", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_UploadsWithinWebsite(), ecorePackage.getEBoolean(), "uploadsWithinWebsite", null, 0, 1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceAttribute_UploadPath(), this.getPathElement(), null, "uploadPath", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathElementEClass, PathElement.class, "PathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticPathElementEClass, StaticPathElement.class, "StaticPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticPathElement_Element(), ecorePackage.getEString(), "element", null, 1, 1, StaticPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datePathElementEClass, DatePathElement.class, "DatePathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePathElement_Format(), ecorePackage.getEString(), "format", null, 1, 1, DatePathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileAttributeEClass, FileAttribute.class, "FileAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageAttributeEClass, ImageAttribute.class, "ImageAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEReference(getSelection_Ordering(), this.getOrder(), null, "ordering", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Limit(), ecorePackage.getEInt(), "limit", "0", 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Grouping(), this.getFeature(), null, "grouping", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_SelectPath(), this.getAssociation(), null, "selectPath", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_PathType(), this.getEntity(), null, "pathType", null, 0, 1, Selection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Filters(), this.getFilter(), this.getFilter_Selection(), "filters", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Path(), theExpressionPackage.getVariable(), null, "path", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ascEClass, Asc.class, "Asc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descEClass, Desc.class, "Desc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Selection(), this.getSelection(), this.getSelection_Filters(), "selection", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_Condition(), theExpressionPackage.getPredicate(), null, "condition", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryFeatureReferenceEClass, RepositoryFeatureReference.class, "RepositoryFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryFeatureReference_Name(), ecorePackage.getEString(), "name", null, 1, 1, RepositoryFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositoryFeatureReference_Feature(), this.getFeature(), null, "feature", null, 1, 1, RepositoryFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "derivation", "allFeatures->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()"
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
		  (getAssociationReference_Name(),
		   source,
		   new String[] {
			   "derivation", "if association.oclIsUndefined() then\n\t\'\'\nelse\n\tassociation.name\nendif"
		   });
		addAnnotation
		  (getModelLabelAssociation_IsSourceAssociation(),
		   source,
		   new String[] {
			   "derivation", "not association.oclIsUndefined() implies\n\tpartOf.labelFor.features->includes(association)"
		   });
		addAnnotation
		  (associationWithoutContainmentEClass,
		   source,
		   new String[] {
			   "oneToManyAssociationsMustBeBidirectional", "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional"
		   });
		addAnnotation
		  (getSelection_PathType(),
		   source,
		   new String[] {
			   "derivation", "if selectPath->isEmpty() then\n\tnull\nelse if selectPath->size() = 1 then\n\tif selectPath->first().partOf = self.definedBy.serves then\n\t\tselectPath->first().targetEntity\n\telse\n\t\tselectPath->first().partOf\n\tendif\nelse\n\tselectPath->subOrderedSet(2, selectPath->size() )\n\t\t->iterate(a; result : Entity = if selectPath->first().partOf = self.definedBy.serves then\n\t\t\t\t\t\tselectPath->first().targetEntity\n\t\t\t\t\telse\n\t\t\t\t\t\tselectPath->first().partOf\n\t\t\t\t\tendif\n\t\t\t| if a.partOf = result then\n\t\t\t\t\ta.targetEntity\n\t\t\t\telse\n\t\t\t\t\ta.partOf\n\t\t\t\tendif )\nendif endif"
		   });
		addAnnotation
		  (getRepositoryFeatureReference_Name(),
		   source,
		   new String[] {
			   "derivation", "if feature.oclIsUndefined() then\n\t\'\'\nelse\n\tfeature.name\nendif"
		   });
	}

} //PersistencePackageImpl
