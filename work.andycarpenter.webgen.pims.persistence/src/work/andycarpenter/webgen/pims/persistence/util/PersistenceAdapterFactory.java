/**
 */
package work.andycarpenter.webgen.pims.persistence.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.webgen.pims.base.Classifier;
import work.andycarpenter.webgen.pims.base.FormalParameterList;
import work.andycarpenter.webgen.pims.base.NamedDisplayElement;
import work.andycarpenter.webgen.pims.base.NamedElement;

import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.Variable;
import work.andycarpenter.webgen.pims.persistence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage
 * @generated
 */
public class PersistenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceSwitch<Adapter> modelSwitch =
		new PersistenceSwitch<Adapter>() {
			@Override
			public Adapter casePersistence(Persistence object) {
				return createPersistenceAdapter();
			}
			@Override
			public Adapter caseSerializationGroup(SerializationGroup object) {
				return createSerializationGroupAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAssociationReference(AssociationReference object) {
				return createAssociationReferenceAdapter();
			}
			@Override
			public Adapter caseFeatureChildPath(FeatureChildPath object) {
				return createFeatureChildPathAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseModelLabel(ModelLabel object) {
				return createModelLabelAdapter();
			}
			@Override
			public Adapter caseModelLabelFeature(ModelLabelFeature object) {
				return createModelLabelFeatureAdapter();
			}
			@Override
			public Adapter caseModelLabelAttribute(ModelLabelAttribute object) {
				return createModelLabelAttributeAdapter();
			}
			@Override
			public Adapter caseModelLabelAssociation(ModelLabelAssociation object) {
				return createModelLabelAssociationAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseDataTypeAttribute(DataTypeAttribute object) {
				return createDataTypeAttributeAdapter();
			}
			@Override
			public Adapter caseDateAttribute(DateAttribute object) {
				return createDateAttributeAdapter();
			}
			@Override
			public Adapter caseUrlAttribute(UrlAttribute object) {
				return createUrlAttributeAdapter();
			}
			@Override
			public Adapter caseResourceAttribute(ResourceAttribute object) {
				return createResourceAttributeAdapter();
			}
			@Override
			public Adapter casePathElement(PathElement object) {
				return createPathElementAdapter();
			}
			@Override
			public Adapter caseStaticPathElement(StaticPathElement object) {
				return createStaticPathElementAdapter();
			}
			@Override
			public Adapter caseDatePathElement(DatePathElement object) {
				return createDatePathElementAdapter();
			}
			@Override
			public Adapter caseFileAttribute(FileAttribute object) {
				return createFileAttributeAdapter();
			}
			@Override
			public Adapter caseImageAttribute(ImageAttribute object) {
				return createImageAttributeAdapter();
			}
			@Override
			public Adapter caseLocationAttribute(LocationAttribute object) {
				return createLocationAttributeAdapter();
			}
			@Override
			public Adapter caseAssociationWithoutContainment(AssociationWithoutContainment object) {
				return createAssociationWithoutContainmentAdapter();
			}
			@Override
			public Adapter caseAssociationWithContainment(AssociationWithContainment object) {
				return createAssociationWithContainmentAdapter();
			}
			@Override
			public Adapter caseAssociationKey(AssociationKey object) {
				return createAssociationKeyAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseAsc(Asc object) {
				return createAscAdapter();
			}
			@Override
			public Adapter caseDesc(Desc object) {
				return createDescAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseRepositoryFeatureReference(RepositoryFeatureReference object) {
				return createRepositoryFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamedDisplayElement(NamedDisplayElement object) {
				return createNamedDisplayElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseFormalParameterList(FormalParameterList object) {
				return createFormalParameterListAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Persistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Persistence
	 * @generated
	 */
	public Adapter createPersistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.SerializationGroup <em>Serialization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.SerializationGroup
	 * @generated
	 */
	public Adapter createSerializationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationReference
	 * @generated
	 */
	public Adapter createAssociationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.FeatureChildPath <em>Feature Child Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.FeatureChildPath
	 * @generated
	 */
	public Adapter createFeatureChildPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabel
	 * @generated
	 */
	public Adapter createModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelFeature <em>Model Label Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelFeature
	 * @generated
	 */
	public Adapter createModelLabelFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute <em>Model Label Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute
	 * @generated
	 */
	public Adapter createModelLabelAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation <em>Model Label Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ModelLabelAssociation
	 * @generated
	 */
	public Adapter createModelLabelAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.DataTypeAttribute <em>Data Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.DataTypeAttribute
	 * @generated
	 */
	public Adapter createDataTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.DateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.DateAttribute
	 * @generated
	 */
	public Adapter createDateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.UrlAttribute <em>Url Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.UrlAttribute
	 * @generated
	 */
	public Adapter createUrlAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ResourceAttribute <em>Resource Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ResourceAttribute
	 * @generated
	 */
	public Adapter createResourceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.PathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.PathElement
	 * @generated
	 */
	public Adapter createPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.StaticPathElement <em>Static Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.StaticPathElement
	 * @generated
	 */
	public Adapter createStaticPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.DatePathElement <em>Date Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.DatePathElement
	 * @generated
	 */
	public Adapter createDatePathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.FileAttribute <em>File Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.FileAttribute
	 * @generated
	 */
	public Adapter createFileAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.ImageAttribute <em>Image Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.ImageAttribute
	 * @generated
	 */
	public Adapter createImageAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.LocationAttribute <em>Location Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.LocationAttribute
	 * @generated
	 */
	public Adapter createLocationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment <em>Association Without Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithoutContainment
	 * @generated
	 */
	public Adapter createAssociationWithoutContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AssociationWithContainment <em>Association With Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationWithContainment
	 * @generated
	 */
	public Adapter createAssociationWithContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.AssociationKey <em>Association Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.AssociationKey
	 * @generated
	 */
	public Adapter createAssociationKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Asc <em>Asc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Asc
	 * @generated
	 */
	public Adapter createAscAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Desc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Desc
	 * @generated
	 */
	public Adapter createDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.persistence.RepositoryFeatureReference <em>Repository Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.persistence.RepositoryFeatureReference
	 * @generated
	 */
	public Adapter createRepositoryFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.NamedDisplayElement
	 * @generated
	 */
	public Adapter createNamedDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.base.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.base.FormalParameterList
	 * @generated
	 */
	public Adapter createFormalParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.expression.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.webgen.pims.expression.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.webgen.pims.expression.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PersistenceAdapterFactory
