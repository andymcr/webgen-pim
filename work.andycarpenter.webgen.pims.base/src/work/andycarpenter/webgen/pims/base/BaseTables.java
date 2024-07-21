/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /work.andycarpenter.webgen.pims.base/model/base.ecore
 * using:
 *   /work.andycarpenter.webgen.pims.base/model/base.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package work.andycarpenter.webgen.pims.base;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import work.andycarpenter.webgen.pims.base.BasePackage;
// import work.andycarpenter.webgen.pims.base.BaseTables;
import work.andycarpenter.webgen.pims.expression.ExpressionPackage;
import work.andycarpenter.webgen.pims.expression.ExpressionTables;

/**
 * BaseTables provides the dispatch tables for the base for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class BaseTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(BasePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base = IdManager.getNsURIPackageId("http://andycarpenter.work/pim/base", null, BasePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_andycarpenter_work_s_pim_s_expression = IdManager.getNsURIPackageId("http://andycarpenter.work/pim/expression", null, ExpressionPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Callable = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("Callable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Classifier = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("Classifier", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EnumerationLiteral = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("EnumerationLiteral", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EnumerationType = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("EnumerationType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Expression = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_expression.getClassId("Expression", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FormalParameter = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("FormalParameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FormalParameterList = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("FormalParameterList", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NamedElement = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("NamedElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ParameterReference = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("ParameterReference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ReduceFunction = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_base.getClassId("ReduceFunction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = BaseTables.PACKid_http_c_s_s_andycarpenter_work_s_pim_s_expression.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = BaseTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_FormalParameter = TypeId.BAG.getSpecializedId(BaseTables.CLSSid_FormalParameter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ParameterReference = TypeId.BAG.getSpecializedId(BaseTables.CLSSid_ParameterReference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EnumerationLiteral = TypeId.ORDERED_SET.getSpecializedId(BaseTables.CLSSid_EnumerationLiteral, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_FormalParameter = TypeId.ORDERED_SET.getSpecializedId(BaseTables.CLSSid_FormalParameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			BaseTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _BooleanLiteral = new EcoreExecutorType(BasePackage.Literals.BOOLEAN_LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _Callable = new EcoreExecutorType(BasePackage.Literals.CALLABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Classifier = new EcoreExecutorType(BasePackage.Literals.CLASSIFIER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _CurrentTime = new EcoreExecutorType(BasePackage.Literals.CURRENT_TIME, PACKAGE, 0);
		public static final EcoreExecutorType _CurrentUser = new EcoreExecutorType(BasePackage.Literals.CURRENT_USER, PACKAGE, 0);
		public static final EcoreExecutorType _DataType = new EcoreExecutorType(BasePackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _EnumerationLiteral = new EcoreExecutorType(BasePackage.Literals.ENUMERATION_LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _EnumerationType = new EcoreExecutorType(BasePackage.Literals.ENUMERATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _FormalParameter = new EcoreExecutorType(BasePackage.Literals.FORMAL_PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _FormalParameterList = new EcoreExecutorType(BasePackage.Literals.FORMAL_PARAMETER_LIST, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _IntegerLiteral = new EcoreExecutorType(BasePackage.Literals.INTEGER_LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _NamedDisplayElement = new EcoreExecutorType(BasePackage.Literals.NAMED_DISPLAY_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(BasePackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NullLiteral = new EcoreExecutorType(BasePackage.Literals.NULL_LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _ParameterReference = new EcoreExecutorType(BasePackage.Literals.PARAMETER_REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorType _ReduceFunction = new EcoreExecutorType(BasePackage.Literals.REDUCE_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _SizeFunction = new EcoreExecutorType(BasePackage.Literals.SIZE_FUNCTION, PACKAGE, 0);
		public static final EcoreExecutorType _StringLiteral = new EcoreExecutorType(BasePackage.Literals.STRING_LITERAL, PACKAGE, 0);
		public static final EcoreExecutorType _TimeLiteral = new EcoreExecutorType(BasePackage.Literals.TIME_LITERAL, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BooleanLiteral,
			_Callable,
			_Classifier,
			_CurrentTime,
			_CurrentUser,
			_DataType,
			_EnumerationLiteral,
			_EnumerationType,
			_FormalParameter,
			_FormalParameterList,
			_IntegerLiteral,
			_NamedDisplayElement,
			_NamedElement,
			_NullLiteral,
			_ParameterReference,
			_ReduceFunction,
			_SizeFunction,
			_StringLiteral,
			_TimeLiteral
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _BooleanLiteral__BooleanLiteral = new ExecutorFragment(Types._BooleanLiteral, BaseTables.Types._BooleanLiteral);
		private static final ExecutorFragment _BooleanLiteral__Expression = new ExecutorFragment(Types._BooleanLiteral, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _BooleanLiteral__Literal = new ExecutorFragment(Types._BooleanLiteral, ExpressionTables.Types._Literal);
		private static final ExecutorFragment _BooleanLiteral__OclAny = new ExecutorFragment(Types._BooleanLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanLiteral__OclElement = new ExecutorFragment(Types._BooleanLiteral, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanLiteral__Operand = new ExecutorFragment(Types._BooleanLiteral, ExpressionTables.Types._Operand);

		private static final ExecutorFragment _Callable__Callable = new ExecutorFragment(Types._Callable, BaseTables.Types._Callable);
		private static final ExecutorFragment _Callable__Expression = new ExecutorFragment(Types._Callable, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _Callable__FormalParameterList = new ExecutorFragment(Types._Callable, BaseTables.Types._FormalParameterList);
		private static final ExecutorFragment _Callable__OclAny = new ExecutorFragment(Types._Callable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Callable__OclElement = new ExecutorFragment(Types._Callable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Callable__Operand = new ExecutorFragment(Types._Callable, ExpressionTables.Types._Operand);

		private static final ExecutorFragment _Classifier__Classifier = new ExecutorFragment(Types._Classifier, BaseTables.Types._Classifier);
		private static final ExecutorFragment _Classifier__NamedDisplayElement = new ExecutorFragment(Types._Classifier, BaseTables.Types._NamedDisplayElement);
		private static final ExecutorFragment _Classifier__NamedElement = new ExecutorFragment(Types._Classifier, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _Classifier__OclAny = new ExecutorFragment(Types._Classifier, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Classifier__OclElement = new ExecutorFragment(Types._Classifier, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CurrentTime__CurrentTime = new ExecutorFragment(Types._CurrentTime, BaseTables.Types._CurrentTime);
		private static final ExecutorFragment _CurrentTime__Expression = new ExecutorFragment(Types._CurrentTime, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _CurrentTime__OclAny = new ExecutorFragment(Types._CurrentTime, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CurrentTime__OclElement = new ExecutorFragment(Types._CurrentTime, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CurrentTime__Operand = new ExecutorFragment(Types._CurrentTime, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _CurrentTime__Variable = new ExecutorFragment(Types._CurrentTime, ExpressionTables.Types._Variable);

		private static final ExecutorFragment _CurrentUser__CurrentUser = new ExecutorFragment(Types._CurrentUser, BaseTables.Types._CurrentUser);
		private static final ExecutorFragment _CurrentUser__Expression = new ExecutorFragment(Types._CurrentUser, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _CurrentUser__OclAny = new ExecutorFragment(Types._CurrentUser, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CurrentUser__OclElement = new ExecutorFragment(Types._CurrentUser, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CurrentUser__Operand = new ExecutorFragment(Types._CurrentUser, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _CurrentUser__Variable = new ExecutorFragment(Types._CurrentUser, ExpressionTables.Types._Variable);

		private static final ExecutorFragment _DataType__Classifier = new ExecutorFragment(Types._DataType, BaseTables.Types._Classifier);
		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, BaseTables.Types._DataType);
		private static final ExecutorFragment _DataType__NamedDisplayElement = new ExecutorFragment(Types._DataType, BaseTables.Types._NamedDisplayElement);
		private static final ExecutorFragment _DataType__NamedElement = new ExecutorFragment(Types._DataType, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, BaseTables.Types._EnumerationLiteral);
		private static final ExecutorFragment _EnumerationLiteral__NamedDisplayElement = new ExecutorFragment(Types._EnumerationLiteral, BaseTables.Types._NamedDisplayElement);
		private static final ExecutorFragment _EnumerationLiteral__NamedElement = new ExecutorFragment(Types._EnumerationLiteral, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnumerationLiteral__OclElement = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnumerationType__Classifier = new ExecutorFragment(Types._EnumerationType, BaseTables.Types._Classifier);
		private static final ExecutorFragment _EnumerationType__DataType = new ExecutorFragment(Types._EnumerationType, BaseTables.Types._DataType);
		private static final ExecutorFragment _EnumerationType__EnumerationType = new ExecutorFragment(Types._EnumerationType, BaseTables.Types._EnumerationType);
		private static final ExecutorFragment _EnumerationType__NamedDisplayElement = new ExecutorFragment(Types._EnumerationType, BaseTables.Types._NamedDisplayElement);
		private static final ExecutorFragment _EnumerationType__NamedElement = new ExecutorFragment(Types._EnumerationType, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _EnumerationType__OclAny = new ExecutorFragment(Types._EnumerationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnumerationType__OclElement = new ExecutorFragment(Types._EnumerationType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FormalParameter__FormalParameter = new ExecutorFragment(Types._FormalParameter, BaseTables.Types._FormalParameter);
		private static final ExecutorFragment _FormalParameter__NamedElement = new ExecutorFragment(Types._FormalParameter, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _FormalParameter__OclAny = new ExecutorFragment(Types._FormalParameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FormalParameter__OclElement = new ExecutorFragment(Types._FormalParameter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FormalParameterList__FormalParameterList = new ExecutorFragment(Types._FormalParameterList, BaseTables.Types._FormalParameterList);
		private static final ExecutorFragment _FormalParameterList__OclAny = new ExecutorFragment(Types._FormalParameterList, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FormalParameterList__OclElement = new ExecutorFragment(Types._FormalParameterList, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IntegerLiteral__Expression = new ExecutorFragment(Types._IntegerLiteral, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _IntegerLiteral__IntegerLiteral = new ExecutorFragment(Types._IntegerLiteral, BaseTables.Types._IntegerLiteral);
		private static final ExecutorFragment _IntegerLiteral__Literal = new ExecutorFragment(Types._IntegerLiteral, ExpressionTables.Types._Literal);
		private static final ExecutorFragment _IntegerLiteral__OclAny = new ExecutorFragment(Types._IntegerLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerLiteral__OclElement = new ExecutorFragment(Types._IntegerLiteral, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerLiteral__Operand = new ExecutorFragment(Types._IntegerLiteral, ExpressionTables.Types._Operand);

		private static final ExecutorFragment _NamedDisplayElement__NamedDisplayElement = new ExecutorFragment(Types._NamedDisplayElement, BaseTables.Types._NamedDisplayElement);
		private static final ExecutorFragment _NamedDisplayElement__NamedElement = new ExecutorFragment(Types._NamedDisplayElement, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _NamedDisplayElement__OclAny = new ExecutorFragment(Types._NamedDisplayElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedDisplayElement__OclElement = new ExecutorFragment(Types._NamedDisplayElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, BaseTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NullLiteral__Expression = new ExecutorFragment(Types._NullLiteral, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _NullLiteral__Literal = new ExecutorFragment(Types._NullLiteral, ExpressionTables.Types._Literal);
		private static final ExecutorFragment _NullLiteral__NullLiteral = new ExecutorFragment(Types._NullLiteral, BaseTables.Types._NullLiteral);
		private static final ExecutorFragment _NullLiteral__OclAny = new ExecutorFragment(Types._NullLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NullLiteral__OclElement = new ExecutorFragment(Types._NullLiteral, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NullLiteral__Operand = new ExecutorFragment(Types._NullLiteral, ExpressionTables.Types._Operand);

		private static final ExecutorFragment _ParameterReference__Expression = new ExecutorFragment(Types._ParameterReference, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _ParameterReference__OclAny = new ExecutorFragment(Types._ParameterReference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParameterReference__OclElement = new ExecutorFragment(Types._ParameterReference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParameterReference__Operand = new ExecutorFragment(Types._ParameterReference, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _ParameterReference__ParameterReference = new ExecutorFragment(Types._ParameterReference, BaseTables.Types._ParameterReference);
		private static final ExecutorFragment _ParameterReference__Variable = new ExecutorFragment(Types._ParameterReference, ExpressionTables.Types._Variable);

		private static final ExecutorFragment _ReduceFunction__Expression = new ExecutorFragment(Types._ReduceFunction, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _ReduceFunction__OclAny = new ExecutorFragment(Types._ReduceFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReduceFunction__OclElement = new ExecutorFragment(Types._ReduceFunction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReduceFunction__Operand = new ExecutorFragment(Types._ReduceFunction, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _ReduceFunction__ReduceFunction = new ExecutorFragment(Types._ReduceFunction, BaseTables.Types._ReduceFunction);

		private static final ExecutorFragment _SizeFunction__Expression = new ExecutorFragment(Types._SizeFunction, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _SizeFunction__OclAny = new ExecutorFragment(Types._SizeFunction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SizeFunction__OclElement = new ExecutorFragment(Types._SizeFunction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SizeFunction__Operand = new ExecutorFragment(Types._SizeFunction, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _SizeFunction__SizeFunction = new ExecutorFragment(Types._SizeFunction, BaseTables.Types._SizeFunction);

		private static final ExecutorFragment _StringLiteral__Expression = new ExecutorFragment(Types._StringLiteral, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _StringLiteral__Literal = new ExecutorFragment(Types._StringLiteral, ExpressionTables.Types._Literal);
		private static final ExecutorFragment _StringLiteral__OclAny = new ExecutorFragment(Types._StringLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringLiteral__OclElement = new ExecutorFragment(Types._StringLiteral, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringLiteral__Operand = new ExecutorFragment(Types._StringLiteral, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _StringLiteral__StringLiteral = new ExecutorFragment(Types._StringLiteral, BaseTables.Types._StringLiteral);

		private static final ExecutorFragment _TimeLiteral__Expression = new ExecutorFragment(Types._TimeLiteral, ExpressionTables.Types._Expression);
		private static final ExecutorFragment _TimeLiteral__Literal = new ExecutorFragment(Types._TimeLiteral, ExpressionTables.Types._Literal);
		private static final ExecutorFragment _TimeLiteral__OclAny = new ExecutorFragment(Types._TimeLiteral, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeLiteral__OclElement = new ExecutorFragment(Types._TimeLiteral, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeLiteral__Operand = new ExecutorFragment(Types._TimeLiteral, ExpressionTables.Types._Operand);
		private static final ExecutorFragment _TimeLiteral__TimeLiteral = new ExecutorFragment(Types._TimeLiteral, BaseTables.Types._TimeLiteral);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _BooleanLiteral__value = new EcoreExecutorProperty(BasePackage.Literals.BOOLEAN_LITERAL__VALUE, Types._BooleanLiteral, 0);

		public static final ExecutorProperty _Callable__body = new EcoreExecutorProperty(BasePackage.Literals.CALLABLE__BODY, Types._Callable, 0);
		public static final ExecutorProperty _Callable__ReduceFunction__callback = new ExecutorPropertyWithImplementation("ReduceFunction", Types._Callable, 1, new EcoreLibraryOppositeProperty(BasePackage.Literals.REDUCE_FUNCTION__CALLBACK));

		public static final ExecutorProperty _Classifier__FormalParameter__dataType = new ExecutorPropertyWithImplementation("FormalParameter", Types._Classifier, 0, new EcoreLibraryOppositeProperty(BasePackage.Literals.FORMAL_PARAMETER__DATA_TYPE));

		public static final ExecutorProperty _CurrentTime__format = new EcoreExecutorProperty(BasePackage.Literals.CURRENT_TIME__FORMAT, Types._CurrentTime, 0);

		public static final ExecutorProperty _DataType__interfaceType = new EcoreExecutorProperty(BasePackage.Literals.DATA_TYPE__INTERFACE_TYPE, Types._DataType, 0);
		public static final ExecutorProperty _DataType__ormType = new EcoreExecutorProperty(BasePackage.Literals.DATA_TYPE__ORM_TYPE, Types._DataType, 1);
		public static final ExecutorProperty _DataType__persistentType = new EcoreExecutorProperty(BasePackage.Literals.DATA_TYPE__PERSISTENT_TYPE, Types._DataType, 2);
		public static final ExecutorProperty _DataType__validationPattern = new EcoreExecutorProperty(BasePackage.Literals.DATA_TYPE__VALIDATION_PATTERN, Types._DataType, 3);
		public static final ExecutorProperty _DataType__wafType = new EcoreExecutorProperty(BasePackage.Literals.DATA_TYPE__WAF_TYPE, Types._DataType, 4);

		public static final ExecutorProperty _EnumerationLiteral__EnumerationType__enumerations = new ExecutorPropertyWithImplementation("EnumerationType", Types._EnumerationLiteral, 0, new EcoreLibraryOppositeProperty(BasePackage.Literals.ENUMERATION_TYPE__ENUMERATIONS));

		public static final ExecutorProperty _EnumerationType__enumerations = new EcoreExecutorProperty(BasePackage.Literals.ENUMERATION_TYPE__ENUMERATIONS, Types._EnumerationType, 0);

		public static final ExecutorProperty _FormalParameter__dataType = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER__DATA_TYPE, Types._FormalParameter, 0);
		public static final ExecutorProperty _FormalParameter__defaultValue = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER__DEFAULT_VALUE, Types._FormalParameter, 1);
		public static final ExecutorProperty _FormalParameter__description = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER__DESCRIPTION, Types._FormalParameter, 2);
		public static final ExecutorProperty _FormalParameter__formalFor = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER__FORMAL_FOR, Types._FormalParameter, 3);
		public static final ExecutorProperty _FormalParameter__placeholder = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER__PLACEHOLDER, Types._FormalParameter, 4);
		public static final ExecutorProperty _FormalParameter__ParameterReference__parameter = new ExecutorPropertyWithImplementation("ParameterReference", Types._FormalParameter, 5, new EcoreLibraryOppositeProperty(BasePackage.Literals.PARAMETER_REFERENCE__PARAMETER));

		public static final ExecutorProperty _FormalParameterList__parameters = new EcoreExecutorProperty(BasePackage.Literals.FORMAL_PARAMETER_LIST__PARAMETERS, Types._FormalParameterList, 0);

		public static final ExecutorProperty _IntegerLiteral__value = new EcoreExecutorProperty(BasePackage.Literals.INTEGER_LITERAL__VALUE, Types._IntegerLiteral, 0);

		public static final ExecutorProperty _NamedDisplayElement__displayLabel = new EcoreExecutorProperty(BasePackage.Literals.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL, Types._NamedDisplayElement, 0);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(BasePackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _ParameterReference__name = new EcoreExecutorProperty(BasePackage.Literals.PARAMETER_REFERENCE__NAME, Types._ParameterReference, 0);
		public static final ExecutorProperty _ParameterReference__parameter = new EcoreExecutorProperty(BasePackage.Literals.PARAMETER_REFERENCE__PARAMETER, Types._ParameterReference, 1);

		public static final ExecutorProperty _ReduceFunction__callback = new EcoreExecutorProperty(BasePackage.Literals.REDUCE_FUNCTION__CALLBACK, Types._ReduceFunction, 0);
		public static final ExecutorProperty _ReduceFunction__initial = new EcoreExecutorProperty(BasePackage.Literals.REDUCE_FUNCTION__INITIAL, Types._ReduceFunction, 1);
		public static final ExecutorProperty _ReduceFunction__value = new EcoreExecutorProperty(BasePackage.Literals.REDUCE_FUNCTION__VALUE, Types._ReduceFunction, 2);

		public static final ExecutorProperty _SizeFunction__value = new EcoreExecutorProperty(BasePackage.Literals.SIZE_FUNCTION__VALUE, Types._SizeFunction, 0);

		public static final ExecutorProperty _StringLiteral__value = new EcoreExecutorProperty(BasePackage.Literals.STRING_LITERAL__VALUE, Types._StringLiteral, 0);

		public static final ExecutorProperty _TimeLiteral__value = new EcoreExecutorProperty(BasePackage.Literals.TIME_LITERAL__VALUE, Types._TimeLiteral, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanLiteral =
			{
				Fragments._BooleanLiteral__OclAny /* 0 */,
				Fragments._BooleanLiteral__OclElement /* 1 */,
				Fragments._BooleanLiteral__Expression /* 2 */,
				Fragments._BooleanLiteral__Operand /* 3 */,
				Fragments._BooleanLiteral__Literal /* 4 */,
				Fragments._BooleanLiteral__BooleanLiteral /* 5 */
			};
		private static final int /*@NonNull*/ [] __BooleanLiteral = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Callable =
			{
				Fragments._Callable__OclAny /* 0 */,
				Fragments._Callable__OclElement /* 1 */,
				Fragments._Callable__Expression /* 2 */,
				Fragments._Callable__FormalParameterList /* 2 */,
				Fragments._Callable__Operand /* 3 */,
				Fragments._Callable__Callable /* 4 */
			};
		private static final int /*@NonNull*/ [] __Callable = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Classifier =
			{
				Fragments._Classifier__OclAny /* 0 */,
				Fragments._Classifier__OclElement /* 1 */,
				Fragments._Classifier__NamedElement /* 2 */,
				Fragments._Classifier__NamedDisplayElement /* 3 */,
				Fragments._Classifier__Classifier /* 4 */
			};
		private static final int /*@NonNull*/ [] __Classifier = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CurrentTime =
			{
				Fragments._CurrentTime__OclAny /* 0 */,
				Fragments._CurrentTime__OclElement /* 1 */,
				Fragments._CurrentTime__Expression /* 2 */,
				Fragments._CurrentTime__Operand /* 3 */,
				Fragments._CurrentTime__Variable /* 4 */,
				Fragments._CurrentTime__CurrentTime /* 5 */
			};
		private static final int /*@NonNull*/ [] __CurrentTime = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CurrentUser =
			{
				Fragments._CurrentUser__OclAny /* 0 */,
				Fragments._CurrentUser__OclElement /* 1 */,
				Fragments._CurrentUser__Expression /* 2 */,
				Fragments._CurrentUser__Operand /* 3 */,
				Fragments._CurrentUser__Variable /* 4 */,
				Fragments._CurrentUser__CurrentUser /* 5 */
			};
		private static final int /*@NonNull*/ [] __CurrentUser = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__NamedElement /* 2 */,
				Fragments._DataType__NamedDisplayElement /* 3 */,
				Fragments._DataType__Classifier /* 4 */,
				Fragments._DataType__DataType /* 5 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnumerationLiteral =
			{
				Fragments._EnumerationLiteral__OclAny /* 0 */,
				Fragments._EnumerationLiteral__OclElement /* 1 */,
				Fragments._EnumerationLiteral__NamedElement /* 2 */,
				Fragments._EnumerationLiteral__NamedDisplayElement /* 3 */,
				Fragments._EnumerationLiteral__EnumerationLiteral /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnumerationLiteral = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnumerationType =
			{
				Fragments._EnumerationType__OclAny /* 0 */,
				Fragments._EnumerationType__OclElement /* 1 */,
				Fragments._EnumerationType__NamedElement /* 2 */,
				Fragments._EnumerationType__NamedDisplayElement /* 3 */,
				Fragments._EnumerationType__Classifier /* 4 */,
				Fragments._EnumerationType__DataType /* 5 */,
				Fragments._EnumerationType__EnumerationType /* 6 */
			};
		private static final int /*@NonNull*/ [] __EnumerationType = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FormalParameter =
			{
				Fragments._FormalParameter__OclAny /* 0 */,
				Fragments._FormalParameter__OclElement /* 1 */,
				Fragments._FormalParameter__NamedElement /* 2 */,
				Fragments._FormalParameter__FormalParameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __FormalParameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FormalParameterList =
			{
				Fragments._FormalParameterList__OclAny /* 0 */,
				Fragments._FormalParameterList__OclElement /* 1 */,
				Fragments._FormalParameterList__FormalParameterList /* 2 */
			};
		private static final int /*@NonNull*/ [] __FormalParameterList = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerLiteral =
			{
				Fragments._IntegerLiteral__OclAny /* 0 */,
				Fragments._IntegerLiteral__OclElement /* 1 */,
				Fragments._IntegerLiteral__Expression /* 2 */,
				Fragments._IntegerLiteral__Operand /* 3 */,
				Fragments._IntegerLiteral__Literal /* 4 */,
				Fragments._IntegerLiteral__IntegerLiteral /* 5 */
			};
		private static final int /*@NonNull*/ [] __IntegerLiteral = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedDisplayElement =
			{
				Fragments._NamedDisplayElement__OclAny /* 0 */,
				Fragments._NamedDisplayElement__OclElement /* 1 */,
				Fragments._NamedDisplayElement__NamedElement /* 2 */,
				Fragments._NamedDisplayElement__NamedDisplayElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __NamedDisplayElement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NullLiteral =
			{
				Fragments._NullLiteral__OclAny /* 0 */,
				Fragments._NullLiteral__OclElement /* 1 */,
				Fragments._NullLiteral__Expression /* 2 */,
				Fragments._NullLiteral__Operand /* 3 */,
				Fragments._NullLiteral__Literal /* 4 */,
				Fragments._NullLiteral__NullLiteral /* 5 */
			};
		private static final int /*@NonNull*/ [] __NullLiteral = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParameterReference =
			{
				Fragments._ParameterReference__OclAny /* 0 */,
				Fragments._ParameterReference__OclElement /* 1 */,
				Fragments._ParameterReference__Expression /* 2 */,
				Fragments._ParameterReference__Operand /* 3 */,
				Fragments._ParameterReference__Variable /* 4 */,
				Fragments._ParameterReference__ParameterReference /* 5 */
			};
		private static final int /*@NonNull*/ [] __ParameterReference = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReduceFunction =
			{
				Fragments._ReduceFunction__OclAny /* 0 */,
				Fragments._ReduceFunction__OclElement /* 1 */,
				Fragments._ReduceFunction__Expression /* 2 */,
				Fragments._ReduceFunction__Operand /* 3 */,
				Fragments._ReduceFunction__ReduceFunction /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReduceFunction = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SizeFunction =
			{
				Fragments._SizeFunction__OclAny /* 0 */,
				Fragments._SizeFunction__OclElement /* 1 */,
				Fragments._SizeFunction__Expression /* 2 */,
				Fragments._SizeFunction__Operand /* 3 */,
				Fragments._SizeFunction__SizeFunction /* 4 */
			};
		private static final int /*@NonNull*/ [] __SizeFunction = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringLiteral =
			{
				Fragments._StringLiteral__OclAny /* 0 */,
				Fragments._StringLiteral__OclElement /* 1 */,
				Fragments._StringLiteral__Expression /* 2 */,
				Fragments._StringLiteral__Operand /* 3 */,
				Fragments._StringLiteral__Literal /* 4 */,
				Fragments._StringLiteral__StringLiteral /* 5 */
			};
		private static final int /*@NonNull*/ [] __StringLiteral = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeLiteral =
			{
				Fragments._TimeLiteral__OclAny /* 0 */,
				Fragments._TimeLiteral__OclElement /* 1 */,
				Fragments._TimeLiteral__Expression /* 2 */,
				Fragments._TimeLiteral__Operand /* 3 */,
				Fragments._TimeLiteral__Literal /* 4 */,
				Fragments._TimeLiteral__TimeLiteral /* 5 */
			};
		private static final int /*@NonNull*/ [] __TimeLiteral = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BooleanLiteral.initFragments(_BooleanLiteral, __BooleanLiteral);
			Types._Callable.initFragments(_Callable, __Callable);
			Types._Classifier.initFragments(_Classifier, __Classifier);
			Types._CurrentTime.initFragments(_CurrentTime, __CurrentTime);
			Types._CurrentUser.initFragments(_CurrentUser, __CurrentUser);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral);
			Types._EnumerationType.initFragments(_EnumerationType, __EnumerationType);
			Types._FormalParameter.initFragments(_FormalParameter, __FormalParameter);
			Types._FormalParameterList.initFragments(_FormalParameterList, __FormalParameterList);
			Types._IntegerLiteral.initFragments(_IntegerLiteral, __IntegerLiteral);
			Types._NamedDisplayElement.initFragments(_NamedDisplayElement, __NamedDisplayElement);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._NullLiteral.initFragments(_NullLiteral, __NullLiteral);
			Types._ParameterReference.initFragments(_ParameterReference, __ParameterReference);
			Types._ReduceFunction.initFragments(_ReduceFunction, __ReduceFunction);
			Types._SizeFunction.initFragments(_SizeFunction, __SizeFunction);
			Types._StringLiteral.initFragments(_StringLiteral, __StringLiteral);
			Types._TimeLiteral.initFragments(_TimeLiteral, __TimeLiteral);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__BooleanLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanLiteral__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Callable__Callable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Callable__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Callable__FormalParameterList = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Callable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Callable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Callable__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__NamedDisplayElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Classifier__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__CurrentTime = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__Operand = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentTime__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__CurrentUser = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__Operand = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CurrentUser__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__NamedDisplayElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__EnumerationLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__NamedDisplayElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__EnumerationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__Classifier = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__NamedDisplayElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnumerationType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameter__FormalParameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameterList__FormalParameterList = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameterList__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FormalParameterList__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__IntegerLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerLiteral__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedDisplayElement__NamedDisplayElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedDisplayElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedDisplayElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedDisplayElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__NullLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NullLiteral__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__ParameterReference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__Operand = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterReference__Variable = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ReduceFunction__ReduceFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReduceFunction__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReduceFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReduceFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReduceFunction__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _SizeFunction__SizeFunction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SizeFunction__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SizeFunction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SizeFunction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SizeFunction__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__StringLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringLiteral__Operand = {};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__TimeLiteral = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__Expression = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__Literal = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeLiteral__Operand = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BooleanLiteral__BooleanLiteral.initOperations(_BooleanLiteral__BooleanLiteral);
			Fragments._BooleanLiteral__Expression.initOperations(_BooleanLiteral__Expression);
			Fragments._BooleanLiteral__Literal.initOperations(_BooleanLiteral__Literal);
			Fragments._BooleanLiteral__OclAny.initOperations(_BooleanLiteral__OclAny);
			Fragments._BooleanLiteral__OclElement.initOperations(_BooleanLiteral__OclElement);
			Fragments._BooleanLiteral__Operand.initOperations(_BooleanLiteral__Operand);

			Fragments._Callable__Callable.initOperations(_Callable__Callable);
			Fragments._Callable__Expression.initOperations(_Callable__Expression);
			Fragments._Callable__FormalParameterList.initOperations(_Callable__FormalParameterList);
			Fragments._Callable__OclAny.initOperations(_Callable__OclAny);
			Fragments._Callable__OclElement.initOperations(_Callable__OclElement);
			Fragments._Callable__Operand.initOperations(_Callable__Operand);

			Fragments._Classifier__Classifier.initOperations(_Classifier__Classifier);
			Fragments._Classifier__NamedDisplayElement.initOperations(_Classifier__NamedDisplayElement);
			Fragments._Classifier__NamedElement.initOperations(_Classifier__NamedElement);
			Fragments._Classifier__OclAny.initOperations(_Classifier__OclAny);
			Fragments._Classifier__OclElement.initOperations(_Classifier__OclElement);

			Fragments._CurrentTime__CurrentTime.initOperations(_CurrentTime__CurrentTime);
			Fragments._CurrentTime__Expression.initOperations(_CurrentTime__Expression);
			Fragments._CurrentTime__OclAny.initOperations(_CurrentTime__OclAny);
			Fragments._CurrentTime__OclElement.initOperations(_CurrentTime__OclElement);
			Fragments._CurrentTime__Operand.initOperations(_CurrentTime__Operand);
			Fragments._CurrentTime__Variable.initOperations(_CurrentTime__Variable);

			Fragments._CurrentUser__CurrentUser.initOperations(_CurrentUser__CurrentUser);
			Fragments._CurrentUser__Expression.initOperations(_CurrentUser__Expression);
			Fragments._CurrentUser__OclAny.initOperations(_CurrentUser__OclAny);
			Fragments._CurrentUser__OclElement.initOperations(_CurrentUser__OclElement);
			Fragments._CurrentUser__Operand.initOperations(_CurrentUser__Operand);
			Fragments._CurrentUser__Variable.initOperations(_CurrentUser__Variable);

			Fragments._DataType__Classifier.initOperations(_DataType__Classifier);
			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__NamedDisplayElement.initOperations(_DataType__NamedDisplayElement);
			Fragments._DataType__NamedElement.initOperations(_DataType__NamedElement);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);

			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__NamedDisplayElement.initOperations(_EnumerationLiteral__NamedDisplayElement);
			Fragments._EnumerationLiteral__NamedElement.initOperations(_EnumerationLiteral__NamedElement);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
			Fragments._EnumerationLiteral__OclElement.initOperations(_EnumerationLiteral__OclElement);

			Fragments._EnumerationType__Classifier.initOperations(_EnumerationType__Classifier);
			Fragments._EnumerationType__DataType.initOperations(_EnumerationType__DataType);
			Fragments._EnumerationType__EnumerationType.initOperations(_EnumerationType__EnumerationType);
			Fragments._EnumerationType__NamedDisplayElement.initOperations(_EnumerationType__NamedDisplayElement);
			Fragments._EnumerationType__NamedElement.initOperations(_EnumerationType__NamedElement);
			Fragments._EnumerationType__OclAny.initOperations(_EnumerationType__OclAny);
			Fragments._EnumerationType__OclElement.initOperations(_EnumerationType__OclElement);

			Fragments._FormalParameter__FormalParameter.initOperations(_FormalParameter__FormalParameter);
			Fragments._FormalParameter__NamedElement.initOperations(_FormalParameter__NamedElement);
			Fragments._FormalParameter__OclAny.initOperations(_FormalParameter__OclAny);
			Fragments._FormalParameter__OclElement.initOperations(_FormalParameter__OclElement);

			Fragments._FormalParameterList__FormalParameterList.initOperations(_FormalParameterList__FormalParameterList);
			Fragments._FormalParameterList__OclAny.initOperations(_FormalParameterList__OclAny);
			Fragments._FormalParameterList__OclElement.initOperations(_FormalParameterList__OclElement);

			Fragments._IntegerLiteral__Expression.initOperations(_IntegerLiteral__Expression);
			Fragments._IntegerLiteral__IntegerLiteral.initOperations(_IntegerLiteral__IntegerLiteral);
			Fragments._IntegerLiteral__Literal.initOperations(_IntegerLiteral__Literal);
			Fragments._IntegerLiteral__OclAny.initOperations(_IntegerLiteral__OclAny);
			Fragments._IntegerLiteral__OclElement.initOperations(_IntegerLiteral__OclElement);
			Fragments._IntegerLiteral__Operand.initOperations(_IntegerLiteral__Operand);

			Fragments._NamedDisplayElement__NamedDisplayElement.initOperations(_NamedDisplayElement__NamedDisplayElement);
			Fragments._NamedDisplayElement__NamedElement.initOperations(_NamedDisplayElement__NamedElement);
			Fragments._NamedDisplayElement__OclAny.initOperations(_NamedDisplayElement__OclAny);
			Fragments._NamedDisplayElement__OclElement.initOperations(_NamedDisplayElement__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._NullLiteral__Expression.initOperations(_NullLiteral__Expression);
			Fragments._NullLiteral__Literal.initOperations(_NullLiteral__Literal);
			Fragments._NullLiteral__NullLiteral.initOperations(_NullLiteral__NullLiteral);
			Fragments._NullLiteral__OclAny.initOperations(_NullLiteral__OclAny);
			Fragments._NullLiteral__OclElement.initOperations(_NullLiteral__OclElement);
			Fragments._NullLiteral__Operand.initOperations(_NullLiteral__Operand);

			Fragments._ParameterReference__Expression.initOperations(_ParameterReference__Expression);
			Fragments._ParameterReference__OclAny.initOperations(_ParameterReference__OclAny);
			Fragments._ParameterReference__OclElement.initOperations(_ParameterReference__OclElement);
			Fragments._ParameterReference__Operand.initOperations(_ParameterReference__Operand);
			Fragments._ParameterReference__ParameterReference.initOperations(_ParameterReference__ParameterReference);
			Fragments._ParameterReference__Variable.initOperations(_ParameterReference__Variable);

			Fragments._ReduceFunction__Expression.initOperations(_ReduceFunction__Expression);
			Fragments._ReduceFunction__OclAny.initOperations(_ReduceFunction__OclAny);
			Fragments._ReduceFunction__OclElement.initOperations(_ReduceFunction__OclElement);
			Fragments._ReduceFunction__Operand.initOperations(_ReduceFunction__Operand);
			Fragments._ReduceFunction__ReduceFunction.initOperations(_ReduceFunction__ReduceFunction);

			Fragments._SizeFunction__Expression.initOperations(_SizeFunction__Expression);
			Fragments._SizeFunction__OclAny.initOperations(_SizeFunction__OclAny);
			Fragments._SizeFunction__OclElement.initOperations(_SizeFunction__OclElement);
			Fragments._SizeFunction__Operand.initOperations(_SizeFunction__Operand);
			Fragments._SizeFunction__SizeFunction.initOperations(_SizeFunction__SizeFunction);

			Fragments._StringLiteral__Expression.initOperations(_StringLiteral__Expression);
			Fragments._StringLiteral__Literal.initOperations(_StringLiteral__Literal);
			Fragments._StringLiteral__OclAny.initOperations(_StringLiteral__OclAny);
			Fragments._StringLiteral__OclElement.initOperations(_StringLiteral__OclElement);
			Fragments._StringLiteral__Operand.initOperations(_StringLiteral__Operand);
			Fragments._StringLiteral__StringLiteral.initOperations(_StringLiteral__StringLiteral);

			Fragments._TimeLiteral__Expression.initOperations(_TimeLiteral__Expression);
			Fragments._TimeLiteral__Literal.initOperations(_TimeLiteral__Literal);
			Fragments._TimeLiteral__OclAny.initOperations(_TimeLiteral__OclAny);
			Fragments._TimeLiteral__OclElement.initOperations(_TimeLiteral__OclElement);
			Fragments._TimeLiteral__Operand.initOperations(_TimeLiteral__Operand);
			Fragments._TimeLiteral__TimeLiteral.initOperations(_TimeLiteral__TimeLiteral);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanLiteral = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._BooleanLiteral__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Callable = {
			BaseTables.Properties._Callable__body,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._FormalParameterList__parameters,
			ExpressionTables.Properties._Expression__rootContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Classifier = {
			BaseTables.Properties._NamedDisplayElement__displayLabel,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CurrentTime = {
			BaseTables.Properties._CurrentTime__format,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CurrentUser = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			BaseTables.Properties._NamedDisplayElement__displayLabel,
			BaseTables.Properties._DataType__interfaceType,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._DataType__ormType,
			BaseTables.Properties._DataType__persistentType,
			BaseTables.Properties._DataType__validationPattern,
			BaseTables.Properties._DataType__wafType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnumerationLiteral = {
			BaseTables.Properties._NamedDisplayElement__displayLabel,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnumerationType = {
			BaseTables.Properties._NamedDisplayElement__displayLabel,
			BaseTables.Properties._EnumerationType__enumerations,
			BaseTables.Properties._DataType__interfaceType,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._DataType__ormType,
			BaseTables.Properties._DataType__persistentType,
			BaseTables.Properties._DataType__validationPattern,
			BaseTables.Properties._DataType__wafType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FormalParameter = {
			BaseTables.Properties._FormalParameter__dataType,
			BaseTables.Properties._FormalParameter__defaultValue,
			BaseTables.Properties._FormalParameter__description,
			BaseTables.Properties._FormalParameter__formalFor,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._FormalParameter__placeholder
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FormalParameterList = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._FormalParameterList__parameters
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerLiteral = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._IntegerLiteral__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedDisplayElement = {
			BaseTables.Properties._NamedDisplayElement__displayLabel,
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			BaseTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NullLiteral = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParameterReference = {
			BaseTables.Properties._ParameterReference__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			BaseTables.Properties._ParameterReference__parameter,
			ExpressionTables.Properties._Expression__rootContainer
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReduceFunction = {
			BaseTables.Properties._ReduceFunction__callback,
			BaseTables.Properties._ReduceFunction__initial,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._ReduceFunction__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SizeFunction = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._SizeFunction__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringLiteral = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._StringLiteral__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeLiteral = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ExpressionTables.Properties._Expression__rootContainer,
			BaseTables.Properties._TimeLiteral__value
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BooleanLiteral__BooleanLiteral.initProperties(_BooleanLiteral);
			Fragments._Callable__Callable.initProperties(_Callable);
			Fragments._Classifier__Classifier.initProperties(_Classifier);
			Fragments._CurrentTime__CurrentTime.initProperties(_CurrentTime);
			Fragments._CurrentUser__CurrentUser.initProperties(_CurrentUser);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
			Fragments._EnumerationType__EnumerationType.initProperties(_EnumerationType);
			Fragments._FormalParameter__FormalParameter.initProperties(_FormalParameter);
			Fragments._FormalParameterList__FormalParameterList.initProperties(_FormalParameterList);
			Fragments._IntegerLiteral__IntegerLiteral.initProperties(_IntegerLiteral);
			Fragments._NamedDisplayElement__NamedDisplayElement.initProperties(_NamedDisplayElement);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._NullLiteral__NullLiteral.initProperties(_NullLiteral);
			Fragments._ParameterReference__ParameterReference.initProperties(_ParameterReference);
			Fragments._ReduceFunction__ReduceFunction.initProperties(_ReduceFunction);
			Fragments._SizeFunction__SizeFunction.initProperties(_SizeFunction);
			Fragments._StringLiteral__StringLiteral.initProperties(_StringLiteral);
			Fragments._TimeLiteral__TimeLiteral.initProperties(_TimeLiteral);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of BaseTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new BaseTables();
	}

	private BaseTables() {
		super(BasePackage.eNS_URI);
	}
}
