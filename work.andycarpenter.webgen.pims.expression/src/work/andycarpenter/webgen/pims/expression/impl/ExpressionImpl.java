/**
 */
package work.andycarpenter.webgen.pims.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import work.andycarpenter.webgen.pims.expression.Expression;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.ExpressionTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.webgen.pims.expression.impl.ExpressionImpl#getRootContainer <em>Root Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRootContainer() {
		EObject rootContainer = basicGetRootContainer();
		return rootContainer != null && rootContainer.eIsProxy() ? eResolveProxy((InternalEObject)rootContainer) : rootContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRootContainer() {
		/**
		 *
		 * if
		 *   self.oclAsType(ecore::EObject)
		 *   .eContainer()
		 *   .oclIsKindOf(Expression)
		 * then
		 *   self.oclAsType(ecore::EObject)
		 *   .eContainer()
		 *   .oclAsType(Expression).rootContainer
		 * else self.oclAsType(ecore::EObject).eContainer()
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ecore_c_c_EObject_2 = idResolver.getClass(ExpressionTables.CLSSid_EObject, null);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_expression_c_c_Expression_0 = idResolver.getClass(ExpressionTables.CLSSid_Expression, null);
		final /*@Thrown*/ EObject oclAsType_2 = (EObject)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, this, TYP_ecore_c_c_EObject_2);
		final /*@Thrown*/ EObject eContainer_1 = oclAsType_2.eContainer();
		final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, eContainer_1, TYP_expression_c_c_Expression_0).booleanValue();
		/*@Thrown*/ EObject IF_oclIsKindOf;
		if (oclIsKindOf) {
			final /*@Thrown*/ Expression oclAsType_1 = (Expression)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, eContainer_1, TYP_expression_c_c_Expression_0);
			final /*@Thrown*/ EObject rootContainer = oclAsType_1.getRootContainer();
			IF_oclIsKindOf = rootContainer;
		}
		else {
			IF_oclIsKindOf = eContainer_1;
		}
		return IF_oclIsKindOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRootContainer() {
		// TODO: implement this method to return whether the 'Root Container' reference is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__ROOT_CONTAINER:
				if (resolve) return getRootContainer();
				return basicGetRootContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION__ROOT_CONTAINER:
				return isSetRootContainer();
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
