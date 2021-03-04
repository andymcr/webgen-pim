/**
 */
package work.andycarpenter.webgen.pims.persistence.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import work.andycarpenter.webgen.pims.base.util.BaseValidator;
import work.andycarpenter.webgen.pims.persistence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage
 * @generated
 */
public class PersistenceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PersistenceValidator INSTANCE = new PersistenceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "work.andycarpenter.webgen.pims.persistence";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseValidator baseValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceValidator() {
		super();
		baseValidator = BaseValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PersistencePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PersistencePackage.PERSISTENCE:
				return validatePersistence((Persistence)value, diagnostics, context);
			case PersistencePackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case PersistencePackage.SERIALIZATION_GROUP:
				return validateSerializationGroup((SerializationGroup)value, diagnostics, context);
			case PersistencePackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case PersistencePackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case PersistencePackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case PersistencePackage.ASSOCIATION_REFERENCE:
				return validateAssociationReference((AssociationReference)value, diagnostics, context);
			case PersistencePackage.FEATURE_CHILD_PATH:
				return validateFeatureChildPath((FeatureChildPath)value, diagnostics, context);
			case PersistencePackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case PersistencePackage.MODEL_LABEL:
				return validateModelLabel((ModelLabel)value, diagnostics, context);
			case PersistencePackage.MODEL_LABEL_FEATURE:
				return validateModelLabelFeature((ModelLabelFeature)value, diagnostics, context);
			case PersistencePackage.MODEL_LABEL_ATTRIBUTE:
				return validateModelLabelAttribute((ModelLabelAttribute)value, diagnostics, context);
			case PersistencePackage.MODEL_LABEL_ASSOCIATION:
				return validateModelLabelAssociation((ModelLabelAssociation)value, diagnostics, context);
			case PersistencePackage.DATA_TYPE_ATTRIBUTE:
				return validateDataTypeAttribute((DataTypeAttribute)value, diagnostics, context);
			case PersistencePackage.DATE_ATTRIBUTE:
				return validateDateAttribute((DateAttribute)value, diagnostics, context);
			case PersistencePackage.URL_ATTRIBUTE:
				return validateUrlAttribute((UrlAttribute)value, diagnostics, context);
			case PersistencePackage.RESOURCE_ATTRIBUTE:
				return validateResourceAttribute((ResourceAttribute)value, diagnostics, context);
			case PersistencePackage.PATH_ELEMENT:
				return validatePathElement((PathElement)value, diagnostics, context);
			case PersistencePackage.STATIC_PATH_ELEMENT:
				return validateStaticPathElement((StaticPathElement)value, diagnostics, context);
			case PersistencePackage.DATE_PATH_ELEMENT:
				return validateDatePathElement((DatePathElement)value, diagnostics, context);
			case PersistencePackage.FILE_ATTRIBUTE:
				return validateFileAttribute((FileAttribute)value, diagnostics, context);
			case PersistencePackage.IMAGE_ATTRIBUTE:
				return validateImageAttribute((ImageAttribute)value, diagnostics, context);
			case PersistencePackage.LOCATION_ATTRIBUTE:
				return validateLocationAttribute((LocationAttribute)value, diagnostics, context);
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT:
				return validateAssociationWithoutContainment((AssociationWithoutContainment)value, diagnostics, context);
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT:
				return validateAssociationWithContainment((AssociationWithContainment)value, diagnostics, context);
			case PersistencePackage.ASSOCIATION_KEY:
				return validateAssociationKey((AssociationKey)value, diagnostics, context);
			case PersistencePackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case PersistencePackage.SELECTION:
				return validateSelection((Selection)value, diagnostics, context);
			case PersistencePackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case PersistencePackage.ASC:
				return validateAsc((Asc)value, diagnostics, context);
			case PersistencePackage.DESC:
				return validateDesc((Desc)value, diagnostics, context);
			case PersistencePackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case PersistencePackage.REPOSITORY_FEATURE_REFERENCE:
				return validateRepositoryFeatureReference((RepositoryFeatureReference)value, diagnostics, context);
			case PersistencePackage.DATABASE_TECHNOLOGIES:
				return validateDatabaseTechnologies((DatabaseTechnologies)value, diagnostics, context);
			case PersistencePackage.ORM_TECHNOLOGIES:
				return validateOrmTechnologies((OrmTechnologies)value, diagnostics, context);
			case PersistencePackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			case PersistencePackage.IS_HAS_CHOICES:
				return validateisHasChoices((isHasChoices)value, diagnostics, context);
			case PersistencePackage.DATE_DETAILS:
				return validateDateDetails((DateDetails)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistence(Persistence persistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persistence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persistence, diagnostics, context);
		if (result || diagnostics != null) result &= validatePersistence_classifierNameUnique(persistence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifierNameUnique constraint of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSISTENCE__CLASSIFIER_NAME_UNIQUE__EEXPRESSION = "dataTypes->isUnique(name) and entities->isUnique(name)";

	/**
	 * Validates the classifierNameUnique constraint of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistence_classifierNameUnique(Persistence persistence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PersistencePackage.Literals.PERSISTENCE,
				 persistence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifierNameUnique",
				 PERSISTENCE__CLASSIFIER_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializationGroup(SerializationGroup serializationGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serializationGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serializationGroup, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(serializationGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(feature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryKeyRequired constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEATURE__PRIMARY_KEY_REQUIRED__EEXPRESSION = "primaryKey implies cardinality <> Cardinality::Optional";

	/**
	 * Validates the primaryKeyRequired constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_primaryKeyRequired(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PersistencePackage.Literals.FEATURE,
				 feature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "primaryKeyRequired",
				 FEATURE__PRIMARY_KEY_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(association, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationReference(AssociationReference associationReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureChildPath(FeatureChildPath featureChildPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureChildPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabel(ModelLabel modelLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelLabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelLabel, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(modelLabel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelFeature(ModelLabelFeature modelLabelFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelAttribute(ModelLabelAttribute modelLabelAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLabelAssociation(ModelLabelAssociation modelLabelAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLabelAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_featureNameUniqueWithinEntity(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_keysFromLocalFeatures(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION = "features->isUnique(f | f.name)";

	/**
	 * Validates the featureNameUniqueWithinEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_featureNameUniqueWithinEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PersistencePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "featureNameUniqueWithinEntity",
				 ENTITY__FEATURE_NAME_UNIQUE_WITHIN_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the keysFromLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION = "allFeatures->includesAll(keys)";

	/**
	 * Validates the keysFromLocalFeatures constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_keysFromLocalFeatures(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PersistencePackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "keysFromLocalFeatures",
				 ENTITY__KEYS_FROM_LOCAL_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeAttribute(DataTypeAttribute dataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dataTypeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(dataTypeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateAttribute(DateAttribute dateAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(dateAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(dateAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlAttribute(UrlAttribute urlAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(urlAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(urlAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(urlAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAttribute(ResourceAttribute resourceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(resourceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(resourceAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathElement(PathElement pathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticPathElement(StaticPathElement staticPathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticPathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePathElement(DatePathElement datePathElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datePathElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileAttribute(FileAttribute fileAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(fileAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(fileAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageAttribute(ImageAttribute imageAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imageAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(imageAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(imageAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationAttribute(LocationAttribute locationAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(locationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(locationAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithoutContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(associationWithoutContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(associationWithoutContainment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION = "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional";

	/**
	 * Validates the oneToManyAssociationsMustBeBidirectional constraint of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithoutContainment_oneToManyAssociationsMustBeBidirectional(AssociationWithoutContainment associationWithoutContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PersistencePackage.Literals.ASSOCIATION_WITHOUT_CONTAINMENT,
				 associationWithoutContainment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "oneToManyAssociationsMustBeBidirectional",
				 ASSOCIATION_WITHOUT_CONTAINMENT__ONE_TO_MANY_ASSOCIATIONS_MUST_BE_BIDIRECTIONAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationWithContainment(AssociationWithContainment associationWithContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationWithContainment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(associationWithContainment, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_primaryKeyRequired(associationWithContainment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationKey(AssociationKey associationKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(repository, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelection(Selection selection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selection, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(selection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsc(Asc asc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesc(Desc desc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(desc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(filter, diagnostics, context);
		if (result || diagnostics != null) result &= baseValidator.validateNamedElement_nameNeedsAtLeastOneCharacter(filter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryFeatureReference(RepositoryFeatureReference repositoryFeatureReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryFeatureReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseTechnologies(DatabaseTechnologies databaseTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrmTechnologies(OrmTechnologies ormTechnologies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateisHasChoices(isHasChoices isHasChoices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateDetails(DateDetails dateDetails, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PersistenceValidator
