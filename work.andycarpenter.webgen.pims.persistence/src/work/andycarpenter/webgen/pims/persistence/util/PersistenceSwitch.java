/**
 */
package work.andycarpenter.webgen.pims.persistence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import work.andycarpenter.webgen.pims.base.Classifier;
import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.base.NamedElement;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.persistence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage
 * @generated
 */
public class PersistenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PersistencePackage.PERSISTENCE: {
				Persistence persistence = (Persistence)theEObject;
				T result = casePersistence(persistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.SERIALIZATION_GROUP: {
				SerializationGroup serializationGroup = (SerializationGroup)theEObject;
				T result = caseSerializationGroup(serializationGroup);
				if (result == null) result = caseNamedElement(serializationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseNamedDisplayElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseLabel(attribute);
				if (result == null) result = caseNamedDisplayElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseFeature(association);
				if (result == null) result = caseNamedDisplayElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASSOCIATION_REFERENCE: {
				AssociationReference associationReference = (AssociationReference)theEObject;
				T result = caseAssociationReference(associationReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.FEATURE_CHILD_PATH: {
				FeatureChildPath featureChildPath = (FeatureChildPath)theEObject;
				T result = caseFeatureChildPath(featureChildPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.MODEL_LABEL: {
				ModelLabel modelLabel = (ModelLabel)theEObject;
				T result = caseModelLabel(modelLabel);
				if (result == null) result = caseNamedElement(modelLabel);
				if (result == null) result = caseLabel(modelLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.MODEL_LABEL_FEATURE: {
				ModelLabelFeature modelLabelFeature = (ModelLabelFeature)theEObject;
				T result = caseModelLabelFeature(modelLabelFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.MODEL_LABEL_ATTRIBUTE: {
				ModelLabelAttribute modelLabelAttribute = (ModelLabelAttribute)theEObject;
				T result = caseModelLabelAttribute(modelLabelAttribute);
				if (result == null) result = caseModelLabelFeature(modelLabelAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.MODEL_LABEL_ASSOCIATION: {
				ModelLabelAssociation modelLabelAssociation = (ModelLabelAssociation)theEObject;
				T result = caseModelLabelAssociation(modelLabelAssociation);
				if (result == null) result = caseModelLabelFeature(modelLabelAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseClassifier(entity);
				if (result == null) result = caseNamedDisplayElement(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.DATA_TYPE_ATTRIBUTE: {
				DataTypeAttribute dataTypeAttribute = (DataTypeAttribute)theEObject;
				T result = caseDataTypeAttribute(dataTypeAttribute);
				if (result == null) result = caseAttribute(dataTypeAttribute);
				if (result == null) result = caseFeature(dataTypeAttribute);
				if (result == null) result = caseLabel(dataTypeAttribute);
				if (result == null) result = caseNamedDisplayElement(dataTypeAttribute);
				if (result == null) result = caseNamedElement(dataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.DATE_ATTRIBUTE: {
				DateAttribute dateAttribute = (DateAttribute)theEObject;
				T result = caseDateAttribute(dateAttribute);
				if (result == null) result = caseAttribute(dateAttribute);
				if (result == null) result = caseFeature(dateAttribute);
				if (result == null) result = caseLabel(dateAttribute);
				if (result == null) result = caseNamedDisplayElement(dateAttribute);
				if (result == null) result = caseNamedElement(dateAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.URL_ATTRIBUTE: {
				UrlAttribute urlAttribute = (UrlAttribute)theEObject;
				T result = caseUrlAttribute(urlAttribute);
				if (result == null) result = caseAttribute(urlAttribute);
				if (result == null) result = caseFeature(urlAttribute);
				if (result == null) result = caseLabel(urlAttribute);
				if (result == null) result = caseNamedDisplayElement(urlAttribute);
				if (result == null) result = caseNamedElement(urlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.RESOURCE_ATTRIBUTE: {
				ResourceAttribute resourceAttribute = (ResourceAttribute)theEObject;
				T result = caseResourceAttribute(resourceAttribute);
				if (result == null) result = caseAttribute(resourceAttribute);
				if (result == null) result = caseFeature(resourceAttribute);
				if (result == null) result = caseLabel(resourceAttribute);
				if (result == null) result = caseNamedDisplayElement(resourceAttribute);
				if (result == null) result = caseNamedElement(resourceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.PATH_ELEMENT: {
				PathElement pathElement = (PathElement)theEObject;
				T result = casePathElement(pathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.STATIC_PATH_ELEMENT: {
				StaticPathElement staticPathElement = (StaticPathElement)theEObject;
				T result = caseStaticPathElement(staticPathElement);
				if (result == null) result = casePathElement(staticPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.DATE_PATH_ELEMENT: {
				DatePathElement datePathElement = (DatePathElement)theEObject;
				T result = caseDatePathElement(datePathElement);
				if (result == null) result = casePathElement(datePathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.FILE_ATTRIBUTE: {
				FileAttribute fileAttribute = (FileAttribute)theEObject;
				T result = caseFileAttribute(fileAttribute);
				if (result == null) result = caseResourceAttribute(fileAttribute);
				if (result == null) result = caseAttribute(fileAttribute);
				if (result == null) result = caseFeature(fileAttribute);
				if (result == null) result = caseLabel(fileAttribute);
				if (result == null) result = caseNamedDisplayElement(fileAttribute);
				if (result == null) result = caseNamedElement(fileAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.IMAGE_ATTRIBUTE: {
				ImageAttribute imageAttribute = (ImageAttribute)theEObject;
				T result = caseImageAttribute(imageAttribute);
				if (result == null) result = caseResourceAttribute(imageAttribute);
				if (result == null) result = caseAttribute(imageAttribute);
				if (result == null) result = caseFeature(imageAttribute);
				if (result == null) result = caseLabel(imageAttribute);
				if (result == null) result = caseNamedDisplayElement(imageAttribute);
				if (result == null) result = caseNamedElement(imageAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.LOCATION_ATTRIBUTE: {
				LocationAttribute locationAttribute = (LocationAttribute)theEObject;
				T result = caseLocationAttribute(locationAttribute);
				if (result == null) result = caseAttribute(locationAttribute);
				if (result == null) result = caseFeature(locationAttribute);
				if (result == null) result = caseLabel(locationAttribute);
				if (result == null) result = caseNamedDisplayElement(locationAttribute);
				if (result == null) result = caseNamedElement(locationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASSOCIATION_WITHOUT_CONTAINMENT: {
				AssociationWithoutContainment associationWithoutContainment = (AssociationWithoutContainment)theEObject;
				T result = caseAssociationWithoutContainment(associationWithoutContainment);
				if (result == null) result = caseAssociation(associationWithoutContainment);
				if (result == null) result = caseFeature(associationWithoutContainment);
				if (result == null) result = caseNamedDisplayElement(associationWithoutContainment);
				if (result == null) result = caseNamedElement(associationWithoutContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASSOCIATION_WITH_CONTAINMENT: {
				AssociationWithContainment associationWithContainment = (AssociationWithContainment)theEObject;
				T result = caseAssociationWithContainment(associationWithContainment);
				if (result == null) result = caseAssociation(associationWithContainment);
				if (result == null) result = caseFeature(associationWithContainment);
				if (result == null) result = caseNamedDisplayElement(associationWithContainment);
				if (result == null) result = caseNamedElement(associationWithContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASSOCIATION_KEY: {
				AssociationKey associationKey = (AssociationKey)theEObject;
				T result = caseAssociationKey(associationKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedElement(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.SELECTION: {
				Selection selection = (Selection)theEObject;
				T result = caseSelection(selection);
				if (result == null) result = caseNamedElement(selection);
				if (result == null) result = caseFormalParameterList(selection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.ASC: {
				Asc asc = (Asc)theEObject;
				T result = caseAsc(asc);
				if (result == null) result = caseOrder(asc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.DESC: {
				Desc desc = (Desc)theEObject;
				T result = caseDesc(desc);
				if (result == null) result = caseOrder(desc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T result = caseFilter(filter);
				if (result == null) result = caseNamedDisplayElement(filter);
				if (result == null) result = caseFormalParameterList(filter);
				if (result == null) result = caseNamedElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.REPOSITORY_FEATURE_REFERENCE: {
				RepositoryFeatureReference repositoryFeatureReference = (RepositoryFeatureReference)theEObject;
				T result = caseRepositoryFeatureReference(repositoryFeatureReference);
				if (result == null) result = caseVariable(repositoryFeatureReference);
				if (result == null) result = caseExpression(repositoryFeatureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistence(Persistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialization Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialization Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializationGroup(SerializationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationReference(AssociationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Child Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Child Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureChildPath(FeatureChildPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabel(ModelLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelFeature(ModelLabelFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelAttribute(ModelLabelAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Label Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Label Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLabelAssociation(ModelLabelAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeAttribute(DataTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateAttribute(DateAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlAttribute(UrlAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAttribute(ResourceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElement(PathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticPathElement(StaticPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePathElement(DatePathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAttribute(FileAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAttribute(ImageAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationAttribute(LocationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Without Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationWithoutContainment(AssociationWithoutContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association With Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association With Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationWithContainment(AssociationWithContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationKey(AssociationKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelection(Selection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsc(Asc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesc(Desc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryFeatureReference(RepositoryFeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Display Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDisplayElement(NamedDisplayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterList(FormalParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PersistenceSwitch
