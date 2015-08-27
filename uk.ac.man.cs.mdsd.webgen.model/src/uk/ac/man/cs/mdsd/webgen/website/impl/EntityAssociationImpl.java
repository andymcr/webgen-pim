/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.EntityAssociationImpl#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityAssociationImpl extends AssociationImpl implements EntityAssociation {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

	/**
	 * The default value of the '{@link #getBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIDIRECTIONAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectional()
	 * @generated
	 * @ordered
	 */
	protected Boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIVOT_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected String pivotTableName = PIVOT_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = "input_association";

	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String targetFeatureName = TARGET_FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayLabel = TARGET_DISPLAY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HEADER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String targetHeaderClass = TARGET_HEADER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_INPUT_CLASS_EDEFAULT = "input_association";

	/**
	 * The cached value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected String targetInputClass = TARGET_INPUT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayClass = TARGET_DISPLAY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FOOTER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String targetFooterClass = TARGET_FOOTER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.ENTITY_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getParentEntity() {
		if (eContainerFeatureID() != WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEntity(Entity newParentEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEntity, WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEntity(Entity newParentEntity) {
		if (newParentEntity != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY && newParentEntity != null)) {
			if (EcoreUtil.isAncestor(this, newParentEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEntity != null)
				msgs = ((InternalEObject)newParentEntity).eInverseAdd(this, WebsitePackage.ENTITY__FEATURES, Entity.class, msgs);
			msgs = basicSetParentEntity(newParentEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY, newParentEntity, newParentEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTargetEntity() {
		if (targetEntity != null && targetEntity.eIsProxy()) {
			InternalEObject oldTargetEntity = (InternalEObject)targetEntity;
			targetEntity = (Entity)eResolveProxy(oldTargetEntity);
			if (targetEntity != oldTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, oldTargetEntity, targetEntity));
			}
		}
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEntity(Entity newTargetEntity, NotificationChain msgs) {
		Entity oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, oldTargetEntity, newTargetEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEntity(Entity newTargetEntity) {
		if (newTargetEntity != targetEntity) {
			NotificationChain msgs = null;
			if (targetEntity != null)
				msgs = ((InternalEObject)targetEntity).eInverseRemove(this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
			if (newTargetEntity != null)
				msgs = ((InternalEObject)newTargetEntity).eInverseAdd(this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
			msgs = basicSetTargetEntity(newTargetEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY, newTargetEntity, newTargetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(Boolean newBidirectional) {
		Boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPivotTableName() {
		return pivotTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPivotTableName(String newPivotTableName) {
		String oldPivotTableName = pivotTableName;
		pivotTableName = newPivotTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME, oldPivotTableName, pivotTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFeatureName() {
		return targetFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeatureName(String newTargetFeatureName) {
		String oldTargetFeatureName = targetFeatureName;
		targetFeatureName = newTargetFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME, oldTargetFeatureName, targetFeatureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayLabel() {
		return targetDisplayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayLabel(String newTargetDisplayLabel) {
		String oldTargetDisplayLabel = targetDisplayLabel;
		targetDisplayLabel = newTargetDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL, oldTargetDisplayLabel, targetDisplayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHeaderClass() {
		return targetHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHeaderClass(String newTargetHeaderClass) {
		String oldTargetHeaderClass = targetHeaderClass;
		targetHeaderClass = newTargetHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS, oldTargetHeaderClass, targetHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetInputClass() {
		return targetInputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInputClass(String newTargetInputClass) {
		String oldTargetInputClass = targetInputClass;
		targetInputClass = newTargetInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS, oldTargetInputClass, targetInputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayClass() {
		return targetDisplayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayClass(String newTargetDisplayClass) {
		String oldTargetDisplayClass = targetDisplayClass;
		targetDisplayClass = newTargetDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS, oldTargetDisplayClass, targetDisplayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFooterClass() {
		return targetFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFooterClass(String newTargetFooterClass) {
		String oldTargetFooterClass = targetFooterClass;
		targetFooterClass = newTargetFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS, oldTargetFooterClass, targetFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEntity((Entity)otherEnd, msgs);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				if (targetEntity != null)
					msgs = ((InternalEObject)targetEntity).eInverseRemove(this, WebsitePackage.ENTITY__ASSOCIATION_ENDS, Entity.class, msgs);
				return basicSetTargetEntity((Entity)otherEnd, msgs);
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				return basicSetParentEntity(null, msgs);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				return basicSetTargetEntity(null, msgs);
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.ENTITY__FEATURES, Entity.class, msgs);
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				return getParentEntity();
			case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME:
				return getColumnName();
			case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE:
				return isUnique();
			case WebsitePackage.ENTITY_ASSOCIATION__ORDERED:
				return isOrdered();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				return getBidirectional();
			case WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				return getPivotTableName();
			case WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				return getTargetFeatureName();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return getTargetDisplayLabel();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				return getTargetHeaderClass();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				return getTargetInputClass();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return getTargetDisplayClass();
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				return getTargetFooterClass();
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				setParentEntity((Entity)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				setTargetEntity((Entity)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass((String)newValue);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass((String)newValue);
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				setParentEntity((Entity)null);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				setTargetEntity((Entity)null);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName(PIVOT_TABLE_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName(TARGET_FEATURE_NAME_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel(TARGET_DISPLAY_LABEL_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass(TARGET_HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass(TARGET_INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass(TARGET_DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass(TARGET_FOOTER_CLASS_EDEFAULT);
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
			case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY:
				return getParentEntity() != null;
			case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case WebsitePackage.ENTITY_ASSOCIATION__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_ENTITY:
				return targetEntity != null;
			case WebsitePackage.ENTITY_ASSOCIATION__BIDIRECTIONAL:
				return BIDIRECTIONAL_EDEFAULT == null ? bidirectional != null : !BIDIRECTIONAL_EDEFAULT.equals(bidirectional);
			case WebsitePackage.ENTITY_ASSOCIATION__PIVOT_TABLE_NAME:
				return PIVOT_TABLE_NAME_EDEFAULT == null ? pivotTableName != null : !PIVOT_TABLE_NAME_EDEFAULT.equals(pivotTableName);
			case WebsitePackage.ENTITY_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FEATURE_NAME:
				return TARGET_FEATURE_NAME_EDEFAULT == null ? targetFeatureName != null : !TARGET_FEATURE_NAME_EDEFAULT.equals(targetFeatureName);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return TARGET_DISPLAY_LABEL_EDEFAULT == null ? targetDisplayLabel != null : !TARGET_DISPLAY_LABEL_EDEFAULT.equals(targetDisplayLabel);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_HEADER_CLASS:
				return TARGET_HEADER_CLASS_EDEFAULT == null ? targetHeaderClass != null : !TARGET_HEADER_CLASS_EDEFAULT.equals(targetHeaderClass);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_INPUT_CLASS:
				return TARGET_INPUT_CLASS_EDEFAULT == null ? targetInputClass != null : !TARGET_INPUT_CLASS_EDEFAULT.equals(targetInputClass);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return TARGET_DISPLAY_CLASS_EDEFAULT == null ? targetDisplayClass != null : !TARGET_DISPLAY_CLASS_EDEFAULT.equals(targetDisplayClass);
			case WebsitePackage.ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS:
				return TARGET_FOOTER_CLASS_EDEFAULT == null ? targetFooterClass != null : !TARGET_FOOTER_CLASS_EDEFAULT.equals(targetFooterClass);
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
		if (baseClass == EntityFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY: return WebsitePackage.ENTITY_FEATURE__PARENT_ENTITY;
				case WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME: return WebsitePackage.ENTITY_FEATURE__COLUMN_NAME;
				case WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY: return WebsitePackage.ENTITY_FEATURE__CARDINALITY;
				case WebsitePackage.ENTITY_ASSOCIATION__UNIQUE: return WebsitePackage.ENTITY_FEATURE__UNIQUE;
				case WebsitePackage.ENTITY_ASSOCIATION__ORDERED: return WebsitePackage.ENTITY_FEATURE__ORDERED;
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
		if (baseClass == EntityFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ENTITY_FEATURE__PARENT_ENTITY: return WebsitePackage.ENTITY_ASSOCIATION__PARENT_ENTITY;
				case WebsitePackage.ENTITY_FEATURE__COLUMN_NAME: return WebsitePackage.ENTITY_ASSOCIATION__COLUMN_NAME;
				case WebsitePackage.ENTITY_FEATURE__CARDINALITY: return WebsitePackage.ENTITY_ASSOCIATION__CARDINALITY;
				case WebsitePackage.ENTITY_FEATURE__UNIQUE: return WebsitePackage.ENTITY_ASSOCIATION__UNIQUE;
				case WebsitePackage.ENTITY_FEATURE__ORDERED: return WebsitePackage.ENTITY_ASSOCIATION__ORDERED;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", unique: ");
		result.append(unique);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", pivotTableName: ");
		result.append(pivotTableName);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", targetFeatureName: ");
		result.append(targetFeatureName);
		result.append(", targetDisplayLabel: ");
		result.append(targetDisplayLabel);
		result.append(", targetHeaderClass: ");
		result.append(targetHeaderClass);
		result.append(", targetInputClass: ");
		result.append(targetInputClass);
		result.append(", targetDisplayClass: ");
		result.append(targetDisplayClass);
		result.append(", targetFooterClass: ");
		result.append(targetFooterClass);
		result.append(')');
		return result.toString();
	}

} //EntityAssociationImpl
