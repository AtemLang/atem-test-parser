// Generated from d:\Repos\atem-test\grammar\AtemParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KeywordAbstract=1, KeywordAlias=2, KeywordAnd=3, KeywordAny=4, KeywordAs=5, 
		KeywordAsm=6, KeywordAssert=7, KeywordAsync=8, KeywordAt=9, KeywordAwait=10, 
		KeywordBool=11, KeywordBreak=12, KeywordByte=13, KeywordCase=14, KeywordCatch=15, 
		KeywordChar8=16, KeywordChar16=17, KeywordChar32=18, KeywordClass=19, 
		KeywordCompileTimeInt=20, KeywordCompileTimeFloat=21, KeywordCompileTimeString=22, 
		KeywordCompileTimeChar=23, KeywordComptime=24, KeywordConcept=25, KeywordConst=26, 
		KeywordContinue=27, KeywordDefault=28, KeywordDefer=29, KeywordDeinit=30, 
		KeywordDelete=31, KeywordDo=32, KeywordDyn=33, KeywordElse=34, KeywordEnsure=35, 
		KeywordEnum=36, KeywordExpect=37, KeywordExtend=38, KeywordExtern=39, 
		KeywordFail=40, KeywordFallthrough=41, KeywordFalse=42, KeywordFilePrivate=43, 
		KeywordFinal=44, KeywordFloat16=45, KeywordFloat32=46, KeywordFloat64=47, 
		KeywordFloat80=48, KeywordFloat128=49, KeywordFor=50, KeywordForward=51, 
		KeywordFunc=52, KeywordGet=53, KeywordGlobal=54, KeywordIf=55, KeywordImpl=56, 
		KeywordImport=57, KeywordIn=58, KeywordInherit=59, KeywordInline=60, KeywordInit=61, 
		KeywordInt8=62, KeywordInt16=63, KeywordInt32=64, KeywordInt64=65, KeywordInt128=66, 
		KeywordInternal=67, KeywordIs=68, KeywordLazy=69, KeywordLet=70, KeywordMatch=71, 
		KeywordMember=72, KeywordModule=73, KeywordMutable=74, KeywordNamespace=75, 
		KeywordNew=76, KeywordNever=77, KeywordNot=78, KeywordNull=79, KeywordOpaque=80, 
		KeywordOpen=81, KeywordOperator=82, KeywordOr=83, KeywordOuter=84, KeywordOverride=85, 
		KeywordPackage=86, KeywordPrivate=87, KeywordProject=88, KeywordProtocol=89, 
		KeywordPublic=90, KeywordPure=91, KeywordRecursive=92, KeywordReloc=93, 
		KeywordRequire=94, KeywordRepeat=95, KeywordReturn=96, KeywordSelf=97, 
		KeywordSet=98, KeywordSome=99, KeywordStatic=100, KeywordString=101, KeywordStruct=102, 
		KeywordSuccess=103, KeywordSuper=104, KeywordThen=105, KeywordThis=106, 
		KeywordThreadLocal=107, KeywordThrow=108, KeywordThrows=109, KeywordTrue=110, 
		KeywordTry=111, KeywordType=112, KeywordUInt8=113, KeywordUInt16=114, 
		KeywordUInt32=115, KeywordUInt64=116, KeywordUInt128=117, KeywordUndefined=118, 
		KeywordUnion=119, KeywordUnit=120, KeywordUnreachable=121, KeywordUse=122, 
		KeywordUsing=123, KeywordVal=124, KeywordVar=125, KeywordVirtual=126, 
		KeywordWhile=127, KeywordWith=128, Identifier=129, BinaryLiteral=130, 
		OctalLiteral=131, DecimalDigits=132, DecimalLiteral=133, HexadecimalLiteral=134, 
		FloatingPointLiteral=135, LeftCurly=136, RightCurly=137, LeftParenthese=138, 
		RightParenthese=139, LeftSquare=140, RightSquare=141, Dot=142, Colon=143, 
		Semicolon=144, Comma=145, At=146, Question=147, Bang=148, Underscore=149, 
		Add=150, OverflowingAdd=151, SaturatingAdd=152, Sub=153, OverflowingSub=154, 
		SaturatingSub=155, Mul=156, OverflowingMul=157, SaturatingMul=158, Divide=159, 
		RemainderDivide=160, Power=161, OverflowingPower=162, SaturatingPower=163, 
		Assign=164, AddAssign=165, OverflowingAddAssign=166, SaturatingAddAssign=167, 
		SubAssign=168, OverflowingSubAssign=169, SaturatingSubAssign=170, MulAssign=171, 
		OverflowingMulAssign=172, SaturatingMulAssign=173, PowerAssign=174, OverflowingPowerAssign=175, 
		SaturatingPowerAssign=176, DivideAssign=177, RemainderDivideAssign=178, 
		BitLeftShiftAssign=179, SaturatingBitLeftShiftAssign=180, BitRightShiftAssign=181, 
		BitAndAssign=182, BitOrAssign=183, BitNotAssign=184, GreaterThan=185, 
		LessThan=186, GreaterThanOrEqual=187, LessThanOrEqual=188, NotEqual=189, 
		Equal=190, ThreeWayComparison=191, BitNot=192, BitAnd=193, BitOr=194, 
		BitXor=195, BitLeftShift=196, SaturatingBitLeftShift=197, BitRightShift=198, 
		PointerType=199, PointerDeref=200, ObjectAddress=201, Reflect=202, Reify=203, 
		ClosedRange=204, RightOpenRange=205, LeftOpenRange=206, OpenedRange=207, 
		DefaultUnwrapping=208, Arrow=209, PlaceholderPipeline=210, LeftThreadingPipeline=211, 
		OperatorHeadOther=212, OperatorFollowingCharacter=213, Whitespace=214, 
		Newline=215, LineComment=216, InnerLineDocComment=217, OuterLineDocComment=218, 
		BlockComment=219, InnerBlockComment=220, OuterBlockComment=221, BlockCommentOrDoc=222, 
		MultiLineExtendedStringOpen=223, SingleLineExtendedStringOpen=224, MultiLineStringOpen=225, 
		SingleLineStringOpen=226, InterpolataionSingleLine=227, SingleLineStringClose=228, 
		QuotedSingleLineText=229, InterpolataionMultiLine=230, MultiLineStringClose=231, 
		QuotedMultiLineText=232, SingleLineExtendedStringClose=233, QuotedSingleLineExtendedText=234, 
		MultiLineExtendedStringClose=235, QuotedMultiLineExtendedText=236;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_statements = 2, RULE_declaration_statement_or_list = 3, 
		RULE_declaration_statement_list = 4, RULE_declaration_statement = 5, RULE_declarator = 6, 
		RULE_declare_operator = 7, RULE_empty_declare_operator = 8, RULE_declarator_name = 9, 
		RULE_declaration_expression = 10, RULE_struct_declaration = 11, RULE_class_declaration = 12, 
		RULE_final_specifier = 13, RULE_member_specifier = 14, RULE_member_specifiers = 15, 
		RULE_extension_list = 16, RULE_extension_item = 17, RULE_inherit_clause = 18, 
		RULE_inherit_list = 19, RULE_inherit_item = 20, RULE_inherit_items = 21, 
		RULE_inherit_member_list = 22, RULE_inherit_member = 23, RULE_inherit_members = 24, 
		RULE_inherit_type_override = 25, RULE_inherit_variable_override = 26, 
		RULE_inherit_constant_override = 27, RULE_inherit_function_override = 28, 
		RULE_inherit_initializer_override = 29, RULE_inherit_deinitializer_override = 30, 
		RULE_inherit_declarator = 31, RULE_empty_inherit_declarator = 32, RULE_inherit_name = 33, 
		RULE_impl_clause = 34, RULE_impl_list = 35, RULE_impl_item = 36, RULE_impl_items = 37, 
		RULE_impl_with_clause = 38, RULE_impl_member_list = 39, RULE_impl_member = 40, 
		RULE_impl_members = 41, RULE_associated_type_impl = 42, RULE_associated_variable_impl = 43, 
		RULE_associated_constant_impl = 44, RULE_associated_function_impl = 45, 
		RULE_associated_initializer_impl = 46, RULE_associated_deinitializer_impl = 47, 
		RULE_associated_declarator = 48, RULE_empty_associated_declarator = 49, 
		RULE_associated_name = 50, RULE_initializer_list = 51, RULE_initializer_member_list = 52, 
		RULE_initializer_member = 53, RULE_initializer_type = 54, RULE_initializer_members = 55, 
		RULE_deinitializer_list = 56, RULE_deinitializer_member_list = 57, RULE_deinitializer_member = 58, 
		RULE_deinitializer_type = 59, RULE_deinitializer_members = 60, RULE_member_list = 61, 
		RULE_member = 62, RULE_members = 63, RULE_member_nested_type = 64, RULE_nested_class = 65, 
		RULE_nested_struct = 66, RULE_nested_protocol = 67, RULE_nested_union = 68, 
		RULE_nested_enum = 69, RULE_member_type = 70, RULE_member_variable = 71, 
		RULE_member_constant = 72, RULE_member_function = 73, RULE_member_declarator = 74, 
		RULE_member_name = 75, RULE_getter_and_setter_list = 76, RULE_getter_list = 77, 
		RULE_getter_and_setter_item = 78, RULE_getter_and_setter_items = 79, RULE_getter_declaration = 80, 
		RULE_getter_type = 81, RULE_setter_declaration = 82, RULE_setter_type = 83, 
		RULE_setter_parameter_clause = 84, RULE_setter_parameter = 85, RULE_setter_parameter_name = 86, 
		RULE_protocol_declaration = 87, RULE_protocol_extend_list = 88, RULE_protocol_requirement_list = 89, 
		RULE_protocol_requirement_item = 90, RULE_protocol_requirement_items = 91, 
		RULE_protocol_requirement_type = 92, RULE_protocol_requirement_function = 93, 
		RULE_protocol_requirement_variable = 94, RULE_protocol_requirement_constant = 95, 
		RULE_protocol_requirement_initializer = 96, RULE_protocol_requirement_deinitializer = 97, 
		RULE_requirement_declarator = 98, RULE_empty_requirement_declarator = 99, 
		RULE_requirement_name = 100, RULE_requirement_default_clause = 101, RULE_requirement_getter_and_setter = 102, 
		RULE_requirement_getter = 103, RULE_requirement_getter_and_setter_item = 104, 
		RULE_initializer_declaration = 105, RULE_deinitializer_declaration = 106, 
		RULE_union_declaration = 107, RULE_enum_declaration = 108, RULE_enumerator_list = 109, 
		RULE_enumeration_item = 110, RULE_enumerator = 111, RULE_enumerator_associated_value_clause = 112, 
		RULE_enumerator_associated_value_list = 113, RULE_enumerator_associated_value = 114, 
		RULE_enumerator_associated_value_name = 115, RULE_enumerator_representation = 116, 
		RULE_enumerator_name = 117, RULE_import_alias_declaration = 118, RULE_import_expression = 119, 
		RULE_import_statement = 120, RULE_import_path_expression_list = 121, RULE_import_path_expression = 122, 
		RULE_import_path_expression_element = 123, RULE_import_element_list = 124, 
		RULE_import_kind = 125, RULE_project_declaration = 126, RULE_project_member_list = 127, 
		RULE_project_member = 128, RULE_project_members = 129, RULE_package_declaration = 130, 
		RULE_package_member_list = 131, RULE_package_member = 132, RULE_package_members = 133, 
		RULE_module_declaration = 134, RULE_namespace_declaration = 135, RULE_typealias_declaration = 136, 
		RULE_access_level_specifier = 137, RULE_function_declaration = 138, RULE_function_body = 139, 
		RULE_contract_list = 140, RULE_contract = 141, RULE_contract_precondition = 142, 
		RULE_contract_postcondition = 143, RULE_return_value_name = 144, RULE_function_name = 145, 
		RULE_function_type = 146, RULE_function_specifier = 147, RULE_function_specifiers = 148, 
		RULE_function_result = 149, RULE_function_parameter_clause = 150, RULE_function_parameter_list = 151, 
		RULE_function_parameter = 152, RULE_function_parameter_label = 153, RULE_function_parameter_name = 154, 
		RULE_default_argument_clause = 155, RULE_type_annotation = 156, RULE_variable_declaration = 157, 
		RULE_constant_declaration = 158, RULE_storage_level_specifier = 159, RULE_closure_expression = 160, 
		RULE_capture_list = 161, RULE_capture_list_items = 162, RULE_capture_list_item = 163, 
		RULE_defer_statement = 164, RULE_defer_kind = 165, RULE_code_block_no_label = 166, 
		RULE_code_block = 167, RULE_code_block_name = 168, RULE_attribute = 169, 
		RULE_attributes = 170, RULE_attribute_name = 171, RULE_function_call_operator = 172, 
		RULE_function_call_argument_clause = 173, RULE_function_call_argument_list = 174, 
		RULE_function_call_argument = 175, RULE_argument_name = 176, RULE_argument_names = 177, 
		RULE_trailing_closures = 178, RULE_labeled_trailing_closure = 179, RULE_labeled_trailing_closures = 180, 
		RULE_arithmetic_operator = 181, RULE_negation_operator = 182, RULE_assignment_operator = 183, 
		RULE_comparison_operator = 184, RULE_binary_boolean_operator = 185, RULE_unary_boolean_operator = 186, 
		RULE_binary_bit_operator = 187, RULE_unary_bit_operator = 188, RULE_pointer_operator = 189, 
		RULE_reflect_operator = 190, RULE_range_operator = 191, RULE_binary_optional_unwrapping_operator = 192, 
		RULE_unary_optional_unwrapping_operator = 193, RULE_arrow_operator = 194, 
		RULE_try_operator = 195, RULE_type_casting_operator = 196, RULE_await_operator = 197, 
		RULE_async_operator = 198, RULE_pipeline_operator = 199, RULE_expression = 200, 
		RULE_code_block_expression = 201, RULE_require_clause = 202, RULE_then_expression_or_block = 203, 
		RULE_expression_or_block = 204, RULE_if_expression = 205, RULE_while_expression = 206, 
		RULE_repeat_while_expression = 207, RULE_for_expression = 208, RULE_match_case = 209, 
		RULE_match_case_label = 210, RULE_match_item_list = 211, RULE_type_expression = 212, 
		RULE_basic_type = 213, RULE_collection_type = 214, RULE_never_type = 215, 
		RULE_tuple_type = 216, RULE_tuple_type_element = 217, RULE_optional_type = 218, 
		RULE_any_type = 219, RULE_some_type = 220, RULE_static_array_type = 221, 
		RULE_dynamic_array_type = 222, RULE_map_type = 223, RULE_set_type = 224, 
		RULE_simple_type = 225, RULE_integer_type = 226, RULE_floating_point_type = 227, 
		RULE_boolean_type = 228, RULE_byte_type = 229, RULE_unit_type = 230, RULE_character_type = 231, 
		RULE_string_type = 232, RULE_comptime_type = 233, RULE_type_type = 234, 
		RULE_tuple_expression = 235, RULE_tuple_element_list = 236, RULE_tuple_element = 237, 
		RULE_path_expression = 238, RULE_path_expression_element = 239, RULE_literal_expression = 240, 
		RULE_literal = 241, RULE_numeric_literal = 242, RULE_integer_literal = 243, 
		RULE_floating_point_literal = 244, RULE_boolean_literal = 245, RULE_null_literal = 246, 
		RULE_undefined_literal = 247, RULE_default_literal = 248, RULE_array_literal = 249, 
		RULE_string_literal = 250, RULE_extended_string_literal = 251, RULE_static_string_literal = 252, 
		RULE_interpolated_string_literal = 253, RULE_pattern = 254, RULE_tuple_pattern_element_list = 255, 
		RULE_tuple_pattern_element = 256, RULE_wildcard_pattern = 257, RULE_identifier_pattern = 258, 
		RULE_value_binding_pattern = 259, RULE_tuple_pattern = 260, RULE_enumerator_pattern = 261, 
		RULE_optional_pattern = 262, RULE_expression_pattern = 263;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "statements", "declaration_statement_or_list", 
			"declaration_statement_list", "declaration_statement", "declarator", 
			"declare_operator", "empty_declare_operator", "declarator_name", "declaration_expression", 
			"struct_declaration", "class_declaration", "final_specifier", "member_specifier", 
			"member_specifiers", "extension_list", "extension_item", "inherit_clause", 
			"inherit_list", "inherit_item", "inherit_items", "inherit_member_list", 
			"inherit_member", "inherit_members", "inherit_type_override", "inherit_variable_override", 
			"inherit_constant_override", "inherit_function_override", "inherit_initializer_override", 
			"inherit_deinitializer_override", "inherit_declarator", "empty_inherit_declarator", 
			"inherit_name", "impl_clause", "impl_list", "impl_item", "impl_items", 
			"impl_with_clause", "impl_member_list", "impl_member", "impl_members", 
			"associated_type_impl", "associated_variable_impl", "associated_constant_impl", 
			"associated_function_impl", "associated_initializer_impl", "associated_deinitializer_impl", 
			"associated_declarator", "empty_associated_declarator", "associated_name", 
			"initializer_list", "initializer_member_list", "initializer_member", 
			"initializer_type", "initializer_members", "deinitializer_list", "deinitializer_member_list", 
			"deinitializer_member", "deinitializer_type", "deinitializer_members", 
			"member_list", "member", "members", "member_nested_type", "nested_class", 
			"nested_struct", "nested_protocol", "nested_union", "nested_enum", "member_type", 
			"member_variable", "member_constant", "member_function", "member_declarator", 
			"member_name", "getter_and_setter_list", "getter_list", "getter_and_setter_item", 
			"getter_and_setter_items", "getter_declaration", "getter_type", "setter_declaration", 
			"setter_type", "setter_parameter_clause", "setter_parameter", "setter_parameter_name", 
			"protocol_declaration", "protocol_extend_list", "protocol_requirement_list", 
			"protocol_requirement_item", "protocol_requirement_items", "protocol_requirement_type", 
			"protocol_requirement_function", "protocol_requirement_variable", "protocol_requirement_constant", 
			"protocol_requirement_initializer", "protocol_requirement_deinitializer", 
			"requirement_declarator", "empty_requirement_declarator", "requirement_name", 
			"requirement_default_clause", "requirement_getter_and_setter", "requirement_getter", 
			"requirement_getter_and_setter_item", "initializer_declaration", "deinitializer_declaration", 
			"union_declaration", "enum_declaration", "enumerator_list", "enumeration_item", 
			"enumerator", "enumerator_associated_value_clause", "enumerator_associated_value_list", 
			"enumerator_associated_value", "enumerator_associated_value_name", "enumerator_representation", 
			"enumerator_name", "import_alias_declaration", "import_expression", "import_statement", 
			"import_path_expression_list", "import_path_expression", "import_path_expression_element", 
			"import_element_list", "import_kind", "project_declaration", "project_member_list", 
			"project_member", "project_members", "package_declaration", "package_member_list", 
			"package_member", "package_members", "module_declaration", "namespace_declaration", 
			"typealias_declaration", "access_level_specifier", "function_declaration", 
			"function_body", "contract_list", "contract", "contract_precondition", 
			"contract_postcondition", "return_value_name", "function_name", "function_type", 
			"function_specifier", "function_specifiers", "function_result", "function_parameter_clause", 
			"function_parameter_list", "function_parameter", "function_parameter_label", 
			"function_parameter_name", "default_argument_clause", "type_annotation", 
			"variable_declaration", "constant_declaration", "storage_level_specifier", 
			"closure_expression", "capture_list", "capture_list_items", "capture_list_item", 
			"defer_statement", "defer_kind", "code_block_no_label", "code_block", 
			"code_block_name", "attribute", "attributes", "attribute_name", "function_call_operator", 
			"function_call_argument_clause", "function_call_argument_list", "function_call_argument", 
			"argument_name", "argument_names", "trailing_closures", "labeled_trailing_closure", 
			"labeled_trailing_closures", "arithmetic_operator", "negation_operator", 
			"assignment_operator", "comparison_operator", "binary_boolean_operator", 
			"unary_boolean_operator", "binary_bit_operator", "unary_bit_operator", 
			"pointer_operator", "reflect_operator", "range_operator", "binary_optional_unwrapping_operator", 
			"unary_optional_unwrapping_operator", "arrow_operator", "try_operator", 
			"type_casting_operator", "await_operator", "async_operator", "pipeline_operator", 
			"expression", "code_block_expression", "require_clause", "then_expression_or_block", 
			"expression_or_block", "if_expression", "while_expression", "repeat_while_expression", 
			"for_expression", "match_case", "match_case_label", "match_item_list", 
			"type_expression", "basic_type", "collection_type", "never_type", "tuple_type", 
			"tuple_type_element", "optional_type", "any_type", "some_type", "static_array_type", 
			"dynamic_array_type", "map_type", "set_type", "simple_type", "integer_type", 
			"floating_point_type", "boolean_type", "byte_type", "unit_type", "character_type", 
			"string_type", "comptime_type", "type_type", "tuple_expression", "tuple_element_list", 
			"tuple_element", "path_expression", "path_expression_element", "literal_expression", 
			"literal", "numeric_literal", "integer_literal", "floating_point_literal", 
			"boolean_literal", "null_literal", "undefined_literal", "default_literal", 
			"array_literal", "string_literal", "extended_string_literal", "static_string_literal", 
			"interpolated_string_literal", "pattern", "tuple_pattern_element_list", 
			"tuple_pattern_element", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
			"tuple_pattern", "enumerator_pattern", "optional_pattern", "expression_pattern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'alias'", "'and'", "'any'", "'as'", "'asm'", "'assert'", 
			"'async'", "'at'", "'await'", "'Bool'", "'break'", "'Byte'", "'case'", 
			"'catch'", "'Char8'", "'Char16'", "'Char32'", "'class'", "'CompileTimeInt'", 
			"'CompileTimeFloat'", "'CompileTimeString'", "'CompileTimeChar'", "'comptime'", 
			"'concept'", "'const'", "'continue'", "'default'", "'defer'", "'deinit'", 
			"'delete'", "'do'", "'dyn'", "'else'", "'ensure'", "'enum'", "'expect'", 
			"'extend'", "'extern'", "'fail'", "'fallthrough'", "'false'", "'filePrivate'", 
			"'final'", "'Float16'", "'Float32'", "'Float64'", "'Float80'", "'Float128'", 
			"'for'", "'forward'", "'func'", "'get'", "'global'", "'if'", "'impl'", 
			"'import'", "'in'", "'inherit'", "'inline'", "'init'", "'Int8'", "'Int16'", 
			"'Int32'", "'Int64'", "'Int128'", "'internal'", "'is'", "'lazy'", "'let'", 
			"'match'", "'member'", "'module'", "'mutable'", "'namespace'", "'new'", 
			"'Never'", "'not'", "'null'", "'opaque'", "'open'", "'operator'", "'or'", 
			"'outer'", "'override'", "'package'", "'private'", "'project'", "'protocol'", 
			"'public'", "'pure'", "'recursive'", "'reloc'", "'require'", "'repeat'", 
			"'return'", "'self'", "'set'", "'some'", "'static'", "'String'", "'struct'", 
			"'success'", "'super'", "'then'", "'this'", "'threadLocal'", "'throw'", 
			"'throws'", "'true'", "'try'", "'type'", "'UInt8'", "'UInt16'", "'UInt32'", 
			"'UInt64'", "'UInt128'", "'undefined'", "'union'", "'Unit'", "'unreachable'", 
			"'use'", "'using'", "'val'", "'var'", "'virtual'", "'while'", "'with'", 
			null, null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'.'", "':'", "';'", "','", "'@'", "'?'", "'!'", "'_'", 
			"'+'", "'+&'", "'+|'", "'-'", "'-&'", "'-|'", "'*'", "'*&'", "'*|'", 
			"'/'", "'%'", "'**'", "'**&'", "'**|'", "'='", "'+='", "'+&='", "'+|='", 
			"'-='", "'-&='", "'-|='", "'*='", "'*&='", "'*|='", "'**='", "'**&='", 
			"'**|='", "'/='", "'%='", "'<<='", "'<<|='", "'>>='", "'&='", "'|='", 
			"'~='", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'<=>'", "'~'", 
			"'&'", "'|'", "'^^'", "'<<'", "'<<|'", "'>>'", "'.&'", "'.*'", "'.@'", 
			"'^'", "'#'", "'...'", "'..<'", "'<..'", "'<.<'", "'??'", "'->'", "'|>'", 
			"'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KeywordAbstract", "KeywordAlias", "KeywordAnd", "KeywordAny", 
			"KeywordAs", "KeywordAsm", "KeywordAssert", "KeywordAsync", "KeywordAt", 
			"KeywordAwait", "KeywordBool", "KeywordBreak", "KeywordByte", "KeywordCase", 
			"KeywordCatch", "KeywordChar8", "KeywordChar16", "KeywordChar32", "KeywordClass", 
			"KeywordCompileTimeInt", "KeywordCompileTimeFloat", "KeywordCompileTimeString", 
			"KeywordCompileTimeChar", "KeywordComptime", "KeywordConcept", "KeywordConst", 
			"KeywordContinue", "KeywordDefault", "KeywordDefer", "KeywordDeinit", 
			"KeywordDelete", "KeywordDo", "KeywordDyn", "KeywordElse", "KeywordEnsure", 
			"KeywordEnum", "KeywordExpect", "KeywordExtend", "KeywordExtern", "KeywordFail", 
			"KeywordFallthrough", "KeywordFalse", "KeywordFilePrivate", "KeywordFinal", 
			"KeywordFloat16", "KeywordFloat32", "KeywordFloat64", "KeywordFloat80", 
			"KeywordFloat128", "KeywordFor", "KeywordForward", "KeywordFunc", "KeywordGet", 
			"KeywordGlobal", "KeywordIf", "KeywordImpl", "KeywordImport", "KeywordIn", 
			"KeywordInherit", "KeywordInline", "KeywordInit", "KeywordInt8", "KeywordInt16", 
			"KeywordInt32", "KeywordInt64", "KeywordInt128", "KeywordInternal", "KeywordIs", 
			"KeywordLazy", "KeywordLet", "KeywordMatch", "KeywordMember", "KeywordModule", 
			"KeywordMutable", "KeywordNamespace", "KeywordNew", "KeywordNever", "KeywordNot", 
			"KeywordNull", "KeywordOpaque", "KeywordOpen", "KeywordOperator", "KeywordOr", 
			"KeywordOuter", "KeywordOverride", "KeywordPackage", "KeywordPrivate", 
			"KeywordProject", "KeywordProtocol", "KeywordPublic", "KeywordPure", 
			"KeywordRecursive", "KeywordReloc", "KeywordRequire", "KeywordRepeat", 
			"KeywordReturn", "KeywordSelf", "KeywordSet", "KeywordSome", "KeywordStatic", 
			"KeywordString", "KeywordStruct", "KeywordSuccess", "KeywordSuper", "KeywordThen", 
			"KeywordThis", "KeywordThreadLocal", "KeywordThrow", "KeywordThrows", 
			"KeywordTrue", "KeywordTry", "KeywordType", "KeywordUInt8", "KeywordUInt16", 
			"KeywordUInt32", "KeywordUInt64", "KeywordUInt128", "KeywordUndefined", 
			"KeywordUnion", "KeywordUnit", "KeywordUnreachable", "KeywordUse", "KeywordUsing", 
			"KeywordVal", "KeywordVar", "KeywordVirtual", "KeywordWhile", "KeywordWith", 
			"Identifier", "BinaryLiteral", "OctalLiteral", "DecimalDigits", "DecimalLiteral", 
			"HexadecimalLiteral", "FloatingPointLiteral", "LeftCurly", "RightCurly", 
			"LeftParenthese", "RightParenthese", "LeftSquare", "RightSquare", "Dot", 
			"Colon", "Semicolon", "Comma", "At", "Question", "Bang", "Underscore", 
			"Add", "OverflowingAdd", "SaturatingAdd", "Sub", "OverflowingSub", "SaturatingSub", 
			"Mul", "OverflowingMul", "SaturatingMul", "Divide", "RemainderDivide", 
			"Power", "OverflowingPower", "SaturatingPower", "Assign", "AddAssign", 
			"OverflowingAddAssign", "SaturatingAddAssign", "SubAssign", "OverflowingSubAssign", 
			"SaturatingSubAssign", "MulAssign", "OverflowingMulAssign", "SaturatingMulAssign", 
			"PowerAssign", "OverflowingPowerAssign", "SaturatingPowerAssign", "DivideAssign", 
			"RemainderDivideAssign", "BitLeftShiftAssign", "SaturatingBitLeftShiftAssign", 
			"BitRightShiftAssign", "BitAndAssign", "BitOrAssign", "BitNotAssign", 
			"GreaterThan", "LessThan", "GreaterThanOrEqual", "LessThanOrEqual", "NotEqual", 
			"Equal", "ThreeWayComparison", "BitNot", "BitAnd", "BitOr", "BitXor", 
			"BitLeftShift", "SaturatingBitLeftShift", "BitRightShift", "PointerType", 
			"PointerDeref", "ObjectAddress", "Reflect", "Reify", "ClosedRange", "RightOpenRange", 
			"LeftOpenRange", "OpenedRange", "DefaultUnwrapping", "Arrow", "PlaceholderPipeline", 
			"LeftThreadingPipeline", "OperatorHeadOther", "OperatorFollowingCharacter", 
			"Whitespace", "Newline", "LineComment", "InnerLineDocComment", "OuterLineDocComment", 
			"BlockComment", "InnerBlockComment", "OuterBlockComment", "BlockCommentOrDoc", 
			"MultiLineExtendedStringOpen", "SingleLineExtendedStringOpen", "MultiLineStringOpen", 
			"SingleLineStringOpen", "InterpolataionSingleLine", "SingleLineStringClose", 
			"QuotedSingleLineText", "InterpolataionMultiLine", "MultiLineStringClose", 
			"QuotedMultiLineText", "SingleLineExtendedStringClose", "QuotedSingleLineExtendedText", 
			"MultiLineExtendedStringClose", "QuotedMultiLineExtendedText"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AtemParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AtemParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordDefer) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFilePrivate) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordInternal - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOpen - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordPrivate - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordPublic - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordStatic - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThreadLocal - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Semicolon - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0)) {
				{
				setState(528);
				statements();
				}
			}

			setState(531);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Import_statementContext import_statement() {
			return getRuleContext(Import_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(AtemParser.Semicolon, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAlias:
			case KeywordAny:
			case KeywordAssert:
			case KeywordAsync:
			case KeywordAwait:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordClass:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordDefault:
			case KeywordDefer:
			case KeywordEnum:
			case KeywordFallthrough:
			case KeywordFalse:
			case KeywordFilePrivate:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordFunc:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordImport:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordInternal:
			case KeywordModule:
			case KeywordNamespace:
			case KeywordNever:
			case KeywordNot:
			case KeywordNull:
			case KeywordOpen:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordPrivate:
			case KeywordProject:
			case KeywordProtocol:
			case KeywordPublic:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordStatic:
			case KeywordString:
			case KeywordStruct:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThreadLocal:
			case KeywordThrow:
			case KeywordTrue:
			case KeywordTry:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUndefined:
			case KeywordUnion:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordUse:
			case KeywordUsing:
			case KeywordVal:
			case KeywordVar:
			case KeywordWhile:
			case Identifier:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalDigits:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Dot:
			case Question:
			case Sub:
			case OverflowingSub:
			case RemainderDivide:
			case BitNot:
			case BitXor:
			case Reflect:
			case Reify:
			case MultiLineExtendedStringOpen:
			case SingleLineExtendedStringOpen:
			case MultiLineStringOpen:
			case SingleLineStringOpen:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(533);
					declaration_statement();
					}
					break;
				case 2:
					{
					setState(534);
					import_statement();
					}
					break;
				case 3:
					{
					setState(535);
					defer_statement();
					}
					break;
				case 4:
					{
					setState(536);
					expression(0);
					}
					break;
				}
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(539);
					match(Semicolon);
					}
					break;
				}
				}
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(545);
				statement();
				}
				}
				setState(548); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordDefer) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFilePrivate) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordInternal - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOpen - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordPrivate - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordPublic - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordStatic - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThreadLocal - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Semicolon - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_statement_or_listContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Declaration_statement_listContext declaration_statement_list() {
			return getRuleContext(Declaration_statement_listContext.class,0);
		}
		public Declaration_statement_or_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement_or_list; }
	}

	public final Declaration_statement_or_listContext declaration_statement_or_list() throws RecognitionException {
		Declaration_statement_or_listContext _localctx = new Declaration_statement_or_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration_statement_or_list);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordFilePrivate:
			case KeywordGlobal:
			case KeywordInternal:
			case KeywordModule:
			case KeywordOpen:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordPrivate:
			case KeywordPublic:
			case KeywordSelf:
			case KeywordStatic:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				declaration_statement();
				}
				break;
			case LeftCurly:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				declaration_statement_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_statement_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public List<Declaration_statementContext> declaration_statement() {
			return getRuleContexts(Declaration_statementContext.class);
		}
		public Declaration_statementContext declaration_statement(int i) {
			return getRuleContext(Declaration_statementContext.class,i);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Declaration_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement_list; }
	}

	public final Declaration_statement_listContext declaration_statement_list() throws RecognitionException {
		Declaration_statement_listContext _localctx = new Declaration_statement_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_statement_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(LeftCurly);
			setState(555);
			declaration_statement();
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(Comma);
					setState(557);
					declaration_statement();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(563);
				match(Comma);
				}
			}

			setState(566);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_statementContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_expressionContext declaration_expression() {
			return getRuleContext(Declaration_expressionContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			declarator();
			setState(569);
			declaration_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Declarator_nameContext declarator_name() {
			return getRuleContext(Declarator_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(571);
				access_level_specifier();
				}
			}

			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(574);
				storage_level_specifier();
				}
				break;
			}
			setState(577);
			declarator_name();
			setState(578);
			declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_operatorContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declare_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_operator; }
	}

	public final Declare_operatorContext declare_operator() throws RecognitionException {
		Declare_operatorContext _localctx = new Declare_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Colon);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAny) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (At - 129)) | (1L << (Question - 129)))) != 0)) {
				{
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(581);
					attributes();
					}
				}

				setState(584);
				type_expression(0);
				}
			}

			setState(587);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_declare_operatorContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Empty_declare_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_declare_operator; }
	}

	public final Empty_declare_operatorContext empty_declare_operator() throws RecognitionException {
		Empty_declare_operatorContext _localctx = new Empty_declare_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_empty_declare_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Colon);
			setState(590);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_nameContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Declarator_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_name; }
	}

	public final Declarator_nameContext declarator_name() throws RecognitionException {
		Declarator_nameContext _localctx = new Declarator_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarator_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_expressionContext extends ParserRuleContext {
		public Package_declarationContext package_declaration() {
			return getRuleContext(Package_declarationContext.class,0);
		}
		public Project_declarationContext project_declaration() {
			return getRuleContext(Project_declarationContext.class,0);
		}
		public Module_declarationContext module_declaration() {
			return getRuleContext(Module_declarationContext.class,0);
		}
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Import_alias_declarationContext import_alias_declaration() {
			return getRuleContext(Import_alias_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Union_declarationContext union_declaration() {
			return getRuleContext(Union_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Declaration_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_expression; }
	}

	public final Declaration_expressionContext declaration_expression() throws RecognitionException {
		Declaration_expressionContext _localctx = new Declaration_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_expression);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordPackage:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				package_declaration();
				}
				break;
			case KeywordProject:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				project_declaration();
				}
				break;
			case KeywordModule:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				module_declaration();
				}
				break;
			case KeywordNamespace:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				namespace_declaration();
				}
				break;
			case KeywordFunc:
				enterOuterAlt(_localctx, 5);
				{
				setState(598);
				function_declaration();
				}
				break;
			case KeywordVar:
				enterOuterAlt(_localctx, 6);
				{
				setState(599);
				variable_declaration();
				}
				break;
			case KeywordVal:
				enterOuterAlt(_localctx, 7);
				{
				setState(600);
				constant_declaration();
				}
				break;
			case KeywordImport:
				enterOuterAlt(_localctx, 8);
				{
				setState(601);
				import_alias_declaration();
				}
				break;
			case KeywordAlias:
				enterOuterAlt(_localctx, 9);
				{
				setState(602);
				typealias_declaration();
				}
				break;
			case KeywordStruct:
				enterOuterAlt(_localctx, 10);
				{
				setState(603);
				struct_declaration();
				}
				break;
			case KeywordClass:
				enterOuterAlt(_localctx, 11);
				{
				setState(604);
				class_declaration();
				}
				break;
			case KeywordProtocol:
				enterOuterAlt(_localctx, 12);
				{
				setState(605);
				protocol_declaration();
				}
				break;
			case KeywordUnion:
				enterOuterAlt(_localctx, 13);
				{
				setState(606);
				union_declaration();
				}
				break;
			case KeywordEnum:
				enterOuterAlt(_localctx, 14);
				{
				setState(607);
				enum_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordStruct() { return getToken(AtemParser.KeywordStruct, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Final_specifierContext final_specifier() {
			return getRuleContext(Final_specifierContext.class,0);
		}
		public Extension_listContext extension_list() {
			return getRuleContext(Extension_listContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Deinitializer_listContext deinitializer_list() {
			return getRuleContext(Deinitializer_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(KeywordStruct);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(611);
				attributes();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFinal) {
				{
				setState(614);
				final_specifier();
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordExtend) {
				{
				setState(617);
				extension_list();
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordInit) {
				{
				setState(620);
				initializer_list();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDeinit) {
				{
				setState(623);
				deinitializer_list();
				}
			}

			setState(626);
			member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordClass() { return getToken(AtemParser.KeywordClass, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Final_specifierContext final_specifier() {
			return getRuleContext(Final_specifierContext.class,0);
		}
		public Extension_listContext extension_list() {
			return getRuleContext(Extension_listContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Deinitializer_listContext deinitializer_list() {
			return getRuleContext(Deinitializer_listContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(KeywordClass);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(629);
				attributes();
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFinal) {
				{
				setState(632);
				final_specifier();
				}
			}

			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordExtend) {
				{
				setState(635);
				extension_list();
				}
			}

			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordInit) {
				{
				setState(638);
				initializer_list();
				}
			}

			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDeinit) {
				{
				setState(641);
				deinitializer_list();
				}
			}

			setState(644);
			member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Final_specifierContext extends ParserRuleContext {
		public TerminalNode KeywordFinal() { return getToken(AtemParser.KeywordFinal, 0); }
		public Final_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_specifier; }
	}

	public final Final_specifierContext final_specifier() throws RecognitionException {
		Final_specifierContext _localctx = new Final_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_final_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(KeywordFinal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_specifierContext extends ParserRuleContext {
		public TerminalNode KeywordStatic() { return getToken(AtemParser.KeywordStatic, 0); }
		public TerminalNode KeywordMutable() { return getToken(AtemParser.KeywordMutable, 0); }
		public TerminalNode KeywordFinal() { return getToken(AtemParser.KeywordFinal, 0); }
		public Member_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_specifier; }
	}

	public final Member_specifierContext member_specifier() throws RecognitionException {
		Member_specifierContext _localctx = new Member_specifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_member_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_specifiersContext extends ParserRuleContext {
		public List<Member_specifierContext> member_specifier() {
			return getRuleContexts(Member_specifierContext.class);
		}
		public Member_specifierContext member_specifier(int i) {
			return getRuleContext(Member_specifierContext.class,i);
		}
		public Member_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_specifiers; }
	}

	public final Member_specifiersContext member_specifiers() throws RecognitionException {
		Member_specifiersContext _localctx = new Member_specifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_member_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(650);
				member_specifier();
				}
				}
				setState(653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_listContext extends ParserRuleContext {
		public TerminalNode KeywordExtend() { return getToken(AtemParser.KeywordExtend, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<Extension_itemContext> extension_item() {
			return getRuleContexts(Extension_itemContext.class);
		}
		public Extension_itemContext extension_item(int i) {
			return getRuleContext(Extension_itemContext.class,i);
		}
		public Extension_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_list; }
	}

	public final Extension_listContext extension_list() throws RecognitionException {
		Extension_listContext _localctx = new Extension_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_extension_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(KeywordExtend);
			setState(656);
			match(LeftCurly);
			setState(658); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(657);
				extension_item();
				}
				}
				setState(660); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordImpl || _la==KeywordInherit );
			setState(662);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_itemContext extends ParserRuleContext {
		public Inherit_clauseContext inherit_clause() {
			return getRuleContext(Inherit_clauseContext.class,0);
		}
		public Impl_clauseContext impl_clause() {
			return getRuleContext(Impl_clauseContext.class,0);
		}
		public Extension_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_item; }
	}

	public final Extension_itemContext extension_item() throws RecognitionException {
		Extension_itemContext _localctx = new Extension_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extension_item);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordInherit:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				inherit_clause();
				}
				break;
			case KeywordImpl:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				impl_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_clauseContext extends ParserRuleContext {
		public TerminalNode KeywordInherit() { return getToken(AtemParser.KeywordInherit, 0); }
		public Inherit_listContext inherit_list() {
			return getRuleContext(Inherit_listContext.class,0);
		}
		public Inherit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_clause; }
	}

	public final Inherit_clauseContext inherit_clause() throws RecognitionException {
		Inherit_clauseContext _localctx = new Inherit_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inherit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(KeywordInherit);
			setState(669);
			inherit_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Inherit_itemsContext inherit_items() {
			return getRuleContext(Inherit_itemsContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Inherit_itemContext inherit_item() {
			return getRuleContext(Inherit_itemContext.class,0);
		}
		public Inherit_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_list; }
	}

	public final Inherit_listContext inherit_list() throws RecognitionException {
		Inherit_listContext _localctx = new Inherit_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inherit_list);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftCurly:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(LeftCurly);
				setState(672);
				inherit_items();
				setState(673);
				match(RightCurly);
				}
				break;
			case KeywordGlobal:
			case KeywordModule:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordSelf:
			case KeywordSuper:
			case KeywordThis:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				inherit_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_itemContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Inherit_member_listContext inherit_member_list() {
			return getRuleContext(Inherit_member_listContext.class,0);
		}
		public Inherit_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_item; }
	}

	public final Inherit_itemContext inherit_item() throws RecognitionException {
		Inherit_itemContext _localctx = new Inherit_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inherit_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			path_expression();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftCurly) {
				{
				setState(679);
				inherit_member_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_itemsContext extends ParserRuleContext {
		public List<Inherit_itemContext> inherit_item() {
			return getRuleContexts(Inherit_itemContext.class);
		}
		public Inherit_itemContext inherit_item(int i) {
			return getRuleContext(Inherit_itemContext.class,i);
		}
		public Inherit_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_items; }
	}

	public final Inherit_itemsContext inherit_items() throws RecognitionException {
		Inherit_itemsContext _localctx = new Inherit_itemsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inherit_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(682);
				inherit_item();
				}
				}
				setState(685); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordGlobal || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeywordModule - 73)) | (1L << (KeywordOuter - 73)) | (1L << (KeywordPackage - 73)) | (1L << (KeywordSelf - 73)) | (1L << (KeywordSuper - 73)) | (1L << (KeywordThis - 73)) | (1L << (Identifier - 73)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_member_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Inherit_membersContext inherit_members() {
			return getRuleContext(Inherit_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Inherit_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_member_list; }
	}

	public final Inherit_member_listContext inherit_member_list() throws RecognitionException {
		Inherit_member_listContext _localctx = new Inherit_member_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inherit_member_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(LeftCurly);
			setState(688);
			inherit_members();
			setState(689);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_memberContext extends ParserRuleContext {
		public Inherit_type_overrideContext inherit_type_override() {
			return getRuleContext(Inherit_type_overrideContext.class,0);
		}
		public Inherit_variable_overrideContext inherit_variable_override() {
			return getRuleContext(Inherit_variable_overrideContext.class,0);
		}
		public Inherit_constant_overrideContext inherit_constant_override() {
			return getRuleContext(Inherit_constant_overrideContext.class,0);
		}
		public Inherit_function_overrideContext inherit_function_override() {
			return getRuleContext(Inherit_function_overrideContext.class,0);
		}
		public Inherit_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_member; }
	}

	public final Inherit_memberContext inherit_member() throws RecognitionException {
		Inherit_memberContext _localctx = new Inherit_memberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inherit_member);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				inherit_type_override();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				inherit_variable_override();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				inherit_constant_override();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				inherit_function_override();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_membersContext extends ParserRuleContext {
		public List<Inherit_memberContext> inherit_member() {
			return getRuleContexts(Inherit_memberContext.class);
		}
		public Inherit_memberContext inherit_member(int i) {
			return getRuleContext(Inherit_memberContext.class,i);
		}
		public Inherit_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_members; }
	}

	public final Inherit_membersContext inherit_members() throws RecognitionException {
		Inherit_membersContext _localctx = new Inherit_membersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inherit_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(697);
				inherit_member();
				}
				}
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordOverride );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_type_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Inherit_declaratorContext inherit_declarator() {
			return getRuleContext(Inherit_declaratorContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Inherit_type_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_type_override; }
	}

	public final Inherit_type_overrideContext inherit_type_override() throws RecognitionException {
		Inherit_type_overrideContext _localctx = new Inherit_type_overrideContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inherit_type_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(KeywordOverride);
			setState(703);
			inherit_declarator();
			setState(704);
			typealias_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_variable_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Inherit_declaratorContext inherit_declarator() {
			return getRuleContext(Inherit_declaratorContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Getter_and_setter_listContext getter_and_setter_list() {
			return getRuleContext(Getter_and_setter_listContext.class,0);
		}
		public Inherit_variable_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_variable_override; }
	}

	public final Inherit_variable_overrideContext inherit_variable_override() throws RecognitionException {
		Inherit_variable_overrideContext _localctx = new Inherit_variable_overrideContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_inherit_variable_override);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(KeywordOverride);
			setState(707);
			inherit_declarator();
			setState(708);
			variable_declaration();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(709);
				getter_and_setter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_constant_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Inherit_declaratorContext inherit_declarator() {
			return getRuleContext(Inherit_declaratorContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Getter_listContext getter_list() {
			return getRuleContext(Getter_listContext.class,0);
		}
		public Inherit_constant_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_constant_override; }
	}

	public final Inherit_constant_overrideContext inherit_constant_override() throws RecognitionException {
		Inherit_constant_overrideContext _localctx = new Inherit_constant_overrideContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inherit_constant_override);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(KeywordOverride);
			setState(713);
			inherit_declarator();
			setState(714);
			constant_declaration();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(715);
				getter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_function_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Inherit_declaratorContext inherit_declarator() {
			return getRuleContext(Inherit_declaratorContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Inherit_function_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_function_override; }
	}

	public final Inherit_function_overrideContext inherit_function_override() throws RecognitionException {
		Inherit_function_overrideContext _localctx = new Inherit_function_overrideContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inherit_function_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(KeywordOverride);
			setState(719);
			inherit_declarator();
			setState(720);
			function_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_initializer_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Empty_inherit_declaratorContext empty_inherit_declarator() {
			return getRuleContext(Empty_inherit_declaratorContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Inherit_initializer_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_initializer_override; }
	}

	public final Inherit_initializer_overrideContext inherit_initializer_override() throws RecognitionException {
		Inherit_initializer_overrideContext _localctx = new Inherit_initializer_overrideContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inherit_initializer_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(KeywordOverride);
			setState(723);
			empty_inherit_declarator();
			setState(724);
			initializer_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_deinitializer_overrideContext extends ParserRuleContext {
		public TerminalNode KeywordOverride() { return getToken(AtemParser.KeywordOverride, 0); }
		public Empty_inherit_declaratorContext empty_inherit_declarator() {
			return getRuleContext(Empty_inherit_declaratorContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Inherit_deinitializer_overrideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_deinitializer_override; }
	}

	public final Inherit_deinitializer_overrideContext inherit_deinitializer_override() throws RecognitionException {
		Inherit_deinitializer_overrideContext _localctx = new Inherit_deinitializer_overrideContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inherit_deinitializer_override);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(KeywordOverride);
			setState(727);
			empty_inherit_declarator();
			setState(728);
			deinitializer_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_declaratorContext extends ParserRuleContext {
		public Inherit_nameContext inherit_name() {
			return getRuleContext(Inherit_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Inherit_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_declarator; }
	}

	public final Inherit_declaratorContext inherit_declarator() throws RecognitionException {
		Inherit_declaratorContext _localctx = new Inherit_declaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inherit_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(730);
				access_level_specifier();
				}
			}

			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(733);
				storage_level_specifier();
				}
				break;
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(736);
				member_specifiers();
				}
			}

			setState(739);
			inherit_name();
			setState(740);
			declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_inherit_declaratorContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Empty_inherit_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_inherit_declarator; }
	}

	public final Empty_inherit_declaratorContext empty_inherit_declarator() throws RecognitionException {
		Empty_inherit_declaratorContext _localctx = new Empty_inherit_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_empty_inherit_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(742);
				access_level_specifier();
				}
			}

			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(745);
				storage_level_specifier();
				}
				break;
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(748);
				member_specifiers();
				}
			}

			setState(751);
			empty_declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inherit_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Inherit_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_name; }
	}

	public final Inherit_nameContext inherit_name() throws RecognitionException {
		Inherit_nameContext _localctx = new Inherit_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inherit_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_clauseContext extends ParserRuleContext {
		public TerminalNode KeywordImpl() { return getToken(AtemParser.KeywordImpl, 0); }
		public Impl_listContext impl_list() {
			return getRuleContext(Impl_listContext.class,0);
		}
		public Impl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_clause; }
	}

	public final Impl_clauseContext impl_clause() throws RecognitionException {
		Impl_clauseContext _localctx = new Impl_clauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_impl_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(KeywordImpl);
			setState(756);
			impl_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Impl_itemsContext impl_items() {
			return getRuleContext(Impl_itemsContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Impl_itemContext impl_item() {
			return getRuleContext(Impl_itemContext.class,0);
		}
		public Impl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_list; }
	}

	public final Impl_listContext impl_list() throws RecognitionException {
		Impl_listContext _localctx = new Impl_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_impl_list);
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftCurly:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(LeftCurly);
				setState(759);
				impl_items();
				setState(760);
				match(RightCurly);
				}
				break;
			case KeywordGlobal:
			case KeywordModule:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordSelf:
			case KeywordSuper:
			case KeywordThis:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				impl_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_itemContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Impl_with_clauseContext impl_with_clause() {
			return getRuleContext(Impl_with_clauseContext.class,0);
		}
		public Impl_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_item; }
	}

	public final Impl_itemContext impl_item() throws RecognitionException {
		Impl_itemContext _localctx = new Impl_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_impl_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			path_expression();
			setState(766);
			impl_with_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_itemsContext extends ParserRuleContext {
		public List<Impl_itemContext> impl_item() {
			return getRuleContexts(Impl_itemContext.class);
		}
		public Impl_itemContext impl_item(int i) {
			return getRuleContext(Impl_itemContext.class,i);
		}
		public Impl_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_items; }
	}

	public final Impl_itemsContext impl_items() throws RecognitionException {
		Impl_itemsContext _localctx = new Impl_itemsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_impl_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(768);
				impl_item();
				}
				}
				setState(771); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordGlobal || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeywordModule - 73)) | (1L << (KeywordOuter - 73)) | (1L << (KeywordPackage - 73)) | (1L << (KeywordSelf - 73)) | (1L << (KeywordSuper - 73)) | (1L << (KeywordThis - 73)) | (1L << (Identifier - 73)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_with_clauseContext extends ParserRuleContext {
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public Impl_member_listContext impl_member_list() {
			return getRuleContext(Impl_member_listContext.class,0);
		}
		public Impl_with_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_with_clause; }
	}

	public final Impl_with_clauseContext impl_with_clause() throws RecognitionException {
		Impl_with_clauseContext _localctx = new Impl_with_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_impl_with_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(KeywordWith);
			setState(774);
			impl_member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_member_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Impl_membersContext impl_members() {
			return getRuleContext(Impl_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Impl_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_member_list; }
	}

	public final Impl_member_listContext impl_member_list() throws RecognitionException {
		Impl_member_listContext _localctx = new Impl_member_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_impl_member_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(LeftCurly);
			setState(777);
			impl_members();
			setState(778);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_memberContext extends ParserRuleContext {
		public Associated_type_implContext associated_type_impl() {
			return getRuleContext(Associated_type_implContext.class,0);
		}
		public Associated_variable_implContext associated_variable_impl() {
			return getRuleContext(Associated_variable_implContext.class,0);
		}
		public Associated_constant_implContext associated_constant_impl() {
			return getRuleContext(Associated_constant_implContext.class,0);
		}
		public Associated_function_implContext associated_function_impl() {
			return getRuleContext(Associated_function_implContext.class,0);
		}
		public Impl_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_member; }
	}

	public final Impl_memberContext impl_member() throws RecognitionException {
		Impl_memberContext _localctx = new Impl_memberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_impl_member);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				associated_type_impl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				associated_variable_impl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				associated_constant_impl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				associated_function_impl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impl_membersContext extends ParserRuleContext {
		public List<Impl_memberContext> impl_member() {
			return getRuleContexts(Impl_memberContext.class);
		}
		public Impl_memberContext impl_member(int i) {
			return getRuleContext(Impl_memberContext.class,i);
		}
		public Impl_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_members; }
	}

	public final Impl_membersContext impl_members() throws RecognitionException {
		Impl_membersContext _localctx = new Impl_membersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_impl_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(786);
				impl_member();
				}
				}
				setState(789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordRequire );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_type_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Associated_declaratorContext associated_declarator() {
			return getRuleContext(Associated_declaratorContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Associated_type_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_type_impl; }
	}

	public final Associated_type_implContext associated_type_impl() throws RecognitionException {
		Associated_type_implContext _localctx = new Associated_type_implContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_associated_type_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(KeywordRequire);
			setState(792);
			associated_declarator();
			setState(793);
			typealias_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_variable_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Associated_declaratorContext associated_declarator() {
			return getRuleContext(Associated_declaratorContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Getter_and_setter_listContext getter_and_setter_list() {
			return getRuleContext(Getter_and_setter_listContext.class,0);
		}
		public Associated_variable_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_variable_impl; }
	}

	public final Associated_variable_implContext associated_variable_impl() throws RecognitionException {
		Associated_variable_implContext _localctx = new Associated_variable_implContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_associated_variable_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(KeywordRequire);
			setState(796);
			associated_declarator();
			setState(797);
			variable_declaration();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(798);
				getter_and_setter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_constant_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Associated_declaratorContext associated_declarator() {
			return getRuleContext(Associated_declaratorContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Getter_listContext getter_list() {
			return getRuleContext(Getter_listContext.class,0);
		}
		public Associated_constant_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_constant_impl; }
	}

	public final Associated_constant_implContext associated_constant_impl() throws RecognitionException {
		Associated_constant_implContext _localctx = new Associated_constant_implContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_associated_constant_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(KeywordRequire);
			setState(802);
			associated_declarator();
			setState(803);
			constant_declaration();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(804);
				getter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_function_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Associated_declaratorContext associated_declarator() {
			return getRuleContext(Associated_declaratorContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Associated_function_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_function_impl; }
	}

	public final Associated_function_implContext associated_function_impl() throws RecognitionException {
		Associated_function_implContext _localctx = new Associated_function_implContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_associated_function_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(KeywordRequire);
			setState(808);
			associated_declarator();
			setState(809);
			function_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_initializer_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Associated_initializer_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_initializer_impl; }
	}

	public final Associated_initializer_implContext associated_initializer_impl() throws RecognitionException {
		Associated_initializer_implContext _localctx = new Associated_initializer_implContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_associated_initializer_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(KeywordRequire);
			setState(812);
			empty_declare_operator();
			setState(813);
			initializer_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_deinitializer_implContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Associated_deinitializer_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_deinitializer_impl; }
	}

	public final Associated_deinitializer_implContext associated_deinitializer_impl() throws RecognitionException {
		Associated_deinitializer_implContext _localctx = new Associated_deinitializer_implContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_associated_deinitializer_impl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(KeywordRequire);
			setState(816);
			empty_declare_operator();
			setState(817);
			deinitializer_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_declaratorContext extends ParserRuleContext {
		public Associated_nameContext associated_name() {
			return getRuleContext(Associated_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Associated_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_declarator; }
	}

	public final Associated_declaratorContext associated_declarator() throws RecognitionException {
		Associated_declaratorContext _localctx = new Associated_declaratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_associated_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(819);
				access_level_specifier();
				}
			}

			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(822);
				storage_level_specifier();
				}
				break;
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(825);
				member_specifiers();
				}
			}

			setState(828);
			associated_name();
			setState(829);
			declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_associated_declaratorContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Empty_associated_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_associated_declarator; }
	}

	public final Empty_associated_declaratorContext empty_associated_declarator() throws RecognitionException {
		Empty_associated_declaratorContext _localctx = new Empty_associated_declaratorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_empty_associated_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(831);
				access_level_specifier();
				}
			}

			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(834);
				storage_level_specifier();
				}
				break;
			}
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(837);
				member_specifiers();
				}
			}

			setState(840);
			empty_declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associated_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Associated_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_name; }
	}

	public final Associated_nameContext associated_name() throws RecognitionException {
		Associated_nameContext _localctx = new Associated_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_associated_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public TerminalNode KeywordInit() { return getToken(AtemParser.KeywordInit, 0); }
		public Initializer_member_listContext initializer_member_list() {
			return getRuleContext(Initializer_member_listContext.class,0);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_initializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(KeywordInit);
			setState(845);
			initializer_member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_member_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Initializer_membersContext initializer_members() {
			return getRuleContext(Initializer_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Initializer_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_member_list; }
	}

	public final Initializer_member_listContext initializer_member_list() throws RecognitionException {
		Initializer_member_listContext _localctx = new Initializer_member_listContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_initializer_member_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(LeftCurly);
			setState(848);
			initializer_members();
			setState(849);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_memberContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Initializer_typeContext initializer_type() {
			return getRuleContext(Initializer_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Initializer_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_member; }
	}

	public final Initializer_memberContext initializer_member() throws RecognitionException {
		Initializer_memberContext _localctx = new Initializer_memberContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initializer_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(851);
				member_specifiers();
				}
			}

			setState(854);
			empty_declare_operator();
			setState(855);
			initializer_type();
			setState(856);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_typeContext extends ParserRuleContext {
		public Function_parameter_clauseContext function_parameter_clause() {
			return getRuleContext(Function_parameter_clauseContext.class,0);
		}
		public Function_specifiersContext function_specifiers() {
			return getRuleContext(Function_specifiersContext.class,0);
		}
		public Contract_listContext contract_list() {
			return getRuleContext(Contract_listContext.class,0);
		}
		public Initializer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_type; }
	}

	public final Initializer_typeContext initializer_type() throws RecognitionException {
		Initializer_typeContext _localctx = new Initializer_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initializer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(858);
				function_parameter_clause();
				}
				break;
			}
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) {
				{
				setState(861);
				function_specifiers();
				}
			}

			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(864);
				contract_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_membersContext extends ParserRuleContext {
		public List<Initializer_memberContext> initializer_member() {
			return getRuleContexts(Initializer_memberContext.class);
		}
		public Initializer_memberContext initializer_member(int i) {
			return getRuleContext(Initializer_memberContext.class,i);
		}
		public Initializer_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_members; }
	}

	public final Initializer_membersContext initializer_members() throws RecognitionException {
		Initializer_membersContext _localctx = new Initializer_membersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_initializer_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(867);
				initializer_member();
				}
				}
				setState(870); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0) || _la==Colon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_listContext extends ParserRuleContext {
		public TerminalNode KeywordDeinit() { return getToken(AtemParser.KeywordDeinit, 0); }
		public Deinitializer_member_listContext deinitializer_member_list() {
			return getRuleContext(Deinitializer_member_listContext.class,0);
		}
		public Deinitializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_list; }
	}

	public final Deinitializer_listContext deinitializer_list() throws RecognitionException {
		Deinitializer_listContext _localctx = new Deinitializer_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_deinitializer_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(KeywordDeinit);
			setState(873);
			deinitializer_member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_member_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Deinitializer_membersContext deinitializer_members() {
			return getRuleContext(Deinitializer_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Deinitializer_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_member_list; }
	}

	public final Deinitializer_member_listContext deinitializer_member_list() throws RecognitionException {
		Deinitializer_member_listContext _localctx = new Deinitializer_member_listContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_deinitializer_member_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(LeftCurly);
			setState(876);
			deinitializer_members();
			setState(877);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_memberContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public Deinitializer_typeContext deinitializer_type() {
			return getRuleContext(Deinitializer_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Deinitializer_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_member; }
	}

	public final Deinitializer_memberContext deinitializer_member() throws RecognitionException {
		Deinitializer_memberContext _localctx = new Deinitializer_memberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_deinitializer_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(879);
				member_specifiers();
				}
			}

			setState(882);
			empty_declare_operator();
			setState(883);
			deinitializer_type();
			setState(884);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_typeContext extends ParserRuleContext {
		public Function_parameter_clauseContext function_parameter_clause() {
			return getRuleContext(Function_parameter_clauseContext.class,0);
		}
		public Function_specifiersContext function_specifiers() {
			return getRuleContext(Function_specifiersContext.class,0);
		}
		public Contract_listContext contract_list() {
			return getRuleContext(Contract_listContext.class,0);
		}
		public Deinitializer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_type; }
	}

	public final Deinitializer_typeContext deinitializer_type() throws RecognitionException {
		Deinitializer_typeContext _localctx = new Deinitializer_typeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_deinitializer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(886);
				function_parameter_clause();
				}
				break;
			}
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) {
				{
				setState(889);
				function_specifiers();
				}
			}

			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(892);
				contract_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_membersContext extends ParserRuleContext {
		public List<Deinitializer_memberContext> deinitializer_member() {
			return getRuleContexts(Deinitializer_memberContext.class);
		}
		public Deinitializer_memberContext deinitializer_member(int i) {
			return getRuleContext(Deinitializer_memberContext.class,i);
		}
		public Deinitializer_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_members; }
	}

	public final Deinitializer_membersContext deinitializer_members() throws RecognitionException {
		Deinitializer_membersContext _localctx = new Deinitializer_membersContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_deinitializer_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(895);
				deinitializer_member();
				}
				}
				setState(898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0) || _la==Colon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public TerminalNode KeywordMember() { return getToken(AtemParser.KeywordMember, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_member_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(KeywordMember);
			setState(901);
			match(LeftCurly);
			setState(902);
			members();
			setState(903);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public Member_typeContext member_type() {
			return getRuleContext(Member_typeContext.class,0);
		}
		public Member_variableContext member_variable() {
			return getRuleContext(Member_variableContext.class,0);
		}
		public Member_constantContext member_constant() {
			return getRuleContext(Member_constantContext.class,0);
		}
		public Member_functionContext member_function() {
			return getRuleContext(Member_functionContext.class,0);
		}
		public Member_nested_typeContext member_nested_type() {
			return getRuleContext(Member_nested_typeContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_member);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				member_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				member_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				member_constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(908);
				member_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(909);
				member_nested_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(912);
				member();
				}
				}
				setState(915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordFilePrivate) | (1L << KeywordFinal) | (1L << KeywordGlobal))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (KeywordInternal - 67)) | (1L << (KeywordMutable - 67)) | (1L << (KeywordOpen - 67)) | (1L << (KeywordPrivate - 67)) | (1L << (KeywordPublic - 67)) | (1L << (KeywordStatic - 67)) | (1L << (KeywordThreadLocal - 67)) | (1L << (Identifier - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nested_typeContext extends ParserRuleContext {
		public Nested_classContext nested_class() {
			return getRuleContext(Nested_classContext.class,0);
		}
		public Nested_structContext nested_struct() {
			return getRuleContext(Nested_structContext.class,0);
		}
		public Nested_protocolContext nested_protocol() {
			return getRuleContext(Nested_protocolContext.class,0);
		}
		public Nested_unionContext nested_union() {
			return getRuleContext(Nested_unionContext.class,0);
		}
		public Nested_enumContext nested_enum() {
			return getRuleContext(Nested_enumContext.class,0);
		}
		public Member_nested_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_nested_type; }
	}

	public final Member_nested_typeContext member_nested_type() throws RecognitionException {
		Member_nested_typeContext _localctx = new Member_nested_typeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_member_nested_type);
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				nested_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				nested_struct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				nested_protocol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				nested_union();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				nested_enum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_classContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Nested_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_class; }
	}

	public final Nested_classContext nested_class() throws RecognitionException {
		Nested_classContext _localctx = new Nested_classContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_nested_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			member_declarator();
			setState(925);
			class_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_structContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Nested_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_struct; }
	}

	public final Nested_structContext nested_struct() throws RecognitionException {
		Nested_structContext _localctx = new Nested_structContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nested_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			member_declarator();
			setState(928);
			struct_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_protocolContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Nested_protocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_protocol; }
	}

	public final Nested_protocolContext nested_protocol() throws RecognitionException {
		Nested_protocolContext _localctx = new Nested_protocolContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nested_protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			member_declarator();
			setState(931);
			protocol_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_unionContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Union_declarationContext union_declaration() {
			return getRuleContext(Union_declarationContext.class,0);
		}
		public Nested_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_union; }
	}

	public final Nested_unionContext nested_union() throws RecognitionException {
		Nested_unionContext _localctx = new Nested_unionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nested_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			member_declarator();
			setState(934);
			union_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_enumContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Nested_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_enum; }
	}

	public final Nested_enumContext nested_enum() throws RecognitionException {
		Nested_enumContext _localctx = new Nested_enumContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_nested_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			member_declarator();
			setState(937);
			enum_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_typeContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Member_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_type; }
	}

	public final Member_typeContext member_type() throws RecognitionException {
		Member_typeContext _localctx = new Member_typeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_member_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			member_declarator();
			setState(940);
			typealias_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_variableContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Getter_and_setter_listContext getter_and_setter_list() {
			return getRuleContext(Getter_and_setter_listContext.class,0);
		}
		public Member_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_variable; }
	}

	public final Member_variableContext member_variable() throws RecognitionException {
		Member_variableContext _localctx = new Member_variableContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_member_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			member_declarator();
			setState(943);
			variable_declaration();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(944);
				getter_and_setter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_constantContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Getter_listContext getter_list() {
			return getRuleContext(Getter_listContext.class,0);
		}
		public Member_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_constant; }
	}

	public final Member_constantContext member_constant() throws RecognitionException {
		Member_constantContext _localctx = new Member_constantContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_member_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			member_declarator();
			setState(948);
			constant_declaration();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(949);
				getter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_functionContext extends ParserRuleContext {
		public Member_declaratorContext member_declarator() {
			return getRuleContext(Member_declaratorContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Member_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_function; }
	}

	public final Member_functionContext member_function() throws RecognitionException {
		Member_functionContext _localctx = new Member_functionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_member_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			member_declarator();
			setState(953);
			function_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declaratorContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_member_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(955);
				access_level_specifier();
				}
			}

			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(958);
				storage_level_specifier();
				}
				break;
			}
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(961);
				member_specifiers();
				}
			}

			setState(964);
			member_name();
			setState(965);
			declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_and_setter_listContext extends ParserRuleContext {
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Getter_and_setter_itemsContext getter_and_setter_items() {
			return getRuleContext(Getter_and_setter_itemsContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Getter_and_setter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_and_setter_list; }
	}

	public final Getter_and_setter_listContext getter_and_setter_list() throws RecognitionException {
		Getter_and_setter_listContext _localctx = new Getter_and_setter_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_getter_and_setter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			match(KeywordWith);
			setState(970);
			match(LeftCurly);
			setState(971);
			getter_and_setter_items();
			setState(972);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_listContext extends ParserRuleContext {
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Getter_declarationContext getter_declaration() {
			return getRuleContext(Getter_declarationContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Getter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_list; }
	}

	public final Getter_listContext getter_list() throws RecognitionException {
		Getter_listContext _localctx = new Getter_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_getter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(KeywordWith);
			setState(975);
			match(LeftCurly);
			setState(976);
			getter_declaration();
			setState(977);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_and_setter_itemContext extends ParserRuleContext {
		public Getter_declarationContext getter_declaration() {
			return getRuleContext(Getter_declarationContext.class,0);
		}
		public Setter_declarationContext setter_declaration() {
			return getRuleContext(Setter_declarationContext.class,0);
		}
		public Getter_and_setter_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_and_setter_item; }
	}

	public final Getter_and_setter_itemContext getter_and_setter_item() throws RecognitionException {
		Getter_and_setter_itemContext _localctx = new Getter_and_setter_itemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_getter_and_setter_item);
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				setter_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_and_setter_itemsContext extends ParserRuleContext {
		public List<Getter_and_setter_itemContext> getter_and_setter_item() {
			return getRuleContexts(Getter_and_setter_itemContext.class);
		}
		public Getter_and_setter_itemContext getter_and_setter_item(int i) {
			return getRuleContext(Getter_and_setter_itemContext.class,i);
		}
		public Getter_and_setter_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_and_setter_items; }
	}

	public final Getter_and_setter_itemsContext getter_and_setter_items() throws RecognitionException {
		Getter_and_setter_itemsContext _localctx = new Getter_and_setter_itemsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_getter_and_setter_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(983);
				getter_and_setter_item();
				}
				}
				setState(986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0) || _la==Colon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_declarationContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public TerminalNode KeywordGet() { return getToken(AtemParser.KeywordGet, 0); }
		public Getter_typeContext getter_type() {
			return getRuleContext(Getter_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Getter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_declaration; }
	}

	public final Getter_declarationContext getter_declaration() throws RecognitionException {
		Getter_declarationContext _localctx = new Getter_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(988);
				member_specifiers();
				}
			}

			setState(991);
			empty_declare_operator();
			setState(992);
			match(KeywordGet);
			setState(993);
			getter_type();
			setState(994);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_typeContext extends ParserRuleContext {
		public Function_specifiersContext function_specifiers() {
			return getRuleContext(Function_specifiersContext.class,0);
		}
		public Contract_listContext contract_list() {
			return getRuleContext(Contract_listContext.class,0);
		}
		public Getter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_type; }
	}

	public final Getter_typeContext getter_type() throws RecognitionException {
		Getter_typeContext _localctx = new Getter_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_getter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) {
				{
				setState(996);
				function_specifiers();
				}
			}

			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(999);
				contract_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_declarationContext extends ParserRuleContext {
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public TerminalNode KeywordSet() { return getToken(AtemParser.KeywordSet, 0); }
		public Setter_typeContext setter_type() {
			return getRuleContext(Setter_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Setter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_declaration; }
	}

	public final Setter_declarationContext setter_declaration() throws RecognitionException {
		Setter_declarationContext _localctx = new Setter_declarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(1002);
				member_specifiers();
				}
			}

			setState(1005);
			empty_declare_operator();
			setState(1006);
			match(KeywordSet);
			setState(1007);
			setter_type();
			setState(1008);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_typeContext extends ParserRuleContext {
		public Setter_parameter_clauseContext setter_parameter_clause() {
			return getRuleContext(Setter_parameter_clauseContext.class,0);
		}
		public Function_specifiersContext function_specifiers() {
			return getRuleContext(Function_specifiersContext.class,0);
		}
		public Contract_listContext contract_list() {
			return getRuleContext(Contract_listContext.class,0);
		}
		public Setter_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_type; }
	}

	public final Setter_typeContext setter_type() throws RecognitionException {
		Setter_typeContext _localctx = new Setter_typeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_setter_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(1010);
				setter_parameter_clause();
				}
				break;
			}
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) {
				{
				setState(1013);
				function_specifiers();
				}
			}

			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(1016);
				contract_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public Setter_parameterContext setter_parameter() {
			return getRuleContext(Setter_parameterContext.class,0);
		}
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Setter_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_parameter_clause; }
	}

	public final Setter_parameter_clauseContext setter_parameter_clause() throws RecognitionException {
		Setter_parameter_clauseContext _localctx = new Setter_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_setter_parameter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(LeftParenthese);
			setState(1020);
			setter_parameter();
			setState(1021);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_parameterContext extends ParserRuleContext {
		public Setter_parameter_nameContext setter_parameter_name() {
			return getRuleContext(Setter_parameter_nameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Setter_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_parameter; }
	}

	public final Setter_parameterContext setter_parameter() throws RecognitionException {
		Setter_parameterContext _localctx = new Setter_parameterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setter_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			setter_parameter_name();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1024);
				match(Colon);
				setState(1025);
				type_annotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_parameter_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Setter_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_parameter_name; }
	}

	public final Setter_parameter_nameContext setter_parameter_name() throws RecognitionException {
		Setter_parameter_nameContext _localctx = new Setter_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setter_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordProtocol() { return getToken(AtemParser.KeywordProtocol, 0); }
		public Protocol_requirement_listContext protocol_requirement_list() {
			return getRuleContext(Protocol_requirement_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Final_specifierContext final_specifier() {
			return getRuleContext(Final_specifierContext.class,0);
		}
		public Protocol_extend_listContext protocol_extend_list() {
			return getRuleContext(Protocol_extend_listContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(KeywordProtocol);
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1031);
				attributes();
				}
			}

			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFinal) {
				{
				setState(1034);
				final_specifier();
				}
			}

			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1037);
				protocol_extend_list();
				}
				break;
			}
			setState(1040);
			protocol_requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_extend_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Protocol_extend_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_extend_list; }
	}

	public final Protocol_extend_listContext protocol_extend_list() throws RecognitionException {
		Protocol_extend_listContext _localctx = new Protocol_extend_listContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_protocol_extend_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(LeftCurly);
			setState(1043);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Protocol_requirement_itemsContext protocol_requirement_items() {
			return getRuleContext(Protocol_requirement_itemsContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Protocol_requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_list; }
	}

	public final Protocol_requirement_listContext protocol_requirement_list() throws RecognitionException {
		Protocol_requirement_listContext _localctx = new Protocol_requirement_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_protocol_requirement_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(LeftCurly);
			setState(1046);
			protocol_requirement_items();
			setState(1047);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_itemContext extends ParserRuleContext {
		public Protocol_requirement_typeContext protocol_requirement_type() {
			return getRuleContext(Protocol_requirement_typeContext.class,0);
		}
		public Protocol_requirement_functionContext protocol_requirement_function() {
			return getRuleContext(Protocol_requirement_functionContext.class,0);
		}
		public Protocol_requirement_variableContext protocol_requirement_variable() {
			return getRuleContext(Protocol_requirement_variableContext.class,0);
		}
		public Protocol_requirement_constantContext protocol_requirement_constant() {
			return getRuleContext(Protocol_requirement_constantContext.class,0);
		}
		public Protocol_requirement_initializerContext protocol_requirement_initializer() {
			return getRuleContext(Protocol_requirement_initializerContext.class,0);
		}
		public Protocol_requirement_deinitializerContext protocol_requirement_deinitializer() {
			return getRuleContext(Protocol_requirement_deinitializerContext.class,0);
		}
		public Protocol_requirement_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_item; }
	}

	public final Protocol_requirement_itemContext protocol_requirement_item() throws RecognitionException {
		Protocol_requirement_itemContext _localctx = new Protocol_requirement_itemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_protocol_requirement_item);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				protocol_requirement_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				protocol_requirement_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				protocol_requirement_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1052);
				protocol_requirement_constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1053);
				protocol_requirement_initializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1054);
				protocol_requirement_deinitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_itemsContext extends ParserRuleContext {
		public List<Protocol_requirement_itemContext> protocol_requirement_item() {
			return getRuleContexts(Protocol_requirement_itemContext.class);
		}
		public Protocol_requirement_itemContext protocol_requirement_item(int i) {
			return getRuleContext(Protocol_requirement_itemContext.class,i);
		}
		public Protocol_requirement_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_items; }
	}

	public final Protocol_requirement_itemsContext protocol_requirement_items() throws RecognitionException {
		Protocol_requirement_itemsContext _localctx = new Protocol_requirement_itemsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_protocol_requirement_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1057);
				protocol_requirement_item();
				}
				}
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordRequire );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_typeContext extends ParserRuleContext {
		public Requirement_declaratorContext requirement_declarator() {
			return getRuleContext(Requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordAlias() { return getToken(AtemParser.KeywordAlias, 0); }
		public TerminalNode KeywordType() { return getToken(AtemParser.KeywordType, 0); }
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Protocol_requirement_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_type; }
	}

	public final Protocol_requirement_typeContext protocol_requirement_type() throws RecognitionException {
		Protocol_requirement_typeContext _localctx = new Protocol_requirement_typeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_protocol_requirement_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			requirement_declarator();
			setState(1063);
			match(KeywordAlias);
			setState(1064);
			match(KeywordType);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1065);
				requirement_default_clause();
				setState(1066);
				type_expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_functionContext extends ParserRuleContext {
		public Requirement_declaratorContext requirement_declarator() {
			return getRuleContext(Requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordFunc() { return getToken(AtemParser.KeywordFunc, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Protocol_requirement_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_function; }
	}

	public final Protocol_requirement_functionContext protocol_requirement_function() throws RecognitionException {
		Protocol_requirement_functionContext _localctx = new Protocol_requirement_functionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_protocol_requirement_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			requirement_declarator();
			setState(1071);
			match(KeywordFunc);
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1072);
				attributes();
				}
			}

			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParenthese) {
				{
				setState(1075);
				function_type();
				}
			}

			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1078);
				requirement_default_clause();
				setState(1079);
				function_body();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_variableContext extends ParserRuleContext {
		public Requirement_declaratorContext requirement_declarator() {
			return getRuleContext(Requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordVar() { return getToken(AtemParser.KeywordVar, 0); }
		public Requirement_getter_and_setterContext requirement_getter_and_setter() {
			return getRuleContext(Requirement_getter_and_setterContext.class,0);
		}
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Getter_and_setter_listContext getter_and_setter_list() {
			return getRuleContext(Getter_and_setter_listContext.class,0);
		}
		public Protocol_requirement_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_variable; }
	}

	public final Protocol_requirement_variableContext protocol_requirement_variable() throws RecognitionException {
		Protocol_requirement_variableContext _localctx = new Protocol_requirement_variableContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_protocol_requirement_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			requirement_declarator();
			setState(1084);
			match(KeywordVar);
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftCurly) {
				{
				setState(1085);
				requirement_getter_and_setter();
				}
			}

			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1088);
				requirement_default_clause();
				setState(1089);
				variable_declaration();
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KeywordWith) {
					{
					setState(1090);
					getter_and_setter_list();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_constantContext extends ParserRuleContext {
		public Requirement_declaratorContext requirement_declarator() {
			return getRuleContext(Requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordConst() { return getToken(AtemParser.KeywordConst, 0); }
		public Requirement_getterContext requirement_getter() {
			return getRuleContext(Requirement_getterContext.class,0);
		}
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Getter_listContext getter_list() {
			return getRuleContext(Getter_listContext.class,0);
		}
		public Protocol_requirement_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_constant; }
	}

	public final Protocol_requirement_constantContext protocol_requirement_constant() throws RecognitionException {
		Protocol_requirement_constantContext _localctx = new Protocol_requirement_constantContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_protocol_requirement_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			requirement_declarator();
			setState(1096);
			match(KeywordConst);
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftCurly) {
				{
				setState(1097);
				requirement_getter();
				}
			}

			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1100);
				requirement_default_clause();
				setState(1101);
				constant_declaration();
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KeywordWith) {
					{
					setState(1102);
					getter_list();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_initializerContext extends ParserRuleContext {
		public Empty_requirement_declaratorContext empty_requirement_declarator() {
			return getRuleContext(Empty_requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordInit() { return getToken(AtemParser.KeywordInit, 0); }
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Protocol_requirement_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_initializer; }
	}

	public final Protocol_requirement_initializerContext protocol_requirement_initializer() throws RecognitionException {
		Protocol_requirement_initializerContext _localctx = new Protocol_requirement_initializerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_protocol_requirement_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			empty_requirement_declarator();
			setState(1108);
			match(KeywordInit);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1109);
				requirement_default_clause();
				setState(1110);
				initializer_declaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirement_deinitializerContext extends ParserRuleContext {
		public Empty_requirement_declaratorContext empty_requirement_declarator() {
			return getRuleContext(Empty_requirement_declaratorContext.class,0);
		}
		public TerminalNode KeywordDeinit() { return getToken(AtemParser.KeywordDeinit, 0); }
		public Requirement_default_clauseContext requirement_default_clause() {
			return getRuleContext(Requirement_default_clauseContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Protocol_requirement_deinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement_deinitializer; }
	}

	public final Protocol_requirement_deinitializerContext protocol_requirement_deinitializer() throws RecognitionException {
		Protocol_requirement_deinitializerContext _localctx = new Protocol_requirement_deinitializerContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_protocol_requirement_deinitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			empty_requirement_declarator();
			setState(1115);
			match(KeywordDeinit);
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDefault) {
				{
				setState(1116);
				requirement_default_clause();
				setState(1117);
				deinitializer_declaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_declaratorContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Requirement_nameContext requirement_name() {
			return getRuleContext(Requirement_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Requirement_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_declarator; }
	}

	public final Requirement_declaratorContext requirement_declarator() throws RecognitionException {
		Requirement_declaratorContext _localctx = new Requirement_declaratorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_requirement_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(KeywordRequire);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(1122);
				match(Question);
				}
			}

			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(1125);
				access_level_specifier();
				}
			}

			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1128);
				storage_level_specifier();
				}
				break;
			}
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(1131);
				member_specifiers();
				}
			}

			setState(1134);
			requirement_name();
			setState(1135);
			declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_requirement_declaratorContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public Empty_declare_operatorContext empty_declare_operator() {
			return getRuleContext(Empty_declare_operatorContext.class,0);
		}
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public Access_level_specifierContext access_level_specifier() {
			return getRuleContext(Access_level_specifierContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Member_specifiersContext member_specifiers() {
			return getRuleContext(Member_specifiersContext.class,0);
		}
		public Empty_requirement_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_requirement_declarator; }
	}

	public final Empty_requirement_declaratorContext empty_requirement_declarator() throws RecognitionException {
		Empty_requirement_declaratorContext _localctx = new Empty_requirement_declaratorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_empty_requirement_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(KeywordRequire);
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(1138);
				match(Question);
				}
			}

			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) {
				{
				setState(1141);
				access_level_specifier();
				}
			}

			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1144);
				storage_level_specifier();
				}
				break;
			}
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (KeywordFinal - 44)) | (1L << (KeywordMutable - 44)) | (1L << (KeywordStatic - 44)))) != 0)) {
				{
				setState(1147);
				member_specifiers();
				}
			}

			setState(1150);
			empty_declare_operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Requirement_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_name; }
	}

	public final Requirement_nameContext requirement_name() throws RecognitionException {
		Requirement_nameContext _localctx = new Requirement_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_requirement_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_default_clauseContext extends ParserRuleContext {
		public TerminalNode KeywordDefault() { return getToken(AtemParser.KeywordDefault, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Requirement_default_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_default_clause; }
	}

	public final Requirement_default_clauseContext requirement_default_clause() throws RecognitionException {
		Requirement_default_clauseContext _localctx = new Requirement_default_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_requirement_default_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(KeywordDefault);
			setState(1155);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_getter_and_setterContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public List<Requirement_getter_and_setter_itemContext> requirement_getter_and_setter_item() {
			return getRuleContexts(Requirement_getter_and_setter_itemContext.class);
		}
		public Requirement_getter_and_setter_itemContext requirement_getter_and_setter_item(int i) {
			return getRuleContext(Requirement_getter_and_setter_itemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Requirement_getter_and_setterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_getter_and_setter; }
	}

	public final Requirement_getter_and_setterContext requirement_getter_and_setter() throws RecognitionException {
		Requirement_getter_and_setterContext _localctx = new Requirement_getter_and_setterContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_requirement_getter_and_setter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(LeftCurly);
			setState(1158);
			requirement_getter_and_setter_item();
			setState(1161); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1159);
					match(Comma);
					setState(1160);
					requirement_getter_and_setter_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1165);
			match(Comma);
			setState(1166);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_getterContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode KeywordGet() { return getToken(AtemParser.KeywordGet, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Requirement_getterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_getter; }
	}

	public final Requirement_getterContext requirement_getter() throws RecognitionException {
		Requirement_getterContext _localctx = new Requirement_getterContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_requirement_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(LeftCurly);
			setState(1169);
			match(KeywordGet);
			setState(1170);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_getter_and_setter_itemContext extends ParserRuleContext {
		public TerminalNode KeywordGet() { return getToken(AtemParser.KeywordGet, 0); }
		public TerminalNode KeywordSet() { return getToken(AtemParser.KeywordSet, 0); }
		public Requirement_getter_and_setter_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_getter_and_setter_item; }
	}

	public final Requirement_getter_and_setter_itemContext requirement_getter_and_setter_item() throws RecognitionException {
		Requirement_getter_and_setter_itemContext _localctx = new Requirement_getter_and_setter_itemContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_requirement_getter_and_setter_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if ( !(_la==KeywordGet || _la==KeywordSet) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordInit() { return getToken(AtemParser.KeywordInit, 0); }
		public Initializer_typeContext initializer_type() {
			return getRuleContext(Initializer_typeContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_initializer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(KeywordInit);
			setState(1175);
			initializer_type();
			setState(1176);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordDeinit() { return getToken(AtemParser.KeywordDeinit, 0); }
		public Deinitializer_typeContext deinitializer_type() {
			return getRuleContext(Deinitializer_typeContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_deinitializer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			match(KeywordDeinit);
			setState(1179);
			deinitializer_type();
			setState(1180);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordUnion() { return getToken(AtemParser.KeywordUnion, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Final_specifierContext final_specifier() {
			return getRuleContext(Final_specifierContext.class,0);
		}
		public Union_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_declaration; }
	}

	public final Union_declarationContext union_declaration() throws RecognitionException {
		Union_declarationContext _localctx = new Union_declarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_union_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(KeywordUnion);
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1183);
				attributes();
				}
				break;
			}
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1186);
				final_specifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordEnum() { return getToken(AtemParser.KeywordEnum, 0); }
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Final_specifierContext final_specifier() {
			return getRuleContext(Final_specifierContext.class,0);
		}
		public Extension_listContext extension_list() {
			return getRuleContext(Extension_listContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Deinitializer_listContext deinitializer_list() {
			return getRuleContext(Deinitializer_listContext.class,0);
		}
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(KeywordEnum);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1190);
				attributes();
				}
			}

			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFinal) {
				{
				setState(1193);
				final_specifier();
				}
			}

			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordExtend) {
				{
				setState(1196);
				extension_list();
				}
			}

			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordInit) {
				{
				setState(1199);
				initializer_list();
				}
			}

			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordDeinit) {
				{
				setState(1202);
				deinitializer_list();
				}
			}

			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordMember) {
				{
				setState(1205);
				member_list();
				}
			}

			setState(1208);
			enumerator_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public List<Enumeration_itemContext> enumeration_item() {
			return getRuleContexts(Enumeration_itemContext.class);
		}
		public Enumeration_itemContext enumeration_item(int i) {
			return getRuleContext(Enumeration_itemContext.class,i);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_enumerator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(LeftCurly);
			setState(1211);
			enumeration_item();
			setState(1214); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1212);
					match(Comma);
					setState(1213);
					enumeration_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1216); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1218);
				match(Comma);
				}
			}

			setState(1221);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumeration_itemContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public Member_variableContext member_variable() {
			return getRuleContext(Member_variableContext.class,0);
		}
		public Member_constantContext member_constant() {
			return getRuleContext(Member_constantContext.class,0);
		}
		public Member_functionContext member_function() {
			return getRuleContext(Member_functionContext.class,0);
		}
		public Member_nested_typeContext member_nested_type() {
			return getRuleContext(Member_nested_typeContext.class,0);
		}
		public Enumeration_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration_item; }
	}

	public final Enumeration_itemContext enumeration_item() throws RecognitionException {
		Enumeration_itemContext _localctx = new Enumeration_itemContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enumeration_item);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				member_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				member_constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				member_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1227);
				member_nested_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public Enumerator_nameContext enumerator_name() {
			return getRuleContext(Enumerator_nameContext.class,0);
		}
		public Enumerator_associated_value_clauseContext enumerator_associated_value_clause() {
			return getRuleContext(Enumerator_associated_value_clauseContext.class,0);
		}
		public Enumerator_representationContext enumerator_representation() {
			return getRuleContext(Enumerator_representationContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			enumerator_name();
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1231);
				enumerator_associated_value_clause();
				}
			}

			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1234);
				enumerator_representation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_associated_value_clauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Enumerator_associated_value_listContext enumerator_associated_value_list() {
			return getRuleContext(Enumerator_associated_value_listContext.class,0);
		}
		public Enumerator_associated_value_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_associated_value_clause; }
	}

	public final Enumerator_associated_value_clauseContext enumerator_associated_value_clause() throws RecognitionException {
		Enumerator_associated_value_clauseContext _localctx = new Enumerator_associated_value_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_enumerator_associated_value_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(Colon);
			setState(1238);
			match(LeftParenthese);
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==At) {
				{
				setState(1239);
				enumerator_associated_value_list();
				}
			}

			setState(1242);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_associated_value_listContext extends ParserRuleContext {
		public List<Enumerator_associated_valueContext> enumerator_associated_value() {
			return getRuleContexts(Enumerator_associated_valueContext.class);
		}
		public Enumerator_associated_valueContext enumerator_associated_value(int i) {
			return getRuleContext(Enumerator_associated_valueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Enumerator_associated_value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_associated_value_list; }
	}

	public final Enumerator_associated_value_listContext enumerator_associated_value_list() throws RecognitionException {
		Enumerator_associated_value_listContext _localctx = new Enumerator_associated_value_listContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_enumerator_associated_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			enumerator_associated_value();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1245);
				match(Comma);
				setState(1246);
				enumerator_associated_value();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_associated_valueContext extends ParserRuleContext {
		public Enumerator_associated_value_nameContext enumerator_associated_value_name() {
			return getRuleContext(Enumerator_associated_value_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Enumerator_associated_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_associated_value; }
	}

	public final Enumerator_associated_valueContext enumerator_associated_value() throws RecognitionException {
		Enumerator_associated_valueContext _localctx = new Enumerator_associated_valueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_enumerator_associated_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1252);
				attributes();
				}
			}

			setState(1255);
			enumerator_associated_value_name();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1256);
				match(Colon);
				setState(1257);
				type_annotation();
				}
			}

			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1260);
				default_argument_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_associated_value_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Enumerator_associated_value_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_associated_value_name; }
	}

	public final Enumerator_associated_value_nameContext enumerator_associated_value_name() throws RecognitionException {
		Enumerator_associated_value_nameContext _localctx = new Enumerator_associated_value_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_enumerator_associated_value_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_representationContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enumerator_representationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_representation; }
	}

	public final Enumerator_representationContext enumerator_representation() throws RecognitionException {
		Enumerator_representationContext _localctx = new Enumerator_representationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_enumerator_representation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(Assign);
			setState(1266);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Enumerator_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_name; }
	}

	public final Enumerator_nameContext enumerator_name() throws RecognitionException {
		Enumerator_nameContext _localctx = new Enumerator_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enumerator_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_alias_declarationContext extends ParserRuleContext {
		public Import_expressionContext import_expression() {
			return getRuleContext(Import_expressionContext.class,0);
		}
		public Import_alias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_alias_declaration; }
	}

	public final Import_alias_declarationContext import_alias_declaration() throws RecognitionException {
		Import_alias_declarationContext _localctx = new Import_alias_declarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_import_alias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			import_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_expressionContext extends ParserRuleContext {
		public TerminalNode KeywordImport() { return getToken(AtemParser.KeywordImport, 0); }
		public Import_path_expression_listContext import_path_expression_list() {
			return getRuleContext(Import_path_expression_listContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_expression; }
	}

	public final Import_expressionContext import_expression() throws RecognitionException {
		Import_expressionContext _localctx = new Import_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_import_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(KeywordImport);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordClass) | (1L << KeywordConst) | (1L << KeywordEnum) | (1L << KeywordFunc))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (KeywordMutable - 74)) | (1L << (KeywordProtocol - 74)) | (1L << (KeywordStruct - 74)) | (1L << (KeywordUnion - 74)))) != 0)) {
				{
				setState(1273);
				import_kind();
				}
			}

			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1276);
				attributes();
				}
			}

			setState(1279);
			import_path_expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode KeywordImport() { return getToken(AtemParser.KeywordImport, 0); }
		public Import_path_expression_listContext import_path_expression_list() {
			return getRuleContext(Import_path_expression_listContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(KeywordImport);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordClass) | (1L << KeywordConst) | (1L << KeywordEnum) | (1L << KeywordFunc))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (KeywordMutable - 74)) | (1L << (KeywordProtocol - 74)) | (1L << (KeywordStruct - 74)) | (1L << (KeywordUnion - 74)))) != 0)) {
				{
				setState(1282);
				import_kind();
				}
			}

			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1285);
				attributes();
				}
			}

			setState(1288);
			import_path_expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_expression_listContext extends ParserRuleContext {
		public List<Import_path_expressionContext> import_path_expression() {
			return getRuleContexts(Import_path_expressionContext.class);
		}
		public Import_path_expressionContext import_path_expression(int i) {
			return getRuleContext(Import_path_expressionContext.class,i);
		}
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Import_path_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_expression_list; }
	}

	public final Import_path_expression_listContext import_path_expression_list() throws RecognitionException {
		Import_path_expression_listContext _localctx = new Import_path_expression_listContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_import_path_expression_list);
		int _la;
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				import_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(LeftCurly);
				setState(1293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1292);
					import_path_expression();
					}
					}
					setState(1295); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Identifier || _la==LeftCurly );
				setState(1297);
				match(RightCurly);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_expressionContext extends ParserRuleContext {
		public List<Import_path_expression_elementContext> import_path_expression_element() {
			return getRuleContexts(Import_path_expression_elementContext.class);
		}
		public Import_path_expression_elementContext import_path_expression_element(int i) {
			return getRuleContext(Import_path_expression_elementContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(AtemParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AtemParser.Dot, i);
		}
		public TerminalNode Mul() { return getToken(AtemParser.Mul, 0); }
		public Import_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_expression; }
	}

	public final Import_path_expressionContext import_path_expression() throws RecognitionException {
		Import_path_expressionContext _localctx = new Import_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_import_path_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			import_path_expression_element();
			setState(1304); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1302);
					match(Dot);
					setState(1303);
					import_path_expression_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1306); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1308);
				match(Dot);
				setState(1309);
				match(Mul);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_expression_elementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Import_element_listContext import_element_list() {
			return getRuleContext(Import_element_listContext.class,0);
		}
		public Import_path_expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_expression_element; }
	}

	public final Import_path_expression_elementContext import_path_expression_element() throws RecognitionException {
		Import_path_expression_elementContext _localctx = new Import_path_expression_elementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_import_path_expression_element);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312);
				match(Identifier);
				}
				break;
			case LeftCurly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1313);
				import_element_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_element_listContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public List<Import_path_expression_elementContext> import_path_expression_element() {
			return getRuleContexts(Import_path_expression_elementContext.class);
		}
		public Import_path_expression_elementContext import_path_expression_element(int i) {
			return getRuleContext(Import_path_expression_elementContext.class,i);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Import_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_element_list; }
	}

	public final Import_element_listContext import_element_list() throws RecognitionException {
		Import_element_listContext _localctx = new Import_element_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_import_element_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(LeftCurly);
			setState(1317);
			import_path_expression_element();
			setState(1320); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1318);
					match(Comma);
					setState(1319);
					import_path_expression_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1322); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1324);
				match(Comma);
				}
			}

			setState(1327);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_kindContext extends ParserRuleContext {
		public TerminalNode KeywordAlias() { return getToken(AtemParser.KeywordAlias, 0); }
		public TerminalNode KeywordStruct() { return getToken(AtemParser.KeywordStruct, 0); }
		public TerminalNode KeywordClass() { return getToken(AtemParser.KeywordClass, 0); }
		public TerminalNode KeywordUnion() { return getToken(AtemParser.KeywordUnion, 0); }
		public TerminalNode KeywordEnum() { return getToken(AtemParser.KeywordEnum, 0); }
		public TerminalNode KeywordProtocol() { return getToken(AtemParser.KeywordProtocol, 0); }
		public TerminalNode KeywordConst() { return getToken(AtemParser.KeywordConst, 0); }
		public TerminalNode KeywordMutable() { return getToken(AtemParser.KeywordMutable, 0); }
		public TerminalNode KeywordFunc() { return getToken(AtemParser.KeywordFunc, 0); }
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordClass) | (1L << KeywordConst) | (1L << KeywordEnum) | (1L << KeywordFunc))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (KeywordMutable - 74)) | (1L << (KeywordProtocol - 74)) | (1L << (KeywordStruct - 74)) | (1L << (KeywordUnion - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordProject() { return getToken(AtemParser.KeywordProject, 0); }
		public Project_member_listContext project_member_list() {
			return getRuleContext(Project_member_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Project_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_declaration; }
	}

	public final Project_declarationContext project_declaration() throws RecognitionException {
		Project_declarationContext _localctx = new Project_declarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_project_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(KeywordProject);
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1332);
				attributes();
				}
			}

			setState(1335);
			project_member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_member_listContext extends ParserRuleContext {
		public TerminalNode KeywordThis() { return getToken(AtemParser.KeywordThis, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Project_membersContext project_members() {
			return getRuleContext(Project_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Project_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_member_list; }
	}

	public final Project_member_listContext project_member_list() throws RecognitionException {
		Project_member_listContext _localctx = new Project_member_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_project_member_list);
		try {
			setState(1342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordThis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				match(KeywordThis);
				}
				break;
			case LeftCurly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				match(LeftCurly);
				setState(1339);
				project_members();
				setState(1340);
				match(RightCurly);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_memberContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Project_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_member; }
	}

	public final Project_memberContext project_member() throws RecognitionException {
		Project_memberContext _localctx = new Project_memberContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_project_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_membersContext extends ParserRuleContext {
		public List<Project_memberContext> project_member() {
			return getRuleContexts(Project_memberContext.class);
		}
		public Project_memberContext project_member(int i) {
			return getRuleContext(Project_memberContext.class,i);
		}
		public Project_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_members; }
	}

	public final Project_membersContext project_members() throws RecognitionException {
		Project_membersContext _localctx = new Project_membersContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_project_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1346);
				project_member();
				}
				}
				setState(1349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordGlobal || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeywordModule - 73)) | (1L << (KeywordOuter - 73)) | (1L << (KeywordPackage - 73)) | (1L << (KeywordSelf - 73)) | (1L << (KeywordSuper - 73)) | (1L << (KeywordThis - 73)) | (1L << (Identifier - 73)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordPackage() { return getToken(AtemParser.KeywordPackage, 0); }
		public Package_member_listContext package_member_list() {
			return getRuleContext(Package_member_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_package_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			match(KeywordPackage);
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1352);
				attributes();
				}
			}

			setState(1355);
			package_member_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_member_listContext extends ParserRuleContext {
		public TerminalNode KeywordThis() { return getToken(AtemParser.KeywordThis, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public Package_membersContext package_members() {
			return getRuleContext(Package_membersContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Package_member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_member_list; }
	}

	public final Package_member_listContext package_member_list() throws RecognitionException {
		Package_member_listContext _localctx = new Package_member_listContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_package_member_list);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordThis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(KeywordThis);
				}
				break;
			case LeftCurly:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				match(LeftCurly);
				setState(1359);
				package_members();
				setState(1360);
				match(RightCurly);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_memberContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Package_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_member; }
	}

	public final Package_memberContext package_member() throws RecognitionException {
		Package_memberContext _localctx = new Package_memberContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_package_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_membersContext extends ParserRuleContext {
		public List<Package_memberContext> package_member() {
			return getRuleContexts(Package_memberContext.class);
		}
		public Package_memberContext package_member(int i) {
			return getRuleContext(Package_memberContext.class,i);
		}
		public Package_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_members; }
	}

	public final Package_membersContext package_members() throws RecognitionException {
		Package_membersContext _localctx = new Package_membersContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_package_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1366);
				package_member();
				}
				}
				setState(1369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KeywordGlobal || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeywordModule - 73)) | (1L << (KeywordOuter - 73)) | (1L << (KeywordPackage - 73)) | (1L << (KeywordSelf - 73)) | (1L << (KeywordSuper - 73)) | (1L << (KeywordThis - 73)) | (1L << (Identifier - 73)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordModule() { return getToken(AtemParser.KeywordModule, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_block_no_labelContext code_block_no_label() {
			return getRuleContext(Code_block_no_labelContext.class,0);
		}
		public Module_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_declaration; }
	}

	public final Module_declarationContext module_declaration() throws RecognitionException {
		Module_declarationContext _localctx = new Module_declarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_module_declaration);
		int _la;
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1371);
				match(KeywordModule);
				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1372);
					attributes();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1375);
				match(KeywordModule);
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(1376);
					attributes();
					}
				}

				setState(1379);
				code_block_no_label();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordNamespace() { return getToken(AtemParser.KeywordNamespace, 0); }
		public Code_block_no_labelContext code_block_no_label() {
			return getRuleContext(Code_block_no_labelContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(KeywordNamespace);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1383);
				attributes();
				}
			}

			setState(1386);
			code_block_no_label();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordAlias() { return getToken(AtemParser.KeywordAlias, 0); }
		public TerminalNode KeywordType() { return getToken(AtemParser.KeywordType, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(KeywordAlias);
			setState(1389);
			match(KeywordType);
			setState(1390);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_level_specifierContext extends ParserRuleContext {
		public TerminalNode KeywordPrivate() { return getToken(AtemParser.KeywordPrivate, 0); }
		public TerminalNode KeywordFilePrivate() { return getToken(AtemParser.KeywordFilePrivate, 0); }
		public TerminalNode KeywordInternal() { return getToken(AtemParser.KeywordInternal, 0); }
		public TerminalNode KeywordPublic() { return getToken(AtemParser.KeywordPublic, 0); }
		public TerminalNode KeywordOpen() { return getToken(AtemParser.KeywordOpen, 0); }
		public Access_level_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_specifier; }
	}

	public final Access_level_specifierContext access_level_specifier() throws RecognitionException {
		Access_level_specifierContext _localctx = new Access_level_specifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_access_level_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			_la = _input.LA(1);
			if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (KeywordFilePrivate - 43)) | (1L << (KeywordInternal - 43)) | (1L << (KeywordOpen - 43)) | (1L << (KeywordPrivate - 43)) | (1L << (KeywordPublic - 43)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordFunc() { return getToken(AtemParser.KeywordFunc, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(KeywordFunc);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1395);
				attributes();
				}
			}

			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1398);
				function_type();
				}
				break;
			}
			setState(1401);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_function_body);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contract_listContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<ContractContext> contract() {
			return getRuleContexts(ContractContext.class);
		}
		public ContractContext contract(int i) {
			return getRuleContext(ContractContext.class,i);
		}
		public Contract_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_list; }
	}

	public final Contract_listContext contract_list() throws RecognitionException {
		Contract_listContext _localctx = new Contract_listContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_contract_list);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				match(KeywordRequire);
				setState(1408);
				match(LeftCurly);
				setState(1410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1409);
					contract();
					}
					}
					setState(1412); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KeywordEnsure || _la==KeywordExpect );
				setState(1414);
				match(RightCurly);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				match(KeywordRequire);
				setState(1417);
				contract();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractContext extends ParserRuleContext {
		public Contract_preconditionContext contract_precondition() {
			return getRuleContext(Contract_preconditionContext.class,0);
		}
		public Contract_postconditionContext contract_postcondition() {
			return getRuleContext(Contract_postconditionContext.class,0);
		}
		public ContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract; }
	}

	public final ContractContext contract() throws RecognitionException {
		ContractContext _localctx = new ContractContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_contract);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordExpect:
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				contract_precondition();
				}
				break;
			case KeywordEnsure:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				contract_postcondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contract_preconditionContext extends ParserRuleContext {
		public TerminalNode KeywordExpect() { return getToken(AtemParser.KeywordExpect, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public Contract_preconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_precondition; }
	}

	public final Contract_preconditionContext contract_precondition() throws RecognitionException {
		Contract_preconditionContext _localctx = new Contract_preconditionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_contract_precondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(KeywordExpect);
			setState(1425);
			expression(0);
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(1426);
				match(KeywordWith);
				setState(1427);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contract_postconditionContext extends ParserRuleContext {
		public TerminalNode KeywordEnsure() { return getToken(AtemParser.KeywordEnsure, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> KeywordWith() { return getTokens(AtemParser.KeywordWith); }
		public TerminalNode KeywordWith(int i) {
			return getToken(AtemParser.KeywordWith, i);
		}
		public Return_value_nameContext return_value_name() {
			return getRuleContext(Return_value_nameContext.class,0);
		}
		public Declare_operatorContext declare_operator() {
			return getRuleContext(Declare_operatorContext.class,0);
		}
		public TerminalNode KeywordReturn() { return getToken(AtemParser.KeywordReturn, 0); }
		public Contract_postconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contract_postcondition; }
	}

	public final Contract_postconditionContext contract_postcondition() throws RecognitionException {
		Contract_postconditionContext _localctx = new Contract_postconditionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_contract_postcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(KeywordEnsure);
			{
			setState(1431);
			match(KeywordWith);
			setState(1432);
			return_value_name();
			setState(1433);
			declare_operator();
			setState(1434);
			match(KeywordReturn);
			}
			setState(1436);
			expression(0);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordWith) {
				{
				setState(1437);
				match(KeywordWith);
				setState(1438);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_value_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Return_value_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value_name; }
	}

	public final Return_value_nameContext return_value_name() throws RecognitionException {
		Return_value_nameContext _localctx = new Return_value_nameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_return_value_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_typeContext extends ParserRuleContext {
		public Function_parameter_clauseContext function_parameter_clause() {
			return getRuleContext(Function_parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_specifiersContext function_specifiers() {
			return getRuleContext(Function_specifiersContext.class,0);
		}
		public Contract_listContext contract_list() {
			return getRuleContext(Contract_listContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			function_parameter_clause();
			setState(1446);
			function_result();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) {
				{
				setState(1447);
				function_specifiers();
				}
			}

			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1450);
				contract_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_specifierContext extends ParserRuleContext {
		public TerminalNode KeywordRecursive() { return getToken(AtemParser.KeywordRecursive, 0); }
		public TerminalNode KeywordThrows() { return getToken(AtemParser.KeywordThrows, 0); }
		public TerminalNode KeywordPure() { return getToken(AtemParser.KeywordPure, 0); }
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_function_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_specifiersContext extends ParserRuleContext {
		public List<Function_specifierContext> function_specifier() {
			return getRuleContexts(Function_specifierContext.class);
		}
		public Function_specifierContext function_specifier(int i) {
			return getRuleContext(Function_specifierContext.class,i);
		}
		public Function_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifiers; }
	}

	public final Function_specifiersContext function_specifiers() throws RecognitionException {
		Function_specifiersContext _localctx = new Function_specifiersContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_function_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1455);
				function_specifier();
				}
				}
				setState(1458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (KeywordPure - 91)) | (1L << (KeywordRecursive - 91)) | (1L << (KeywordThrows - 91)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_resultContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(AtemParser.Arrow, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_function_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(Arrow);
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1461);
				attributes();
				}
			}

			setState(1464);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Function_parameter_listContext function_parameter_list() {
			return getRuleContext(Function_parameter_listContext.class,0);
		}
		public Function_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_clause; }
	}

	public final Function_parameter_clauseContext function_parameter_clause() throws RecognitionException {
		Function_parameter_clauseContext _localctx = new Function_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_function_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(LeftParenthese);
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==At) {
				{
				setState(1467);
				function_parameter_list();
				}
			}

			setState(1470);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_listContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_list; }
	}

	public final Function_parameter_listContext function_parameter_list() throws RecognitionException {
		Function_parameter_listContext _localctx = new Function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			function_parameter();
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1473);
				match(Comma);
				setState(1474);
				function_parameter();
				}
				}
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameterContext extends ParserRuleContext {
		public Function_parameter_nameContext function_parameter_name() {
			return getRuleContext(Function_parameter_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_parameter_labelContext function_parameter_label() {
			return getRuleContext(Function_parameter_labelContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1480);
				attributes();
				}
			}

			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1483);
				function_parameter_label();
				}
				break;
			}
			setState(1486);
			function_parameter_name();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1487);
				match(Colon);
				setState(1488);
				type_annotation();
				}
			}

			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1491);
				default_argument_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_labelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Function_parameter_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_label; }
	}

	public final Function_parameter_labelContext function_parameter_label() throws RecognitionException {
		Function_parameter_labelContext _localctx = new Function_parameter_labelContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_function_parameter_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameter_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Function_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter_name; }
	}

	public final Function_parameter_nameContext function_parameter_name() throws RecognitionException {
		Function_parameter_nameContext _localctx = new Function_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_function_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(Assign);
			setState(1499);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_annotationContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1501);
				attributes();
				}
			}

			setState(1504);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordVar() { return getToken(AtemParser.KeywordVar, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(KeywordVar);
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1507);
				storage_level_specifier();
				}
				break;
			}
			setState(1510);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode KeywordVal() { return getToken(AtemParser.KeywordVal, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Storage_level_specifierContext storage_level_specifier() {
			return getRuleContext(Storage_level_specifierContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			match(KeywordVal);
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1513);
				storage_level_specifier();
				}
				break;
			}
			setState(1516);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_level_specifierContext extends ParserRuleContext {
		public TerminalNode KeywordGlobal() { return getToken(AtemParser.KeywordGlobal, 0); }
		public TerminalNode KeywordStatic() { return getToken(AtemParser.KeywordStatic, 0); }
		public TerminalNode KeywordThreadLocal() { return getToken(AtemParser.KeywordThreadLocal, 0); }
		public Storage_level_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_level_specifier; }
	}

	public final Storage_level_specifierContext storage_level_specifier() throws RecognitionException {
		Storage_level_specifierContext _localctx = new Storage_level_specifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_storage_level_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (KeywordGlobal - 54)) | (1L << (KeywordStatic - 54)) | (1L << (KeywordThreadLocal - 54)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode KeywordFunc() { return getToken(AtemParser.KeywordFunc, 0); }
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_closure_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFunc) {
				{
				setState(1520);
				match(KeywordFunc);
				}
			}

			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftSquare) {
				{
				setState(1523);
				capture_list();
				}
			}

			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParenthese) {
				{
				setState(1526);
				function_type();
				}
			}

			setState(1529);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_listContext extends ParserRuleContext {
		public TerminalNode LeftSquare() { return getToken(AtemParser.LeftSquare, 0); }
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public TerminalNode RightSquare() { return getToken(AtemParser.RightSquare, 0); }
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(LeftSquare);
			setState(1532);
			capture_list_items();
			setState(1533);
			match(RightSquare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1535);
				capture_list_item();
				}
				}
				setState(1538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defer_statementContext extends ParserRuleContext {
		public TerminalNode KeywordDefer() { return getToken(AtemParser.KeywordDefer, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_kindContext defer_kind() {
			return getRuleContext(Defer_kindContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_defer_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(KeywordDefer);
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordFail || _la==KeywordSuccess) {
				{
				setState(1543);
				defer_kind();
				}
			}

			setState(1546);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defer_kindContext extends ParserRuleContext {
		public TerminalNode KeywordSuccess() { return getToken(AtemParser.KeywordSuccess, 0); }
		public TerminalNode KeywordFail() { return getToken(AtemParser.KeywordFail, 0); }
		public Defer_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_kind; }
	}

	public final Defer_kindContext defer_kind() throws RecognitionException {
		Defer_kindContext _localctx = new Defer_kindContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_defer_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			_la = _input.LA(1);
			if ( !(_la==KeywordFail || _la==KeywordSuccess) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_block_no_labelContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_block_no_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block_no_label; }
	}

	public final Code_block_no_labelContext code_block_no_label() throws RecognitionException {
		Code_block_no_labelContext _localctx = new Code_block_no_labelContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_code_block_no_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(LeftCurly);
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordDefer) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFilePrivate) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordInternal - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOpen - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordPrivate - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordPublic - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordStatic - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThreadLocal - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Semicolon - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0)) {
				{
				setState(1551);
				statements();
				}
			}

			setState(1554);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Code_block_nameContext code_block_name() {
			return getRuleContext(Code_block_nameContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1556);
				code_block_name();
				}
			}

			setState(1559);
			match(LeftCurly);
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordDefer) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFilePrivate) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordInternal - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOpen - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordPrivate - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordPublic - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordStatic - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThreadLocal - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Semicolon - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0)) {
				{
				setState(1560);
				statements();
				}
			}

			setState(1563);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_block_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Code_block_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block_name; }
	}

	public final Code_block_nameContext code_block_name() throws RecognitionException {
		Code_block_nameContext _localctx = new Code_block_nameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_code_block_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(Identifier);
			setState(1566);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AtemParser.At, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(At);
			setState(1569);
			attribute_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1572); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1571);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1574); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			path_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_operatorContext extends ParserRuleContext {
		public Trailing_closuresContext trailing_closures() {
			return getRuleContext(Trailing_closuresContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_operator; }
	}

	public final Function_call_operatorContext function_call_operator() throws RecognitionException {
		Function_call_operatorContext _localctx = new Function_call_operatorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_function_call_operator);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1578);
					function_call_argument_clause();
					}
					break;
				}
				setState(1581);
				trailing_closures();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				function_call_argument_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public Function_call_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_clause; }
	}

	public final Function_call_argument_clauseContext function_call_argument_clause() throws RecognitionException {
		Function_call_argument_clauseContext _localctx = new Function_call_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_function_call_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(LeftParenthese);
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1586);
				function_call_argument_list();
				}
				break;
			}
			setState(1589);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argument_listContext extends ParserRuleContext {
		public List<Function_call_argumentContext> function_call_argument() {
			return getRuleContexts(Function_call_argumentContext.class);
		}
		public Function_call_argumentContext function_call_argument(int i) {
			return getRuleContext(Function_call_argumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_list; }
	}

	public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
		Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			function_call_argument();
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1592);
				match(Comma);
				setState(1593);
				function_call_argument();
				}
				}
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public Function_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument; }
	}

	public final Function_call_argumentContext function_call_argument() throws RecognitionException {
		Function_call_argumentContext _localctx = new Function_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_function_call_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1599);
				argument_name();
				}
				break;
			}
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1602);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1603);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(Identifier);
			setState(1607);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_namesContext extends ParserRuleContext {
		public List<Argument_nameContext> argument_name() {
			return getRuleContexts(Argument_nameContext.class);
		}
		public Argument_nameContext argument_name(int i) {
			return getRuleContext(Argument_nameContext.class,i);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1609);
				argument_name();
				}
				}
				setState(1612); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_closuresContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public List<Labeled_trailing_closuresContext> labeled_trailing_closures() {
			return getRuleContexts(Labeled_trailing_closuresContext.class);
		}
		public Labeled_trailing_closuresContext labeled_trailing_closures(int i) {
			return getRuleContext(Labeled_trailing_closuresContext.class,i);
		}
		public Trailing_closuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closures; }
	}

	public final Trailing_closuresContext trailing_closures() throws RecognitionException {
		Trailing_closuresContext _localctx = new Trailing_closuresContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_trailing_closures);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			closure_expression();
			setState(1616); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1615);
					labeled_trailing_closures();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1618); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_trailing_closureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Labeled_trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_trailing_closure; }
	}

	public final Labeled_trailing_closureContext labeled_trailing_closure() throws RecognitionException {
		Labeled_trailing_closureContext _localctx = new Labeled_trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_labeled_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(Identifier);
			setState(1621);
			match(Assign);
			setState(1622);
			closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_trailing_closuresContext extends ParserRuleContext {
		public List<Labeled_trailing_closureContext> labeled_trailing_closure() {
			return getRuleContexts(Labeled_trailing_closureContext.class);
		}
		public Labeled_trailing_closureContext labeled_trailing_closure(int i) {
			return getRuleContext(Labeled_trailing_closureContext.class,i);
		}
		public Labeled_trailing_closuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_trailing_closures; }
	}

	public final Labeled_trailing_closuresContext labeled_trailing_closures() throws RecognitionException {
		Labeled_trailing_closuresContext _localctx = new Labeled_trailing_closuresContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_labeled_trailing_closures);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1624);
					labeled_trailing_closure();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1627); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode Add() { return getToken(AtemParser.Add, 0); }
		public TerminalNode OverflowingAdd() { return getToken(AtemParser.OverflowingAdd, 0); }
		public TerminalNode SaturatingAdd() { return getToken(AtemParser.SaturatingAdd, 0); }
		public TerminalNode Sub() { return getToken(AtemParser.Sub, 0); }
		public TerminalNode OverflowingSub() { return getToken(AtemParser.OverflowingSub, 0); }
		public TerminalNode SaturatingSub() { return getToken(AtemParser.SaturatingSub, 0); }
		public TerminalNode Mul() { return getToken(AtemParser.Mul, 0); }
		public TerminalNode OverflowingMul() { return getToken(AtemParser.OverflowingMul, 0); }
		public TerminalNode SaturatingMul() { return getToken(AtemParser.SaturatingMul, 0); }
		public TerminalNode Divide() { return getToken(AtemParser.Divide, 0); }
		public TerminalNode RemainderDivide() { return getToken(AtemParser.RemainderDivide, 0); }
		public TerminalNode Power() { return getToken(AtemParser.Power, 0); }
		public TerminalNode OverflowingPower() { return getToken(AtemParser.OverflowingPower, 0); }
		public TerminalNode SaturatingPower() { return getToken(AtemParser.SaturatingPower, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (Add - 150)) | (1L << (OverflowingAdd - 150)) | (1L << (SaturatingAdd - 150)) | (1L << (Sub - 150)) | (1L << (OverflowingSub - 150)) | (1L << (SaturatingSub - 150)) | (1L << (Mul - 150)) | (1L << (OverflowingMul - 150)) | (1L << (SaturatingMul - 150)) | (1L << (Divide - 150)) | (1L << (RemainderDivide - 150)) | (1L << (Power - 150)) | (1L << (OverflowingPower - 150)) | (1L << (SaturatingPower - 150)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negation_operatorContext extends ParserRuleContext {
		public TerminalNode Sub() { return getToken(AtemParser.Sub, 0); }
		public TerminalNode OverflowingSub() { return getToken(AtemParser.OverflowingSub, 0); }
		public Negation_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation_operator; }
	}

	public final Negation_operatorContext negation_operator() throws RecognitionException {
		Negation_operatorContext _localctx = new Negation_operatorContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_negation_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_la = _input.LA(1);
			if ( !(_la==Sub || _la==OverflowingSub) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public TerminalNode AddAssign() { return getToken(AtemParser.AddAssign, 0); }
		public TerminalNode OverflowingAddAssign() { return getToken(AtemParser.OverflowingAddAssign, 0); }
		public TerminalNode SaturatingAddAssign() { return getToken(AtemParser.SaturatingAddAssign, 0); }
		public TerminalNode SubAssign() { return getToken(AtemParser.SubAssign, 0); }
		public TerminalNode OverflowingSubAssign() { return getToken(AtemParser.OverflowingSubAssign, 0); }
		public TerminalNode SaturatingSubAssign() { return getToken(AtemParser.SaturatingSubAssign, 0); }
		public TerminalNode MulAssign() { return getToken(AtemParser.MulAssign, 0); }
		public TerminalNode OverflowingMulAssign() { return getToken(AtemParser.OverflowingMulAssign, 0); }
		public TerminalNode SaturatingMulAssign() { return getToken(AtemParser.SaturatingMulAssign, 0); }
		public TerminalNode PowerAssign() { return getToken(AtemParser.PowerAssign, 0); }
		public TerminalNode OverflowingPowerAssign() { return getToken(AtemParser.OverflowingPowerAssign, 0); }
		public TerminalNode SaturatingPowerAssign() { return getToken(AtemParser.SaturatingPowerAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(AtemParser.DivideAssign, 0); }
		public TerminalNode RemainderDivideAssign() { return getToken(AtemParser.RemainderDivideAssign, 0); }
		public TerminalNode BitLeftShiftAssign() { return getToken(AtemParser.BitLeftShiftAssign, 0); }
		public TerminalNode SaturatingBitLeftShiftAssign() { return getToken(AtemParser.SaturatingBitLeftShiftAssign, 0); }
		public TerminalNode BitRightShiftAssign() { return getToken(AtemParser.BitRightShiftAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(AtemParser.BitAndAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(AtemParser.BitOrAssign, 0); }
		public TerminalNode BitNotAssign() { return getToken(AtemParser.BitNotAssign, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (Assign - 164)) | (1L << (AddAssign - 164)) | (1L << (OverflowingAddAssign - 164)) | (1L << (SaturatingAddAssign - 164)) | (1L << (SubAssign - 164)) | (1L << (OverflowingSubAssign - 164)) | (1L << (SaturatingSubAssign - 164)) | (1L << (MulAssign - 164)) | (1L << (OverflowingMulAssign - 164)) | (1L << (SaturatingMulAssign - 164)) | (1L << (PowerAssign - 164)) | (1L << (OverflowingPowerAssign - 164)) | (1L << (SaturatingPowerAssign - 164)) | (1L << (DivideAssign - 164)) | (1L << (RemainderDivideAssign - 164)) | (1L << (BitLeftShiftAssign - 164)) | (1L << (SaturatingBitLeftShiftAssign - 164)) | (1L << (BitRightShiftAssign - 164)) | (1L << (BitAndAssign - 164)) | (1L << (BitOrAssign - 164)) | (1L << (BitNotAssign - 164)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode GreaterThan() { return getToken(AtemParser.GreaterThan, 0); }
		public TerminalNode LessThan() { return getToken(AtemParser.LessThan, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(AtemParser.GreaterThanOrEqual, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(AtemParser.LessThanOrEqual, 0); }
		public TerminalNode Equal() { return getToken(AtemParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(AtemParser.NotEqual, 0); }
		public TerminalNode ThreeWayComparison() { return getToken(AtemParser.ThreeWayComparison, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_la = _input.LA(1);
			if ( !(((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (GreaterThan - 185)) | (1L << (LessThan - 185)) | (1L << (GreaterThanOrEqual - 185)) | (1L << (LessThanOrEqual - 185)) | (1L << (NotEqual - 185)) | (1L << (Equal - 185)) | (1L << (ThreeWayComparison - 185)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_boolean_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordAnd() { return getToken(AtemParser.KeywordAnd, 0); }
		public TerminalNode KeywordOr() { return getToken(AtemParser.KeywordOr, 0); }
		public Binary_boolean_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_boolean_operator; }
	}

	public final Binary_boolean_operatorContext binary_boolean_operator() throws RecognitionException {
		Binary_boolean_operatorContext _localctx = new Binary_boolean_operatorContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_binary_boolean_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			_la = _input.LA(1);
			if ( !(_la==KeywordAnd || _la==KeywordOr) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_boolean_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordNot() { return getToken(AtemParser.KeywordNot, 0); }
		public Unary_boolean_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_boolean_operator; }
	}

	public final Unary_boolean_operatorContext unary_boolean_operator() throws RecognitionException {
		Unary_boolean_operatorContext _localctx = new Unary_boolean_operatorContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_unary_boolean_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			match(KeywordNot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_bit_operatorContext extends ParserRuleContext {
		public TerminalNode BitAnd() { return getToken(AtemParser.BitAnd, 0); }
		public TerminalNode BitOr() { return getToken(AtemParser.BitOr, 0); }
		public TerminalNode BitLeftShift() { return getToken(AtemParser.BitLeftShift, 0); }
		public TerminalNode SaturatingBitLeftShift() { return getToken(AtemParser.SaturatingBitLeftShift, 0); }
		public TerminalNode BitRightShift() { return getToken(AtemParser.BitRightShift, 0); }
		public Binary_bit_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_bit_operator; }
	}

	public final Binary_bit_operatorContext binary_bit_operator() throws RecognitionException {
		Binary_bit_operatorContext _localctx = new Binary_bit_operatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_binary_bit_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_la = _input.LA(1);
			if ( !(((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (BitAnd - 193)) | (1L << (BitOr - 193)) | (1L << (BitLeftShift - 193)) | (1L << (SaturatingBitLeftShift - 193)) | (1L << (BitRightShift - 193)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_bit_operatorContext extends ParserRuleContext {
		public TerminalNode BitNot() { return getToken(AtemParser.BitNot, 0); }
		public TerminalNode BitXor() { return getToken(AtemParser.BitXor, 0); }
		public Unary_bit_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_bit_operator; }
	}

	public final Unary_bit_operatorContext unary_bit_operator() throws RecognitionException {
		Unary_bit_operatorContext _localctx = new Unary_bit_operatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_unary_bit_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			_la = _input.LA(1);
			if ( !(_la==BitNot || _la==BitXor) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_operatorContext extends ParserRuleContext {
		public TerminalNode PointerType() { return getToken(AtemParser.PointerType, 0); }
		public TerminalNode PointerDeref() { return getToken(AtemParser.PointerDeref, 0); }
		public TerminalNode ObjectAddress() { return getToken(AtemParser.ObjectAddress, 0); }
		public Pointer_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_operator; }
	}

	public final Pointer_operatorContext pointer_operator() throws RecognitionException {
		Pointer_operatorContext _localctx = new Pointer_operatorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_pointer_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			_la = _input.LA(1);
			if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PointerType - 199)) | (1L << (PointerDeref - 199)) | (1L << (ObjectAddress - 199)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reflect_operatorContext extends ParserRuleContext {
		public TerminalNode Reflect() { return getToken(AtemParser.Reflect, 0); }
		public TerminalNode Reify() { return getToken(AtemParser.Reify, 0); }
		public Reflect_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reflect_operator; }
	}

	public final Reflect_operatorContext reflect_operator() throws RecognitionException {
		Reflect_operatorContext _localctx = new Reflect_operatorContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_reflect_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_la = _input.LA(1);
			if ( !(_la==Reflect || _la==Reify) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_operatorContext extends ParserRuleContext {
		public TerminalNode ClosedRange() { return getToken(AtemParser.ClosedRange, 0); }
		public TerminalNode RightOpenRange() { return getToken(AtemParser.RightOpenRange, 0); }
		public TerminalNode LeftOpenRange() { return getToken(AtemParser.LeftOpenRange, 0); }
		public TerminalNode OpenedRange() { return getToken(AtemParser.OpenedRange, 0); }
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_range_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			_la = _input.LA(1);
			if ( !(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (ClosedRange - 204)) | (1L << (RightOpenRange - 204)) | (1L << (LeftOpenRange - 204)) | (1L << (OpenedRange - 204)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_optional_unwrapping_operatorContext extends ParserRuleContext {
		public TerminalNode DefaultUnwrapping() { return getToken(AtemParser.DefaultUnwrapping, 0); }
		public Binary_optional_unwrapping_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_optional_unwrapping_operator; }
	}

	public final Binary_optional_unwrapping_operatorContext binary_optional_unwrapping_operator() throws RecognitionException {
		Binary_optional_unwrapping_operatorContext _localctx = new Binary_optional_unwrapping_operatorContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_binary_optional_unwrapping_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(DefaultUnwrapping);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_optional_unwrapping_operatorContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public TerminalNode Bang() { return getToken(AtemParser.Bang, 0); }
		public Unary_optional_unwrapping_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_optional_unwrapping_operator; }
	}

	public final Unary_optional_unwrapping_operatorContext unary_optional_unwrapping_operator() throws RecognitionException {
		Unary_optional_unwrapping_operatorContext _localctx = new Unary_optional_unwrapping_operatorContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_unary_optional_unwrapping_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_la = _input.LA(1);
			if ( !(_la==Question || _la==Bang) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_operatorContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(AtemParser.Arrow, 0); }
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(Arrow);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordTry() { return getToken(AtemParser.KeywordTry, 0); }
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public TerminalNode Bang() { return getToken(AtemParser.Bang, 0); }
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_try_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			match(KeywordTry);
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==Question || _la==Bang) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordIs() { return getToken(AtemParser.KeywordIs, 0); }
		public TerminalNode KeywordAs() { return getToken(AtemParser.KeywordAs, 0); }
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public TerminalNode Bang() { return getToken(AtemParser.Bang, 0); }
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_type_casting_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordIs:
				{
				setState(1661);
				match(KeywordIs);
				}
				break;
			case KeywordAs:
				{
				{
				setState(1662);
				match(KeywordAs);
				setState(1664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1663);
					_la = _input.LA(1);
					if ( !(_la==Question || _la==Bang) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Await_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordAwait() { return getToken(AtemParser.KeywordAwait, 0); }
		public Await_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_await_operator; }
	}

	public final Await_operatorContext await_operator() throws RecognitionException {
		Await_operatorContext _localctx = new Await_operatorContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_await_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(KeywordAwait);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Async_operatorContext extends ParserRuleContext {
		public TerminalNode KeywordAsync() { return getToken(AtemParser.KeywordAsync, 0); }
		public Async_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_operator; }
	}

	public final Async_operatorContext async_operator() throws RecognitionException {
		Async_operatorContext _localctx = new Async_operatorContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_async_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(KeywordAsync);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pipeline_operatorContext extends ParserRuleContext {
		public TerminalNode PlaceholderPipeline() { return getToken(AtemParser.PlaceholderPipeline, 0); }
		public TerminalNode LeftThreadingPipeline() { return getToken(AtemParser.LeftThreadingPipeline, 0); }
		public Pipeline_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline_operator; }
	}

	public final Pipeline_operatorContext pipeline_operator() throws RecognitionException {
		Pipeline_operatorContext _localctx = new Pipeline_operatorContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_pipeline_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			_la = _input.LA(1);
			if ( !(_la==PlaceholderPipeline || _la==LeftThreadingPipeline) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Using_expression_Context extends ExpressionContext {
		public TerminalNode KeywordUsing() { return getToken(AtemParser.KeywordUsing, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Using_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class For_expression_Context extends ExpressionContext {
		public For_expressionContext for_expression() {
			return getRuleContext(For_expressionContext.class,0);
		}
		public For_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Continue_expression_Context extends ExpressionContext {
		public TerminalNode KeywordContinue() { return getToken(AtemParser.KeywordContinue, 0); }
		public Code_block_nameContext code_block_name() {
			return getRuleContext(Code_block_nameContext.class,0);
		}
		public Continue_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Catch_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KeywordCatch() { return getToken(AtemParser.KeywordCatch, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TerminalNode KeywordThen() { return getToken(AtemParser.KeywordThen, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Require_clauseContext require_clause() {
			return getRuleContext(Require_clauseContext.class,0);
		}
		public Catch_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Throw_expression_Context extends ExpressionContext {
		public TerminalNode KeywordThrow() { return getToken(AtemParser.KeywordThrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Binary_optional_unwrapping_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_optional_unwrapping_operatorContext binary_optional_unwrapping_operator() {
			return getRuleContext(Binary_optional_unwrapping_operatorContext.class,0);
		}
		public Binary_optional_unwrapping_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Declaretion_expression_Context extends ExpressionContext {
		public Declaration_expressionContext declaration_expression() {
			return getRuleContext(Declaration_expressionContext.class,0);
		}
		public Declaretion_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Import_expression_Context extends ExpressionContext {
		public Import_expressionContext import_expression() {
			return getRuleContext(Import_expressionContext.class,0);
		}
		public Import_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Comma_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Comma() { return getToken(AtemParser.Comma, 0); }
		public Comma_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Literal_expression_Context extends ExpressionContext {
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Literal_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Self_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public TerminalNode KeywordSelf() { return getToken(AtemParser.KeywordSelf, 0); }
		public Self_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Function_call_expresison_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_call_operatorContext function_call_operator() {
			return getRuleContext(Function_call_operatorContext.class,0);
		}
		public Function_call_expresison_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Comptime_expression_Context extends ExpressionContext {
		public TerminalNode KeywordComptime() { return getToken(AtemParser.KeywordComptime, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comptime_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Unary_optional_unwrapping_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_optional_unwrapping_operatorContext unary_optional_unwrapping_operator() {
			return getRuleContext(Unary_optional_unwrapping_operatorContext.class,0);
		}
		public Unary_optional_unwrapping_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Unreachable_expression_Context extends ExpressionContext {
		public TerminalNode KeywordUnreachable() { return getToken(AtemParser.KeywordUnreachable, 0); }
		public Unreachable_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Derefence_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PointerDeref() { return getToken(AtemParser.PointerDeref, 0); }
		public Derefence_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class With_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public With_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Type_expression_Context extends ExpressionContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Type_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class If_expression_Context extends ExpressionContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public If_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Match_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KeywordMatch() { return getToken(AtemParser.KeywordMatch, 0); }
		public List<Match_caseContext> match_case() {
			return getRuleContexts(Match_caseContext.class);
		}
		public Match_caseContext match_case(int i) {
			return getRuleContext(Match_caseContext.class,i);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public Expression_or_blockContext expression_or_block() {
			return getRuleContext(Expression_or_blockContext.class,0);
		}
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public Match_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Object_address_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ObjectAddress() { return getToken(AtemParser.ObjectAddress, 0); }
		public Object_address_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Bit_expression_Context extends ExpressionContext {
		public Unary_bit_operatorContext unary_bit_operator() {
			return getRuleContext(Unary_bit_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_bit_operatorContext binary_bit_operator() {
			return getRuleContext(Binary_bit_operatorContext.class,0);
		}
		public Bit_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Negation_expression_Context extends ExpressionContext {
		public Negation_operatorContext negation_operator() {
			return getRuleContext(Negation_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Negation_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Placeholder_expression_Context extends ExpressionContext {
		public TerminalNode RemainderDivide() { return getToken(AtemParser.RemainderDivide, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Placeholder_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Assignment_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Field_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Field_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Repeat_while_expression_Context extends ExpressionContext {
		public Repeat_while_expressionContext repeat_while_expression() {
			return getRuleContext(Repeat_while_expressionContext.class,0);
		}
		public Repeat_while_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Comparison_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Comparison_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Break_expression_Context extends ExpressionContext {
		public TerminalNode KeywordBreak() { return getToken(AtemParser.KeywordBreak, 0); }
		public Code_block_nameContext code_block_name() {
			return getRuleContext(Code_block_nameContext.class,0);
		}
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Break_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Path_expression_Context extends ExpressionContext {
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Path_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Reflection_expression_Context extends ExpressionContext {
		public Reflect_operatorContext reflect_operator() {
			return getRuleContext(Reflect_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Reflection_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Try_expression_Context extends ExpressionContext {
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Try_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Boolean_expression_Context extends ExpressionContext {
		public Unary_boolean_operatorContext unary_boolean_operator() {
			return getRuleContext(Unary_boolean_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_boolean_operatorContext binary_boolean_operator() {
			return getRuleContext(Binary_boolean_operatorContext.class,0);
		}
		public Boolean_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Arithmetic_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Arithmetic_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Range_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Range_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Fallthrough_expression_Context extends ExpressionContext {
		public TerminalNode KeywordFallthrough() { return getToken(AtemParser.KeywordFallthrough, 0); }
		public Fallthrough_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Member_function_call_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_call_operatorContext function_call_operator() {
			return getRuleContext(Function_call_operatorContext.class,0);
		}
		public Member_function_call_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Init_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public TerminalNode KeywordInit() { return getToken(AtemParser.KeywordInit, 0); }
		public Init_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Deinit_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public TerminalNode KeywordDeinit() { return getToken(AtemParser.KeywordDeinit, 0); }
		public Deinit_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Await_expression_Context extends ExpressionContext {
		public Await_operatorContext await_operator() {
			return getRuleContext(Await_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Await_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Pipeline_expression_Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Pipeline_operatorContext pipeline_operator() {
			return getRuleContext(Pipeline_operatorContext.class,0);
		}
		public Pipeline_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class While_expression_Context extends ExpressionContext {
		public While_expressionContext while_expression() {
			return getRuleContext(While_expressionContext.class,0);
		}
		public While_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Parentheses_expression_Context extends ExpressionContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Parentheses_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Async_expression_Context extends ExpressionContext {
		public Async_operatorContext async_operator() {
			return getRuleContext(Async_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Async_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Type_cast_expression_Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Type_cast_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Anonymous_field_expression_Context extends ExpressionContext {
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Anonymous_field_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Return_expression_Context extends ExpressionContext {
		public TerminalNode KeywordReturn() { return getToken(AtemParser.KeywordReturn, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Assert_expression_Context extends ExpressionContext {
		public TerminalNode KeywordAssert() { return getToken(AtemParser.KeywordAssert, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public Assert_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Closure_expression_Context extends ExpressionContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Closure_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Use_in_expression_Context extends ExpressionContext {
		public TerminalNode KeywordUse() { return getToken(AtemParser.KeywordUse, 0); }
		public Declaration_statement_or_listContext declaration_statement_or_list() {
			return getRuleContext(Declaration_statement_or_listContext.class,0);
		}
		public TerminalNode KeywordIn() { return getToken(AtemParser.KeywordIn, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Use_in_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Code_block_expression_Context extends ExpressionContext {
		public Code_block_expressionContext code_block_expression() {
			return getRuleContext(Code_block_expressionContext.class,0);
		}
		public Code_block_expression_Context(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				_localctx = new Parentheses_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1675);
				match(LeftParenthese);
				setState(1676);
				expression(0);
				setState(1677);
				match(RightParenthese);
				}
				break;
			case 2:
				{
				_localctx = new Literal_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1679);
				literal_expression();
				}
				break;
			case 3:
				{
				_localctx = new Anonymous_field_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1680);
				match(Dot);
				setState(1681);
				match(Identifier);
				}
				break;
			case 4:
				{
				_localctx = new Negation_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1682);
				negation_operator();
				setState(1683);
				expression(43);
				}
				break;
			case 5:
				{
				_localctx = new Path_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1685);
				path_expression();
				}
				break;
			case 6:
				{
				_localctx = new Try_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1686);
				try_operator();
				setState(1687);
				expression(39);
				}
				break;
			case 7:
				{
				_localctx = new Async_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1689);
				async_operator();
				setState(1690);
				expression(37);
				}
				break;
			case 8:
				{
				_localctx = new Await_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1692);
				await_operator();
				setState(1693);
				expression(36);
				}
				break;
			case 9:
				{
				_localctx = new Bit_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1695);
				unary_bit_operator();
				setState(1696);
				expression(33);
				}
				break;
			case 10:
				{
				_localctx = new Boolean_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1698);
				unary_boolean_operator();
				setState(1699);
				expression(31);
				}
				break;
			case 11:
				{
				_localctx = new Import_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1701);
				import_expression();
				}
				break;
			case 12:
				{
				_localctx = new Closure_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1702);
				closure_expression();
				}
				break;
			case 13:
				{
				_localctx = new Code_block_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1703);
				code_block_expression();
				}
				break;
			case 14:
				{
				_localctx = new Type_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1704);
				type_expression(0);
				}
				break;
			case 15:
				{
				_localctx = new Unreachable_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1705);
				match(KeywordUnreachable);
				}
				break;
			case 16:
				{
				_localctx = new Fallthrough_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1706);
				match(KeywordFallthrough);
				}
				break;
			case 17:
				{
				_localctx = new Throw_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1707);
				match(KeywordThrow);
				setState(1708);
				expression(20);
				}
				break;
			case 18:
				{
				_localctx = new Return_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1709);
				match(KeywordReturn);
				setState(1711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1710);
					expression(0);
					}
					break;
				}
				}
				break;
			case 19:
				{
				_localctx = new Break_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1713);
				match(KeywordBreak);
				setState(1715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1714);
					code_block_name();
					}
					break;
				}
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1717);
					match(KeywordWith);
					setState(1718);
					expression(0);
					}
					break;
				}
				}
				break;
			case 20:
				{
				_localctx = new Continue_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1721);
				match(KeywordContinue);
				setState(1723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1722);
					code_block_name();
					}
					break;
				}
				}
				break;
			case 21:
				{
				_localctx = new Assert_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1725);
				match(KeywordAssert);
				setState(1726);
				expression(0);
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1727);
					match(KeywordWith);
					setState(1728);
					expression(0);
					}
					break;
				}
				}
				break;
			case 22:
				{
				_localctx = new Comptime_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1731);
				match(KeywordComptime);
				setState(1732);
				expression(15);
				}
				break;
			case 23:
				{
				_localctx = new Reflection_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1733);
				reflect_operator();
				setState(1734);
				expression(14);
				}
				break;
			case 24:
				{
				_localctx = new Placeholder_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1736);
				match(RemainderDivide);
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1737);
					expression(0);
					}
					break;
				}
				}
				break;
			case 25:
				{
				_localctx = new Use_in_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1740);
				match(KeywordUse);
				setState(1741);
				declaration_statement_or_list();
				setState(1742);
				match(KeywordIn);
				setState(1743);
				expression(8);
				}
				break;
			case 26:
				{
				_localctx = new Using_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1745);
				match(KeywordUsing);
				setState(1746);
				expression(7);
				}
				break;
			case 27:
				{
				_localctx = new Declaretion_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1747);
				declaration_expression();
				}
				break;
			case 28:
				{
				_localctx = new If_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1748);
				if_expression();
				}
				break;
			case 29:
				{
				_localctx = new While_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1749);
				while_expression();
				}
				break;
			case 30:
				{
				_localctx = new Repeat_while_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1750);
				repeat_while_expression();
				}
				break;
			case 31:
				{
				_localctx = new For_expression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1751);
				for_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
					case 1:
						{
						_localctx = new Comma_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1754);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(1755);
						match(Comma);
						setState(1756);
						expression(52);
						}
						break;
					case 2:
						{
						_localctx = new Binary_optional_unwrapping_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1757);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(1758);
						binary_optional_unwrapping_operator();
						setState(1759);
						expression(47);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1761);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1762);
						arithmetic_operator();
						setState(1763);
						expression(45);
						}
						break;
					case 4:
						{
						_localctx = new Assignment_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1765);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(1766);
						assignment_operator();
						setState(1767);
						expression(42);
						}
						break;
					case 5:
						{
						_localctx = new Comparison_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1769);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1770);
						comparison_operator();
						setState(1771);
						expression(41);
						}
						break;
					case 6:
						{
						_localctx = new Range_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1773);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1774);
						range_operator();
						setState(1775);
						expression(36);
						}
						break;
					case 7:
						{
						_localctx = new Bit_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1777);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1778);
						binary_bit_operator();
						setState(1779);
						expression(35);
						}
						break;
					case 8:
						{
						_localctx = new Boolean_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1781);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1782);
						binary_boolean_operator();
						setState(1783);
						expression(33);
						}
						break;
					case 9:
						{
						_localctx = new Pipeline_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1785);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1786);
						pipeline_operator();
						setState(1787);
						expression(11);
						}
						break;
					case 10:
						{
						_localctx = new Field_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1789);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(1790);
						match(Dot);
						setState(1791);
						match(Identifier);
						}
						break;
					case 11:
						{
						_localctx = new Member_function_call_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1792);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(1793);
						function_call_operator();
						}
						break;
					case 12:
						{
						_localctx = new Unary_optional_unwrapping_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1794);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(1795);
						unary_optional_unwrapping_operator();
						}
						break;
					case 13:
						{
						_localctx = new Function_call_expresison_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1796);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(1797);
						function_call_operator();
						}
						break;
					case 14:
						{
						_localctx = new Catch_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1798);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1799);
						match(KeywordCatch);
						setState(1811);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1800);
							pattern(0);
							setState(1805);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(1801);
								match(Comma);
								setState(1802);
								pattern(0);
								}
								}
								setState(1807);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1809);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==KeywordRequire) {
								{
								setState(1808);
								require_clause();
								}
							}

							}
							break;
						}
						setState(1816);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KeywordThen:
							{
							{
							setState(1813);
							match(KeywordThen);
							setState(1814);
							expression(0);
							}
							}
							break;
						case Identifier:
						case LeftCurly:
							{
							{
							setState(1815);
							code_block();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 15:
						{
						_localctx = new Type_cast_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1818);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1819);
						type_casting_operator();
						setState(1820);
						type_expression(0);
						}
						break;
					case 16:
						{
						_localctx = new Init_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1822);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1823);
						match(Dot);
						setState(1824);
						match(KeywordInit);
						}
						break;
					case 17:
						{
						_localctx = new Deinit_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1825);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1826);
						match(Dot);
						setState(1827);
						match(KeywordDeinit);
						}
						break;
					case 18:
						{
						_localctx = new Self_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1828);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1829);
						match(Dot);
						setState(1830);
						match(KeywordSelf);
						}
						break;
					case 19:
						{
						_localctx = new Derefence_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1831);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1832);
						match(PointerDeref);
						}
						break;
					case 20:
						{
						_localctx = new Object_address_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1833);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1834);
						match(ObjectAddress);
						}
						break;
					case 21:
						{
						_localctx = new With_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1835);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1836);
						match(KeywordWith);
						setState(1837);
						match(LeftCurly);
						setState(1839); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1838);
							expression(0);
							}
							}
							setState(1841); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0) );
						setState(1843);
						match(RightCurly);
						}
						break;
					case 22:
						{
						_localctx = new Match_expression_Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1846);
						match(KeywordMatch);
						setState(1856);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
						case 1:
							{
							setState(1847);
							match_case();
							}
							break;
						case 2:
							{
							{
							setState(1848);
							match(LeftCurly);
							setState(1850); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(1849);
								match_case();
								}
								}
								setState(1852); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordIs - 64)) | (1L << (KeywordLet - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (At - 129)) | (1L << (Question - 129)) | (1L << (Underscore - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0) );
							setState(1854);
							match(RightCurly);
							}
							}
							break;
						}
						setState(1860);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
						case 1:
							{
							setState(1858);
							match(KeywordElse);
							setState(1859);
							expression_or_block();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Code_block_expressionContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Code_block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block_expression; }
	}

	public final Code_block_expressionContext code_block_expression() throws RecognitionException {
		Code_block_expressionContext _localctx = new Code_block_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_code_block_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Require_clauseContext extends ParserRuleContext {
		public TerminalNode KeywordRequire() { return getToken(AtemParser.KeywordRequire, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Require_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_clause; }
	}

	public final Require_clauseContext require_clause() throws RecognitionException {
		Require_clauseContext _localctx = new Require_clauseContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_require_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(KeywordRequire);
			setState(1870);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_expression_or_blockContext extends ParserRuleContext {
		public TerminalNode KeywordThen() { return getToken(AtemParser.KeywordThen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Then_expression_or_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_expression_or_block; }
	}

	public final Then_expression_or_blockContext then_expression_or_block() throws RecognitionException {
		Then_expression_or_blockContext _localctx = new Then_expression_or_blockContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_then_expression_or_block);
		try {
			setState(1875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordThen:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1872);
				match(KeywordThen);
				setState(1873);
				expression(0);
				}
				}
				break;
			case Identifier:
			case LeftCurly:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1874);
				code_block();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_or_blockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Expression_or_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_or_block; }
	}

	public final Expression_or_blockContext expression_or_block() throws RecognitionException {
		Expression_or_blockContext _localctx = new Expression_or_blockContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_expression_or_block);
		try {
			setState(1879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode KeywordIf() { return getToken(AtemParser.KeywordIf, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_expression_or_blockContext then_expression_or_block() {
			return getRuleContext(Then_expression_or_blockContext.class,0);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public Expression_or_blockContext expression_or_block() {
			return getRuleContext(Expression_or_blockContext.class,0);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			match(KeywordIf);
			setState(1882);
			expression(0);
			setState(1883);
			then_expression_or_block();
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1884);
				match(KeywordElse);
				setState(1885);
				expression_or_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_expressionContext extends ParserRuleContext {
		public TerminalNode KeywordWhile() { return getToken(AtemParser.KeywordWhile, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_expression_or_blockContext then_expression_or_block() {
			return getRuleContext(Then_expression_or_blockContext.class,0);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public Expression_or_blockContext expression_or_block() {
			return getRuleContext(Expression_or_blockContext.class,0);
		}
		public While_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expression; }
	}

	public final While_expressionContext while_expression() throws RecognitionException {
		While_expressionContext _localctx = new While_expressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(KeywordWhile);
			setState(1889);
			expression(0);
			setState(1890);
			then_expression_or_block();
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1891);
				match(KeywordElse);
				setState(1892);
				expression_or_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_while_expressionContext extends ParserRuleContext {
		public TerminalNode KeywordRepeat() { return getToken(AtemParser.KeywordRepeat, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_expression_or_blockContext then_expression_or_block() {
			return getRuleContext(Then_expression_or_blockContext.class,0);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public Expression_or_blockContext expression_or_block() {
			return getRuleContext(Expression_or_blockContext.class,0);
		}
		public Repeat_while_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_expression; }
	}

	public final Repeat_while_expressionContext repeat_while_expression() throws RecognitionException {
		Repeat_while_expressionContext _localctx = new Repeat_while_expressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_repeat_while_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(KeywordRepeat);
			setState(1896);
			expression(0);
			setState(1897);
			then_expression_or_block();
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1898);
				match(KeywordElse);
				setState(1899);
				expression_or_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_expressionContext extends ParserRuleContext {
		public TerminalNode KeywordFor() { return getToken(AtemParser.KeywordFor, 0); }
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode KeywordIn() { return getToken(AtemParser.KeywordIn, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_expression_or_blockContext then_expression_or_block() {
			return getRuleContext(Then_expression_or_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Require_clauseContext require_clause() {
			return getRuleContext(Require_clauseContext.class,0);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public Expression_or_blockContext expression_or_block() {
			return getRuleContext(Expression_or_blockContext.class,0);
		}
		public For_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expression; }
	}

	public final For_expressionContext for_expression() throws RecognitionException {
		For_expressionContext _localctx = new For_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_for_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			match(KeywordFor);
			setState(1903);
			match(Identifier);
			setState(1904);
			match(KeywordIn);
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1905);
				attributes();
				}
			}

			setState(1908);
			expression(0);
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(1909);
				require_clause();
				}
			}

			setState(1912);
			then_expression_or_block();
			setState(1915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1913);
				match(KeywordElse);
				setState(1914);
				expression_or_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_caseContext extends ParserRuleContext {
		public Match_case_labelContext match_case_label() {
			return getRuleContext(Match_case_labelContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Match_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case; }
	}

	public final Match_caseContext match_case() throws RecognitionException {
		Match_caseContext _localctx = new Match_caseContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_match_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			match_case_label();
			setState(1918);
			match(Colon);
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1919);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1920);
				code_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_case_labelContext extends ParserRuleContext {
		public Match_item_listContext match_item_list() {
			return getRuleContext(Match_item_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Match_case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case_label; }
	}

	public final Match_case_labelContext match_case_label() throws RecognitionException {
		Match_case_labelContext _localctx = new Match_case_labelContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_match_case_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(1923);
				attributes();
				}
			}

			setState(1926);
			match_item_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_item_listContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<Require_clauseContext> require_clause() {
			return getRuleContexts(Require_clauseContext.class);
		}
		public Require_clauseContext require_clause(int i) {
			return getRuleContext(Require_clauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Match_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_item_list; }
	}

	public final Match_item_listContext match_item_list() throws RecognitionException {
		Match_item_listContext _localctx = new Match_item_listContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_match_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			pattern(0);
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordRequire) {
				{
				setState(1929);
				require_clause();
				}
			}

			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1932);
				match(Comma);
				setState(1933);
				pattern(0);
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KeywordRequire) {
					{
					setState(1934);
					require_clause();
					}
				}

				}
				}
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_expressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Optional_typeContext optional_type() {
			return getRuleContext(Optional_typeContext.class,0);
		}
		public Collection_typeContext collection_type() {
			return getRuleContext(Collection_typeContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Some_typeContext some_type() {
			return getRuleContext(Some_typeContext.class,0);
		}
		public TerminalNode KeywordIf() { return getToken(AtemParser.KeywordIf, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KeywordElse() { return getToken(AtemParser.KeywordElse, 0); }
		public List<TerminalNode> KeywordThen() { return getTokens(AtemParser.KeywordThen); }
		public TerminalNode KeywordThen(int i) {
			return getToken(AtemParser.KeywordThen, i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public TerminalNode KeywordWhile() { return getToken(AtemParser.KeywordWhile, 0); }
		public TerminalNode KeywordRepeat() { return getToken(AtemParser.KeywordRepeat, 0); }
		public TerminalNode KeywordFor() { return getToken(AtemParser.KeywordFor, 0); }
		public List<TerminalNode> KeywordIn() { return getTokens(AtemParser.KeywordIn); }
		public TerminalNode KeywordIn(int i) {
			return getToken(AtemParser.KeywordIn, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_block_expressionContext code_block_expression() {
			return getRuleContext(Code_block_expressionContext.class,0);
		}
		public TerminalNode KeywordUnreachable() { return getToken(AtemParser.KeywordUnreachable, 0); }
		public TerminalNode KeywordThrow() { return getToken(AtemParser.KeywordThrow, 0); }
		public TerminalNode KeywordReturn() { return getToken(AtemParser.KeywordReturn, 0); }
		public TerminalNode KeywordBreak() { return getToken(AtemParser.KeywordBreak, 0); }
		public Code_block_nameContext code_block_name() {
			return getRuleContext(Code_block_nameContext.class,0);
		}
		public TerminalNode KeywordWith() { return getToken(AtemParser.KeywordWith, 0); }
		public TerminalNode KeywordContinue() { return getToken(AtemParser.KeywordContinue, 0); }
		public TerminalNode KeywordComptime() { return getToken(AtemParser.KeywordComptime, 0); }
		public TerminalNode PointerType() { return getToken(AtemParser.PointerType, 0); }
		public Type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expression; }
	}

	public final Type_expressionContext type_expression() throws RecognitionException {
		return type_expression(0);
	}

	private Type_expressionContext type_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_expressionContext _localctx = new Type_expressionContext(_ctx, _parentState);
		Type_expressionContext _prevctx = _localctx;
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_type_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1943);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1944);
				match(RightParenthese);
				setState(1945);
				type_expression(0);
				setState(1946);
				match(LeftParenthese);
				}
				break;
			case 3:
				{
				setState(1948);
				path_expression();
				}
				break;
			case 4:
				{
				setState(1949);
				basic_type();
				}
				break;
			case 5:
				{
				setState(1950);
				tuple_type();
				}
				break;
			case 6:
				{
				setState(1951);
				optional_type();
				}
				break;
			case 7:
				{
				setState(1952);
				collection_type();
				}
				break;
			case 8:
				{
				setState(1953);
				any_type();
				}
				break;
			case 9:
				{
				setState(1954);
				some_type();
				}
				break;
			case 10:
				{
				setState(1955);
				match(KeywordIf);
				setState(1956);
				expression(0);
				setState(1960);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KeywordThen:
					{
					{
					setState(1957);
					match(KeywordThen);
					setState(1958);
					type_expression(0);
					}
					}
					break;
				case Identifier:
				case LeftCurly:
					{
					{
					setState(1959);
					code_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1962);
					match(KeywordElse);
					setState(1966);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KeywordThen:
						{
						setState(1963);
						match(KeywordThen);
						setState(1964);
						type_expression(0);
						}
						break;
					case Identifier:
					case LeftCurly:
						{
						setState(1965);
						code_block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(1970);
				match(KeywordWhile);
				setState(1971);
				expression(0);
				setState(1972);
				match(KeywordThen);
				setState(1973);
				type_expression(0);
				setState(1979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1974);
					match(KeywordElse);
					setState(1977);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
					case 1:
						{
						setState(1975);
						type_expression(0);
						}
						break;
					case 2:
						{
						setState(1976);
						code_block();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(1981);
				match(KeywordRepeat);
				setState(1985);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KeywordThen:
					{
					{
					setState(1982);
					match(KeywordThen);
					setState(1983);
					type_expression(0);
					}
					}
					break;
				case Identifier:
				case LeftCurly:
					{
					{
					setState(1984);
					code_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1987);
				match(KeywordWhile);
				setState(1988);
				expression(0);
				setState(1994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1989);
					match(KeywordElse);
					setState(1992);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1990);
						type_expression(0);
						}
						break;
					case 2:
						{
						setState(1991);
						code_block();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 13:
				{
				setState(1996);
				match(KeywordFor);
				setState(1997);
				match(Identifier);
				setState(1998);
				match(KeywordIn);
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(1999);
					attributes();
					}
				}

				setState(2002);
				match(KeywordIn);
				setState(2003);
				expression(0);
				setState(2007);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KeywordThen:
					{
					{
					setState(2004);
					match(KeywordThen);
					setState(2005);
					type_expression(0);
					}
					}
					break;
				case Identifier:
				case LeftCurly:
					{
					{
					setState(2006);
					code_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(2009);
					match(KeywordElse);
					setState(2012);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(2010);
						type_expression(0);
						}
						break;
					case 2:
						{
						setState(2011);
						code_block();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(2016);
				code_block_expression();
				}
				break;
			case 15:
				{
				setState(2017);
				match(KeywordUnreachable);
				}
				break;
			case 16:
				{
				setState(2018);
				match(KeywordThrow);
				setState(2019);
				expression(0);
				}
				break;
			case 17:
				{
				setState(2020);
				match(KeywordReturn);
				setState(2022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(2021);
					type_expression(0);
					}
					break;
				}
				}
				break;
			case 18:
				{
				setState(2024);
				match(KeywordBreak);
				setState(2026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(2025);
					code_block_name();
					}
					break;
				}
				setState(2030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(2028);
					match(KeywordWith);
					setState(2029);
					type_expression(0);
					}
					break;
				}
				}
				break;
			case 19:
				{
				setState(2032);
				match(KeywordContinue);
				setState(2034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2033);
					code_block_name();
					}
					break;
				}
				}
				break;
			case 20:
				{
				setState(2036);
				match(KeywordComptime);
				setState(2037);
				type_expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
					setState(2040);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(2041);
					match(PointerType);
					}
					} 
				}
				setState(2046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Basic_typeContext extends ParserRuleContext {
		public Never_typeContext never_type() {
			return getRuleContext(Never_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Byte_typeContext byte_type() {
			return getRuleContext(Byte_typeContext.class,0);
		}
		public Unit_typeContext unit_type() {
			return getRuleContext(Unit_typeContext.class,0);
		}
		public Character_typeContext character_type() {
			return getRuleContext(Character_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Comptime_typeContext comptime_type() {
			return getRuleContext(Comptime_typeContext.class,0);
		}
		public Type_typeContext type_type() {
			return getRuleContext(Type_typeContext.class,0);
		}
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_basic_type);
		try {
			setState(2058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2047);
				never_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				integer_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2049);
				floating_point_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				boolean_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2051);
				byte_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2052);
				unit_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2053);
				character_type();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2054);
				string_type();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2055);
				unit_type();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2056);
				comptime_type();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2057);
				type_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_typeContext extends ParserRuleContext {
		public Static_array_typeContext static_array_type() {
			return getRuleContext(Static_array_typeContext.class,0);
		}
		public Dynamic_array_typeContext dynamic_array_type() {
			return getRuleContext(Dynamic_array_typeContext.class,0);
		}
		public Map_typeContext map_type() {
			return getRuleContext(Map_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Collection_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_type; }
	}

	public final Collection_typeContext collection_type() throws RecognitionException {
		Collection_typeContext _localctx = new Collection_typeContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_collection_type);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2060);
				static_array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				dynamic_array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2062);
				map_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				set_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Never_typeContext extends ParserRuleContext {
		public TerminalNode KeywordNever() { return getToken(AtemParser.KeywordNever, 0); }
		public Never_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_never_type; }
	}

	public final Never_typeContext never_type() throws RecognitionException {
		Never_typeContext _localctx = new Never_typeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_never_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(KeywordNever);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public List<Tuple_type_elementContext> tuple_type_element() {
			return getRuleContexts(Tuple_type_elementContext.class);
		}
		public Tuple_type_elementContext tuple_type_element(int i) {
			return getRuleContext(Tuple_type_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_tuple_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			match(LeftParenthese);
			setState(2079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2072); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2069);
						tuple_type_element();
						setState(2070);
						match(Comma);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2074); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(2076);
					tuple_type_element();
					}
					break;
				}
				}
				break;
			}
			setState(2081);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_tuple_type_element);
		int _la;
		try {
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(2083);
					attributes();
					}
				}

				setState(2086);
				type_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087);
				match(Identifier);
				setState(2088);
				match(Colon);
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(2089);
					attributes();
					}
				}

				setState(2092);
				type_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_typeContext extends ParserRuleContext {
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Optional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_type; }
	}

	public final Optional_typeContext optional_type() throws RecognitionException {
		Optional_typeContext _localctx = new Optional_typeContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			match(Question);
			setState(2096);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode KeywordAny() { return getToken(AtemParser.KeywordAny, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_any_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			match(KeywordAny);
			setState(2099);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Some_typeContext extends ParserRuleContext {
		public TerminalNode KeywordSome() { return getToken(AtemParser.KeywordSome, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Some_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_type; }
	}

	public final Some_typeContext some_type() throws RecognitionException {
		Some_typeContext _localctx = new Some_typeContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_some_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			match(KeywordSome);
			setState(2102);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_array_typeContext extends ParserRuleContext {
		public TerminalNode LeftSquare() { return getToken(AtemParser.LeftSquare, 0); }
		public TerminalNode RightSquare() { return getToken(AtemParser.RightSquare, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(AtemParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(AtemParser.Underscore, i);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Static_array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_array_type; }
	}

	public final Static_array_typeContext static_array_type() throws RecognitionException {
		Static_array_typeContext _localctx = new Static_array_typeContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_static_array_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			match(LeftSquare);
			setState(2107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAlias:
			case KeywordAny:
			case KeywordAssert:
			case KeywordAsync:
			case KeywordAwait:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordClass:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordDefault:
			case KeywordEnum:
			case KeywordFallthrough:
			case KeywordFalse:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordFunc:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordImport:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNamespace:
			case KeywordNever:
			case KeywordNot:
			case KeywordNull:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordProject:
			case KeywordProtocol:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordStruct:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordTrue:
			case KeywordTry:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUndefined:
			case KeywordUnion:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordUse:
			case KeywordUsing:
			case KeywordVal:
			case KeywordVar:
			case KeywordWhile:
			case Identifier:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalDigits:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Dot:
			case Question:
			case Sub:
			case OverflowingSub:
			case RemainderDivide:
			case BitNot:
			case BitXor:
			case Reflect:
			case Reify:
			case MultiLineExtendedStringOpen:
			case SingleLineExtendedStringOpen:
			case MultiLineStringOpen:
			case SingleLineStringOpen:
				{
				setState(2105);
				expression(0);
				}
				break;
			case Underscore:
				{
				setState(2106);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Comma:
						{
						setState(2109);
						match(Comma);
						setState(2110);
						expression(0);
						}
						break;
					case Underscore:
						{
						setState(2111);
						match(Underscore);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(2116);
				match(Comma);
				}
			}

			setState(2119);
			match(RightSquare);
			setState(2122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAny:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNever:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordWhile:
			case Identifier:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Question:
				{
				setState(2120);
				type_expression(0);
				}
				break;
			case Underscore:
				{
				setState(2121);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dynamic_array_typeContext extends ParserRuleContext {
		public TerminalNode LeftSquare() { return getToken(AtemParser.LeftSquare, 0); }
		public TerminalNode RightSquare() { return getToken(AtemParser.RightSquare, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode Underscore() { return getToken(AtemParser.Underscore, 0); }
		public Dynamic_array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_array_type; }
	}

	public final Dynamic_array_typeContext dynamic_array_type() throws RecognitionException {
		Dynamic_array_typeContext _localctx = new Dynamic_array_typeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_dynamic_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			match(LeftSquare);
			setState(2125);
			match(RightSquare);
			setState(2128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAny:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNever:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordWhile:
			case Identifier:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Question:
				{
				setState(2126);
				type_expression(0);
				}
				break;
			case Underscore:
				{
				setState(2127);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_typeContext extends ParserRuleContext {
		public TerminalNode LeftSquare() { return getToken(AtemParser.LeftSquare, 0); }
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public TerminalNode RightSquare() { return getToken(AtemParser.RightSquare, 0); }
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(AtemParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(AtemParser.Underscore, i);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_map_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2130);
			match(LeftSquare);
			setState(2133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAny:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNever:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordWhile:
			case Identifier:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Question:
				{
				setState(2131);
				type_expression(0);
				}
				break;
			case Underscore:
				{
				setState(2132);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2135);
			match(Colon);
			setState(2138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAny:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNever:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordWhile:
			case Identifier:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Question:
				{
				setState(2136);
				type_expression(0);
				}
				break;
			case Underscore:
				{
				setState(2137);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2140);
			match(RightSquare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_typeContext extends ParserRuleContext {
		public TerminalNode LeftSquare() { return getToken(AtemParser.LeftSquare, 0); }
		public TerminalNode RightSquare() { return getToken(AtemParser.RightSquare, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode Underscore() { return getToken(AtemParser.Underscore, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			match(LeftSquare);
			setState(2145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordAny:
			case KeywordBool:
			case KeywordBreak:
			case KeywordByte:
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
			case KeywordComptime:
			case KeywordContinue:
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
			case KeywordFor:
			case KeywordGlobal:
			case KeywordIf:
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordModule:
			case KeywordNever:
			case KeywordOuter:
			case KeywordPackage:
			case KeywordRepeat:
			case KeywordReturn:
			case KeywordSelf:
			case KeywordSome:
			case KeywordString:
			case KeywordSuper:
			case KeywordThis:
			case KeywordThrow:
			case KeywordType:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
			case KeywordUnit:
			case KeywordUnreachable:
			case KeywordWhile:
			case Identifier:
			case LeftCurly:
			case LeftParenthese:
			case RightParenthese:
			case LeftSquare:
			case Question:
				{
				setState(2143);
				type_expression(0);
				}
				break;
			case Underscore:
				{
				setState(2144);
				match(Underscore);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2147);
			match(RightSquare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public Byte_typeContext byte_type() {
			return getRuleContext(Byte_typeContext.class,0);
		}
		public Unit_typeContext unit_type() {
			return getRuleContext(Unit_typeContext.class,0);
		}
		public Character_typeContext character_type() {
			return getRuleContext(Character_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Comptime_typeContext comptime_type() {
			return getRuleContext(Comptime_typeContext.class,0);
		}
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_simple_type);
		try {
			setState(2157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KeywordInt8:
			case KeywordInt16:
			case KeywordInt32:
			case KeywordInt64:
			case KeywordInt128:
			case KeywordUInt8:
			case KeywordUInt16:
			case KeywordUInt32:
			case KeywordUInt64:
			case KeywordUInt128:
				enterOuterAlt(_localctx, 1);
				{
				setState(2149);
				integer_type();
				}
				break;
			case KeywordFloat16:
			case KeywordFloat32:
			case KeywordFloat64:
			case KeywordFloat80:
			case KeywordFloat128:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
				floating_point_type();
				}
				break;
			case KeywordBool:
				enterOuterAlt(_localctx, 3);
				{
				setState(2151);
				boolean_type();
				}
				break;
			case KeywordByte:
				enterOuterAlt(_localctx, 4);
				{
				setState(2152);
				byte_type();
				}
				break;
			case KeywordUnit:
				enterOuterAlt(_localctx, 5);
				{
				setState(2153);
				unit_type();
				}
				break;
			case KeywordChar8:
			case KeywordChar16:
			case KeywordChar32:
				enterOuterAlt(_localctx, 6);
				{
				setState(2154);
				character_type();
				}
				break;
			case KeywordString:
				enterOuterAlt(_localctx, 7);
				{
				setState(2155);
				string_type();
				}
				break;
			case KeywordCompileTimeInt:
			case KeywordCompileTimeFloat:
			case KeywordCompileTimeString:
			case KeywordCompileTimeChar:
				enterOuterAlt(_localctx, 8);
				{
				setState(2156);
				comptime_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public TerminalNode KeywordInt8() { return getToken(AtemParser.KeywordInt8, 0); }
		public TerminalNode KeywordInt16() { return getToken(AtemParser.KeywordInt16, 0); }
		public TerminalNode KeywordInt32() { return getToken(AtemParser.KeywordInt32, 0); }
		public TerminalNode KeywordInt64() { return getToken(AtemParser.KeywordInt64, 0); }
		public TerminalNode KeywordInt128() { return getToken(AtemParser.KeywordInt128, 0); }
		public TerminalNode KeywordUInt8() { return getToken(AtemParser.KeywordUInt8, 0); }
		public TerminalNode KeywordUInt16() { return getToken(AtemParser.KeywordUInt16, 0); }
		public TerminalNode KeywordUInt32() { return getToken(AtemParser.KeywordUInt32, 0); }
		public TerminalNode KeywordUInt64() { return getToken(AtemParser.KeywordUInt64, 0); }
		public TerminalNode KeywordUInt128() { return getToken(AtemParser.KeywordUInt128, 0); }
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_integer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (KeywordInt8 - 62)) | (1L << (KeywordInt16 - 62)) | (1L << (KeywordInt32 - 62)) | (1L << (KeywordInt64 - 62)) | (1L << (KeywordInt128 - 62)) | (1L << (KeywordUInt8 - 62)) | (1L << (KeywordUInt16 - 62)) | (1L << (KeywordUInt32 - 62)) | (1L << (KeywordUInt64 - 62)) | (1L << (KeywordUInt128 - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode KeywordFloat16() { return getToken(AtemParser.KeywordFloat16, 0); }
		public TerminalNode KeywordFloat32() { return getToken(AtemParser.KeywordFloat32, 0); }
		public TerminalNode KeywordFloat64() { return getToken(AtemParser.KeywordFloat64, 0); }
		public TerminalNode KeywordFloat80() { return getToken(AtemParser.KeywordFloat80, 0); }
		public TerminalNode KeywordFloat128() { return getToken(AtemParser.KeywordFloat128, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_typeContext extends ParserRuleContext {
		public TerminalNode KeywordBool() { return getToken(AtemParser.KeywordBool, 0); }
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_boolean_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			match(KeywordBool);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Byte_typeContext extends ParserRuleContext {
		public TerminalNode KeywordByte() { return getToken(AtemParser.KeywordByte, 0); }
		public Byte_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byte_type; }
	}

	public final Byte_typeContext byte_type() throws RecognitionException {
		Byte_typeContext _localctx = new Byte_typeContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_byte_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			match(KeywordByte);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unit_typeContext extends ParserRuleContext {
		public TerminalNode KeywordUnit() { return getToken(AtemParser.KeywordUnit, 0); }
		public Unit_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_type; }
	}

	public final Unit_typeContext unit_type() throws RecognitionException {
		Unit_typeContext _localctx = new Unit_typeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unit_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(KeywordUnit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_typeContext extends ParserRuleContext {
		public TerminalNode KeywordChar8() { return getToken(AtemParser.KeywordChar8, 0); }
		public TerminalNode KeywordChar16() { return getToken(AtemParser.KeywordChar16, 0); }
		public TerminalNode KeywordChar32() { return getToken(AtemParser.KeywordChar32, 0); }
		public Character_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_type; }
	}

	public final Character_typeContext character_type() throws RecognitionException {
		Character_typeContext _localctx = new Character_typeContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_character_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public TerminalNode KeywordString() { return getToken(AtemParser.KeywordString, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			match(KeywordString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comptime_typeContext extends ParserRuleContext {
		public TerminalNode KeywordCompileTimeChar() { return getToken(AtemParser.KeywordCompileTimeChar, 0); }
		public TerminalNode KeywordCompileTimeFloat() { return getToken(AtemParser.KeywordCompileTimeFloat, 0); }
		public TerminalNode KeywordCompileTimeInt() { return getToken(AtemParser.KeywordCompileTimeInt, 0); }
		public TerminalNode KeywordCompileTimeString() { return getToken(AtemParser.KeywordCompileTimeString, 0); }
		public Comptime_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comptime_type; }
	}

	public final Comptime_typeContext comptime_type() throws RecognitionException {
		Comptime_typeContext _localctx = new Comptime_typeContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_comptime_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_typeContext extends ParserRuleContext {
		public TerminalNode KeywordType() { return getToken(AtemParser.KeywordType, 0); }
		public Type_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_type; }
	}

	public final Type_typeContext type_type() throws RecognitionException {
		Type_typeContext _localctx = new Type_typeContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_type_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			match(KeywordType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_expressionContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Tuple_elementContext tuple_element() {
			return getRuleContext(Tuple_elementContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AtemParser.Comma, 0); }
		public Tuple_element_listContext tuple_element_list() {
			return getRuleContext(Tuple_element_listContext.class,0);
		}
		public Tuple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_expression; }
	}

	public final Tuple_expressionContext tuple_expression() throws RecognitionException {
		Tuple_expressionContext _localctx = new Tuple_expressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_tuple_expression);
		try {
			setState(2185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				match(LeftParenthese);
				setState(2178);
				match(RightParenthese);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				match(LeftParenthese);
				setState(2180);
				tuple_element();
				setState(2181);
				match(Comma);
				setState(2182);
				tuple_element_list();
				setState(2183);
				match(RightParenthese);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_element_listContext extends ParserRuleContext {
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Tuple_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element_list; }
	}

	public final Tuple_element_listContext tuple_element_list() throws RecognitionException {
		Tuple_element_listContext _localctx = new Tuple_element_listContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_tuple_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			tuple_element();
			setState(2192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2188);
				match(Comma);
				setState(2189);
				tuple_element();
				}
				}
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AtemParser.Assign, 0); }
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_tuple_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2195);
				match(Identifier);
				setState(2196);
				match(Assign);
				}
				break;
			}
			setState(2199);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_expressionContext extends ParserRuleContext {
		public List<Path_expression_elementContext> path_expression_element() {
			return getRuleContexts(Path_expression_elementContext.class);
		}
		public Path_expression_elementContext path_expression_element(int i) {
			return getRuleContext(Path_expression_elementContext.class,i);
		}
		public TerminalNode KeywordGlobal() { return getToken(AtemParser.KeywordGlobal, 0); }
		public List<TerminalNode> Dot() { return getTokens(AtemParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AtemParser.Dot, i);
		}
		public Path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expression; }
	}

	public final Path_expressionContext path_expression() throws RecognitionException {
		Path_expressionContext _localctx = new Path_expressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_path_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KeywordGlobal) {
				{
				setState(2201);
				match(KeywordGlobal);
				setState(2202);
				match(Dot);
				}
			}

			setState(2205);
			path_expression_element();
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2206);
					match(Dot);
					setState(2207);
					path_expression_element();
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_expression_elementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode KeywordSuper() { return getToken(AtemParser.KeywordSuper, 0); }
		public TerminalNode KeywordSelf() { return getToken(AtemParser.KeywordSelf, 0); }
		public TerminalNode KeywordThis() { return getToken(AtemParser.KeywordThis, 0); }
		public TerminalNode KeywordOuter() { return getToken(AtemParser.KeywordOuter, 0); }
		public TerminalNode KeywordModule() { return getToken(AtemParser.KeywordModule, 0); }
		public TerminalNode KeywordPackage() { return getToken(AtemParser.KeywordPackage, 0); }
		public Path_expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expression_element; }
	}

	public final Path_expression_elementContext path_expression_element() throws RecognitionException {
		Path_expression_elementContext _localctx = new Path_expression_elementContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_path_expression_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeywordModule - 73)) | (1L << (KeywordOuter - 73)) | (1L << (KeywordPackage - 73)) | (1L << (KeywordSelf - 73)) | (1L << (KeywordSuper - 73)) | (1L << (KeywordThis - 73)) | (1L << (Identifier - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_literal_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public Undefined_literalContext undefined_literal() {
			return getRuleContext(Undefined_literalContext.class,0);
		}
		public Default_literalContext default_literal() {
			return getRuleContext(Default_literalContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_literal);
		try {
			setState(2224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalDigits:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				numeric_literal();
				}
				break;
			case KeywordFalse:
			case KeywordTrue:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				boolean_literal();
				}
				break;
			case MultiLineExtendedStringOpen:
			case SingleLineExtendedStringOpen:
			case MultiLineStringOpen:
			case SingleLineStringOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				string_literal();
				}
				break;
			case KeywordNull:
				enterOuterAlt(_localctx, 4);
				{
				setState(2220);
				null_literal();
				}
				break;
			case KeywordUndefined:
				enterOuterAlt(_localctx, 5);
				{
				setState(2221);
				undefined_literal();
				}
				break;
			case KeywordDefault:
				enterOuterAlt(_localctx, 6);
				{
				setState(2222);
				default_literal();
				}
				break;
			case LeftCurly:
				enterOuterAlt(_localctx, 7);
				{
				setState(2223);
				array_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Floating_point_literalContext floating_point_literal() {
			return getRuleContext(Floating_point_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_numeric_literal);
		try {
			setState(2228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalDigits:
			case DecimalLiteral:
			case HexadecimalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				integer_literal();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2227);
				floating_point_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode DecimalDigits() { return getToken(AtemParser.DecimalDigits, 0); }
		public TerminalNode DecimalLiteral() { return getToken(AtemParser.DecimalLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(AtemParser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(AtemParser.OctalLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(AtemParser.HexadecimalLiteral, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalDigits - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_literalContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(AtemParser.FloatingPointLiteral, 0); }
		public Floating_point_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_literal; }
	}

	public final Floating_point_literalContext floating_point_literal() throws RecognitionException {
		Floating_point_literalContext _localctx = new Floating_point_literalContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_floating_point_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			match(FloatingPointLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode KeywordTrue() { return getToken(AtemParser.KeywordTrue, 0); }
		public TerminalNode KeywordFalse() { return getToken(AtemParser.KeywordFalse, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			_la = _input.LA(1);
			if ( !(_la==KeywordFalse || _la==KeywordTrue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_literalContext extends ParserRuleContext {
		public TerminalNode KeywordNull() { return getToken(AtemParser.KeywordNull, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			match(KeywordNull);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Undefined_literalContext extends ParserRuleContext {
		public TerminalNode KeywordUndefined() { return getToken(AtemParser.KeywordUndefined, 0); }
		public Undefined_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefined_literal; }
	}

	public final Undefined_literalContext undefined_literal() throws RecognitionException {
		Undefined_literalContext _localctx = new Undefined_literalContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_undefined_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(KeywordUndefined);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_literalContext extends ParserRuleContext {
		public TerminalNode KeywordDefault() { return getToken(AtemParser.KeywordDefault, 0); }
		public Default_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_literal; }
	}

	public final Default_literalContext default_literal() throws RecognitionException {
		Default_literalContext _localctx = new Default_literalContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_default_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(KeywordDefault);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(AtemParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(AtemParser.RightCurly, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_array_literal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			match(LeftCurly);
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAlias) | (1L << KeywordAny) | (1L << KeywordAssert) | (1L << KeywordAsync) | (1L << KeywordAwait) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordClass) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordDefault) | (1L << KeywordEnum) | (1L << KeywordFallthrough) | (1L << KeywordFalse) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordFunc) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordImport) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNamespace - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordNot - 64)) | (1L << (KeywordNull - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordProject - 64)) | (1L << (KeywordProtocol - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordStruct - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordTrue - 64)) | (1L << (KeywordTry - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUndefined - 64)) | (1L << (KeywordUnion - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordUse - 64)) | (1L << (KeywordUsing - 64)) | (1L << (KeywordVal - 64)) | (1L << (KeywordVar - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalDigits - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Dot - 129)) | (1L << (Question - 129)) | (1L << (Sub - 129)) | (1L << (OverflowingSub - 129)) | (1L << (RemainderDivide - 129)) | (1L << (BitNot - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (BitXor - 195)) | (1L << (Reflect - 195)) | (1L << (Reify - 195)) | (1L << (MultiLineExtendedStringOpen - 195)) | (1L << (SingleLineExtendedStringOpen - 195)) | (1L << (MultiLineStringOpen - 195)) | (1L << (SingleLineStringOpen - 195)))) != 0)) {
				{
				setState(2243);
				expression(0);
				setState(2248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2244);
						match(Comma);
						setState(2245);
						expression(0);
						}
						} 
					}
					setState(2250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				setState(2252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2251);
					match(Comma);
					}
				}

				}
			}

			setState(2256);
			match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public Extended_string_literalContext extended_string_literal() {
			return getRuleContext(Extended_string_literalContext.class,0);
		}
		public Interpolated_string_literalContext interpolated_string_literal() {
			return getRuleContext(Interpolated_string_literalContext.class,0);
		}
		public Static_string_literalContext static_string_literal() {
			return getRuleContext(Static_string_literalContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_string_literal);
		try {
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2258);
				extended_string_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2259);
				interpolated_string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2260);
				static_string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extended_string_literalContext extends ParserRuleContext {
		public TerminalNode MultiLineExtendedStringOpen() { return getToken(AtemParser.MultiLineExtendedStringOpen, 0); }
		public TerminalNode MultiLineExtendedStringClose() { return getToken(AtemParser.MultiLineExtendedStringClose, 0); }
		public List<TerminalNode> QuotedMultiLineExtendedText() { return getTokens(AtemParser.QuotedMultiLineExtendedText); }
		public TerminalNode QuotedMultiLineExtendedText(int i) {
			return getToken(AtemParser.QuotedMultiLineExtendedText, i);
		}
		public TerminalNode SingleLineExtendedStringOpen() { return getToken(AtemParser.SingleLineExtendedStringOpen, 0); }
		public TerminalNode SingleLineExtendedStringClose() { return getToken(AtemParser.SingleLineExtendedStringClose, 0); }
		public List<TerminalNode> QuotedSingleLineExtendedText() { return getTokens(AtemParser.QuotedSingleLineExtendedText); }
		public TerminalNode QuotedSingleLineExtendedText(int i) {
			return getToken(AtemParser.QuotedSingleLineExtendedText, i);
		}
		public Extended_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_string_literal; }
	}

	public final Extended_string_literalContext extended_string_literal() throws RecognitionException {
		Extended_string_literalContext _localctx = new Extended_string_literalContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_extended_string_literal);
		int _la;
		try {
			setState(2277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MultiLineExtendedStringOpen:
				enterOuterAlt(_localctx, 1);
				{
				setState(2263);
				match(MultiLineExtendedStringOpen);
				setState(2265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2264);
					match(QuotedMultiLineExtendedText);
					}
					}
					setState(2267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==QuotedMultiLineExtendedText );
				setState(2269);
				match(MultiLineExtendedStringClose);
				}
				break;
			case SingleLineExtendedStringOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2270);
				match(SingleLineExtendedStringOpen);
				setState(2272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2271);
					match(QuotedSingleLineExtendedText);
					}
					}
					setState(2274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==QuotedSingleLineExtendedText );
				setState(2276);
				match(SingleLineExtendedStringClose);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_string_literalContext extends ParserRuleContext {
		public TerminalNode SingleLineStringOpen() { return getToken(AtemParser.SingleLineStringOpen, 0); }
		public TerminalNode SingleLineStringClose() { return getToken(AtemParser.SingleLineStringClose, 0); }
		public List<TerminalNode> QuotedSingleLineText() { return getTokens(AtemParser.QuotedSingleLineText); }
		public TerminalNode QuotedSingleLineText(int i) {
			return getToken(AtemParser.QuotedSingleLineText, i);
		}
		public TerminalNode MultiLineStringOpen() { return getToken(AtemParser.MultiLineStringOpen, 0); }
		public TerminalNode MultiLineStringClose() { return getToken(AtemParser.MultiLineStringClose, 0); }
		public List<TerminalNode> QuotedMultiLineText() { return getTokens(AtemParser.QuotedMultiLineText); }
		public TerminalNode QuotedMultiLineText(int i) {
			return getToken(AtemParser.QuotedMultiLineText, i);
		}
		public Static_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_string_literal; }
	}

	public final Static_string_literalContext static_string_literal() throws RecognitionException {
		Static_string_literalContext _localctx = new Static_string_literalContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_static_string_literal);
		int _la;
		try {
			setState(2295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineStringOpen:
				enterOuterAlt(_localctx, 1);
				{
				setState(2279);
				match(SingleLineStringOpen);
				setState(2283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QuotedSingleLineText) {
					{
					{
					setState(2280);
					match(QuotedSingleLineText);
					}
					}
					setState(2285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2286);
				match(SingleLineStringClose);
				}
				break;
			case MultiLineStringOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2287);
				match(MultiLineStringOpen);
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QuotedMultiLineText) {
					{
					{
					setState(2288);
					match(QuotedMultiLineText);
					}
					}
					setState(2293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2294);
				match(MultiLineStringClose);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_string_literalContext extends ParserRuleContext {
		public TerminalNode SingleLineStringOpen() { return getToken(AtemParser.SingleLineStringOpen, 0); }
		public TerminalNode SingleLineStringClose() { return getToken(AtemParser.SingleLineStringClose, 0); }
		public List<TerminalNode> QuotedSingleLineText() { return getTokens(AtemParser.QuotedSingleLineText); }
		public TerminalNode QuotedSingleLineText(int i) {
			return getToken(AtemParser.QuotedSingleLineText, i);
		}
		public List<TerminalNode> InterpolataionSingleLine() { return getTokens(AtemParser.InterpolataionSingleLine); }
		public TerminalNode InterpolataionSingleLine(int i) {
			return getToken(AtemParser.InterpolataionSingleLine, i);
		}
		public List<TerminalNode> RightCurly() { return getTokens(AtemParser.RightCurly); }
		public TerminalNode RightCurly(int i) {
			return getToken(AtemParser.RightCurly, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public List<Tuple_element_listContext> tuple_element_list() {
			return getRuleContexts(Tuple_element_listContext.class);
		}
		public Tuple_element_listContext tuple_element_list(int i) {
			return getRuleContext(Tuple_element_listContext.class,i);
		}
		public TerminalNode MultiLineStringOpen() { return getToken(AtemParser.MultiLineStringOpen, 0); }
		public TerminalNode MultiLineStringClose() { return getToken(AtemParser.MultiLineStringClose, 0); }
		public List<TerminalNode> QuotedMultiLineText() { return getTokens(AtemParser.QuotedMultiLineText); }
		public TerminalNode QuotedMultiLineText(int i) {
			return getToken(AtemParser.QuotedMultiLineText, i);
		}
		public List<TerminalNode> InterpolataionMultiLine() { return getTokens(AtemParser.InterpolataionMultiLine); }
		public TerminalNode InterpolataionMultiLine(int i) {
			return getToken(AtemParser.InterpolataionMultiLine, i);
		}
		public Interpolated_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_literal; }
	}

	public final Interpolated_string_literalContext interpolated_string_literal() throws RecognitionException {
		Interpolated_string_literalContext _localctx = new Interpolated_string_literalContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_interpolated_string_literal);
		int _la;
		try {
			setState(2333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineStringOpen:
				enterOuterAlt(_localctx, 1);
				{
				setState(2297);
				match(SingleLineStringOpen);
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolataionSingleLine || _la==QuotedSingleLineText) {
					{
					setState(2309);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QuotedSingleLineText:
						{
						setState(2298);
						match(QuotedSingleLineText);
						}
						break;
					case InterpolataionSingleLine:
						{
						setState(2299);
						match(InterpolataionSingleLine);
						setState(2305);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
						case 1:
							{
							setState(2300);
							expression(0);
							}
							break;
						case 2:
							{
							setState(2301);
							tuple_element();
							setState(2302);
							match(Comma);
							setState(2303);
							tuple_element_list();
							}
							break;
						}
						setState(2307);
						match(RightCurly);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2314);
				match(SingleLineStringClose);
				}
				break;
			case MultiLineStringOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315);
				match(MultiLineStringOpen);
				setState(2329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolataionMultiLine || _la==QuotedMultiLineText) {
					{
					setState(2327);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case QuotedMultiLineText:
						{
						setState(2316);
						match(QuotedMultiLineText);
						}
						break;
					case InterpolataionMultiLine:
						{
						setState(2317);
						match(InterpolataionMultiLine);
						setState(2323);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
						case 1:
							{
							setState(2318);
							expression(0);
							}
							break;
						case 2:
							{
							setState(2319);
							tuple_element();
							setState(2320);
							match(Comma);
							setState(2321);
							tuple_element_list();
							}
							break;
						}
						setState(2325);
						match(RightCurly);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2332);
				match(MultiLineStringClose);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Optional_pattern_Context extends PatternContext {
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public Optional_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Is_pattern_Context extends PatternContext {
		public TerminalNode KeywordIs() { return getToken(AtemParser.KeywordIs, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Is_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class As_pattern_Context extends PatternContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode KeywordAs() { return getToken(AtemParser.KeywordAs, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public As_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Value_binding_pattern_Context extends PatternContext {
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Value_binding_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Identifier_pattern_Context extends PatternContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Expression_pattern_Context extends PatternContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Enumerator_pattern_Context extends PatternContext {
		public Enumerator_patternContext enumerator_pattern() {
			return getRuleContext(Enumerator_patternContext.class,0);
		}
		public Enumerator_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Wildcard_pattern_Context extends PatternContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Wildcard_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}
	public static class Tuple_pattern_Context extends PatternContext {
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Tuple_pattern_Context(PatternContext ctx) { copyFrom(ctx); }
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 508;
		enterRecursionRule(_localctx, 508, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				_localctx = new Wildcard_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2336);
				wildcard_pattern();
				setState(2339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2337);
					match(Colon);
					setState(2338);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new Identifier_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2341);
				identifier_pattern();
				setState(2344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2342);
					match(Colon);
					setState(2343);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new Value_binding_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2346);
				value_binding_pattern();
				setState(2349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2347);
					match(Colon);
					setState(2348);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new Tuple_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2351);
				tuple_pattern();
				}
				break;
			case 5:
				{
				_localctx = new Enumerator_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2352);
				enumerator_pattern();
				}
				break;
			case 6:
				{
				_localctx = new Optional_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2353);
				optional_pattern();
				}
				break;
			case 7:
				{
				_localctx = new Is_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2354);
				match(KeywordIs);
				setState(2355);
				type_expression(0);
				}
				break;
			case 8:
				{
				_localctx = new Expression_pattern_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2356);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new As_pattern_Context(new PatternContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(2359);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2360);
					match(KeywordAs);
					setState(2361);
					type_expression(0);
					}
					} 
				}
				setState(2366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AtemParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AtemParser.Comma, i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_tuple_pattern_element_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2367);
			tuple_pattern_element();
			setState(2372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2368);
					match(Comma);
					setState(2369);
					tuple_pattern_element();
					}
					} 
				}
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			setState(2376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(2375);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AtemParser.Colon, 0); }
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_tuple_pattern_element);
		try {
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2378);
				pattern(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2379);
				match(Identifier);
				setState(2380);
				match(Colon);
				setState(2381);
				pattern(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode Underscore() { return getToken(AtemParser.Underscore, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			match(Underscore);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_patternContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_binding_patternContext extends ParserRuleContext {
		public TerminalNode KeywordLet() { return getToken(AtemParser.KeywordLet, 0); }
		public TerminalNode KeywordVar() { return getToken(AtemParser.KeywordVar, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_value_binding_pattern);
		try {
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2388);
				match(KeywordLet);
				setState(2389);
				match(KeywordVar);
				setState(2390);
				pattern(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2391);
				match(KeywordLet);
				setState(2392);
				pattern(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode LeftParenthese() { return getToken(AtemParser.LeftParenthese, 0); }
		public TerminalNode RightParenthese() { return getToken(AtemParser.RightParenthese, 0); }
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			match(LeftParenthese);
			setState(2397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2396);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(2399);
			match(RightParenthese);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_patternContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(AtemParser.Dot, 0); }
		public Enumerator_nameContext enumerator_name() {
			return getRuleContext(Enumerator_nameContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enumerator_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_pattern; }
	}

	public final Enumerator_patternContext enumerator_pattern() throws RecognitionException {
		Enumerator_patternContext _localctx = new Enumerator_patternContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_enumerator_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeywordAny) | (1L << KeywordBool) | (1L << KeywordBreak) | (1L << KeywordByte) | (1L << KeywordChar8) | (1L << KeywordChar16) | (1L << KeywordChar32) | (1L << KeywordCompileTimeInt) | (1L << KeywordCompileTimeFloat) | (1L << KeywordCompileTimeString) | (1L << KeywordCompileTimeChar) | (1L << KeywordComptime) | (1L << KeywordContinue) | (1L << KeywordFloat16) | (1L << KeywordFloat32) | (1L << KeywordFloat64) | (1L << KeywordFloat80) | (1L << KeywordFloat128) | (1L << KeywordFor) | (1L << KeywordGlobal) | (1L << KeywordIf) | (1L << KeywordInt8) | (1L << KeywordInt16))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KeywordInt32 - 64)) | (1L << (KeywordInt64 - 64)) | (1L << (KeywordInt128 - 64)) | (1L << (KeywordModule - 64)) | (1L << (KeywordNever - 64)) | (1L << (KeywordOuter - 64)) | (1L << (KeywordPackage - 64)) | (1L << (KeywordRepeat - 64)) | (1L << (KeywordReturn - 64)) | (1L << (KeywordSelf - 64)) | (1L << (KeywordSome - 64)) | (1L << (KeywordString - 64)) | (1L << (KeywordSuper - 64)) | (1L << (KeywordThis - 64)) | (1L << (KeywordThrow - 64)) | (1L << (KeywordType - 64)) | (1L << (KeywordUInt8 - 64)) | (1L << (KeywordUInt16 - 64)) | (1L << (KeywordUInt32 - 64)) | (1L << (KeywordUInt64 - 64)) | (1L << (KeywordUInt128 - 64)) | (1L << (KeywordUnit - 64)) | (1L << (KeywordUnreachable - 64)) | (1L << (KeywordWhile - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Identifier - 129)) | (1L << (LeftCurly - 129)) | (1L << (LeftParenthese - 129)) | (1L << (RightParenthese - 129)) | (1L << (LeftSquare - 129)) | (1L << (Question - 129)))) != 0)) {
				{
				setState(2401);
				type_expression(0);
				}
			}

			setState(2404);
			match(Dot);
			setState(2405);
			enumerator_name();
			setState(2407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2406);
				tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_patternContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AtemParser.Identifier, 0); }
		public TerminalNode Question() { return getToken(AtemParser.Question, 0); }
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
			match(Identifier);
			setState(2410);
			match(Question);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 200:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 212:
			return type_expression_sempred((Type_expressionContext)_localctx, predIndex);
		case 254:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 51);
		case 1:
			return precpred(_ctx, 46);
		case 2:
			return precpred(_ctx, 44);
		case 3:
			return precpred(_ctx, 41);
		case 4:
			return precpred(_ctx, 40);
		case 5:
			return precpred(_ctx, 35);
		case 6:
			return precpred(_ctx, 34);
		case 7:
			return precpred(_ctx, 32);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 50);
		case 10:
			return precpred(_ctx, 48);
		case 11:
			return precpred(_ctx, 47);
		case 12:
			return precpred(_ctx, 45);
		case 13:
			return precpred(_ctx, 38);
		case 14:
			return precpred(_ctx, 29);
		case 15:
			return precpred(_ctx, 27);
		case 16:
			return precpred(_ctx, 26);
		case 17:
			return precpred(_ctx, 25);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 9);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_expression_sempred(Type_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ee\u0971\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\3\2\5\2\u0214\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\u021c\n\3\3\3\5\3\u021f\n\3\3\3\5\3\u0222\n\3\3\4\6\4\u0225\n"+
		"\4\r\4\16\4\u0226\3\5\3\5\5\5\u022b\n\5\3\6\3\6\3\6\3\6\7\6\u0231\n\6"+
		"\f\6\16\6\u0234\13\6\3\6\5\6\u0237\n\6\3\6\3\6\3\7\3\7\3\7\3\b\5\b\u023f"+
		"\n\b\3\b\5\b\u0242\n\b\3\b\3\b\3\b\3\t\3\t\5\t\u0249\n\t\3\t\5\t\u024c"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0263\n\f\3\r\3\r\5\r\u0267\n\r\3\r\5\r\u026a"+
		"\n\r\3\r\5\r\u026d\n\r\3\r\5\r\u0270\n\r\3\r\5\r\u0273\n\r\3\r\3\r\3\16"+
		"\3\16\5\16\u0279\n\16\3\16\5\16\u027c\n\16\3\16\5\16\u027f\n\16\3\16\5"+
		"\16\u0282\n\16\3\16\5\16\u0285\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\6\21\u028e\n\21\r\21\16\21\u028f\3\22\3\22\3\22\6\22\u0295\n\22\r\22"+
		"\16\22\u0296\3\22\3\22\3\23\3\23\5\23\u029d\n\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u02a7\n\25\3\26\3\26\5\26\u02ab\n\26\3\27\6\27"+
		"\u02ae\n\27\r\27\16\27\u02af\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5"+
		"\31\u02ba\n\31\3\32\6\32\u02bd\n\32\r\32\16\32\u02be\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\5\34\u02c9\n\34\3\35\3\35\3\35\3\35\5\35\u02cf"+
		"\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\5!\u02de"+
		"\n!\3!\5!\u02e1\n!\3!\5!\u02e4\n!\3!\3!\3!\3\"\5\"\u02ea\n\"\3\"\5\"\u02ed"+
		"\n\"\3\"\5\"\u02f0\n\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u02fe"+
		"\n%\3&\3&\3&\3\'\6\'\u0304\n\'\r\'\16\'\u0305\3(\3(\3(\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\5*\u0313\n*\3+\6+\u0316\n+\r+\16+\u0317\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\5-\u0322\n-\3.\3.\3.\3.\5.\u0328\n.\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\62\5\62\u0337\n\62\3\62\5\62\u033a\n\62\3\62"+
		"\5\62\u033d\n\62\3\62\3\62\3\62\3\63\5\63\u0343\n\63\3\63\5\63\u0346\n"+
		"\63\3\63\5\63\u0349\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\67\5\67\u0357\n\67\3\67\3\67\3\67\3\67\38\58\u035e\n8\38"+
		"\58\u0361\n8\38\58\u0364\n8\39\69\u0367\n9\r9\169\u0368\3:\3:\3:\3;\3"+
		";\3;\3;\3<\5<\u0373\n<\3<\3<\3<\3<\3=\5=\u037a\n=\3=\5=\u037d\n=\3=\5"+
		"=\u0380\n=\3>\6>\u0383\n>\r>\16>\u0384\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\5"+
		"@\u0391\n@\3A\6A\u0394\nA\rA\16A\u0395\3B\3B\3B\3B\3B\5B\u039d\nB\3C\3"+
		"C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\5I\u03b4\n"+
		"I\3J\3J\3J\5J\u03b9\nJ\3K\3K\3K\3L\5L\u03bf\nL\3L\5L\u03c2\nL\3L\5L\u03c5"+
		"\nL\3L\3L\3L\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\5P\u03d8\nP\3Q"+
		"\6Q\u03db\nQ\rQ\16Q\u03dc\3R\5R\u03e0\nR\3R\3R\3R\3R\3R\3S\5S\u03e8\n"+
		"S\3S\5S\u03eb\nS\3T\5T\u03ee\nT\3T\3T\3T\3T\3T\3U\5U\u03f6\nU\3U\5U\u03f9"+
		"\nU\3U\5U\u03fc\nU\3V\3V\3V\3V\3W\3W\3W\5W\u0405\nW\3X\3X\3Y\3Y\5Y\u040b"+
		"\nY\3Y\5Y\u040e\nY\3Y\5Y\u0411\nY\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\5\\\u0422\n\\\3]\6]\u0425\n]\r]\16]\u0426\3^\3^\3^\3^\3"+
		"^\3^\5^\u042f\n^\3_\3_\3_\5_\u0434\n_\3_\5_\u0437\n_\3_\3_\3_\5_\u043c"+
		"\n_\3`\3`\3`\5`\u0441\n`\3`\3`\3`\5`\u0446\n`\5`\u0448\n`\3a\3a\3a\5a"+
		"\u044d\na\3a\3a\3a\5a\u0452\na\5a\u0454\na\3b\3b\3b\3b\3b\5b\u045b\nb"+
		"\3c\3c\3c\3c\3c\5c\u0462\nc\3d\3d\5d\u0466\nd\3d\5d\u0469\nd\3d\5d\u046c"+
		"\nd\3d\5d\u046f\nd\3d\3d\3d\3e\3e\5e\u0476\ne\3e\5e\u0479\ne\3e\5e\u047c"+
		"\ne\3e\5e\u047f\ne\3e\3e\3f\3f\3g\3g\3g\3h\3h\3h\3h\6h\u048c\nh\rh\16"+
		"h\u048d\3h\3h\3h\3i\3i\3i\3i\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3m\3m\5m\u04a3"+
		"\nm\3m\5m\u04a6\nm\3n\3n\5n\u04aa\nn\3n\5n\u04ad\nn\3n\5n\u04b0\nn\3n"+
		"\5n\u04b3\nn\3n\5n\u04b6\nn\3n\5n\u04b9\nn\3n\3n\3o\3o\3o\3o\6o\u04c1"+
		"\no\ro\16o\u04c2\3o\5o\u04c6\no\3o\3o\3p\3p\3p\3p\3p\5p\u04cf\np\3q\3"+
		"q\5q\u04d3\nq\3q\5q\u04d6\nq\3r\3r\3r\5r\u04db\nr\3r\3r\3s\3s\3s\7s\u04e2"+
		"\ns\fs\16s\u04e5\13s\3t\5t\u04e8\nt\3t\3t\3t\5t\u04ed\nt\3t\5t\u04f0\n"+
		"t\3u\3u\3v\3v\3v\3w\3w\3x\3x\3y\3y\5y\u04fd\ny\3y\5y\u0500\ny\3y\3y\3"+
		"z\3z\5z\u0506\nz\3z\5z\u0509\nz\3z\3z\3{\3{\3{\6{\u0510\n{\r{\16{\u0511"+
		"\3{\3{\5{\u0516\n{\3|\3|\3|\6|\u051b\n|\r|\16|\u051c\3|\3|\5|\u0521\n"+
		"|\3}\3}\5}\u0525\n}\3~\3~\3~\3~\6~\u052b\n~\r~\16~\u052c\3~\5~\u0530\n"+
		"~\3~\3~\3\177\3\177\3\u0080\3\u0080\5\u0080\u0538\n\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0541\n\u0081\3\u0082"+
		"\3\u0082\3\u0083\6\u0083\u0546\n\u0083\r\u0083\16\u0083\u0547\3\u0084"+
		"\3\u0084\5\u0084\u054c\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0555\n\u0085\3\u0086\3\u0086\3\u0087\6\u0087"+
		"\u055a\n\u0087\r\u0087\16\u0087\u055b\3\u0088\3\u0088\5\u0088\u0560\n"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0564\n\u0088\3\u0088\5\u0088\u0567\n\u0088"+
		"\3\u0089\3\u0089\5\u0089\u056b\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u0577\n\u008c"+
		"\3\u008c\5\u008c\u057a\n\u008c\3\u008c\3\u008c\3\u008d\3\u008d\5\u008d"+
		"\u0580\n\u008d\3\u008e\3\u008e\3\u008e\6\u008e\u0585\n\u008e\r\u008e\16"+
		"\u008e\u0586\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u058d\n\u008e\3\u008f"+
		"\3\u008f\5\u008f\u0591\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u0597\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u05a2\n\u0091\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u05ab\n\u0094\3\u0094\5\u0094\u05ae\n"+
		"\u0094\3\u0095\3\u0095\3\u0096\6\u0096\u05b3\n\u0096\r\u0096\16\u0096"+
		"\u05b4\3\u0097\3\u0097\5\u0097\u05b9\n\u0097\3\u0097\3\u0097\3\u0098\3"+
		"\u0098\5\u0098\u05bf\n\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\7"+
		"\u0099\u05c6\n\u0099\f\u0099\16\u0099\u05c9\13\u0099\3\u009a\5\u009a\u05cc"+
		"\n\u009a\3\u009a\5\u009a\u05cf\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u05d4\n\u009a\3\u009a\5\u009a\u05d7\n\u009a\3\u009b\3\u009b\3\u009c\3"+
		"\u009c\3\u009d\3\u009d\3\u009d\3\u009e\5\u009e\u05e1\n\u009e\3\u009e\3"+
		"\u009e\3\u009f\3\u009f\5\u009f\u05e7\n\u009f\3\u009f\3\u009f\3\u00a0\3"+
		"\u00a0\5\u00a0\u05ed\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\5"+
		"\u00a2\u05f4\n\u00a2\3\u00a2\5\u00a2\u05f7\n\u00a2\3\u00a2\5\u00a2\u05fa"+
		"\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\6\u00a4"+
		"\u0603\n\u00a4\r\u00a4\16\u00a4\u0604\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\5\u00a6\u060b\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\5\u00a8\u0613\n\u00a8\3\u00a8\3\u00a8\3\u00a9\5\u00a9\u0618\n\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u061c\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ac\6\u00ac\u0627\n\u00ac\r\u00ac\16"+
		"\u00ac\u0628\3\u00ad\3\u00ad\3\u00ae\5\u00ae\u062e\n\u00ae\3\u00ae\3\u00ae"+
		"\5\u00ae\u0632\n\u00ae\3\u00af\3\u00af\5\u00af\u0636\n\u00af\3\u00af\3"+
		"\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u063d\n\u00b0\f\u00b0\16\u00b0"+
		"\u0640\13\u00b0\3\u00b1\5\u00b1\u0643\n\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u0647\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\6\u00b3\u064d\n\u00b3\r"+
		"\u00b3\16\u00b3\u064e\3\u00b4\3\u00b4\6\u00b4\u0653\n\u00b4\r\u00b4\16"+
		"\u00b4\u0654\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\6\u00b6\u065c\n\u00b6"+
		"\r\u00b6\16\u00b6\u065d\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9"+
		"\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be"+
		"\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\5\u00c5\u067e\n\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0683\n\u00c6\5\u00c6\u0685\n\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u06b2"+
		"\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u06b6\n\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u06ba\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u06be\n\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u06c4\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\5\u00ca\u06cd\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u06db\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u070e"+
		"\n\u00ca\f\u00ca\16\u00ca\u0711\13\u00ca\3\u00ca\5\u00ca\u0714\n\u00ca"+
		"\5\u00ca\u0716\n\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u071b\n\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\6\u00ca\u0732\n\u00ca\r\u00ca\16\u00ca\u0733"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\6\u00ca\u073d"+
		"\n\u00ca\r\u00ca\16\u00ca\u073e\3\u00ca\3\u00ca\5\u00ca\u0743\n\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0747\n\u00ca\7\u00ca\u0749\n\u00ca\f\u00ca\16"+
		"\u00ca\u074c\13\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0756\n\u00cd\3\u00ce\3\u00ce\5\u00ce\u075a\n"+
		"\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0761\n\u00cf\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0768\n\u00d0\3\u00d1\3"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u076f\n\u00d1\3\u00d2\3\u00d2\3"+
		"\u00d2\3\u00d2\5\u00d2\u0775\n\u00d2\3\u00d2\3\u00d2\5\u00d2\u0779\n\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u077e\n\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u0784\n\u00d3\3\u00d4\5\u00d4\u0787\n\u00d4\3\u00d4\3"+
		"\u00d4\3\u00d5\3\u00d5\5\u00d5\u078d\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0792\n\u00d5\7\u00d5\u0794\n\u00d5\f\u00d5\16\u00d5\u0797\13\u00d5"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u07ab\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u07b1\n"+
		"\u00d6\5\u00d6\u07b3\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\5\u00d6\u07bc\n\u00d6\5\u00d6\u07be\n\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\5\u00d6\u07c4\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\5\u00d6\u07cb\n\u00d6\5\u00d6\u07cd\n\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\5\u00d6\u07d3\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3"+
		"\u00d6\5\u00d6\u07da\n\u00d6\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u07df\n\u00d6"+
		"\5\u00d6\u07e1\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u07e9\n\u00d6\3\u00d6\3\u00d6\5\u00d6\u07ed\n\u00d6\3\u00d6\3"+
		"\u00d6\5\u00d6\u07f1\n\u00d6\3\u00d6\3\u00d6\5\u00d6\u07f5\n\u00d6\3\u00d6"+
		"\3\u00d6\5\u00d6\u07f9\n\u00d6\3\u00d6\3\u00d6\7\u00d6\u07fd\n\u00d6\f"+
		"\u00d6\16\u00d6\u0800\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u080d\n\u00d7"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0813\n\u00d8\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\6\u00da\u081b\n\u00da\r\u00da\16\u00da"+
		"\u081c\3\u00da\5\u00da\u0820\n\u00da\5\u00da\u0822\n\u00da\3\u00da\3\u00da"+
		"\3\u00db\5\u00db\u0827\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db"+
		"\u082d\n\u00db\3\u00db\5\u00db\u0830\n\u00db\3\u00dc\3\u00dc\3\u00dc\3"+
		"\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u083e\n\u00df\3\u00df\3\u00df\3\u00df\6\u00df\u0843\n\u00df\r"+
		"\u00df\16\u00df\u0844\3\u00df\5\u00df\u0848\n\u00df\3\u00df\3\u00df\3"+
		"\u00df\5\u00df\u084d\n\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0853"+
		"\n\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0858\n\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u085d\n\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u0864\n\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3\u0870\n\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e9"+
		"\3\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u088c\n\u00ed"+
		"\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0891\n\u00ee\f\u00ee\16\u00ee\u0894"+
		"\13\u00ee\3\u00ef\3\u00ef\5\u00ef\u0898\n\u00ef\3\u00ef\3\u00ef\3\u00f0"+
		"\3\u00f0\5\u00f0\u089e\n\u00f0\3\u00f0\3\u00f0\3\u00f0\7\u00f0\u08a3\n"+
		"\u00f0\f\u00f0\16\u00f0\u08a6\13\u00f0\3\u00f1\3\u00f1\3\u00f2\3\u00f2"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\5\u00f3\u08b3"+
		"\n\u00f3\3\u00f4\3\u00f4\5\u00f4\u08b7\n\u00f4\3\u00f5\3\u00f5\3\u00f6"+
		"\3\u00f6\3\u00f7\3\u00f7\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u08c9\n\u00fb\f\u00fb\16\u00fb"+
		"\u08cc\13\u00fb\3\u00fb\5\u00fb\u08cf\n\u00fb\5\u00fb\u08d1\n\u00fb\3"+
		"\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u08d8\n\u00fc\3\u00fd\3"+
		"\u00fd\6\u00fd\u08dc\n\u00fd\r\u00fd\16\u00fd\u08dd\3\u00fd\3\u00fd\3"+
		"\u00fd\6\u00fd\u08e3\n\u00fd\r\u00fd\16\u00fd\u08e4\3\u00fd\5\u00fd\u08e8"+
		"\n\u00fd\3\u00fe\3\u00fe\7\u00fe\u08ec\n\u00fe\f\u00fe\16\u00fe\u08ef"+
		"\13\u00fe\3\u00fe\3\u00fe\3\u00fe\7\u00fe\u08f4\n\u00fe\f\u00fe\16\u00fe"+
		"\u08f7\13\u00fe\3\u00fe\5\u00fe\u08fa\n\u00fe\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u0904\n\u00ff\3\u00ff"+
		"\3\u00ff\7\u00ff\u0908\n\u00ff\f\u00ff\16\u00ff\u090b\13\u00ff\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff"+
		"\u0916\n\u00ff\3\u00ff\3\u00ff\7\u00ff\u091a\n\u00ff\f\u00ff\16\u00ff"+
		"\u091d\13\u00ff\3\u00ff\5\u00ff\u0920\n\u00ff\3\u0100\3\u0100\3\u0100"+
		"\3\u0100\5\u0100\u0926\n\u0100\3\u0100\3\u0100\3\u0100\5\u0100\u092b\n"+
		"\u0100\3\u0100\3\u0100\3\u0100\5\u0100\u0930\n\u0100\3\u0100\3\u0100\3"+
		"\u0100\3\u0100\3\u0100\3\u0100\5\u0100\u0938\n\u0100\3\u0100\3\u0100\3"+
		"\u0100\7\u0100\u093d\n\u0100\f\u0100\16\u0100\u0940\13\u0100\3\u0101\3"+
		"\u0101\3\u0101\7\u0101\u0945\n\u0101\f\u0101\16\u0101\u0948\13\u0101\3"+
		"\u0101\5\u0101\u094b\n\u0101\3\u0102\3\u0102\3\u0102\3\u0102\5\u0102\u0951"+
		"\n\u0102\3\u0103\3\u0103\3\u0104\3\u0104\3\u0105\3\u0105\3\u0105\3\u0105"+
		"\3\u0105\5\u0105\u095c\n\u0105\3\u0106\3\u0106\5\u0106\u0960\n\u0106\3"+
		"\u0106\3\u0106\3\u0107\5\u0107\u0965\n\u0107\3\u0107\3\u0107\3\u0107\5"+
		"\u0107\u096a\n\u0107\3\u0108\3\u0108\3\u0108\3\u0109\3\u0109\3\u0109\3"+
		"\u08a4\5\u0192\u01aa\u01fe\u010a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2"+
		"\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea"+
		"\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202"+
		"\u0204\u0206\u0208\u020a\u020c\u020e\u0210\2\34\5\2..LLff\4\2\67\67dd"+
		"\13\2\4\4\25\25\34\34&&\66\66LL[[hhyy\7\2--EESSYY\\\\\4\2]^oo\5\288ff"+
		"mm\4\2**ii\3\2\u0098\u00a5\3\2\u009b\u009c\3\2\u00a6\u00ba\3\2\u00bb\u00c1"+
		"\4\2\5\5UU\4\2\u00c3\u00c4\u00c6\u00c8\4\2\u00c2\u00c2\u00c5\u00c5\3\2"+
		"\u00c9\u00cb\3\2\u00cc\u00cd\3\2\u00ce\u00d1\3\2\u0095\u0096\3\2\u00d4"+
		"\u00d5\4\2@Dsw\3\2/\63\3\2\22\24\3\2\26\31\t\2KKVVXXccjjll\u0083\u0083"+
		"\3\2\u0084\u0088\4\2,,pp\2\u0a07\2\u0213\3\2\2\2\4\u0221\3\2\2\2\6\u0224"+
		"\3\2\2\2\b\u022a\3\2\2\2\n\u022c\3\2\2\2\f\u023a\3\2\2\2\16\u023e\3\2"+
		"\2\2\20\u0246\3\2\2\2\22\u024f\3\2\2\2\24\u0252\3\2\2\2\26\u0262\3\2\2"+
		"\2\30\u0264\3\2\2\2\32\u0276\3\2\2\2\34\u0288\3\2\2\2\36\u028a\3\2\2\2"+
		" \u028d\3\2\2\2\"\u0291\3\2\2\2$\u029c\3\2\2\2&\u029e\3\2\2\2(\u02a6\3"+
		"\2\2\2*\u02a8\3\2\2\2,\u02ad\3\2\2\2.\u02b1\3\2\2\2\60\u02b9\3\2\2\2\62"+
		"\u02bc\3\2\2\2\64\u02c0\3\2\2\2\66\u02c4\3\2\2\28\u02ca\3\2\2\2:\u02d0"+
		"\3\2\2\2<\u02d4\3\2\2\2>\u02d8\3\2\2\2@\u02dd\3\2\2\2B\u02e9\3\2\2\2D"+
		"\u02f3\3\2\2\2F\u02f5\3\2\2\2H\u02fd\3\2\2\2J\u02ff\3\2\2\2L\u0303\3\2"+
		"\2\2N\u0307\3\2\2\2P\u030a\3\2\2\2R\u0312\3\2\2\2T\u0315\3\2\2\2V\u0319"+
		"\3\2\2\2X\u031d\3\2\2\2Z\u0323\3\2\2\2\\\u0329\3\2\2\2^\u032d\3\2\2\2"+
		"`\u0331\3\2\2\2b\u0336\3\2\2\2d\u0342\3\2\2\2f\u034c\3\2\2\2h\u034e\3"+
		"\2\2\2j\u0351\3\2\2\2l\u0356\3\2\2\2n\u035d\3\2\2\2p\u0366\3\2\2\2r\u036a"+
		"\3\2\2\2t\u036d\3\2\2\2v\u0372\3\2\2\2x\u0379\3\2\2\2z\u0382\3\2\2\2|"+
		"\u0386\3\2\2\2~\u0390\3\2\2\2\u0080\u0393\3\2\2\2\u0082\u039c\3\2\2\2"+
		"\u0084\u039e\3\2\2\2\u0086\u03a1\3\2\2\2\u0088\u03a4\3\2\2\2\u008a\u03a7"+
		"\3\2\2\2\u008c\u03aa\3\2\2\2\u008e\u03ad\3\2\2\2\u0090\u03b0\3\2\2\2\u0092"+
		"\u03b5\3\2\2\2\u0094\u03ba\3\2\2\2\u0096\u03be\3\2\2\2\u0098\u03c9\3\2"+
		"\2\2\u009a\u03cb\3\2\2\2\u009c\u03d0\3\2\2\2\u009e\u03d7\3\2\2\2\u00a0"+
		"\u03da\3\2\2\2\u00a2\u03df\3\2\2\2\u00a4\u03e7\3\2\2\2\u00a6\u03ed\3\2"+
		"\2\2\u00a8\u03f5\3\2\2\2\u00aa\u03fd\3\2\2\2\u00ac\u0401\3\2\2\2\u00ae"+
		"\u0406\3\2\2\2\u00b0\u0408\3\2\2\2\u00b2\u0414\3\2\2\2\u00b4\u0417\3\2"+
		"\2\2\u00b6\u0421\3\2\2\2\u00b8\u0424\3\2\2\2\u00ba\u0428\3\2\2\2\u00bc"+
		"\u0430\3\2\2\2\u00be\u043d\3\2\2\2\u00c0\u0449\3\2\2\2\u00c2\u0455\3\2"+
		"\2\2\u00c4\u045c\3\2\2\2\u00c6\u0463\3\2\2\2\u00c8\u0473\3\2\2\2\u00ca"+
		"\u0482\3\2\2\2\u00cc\u0484\3\2\2\2\u00ce\u0487\3\2\2\2\u00d0\u0492\3\2"+
		"\2\2\u00d2\u0496\3\2\2\2\u00d4\u0498\3\2\2\2\u00d6\u049c\3\2\2\2\u00d8"+
		"\u04a0\3\2\2\2\u00da\u04a7\3\2\2\2\u00dc\u04bc\3\2\2\2\u00de\u04ce\3\2"+
		"\2\2\u00e0\u04d0\3\2\2\2\u00e2\u04d7\3\2\2\2\u00e4\u04de\3\2\2\2\u00e6"+
		"\u04e7\3\2\2\2\u00e8\u04f1\3\2\2\2\u00ea\u04f3\3\2\2\2\u00ec\u04f6\3\2"+
		"\2\2\u00ee\u04f8\3\2\2\2\u00f0\u04fa\3\2\2\2\u00f2\u0503\3\2\2\2\u00f4"+
		"\u0515\3\2\2\2\u00f6\u0517\3\2\2\2\u00f8\u0524\3\2\2\2\u00fa\u0526\3\2"+
		"\2\2\u00fc\u0533\3\2\2\2\u00fe\u0535\3\2\2\2\u0100\u0540\3\2\2\2\u0102"+
		"\u0542\3\2\2\2\u0104\u0545\3\2\2\2\u0106\u0549\3\2\2\2\u0108\u0554\3\2"+
		"\2\2\u010a\u0556\3\2\2\2\u010c\u0559\3\2\2\2\u010e\u0566\3\2\2\2\u0110"+
		"\u0568\3\2\2\2\u0112\u056e\3\2\2\2\u0114\u0572\3\2\2\2\u0116\u0574\3\2"+
		"\2\2\u0118\u057f\3\2\2\2\u011a\u058c\3\2\2\2\u011c\u0590\3\2\2\2\u011e"+
		"\u0592\3\2\2\2\u0120\u0598\3\2\2\2\u0122\u05a3\3\2\2\2\u0124\u05a5\3\2"+
		"\2\2\u0126\u05a7\3\2\2\2\u0128\u05af\3\2\2\2\u012a\u05b2\3\2\2\2\u012c"+
		"\u05b6\3\2\2\2\u012e\u05bc\3\2\2\2\u0130\u05c2\3\2\2\2\u0132\u05cb\3\2"+
		"\2\2\u0134\u05d8\3\2\2\2\u0136\u05da\3\2\2\2\u0138\u05dc\3\2\2\2\u013a"+
		"\u05e0\3\2\2\2\u013c\u05e4\3\2\2\2\u013e\u05ea\3\2\2\2\u0140\u05f0\3\2"+
		"\2\2\u0142\u05f3\3\2\2\2\u0144\u05fd\3\2\2\2\u0146\u0602\3\2\2\2\u0148"+
		"\u0606\3\2\2\2\u014a\u0608\3\2\2\2\u014c\u060e\3\2\2\2\u014e\u0610\3\2"+
		"\2\2\u0150\u0617\3\2\2\2\u0152\u061f\3\2\2\2\u0154\u0622\3\2\2\2\u0156"+
		"\u0626\3\2\2\2\u0158\u062a\3\2\2\2\u015a\u0631\3\2\2\2\u015c\u0633\3\2"+
		"\2\2\u015e\u0639\3\2\2\2\u0160\u0642\3\2\2\2\u0162\u0648\3\2\2\2\u0164"+
		"\u064c\3\2\2\2\u0166\u0650\3\2\2\2\u0168\u0656\3\2\2\2\u016a\u065b\3\2"+
		"\2\2\u016c\u065f\3\2\2\2\u016e\u0661\3\2\2\2\u0170\u0663\3\2\2\2\u0172"+
		"\u0665\3\2\2\2\u0174\u0667\3\2\2\2\u0176\u0669\3\2\2\2\u0178\u066b\3\2"+
		"\2\2\u017a\u066d\3\2\2\2\u017c\u066f\3\2\2\2\u017e\u0671\3\2\2\2\u0180"+
		"\u0673\3\2\2\2\u0182\u0675\3\2\2\2\u0184\u0677\3\2\2\2\u0186\u0679\3\2"+
		"\2\2\u0188\u067b\3\2\2\2\u018a\u0684\3\2\2\2\u018c\u0686\3\2\2\2\u018e"+
		"\u0688\3\2\2\2\u0190\u068a\3\2\2\2\u0192\u06da\3\2\2\2\u0194\u074d\3\2"+
		"\2\2\u0196\u074f\3\2\2\2\u0198\u0755\3\2\2\2\u019a\u0759\3\2\2\2\u019c"+
		"\u075b\3\2\2\2\u019e\u0762\3\2\2\2\u01a0\u0769\3\2\2\2\u01a2\u0770\3\2"+
		"\2\2\u01a4\u077f\3\2\2\2\u01a6\u0786\3\2\2\2\u01a8\u078a\3\2\2\2\u01aa"+
		"\u07f8\3\2\2\2\u01ac\u080c\3\2\2\2\u01ae\u0812\3\2\2\2\u01b0\u0814\3\2"+
		"\2\2\u01b2\u0816\3\2\2\2\u01b4\u082f\3\2\2\2\u01b6\u0831\3\2\2\2\u01b8"+
		"\u0834\3\2\2\2\u01ba\u0837\3\2\2\2\u01bc\u083a\3\2\2\2\u01be\u084e\3\2"+
		"\2\2\u01c0\u0854\3\2\2\2\u01c2\u0860\3\2\2\2\u01c4\u086f\3\2\2\2\u01c6"+
		"\u0871\3\2\2\2\u01c8\u0873\3\2\2\2\u01ca\u0875\3\2\2\2\u01cc\u0877\3\2"+
		"\2\2\u01ce\u0879\3\2\2\2\u01d0\u087b\3\2\2\2\u01d2\u087d\3\2\2\2\u01d4"+
		"\u087f\3\2\2\2\u01d6\u0881\3\2\2\2\u01d8\u088b\3\2\2\2\u01da\u088d\3\2"+
		"\2\2\u01dc\u0897\3\2\2\2\u01de\u089d\3\2\2\2\u01e0\u08a7\3\2\2\2\u01e2"+
		"\u08a9\3\2\2\2\u01e4\u08b2\3\2\2\2\u01e6\u08b6\3\2\2\2\u01e8\u08b8\3\2"+
		"\2\2\u01ea\u08ba\3\2\2\2\u01ec\u08bc\3\2\2\2\u01ee\u08be\3\2\2\2\u01f0"+
		"\u08c0\3\2\2\2\u01f2\u08c2\3\2\2\2\u01f4\u08c4\3\2\2\2\u01f6\u08d7\3\2"+
		"\2\2\u01f8\u08e7\3\2\2\2\u01fa\u08f9\3\2\2\2\u01fc\u091f\3\2\2\2\u01fe"+
		"\u0937\3\2\2\2\u0200\u0941\3\2\2\2\u0202\u0950\3\2\2\2\u0204\u0952\3\2"+
		"\2\2\u0206\u0954\3\2\2\2\u0208\u095b\3\2\2\2\u020a\u095d\3\2\2\2\u020c"+
		"\u0964\3\2\2\2\u020e\u096b\3\2\2\2\u0210\u096e\3\2\2\2\u0212\u0214\5\6"+
		"\4\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\7\2\2\3\u0216\3\3\2\2\2\u0217\u021c\5\f\7\2\u0218\u021c\5\u00f2"+
		"z\2\u0219\u021c\5\u014a\u00a6\2\u021a\u021c\5\u0192\u00ca\2\u021b\u0217"+
		"\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021f\7\u0092\2\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u0222\7\u0092\2\2\u0221\u021b\3\2\2"+
		"\2\u0221\u0220\3\2\2\2\u0222\5\3\2\2\2\u0223\u0225\5\4\3\2\u0224\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\7\3\2\2\2\u0228\u022b\5\f\7\2\u0229\u022b\5\n\6\2\u022a\u0228\3\2\2\2"+
		"\u022a\u0229\3\2\2\2\u022b\t\3\2\2\2\u022c\u022d\7\u008a\2\2\u022d\u0232"+
		"\5\f\7\2\u022e\u022f\7\u0093\2\2\u022f\u0231\5\f\7\2\u0230\u022e\3\2\2"+
		"\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7\u0093\2\2\u0236\u0235\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7\u008b\2\2\u0239"+
		"\13\3\2\2\2\u023a\u023b\5\16\b\2\u023b\u023c\5\26\f\2\u023c\r\3\2\2\2"+
		"\u023d\u023f\5\u0114\u008b\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0241\3\2\2\2\u0240\u0242\5\u0140\u00a1\2\u0241\u0240\3\2\2\2\u0241\u0242"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\24\13\2\u0244\u0245\5\20\t"+
		"\2\u0245\17\3\2\2\2\u0246\u024b\7\u0091\2\2\u0247\u0249\5\u0156\u00ac"+
		"\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c"+
		"\5\u01aa\u00d6\2\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024e\7\u00a6\2\2\u024e\21\3\2\2\2\u024f\u0250\7\u0091\2"+
		"\2\u0250\u0251\7\u00a6\2\2\u0251\23\3\2\2\2\u0252\u0253\5\u01de\u00f0"+
		"\2\u0253\25\3\2\2\2\u0254\u0263\5\u0106\u0084\2\u0255\u0263\5\u00fe\u0080"+
		"\2\u0256\u0263\5\u010e\u0088\2\u0257\u0263\5\u0110\u0089\2\u0258\u0263"+
		"\5\u0116\u008c\2\u0259\u0263\5\u013c\u009f\2\u025a\u0263\5\u013e\u00a0"+
		"\2\u025b\u0263\5\u00eex\2\u025c\u0263\5\u0112\u008a\2\u025d\u0263\5\30"+
		"\r\2\u025e\u0263\5\32\16\2\u025f\u0263\5\u00b0Y\2\u0260\u0263\5\u00d8"+
		"m\2\u0261\u0263\5\u00dan\2\u0262\u0254\3\2\2\2\u0262\u0255\3\2\2\2\u0262"+
		"\u0256\3\2\2\2\u0262\u0257\3\2\2\2\u0262\u0258\3\2\2\2\u0262\u0259\3\2"+
		"\2\2\u0262\u025a\3\2\2\2\u0262\u025b\3\2\2\2\u0262\u025c\3\2\2\2\u0262"+
		"\u025d\3\2\2\2\u0262\u025e\3\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2"+
		"\2\2\u0262\u0261\3\2\2\2\u0263\27\3\2\2\2\u0264\u0266\7h\2\2\u0265\u0267"+
		"\5\u0156\u00ac\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3"+
		"\2\2\2\u0268\u026a\5\34\17\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026c\3\2\2\2\u026b\u026d\5\"\22\2\u026c\u026b\3\2\2\2\u026c\u026d\3"+
		"\2\2\2\u026d\u026f\3\2\2\2\u026e\u0270\5h\65\2\u026f\u026e\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u0273\5r:\2\u0272\u0271\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5|?\2\u0275\31"+
		"\3\2\2\2\u0276\u0278\7\25\2\2\u0277\u0279\5\u0156\u00ac\2\u0278\u0277"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u027c\5\34\17\2"+
		"\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f"+
		"\5\"\22\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2"+
		"\u0280\u0282\5h\65\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284"+
		"\3\2\2\2\u0283\u0285\5r:\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0287\5|?\2\u0287\33\3\2\2\2\u0288\u0289\7.\2\2\u0289"+
		"\35\3\2\2\2\u028a\u028b\t\2\2\2\u028b\37\3\2\2\2\u028c\u028e\5\36\20\2"+
		"\u028d\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290!\3\2\2\2\u0291\u0292\7(\2\2\u0292\u0294\7\u008a\2\2\u0293"+
		"\u0295\5$\23\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7\u008b\2\2\u0299"+
		"#\3\2\2\2\u029a\u029d\5&\24\2\u029b\u029d\5F$\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d%\3\2\2\2\u029e\u029f\7=\2\2\u029f\u02a0\5(\25\2\u02a0"+
		"\'\3\2\2\2\u02a1\u02a2\7\u008a\2\2\u02a2\u02a3\5,\27\2\u02a3\u02a4\7\u008b"+
		"\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a7\5*\26\2\u02a6\u02a1\3\2\2\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7)\3\2\2\2\u02a8\u02aa\5\u01de\u00f0\2\u02a9\u02ab"+
		"\5.\30\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab+\3\2\2\2\u02ac"+
		"\u02ae\5*\26\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0-\3\2\2\2\u02b1\u02b2\7\u008a\2\2\u02b2"+
		"\u02b3\5\62\32\2\u02b3\u02b4\7\u008b\2\2\u02b4/\3\2\2\2\u02b5\u02ba\5"+
		"\64\33\2\u02b6\u02ba\5\66\34\2\u02b7\u02ba\58\35\2\u02b8\u02ba\5:\36\2"+
		"\u02b9\u02b5\3\2\2\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8"+
		"\3\2\2\2\u02ba\61\3\2\2\2\u02bb\u02bd\5\60\31\2\u02bc\u02bb\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\63\3\2\2"+
		"\2\u02c0\u02c1\7W\2\2\u02c1\u02c2\5@!\2\u02c2\u02c3\5\u0112\u008a\2\u02c3"+
		"\65\3\2\2\2\u02c4\u02c5\7W\2\2\u02c5\u02c6\5@!\2\u02c6\u02c8\5\u013c\u009f"+
		"\2\u02c7\u02c9\5\u009aN\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\67\3\2\2\2\u02ca\u02cb\7W\2\2\u02cb\u02cc\5@!\2\u02cc\u02ce\5\u013e\u00a0"+
		"\2\u02cd\u02cf\5\u009cO\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"9\3\2\2\2\u02d0\u02d1\7W\2\2\u02d1\u02d2\5@!\2\u02d2\u02d3\5\u0116\u008c"+
		"\2\u02d3;\3\2\2\2\u02d4\u02d5\7W\2\2\u02d5\u02d6\5B\"\2\u02d6\u02d7\5"+
		"\u00d4k\2\u02d7=\3\2\2\2\u02d8\u02d9\7W\2\2\u02d9\u02da\5B\"\2\u02da\u02db"+
		"\5\u00d6l\2\u02db?\3\2\2\2\u02dc\u02de\5\u0114\u008b\2\u02dd\u02dc\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02e1\5\u0140\u00a1"+
		"\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e4"+
		"\5 \21\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\5D#\2\u02e6\u02e7\5\20\t\2\u02e7A\3\2\2\2\u02e8\u02ea\5\u0114\u008b"+
		"\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed"+
		"\5\u0140\u00a1\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3"+
		"\2\2\2\u02ee\u02f0\5 \21\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\5\22\n\2\u02f2C\3\2\2\2\u02f3\u02f4\7\u0083"+
		"\2\2\u02f4E\3\2\2\2\u02f5\u02f6\7:\2\2\u02f6\u02f7\5H%\2\u02f7G\3\2\2"+
		"\2\u02f8\u02f9\7\u008a\2\2\u02f9\u02fa\5L\'\2\u02fa\u02fb\7\u008b\2\2"+
		"\u02fb\u02fe\3\2\2\2\u02fc\u02fe\5J&\2\u02fd\u02f8\3\2\2\2\u02fd\u02fc"+
		"\3\2\2\2\u02feI\3\2\2\2\u02ff\u0300\5\u01de\u00f0\2\u0300\u0301\5N(\2"+
		"\u0301K\3\2\2\2\u0302\u0304\5J&\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306M\3\2\2\2\u0307\u0308"+
		"\7\u0082\2\2\u0308\u0309\5P)\2\u0309O\3\2\2\2\u030a\u030b\7\u008a\2\2"+
		"\u030b\u030c\5T+\2\u030c\u030d\7\u008b\2\2\u030dQ\3\2\2\2\u030e\u0313"+
		"\5V,\2\u030f\u0313\5X-\2\u0310\u0313\5Z.\2\u0311\u0313\5\\/\2\u0312\u030e"+
		"\3\2\2\2\u0312\u030f\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313"+
		"S\3\2\2\2\u0314\u0316\5R*\2\u0315\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318U\3\2\2\2\u0319\u031a\7`\2\2\u031a"+
		"\u031b\5b\62\2\u031b\u031c\5\u0112\u008a\2\u031cW\3\2\2\2\u031d\u031e"+
		"\7`\2\2\u031e\u031f\5b\62\2\u031f\u0321\5\u013c\u009f\2\u0320\u0322\5"+
		"\u009aN\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322Y\3\2\2\2\u0323"+
		"\u0324\7`\2\2\u0324\u0325\5b\62\2\u0325\u0327\5\u013e\u00a0\2\u0326\u0328"+
		"\5\u009cO\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328[\3\2\2\2\u0329"+
		"\u032a\7`\2\2\u032a\u032b\5b\62\2\u032b\u032c\5\u0116\u008c\2\u032c]\3"+
		"\2\2\2\u032d\u032e\7`\2\2\u032e\u032f\5\22\n\2\u032f\u0330\5\u00d4k\2"+
		"\u0330_\3\2\2\2\u0331\u0332\7`\2\2\u0332\u0333\5\22\n\2\u0333\u0334\5"+
		"\u00d6l\2\u0334a\3\2\2\2\u0335\u0337\5\u0114\u008b\2\u0336\u0335\3\2\2"+
		"\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5\u0140\u00a1\2"+
		"\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u033d"+
		"\5 \21\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u033f\5f\64\2\u033f\u0340\5\20\t\2\u0340c\3\2\2\2\u0341\u0343\5\u0114"+
		"\u008b\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344"+
		"\u0346\5\u0140\u00a1\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348"+
		"\3\2\2\2\u0347\u0349\5 \21\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\5\22\n\2\u034be\3\2\2\2\u034c\u034d\7\u0083"+
		"\2\2\u034dg\3\2\2\2\u034e\u034f\7?\2\2\u034f\u0350\5j\66\2\u0350i\3\2"+
		"\2\2\u0351\u0352\7\u008a\2\2\u0352\u0353\5p9\2\u0353\u0354\7\u008b\2\2"+
		"\u0354k\3\2\2\2\u0355\u0357\5 \21\2\u0356\u0355\3\2\2\2\u0356\u0357\3"+
		"\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5\22\n\2\u0359\u035a\5n8\2\u035a"+
		"\u035b\5\u0118\u008d\2\u035bm\3\2\2\2\u035c\u035e\5\u012e\u0098\2\u035d"+
		"\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\5\u012a"+
		"\u0096\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362"+
		"\u0364\5\u011a\u008e\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364o"+
		"\3\2\2\2\u0365\u0367\5l\67\2\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369q\3\2\2\2\u036a\u036b\7 \2\2\u036b"+
		"\u036c\5t;\2\u036cs\3\2\2\2\u036d\u036e\7\u008a\2\2\u036e\u036f\5z>\2"+
		"\u036f\u0370\7\u008b\2\2\u0370u\3\2\2\2\u0371\u0373\5 \21\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5\22\n\2"+
		"\u0375\u0376\5x=\2\u0376\u0377\5\u0118\u008d\2\u0377w\3\2\2\2\u0378\u037a"+
		"\5\u012e\u0098\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3"+
		"\2\2\2\u037b\u037d\5\u012a\u0096\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u0380\5\u011a\u008e\2\u037f\u037e\3\2\2"+
		"\2\u037f\u0380\3\2\2\2\u0380y\3\2\2\2\u0381\u0383\5v<\2\u0382\u0381\3"+
		"\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"{\3\2\2\2\u0386\u0387\7J\2\2\u0387\u0388\7\u008a\2\2\u0388\u0389\5\u0080"+
		"A\2\u0389\u038a\7\u008b\2\2\u038a}\3\2\2\2\u038b\u0391\5\u008eH\2\u038c"+
		"\u0391\5\u0090I\2\u038d\u0391\5\u0092J\2\u038e\u0391\5\u0094K\2\u038f"+
		"\u0391\5\u0082B\2\u0390\u038b\3\2\2\2\u0390\u038c\3\2\2\2\u0390\u038d"+
		"\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\177\3\2\2\2\u0392"+
		"\u0394\5~@\2\u0393\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0393\3\2\2"+
		"\2\u0395\u0396\3\2\2\2\u0396\u0081\3\2\2\2\u0397\u039d\5\u0084C\2\u0398"+
		"\u039d\5\u0086D\2\u0399\u039d\5\u0088E\2\u039a\u039d\5\u008aF\2\u039b"+
		"\u039d\5\u008cG\2\u039c\u0397\3\2\2\2\u039c\u0398\3\2\2\2\u039c\u0399"+
		"\3\2\2\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2\2\u039d\u0083\3\2\2\2\u039e"+
		"\u039f\5\u0096L\2\u039f\u03a0\5\32\16\2\u03a0\u0085\3\2\2\2\u03a1\u03a2"+
		"\5\u0096L\2\u03a2\u03a3\5\30\r\2\u03a3\u0087\3\2\2\2\u03a4\u03a5\5\u0096"+
		"L\2\u03a5\u03a6\5\u00b0Y\2\u03a6\u0089\3\2\2\2\u03a7\u03a8\5\u0096L\2"+
		"\u03a8\u03a9\5\u00d8m\2\u03a9\u008b\3\2\2\2\u03aa\u03ab\5\u0096L\2\u03ab"+
		"\u03ac\5\u00dan\2\u03ac\u008d\3\2\2\2\u03ad\u03ae\5\u0096L\2\u03ae\u03af"+
		"\5\u0112\u008a\2\u03af\u008f\3\2\2\2\u03b0\u03b1\5\u0096L\2\u03b1\u03b3"+
		"\5\u013c\u009f\2\u03b2\u03b4\5\u009aN\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u0091\3\2\2\2\u03b5\u03b6\5\u0096L\2\u03b6\u03b8\5\u013e"+
		"\u00a0\2\u03b7\u03b9\5\u009cO\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u0093\3\2\2\2\u03ba\u03bb\5\u0096L\2\u03bb\u03bc\5\u0116\u008c"+
		"\2\u03bc\u0095\3\2\2\2\u03bd\u03bf\5\u0114\u008b\2\u03be\u03bd\3\2\2\2"+
		"\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03c2\5\u0140\u00a1\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\5 "+
		"\21\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c7\5\u0098M\2\u03c7\u03c8\5\20\t\2\u03c8\u0097\3\2\2\2\u03c9\u03ca"+
		"\7\u0083\2\2\u03ca\u0099\3\2\2\2\u03cb\u03cc\7\u0082\2\2\u03cc\u03cd\7"+
		"\u008a\2\2\u03cd\u03ce\5\u00a0Q\2\u03ce\u03cf\7\u008b\2\2\u03cf\u009b"+
		"\3\2\2\2\u03d0\u03d1\7\u0082\2\2\u03d1\u03d2\7\u008a\2\2\u03d2\u03d3\5"+
		"\u00a2R\2\u03d3\u03d4\7\u008b\2\2\u03d4\u009d\3\2\2\2\u03d5\u03d8\5\u00a2"+
		"R\2\u03d6\u03d8\5\u00a6T\2\u03d7\u03d5\3\2\2\2\u03d7\u03d6\3\2\2\2\u03d8"+
		"\u009f\3\2\2\2\u03d9\u03db\5\u009eP\2\u03da\u03d9\3\2\2\2\u03db\u03dc"+
		"\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u00a1\3\2\2\2\u03de"+
		"\u03e0\5 \21\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1\u03e2\5\22\n\2\u03e2\u03e3\7\67\2\2\u03e3\u03e4\5\u00a4S\2"+
		"\u03e4\u03e5\5\u0118\u008d\2\u03e5\u00a3\3\2\2\2\u03e6\u03e8\5\u012a\u0096"+
		"\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03eb"+
		"\5\u011a\u008e\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u00a5\3"+
		"\2\2\2\u03ec\u03ee\5 \21\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f0\5\22\n\2\u03f0\u03f1\7d\2\2\u03f1\u03f2\5\u00a8"+
		"U\2\u03f2\u03f3\5\u0118\u008d\2\u03f3\u00a7\3\2\2\2\u03f4\u03f6\5\u00aa"+
		"V\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7"+
		"\u03f9\5\u012a\u0096\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb"+
		"\3\2\2\2\u03fa\u03fc\5\u011a\u008e\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3"+
		"\2\2\2\u03fc\u00a9\3\2\2\2\u03fd\u03fe\7\u008c\2\2\u03fe\u03ff\5\u00ac"+
		"W\2\u03ff\u0400\7\u008d\2\2\u0400\u00ab\3\2\2\2\u0401\u0404\5\u00aeX\2"+
		"\u0402\u0403\7\u0091\2\2\u0403\u0405\5\u013a\u009e\2\u0404\u0402\3\2\2"+
		"\2\u0404\u0405\3\2\2\2\u0405\u00ad\3\2\2\2\u0406\u0407\7\u0083\2\2\u0407"+
		"\u00af\3\2\2\2\u0408\u040a\7[\2\2\u0409\u040b\5\u0156\u00ac\2\u040a\u0409"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040e\5\34\17\2"+
		"\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u0411"+
		"\5\u00b2Z\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2"+
		"\2\u0412\u0413\5\u00b4[\2\u0413\u00b1\3\2\2\2\u0414\u0415\7\u008a\2\2"+
		"\u0415\u0416\7\u008b\2\2\u0416\u00b3\3\2\2\2\u0417\u0418\7\u008a\2\2\u0418"+
		"\u0419\5\u00b8]\2\u0419\u041a\7\u008b\2\2\u041a\u00b5\3\2\2\2\u041b\u0422"+
		"\5\u00ba^\2\u041c\u0422\5\u00bc_\2\u041d\u0422\5\u00be`\2\u041e\u0422"+
		"\5\u00c0a\2\u041f\u0422\5\u00c2b\2\u0420\u0422\5\u00c4c\2\u0421\u041b"+
		"\3\2\2\2\u0421\u041c\3\2\2\2\u0421\u041d\3\2\2\2\u0421\u041e\3\2\2\2\u0421"+
		"\u041f\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u00b7\3\2\2\2\u0423\u0425\5\u00b6"+
		"\\\2\u0424\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u00b9\3\2\2\2\u0428\u0429\5\u00c6d\2\u0429\u042a"+
		"\7\4\2\2\u042a\u042e\7r\2\2\u042b\u042c\5\u00ccg\2\u042c\u042d\5\u01aa"+
		"\u00d6\2\u042d\u042f\3\2\2\2\u042e\u042b\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u00bb\3\2\2\2\u0430\u0431\5\u00c6d\2\u0431\u0433\7\66\2\2\u0432\u0434"+
		"\5\u0156\u00ac\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\3"+
		"\2\2\2\u0435\u0437\5\u0126\u0094\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2"+
		"\2\2\u0437\u043b\3\2\2\2\u0438\u0439\5\u00ccg\2\u0439\u043a\5\u0118\u008d"+
		"\2\u043a\u043c\3\2\2\2\u043b\u0438\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u00bd"+
		"\3\2\2\2\u043d\u043e\5\u00c6d\2\u043e\u0440\7\177\2\2\u043f\u0441\5\u00ce"+
		"h\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0447\3\2\2\2\u0442"+
		"\u0443\5\u00ccg\2\u0443\u0445\5\u013c\u009f\2\u0444\u0446\5\u009aN\2\u0445"+
		"\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0442\3\2"+
		"\2\2\u0447\u0448\3\2\2\2\u0448\u00bf\3\2\2\2\u0449\u044a\5\u00c6d\2\u044a"+
		"\u044c\7\34\2\2\u044b\u044d\5\u00d0i\2\u044c\u044b\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044d\u0453\3\2\2\2\u044e\u044f\5\u00ccg\2\u044f\u0451\5\u013e"+
		"\u00a0\2\u0450\u0452\5\u009cO\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2"+
		"\2\u0452\u0454\3\2\2\2\u0453\u044e\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u00c1"+
		"\3\2\2\2\u0455\u0456\5\u00c8e\2\u0456\u045a\7?\2\2\u0457\u0458\5\u00cc"+
		"g\2\u0458\u0459\5\u00d4k\2\u0459\u045b\3\2\2\2\u045a\u0457\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u00c3\3\2\2\2\u045c\u045d\5\u00c8e\2\u045d\u0461"+
		"\7 \2\2\u045e\u045f\5\u00ccg\2\u045f\u0460\5\u00d6l\2\u0460\u0462\3\2"+
		"\2\2\u0461\u045e\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u00c5\3\2\2\2\u0463"+
		"\u0465\7`\2\2\u0464\u0466\7\u0095\2\2\u0465\u0464\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0469\5\u0114\u008b\2\u0468\u0467\3"+
		"\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u046c\5\u0140\u00a1"+
		"\2\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\3\2\2\2\u046d\u046f"+
		"\5 \21\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0471\5\u00caf\2\u0471\u0472\5\20\t\2\u0472\u00c7\3\2\2\2\u0473\u0475"+
		"\7`\2\2\u0474\u0476\7\u0095\2\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2"+
		"\2\u0476\u0478\3\2\2\2\u0477\u0479\5\u0114\u008b\2\u0478\u0477\3\2\2\2"+
		"\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u047c\5\u0140\u00a1\2\u047b"+
		"\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d\u047f\5 "+
		"\21\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\5\22\n\2\u0481\u00c9\3\2\2\2\u0482\u0483\7\u0083\2\2\u0483\u00cb"+
		"\3\2\2\2\u0484\u0485\7\36\2\2\u0485\u0486\7\u00a6\2\2\u0486\u00cd\3\2"+
		"\2\2\u0487\u0488\7\u008a\2\2\u0488\u048b\5\u00d2j\2\u0489\u048a\7\u0093"+
		"\2\2\u048a\u048c\5\u00d2j\2\u048b\u0489\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\u0093"+
		"\2\2\u0490\u0491\7\u008b\2\2\u0491\u00cf\3\2\2\2\u0492\u0493\7\u008a\2"+
		"\2\u0493\u0494\7\67\2\2\u0494\u0495\7\u008b\2\2\u0495\u00d1\3\2\2\2\u0496"+
		"\u0497\t\3\2\2\u0497\u00d3\3\2\2\2\u0498\u0499\7?\2\2\u0499\u049a\5n8"+
		"\2\u049a\u049b\5\u0150\u00a9\2\u049b\u00d5\3\2\2\2\u049c\u049d\7 \2\2"+
		"\u049d\u049e\5x=\2\u049e\u049f\5\u0150\u00a9\2\u049f\u00d7\3\2\2\2\u04a0"+
		"\u04a2\7y\2\2\u04a1\u04a3\5\u0156\u00ac\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3"+
		"\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a6\5\34\17\2\u04a5\u04a4\3\2\2\2"+
		"\u04a5\u04a6\3\2\2\2\u04a6\u00d9\3\2\2\2\u04a7\u04a9\7&\2\2\u04a8\u04aa"+
		"\5\u0156\u00ac\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3"+
		"\2\2\2\u04ab\u04ad\5\34\17\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"\u04af\3\2\2\2\u04ae\u04b0\5\"\22\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3"+
		"\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04b3\5h\65\2\u04b2\u04b1\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04b6\5r:\2\u04b5\u04b4\3\2\2"+
		"\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b9\5|?\2\u04b8\u04b7"+
		"\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\5\u00dco"+
		"\2\u04bb\u00db\3\2\2\2\u04bc\u04bd\7\u008a\2\2\u04bd\u04c0\5\u00dep\2"+
		"\u04be\u04bf\7\u0093\2\2\u04bf\u04c1\5\u00dep\2\u04c0\u04be\3\2\2\2\u04c1"+
		"\u04c2\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\3\2"+
		"\2\2\u04c4\u04c6\7\u0093\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c8\7\u008b\2\2\u04c8\u00dd\3\2\2\2\u04c9\u04cf"+
		"\5\u00e0q\2\u04ca\u04cf\5\u0090I\2\u04cb\u04cf\5\u0092J\2\u04cc\u04cf"+
		"\5\u0094K\2\u04cd\u04cf\5\u0082B\2\u04ce\u04c9\3\2\2\2\u04ce\u04ca\3\2"+
		"\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cd\3\2\2\2\u04cf"+
		"\u00df\3\2\2\2\u04d0\u04d2\5\u00ecw\2\u04d1\u04d3\5\u00e2r\2\u04d2\u04d1"+
		"\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d5\3\2\2\2\u04d4\u04d6\5\u00eav"+
		"\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u00e1\3\2\2\2\u04d7\u04d8"+
		"\7\u0091\2\2\u04d8\u04da\7\u008c\2\2\u04d9\u04db\5\u00e4s\2\u04da\u04d9"+
		"\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\7\u008d\2"+
		"\2\u04dd\u00e3\3\2\2\2\u04de\u04e3\5\u00e6t\2\u04df\u04e0\7\u0093\2\2"+
		"\u04e0\u04e2\5\u00e6t\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3"+
		"\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00e5\3\2\2\2\u04e5\u04e3\3\2"+
		"\2\2\u04e6\u04e8\5\u0156\u00ac\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2"+
		"\2\u04e8\u04e9\3\2\2\2\u04e9\u04ec\5\u00e8u\2\u04ea\u04eb\7\u0091\2\2"+
		"\u04eb\u04ed\5\u013a\u009e\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ef\3\2\2\2\u04ee\u04f0\5\u0138\u009d\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0"+
		"\3\2\2\2\u04f0\u00e7\3\2\2\2\u04f1\u04f2\7\u0083\2\2\u04f2\u00e9\3\2\2"+
		"\2\u04f3\u04f4\7\u00a6\2\2\u04f4\u04f5\5\u0192\u00ca\2\u04f5\u00eb\3\2"+
		"\2\2\u04f6\u04f7\7\u0083\2\2\u04f7\u00ed\3\2\2\2\u04f8\u04f9\5\u00f0y"+
		"\2\u04f9\u00ef\3\2\2\2\u04fa\u04fc\7;\2\2\u04fb\u04fd\5\u00fc\177\2\u04fc"+
		"\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u0500\5\u0156"+
		"\u00ac\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0502\5\u00f4{\2\u0502\u00f1\3\2\2\2\u0503\u0505\7;\2\2\u0504\u0506\5"+
		"\u00fc\177\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3\2\2"+
		"\2\u0507\u0509\5\u0156\u00ac\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2"+
		"\u0509\u050a\3\2\2\2\u050a\u050b\5\u00f4{\2\u050b\u00f3\3\2\2\2\u050c"+
		"\u0516\5\u00f6|\2\u050d\u050f\7\u008a\2\2\u050e\u0510\5\u00f6|\2\u050f"+
		"\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2"+
		"\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7\u008b\2\2\u0514\u0516\3\2\2\2\u0515"+
		"\u050c\3\2\2\2\u0515\u050d\3\2\2\2\u0516\u00f5\3\2\2\2\u0517\u051a\5\u00f8"+
		"}\2\u0518\u0519\7\u0090\2\2\u0519\u051b\5\u00f8}\2\u051a\u0518\3\2\2\2"+
		"\u051b\u051c\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0520"+
		"\3\2\2\2\u051e\u051f\7\u0090\2\2\u051f\u0521\7\u009e\2\2\u0520\u051e\3"+
		"\2\2\2\u0520\u0521\3\2\2\2\u0521\u00f7\3\2\2\2\u0522\u0525\7\u0083\2\2"+
		"\u0523\u0525\5\u00fa~\2\u0524\u0522\3\2\2\2\u0524\u0523\3\2\2\2\u0525"+
		"\u00f9\3\2\2\2\u0526\u0527\7\u008a\2\2\u0527\u052a\5\u00f8}\2\u0528\u0529"+
		"\7\u0093\2\2\u0529\u052b\5\u00f8}\2\u052a\u0528\3\2\2\2\u052b\u052c\3"+
		"\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e"+
		"\u0530\7\u0093\2\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531"+
		"\3\2\2\2\u0531\u0532\7\u008b\2\2\u0532\u00fb\3\2\2\2\u0533\u0534\t\4\2"+
		"\2\u0534\u00fd\3\2\2\2\u0535\u0537\7Z\2\2\u0536\u0538\5\u0156\u00ac\2"+
		"\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a"+
		"\5\u0100\u0081\2\u053a\u00ff\3\2\2\2\u053b\u0541\7l\2\2\u053c\u053d\7"+
		"\u008a\2\2\u053d\u053e\5\u0104\u0083\2\u053e\u053f\7\u008b\2\2\u053f\u0541"+
		"\3\2\2\2\u0540\u053b\3\2\2\2\u0540\u053c\3\2\2\2\u0541\u0101\3\2\2\2\u0542"+
		"\u0543\5\u01de\u00f0\2\u0543\u0103\3\2\2\2\u0544\u0546\5\u0102\u0082\2"+
		"\u0545\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548"+
		"\3\2\2\2\u0548\u0105\3\2\2\2\u0549\u054b\7X\2\2\u054a\u054c\5\u0156\u00ac"+
		"\2\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e"+
		"\5\u0108\u0085\2\u054e\u0107\3\2\2\2\u054f\u0555\7l\2\2\u0550\u0551\7"+
		"\u008a\2\2\u0551\u0552\5\u010c\u0087\2\u0552\u0553\7\u008b\2\2\u0553\u0555"+
		"\3\2\2\2\u0554\u054f\3\2\2\2\u0554\u0550\3\2\2\2\u0555\u0109\3\2\2\2\u0556"+
		"\u0557\5\u01de\u00f0\2\u0557\u010b\3\2\2\2\u0558\u055a\5\u010a\u0086\2"+
		"\u0559\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u010d\3\2\2\2\u055d\u055f\7K\2\2\u055e\u0560\5\u0156\u00ac"+
		"\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0567\3\2\2\2\u0561\u0563"+
		"\7K\2\2\u0562\u0564\5\u0156\u00ac\2\u0563\u0562\3\2\2\2\u0563\u0564\3"+
		"\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\5\u014e\u00a8\2\u0566\u055d\3\2"+
		"\2\2\u0566\u0561\3\2\2\2\u0567\u010f\3\2\2\2\u0568\u056a\7M\2\2\u0569"+
		"\u056b\5\u0156\u00ac\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c"+
		"\3\2\2\2\u056c\u056d\5\u014e\u00a8\2\u056d\u0111\3\2\2\2\u056e\u056f\7"+
		"\4\2\2\u056f\u0570\7r\2\2\u0570\u0571\5\u01aa\u00d6\2\u0571\u0113\3\2"+
		"\2\2\u0572\u0573\t\5\2\2\u0573\u0115\3\2\2\2\u0574\u0576\7\66\2\2\u0575"+
		"\u0577\5\u0156\u00ac\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579"+
		"\3\2\2\2\u0578\u057a\5\u0126\u0094\2\u0579\u0578\3\2\2\2\u0579\u057a\3"+
		"\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\5\u0118\u008d\2\u057c\u0117\3\2"+
		"\2\2\u057d\u0580\5\u0150\u00a9\2\u057e\u0580\5\u0192\u00ca\2\u057f\u057d"+
		"\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u0119\3\2\2\2\u0581\u0582\7`\2\2\u0582"+
		"\u0584\7\u008a\2\2\u0583\u0585\5\u011c\u008f\2\u0584\u0583\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2"+
		"\2\2\u0588\u0589\7\u008b\2\2\u0589\u058d\3\2\2\2\u058a\u058b\7`\2\2\u058b"+
		"\u058d\5\u011c\u008f\2\u058c\u0581\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u011b"+
		"\3\2\2\2\u058e\u0591\5\u011e\u0090\2\u058f\u0591\5\u0120\u0091\2\u0590"+
		"\u058e\3\2\2\2\u0590\u058f\3\2\2\2\u0591\u011d\3\2\2\2\u0592\u0593\7\'"+
		"\2\2\u0593\u0596\5\u0192\u00ca\2\u0594\u0595\7\u0082\2\2\u0595\u0597\5"+
		"\u0192\u00ca\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u011f\3\2"+
		"\2\2\u0598\u0599\7%\2\2\u0599\u059a\7\u0082\2\2\u059a\u059b\5\u0122\u0092"+
		"\2\u059b\u059c\5\20\t\2\u059c\u059d\7b\2\2\u059d\u059e\3\2\2\2\u059e\u05a1"+
		"\5\u0192\u00ca\2\u059f\u05a0\7\u0082\2\2\u05a0\u05a2\5\u0192\u00ca\2\u05a1"+
		"\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u0121\3\2\2\2\u05a3\u05a4\7\u0083"+
		"\2\2\u05a4\u0123\3\2\2\2\u05a5\u05a6\7\u0083\2\2\u05a6\u0125\3\2\2\2\u05a7"+
		"\u05a8\5\u012e\u0098\2\u05a8\u05aa\5\u012c\u0097\2\u05a9\u05ab\5\u012a"+
		"\u0096\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac"+
		"\u05ae\5\u011a\u008e\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u0127"+
		"\3\2\2\2\u05af\u05b0\t\6\2\2\u05b0\u0129\3\2\2\2\u05b1\u05b3\5\u0128\u0095"+
		"\2\u05b2\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5"+
		"\3\2\2\2\u05b5\u012b\3\2\2\2\u05b6\u05b8\7\u00d3\2\2\u05b7\u05b9\5\u0156"+
		"\u00ac\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05bb\5\u01aa\u00d6\2\u05bb\u012d\3\2\2\2\u05bc\u05be\7\u008c\2\2\u05bd"+
		"\u05bf\5\u0130\u0099\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c1\7\u008d\2\2\u05c1\u012f\3\2\2\2\u05c2\u05c7\5\u0132"+
		"\u009a\2\u05c3\u05c4\7\u0093\2\2\u05c4\u05c6\5\u0132\u009a\2\u05c5\u05c3"+
		"\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u0131\3\2\2\2\u05c9\u05c7\3\2\2\2\u05ca\u05cc\5\u0156\u00ac\2\u05cb\u05ca"+
		"\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cf\5\u0134\u009b"+
		"\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d3"+
		"\5\u0136\u009c\2\u05d1\u05d2\7\u0091\2\2\u05d2\u05d4\5\u013a\u009e\2\u05d3"+
		"\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d7\5\u0138"+
		"\u009d\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u0133\3\2\2\2\u05d8"+
		"\u05d9\7\u0083\2\2\u05d9\u0135\3\2\2\2\u05da\u05db\7\u0083\2\2\u05db\u0137"+
		"\3\2\2\2\u05dc\u05dd\7\u00a6\2\2\u05dd\u05de\5\u0192\u00ca\2\u05de\u0139"+
		"\3\2\2\2\u05df\u05e1\5\u0156\u00ac\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3"+
		"\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\5\u01aa\u00d6\2\u05e3\u013b\3\2"+
		"\2\2\u05e4\u05e6\7\177\2\2\u05e5\u05e7\5\u0140\u00a1\2\u05e6\u05e5\3\2"+
		"\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\5\u0192\u00ca"+
		"\2\u05e9\u013d\3\2\2\2\u05ea\u05ec\7~\2\2\u05eb\u05ed\5\u0140\u00a1\2"+
		"\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef"+
		"\5\u0192\u00ca\2\u05ef\u013f\3\2\2\2\u05f0\u05f1\t\7\2\2\u05f1\u0141\3"+
		"\2\2\2\u05f2\u05f4\7\66\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05f6\3\2\2\2\u05f5\u05f7\5\u0144\u00a3\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7"+
		"\3\2\2\2\u05f7\u05f9\3\2\2\2\u05f8\u05fa\5\u0126\u0094\2\u05f9\u05f8\3"+
		"\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\5\u0150\u00a9"+
		"\2\u05fc\u0143\3\2\2\2\u05fd\u05fe\7\u008e\2\2\u05fe\u05ff\5\u0146\u00a4"+
		"\2\u05ff\u0600\7\u008f\2\2\u0600\u0145\3\2\2\2\u0601\u0603\5\u0148\u00a5"+
		"\2\u0602\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0602\3\2\2\2\u0604\u0605"+
		"\3\2\2\2\u0605\u0147\3\2\2\2\u0606\u0607\7\u0083\2\2\u0607\u0149\3\2\2"+
		"\2\u0608\u060a\7\37\2\2\u0609\u060b\5\u014c\u00a7\2\u060a\u0609\3\2\2"+
		"\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\5\u0150\u00a9\2"+
		"\u060d\u014b\3\2\2\2\u060e\u060f\t\b\2\2\u060f\u014d\3\2\2\2\u0610\u0612"+
		"\7\u008a\2\2\u0611\u0613\5\6\4\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u0615\7\u008b\2\2\u0615\u014f\3\2\2\2\u0616"+
		"\u0618\5\u0152\u00aa\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619"+
		"\3\2\2\2\u0619\u061b\7\u008a\2\2\u061a\u061c\5\6\4\2\u061b\u061a\3\2\2"+
		"\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\7\u008b\2\2\u061e"+
		"\u0151\3\2\2\2\u061f\u0620\7\u0083\2\2\u0620\u0621\7\u0091\2\2\u0621\u0153"+
		"\3\2\2\2\u0622\u0623\7\u0094\2\2\u0623\u0624\5\u0158\u00ad\2\u0624\u0155"+
		"\3\2\2\2\u0625\u0627\5\u0154\u00ab\2\u0626\u0625\3\2\2\2\u0627\u0628\3"+
		"\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0157\3\2\2\2\u062a"+
		"\u062b\5\u01de\u00f0\2\u062b\u0159\3\2\2\2\u062c\u062e\5\u015c\u00af\2"+
		"\u062d\u062c\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0632"+
		"\5\u0166\u00b4\2\u0630\u0632\5\u015c\u00af\2\u0631\u062d\3\2\2\2\u0631"+
		"\u0630\3\2\2\2\u0632\u015b\3\2\2\2\u0633\u0635\7\u008c\2\2\u0634\u0636"+
		"\5\u015e\u00b0\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\3"+
		"\2\2\2\u0637\u0638\7\u008d\2\2\u0638\u015d\3\2\2\2\u0639\u063e\5\u0160"+
		"\u00b1\2\u063a\u063b\7\u0093\2\2\u063b\u063d\5\u0160\u00b1\2\u063c\u063a"+
		"\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u015f\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0643\5\u0162\u00b2\2\u0642\u0641"+
		"\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0647\7\u0083\2"+
		"\2\u0645\u0647\5\u0192\u00ca\2\u0646\u0644\3\2\2\2\u0646\u0645\3\2\2\2"+
		"\u0647\u0161\3\2\2\2\u0648\u0649\7\u0083\2\2\u0649\u064a\7\u00a6\2\2\u064a"+
		"\u0163\3\2\2\2\u064b\u064d\5\u0162\u00b2\2\u064c\u064b\3\2\2\2\u064d\u064e"+
		"\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0165\3\2\2\2\u0650"+
		"\u0652\5\u0142\u00a2\2\u0651\u0653\5\u016a\u00b6\2\u0652\u0651\3\2\2\2"+
		"\u0653\u0654\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0167"+
		"\3\2\2\2\u0656\u0657\7\u0083\2\2\u0657\u0658\7\u00a6\2\2\u0658\u0659\5"+
		"\u0142\u00a2\2\u0659\u0169\3\2\2\2\u065a\u065c\5\u0168\u00b5\2\u065b\u065a"+
		"\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e"+
		"\u016b\3\2\2\2\u065f\u0660\t\t\2\2\u0660\u016d\3\2\2\2\u0661\u0662\t\n"+
		"\2\2\u0662\u016f\3\2\2\2\u0663\u0664\t\13\2\2\u0664\u0171\3\2\2\2\u0665"+
		"\u0666\t\f\2\2\u0666\u0173\3\2\2\2\u0667\u0668\t\r\2\2\u0668\u0175\3\2"+
		"\2\2\u0669\u066a\7P\2\2\u066a\u0177\3\2\2\2\u066b\u066c\t\16\2\2\u066c"+
		"\u0179\3\2\2\2\u066d\u066e\t\17\2\2\u066e\u017b\3\2\2\2\u066f\u0670\t"+
		"\20\2\2\u0670\u017d\3\2\2\2\u0671\u0672\t\21\2\2\u0672\u017f\3\2\2\2\u0673"+
		"\u0674\t\22\2\2\u0674\u0181\3\2\2\2\u0675\u0676\7\u00d2\2\2\u0676\u0183"+
		"\3\2\2\2\u0677\u0678\t\23\2\2\u0678\u0185\3\2\2\2\u0679\u067a\7\u00d3"+
		"\2\2\u067a\u0187\3\2\2\2\u067b\u067d\7q\2\2\u067c\u067e\t\23\2\2\u067d"+
		"\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0189\3\2\2\2\u067f\u0685\7F"+
		"\2\2\u0680\u0682\7\7\2\2\u0681\u0683\t\23\2\2\u0682\u0681\3\2\2\2\u0682"+
		"\u0683\3\2\2\2\u0683\u0685\3\2\2\2\u0684\u067f\3\2\2\2\u0684\u0680\3\2"+
		"\2\2\u0685\u018b\3\2\2\2\u0686\u0687\7\f\2\2\u0687\u018d\3\2\2\2\u0688"+
		"\u0689\7\n\2\2\u0689\u018f\3\2\2\2\u068a\u068b\t\24\2\2\u068b\u0191\3"+
		"\2\2\2\u068c\u068d\b\u00ca\1\2\u068d\u068e\7\u008c\2\2\u068e\u068f\5\u0192"+
		"\u00ca\2\u068f\u0690\7\u008d\2\2\u0690\u06db\3\2\2\2\u0691\u06db\5\u01e2"+
		"\u00f2\2\u0692\u0693\7\u0090\2\2\u0693\u06db\7\u0083\2\2\u0694\u0695\5"+
		"\u016e\u00b8\2\u0695\u0696\5\u0192\u00ca-\u0696\u06db\3\2\2\2\u0697\u06db"+
		"\5\u01de\u00f0\2\u0698\u0699\5\u0188\u00c5\2\u0699\u069a\5\u0192\u00ca"+
		")\u069a\u06db\3\2\2\2\u069b\u069c\5\u018e\u00c8\2\u069c\u069d\5\u0192"+
		"\u00ca\'\u069d\u06db\3\2\2\2\u069e\u069f\5\u018c\u00c7\2\u069f\u06a0\5"+
		"\u0192\u00ca&\u06a0\u06db\3\2\2\2\u06a1\u06a2\5\u017a\u00be\2\u06a2\u06a3"+
		"\5\u0192\u00ca#\u06a3\u06db\3\2\2\2\u06a4\u06a5\5\u0176\u00bc\2\u06a5"+
		"\u06a6\5\u0192\u00ca!\u06a6\u06db\3\2\2\2\u06a7\u06db\5\u00f0y\2\u06a8"+
		"\u06db\5\u0142\u00a2\2\u06a9\u06db\5\u0194\u00cb\2\u06aa\u06db\5\u01aa"+
		"\u00d6\2\u06ab\u06db\7{\2\2\u06ac\u06db\7+\2\2\u06ad\u06ae\7n\2\2\u06ae"+
		"\u06db\5\u0192\u00ca\26\u06af\u06b1\7b\2\2\u06b0\u06b2\5\u0192\u00ca\2"+
		"\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06db\3\2\2\2\u06b3\u06b5"+
		"\7\16\2\2\u06b4\u06b6\5\u0152\u00aa\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6"+
		"\3\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b8\7\u0082\2\2\u06b8\u06ba\5\u0192"+
		"\u00ca\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06db\3\2\2\2\u06bb"+
		"\u06bd\7\35\2\2\u06bc\u06be\5\u0152\u00aa\2\u06bd\u06bc\3\2\2\2\u06bd"+
		"\u06be\3\2\2\2\u06be\u06db\3\2\2\2\u06bf\u06c0\7\t\2\2\u06c0\u06c3\5\u0192"+
		"\u00ca\2\u06c1\u06c2\7\u0082\2\2\u06c2\u06c4\5\u0192\u00ca\2\u06c3\u06c1"+
		"\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06db\3\2\2\2\u06c5\u06c6\7\32\2\2"+
		"\u06c6\u06db\5\u0192\u00ca\21\u06c7\u06c8\5\u017e\u00c0\2\u06c8\u06c9"+
		"\5\u0192\u00ca\20\u06c9\u06db\3\2\2\2\u06ca\u06cc\7\u00a2\2\2\u06cb\u06cd"+
		"\5\u0192\u00ca\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06db\3"+
		"\2\2\2\u06ce\u06cf\7|\2\2\u06cf\u06d0\5\b\5\2\u06d0\u06d1\7<\2\2\u06d1"+
		"\u06d2\5\u0192\u00ca\n\u06d2\u06db\3\2\2\2\u06d3\u06d4\7}\2\2\u06d4\u06db"+
		"\5\u0192\u00ca\t\u06d5\u06db\5\26\f\2\u06d6\u06db\5\u019c\u00cf\2\u06d7"+
		"\u06db\5\u019e\u00d0\2\u06d8\u06db\5\u01a0\u00d1\2\u06d9\u06db\5\u01a2"+
		"\u00d2\2\u06da\u068c\3\2\2\2\u06da\u0691\3\2\2\2\u06da\u0692\3\2\2\2\u06da"+
		"\u0694\3\2\2\2\u06da\u0697\3\2\2\2\u06da\u0698\3\2\2\2\u06da\u069b\3\2"+
		"\2\2\u06da\u069e\3\2\2\2\u06da\u06a1\3\2\2\2\u06da\u06a4\3\2\2\2\u06da"+
		"\u06a7\3\2\2\2\u06da\u06a8\3\2\2\2\u06da\u06a9\3\2\2\2\u06da\u06aa\3\2"+
		"\2\2\u06da\u06ab\3\2\2\2\u06da\u06ac\3\2\2\2\u06da\u06ad\3\2\2\2\u06da"+
		"\u06af\3\2\2\2\u06da\u06b3\3\2\2\2\u06da\u06bb\3\2\2\2\u06da\u06bf\3\2"+
		"\2\2\u06da\u06c5\3\2\2\2\u06da\u06c7\3\2\2\2\u06da\u06ca\3\2\2\2\u06da"+
		"\u06ce\3\2\2\2\u06da\u06d3\3\2\2\2\u06da\u06d5\3\2\2\2\u06da\u06d6\3\2"+
		"\2\2\u06da\u06d7\3\2\2\2\u06da\u06d8\3\2\2\2\u06da\u06d9\3\2\2\2\u06db"+
		"\u074a\3\2\2\2\u06dc\u06dd\f\65\2\2\u06dd\u06de\7\u0093\2\2\u06de\u0749"+
		"\5\u0192\u00ca\66\u06df\u06e0\f\60\2\2\u06e0\u06e1\5\u0182\u00c2\2\u06e1"+
		"\u06e2\5\u0192\u00ca\61\u06e2\u0749\3\2\2\2\u06e3\u06e4\f.\2\2\u06e4\u06e5"+
		"\5\u016c\u00b7\2\u06e5\u06e6\5\u0192\u00ca/\u06e6\u0749\3\2\2\2\u06e7"+
		"\u06e8\f+\2\2\u06e8\u06e9\5\u0170\u00b9\2\u06e9\u06ea\5\u0192\u00ca,\u06ea"+
		"\u0749\3\2\2\2\u06eb\u06ec\f*\2\2\u06ec\u06ed\5\u0172\u00ba\2\u06ed\u06ee"+
		"\5\u0192\u00ca+\u06ee\u0749\3\2\2\2\u06ef\u06f0\f%\2\2\u06f0\u06f1\5\u0180"+
		"\u00c1\2\u06f1\u06f2\5\u0192\u00ca&\u06f2\u0749\3\2\2\2\u06f3\u06f4\f"+
		"$\2\2\u06f4\u06f5\5\u0178\u00bd\2\u06f5\u06f6\5\u0192\u00ca%\u06f6\u0749"+
		"\3\2\2\2\u06f7\u06f8\f\"\2\2\u06f8\u06f9\5\u0174\u00bb\2\u06f9\u06fa\5"+
		"\u0192\u00ca#\u06fa\u0749\3\2\2\2\u06fb\u06fc\f\f\2\2\u06fc\u06fd\5\u0190"+
		"\u00c9\2\u06fd\u06fe\5\u0192\u00ca\r\u06fe\u0749\3\2\2\2\u06ff\u0700\f"+
		"\64\2\2\u0700\u0701\7\u0090\2\2\u0701\u0749\7\u0083\2\2\u0702\u0703\f"+
		"\62\2\2\u0703\u0749\5\u015a\u00ae\2\u0704\u0705\f\61\2\2\u0705\u0749\5"+
		"\u0184\u00c3\2\u0706\u0707\f/\2\2\u0707\u0749\5\u015a\u00ae\2\u0708\u0709"+
		"\f(\2\2\u0709\u0715\7\21\2\2\u070a\u070f\5\u01fe\u0100\2\u070b\u070c\7"+
		"\u0093\2\2\u070c\u070e\5\u01fe\u0100\2\u070d\u070b\3\2\2\2\u070e\u0711"+
		"\3\2\2\2\u070f\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0713\3\2\2\2\u0711"+
		"\u070f\3\2\2\2\u0712\u0714\5\u0196\u00cc\2\u0713\u0712\3\2\2\2\u0713\u0714"+
		"\3\2\2\2\u0714\u0716\3\2\2\2\u0715\u070a\3\2\2\2\u0715\u0716\3\2\2\2\u0716"+
		"\u071a\3\2\2\2\u0717\u0718\7k\2\2\u0718\u071b\5\u0192\u00ca\2\u0719\u071b"+
		"\5\u0150\u00a9\2\u071a\u0717\3\2\2\2\u071a\u0719\3\2\2\2\u071b\u0749\3"+
		"\2\2\2\u071c\u071d\f\37\2\2\u071d\u071e\5\u018a\u00c6\2\u071e\u071f\5"+
		"\u01aa\u00d6\2\u071f\u0749\3\2\2\2\u0720\u0721\f\35\2\2\u0721\u0722\7"+
		"\u0090\2\2\u0722\u0749\7?\2\2\u0723\u0724\f\34\2\2\u0724\u0725\7\u0090"+
		"\2\2\u0725\u0749\7 \2\2\u0726\u0727\f\33\2\2\u0727\u0728\7\u0090\2\2\u0728"+
		"\u0749\7c\2\2\u0729\u072a\f\17\2\2\u072a\u0749\7\u00ca\2\2\u072b\u072c"+
		"\f\16\2\2\u072c\u0749\7\u00cb\2\2\u072d\u072e\f\13\2\2\u072e\u072f\7\u0082"+
		"\2\2\u072f\u0731\7\u008a\2\2\u0730\u0732\5\u0192\u00ca\2\u0731\u0730\3"+
		"\2\2\2\u0732\u0733\3\2\2\2\u0733\u0731\3\2\2\2\u0733\u0734\3\2\2\2\u0734"+
		"\u0735\3\2\2\2\u0735\u0736\7\u008b\2\2\u0736\u0749\3\2\2\2\u0737\u0738"+
		"\f\3\2\2\u0738\u0742\7I\2\2\u0739\u0743\5\u01a4\u00d3\2\u073a\u073c\7"+
		"\u008a\2\2\u073b\u073d\5\u01a4\u00d3\2\u073c\u073b\3\2\2\2\u073d\u073e"+
		"\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0740\3\2\2\2\u0740"+
		"\u0741\7\u008b\2\2\u0741\u0743\3\2\2\2\u0742\u0739\3\2\2\2\u0742\u073a"+
		"\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0745\7$\2\2\u0745\u0747\5\u019a\u00ce"+
		"\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\3\2\2\2\u0748\u06dc"+
		"\3\2\2\2\u0748\u06df\3\2\2\2\u0748\u06e3\3\2\2\2\u0748\u06e7\3\2\2\2\u0748"+
		"\u06eb\3\2\2\2\u0748\u06ef\3\2\2\2\u0748\u06f3\3\2\2\2\u0748\u06f7\3\2"+
		"\2\2\u0748\u06fb\3\2\2\2\u0748\u06ff\3\2\2\2\u0748\u0702\3\2\2\2\u0748"+
		"\u0704\3\2\2\2\u0748\u0706\3\2\2\2\u0748\u0708\3\2\2\2\u0748\u071c\3\2"+
		"\2\2\u0748\u0720\3\2\2\2\u0748\u0723\3\2\2\2\u0748\u0726\3\2\2\2\u0748"+
		"\u0729\3\2\2\2\u0748\u072b\3\2\2\2\u0748\u072d\3\2\2\2\u0748\u0737\3\2"+
		"\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
		"\u0193\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074e\5\u0150\u00a9\2\u074e\u0195"+
		"\3\2\2\2\u074f\u0750\7`\2\2\u0750\u0751\5\u0192\u00ca\2\u0751\u0197\3"+
		"\2\2\2\u0752\u0753\7k\2\2\u0753\u0756\5\u0192\u00ca\2\u0754\u0756\5\u0150"+
		"\u00a9\2\u0755\u0752\3\2\2\2\u0755\u0754\3\2\2\2\u0756\u0199\3\2\2\2\u0757"+
		"\u075a\5\u0192\u00ca\2\u0758\u075a\5\u0150\u00a9\2\u0759\u0757\3\2\2\2"+
		"\u0759\u0758\3\2\2\2\u075a\u019b\3\2\2\2\u075b\u075c\79\2\2\u075c\u075d"+
		"\5\u0192\u00ca\2\u075d\u0760\5\u0198\u00cd\2\u075e\u075f\7$\2\2\u075f"+
		"\u0761\5\u019a\u00ce\2\u0760\u075e\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u019d"+
		"\3\2\2\2\u0762\u0763\7\u0081\2\2\u0763\u0764\5\u0192\u00ca\2\u0764\u0767"+
		"\5\u0198\u00cd\2\u0765\u0766\7$\2\2\u0766\u0768\5\u019a\u00ce\2\u0767"+
		"\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u019f\3\2\2\2\u0769\u076a\7a"+
		"\2\2\u076a\u076b\5\u0192\u00ca\2\u076b\u076e\5\u0198\u00cd\2\u076c\u076d"+
		"\7$\2\2\u076d\u076f\5\u019a\u00ce\2\u076e\u076c\3\2\2\2\u076e\u076f\3"+
		"\2\2\2\u076f\u01a1\3\2\2\2\u0770\u0771\7\64\2\2\u0771\u0772\7\u0083\2"+
		"\2\u0772\u0774\7<\2\2\u0773\u0775\5\u0156\u00ac\2\u0774\u0773\3\2\2\2"+
		"\u0774\u0775\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0778\5\u0192\u00ca\2\u0777"+
		"\u0779\5\u0196\u00cc\2\u0778\u0777\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077a"+
		"\3\2\2\2\u077a\u077d\5\u0198\u00cd\2\u077b\u077c\7$\2\2\u077c\u077e\5"+
		"\u019a\u00ce\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u01a3\3\2"+
		"\2\2\u077f\u0780\5\u01a6\u00d4\2\u0780\u0783\7\u0091\2\2\u0781\u0784\5"+
		"\u0192\u00ca\2\u0782\u0784\5\u0150\u00a9\2\u0783\u0781\3\2\2\2\u0783\u0782"+
		"\3\2\2\2\u0784\u01a5\3\2\2\2\u0785\u0787\5\u0156\u00ac\2\u0786\u0785\3"+
		"\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\5\u01a8\u00d5"+
		"\2\u0789\u01a7\3\2\2\2\u078a\u078c\5\u01fe\u0100\2\u078b\u078d\5\u0196"+
		"\u00cc\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u0795\3\2\2\2\u078e"+
		"\u078f\7\u0093\2\2\u078f\u0791\5\u01fe\u0100\2\u0790\u0792\5\u0196\u00cc"+
		"\2\u0791\u0790\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0794\3\2\2\2\u0793\u078e"+
		"\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796"+
		"\u01a9\3\2\2\2\u0797\u0795\3\2\2\2\u0798\u0799\b\u00d6\1\2\u0799\u07f9"+
		"\7\u0083\2\2\u079a\u079b\7\u008d\2\2\u079b\u079c\5\u01aa\u00d6\2\u079c"+
		"\u079d\7\u008c\2\2\u079d\u07f9\3\2\2\2\u079e\u07f9\5\u01de\u00f0\2\u079f"+
		"\u07f9\5\u01ac\u00d7\2\u07a0\u07f9\5\u01b2\u00da\2\u07a1\u07f9\5\u01b6"+
		"\u00dc\2\u07a2\u07f9\5\u01ae\u00d8\2\u07a3\u07f9\5\u01b8\u00dd\2\u07a4"+
		"\u07f9\5\u01ba\u00de\2\u07a5\u07a6\79\2\2\u07a6\u07aa\5\u0192\u00ca\2"+
		"\u07a7\u07a8\7k\2\2\u07a8\u07ab\5\u01aa\u00d6\2\u07a9\u07ab\5\u0150\u00a9"+
		"\2\u07aa\u07a7\3\2\2\2\u07aa\u07a9\3\2\2\2\u07ab\u07b2\3\2\2\2\u07ac\u07b0"+
		"\7$\2\2\u07ad\u07ae\7k\2\2\u07ae\u07b1\5\u01aa\u00d6\2\u07af\u07b1\5\u0150"+
		"\u00a9\2\u07b0\u07ad\3\2\2\2\u07b0\u07af\3\2\2\2\u07b1\u07b3\3\2\2\2\u07b2"+
		"\u07ac\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07f9\3\2\2\2\u07b4\u07b5\7\u0081"+
		"\2\2\u07b5\u07b6\5\u0192\u00ca\2\u07b6\u07b7\7k\2\2\u07b7\u07bd\5\u01aa"+
		"\u00d6\2\u07b8\u07bb\7$\2\2\u07b9\u07bc\5\u01aa\u00d6\2\u07ba\u07bc\5"+
		"\u0150\u00a9\2\u07bb\u07b9\3\2\2\2\u07bb\u07ba\3\2\2\2\u07bc\u07be\3\2"+
		"\2\2\u07bd\u07b8\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07f9\3\2\2\2\u07bf"+
		"\u07c3\7a\2\2\u07c0\u07c1\7k\2\2\u07c1\u07c4\5\u01aa\u00d6\2\u07c2\u07c4"+
		"\5\u0150\u00a9\2\u07c3\u07c0\3\2\2\2\u07c3\u07c2\3\2\2\2\u07c4\u07c5\3"+
		"\2\2\2\u07c5\u07c6\7\u0081\2\2\u07c6\u07cc\5\u0192\u00ca\2\u07c7\u07ca"+
		"\7$\2\2\u07c8\u07cb\5\u01aa\u00d6\2\u07c9\u07cb\5\u0150\u00a9\2\u07ca"+
		"\u07c8\3\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u07cd\3\2\2\2\u07cc\u07c7\3\2"+
		"\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07f9\3\2\2\2\u07ce\u07cf\7\64\2\2\u07cf"+
		"\u07d0\7\u0083\2\2\u07d0\u07d2\7<\2\2\u07d1\u07d3\5\u0156\u00ac\2\u07d2"+
		"\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5\7<"+
		"\2\2\u07d5\u07d9\5\u0192\u00ca\2\u07d6\u07d7\7k\2\2\u07d7\u07da\5\u01aa"+
		"\u00d6\2\u07d8\u07da\5\u0150\u00a9\2\u07d9\u07d6\3\2\2\2\u07d9\u07d8\3"+
		"\2\2\2\u07da\u07e0\3\2\2\2\u07db\u07de\7$\2\2\u07dc\u07df\5\u01aa\u00d6"+
		"\2\u07dd\u07df\5\u0150\u00a9\2\u07de\u07dc\3\2\2\2\u07de\u07dd\3\2\2\2"+
		"\u07df\u07e1\3\2\2\2\u07e0\u07db\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07f9"+
		"\3\2\2\2\u07e2\u07f9\5\u0194\u00cb\2\u07e3\u07f9\7{\2\2\u07e4\u07e5\7"+
		"n\2\2\u07e5\u07f9\5\u0192\u00ca\2\u07e6\u07e8\7b\2\2\u07e7\u07e9\5\u01aa"+
		"\u00d6\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07f9\3\2\2\2\u07ea"+
		"\u07ec\7\16\2\2\u07eb\u07ed\5\u0152\u00aa\2\u07ec\u07eb\3\2\2\2\u07ec"+
		"\u07ed\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ef\7\u0082\2\2\u07ef\u07f1"+
		"\5\u01aa\u00d6\2\u07f0\u07ee\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f9\3"+
		"\2\2\2\u07f2\u07f4\7\35\2\2\u07f3\u07f5\5\u0152\u00aa\2\u07f4\u07f3\3"+
		"\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f9\3\2\2\2\u07f6\u07f7\7\32\2\2\u07f7"+
		"\u07f9\5\u01aa\u00d6\3\u07f8\u0798\3\2\2\2\u07f8\u079a\3\2\2\2\u07f8\u079e"+
		"\3\2\2\2\u07f8\u079f\3\2\2\2\u07f8\u07a0\3\2\2\2\u07f8\u07a1\3\2\2\2\u07f8"+
		"\u07a2\3\2\2\2\u07f8\u07a3\3\2\2\2\u07f8\u07a4\3\2\2\2\u07f8\u07a5\3\2"+
		"\2\2\u07f8\u07b4\3\2\2\2\u07f8\u07bf\3\2\2\2\u07f8\u07ce\3\2\2\2\u07f8"+
		"\u07e2\3\2\2\2\u07f8\u07e3\3\2\2\2\u07f8\u07e4\3\2\2\2\u07f8\u07e6\3\2"+
		"\2\2\u07f8\u07ea\3\2\2\2\u07f8\u07f2\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9"+
		"\u07fe\3\2\2\2\u07fa\u07fb\f\16\2\2\u07fb\u07fd\7\u00c9\2\2\u07fc\u07fa"+
		"\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff"+
		"\u01ab\3\2\2\2\u0800\u07fe\3\2\2\2\u0801\u080d\5\u01b0\u00d9\2\u0802\u080d"+
		"\5\u01c6\u00e4\2\u0803\u080d\5\u01c8\u00e5\2\u0804\u080d\5\u01ca\u00e6"+
		"\2\u0805\u080d\5\u01cc\u00e7\2\u0806\u080d\5\u01ce\u00e8\2\u0807\u080d"+
		"\5\u01d0\u00e9\2\u0808\u080d\5\u01d2\u00ea\2\u0809\u080d\5\u01ce\u00e8"+
		"\2\u080a\u080d\5\u01d4\u00eb\2\u080b\u080d\5\u01d6\u00ec\2\u080c\u0801"+
		"\3\2\2\2\u080c\u0802\3\2\2\2\u080c\u0803\3\2\2\2\u080c\u0804\3\2\2\2\u080c"+
		"\u0805\3\2\2\2\u080c\u0806\3\2\2\2\u080c\u0807\3\2\2\2\u080c\u0808\3\2"+
		"\2\2\u080c\u0809\3\2\2\2\u080c\u080a\3\2\2\2\u080c\u080b\3\2\2\2\u080d"+
		"\u01ad\3\2\2\2\u080e\u0813\5\u01bc\u00df\2\u080f\u0813\5\u01be\u00e0\2"+
		"\u0810\u0813\5\u01c0\u00e1\2\u0811\u0813\5\u01c2\u00e2\2\u0812\u080e\3"+
		"\2\2\2\u0812\u080f\3\2\2\2\u0812\u0810\3\2\2\2\u0812\u0811\3\2\2\2\u0813"+
		"\u01af\3\2\2\2\u0814\u0815\7O\2\2\u0815\u01b1\3\2\2\2\u0816\u0821\7\u008c"+
		"\2\2\u0817\u0818\5\u01b4\u00db\2\u0818\u0819\7\u0093\2\2\u0819\u081b\3"+
		"\2\2\2\u081a\u0817\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u081a\3\2\2\2\u081c"+
		"\u081d\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u0820\5\u01b4\u00db\2\u081f\u081e"+
		"\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0822\3\2\2\2\u0821\u081a\3\2\2\2\u0821"+
		"\u0822\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\7\u008d\2\2\u0824\u01b3"+
		"\3\2\2\2\u0825\u0827\5\u0156\u00ac\2\u0826\u0825\3\2\2\2\u0826\u0827\3"+
		"\2\2\2\u0827\u0828\3\2\2\2\u0828\u0830\5\u01aa\u00d6\2\u0829\u082a\7\u0083"+
		"\2\2\u082a\u082c\7\u0091\2\2\u082b\u082d\5\u0156\u00ac\2\u082c\u082b\3"+
		"\2\2\2\u082c\u082d\3\2\2\2\u082d\u082e\3\2\2\2\u082e\u0830\5\u01aa\u00d6"+
		"\2\u082f\u0826\3\2\2\2\u082f\u0829\3\2\2\2\u0830\u01b5\3\2\2\2\u0831\u0832"+
		"\7\u0095\2\2\u0832\u0833\5\u01aa\u00d6\2\u0833\u01b7\3\2\2\2\u0834\u0835"+
		"\7\6\2\2\u0835\u0836\5\u01aa\u00d6\2\u0836\u01b9\3\2\2\2\u0837\u0838\7"+
		"e\2\2\u0838\u0839\5\u01aa\u00d6\2\u0839\u01bb\3\2\2\2\u083a\u083d\7\u008e"+
		"\2\2\u083b\u083e\5\u0192\u00ca\2\u083c\u083e\7\u0097\2\2\u083d\u083b\3"+
		"\2\2\2\u083d\u083c\3\2\2\2\u083e\u0842\3\2\2\2\u083f\u0840\7\u0093\2\2"+
		"\u0840\u0843\5\u0192\u00ca\2\u0841\u0843\7\u0097\2\2\u0842\u083f\3\2\2"+
		"\2\u0842\u0841\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0842\3\2\2\2\u0844\u0845"+
		"\3\2\2\2\u0845\u0847\3\2\2\2\u0846\u0848\7\u0093\2\2\u0847\u0846\3\2\2"+
		"\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084c\7\u008f\2\2\u084a"+
		"\u084d\5\u01aa\u00d6\2\u084b\u084d\7\u0097\2\2\u084c\u084a\3\2\2\2\u084c"+
		"\u084b\3\2\2\2\u084d\u01bd\3\2\2\2\u084e\u084f\7\u008e\2\2\u084f\u0852"+
		"\7\u008f\2\2\u0850\u0853\5\u01aa\u00d6\2\u0851\u0853\7\u0097\2\2\u0852"+
		"\u0850\3\2\2\2\u0852\u0851\3\2\2\2\u0853\u01bf\3\2\2\2\u0854\u0857\7\u008e"+
		"\2\2\u0855\u0858\5\u01aa\u00d6\2\u0856\u0858\7\u0097\2\2\u0857\u0855\3"+
		"\2\2\2\u0857\u0856\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085c\7\u0091\2\2"+
		"\u085a\u085d\5\u01aa\u00d6\2\u085b\u085d\7\u0097\2\2\u085c\u085a\3\2\2"+
		"\2\u085c\u085b\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\7\u008f\2\2\u085f"+
		"\u01c1\3\2\2\2\u0860\u0863\7\u008e\2\2\u0861\u0864\5\u01aa\u00d6\2\u0862"+
		"\u0864\7\u0097\2\2\u0863\u0861\3\2\2\2\u0863\u0862\3\2\2\2\u0864\u0865"+
		"\3\2\2\2\u0865\u0866\7\u008f\2\2\u0866\u01c3\3\2\2\2\u0867\u0870\5\u01c6"+
		"\u00e4\2\u0868\u0870\5\u01c8\u00e5\2\u0869\u0870\5\u01ca\u00e6\2\u086a"+
		"\u0870\5\u01cc\u00e7\2\u086b\u0870\5\u01ce\u00e8\2\u086c\u0870\5\u01d0"+
		"\u00e9\2\u086d\u0870\5\u01d2\u00ea\2\u086e\u0870\5\u01d4\u00eb\2\u086f"+
		"\u0867\3\2\2\2\u086f\u0868\3\2\2\2\u086f\u0869\3\2\2\2\u086f\u086a\3\2"+
		"\2\2\u086f\u086b\3\2\2\2\u086f\u086c\3\2\2\2\u086f\u086d\3\2\2\2\u086f"+
		"\u086e\3\2\2\2\u0870\u01c5\3\2\2\2\u0871\u0872\t\25\2\2\u0872\u01c7\3"+
		"\2\2\2\u0873\u0874\t\26\2\2\u0874\u01c9\3\2\2\2\u0875\u0876\7\r\2\2\u0876"+
		"\u01cb\3\2\2\2\u0877\u0878\7\17\2\2\u0878\u01cd\3\2\2\2\u0879\u087a\7"+
		"z\2\2\u087a\u01cf\3\2\2\2\u087b\u087c\t\27\2\2\u087c\u01d1\3\2\2\2\u087d"+
		"\u087e\7g\2\2\u087e\u01d3\3\2\2\2\u087f\u0880\t\30\2\2\u0880\u01d5\3\2"+
		"\2\2\u0881\u0882\7r\2\2\u0882\u01d7\3\2\2\2\u0883\u0884\7\u008c\2\2\u0884"+
		"\u088c\7\u008d\2\2\u0885\u0886\7\u008c\2\2\u0886\u0887\5\u01dc\u00ef\2"+
		"\u0887\u0888\7\u0093\2\2\u0888\u0889\5\u01da\u00ee\2\u0889\u088a\7\u008d"+
		"\2\2\u088a\u088c\3\2\2\2\u088b\u0883\3\2\2\2\u088b\u0885\3\2\2\2\u088c"+
		"\u01d9\3\2\2\2\u088d\u0892\5\u01dc\u00ef\2\u088e\u088f\7\u0093\2\2\u088f"+
		"\u0891\5\u01dc\u00ef\2\u0890\u088e\3\2\2\2\u0891\u0894\3\2\2\2\u0892\u0890"+
		"\3\2\2\2\u0892\u0893\3\2\2\2\u0893\u01db\3\2\2\2\u0894\u0892\3\2\2\2\u0895"+
		"\u0896\7\u0083\2\2\u0896\u0898\7\u00a6\2\2\u0897\u0895\3\2\2\2\u0897\u0898"+
		"\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a\5\u0192\u00ca\2\u089a\u01dd\3"+
		"\2\2\2\u089b\u089c\78\2\2\u089c\u089e\7\u0090\2\2\u089d\u089b\3\2\2\2"+
		"\u089d\u089e\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a4\5\u01e0\u00f1\2\u08a0"+
		"\u08a1\7\u0090\2\2\u08a1\u08a3\5\u01e0\u00f1\2\u08a2\u08a0\3\2\2\2\u08a3"+
		"\u08a6\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u01df\3\2"+
		"\2\2\u08a6\u08a4\3\2\2\2\u08a7\u08a8\t\31\2\2\u08a8\u01e1\3\2\2\2\u08a9"+
		"\u08aa\5\u01e4\u00f3\2\u08aa\u01e3\3\2\2\2\u08ab\u08b3\5\u01e6\u00f4\2"+
		"\u08ac\u08b3\5\u01ec\u00f7\2\u08ad\u08b3\5\u01f6\u00fc\2\u08ae\u08b3\5"+
		"\u01ee\u00f8\2\u08af\u08b3\5\u01f0\u00f9\2\u08b0\u08b3\5\u01f2\u00fa\2"+
		"\u08b1\u08b3\5\u01f4\u00fb\2\u08b2\u08ab\3\2\2\2\u08b2\u08ac\3\2\2\2\u08b2"+
		"\u08ad\3\2\2\2\u08b2\u08ae\3\2\2\2\u08b2\u08af\3\2\2\2\u08b2\u08b0\3\2"+
		"\2\2\u08b2\u08b1\3\2\2\2\u08b3\u01e5\3\2\2\2\u08b4\u08b7\5\u01e8\u00f5"+
		"\2\u08b5\u08b7\5\u01ea\u00f6\2\u08b6\u08b4\3\2\2\2\u08b6\u08b5\3\2\2\2"+
		"\u08b7\u01e7\3\2\2\2\u08b8\u08b9\t\32\2\2\u08b9\u01e9\3\2\2\2\u08ba\u08bb"+
		"\7\u0089\2\2\u08bb\u01eb\3\2\2\2\u08bc\u08bd\t\33\2\2\u08bd\u01ed\3\2"+
		"\2\2\u08be\u08bf\7Q\2\2\u08bf\u01ef\3\2\2\2\u08c0\u08c1\7x\2\2\u08c1\u01f1"+
		"\3\2\2\2\u08c2\u08c3\7\36\2\2\u08c3\u01f3\3\2\2\2\u08c4\u08d0\7\u008a"+
		"\2\2\u08c5\u08ca\5\u0192\u00ca\2\u08c6\u08c7\7\u0093\2\2\u08c7\u08c9\5"+
		"\u0192\u00ca\2\u08c8\u08c6\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8\3\2"+
		"\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08ce\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd"+
		"\u08cf\7\u0093\2\2\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1"+
		"\3\2\2\2\u08d0\u08c5\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2"+
		"\u08d3\7\u008b\2\2\u08d3\u01f5\3\2\2\2\u08d4\u08d8\5\u01f8\u00fd\2\u08d5"+
		"\u08d8\5\u01fc\u00ff\2\u08d6\u08d8\5\u01fa\u00fe\2\u08d7\u08d4\3\2\2\2"+
		"\u08d7\u08d5\3\2\2\2\u08d7\u08d6\3\2\2\2\u08d8\u01f7\3\2\2\2\u08d9\u08db"+
		"\7\u00e1\2\2\u08da\u08dc\7\u00ee\2\2\u08db\u08da\3\2\2\2\u08dc\u08dd\3"+
		"\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df"+
		"\u08e8\7\u00ed\2\2\u08e0\u08e2\7\u00e2\2\2\u08e1\u08e3\7\u00ec\2\2\u08e2"+
		"\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2"+
		"\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\7\u00eb\2\2\u08e7\u08d9\3\2\2\2\u08e7"+
		"\u08e0\3\2\2\2\u08e8\u01f9\3\2\2\2\u08e9\u08ed\7\u00e4\2\2\u08ea\u08ec"+
		"\7\u00e7\2\2\u08eb\u08ea\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed\u08eb\3\2\2"+
		"\2\u08ed\u08ee\3\2\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08fa"+
		"\7\u00e6\2\2\u08f1\u08f5\7\u00e3\2\2\u08f2\u08f4\7\u00ea\2\2\u08f3\u08f2"+
		"\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6"+
		"\u08f8\3\2\2\2\u08f7\u08f5\3\2\2\2\u08f8\u08fa\7\u00e9\2\2\u08f9\u08e9"+
		"\3\2\2\2\u08f9\u08f1\3\2\2\2\u08fa\u01fb\3\2\2\2\u08fb\u0909\7\u00e4\2"+
		"\2\u08fc\u0908\7\u00e7\2\2\u08fd\u0903\7\u00e5\2\2\u08fe\u0904\5\u0192"+
		"\u00ca\2\u08ff\u0900\5\u01dc\u00ef\2\u0900\u0901\7\u0093\2\2\u0901\u0902"+
		"\5\u01da\u00ee\2\u0902\u0904\3\2\2\2\u0903\u08fe\3\2\2\2\u0903\u08ff\3"+
		"\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906\7\u008b\2\2\u0906\u0908\3\2\2\2"+
		"\u0907\u08fc\3\2\2\2\u0907\u08fd\3\2\2\2\u0908\u090b\3\2\2\2\u0909\u0907"+
		"\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090c\3\2\2\2\u090b\u0909\3\2\2\2\u090c"+
		"\u0920\7\u00e6\2\2\u090d\u091b\7\u00e3\2\2\u090e\u091a\7\u00ea\2\2\u090f"+
		"\u0915\7\u00e8\2\2\u0910\u0916\5\u0192\u00ca\2\u0911\u0912\5\u01dc\u00ef"+
		"\2\u0912\u0913\7\u0093\2\2\u0913\u0914\5\u01da\u00ee\2\u0914\u0916\3\2"+
		"\2\2\u0915\u0910\3\2\2\2\u0915\u0911\3\2\2\2\u0916\u0917\3\2\2\2\u0917"+
		"\u0918\7\u008b\2\2\u0918\u091a\3\2\2\2\u0919\u090e\3\2\2\2\u0919\u090f"+
		"\3\2\2\2\u091a\u091d\3\2\2\2\u091b\u0919\3\2\2\2\u091b\u091c\3\2\2\2\u091c"+
		"\u091e\3\2\2\2\u091d\u091b\3\2\2\2\u091e\u0920\7\u00e9\2\2\u091f\u08fb"+
		"\3\2\2\2\u091f\u090d\3\2\2\2\u0920\u01fd\3\2\2\2\u0921\u0922\b\u0100\1"+
		"\2\u0922\u0925\5\u0204\u0103\2\u0923\u0924\7\u0091\2\2\u0924\u0926\5\u013a"+
		"\u009e\2\u0925\u0923\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0938\3\2\2\2\u0927"+
		"\u092a\5\u0206\u0104\2\u0928\u0929\7\u0091\2\2\u0929\u092b\5\u013a\u009e"+
		"\2\u092a\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u0938\3\2\2\2\u092c\u092f"+
		"\5\u0208\u0105\2\u092d\u092e\7\u0091\2\2\u092e\u0930\5\u013a\u009e\2\u092f"+
		"\u092d\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0938\3\2\2\2\u0931\u0938\5\u020a"+
		"\u0106\2\u0932\u0938\5\u020c\u0107\2\u0933\u0938\5\u020e\u0108\2\u0934"+
		"\u0935\7F\2\2\u0935\u0938\5\u01aa\u00d6\2\u0936\u0938\5\u0192\u00ca\2"+
		"\u0937\u0921\3\2\2\2\u0937\u0927\3\2\2\2\u0937\u092c\3\2\2\2\u0937\u0931"+
		"\3\2\2\2\u0937\u0932\3\2\2\2\u0937\u0933\3\2\2\2\u0937\u0934\3\2\2\2\u0937"+
		"\u0936\3\2\2\2\u0938\u093e\3\2\2\2\u0939\u093a\f\4\2\2\u093a\u093b\7\7"+
		"\2\2\u093b\u093d\5\u01aa\u00d6\2\u093c\u0939\3\2\2\2\u093d\u0940\3\2\2"+
		"\2\u093e\u093c\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u01ff\3\2\2\2\u0940\u093e"+
		"\3\2\2\2\u0941\u0946\5\u0202\u0102\2\u0942\u0943\7\u0093\2\2\u0943\u0945"+
		"\5\u0202\u0102\2\u0944\u0942\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0944\3"+
		"\2\2\2\u0946\u0947\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946\3\2\2\2\u0949"+
		"\u094b\7\u0093\2\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u0201"+
		"\3\2\2\2\u094c\u0951\5\u01fe\u0100\2\u094d\u094e\7\u0083\2\2\u094e\u094f"+
		"\7\u0091\2\2\u094f\u0951\5\u01fe\u0100\2\u0950\u094c\3\2\2\2\u0950\u094d"+
		"\3\2\2\2\u0951\u0203\3\2\2\2\u0952\u0953\7\u0097\2\2\u0953\u0205\3\2\2"+
		"\2\u0954\u0955\7\u0083\2\2\u0955\u0207\3\2\2\2\u0956\u0957\7H\2\2\u0957"+
		"\u0958\7\177\2\2\u0958\u095c\5\u01fe\u0100\2\u0959\u095a\7H\2\2\u095a"+
		"\u095c\5\u01fe\u0100\2\u095b\u0956\3\2\2\2\u095b\u0959\3\2\2\2\u095c\u0209"+
		"\3\2\2\2\u095d\u095f\7\u008c\2\2\u095e\u0960\5\u0200\u0101\2\u095f\u095e"+
		"\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u0961\3\2\2\2\u0961\u0962\7\u008d\2"+
		"\2\u0962\u020b\3\2\2\2\u0963\u0965\5\u01aa\u00d6\2\u0964\u0963\3\2\2\2"+
		"\u0964\u0965\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\7\u0090\2\2\u0967"+
		"\u0969\5\u00ecw\2\u0968\u096a\5\u020a\u0106\2\u0969\u0968\3\2\2\2\u0969"+
		"\u096a\3\2\2\2\u096a\u020d\3\2\2\2\u096b\u096c\7\u0083\2\2\u096c\u096d"+
		"\7\u0095\2\2\u096d\u020f\3\2\2\2\u096e\u096f\5\u0192\u00ca\2\u096f\u0211"+
		"\3\2\2\2\u0122\u0213\u021b\u021e\u0221\u0226\u022a\u0232\u0236\u023e\u0241"+
		"\u0248\u024b\u0262\u0266\u0269\u026c\u026f\u0272\u0278\u027b\u027e\u0281"+
		"\u0284\u028f\u0296\u029c\u02a6\u02aa\u02af\u02b9\u02be\u02c8\u02ce\u02dd"+
		"\u02e0\u02e3\u02e9\u02ec\u02ef\u02fd\u0305\u0312\u0317\u0321\u0327\u0336"+
		"\u0339\u033c\u0342\u0345\u0348\u0356\u035d\u0360\u0363\u0368\u0372\u0379"+
		"\u037c\u037f\u0384\u0390\u0395\u039c\u03b3\u03b8\u03be\u03c1\u03c4\u03d7"+
		"\u03dc\u03df\u03e7\u03ea\u03ed\u03f5\u03f8\u03fb\u0404\u040a\u040d\u0410"+
		"\u0421\u0426\u042e\u0433\u0436\u043b\u0440\u0445\u0447\u044c\u0451\u0453"+
		"\u045a\u0461\u0465\u0468\u046b\u046e\u0475\u0478\u047b\u047e\u048d\u04a2"+
		"\u04a5\u04a9\u04ac\u04af\u04b2\u04b5\u04b8\u04c2\u04c5\u04ce\u04d2\u04d5"+
		"\u04da\u04e3\u04e7\u04ec\u04ef\u04fc\u04ff\u0505\u0508\u0511\u0515\u051c"+
		"\u0520\u0524\u052c\u052f\u0537\u0540\u0547\u054b\u0554\u055b\u055f\u0563"+
		"\u0566\u056a\u0576\u0579\u057f\u0586\u058c\u0590\u0596\u05a1\u05aa\u05ad"+
		"\u05b4\u05b8\u05be\u05c7\u05cb\u05ce\u05d3\u05d6\u05e0\u05e6\u05ec\u05f3"+
		"\u05f6\u05f9\u0604\u060a\u0612\u0617\u061b\u0628\u062d\u0631\u0635\u063e"+
		"\u0642\u0646\u064e\u0654\u065d\u067d\u0682\u0684\u06b1\u06b5\u06b9\u06bd"+
		"\u06c3\u06cc\u06da\u070f\u0713\u0715\u071a\u0733\u073e\u0742\u0746\u0748"+
		"\u074a\u0755\u0759\u0760\u0767\u076e\u0774\u0778\u077d\u0783\u0786\u078c"+
		"\u0791\u0795\u07aa\u07b0\u07b2\u07bb\u07bd\u07c3\u07ca\u07cc\u07d2\u07d9"+
		"\u07de\u07e0\u07e8\u07ec\u07f0\u07f4\u07f8\u07fe\u080c\u0812\u081c\u081f"+
		"\u0821\u0826\u082c\u082f\u083d\u0842\u0844\u0847\u084c\u0852\u0857\u085c"+
		"\u0863\u086f\u088b\u0892\u0897\u089d\u08a4\u08b2\u08b6\u08ca\u08ce\u08d0"+
		"\u08d7\u08dd\u08e4\u08e7\u08ed\u08f5\u08f9\u0903\u0907\u0909\u0915\u0919"+
		"\u091b\u091f\u0925\u092a\u092f\u0937\u093e\u0946\u094a\u0950\u095b\u095f"+
		"\u0964\u0969";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}