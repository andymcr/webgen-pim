/**
 */
package work.andycarpenter.webgen.pims.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = work.andycarpenter.webgen.pims.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence</em>'.
	 * @generated
	 */
	Persistence createPersistence();

	/**
	 * Returns a new object of class '<em>Serialization Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serialization Group</em>'.
	 * @generated
	 */
	SerializationGroup createSerializationGroup();

	/**
	 * Returns a new object of class '<em>Path Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Root</em>'.
	 * @generated
	 */
	PathRoot createPathRoot();

	/**
	 * Returns a new object of class '<em>Model Label Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label Attribute</em>'.
	 * @generated
	 */
	ModelLabelAttribute createModelLabelAttribute();

	/**
	 * Returns a new object of class '<em>Model Label Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label Association</em>'.
	 * @generated
	 */
	ModelLabelAssociation createModelLabelAssociation();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Attribute</em>'.
	 * @generated
	 */
	DataTypeAttribute createDataTypeAttribute();

	/**
	 * Returns a new object of class '<em>Date Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Attribute</em>'.
	 * @generated
	 */
	DateAttribute createDateAttribute();

	/**
	 * Returns a new object of class '<em>Url Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url Attribute</em>'.
	 * @generated
	 */
	UrlAttribute createUrlAttribute();

	/**
	 * Returns a new object of class '<em>Sub Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Directory</em>'.
	 * @generated
	 */
	SubDirectory createSubDirectory();

	/**
	 * Returns a new object of class '<em>Property Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Directory</em>'.
	 * @generated
	 */
	PropertyDirectory createPropertyDirectory();

	/**
	 * Returns a new object of class '<em>Date Time Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Directory</em>'.
	 * @generated
	 */
	DateTimeDirectory createDateTimeDirectory();

	/**
	 * Returns a new object of class '<em>Unique Id Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Id Namer</em>'.
	 * @generated
	 */
	UniqueIdNamer createUniqueIdNamer();

	/**
	 * Returns a new object of class '<em>Original Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Original Namer</em>'.
	 * @generated
	 */
	OriginalNamer createOriginalNamer();

	/**
	 * Returns a new object of class '<em>Property Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Namer</em>'.
	 * @generated
	 */
	PropertyNamer createPropertyNamer();

	/**
	 * Returns a new object of class '<em>Hash Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Namer</em>'.
	 * @generated
	 */
	HashNamer createHashNamer();

	/**
	 * Returns a new object of class '<em>Base64 Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base64 Namer</em>'.
	 * @generated
	 */
	Base64Namer createBase64Namer();

	/**
	 * Returns a new object of class '<em>Smart Unique Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Unique Namer</em>'.
	 * @generated
	 */
	SmartUniqueNamer createSmartUniqueNamer();

	/**
	 * Returns a new object of class '<em>Slug Namer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slug Namer</em>'.
	 * @generated
	 */
	SlugNamer createSlugNamer();

	/**
	 * Returns a new object of class '<em>File Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Resource</em>'.
	 * @generated
	 */
	FileResource createFileResource();

	/**
	 * Returns a new object of class '<em>Image Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Resource</em>'.
	 * @generated
	 */
	ImageResource createImageResource();

	/**
	 * Returns a new object of class '<em>Location Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Attribute</em>'.
	 * @generated
	 */
	LocationAttribute createLocationAttribute();

	/**
	 * Returns a new object of class '<em>Association Without Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Without Containment</em>'.
	 * @generated
	 */
	AssociationWithoutContainment createAssociationWithoutContainment();

	/**
	 * Returns a new object of class '<em>Association With Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association With Containment</em>'.
	 * @generated
	 */
	AssociationWithContainment createAssociationWithContainment();

	/**
	 * Returns a new object of class '<em>Association Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Key</em>'.
	 * @generated
	 */
	AssociationKey createAssociationKey();

	/**
	 * Returns a new object of class '<em>Model Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Label</em>'.
	 * @generated
	 */
	ModelLabel createModelLabel();

	/**
	 * Returns a new object of class '<em>Child Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Association</em>'.
	 * @generated
	 */
	ChildAssociation createChildAssociation();

	/**
	 * Returns a new object of class '<em>Child Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Attribute</em>'.
	 * @generated
	 */
	ChildAttribute createChildAttribute();

	/**
	 * Returns a new object of class '<em>Child Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Resource</em>'.
	 * @generated
	 */
	ChildResource createChildResource();

	/**
	 * Returns a new object of class '<em>Association Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Variable</em>'.
	 * @generated
	 */
	AssociationVariable createAssociationVariable();

	/**
	 * Returns a new object of class '<em>Attribute Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Variable</em>'.
	 * @generated
	 */
	AttributeVariable createAttributeVariable();

	/**
	 * Returns a new object of class '<em>Resource Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Variable</em>'.
	 * @generated
	 */
	ResourceVariable createResourceVariable();

	/**
	 * Returns a new object of class '<em>Parameter Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Variable</em>'.
	 * @generated
	 */
	ParameterVariable createParameterVariable();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection</em>'.
	 * @generated
	 */
	Selection createSelection();

	/**
	 * Returns a new object of class '<em>Selection Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Path</em>'.
	 * @generated
	 */
	SelectionPath createSelectionPath();

	/**
	 * Returns a new object of class '<em>Asc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asc</em>'.
	 * @generated
	 */
	Asc createAsc();

	/**
	 * Returns a new object of class '<em>Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desc</em>'.
	 * @generated
	 */
	Desc createDesc();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory
