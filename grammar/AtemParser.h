
// Generated from D:\Repos\atem\grammar\AtemParser.g4 by ANTLR 4.13.0

#pragma once


#include "antlr4-runtime.h"




class  AtemParser : public antlr4::Parser {
public:
  enum {
    KeywordAbstract = 1, KeywordAlias = 2, KeywordAlign = 3, KeywordAnd = 4, 
    KeywordAny = 5, KeywordAs = 6, KeywordAsm = 7, KeywordAssert = 8, KeywordAssume = 9, 
    KeywordAsync = 10, KeywordAt = 11, KeywordAwait = 12, KeywordBool = 13, 
    KeywordBreak = 14, KeywordByte = 15, KeywordCase = 16, KeywordCatch = 17, 
    KeywordChar8 = 18, KeywordChar16 = 19, KeywordChar32 = 20, KeywordClass = 21, 
    KeywordCompileTimeInt = 22, KeywordCompileTimeFloat = 23, KeywordCompileTimeString = 24, 
    KeywordCompileTimeChar = 25, KeywordComptime = 26, KeywordConcept = 27, 
    KeywordConst = 28, KeywordContinue = 29, KeywordDefault = 30, KeywordDefer = 31, 
    KeywordDeinit = 32, KeywordDelete = 33, KeywordDo = 34, KeywordDyn = 35, 
    KeywordElse = 36, KeywordEnsure = 37, KeywordEnum = 38, KeywordExpect = 39, 
    KeywordExtend = 40, KeywordExtern = 41, KeywordFail = 42, KeywordFallthrough = 43, 
    KeywordFalse = 44, KeywordFilePrivate = 45, KeywordFinal = 46, KeywordFloat16 = 47, 
    KeywordFloat32 = 48, KeywordFloat64 = 49, KeywordFloat80 = 50, KeywordFloat128 = 51, 
    KeywordFor = 52, KeywordForeach = 53, KeywordForward = 54, KeywordFunc = 55, 
    KeywordGet = 56, KeywordGlobal = 57, KeywordIf = 58, KeywordImpl = 59, 
    KeywordImport = 60, KeywordIn = 61, KeywordInherit = 62, KeywordInline = 63, 
    KeywordInit = 64, KeywordInt8 = 65, KeywordInt16 = 66, KeywordInt32 = 67, 
    KeywordInt64 = 68, KeywordInt128 = 69, KeywordInternal = 70, KeywordIs = 71, 
    KeywordLazy = 72, KeywordLet = 73, KeywordMatch = 74, KeywordMember = 75, 
    KeywordModule = 76, KeywordMutable = 77, KeywordNamespace = 78, KeywordNew = 79, 
    KeywordNever = 80, KeywordNot = 81, KeywordNull = 82, KeywordOpaque = 83, 
    KeywordOpen = 84, KeywordOperator = 85, KeywordOr = 86, KeywordOuter = 87, 
    KeywordOverride = 88, KeywordPackage = 89, KeywordPrivate = 90, KeywordProject = 91, 
    KeywordProtocol = 92, KeywordPublic = 93, KeywordPure = 94, KeywordRecursive = 95, 
    KeywordReloc = 96, KeywordRequire = 97, KeywordRepeat = 98, KeywordReturn = 99, 
    KeywordSelf = 100, KeywordSet = 101, KeywordSome = 102, KeywordStatic = 103, 
    KeywordString = 104, KeywordStruct = 105, KeywordSuccess = 106, KeywordSuper = 107, 
    KeywordTest = 108, KeywordThen = 109, KeywordThis = 110, KeywordThreadLocal = 111, 
    KeywordThrow = 112, KeywordThrows = 113, KeywordTrue = 114, KeywordTry = 115, 
    KeywordType = 116, KeywordUInt8 = 117, KeywordUInt16 = 118, KeywordUInt32 = 119, 
    KeywordUInt64 = 120, KeywordUInt128 = 121, KeywordUndefined = 122, KeywordUnion = 123, 
    KeywordUnit = 124, KeywordUnreachable = 125, KeywordUse = 126, KeywordUsing = 127, 
    KeywordVal = 128, KeywordVar = 129, KeywordVirtual = 130, KeywordWhile = 131, 
    KeywordWith = 132, Identifier = 133, BinaryLiteral = 134, OctalLiteral = 135, 
    DecimalDigits = 136, DecimalLiteral = 137, HexadecimalLiteral = 138, 
    FloatingPointLiteral = 139, LeftCurly = 140, RightCurly = 141, LeftParenthese = 142, 
    RightParenthese = 143, LeftSquare = 144, RightSquare = 145, Dot = 146, 
    Colon = 147, Semicolon = 148, Comma = 149, At = 150, Question = 151, 
    Bang = 152, Underscore = 153, Add = 154, OverflowingAdd = 155, SaturatingAdd = 156, 
    Sub = 157, OverflowingSub = 158, SaturatingSub = 159, Mul = 160, OverflowingMul = 161, 
    SaturatingMul = 162, Divide = 163, RemainderDivide = 164, Power = 165, 
    OverflowingPower = 166, SaturatingPower = 167, Assign = 168, AddAssign = 169, 
    OverflowingAddAssign = 170, SaturatingAddAssign = 171, SubAssign = 172, 
    OverflowingSubAssign = 173, SaturatingSubAssign = 174, MulAssign = 175, 
    OverflowingMulAssign = 176, SaturatingMulAssign = 177, PowerAssign = 178, 
    OverflowingPowerAssign = 179, SaturatingPowerAssign = 180, DivideAssign = 181, 
    RemainderDivideAssign = 182, BitLeftShiftAssign = 183, SaturatingBitLeftShiftAssign = 184, 
    BitRightShiftAssign = 185, BitAndAssign = 186, BitOrAssign = 187, BitNotAssign = 188, 
    GreaterThan = 189, LessThan = 190, GreaterThanOrEqual = 191, LessThanOrEqual = 192, 
    NotEqual = 193, Equal = 194, ThreeWayComparison = 195, BitNot = 196, 
    BitAnd = 197, BitOr = 198, BitXor = 199, BitLeftShift = 200, SaturatingBitLeftShift = 201, 
    BitRightShift = 202, PointerType = 203, PointerDeref = 204, ObjectAddress = 205, 
    Reflect = 206, Reify = 207, ClosedRange = 208, RightOpenRange = 209, 
    LeftOpenRange = 210, OpenedRange = 211, DefaultUnwrapping = 212, Arrow = 213, 
    PlaceholderPipeline = 214, LeftThreadingPipeline = 215, Builtin = 216, 
    OperatorHeadOther = 217, OperatorFollowingCharacter = 218, Whitespace = 219, 
    Newline = 220, LineComment = 221, InnerLineDocComment = 222, OuterLineDocComment = 223, 
    BlockComment = 224, InnerBlockComment = 225, OuterBlockComment = 226, 
    BlockCommentOrDoc = 227, MultiLineExtendedStringOpen = 228, SingleLineExtendedStringOpen = 229, 
    MultiLineStringOpen = 230, SingleLineStringOpen = 231, InterpolataionSingleLine = 232, 
    SingleLineStringClose = 233, QuotedSingleLineText = 234, InterpolataionMultiLine = 235, 
    MultiLineStringClose = 236, QuotedMultiLineText = 237, SingleLineExtendedStringClose = 238, 
    QuotedSingleLineExtendedText = 239, MultiLineExtendedStringClose = 240, 
    QuotedMultiLineExtendedText = 241, CharLiteralOpen = 242, ValidChar = 243, 
    CharLiteralClose = 244, BuiltinCompileError = 245, BuiltinCompileInfo = 246, 
    BuiltinCompileWarning = 247
  };

  enum {
    RuleProgram = 0, RuleStatement = 1, RuleStatements = 2, RuleDeclaration_statement_or_list = 3, 
    RuleDeclaration_statement_list = 4, RuleDeclaration_statement = 5, RuleDeclarator = 6, 
    RuleDeclare_operator = 7, RuleEmpty_declare_operator = 8, RuleDeclarator_name = 9, 
    RuleDeclaration_expression = 10, RuleTest_declaration = 11, RuleTest_name = 12, 
    RuleStruct_declaration = 13, RuleClass_declaration = 14, RuleExtension_declaration = 15, 
    RuleUdt_parameter_clause = 16, RuleFinal_specifier = 17, RuleMember_specifier = 18, 
    RuleMember_specifiers = 19, RuleExtension_list = 20, RuleExtension_item = 21, 
    RuleInherit_clause = 22, RuleInherit_list = 23, RuleInherit_item = 24, 
    RuleInherit_items = 25, RuleInherit_member_list = 26, RuleInherit_member = 27, 
    RuleInherit_members = 28, RuleInherit_type_override = 29, RuleInherit_variable_override = 30, 
    RuleInherit_constant_override = 31, RuleInherit_function_override = 32, 
    RuleInherit_initializer_override = 33, RuleInherit_deinitializer_override = 34, 
    RuleInherit_declarator = 35, RuleEmpty_inherit_declarator = 36, RuleInherit_name = 37, 
    RuleImpl_clause = 38, RuleImpl_list = 39, RuleImpl_item = 40, RuleImpl_items = 41, 
    RuleImpl_with_clause = 42, RuleImpl_member_list = 43, RuleImpl_member = 44, 
    RuleImpl_members = 45, RuleDefault_clause = 46, RuleAssociated_type_impl = 47, 
    RuleAssociated_variable_impl = 48, RuleAssociated_constant_impl = 49, 
    RuleAssociated_function_impl = 50, RuleAssociated_initializer_impl = 51, 
    RuleAssociated_deinitializer_impl = 52, RuleAssociated_declarator = 53, 
    RuleEmpty_associated_declarator = 54, RuleAssociated_name = 55, RuleInitializer_list = 56, 
    RuleInitializer_member_list = 57, RuleInitializer_member = 58, RuleInitializer_type = 59, 
    RuleInitializer_members = 60, RuleDeinitializer_list = 61, RuleDeinitializer_member_list = 62, 
    RuleDeinitializer_member = 63, RuleDeinitializer_type = 64, RuleDeinitializer_members = 65, 
    RuleMember_list = 66, RuleMember = 67, RuleMembers = 68, RuleMember_nested_type = 69, 
    RuleNested_class = 70, RuleNested_struct = 71, RuleNested_protocol = 72, 
    RuleNested_union = 73, RuleNested_enum = 74, RuleMember_type = 75, RuleMember_variable = 76, 
    RuleMember_constant = 77, RuleMember_function = 78, RuleMember_declarator = 79, 
    RuleMember_name = 80, RuleGetter_and_setter_list = 81, RuleGetter_list = 82, 
    RuleGetter_and_setter_item = 83, RuleGetter_and_setter_items = 84, RuleGetter_declaration = 85, 
    RuleGetter_type = 86, RuleSetter_declaration = 87, RuleSetter_type = 88, 
    RuleSetter_parameter_clause = 89, RuleSetter_parameter = 90, RuleSetter_parameter_name = 91, 
    RuleProtocol_declaration = 92, RuleProtocol_extend_list = 93, RuleProtocol_requirement_list = 94, 
    RuleProtocol_requirement_item = 95, RuleProtocol_requirement_items = 96, 
    RuleProtocol_requirement_type = 97, RuleProtocol_requirement_function = 98, 
    RuleProtocol_requirement_variable = 99, RuleProtocol_requirement_constant = 100, 
    RuleProtocol_requirement_initializer = 101, RuleProtocol_requirement_deinitializer = 102, 
    RuleRequirement_declarator = 103, RuleEmpty_requirement_declarator = 104, 
    RuleRequirement_name = 105, RuleRequirement_default_clause = 106, RuleRequirement_getter_and_setter = 107, 
    RuleRequirement_getter = 108, RuleRequirement_getter_and_setter_item = 109, 
    RuleInitializer_declaration = 110, RuleDeinitializer_declaration = 111, 
    RuleUnion_declaration = 112, RuleEnum_declaration = 113, RuleEnumerator_list = 114, 
    RuleEnumeration_item = 115, RuleEnumerator = 116, RuleEnumerator_associated_value_clause = 117, 
    RuleEnumerator_associated_value_list = 118, RuleEnumerator_associated_value = 119, 
    RuleEnumerator_associated_value_name = 120, RuleEnumerator_representation = 121, 
    RuleEnumerator_name = 122, RuleImport_alias_declaration = 123, RuleImport_expression = 124, 
    RuleImport_statement = 125, RuleImport_path_expression_list = 126, RuleImport_path_expression = 127, 
    RuleImport_path_expression_element = 128, RuleImport_element_list = 129, 
    RuleImport_kind = 130, RuleProject_declaration = 131, RulePackage_declaration = 132, 
    RulePackage_member_list = 133, RulePackage_member = 134, RuleModule_declaration = 135, 
    RuleNamespace_declaration = 136, RuleTypealias_declaration = 137, RuleAccess_level_specifier = 138, 
    RuleFunction_declaration = 139, RuleFunction_body = 140, RuleContract_list = 141, 
    RuleContract = 142, RuleContract_precondition = 143, RuleContract_postcondition = 144, 
    RuleReturn_value_name = 145, RuleFunction_name = 146, RuleFunction_type = 147, 
    RuleFunction_specifier = 148, RuleFunction_specifiers = 149, RuleFunction_result = 150, 
    RuleFunction_parameter_clause = 151, RuleFunction_parameter_list = 152, 
    RuleFunction_parameter = 153, RuleFunction_parameter_label = 154, RuleFunction_parameter_name = 155, 
    RuleDefault_argument_clause = 156, RuleType_annotation = 157, RuleVariable_declaration = 158, 
    RuleConstant_declaration = 159, RuleStorage_level_specifier = 160, RuleClosure_expression = 161, 
    RuleCapture_list = 162, RuleCapture_list_items = 163, RuleCapture_list_item = 164, 
    RuleDefer_statement = 165, RuleDefer_kind = 166, RuleCode_block_no_label = 167, 
    RuleCode_block = 168, RuleCode_block_name = 169, RuleAttribute = 170, 
    RuleAttributes = 171, RuleAttribute_name = 172, RuleFunction_call_operator = 173, 
    RuleFunction_call_argument_clause = 174, RuleFunction_call_argument_list = 175, 
    RuleFunction_call_argument = 176, RuleArgument_name = 177, RuleArgument_names = 178, 
    RuleTrailing_closures = 179, RuleLabeled_trailing_closure = 180, RuleLabeled_trailing_closures = 181, 
    RuleArithmetic_operator = 182, RuleNegation_operator = 183, RuleAssignment_operator = 184, 
    RuleComparison_operator = 185, RuleBinary_boolean_operator = 186, RuleUnary_boolean_operator = 187, 
    RuleBinary_bit_operator = 188, RuleUnary_bit_operator = 189, RulePointer_operator = 190, 
    RuleReflect_operator = 191, RuleRange_operator = 192, RuleBinary_optional_unwrapping_operator = 193, 
    RuleUnary_optional_unwrapping_operator = 194, RuleArrow_operator = 195, 
    RuleTry_operator = 196, RuleType_casting_operator = 197, RuleAwait_operator = 198, 
    RuleAsync_operator = 199, RulePipeline_operator = 200, RuleArray_index_operator = 201, 
    RuleTuple_index_operator = 202, RuleBuiltin_function_operator = 203, 
    RuleBuiltin_function_name = 204, RuleExpression = 205, RuleAggregate_initialization_expression = 206, 
    RuleAggregate_initialization_list = 207, RuleAggregate_initialization_member = 208, 
    RuleCode_block_expression = 209, RuleRequire_clause = 210, RuleThen_expression_or_block = 211, 
    RuleThen_expression_or_then_block = 212, RuleExpression_or_block = 213, 
    RuleThen_type_expression_or_block = 214, RuleType_expression_or_block = 215, 
    RuleIf_expression = 216, RuleWhile_expression = 217, RuleRepeat_while_expression = 218, 
    RuleFor_expression = 219, RuleForeach_expression = 220, RuleMatch_case = 221, 
    RuleMatch_case_label = 222, RuleMatch_item_list = 223, RuleType_expression = 224, 
    RuleBasic_type = 225, RuleCollection_type = 226, RuleNever_type = 227, 
    RuleTuple_type = 228, RuleTuple_type_element = 229, RuleOptional_type = 230, 
    RuleAny_type = 231, RuleSome_type = 232, RuleStatic_array_type = 233, 
    RuleDynamic_array_type = 234, RuleMap_type = 235, RuleSet_type = 236, 
    RuleConst_type = 237, RuleSimple_type = 238, RuleInteger_type = 239, 
    RuleFloating_point_type = 240, RuleBoolean_type = 241, RuleByte_type = 242, 
    RuleUnit_type = 243, RuleCharacter_type = 244, RuleString_type = 245, 
    RuleComptime_type = 246, RuleType_type = 247, RuleTuple_expression = 248, 
    RuleTuple_element_list = 249, RuleTuple_element = 250, RulePath_expression = 251, 
    RulePath_expression_element = 252, RuleLiteral_expression = 253, RuleLiteral = 254, 
    RuleNumeric_literal = 255, RuleInteger_literal = 256, RuleFloating_point_literal = 257, 
    RuleBoolean_literal = 258, RuleNull_literal = 259, RuleUndefined_literal = 260, 
    RuleDefault_literal = 261, RuleArray_literal = 262, RuleString_literal = 263, 
    RuleExtended_string_literal = 264, RuleStatic_string_literal = 265, 
    RuleInterpolated_string_literal = 266, RuleChar_literal = 267, RulePattern = 268, 
    RuleTuple_pattern_element_list = 269, RuleTuple_pattern_element = 270, 
    RuleWildcard_pattern = 271, RuleIdentifier_pattern = 272, RuleValue_binding_pattern = 273, 
    RuleTuple_pattern = 274, RuleEnumerator_pattern = 275, RuleOptional_pattern = 276, 
    RuleExpression_pattern = 277
  };

  explicit AtemParser(antlr4::TokenStream *input);

  AtemParser(antlr4::TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options);

  ~AtemParser() override;

  std::string getGrammarFileName() const override;

  const antlr4::atn::ATN& getATN() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;


  class ProgramContext;
  class StatementContext;
  class StatementsContext;
  class Declaration_statement_or_listContext;
  class Declaration_statement_listContext;
  class Declaration_statementContext;
  class DeclaratorContext;
  class Declare_operatorContext;
  class Empty_declare_operatorContext;
  class Declarator_nameContext;
  class Declaration_expressionContext;
  class Test_declarationContext;
  class Test_nameContext;
  class Struct_declarationContext;
  class Class_declarationContext;
  class Extension_declarationContext;
  class Udt_parameter_clauseContext;
  class Final_specifierContext;
  class Member_specifierContext;
  class Member_specifiersContext;
  class Extension_listContext;
  class Extension_itemContext;
  class Inherit_clauseContext;
  class Inherit_listContext;
  class Inherit_itemContext;
  class Inherit_itemsContext;
  class Inherit_member_listContext;
  class Inherit_memberContext;
  class Inherit_membersContext;
  class Inherit_type_overrideContext;
  class Inherit_variable_overrideContext;
  class Inherit_constant_overrideContext;
  class Inherit_function_overrideContext;
  class Inherit_initializer_overrideContext;
  class Inherit_deinitializer_overrideContext;
  class Inherit_declaratorContext;
  class Empty_inherit_declaratorContext;
  class Inherit_nameContext;
  class Impl_clauseContext;
  class Impl_listContext;
  class Impl_itemContext;
  class Impl_itemsContext;
  class Impl_with_clauseContext;
  class Impl_member_listContext;
  class Impl_memberContext;
  class Impl_membersContext;
  class Default_clauseContext;
  class Associated_type_implContext;
  class Associated_variable_implContext;
  class Associated_constant_implContext;
  class Associated_function_implContext;
  class Associated_initializer_implContext;
  class Associated_deinitializer_implContext;
  class Associated_declaratorContext;
  class Empty_associated_declaratorContext;
  class Associated_nameContext;
  class Initializer_listContext;
  class Initializer_member_listContext;
  class Initializer_memberContext;
  class Initializer_typeContext;
  class Initializer_membersContext;
  class Deinitializer_listContext;
  class Deinitializer_member_listContext;
  class Deinitializer_memberContext;
  class Deinitializer_typeContext;
  class Deinitializer_membersContext;
  class Member_listContext;
  class MemberContext;
  class MembersContext;
  class Member_nested_typeContext;
  class Nested_classContext;
  class Nested_structContext;
  class Nested_protocolContext;
  class Nested_unionContext;
  class Nested_enumContext;
  class Member_typeContext;
  class Member_variableContext;
  class Member_constantContext;
  class Member_functionContext;
  class Member_declaratorContext;
  class Member_nameContext;
  class Getter_and_setter_listContext;
  class Getter_listContext;
  class Getter_and_setter_itemContext;
  class Getter_and_setter_itemsContext;
  class Getter_declarationContext;
  class Getter_typeContext;
  class Setter_declarationContext;
  class Setter_typeContext;
  class Setter_parameter_clauseContext;
  class Setter_parameterContext;
  class Setter_parameter_nameContext;
  class Protocol_declarationContext;
  class Protocol_extend_listContext;
  class Protocol_requirement_listContext;
  class Protocol_requirement_itemContext;
  class Protocol_requirement_itemsContext;
  class Protocol_requirement_typeContext;
  class Protocol_requirement_functionContext;
  class Protocol_requirement_variableContext;
  class Protocol_requirement_constantContext;
  class Protocol_requirement_initializerContext;
  class Protocol_requirement_deinitializerContext;
  class Requirement_declaratorContext;
  class Empty_requirement_declaratorContext;
  class Requirement_nameContext;
  class Requirement_default_clauseContext;
  class Requirement_getter_and_setterContext;
  class Requirement_getterContext;
  class Requirement_getter_and_setter_itemContext;
  class Initializer_declarationContext;
  class Deinitializer_declarationContext;
  class Union_declarationContext;
  class Enum_declarationContext;
  class Enumerator_listContext;
  class Enumeration_itemContext;
  class EnumeratorContext;
  class Enumerator_associated_value_clauseContext;
  class Enumerator_associated_value_listContext;
  class Enumerator_associated_valueContext;
  class Enumerator_associated_value_nameContext;
  class Enumerator_representationContext;
  class Enumerator_nameContext;
  class Import_alias_declarationContext;
  class Import_expressionContext;
  class Import_statementContext;
  class Import_path_expression_listContext;
  class Import_path_expressionContext;
  class Import_path_expression_elementContext;
  class Import_element_listContext;
  class Import_kindContext;
  class Project_declarationContext;
  class Package_declarationContext;
  class Package_member_listContext;
  class Package_memberContext;
  class Module_declarationContext;
  class Namespace_declarationContext;
  class Typealias_declarationContext;
  class Access_level_specifierContext;
  class Function_declarationContext;
  class Function_bodyContext;
  class Contract_listContext;
  class ContractContext;
  class Contract_preconditionContext;
  class Contract_postconditionContext;
  class Return_value_nameContext;
  class Function_nameContext;
  class Function_typeContext;
  class Function_specifierContext;
  class Function_specifiersContext;
  class Function_resultContext;
  class Function_parameter_clauseContext;
  class Function_parameter_listContext;
  class Function_parameterContext;
  class Function_parameter_labelContext;
  class Function_parameter_nameContext;
  class Default_argument_clauseContext;
  class Type_annotationContext;
  class Variable_declarationContext;
  class Constant_declarationContext;
  class Storage_level_specifierContext;
  class Closure_expressionContext;
  class Capture_listContext;
  class Capture_list_itemsContext;
  class Capture_list_itemContext;
  class Defer_statementContext;
  class Defer_kindContext;
  class Code_block_no_labelContext;
  class Code_blockContext;
  class Code_block_nameContext;
  class AttributeContext;
  class AttributesContext;
  class Attribute_nameContext;
  class Function_call_operatorContext;
  class Function_call_argument_clauseContext;
  class Function_call_argument_listContext;
  class Function_call_argumentContext;
  class Argument_nameContext;
  class Argument_namesContext;
  class Trailing_closuresContext;
  class Labeled_trailing_closureContext;
  class Labeled_trailing_closuresContext;
  class Arithmetic_operatorContext;
  class Negation_operatorContext;
  class Assignment_operatorContext;
  class Comparison_operatorContext;
  class Binary_boolean_operatorContext;
  class Unary_boolean_operatorContext;
  class Binary_bit_operatorContext;
  class Unary_bit_operatorContext;
  class Pointer_operatorContext;
  class Reflect_operatorContext;
  class Range_operatorContext;
  class Binary_optional_unwrapping_operatorContext;
  class Unary_optional_unwrapping_operatorContext;
  class Arrow_operatorContext;
  class Try_operatorContext;
  class Type_casting_operatorContext;
  class Await_operatorContext;
  class Async_operatorContext;
  class Pipeline_operatorContext;
  class Array_index_operatorContext;
  class Tuple_index_operatorContext;
  class Builtin_function_operatorContext;
  class Builtin_function_nameContext;
  class ExpressionContext;
  class Aggregate_initialization_expressionContext;
  class Aggregate_initialization_listContext;
  class Aggregate_initialization_memberContext;
  class Code_block_expressionContext;
  class Require_clauseContext;
  class Then_expression_or_blockContext;
  class Then_expression_or_then_blockContext;
  class Expression_or_blockContext;
  class Then_type_expression_or_blockContext;
  class Type_expression_or_blockContext;
  class If_expressionContext;
  class While_expressionContext;
  class Repeat_while_expressionContext;
  class For_expressionContext;
  class Foreach_expressionContext;
  class Match_caseContext;
  class Match_case_labelContext;
  class Match_item_listContext;
  class Type_expressionContext;
  class Basic_typeContext;
  class Collection_typeContext;
  class Never_typeContext;
  class Tuple_typeContext;
  class Tuple_type_elementContext;
  class Optional_typeContext;
  class Any_typeContext;
  class Some_typeContext;
  class Static_array_typeContext;
  class Dynamic_array_typeContext;
  class Map_typeContext;
  class Set_typeContext;
  class Const_typeContext;
  class Simple_typeContext;
  class Integer_typeContext;
  class Floating_point_typeContext;
  class Boolean_typeContext;
  class Byte_typeContext;
  class Unit_typeContext;
  class Character_typeContext;
  class String_typeContext;
  class Comptime_typeContext;
  class Type_typeContext;
  class Tuple_expressionContext;
  class Tuple_element_listContext;
  class Tuple_elementContext;
  class Path_expressionContext;
  class Path_expression_elementContext;
  class Literal_expressionContext;
  class LiteralContext;
  class Numeric_literalContext;
  class Integer_literalContext;
  class Floating_point_literalContext;
  class Boolean_literalContext;
  class Null_literalContext;
  class Undefined_literalContext;
  class Default_literalContext;
  class Array_literalContext;
  class String_literalContext;
  class Extended_string_literalContext;
  class Static_string_literalContext;
  class Interpolated_string_literalContext;
  class Char_literalContext;
  class PatternContext;
  class Tuple_pattern_element_listContext;
  class Tuple_pattern_elementContext;
  class Wildcard_patternContext;
  class Identifier_patternContext;
  class Value_binding_patternContext;
  class Tuple_patternContext;
  class Enumerator_patternContext;
  class Optional_patternContext;
  class Expression_patternContext; 

  class  ProgramContext : public antlr4::ParserRuleContext {
  public:
    ProgramContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    StatementsContext *statements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ProgramContext* program();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Declaration_statementContext *declaration_statement();
    Import_statementContext *import_statement();
    Defer_statementContext *defer_statement();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Semicolon();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  StatementContext* statement();

  class  StatementsContext : public antlr4::ParserRuleContext {
  public:
    StatementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  StatementsContext* statements();

  class  Declaration_statement_or_listContext : public antlr4::ParserRuleContext {
  public:
    Declaration_statement_or_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Declaration_statementContext *declaration_statement();
    Declaration_statement_listContext *declaration_statement_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declaration_statement_or_listContext* declaration_statement_or_list();

  class  Declaration_statement_listContext : public antlr4::ParserRuleContext {
  public:
    Declaration_statement_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    std::vector<Declaration_statementContext *> declaration_statement();
    Declaration_statementContext* declaration_statement(size_t i);
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declaration_statement_listContext* declaration_statement_list();

  class  Declaration_statementContext : public antlr4::ParserRuleContext {
  public:
    Declaration_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    DeclaratorContext *declarator();
    Declaration_expressionContext *declaration_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declaration_statementContext* declaration_statement();

  class  DeclaratorContext : public antlr4::ParserRuleContext {
  public:
    DeclaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Declarator_nameContext *declarator_name();
    Declare_operatorContext *declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  DeclaratorContext* declarator();

  class  Declare_operatorContext : public antlr4::ParserRuleContext {
  public:
    Declare_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Colon();
    antlr4::tree::TerminalNode *Assign();
    Type_expressionContext *type_expression();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declare_operatorContext* declare_operator();

  class  Empty_declare_operatorContext : public antlr4::ParserRuleContext {
  public:
    Empty_declare_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Colon();
    antlr4::tree::TerminalNode *Assign();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Empty_declare_operatorContext* empty_declare_operator();

  class  Declarator_nameContext : public antlr4::ParserRuleContext {
  public:
    Declarator_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Path_expressionContext *path_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declarator_nameContext* declarator_name();

  class  Declaration_expressionContext : public antlr4::ParserRuleContext {
  public:
    Declaration_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Package_declarationContext *package_declaration();
    Project_declarationContext *project_declaration();
    Module_declarationContext *module_declaration();
    Namespace_declarationContext *namespace_declaration();
    Function_declarationContext *function_declaration();
    Variable_declarationContext *variable_declaration();
    Constant_declarationContext *constant_declaration();
    Import_alias_declarationContext *import_alias_declaration();
    Typealias_declarationContext *typealias_declaration();
    Struct_declarationContext *struct_declaration();
    Class_declarationContext *class_declaration();
    Protocol_declarationContext *protocol_declaration();
    Union_declarationContext *union_declaration();
    Enum_declarationContext *enum_declaration();
    Extension_declarationContext *extension_declaration();
    Test_declarationContext *test_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Declaration_expressionContext* declaration_expression();

  class  Test_declarationContext : public antlr4::ParserRuleContext {
  public:
    Test_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordTest();
    Code_block_no_labelContext *code_block_no_label();
    AttributesContext *attributes();
    Test_nameContext *test_name();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Test_declarationContext* test_declaration();

  class  Test_nameContext : public antlr4::ParserRuleContext {
  public:
    Test_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    String_literalContext *string_literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Test_nameContext* test_name();

  class  Struct_declarationContext : public antlr4::ParserRuleContext {
  public:
    Struct_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordStruct();
    Member_listContext *member_list();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Final_specifierContext *final_specifier();
    Extension_listContext *extension_list();
    Initializer_listContext *initializer_list();
    Deinitializer_listContext *deinitializer_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Struct_declarationContext* struct_declaration();

  class  Class_declarationContext : public antlr4::ParserRuleContext {
  public:
    Class_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordClass();
    Member_listContext *member_list();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Final_specifierContext *final_specifier();
    Extension_listContext *extension_list();
    Initializer_listContext *initializer_list();
    Deinitializer_listContext *deinitializer_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Class_declarationContext* class_declaration();

  class  Extension_declarationContext : public antlr4::ParserRuleContext {
  public:
    Extension_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordExtend();
    Path_expressionContext *path_expression();
    antlr4::tree::TerminalNode *KeywordWith();
    Member_listContext *member_list();
    AttributesContext *attributes();
    Extension_listContext *extension_list();
    Initializer_listContext *initializer_list();
    Deinitializer_listContext *deinitializer_list();
    Enumerator_listContext *enumerator_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Extension_declarationContext* extension_declaration();

  class  Udt_parameter_clauseContext : public antlr4::ParserRuleContext {
  public:
    Udt_parameter_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Function_parameter_listContext *function_parameter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Udt_parameter_clauseContext* udt_parameter_clause();

  class  Final_specifierContext : public antlr4::ParserRuleContext {
  public:
    Final_specifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordFinal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Final_specifierContext* final_specifier();

  class  Member_specifierContext : public antlr4::ParserRuleContext {
  public:
    Member_specifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordStatic();
    antlr4::tree::TerminalNode *KeywordMutable();
    antlr4::tree::TerminalNode *KeywordFinal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_specifierContext* member_specifier();

  class  Member_specifiersContext : public antlr4::ParserRuleContext {
  public:
    Member_specifiersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Member_specifierContext *> member_specifier();
    Member_specifierContext* member_specifier(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_specifiersContext* member_specifiers();

  class  Extension_listContext : public antlr4::ParserRuleContext {
  public:
    Extension_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordExtend();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<Extension_itemContext *> extension_item();
    Extension_itemContext* extension_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Extension_listContext* extension_list();

  class  Extension_itemContext : public antlr4::ParserRuleContext {
  public:
    Extension_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Inherit_clauseContext *inherit_clause();
    Impl_clauseContext *impl_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Extension_itemContext* extension_item();

  class  Inherit_clauseContext : public antlr4::ParserRuleContext {
  public:
    Inherit_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordInherit();
    Inherit_listContext *inherit_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_clauseContext* inherit_clause();

  class  Inherit_listContext : public antlr4::ParserRuleContext {
  public:
    Inherit_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Inherit_itemsContext *inherit_items();
    antlr4::tree::TerminalNode *RightCurly();
    Inherit_itemContext *inherit_item();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_listContext* inherit_list();

  class  Inherit_itemContext : public antlr4::ParserRuleContext {
  public:
    Inherit_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Path_expressionContext *path_expression();
    Inherit_member_listContext *inherit_member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_itemContext* inherit_item();

  class  Inherit_itemsContext : public antlr4::ParserRuleContext {
  public:
    Inherit_itemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Inherit_itemContext *> inherit_item();
    Inherit_itemContext* inherit_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_itemsContext* inherit_items();

  class  Inherit_member_listContext : public antlr4::ParserRuleContext {
  public:
    Inherit_member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Inherit_membersContext *inherit_members();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_member_listContext* inherit_member_list();

  class  Inherit_memberContext : public antlr4::ParserRuleContext {
  public:
    Inherit_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Inherit_type_overrideContext *inherit_type_override();
    Inherit_variable_overrideContext *inherit_variable_override();
    Inherit_constant_overrideContext *inherit_constant_override();
    Inherit_function_overrideContext *inherit_function_override();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_memberContext* inherit_member();

  class  Inherit_membersContext : public antlr4::ParserRuleContext {
  public:
    Inherit_membersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Inherit_memberContext *> inherit_member();
    Inherit_memberContext* inherit_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_membersContext* inherit_members();

  class  Inherit_type_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_type_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Inherit_declaratorContext *inherit_declarator();
    Typealias_declarationContext *typealias_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_type_overrideContext* inherit_type_override();

  class  Inherit_variable_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_variable_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Inherit_declaratorContext *inherit_declarator();
    Variable_declarationContext *variable_declaration();
    Getter_and_setter_listContext *getter_and_setter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_variable_overrideContext* inherit_variable_override();

  class  Inherit_constant_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_constant_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Inherit_declaratorContext *inherit_declarator();
    Constant_declarationContext *constant_declaration();
    Getter_listContext *getter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_constant_overrideContext* inherit_constant_override();

  class  Inherit_function_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_function_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Inherit_declaratorContext *inherit_declarator();
    Function_declarationContext *function_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_function_overrideContext* inherit_function_override();

  class  Inherit_initializer_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_initializer_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Empty_inherit_declaratorContext *empty_inherit_declarator();
    Initializer_declarationContext *initializer_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_initializer_overrideContext* inherit_initializer_override();

  class  Inherit_deinitializer_overrideContext : public antlr4::ParserRuleContext {
  public:
    Inherit_deinitializer_overrideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordOverride();
    Empty_inherit_declaratorContext *empty_inherit_declarator();
    Deinitializer_declarationContext *deinitializer_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_deinitializer_overrideContext* inherit_deinitializer_override();

  class  Inherit_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Inherit_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Inherit_nameContext *inherit_name();
    Declare_operatorContext *declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_declaratorContext* inherit_declarator();

  class  Empty_inherit_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Empty_inherit_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Empty_inherit_declaratorContext* empty_inherit_declarator();

  class  Inherit_nameContext : public antlr4::ParserRuleContext {
  public:
    Inherit_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Inherit_nameContext* inherit_name();

  class  Impl_clauseContext : public antlr4::ParserRuleContext {
  public:
    Impl_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordImpl();
    Impl_listContext *impl_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_clauseContext* impl_clause();

  class  Impl_listContext : public antlr4::ParserRuleContext {
  public:
    Impl_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Impl_itemsContext *impl_items();
    antlr4::tree::TerminalNode *RightCurly();
    Impl_itemContext *impl_item();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_listContext* impl_list();

  class  Impl_itemContext : public antlr4::ParserRuleContext {
  public:
    Impl_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Path_expressionContext *path_expression();
    Impl_with_clauseContext *impl_with_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_itemContext* impl_item();

  class  Impl_itemsContext : public antlr4::ParserRuleContext {
  public:
    Impl_itemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Impl_itemContext *> impl_item();
    Impl_itemContext* impl_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_itemsContext* impl_items();

  class  Impl_with_clauseContext : public antlr4::ParserRuleContext {
  public:
    Impl_with_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordWith();
    Impl_member_listContext *impl_member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_with_clauseContext* impl_with_clause();

  class  Impl_member_listContext : public antlr4::ParserRuleContext {
  public:
    Impl_member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Impl_membersContext *impl_members();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_member_listContext* impl_member_list();

  class  Impl_memberContext : public antlr4::ParserRuleContext {
  public:
    Impl_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Associated_type_implContext *associated_type_impl();
    Associated_variable_implContext *associated_variable_impl();
    Associated_constant_implContext *associated_constant_impl();
    Associated_function_implContext *associated_function_impl();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_memberContext* impl_member();

  class  Impl_membersContext : public antlr4::ParserRuleContext {
  public:
    Impl_membersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Impl_memberContext *> impl_member();
    Impl_memberContext* impl_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Impl_membersContext* impl_members();

  class  Default_clauseContext : public antlr4::ParserRuleContext {
  public:
    Default_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Assign();
    Default_literalContext *default_literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Default_clauseContext* default_clause();

  class  Associated_type_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_type_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Associated_declaratorContext *associated_declarator();
    Typealias_declarationContext *typealias_declaration();
    Default_clauseContext *default_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_type_implContext* associated_type_impl();

  class  Associated_variable_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_variable_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Associated_declaratorContext *associated_declarator();
    Variable_declarationContext *variable_declaration();
    Default_clauseContext *default_clause();
    Getter_and_setter_listContext *getter_and_setter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_variable_implContext* associated_variable_impl();

  class  Associated_constant_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_constant_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Associated_declaratorContext *associated_declarator();
    Constant_declarationContext *constant_declaration();
    Default_clauseContext *default_clause();
    Getter_listContext *getter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_constant_implContext* associated_constant_impl();

  class  Associated_function_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_function_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Associated_declaratorContext *associated_declarator();
    Function_declarationContext *function_declaration();
    Default_clauseContext *default_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_function_implContext* associated_function_impl();

  class  Associated_initializer_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_initializer_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Empty_declare_operatorContext *empty_declare_operator();
    Initializer_declarationContext *initializer_declaration();
    Default_clauseContext *default_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_initializer_implContext* associated_initializer_impl();

  class  Associated_deinitializer_implContext : public antlr4::ParserRuleContext {
  public:
    Associated_deinitializer_implContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Empty_declare_operatorContext *empty_declare_operator();
    Deinitializer_declarationContext *deinitializer_declaration();
    Default_clauseContext *default_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_deinitializer_implContext* associated_deinitializer_impl();

  class  Associated_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Associated_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Associated_nameContext *associated_name();
    Declare_operatorContext *declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_declaratorContext* associated_declarator();

  class  Empty_associated_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Empty_associated_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Empty_associated_declaratorContext* empty_associated_declarator();

  class  Associated_nameContext : public antlr4::ParserRuleContext {
  public:
    Associated_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Associated_nameContext* associated_name();

  class  Initializer_listContext : public antlr4::ParserRuleContext {
  public:
    Initializer_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordInit();
    Initializer_member_listContext *initializer_member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_listContext* initializer_list();

  class  Initializer_member_listContext : public antlr4::ParserRuleContext {
  public:
    Initializer_member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Initializer_membersContext *initializer_members();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_member_listContext* initializer_member_list();

  class  Initializer_memberContext : public antlr4::ParserRuleContext {
  public:
    Initializer_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    Initializer_typeContext *initializer_type();
    Function_bodyContext *function_body();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_memberContext* initializer_member();

  class  Initializer_typeContext : public antlr4::ParserRuleContext {
  public:
    Initializer_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Function_parameter_clauseContext *function_parameter_clause();
    Function_specifiersContext *function_specifiers();
    Contract_listContext *contract_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_typeContext* initializer_type();

  class  Initializer_membersContext : public antlr4::ParserRuleContext {
  public:
    Initializer_membersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Initializer_memberContext *> initializer_member();
    Initializer_memberContext* initializer_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_membersContext* initializer_members();

  class  Deinitializer_listContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordDeinit();
    Deinitializer_member_listContext *deinitializer_member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_listContext* deinitializer_list();

  class  Deinitializer_member_listContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    Deinitializer_membersContext *deinitializer_members();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_member_listContext* deinitializer_member_list();

  class  Deinitializer_memberContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    Deinitializer_typeContext *deinitializer_type();
    Function_bodyContext *function_body();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_memberContext* deinitializer_member();

  class  Deinitializer_typeContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Function_parameter_clauseContext *function_parameter_clause();
    Function_specifiersContext *function_specifiers();
    Contract_listContext *contract_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_typeContext* deinitializer_type();

  class  Deinitializer_membersContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_membersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Deinitializer_memberContext *> deinitializer_member();
    Deinitializer_memberContext* deinitializer_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_membersContext* deinitializer_members();

  class  Member_listContext : public antlr4::ParserRuleContext {
  public:
    Member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordMember();
    antlr4::tree::TerminalNode *LeftCurly();
    MembersContext *members();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_listContext* member_list();

  class  MemberContext : public antlr4::ParserRuleContext {
  public:
    MemberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_typeContext *member_type();
    Member_variableContext *member_variable();
    Member_constantContext *member_constant();
    Member_functionContext *member_function();
    Member_nested_typeContext *member_nested_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  MemberContext* member();

  class  MembersContext : public antlr4::ParserRuleContext {
  public:
    MembersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<MemberContext *> member();
    MemberContext* member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  MembersContext* members();

  class  Member_nested_typeContext : public antlr4::ParserRuleContext {
  public:
    Member_nested_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Nested_classContext *nested_class();
    Nested_structContext *nested_struct();
    Nested_protocolContext *nested_protocol();
    Nested_unionContext *nested_union();
    Nested_enumContext *nested_enum();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_nested_typeContext* member_nested_type();

  class  Nested_classContext : public antlr4::ParserRuleContext {
  public:
    Nested_classContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Class_declarationContext *class_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Nested_classContext* nested_class();

  class  Nested_structContext : public antlr4::ParserRuleContext {
  public:
    Nested_structContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Struct_declarationContext *struct_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Nested_structContext* nested_struct();

  class  Nested_protocolContext : public antlr4::ParserRuleContext {
  public:
    Nested_protocolContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Protocol_declarationContext *protocol_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Nested_protocolContext* nested_protocol();

  class  Nested_unionContext : public antlr4::ParserRuleContext {
  public:
    Nested_unionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Union_declarationContext *union_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Nested_unionContext* nested_union();

  class  Nested_enumContext : public antlr4::ParserRuleContext {
  public:
    Nested_enumContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Enum_declarationContext *enum_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Nested_enumContext* nested_enum();

  class  Member_typeContext : public antlr4::ParserRuleContext {
  public:
    Member_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Typealias_declarationContext *typealias_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_typeContext* member_type();

  class  Member_variableContext : public antlr4::ParserRuleContext {
  public:
    Member_variableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Variable_declarationContext *variable_declaration();
    Getter_and_setter_listContext *getter_and_setter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_variableContext* member_variable();

  class  Member_constantContext : public antlr4::ParserRuleContext {
  public:
    Member_constantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Constant_declarationContext *constant_declaration();
    Getter_listContext *getter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_constantContext* member_constant();

  class  Member_functionContext : public antlr4::ParserRuleContext {
  public:
    Member_functionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_declaratorContext *member_declarator();
    Function_declarationContext *function_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_functionContext* member_function();

  class  Member_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Member_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Member_nameContext *member_name();
    Declare_operatorContext *declare_operator();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_declaratorContext* member_declarator();

  class  Member_nameContext : public antlr4::ParserRuleContext {
  public:
    Member_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Member_nameContext* member_name();

  class  Getter_and_setter_listContext : public antlr4::ParserRuleContext {
  public:
    Getter_and_setter_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordWith();
    antlr4::tree::TerminalNode *LeftCurly();
    Getter_and_setter_itemsContext *getter_and_setter_items();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_and_setter_listContext* getter_and_setter_list();

  class  Getter_listContext : public antlr4::ParserRuleContext {
  public:
    Getter_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordWith();
    antlr4::tree::TerminalNode *LeftCurly();
    Getter_declarationContext *getter_declaration();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_listContext* getter_list();

  class  Getter_and_setter_itemContext : public antlr4::ParserRuleContext {
  public:
    Getter_and_setter_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Getter_declarationContext *getter_declaration();
    Setter_declarationContext *setter_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_and_setter_itemContext* getter_and_setter_item();

  class  Getter_and_setter_itemsContext : public antlr4::ParserRuleContext {
  public:
    Getter_and_setter_itemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Getter_and_setter_itemContext *> getter_and_setter_item();
    Getter_and_setter_itemContext* getter_and_setter_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_and_setter_itemsContext* getter_and_setter_items();

  class  Getter_declarationContext : public antlr4::ParserRuleContext {
  public:
    Getter_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    antlr4::tree::TerminalNode *KeywordGet();
    Getter_typeContext *getter_type();
    Function_bodyContext *function_body();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_declarationContext* getter_declaration();

  class  Getter_typeContext : public antlr4::ParserRuleContext {
  public:
    Getter_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Function_specifiersContext *function_specifiers();
    Contract_listContext *contract_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Getter_typeContext* getter_type();

  class  Setter_declarationContext : public antlr4::ParserRuleContext {
  public:
    Setter_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_declare_operatorContext *empty_declare_operator();
    antlr4::tree::TerminalNode *KeywordSet();
    Setter_typeContext *setter_type();
    Function_bodyContext *function_body();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Setter_declarationContext* setter_declaration();

  class  Setter_typeContext : public antlr4::ParserRuleContext {
  public:
    Setter_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Setter_parameter_clauseContext *setter_parameter_clause();
    Function_specifiersContext *function_specifiers();
    Contract_listContext *contract_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Setter_typeContext* setter_type();

  class  Setter_parameter_clauseContext : public antlr4::ParserRuleContext {
  public:
    Setter_parameter_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    Setter_parameterContext *setter_parameter();
    antlr4::tree::TerminalNode *RightParenthese();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Setter_parameter_clauseContext* setter_parameter_clause();

  class  Setter_parameterContext : public antlr4::ParserRuleContext {
  public:
    Setter_parameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Setter_parameter_nameContext *setter_parameter_name();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Setter_parameterContext* setter_parameter();

  class  Setter_parameter_nameContext : public antlr4::ParserRuleContext {
  public:
    Setter_parameter_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Setter_parameter_nameContext* setter_parameter_name();

  class  Protocol_declarationContext : public antlr4::ParserRuleContext {
  public:
    Protocol_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordProtocol();
    Protocol_requirement_listContext *protocol_requirement_list();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Final_specifierContext *final_specifier();
    Protocol_extend_listContext *protocol_extend_list();
    antlr4::tree::TerminalNode *KeywordWith();
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_declarationContext* protocol_declaration();

  class  Protocol_extend_listContext : public antlr4::ParserRuleContext {
  public:
    Protocol_extend_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordExtend();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_extend_listContext* protocol_extend_list();

  class  Protocol_requirement_listContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordMember();
    antlr4::tree::TerminalNode *LeftCurly();
    Protocol_requirement_itemsContext *protocol_requirement_items();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_listContext* protocol_requirement_list();

  class  Protocol_requirement_itemContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Protocol_requirement_typeContext *protocol_requirement_type();
    Protocol_requirement_functionContext *protocol_requirement_function();
    Protocol_requirement_variableContext *protocol_requirement_variable();
    Protocol_requirement_constantContext *protocol_requirement_constant();
    Protocol_requirement_initializerContext *protocol_requirement_initializer();
    Protocol_requirement_deinitializerContext *protocol_requirement_deinitializer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_itemContext* protocol_requirement_item();

  class  Protocol_requirement_itemsContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_itemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Protocol_requirement_itemContext *> protocol_requirement_item();
    Protocol_requirement_itemContext* protocol_requirement_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_itemsContext* protocol_requirement_items();

  class  Protocol_requirement_typeContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Requirement_declaratorContext *requirement_declarator();
    antlr4::tree::TerminalNode *KeywordAlias();
    antlr4::tree::TerminalNode *KeywordType();
    Requirement_default_clauseContext *requirement_default_clause();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_typeContext* protocol_requirement_type();

  class  Protocol_requirement_functionContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_functionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Requirement_declaratorContext *requirement_declarator();
    antlr4::tree::TerminalNode *KeywordFunc();
    AttributesContext *attributes();
    Function_typeContext *function_type();
    Requirement_default_clauseContext *requirement_default_clause();
    Function_bodyContext *function_body();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_functionContext* protocol_requirement_function();

  class  Protocol_requirement_variableContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_variableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Requirement_declaratorContext *requirement_declarator();
    antlr4::tree::TerminalNode *KeywordVar();
    Requirement_getter_and_setterContext *requirement_getter_and_setter();
    Requirement_default_clauseContext *requirement_default_clause();
    Variable_declarationContext *variable_declaration();
    Getter_and_setter_listContext *getter_and_setter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_variableContext* protocol_requirement_variable();

  class  Protocol_requirement_constantContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_constantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Requirement_declaratorContext *requirement_declarator();
    antlr4::tree::TerminalNode *KeywordConst();
    Requirement_getterContext *requirement_getter();
    Requirement_default_clauseContext *requirement_default_clause();
    Constant_declarationContext *constant_declaration();
    Getter_listContext *getter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_constantContext* protocol_requirement_constant();

  class  Protocol_requirement_initializerContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_initializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_requirement_declaratorContext *empty_requirement_declarator();
    antlr4::tree::TerminalNode *KeywordInit();
    Requirement_default_clauseContext *requirement_default_clause();
    Initializer_declarationContext *initializer_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_initializerContext* protocol_requirement_initializer();

  class  Protocol_requirement_deinitializerContext : public antlr4::ParserRuleContext {
  public:
    Protocol_requirement_deinitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Empty_requirement_declaratorContext *empty_requirement_declarator();
    antlr4::tree::TerminalNode *KeywordDeinit();
    Requirement_default_clauseContext *requirement_default_clause();
    Deinitializer_declarationContext *deinitializer_declaration();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Protocol_requirement_deinitializerContext* protocol_requirement_deinitializer();

  class  Requirement_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Requirement_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Requirement_nameContext *requirement_name();
    Declare_operatorContext *declare_operator();
    antlr4::tree::TerminalNode *Question();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_declaratorContext* requirement_declarator();

  class  Empty_requirement_declaratorContext : public antlr4::ParserRuleContext {
  public:
    Empty_requirement_declaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    Empty_declare_operatorContext *empty_declare_operator();
    antlr4::tree::TerminalNode *Question();
    Access_level_specifierContext *access_level_specifier();
    Storage_level_specifierContext *storage_level_specifier();
    Member_specifiersContext *member_specifiers();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Empty_requirement_declaratorContext* empty_requirement_declarator();

  class  Requirement_nameContext : public antlr4::ParserRuleContext {
  public:
    Requirement_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_nameContext* requirement_name();

  class  Requirement_default_clauseContext : public antlr4::ParserRuleContext {
  public:
    Requirement_default_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordDefault();
    antlr4::tree::TerminalNode *Assign();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_default_clauseContext* requirement_default_clause();

  class  Requirement_getter_and_setterContext : public antlr4::ParserRuleContext {
  public:
    Requirement_getter_and_setterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    std::vector<Requirement_getter_and_setter_itemContext *> requirement_getter_and_setter_item();
    Requirement_getter_and_setter_itemContext* requirement_getter_and_setter_item(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_getter_and_setterContext* requirement_getter_and_setter();

  class  Requirement_getterContext : public antlr4::ParserRuleContext {
  public:
    Requirement_getterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *KeywordGet();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_getterContext* requirement_getter();

  class  Requirement_getter_and_setter_itemContext : public antlr4::ParserRuleContext {
  public:
    Requirement_getter_and_setter_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordGet();
    antlr4::tree::TerminalNode *KeywordSet();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Requirement_getter_and_setter_itemContext* requirement_getter_and_setter_item();

  class  Initializer_declarationContext : public antlr4::ParserRuleContext {
  public:
    Initializer_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordInit();
    Initializer_typeContext *initializer_type();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Initializer_declarationContext* initializer_declaration();

  class  Deinitializer_declarationContext : public antlr4::ParserRuleContext {
  public:
    Deinitializer_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordDeinit();
    Deinitializer_typeContext *deinitializer_type();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Deinitializer_declarationContext* deinitializer_declaration();

  class  Union_declarationContext : public antlr4::ParserRuleContext {
  public:
    Union_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordUnion();
    AttributesContext *attributes();
    Final_specifierContext *final_specifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Union_declarationContext* union_declaration();

  class  Enum_declarationContext : public antlr4::ParserRuleContext {
  public:
    Enum_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordEnum();
    Enumerator_listContext *enumerator_list();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Final_specifierContext *final_specifier();
    Extension_listContext *extension_list();
    Initializer_listContext *initializer_list();
    Deinitializer_listContext *deinitializer_list();
    Member_listContext *member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enum_declarationContext* enum_declaration();

  class  Enumerator_listContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    std::vector<Enumeration_itemContext *> enumeration_item();
    Enumeration_itemContext* enumeration_item(size_t i);
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_listContext* enumerator_list();

  class  Enumeration_itemContext : public antlr4::ParserRuleContext {
  public:
    Enumeration_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EnumeratorContext *enumerator();
    Member_variableContext *member_variable();
    Member_constantContext *member_constant();
    Member_functionContext *member_function();
    Member_nested_typeContext *member_nested_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumeration_itemContext* enumeration_item();

  class  EnumeratorContext : public antlr4::ParserRuleContext {
  public:
    EnumeratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Enumerator_nameContext *enumerator_name();
    Enumerator_associated_value_clauseContext *enumerator_associated_value_clause();
    Enumerator_representationContext *enumerator_representation();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  EnumeratorContext* enumerator();

  class  Enumerator_associated_value_clauseContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_associated_value_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Colon();
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Enumerator_associated_value_listContext *enumerator_associated_value_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_associated_value_clauseContext* enumerator_associated_value_clause();

  class  Enumerator_associated_value_listContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_associated_value_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Enumerator_associated_valueContext *> enumerator_associated_value();
    Enumerator_associated_valueContext* enumerator_associated_value(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_associated_value_listContext* enumerator_associated_value_list();

  class  Enumerator_associated_valueContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_associated_valueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Enumerator_associated_value_nameContext *enumerator_associated_value_name();
    AttributesContext *attributes();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();
    Default_argument_clauseContext *default_argument_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_associated_valueContext* enumerator_associated_value();

  class  Enumerator_associated_value_nameContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_associated_value_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_associated_value_nameContext* enumerator_associated_value_name();

  class  Enumerator_representationContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_representationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Assign();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_representationContext* enumerator_representation();

  class  Enumerator_nameContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_nameContext* enumerator_name();

  class  Import_alias_declarationContext : public antlr4::ParserRuleContext {
  public:
    Import_alias_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Import_expressionContext *import_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_alias_declarationContext* import_alias_declaration();

  class  Import_expressionContext : public antlr4::ParserRuleContext {
  public:
    Import_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordImport();
    Import_path_expression_listContext *import_path_expression_list();
    Import_kindContext *import_kind();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_expressionContext* import_expression();

  class  Import_statementContext : public antlr4::ParserRuleContext {
  public:
    Import_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordImport();
    Import_path_expression_listContext *import_path_expression_list();
    Import_kindContext *import_kind();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_statementContext* import_statement();

  class  Import_path_expression_listContext : public antlr4::ParserRuleContext {
  public:
    Import_path_expression_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Import_path_expressionContext *> import_path_expression();
    Import_path_expressionContext* import_path_expression(size_t i);
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_path_expression_listContext* import_path_expression_list();

  class  Import_path_expressionContext : public antlr4::ParserRuleContext {
  public:
    Import_path_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Import_path_expression_elementContext *> import_path_expression_element();
    Import_path_expression_elementContext* import_path_expression_element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Dot();
    antlr4::tree::TerminalNode* Dot(size_t i);
    antlr4::tree::TerminalNode *Mul();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_path_expressionContext* import_path_expression();

  class  Import_path_expression_elementContext : public antlr4::ParserRuleContext {
  public:
    Import_path_expression_elementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    Import_element_listContext *import_element_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_path_expression_elementContext* import_path_expression_element();

  class  Import_element_listContext : public antlr4::ParserRuleContext {
  public:
    Import_element_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    std::vector<Import_path_expression_elementContext *> import_path_expression_element();
    Import_path_expression_elementContext* import_path_expression_element(size_t i);
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_element_listContext* import_element_list();

  class  Import_kindContext : public antlr4::ParserRuleContext {
  public:
    Import_kindContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAlias();
    antlr4::tree::TerminalNode *KeywordStruct();
    antlr4::tree::TerminalNode *KeywordClass();
    antlr4::tree::TerminalNode *KeywordUnion();
    antlr4::tree::TerminalNode *KeywordEnum();
    antlr4::tree::TerminalNode *KeywordProtocol();
    antlr4::tree::TerminalNode *KeywordConst();
    antlr4::tree::TerminalNode *KeywordMutable();
    antlr4::tree::TerminalNode *KeywordFunc();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Import_kindContext* import_kind();

  class  Project_declarationContext : public antlr4::ParserRuleContext {
  public:
    Project_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordProject();
    AttributesContext *attributes();
    Aggregate_initialization_listContext *aggregate_initialization_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Project_declarationContext* project_declaration();

  class  Package_declarationContext : public antlr4::ParserRuleContext {
  public:
    Package_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordPackage();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Package_member_listContext *package_member_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Package_declarationContext* package_declaration();

  class  Package_member_listContext : public antlr4::ParserRuleContext {
  public:
    Package_member_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordMember();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<Package_memberContext *> package_member();
    Package_memberContext* package_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Package_member_listContext* package_member_list();

  class  Package_memberContext : public antlr4::ParserRuleContext {
  public:
    Package_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Path_expressionContext *path_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Package_memberContext* package_member();

  class  Module_declarationContext : public antlr4::ParserRuleContext {
  public:
    Module_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordModule();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();
    Code_block_no_labelContext *code_block_no_label();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Module_declarationContext* module_declaration();

  class  Namespace_declarationContext : public antlr4::ParserRuleContext {
  public:
    Namespace_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordNamespace();
    Code_block_no_labelContext *code_block_no_label();
    Udt_parameter_clauseContext *udt_parameter_clause();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Namespace_declarationContext* namespace_declaration();

  class  Typealias_declarationContext : public antlr4::ParserRuleContext {
  public:
    Typealias_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAlias();
    antlr4::tree::TerminalNode *KeywordType();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Typealias_declarationContext* typealias_declaration();

  class  Access_level_specifierContext : public antlr4::ParserRuleContext {
  public:
    Access_level_specifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordPrivate();
    antlr4::tree::TerminalNode *KeywordFilePrivate();
    antlr4::tree::TerminalNode *KeywordInternal();
    antlr4::tree::TerminalNode *KeywordPublic();
    antlr4::tree::TerminalNode *KeywordOpen();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Access_level_specifierContext* access_level_specifier();

  class  Function_declarationContext : public antlr4::ParserRuleContext {
  public:
    Function_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordFunc();
    Function_bodyContext *function_body();
    AttributesContext *attributes();
    Function_typeContext *function_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_declarationContext* function_declaration();

  class  Function_bodyContext : public antlr4::ParserRuleContext {
  public:
    Function_bodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Code_blockContext *code_block();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_bodyContext* function_body();

  class  Contract_listContext : public antlr4::ParserRuleContext {
  public:
    Contract_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<ContractContext *> contract();
    ContractContext* contract(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Contract_listContext* contract_list();

  class  ContractContext : public antlr4::ParserRuleContext {
  public:
    ContractContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Contract_preconditionContext *contract_precondition();
    Contract_postconditionContext *contract_postcondition();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ContractContext* contract();

  class  Contract_preconditionContext : public antlr4::ParserRuleContext {
  public:
    Contract_preconditionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordExpect();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *KeywordWith();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Contract_preconditionContext* contract_precondition();

  class  Contract_postconditionContext : public antlr4::ParserRuleContext {
  public:
    Contract_postconditionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordEnsure();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> KeywordWith();
    antlr4::tree::TerminalNode* KeywordWith(size_t i);
    Return_value_nameContext *return_value_name();
    Declare_operatorContext *declare_operator();
    antlr4::tree::TerminalNode *KeywordReturn();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Contract_postconditionContext* contract_postcondition();

  class  Return_value_nameContext : public antlr4::ParserRuleContext {
  public:
    Return_value_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Return_value_nameContext* return_value_name();

  class  Function_nameContext : public antlr4::ParserRuleContext {
  public:
    Function_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_nameContext* function_name();

  class  Function_typeContext : public antlr4::ParserRuleContext {
  public:
    Function_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Function_parameter_clauseContext *function_parameter_clause();
    Function_resultContext *function_result();
    Function_specifiersContext *function_specifiers();
    Contract_listContext *contract_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_typeContext* function_type();

  class  Function_specifierContext : public antlr4::ParserRuleContext {
  public:
    Function_specifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRecursive();
    antlr4::tree::TerminalNode *KeywordThrows();
    antlr4::tree::TerminalNode *KeywordPure();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_specifierContext* function_specifier();

  class  Function_specifiersContext : public antlr4::ParserRuleContext {
  public:
    Function_specifiersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Function_specifierContext *> function_specifier();
    Function_specifierContext* function_specifier(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_specifiersContext* function_specifiers();

  class  Function_resultContext : public antlr4::ParserRuleContext {
  public:
    Function_resultContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Arrow();
    Type_expressionContext *type_expression();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_resultContext* function_result();

  class  Function_parameter_clauseContext : public antlr4::ParserRuleContext {
  public:
    Function_parameter_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Function_parameter_listContext *function_parameter_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_parameter_clauseContext* function_parameter_clause();

  class  Function_parameter_listContext : public antlr4::ParserRuleContext {
  public:
    Function_parameter_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Function_parameterContext *> function_parameter();
    Function_parameterContext* function_parameter(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_parameter_listContext* function_parameter_list();

  class  Function_parameterContext : public antlr4::ParserRuleContext {
  public:
    Function_parameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Function_parameter_nameContext *function_parameter_name();
    AttributesContext *attributes();
    Function_parameter_labelContext *function_parameter_label();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();
    Default_argument_clauseContext *default_argument_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_parameterContext* function_parameter();

  class  Function_parameter_labelContext : public antlr4::ParserRuleContext {
  public:
    Function_parameter_labelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_parameter_labelContext* function_parameter_label();

  class  Function_parameter_nameContext : public antlr4::ParserRuleContext {
  public:
    Function_parameter_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_parameter_nameContext* function_parameter_name();

  class  Default_argument_clauseContext : public antlr4::ParserRuleContext {
  public:
    Default_argument_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Assign();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Default_argument_clauseContext* default_argument_clause();

  class  Type_annotationContext : public antlr4::ParserRuleContext {
  public:
    Type_annotationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_expressionContext *type_expression();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_annotationContext* type_annotation();

  class  Variable_declarationContext : public antlr4::ParserRuleContext {
  public:
    Variable_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordVar();
    ExpressionContext *expression();
    Storage_level_specifierContext *storage_level_specifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Variable_declarationContext* variable_declaration();

  class  Constant_declarationContext : public antlr4::ParserRuleContext {
  public:
    Constant_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordVal();
    ExpressionContext *expression();
    Storage_level_specifierContext *storage_level_specifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Constant_declarationContext* constant_declaration();

  class  Storage_level_specifierContext : public antlr4::ParserRuleContext {
  public:
    Storage_level_specifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordGlobal();
    antlr4::tree::TerminalNode *KeywordStatic();
    antlr4::tree::TerminalNode *KeywordThreadLocal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Storage_level_specifierContext* storage_level_specifier();

  class  Closure_expressionContext : public antlr4::ParserRuleContext {
  public:
    Closure_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Code_blockContext *code_block();
    antlr4::tree::TerminalNode *KeywordFunc();
    Capture_listContext *capture_list();
    Function_typeContext *function_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Closure_expressionContext* closure_expression();

  class  Capture_listContext : public antlr4::ParserRuleContext {
  public:
    Capture_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    Capture_list_itemsContext *capture_list_items();
    antlr4::tree::TerminalNode *RightSquare();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Capture_listContext* capture_list();

  class  Capture_list_itemsContext : public antlr4::ParserRuleContext {
  public:
    Capture_list_itemsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Capture_list_itemContext *> capture_list_item();
    Capture_list_itemContext* capture_list_item(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Capture_list_itemsContext* capture_list_items();

  class  Capture_list_itemContext : public antlr4::ParserRuleContext {
  public:
    Capture_list_itemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Capture_list_itemContext* capture_list_item();

  class  Defer_statementContext : public antlr4::ParserRuleContext {
  public:
    Defer_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordDefer();
    Code_blockContext *code_block();
    Defer_kindContext *defer_kind();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Defer_statementContext* defer_statement();

  class  Defer_kindContext : public antlr4::ParserRuleContext {
  public:
    Defer_kindContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordSuccess();
    antlr4::tree::TerminalNode *KeywordFail();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Defer_kindContext* defer_kind();

  class  Code_block_no_labelContext : public antlr4::ParserRuleContext {
  public:
    Code_block_no_labelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    StatementsContext *statements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Code_block_no_labelContext* code_block_no_label();

  class  Code_blockContext : public antlr4::ParserRuleContext {
  public:
    Code_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    Code_block_nameContext *code_block_name();
    StatementsContext *statements();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Code_blockContext* code_block();

  class  Code_block_nameContext : public antlr4::ParserRuleContext {
  public:
    Code_block_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Colon();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Code_block_nameContext* code_block_name();

  class  AttributeContext : public antlr4::ParserRuleContext {
  public:
    AttributeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *At();
    Attribute_nameContext *attribute_name();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  AttributeContext* attribute();

  class  AttributesContext : public antlr4::ParserRuleContext {
  public:
    AttributesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AttributeContext *> attribute();
    AttributeContext* attribute(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  AttributesContext* attributes();

  class  Attribute_nameContext : public antlr4::ParserRuleContext {
  public:
    Attribute_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Path_expressionContext *path_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Attribute_nameContext* attribute_name();

  class  Function_call_operatorContext : public antlr4::ParserRuleContext {
  public:
    Function_call_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Trailing_closuresContext *trailing_closures();
    Function_call_argument_clauseContext *function_call_argument_clause();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_call_operatorContext* function_call_operator();

  class  Function_call_argument_clauseContext : public antlr4::ParserRuleContext {
  public:
    Function_call_argument_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Function_call_argument_listContext *function_call_argument_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_call_argument_clauseContext* function_call_argument_clause();

  class  Function_call_argument_listContext : public antlr4::ParserRuleContext {
  public:
    Function_call_argument_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Function_call_argumentContext *> function_call_argument();
    Function_call_argumentContext* function_call_argument(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_call_argument_listContext* function_call_argument_list();

  class  Function_call_argumentContext : public antlr4::ParserRuleContext {
  public:
    Function_call_argumentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    ExpressionContext *expression();
    Argument_nameContext *argument_name();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Function_call_argumentContext* function_call_argument();

  class  Argument_nameContext : public antlr4::ParserRuleContext {
  public:
    Argument_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Assign();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Argument_nameContext* argument_name();

  class  Argument_namesContext : public antlr4::ParserRuleContext {
  public:
    Argument_namesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Argument_nameContext *> argument_name();
    Argument_nameContext* argument_name(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Argument_namesContext* argument_names();

  class  Trailing_closuresContext : public antlr4::ParserRuleContext {
  public:
    Trailing_closuresContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Closure_expressionContext *closure_expression();
    std::vector<Labeled_trailing_closuresContext *> labeled_trailing_closures();
    Labeled_trailing_closuresContext* labeled_trailing_closures(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Trailing_closuresContext* trailing_closures();

  class  Labeled_trailing_closureContext : public antlr4::ParserRuleContext {
  public:
    Labeled_trailing_closureContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Assign();
    Closure_expressionContext *closure_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Labeled_trailing_closureContext* labeled_trailing_closure();

  class  Labeled_trailing_closuresContext : public antlr4::ParserRuleContext {
  public:
    Labeled_trailing_closuresContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Labeled_trailing_closureContext *> labeled_trailing_closure();
    Labeled_trailing_closureContext* labeled_trailing_closure(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Labeled_trailing_closuresContext* labeled_trailing_closures();

  class  Arithmetic_operatorContext : public antlr4::ParserRuleContext {
  public:
    Arithmetic_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Add();
    antlr4::tree::TerminalNode *OverflowingAdd();
    antlr4::tree::TerminalNode *SaturatingAdd();
    antlr4::tree::TerminalNode *Sub();
    antlr4::tree::TerminalNode *OverflowingSub();
    antlr4::tree::TerminalNode *SaturatingSub();
    antlr4::tree::TerminalNode *Mul();
    antlr4::tree::TerminalNode *OverflowingMul();
    antlr4::tree::TerminalNode *SaturatingMul();
    antlr4::tree::TerminalNode *Divide();
    antlr4::tree::TerminalNode *RemainderDivide();
    antlr4::tree::TerminalNode *Power();
    antlr4::tree::TerminalNode *OverflowingPower();
    antlr4::tree::TerminalNode *SaturatingPower();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Arithmetic_operatorContext* arithmetic_operator();

  class  Negation_operatorContext : public antlr4::ParserRuleContext {
  public:
    Negation_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Sub();
    antlr4::tree::TerminalNode *OverflowingSub();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Negation_operatorContext* negation_operator();

  class  Assignment_operatorContext : public antlr4::ParserRuleContext {
  public:
    Assignment_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Assign();
    antlr4::tree::TerminalNode *AddAssign();
    antlr4::tree::TerminalNode *OverflowingAddAssign();
    antlr4::tree::TerminalNode *SaturatingAddAssign();
    antlr4::tree::TerminalNode *SubAssign();
    antlr4::tree::TerminalNode *OverflowingSubAssign();
    antlr4::tree::TerminalNode *SaturatingSubAssign();
    antlr4::tree::TerminalNode *MulAssign();
    antlr4::tree::TerminalNode *OverflowingMulAssign();
    antlr4::tree::TerminalNode *SaturatingMulAssign();
    antlr4::tree::TerminalNode *PowerAssign();
    antlr4::tree::TerminalNode *OverflowingPowerAssign();
    antlr4::tree::TerminalNode *SaturatingPowerAssign();
    antlr4::tree::TerminalNode *DivideAssign();
    antlr4::tree::TerminalNode *RemainderDivideAssign();
    antlr4::tree::TerminalNode *BitLeftShiftAssign();
    antlr4::tree::TerminalNode *SaturatingBitLeftShiftAssign();
    antlr4::tree::TerminalNode *BitRightShiftAssign();
    antlr4::tree::TerminalNode *BitAndAssign();
    antlr4::tree::TerminalNode *BitOrAssign();
    antlr4::tree::TerminalNode *BitNotAssign();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Assignment_operatorContext* assignment_operator();

  class  Comparison_operatorContext : public antlr4::ParserRuleContext {
  public:
    Comparison_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *GreaterThan();
    antlr4::tree::TerminalNode *LessThan();
    antlr4::tree::TerminalNode *GreaterThanOrEqual();
    antlr4::tree::TerminalNode *LessThanOrEqual();
    antlr4::tree::TerminalNode *Equal();
    antlr4::tree::TerminalNode *NotEqual();
    antlr4::tree::TerminalNode *ThreeWayComparison();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Comparison_operatorContext* comparison_operator();

  class  Binary_boolean_operatorContext : public antlr4::ParserRuleContext {
  public:
    Binary_boolean_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAnd();
    antlr4::tree::TerminalNode *KeywordOr();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Binary_boolean_operatorContext* binary_boolean_operator();

  class  Unary_boolean_operatorContext : public antlr4::ParserRuleContext {
  public:
    Unary_boolean_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordNot();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Unary_boolean_operatorContext* unary_boolean_operator();

  class  Binary_bit_operatorContext : public antlr4::ParserRuleContext {
  public:
    Binary_bit_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BitAnd();
    antlr4::tree::TerminalNode *BitOr();
    antlr4::tree::TerminalNode *BitLeftShift();
    antlr4::tree::TerminalNode *SaturatingBitLeftShift();
    antlr4::tree::TerminalNode *BitRightShift();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Binary_bit_operatorContext* binary_bit_operator();

  class  Unary_bit_operatorContext : public antlr4::ParserRuleContext {
  public:
    Unary_bit_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BitNot();
    antlr4::tree::TerminalNode *BitXor();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Unary_bit_operatorContext* unary_bit_operator();

  class  Pointer_operatorContext : public antlr4::ParserRuleContext {
  public:
    Pointer_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PointerType();
    antlr4::tree::TerminalNode *PointerDeref();
    antlr4::tree::TerminalNode *ObjectAddress();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Pointer_operatorContext* pointer_operator();

  class  Reflect_operatorContext : public antlr4::ParserRuleContext {
  public:
    Reflect_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Reflect();
    antlr4::tree::TerminalNode *Reify();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Reflect_operatorContext* reflect_operator();

  class  Range_operatorContext : public antlr4::ParserRuleContext {
  public:
    Range_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ClosedRange();
    antlr4::tree::TerminalNode *RightOpenRange();
    antlr4::tree::TerminalNode *LeftOpenRange();
    antlr4::tree::TerminalNode *OpenedRange();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Range_operatorContext* range_operator();

  class  Binary_optional_unwrapping_operatorContext : public antlr4::ParserRuleContext {
  public:
    Binary_optional_unwrapping_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DefaultUnwrapping();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Binary_optional_unwrapping_operatorContext* binary_optional_unwrapping_operator();

  class  Unary_optional_unwrapping_operatorContext : public antlr4::ParserRuleContext {
  public:
    Unary_optional_unwrapping_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Question();
    antlr4::tree::TerminalNode *Bang();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Unary_optional_unwrapping_operatorContext* unary_optional_unwrapping_operator();

  class  Arrow_operatorContext : public antlr4::ParserRuleContext {
  public:
    Arrow_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Arrow();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Arrow_operatorContext* arrow_operator();

  class  Try_operatorContext : public antlr4::ParserRuleContext {
  public:
    Try_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordTry();
    antlr4::tree::TerminalNode *Question();
    antlr4::tree::TerminalNode *Bang();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Try_operatorContext* try_operator();

  class  Type_casting_operatorContext : public antlr4::ParserRuleContext {
  public:
    Type_casting_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordIs();
    antlr4::tree::TerminalNode *KeywordAs();
    antlr4::tree::TerminalNode *Question();
    antlr4::tree::TerminalNode *Bang();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_casting_operatorContext* type_casting_operator();

  class  Await_operatorContext : public antlr4::ParserRuleContext {
  public:
    Await_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAwait();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Await_operatorContext* await_operator();

  class  Async_operatorContext : public antlr4::ParserRuleContext {
  public:
    Async_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAsync();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Async_operatorContext* async_operator();

  class  Pipeline_operatorContext : public antlr4::ParserRuleContext {
  public:
    Pipeline_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *PlaceholderPipeline();
    antlr4::tree::TerminalNode *LeftThreadingPipeline();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Pipeline_operatorContext* pipeline_operator();

  class  Array_index_operatorContext : public antlr4::ParserRuleContext {
  public:
    Array_index_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *RightSquare();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Array_index_operatorContext* array_index_operator();

  class  Tuple_index_operatorContext : public antlr4::ParserRuleContext {
  public:
    Tuple_index_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *LeftSquare();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *RightSquare();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_index_operatorContext* tuple_index_operator();

  class  Builtin_function_operatorContext : public antlr4::ParserRuleContext {
  public:
    Builtin_function_operatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Builtin();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Builtin_function_operatorContext* builtin_function_operator();

  class  Builtin_function_nameContext : public antlr4::ParserRuleContext {
  public:
    Builtin_function_nameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BuiltinCompileError();
    antlr4::tree::TerminalNode *BuiltinCompileInfo();
    antlr4::tree::TerminalNode *BuiltinCompileWarning();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Builtin_function_nameContext* builtin_function_name();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ExpressionContext() = default;
    void copyFrom(ExpressionContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  Using_expression_Context : public ExpressionContext {
  public:
    Using_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordUsing();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  For_expression_Context : public ExpressionContext {
  public:
    For_expression_Context(ExpressionContext *ctx);

    For_expressionContext *for_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Continue_expression_Context : public ExpressionContext {
  public:
    Continue_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordContinue();
    Code_block_nameContext *code_block_name();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Wildcard_expression_Context : public ExpressionContext {
  public:
    Wildcard_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *Underscore();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Aggregate_initialization_expression_Context : public ExpressionContext {
  public:
    Aggregate_initialization_expression_Context(ExpressionContext *ctx);

    Aggregate_initialization_expressionContext *aggregate_initialization_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Catch_expression_Context : public ExpressionContext {
  public:
    Catch_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *KeywordCatch();
    std::vector<PatternContext *> pattern();
    PatternContext* pattern(size_t i);
    antlr4::tree::TerminalNode *KeywordThen();
    Code_blockContext *code_block();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);
    Require_clauseContext *require_clause();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Foreach_expression_Context : public ExpressionContext {
  public:
    Foreach_expression_Context(ExpressionContext *ctx);

    Foreach_expressionContext *foreach_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Throw_expression_Context : public ExpressionContext {
  public:
    Throw_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordThrow();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Assembly_expression_Context : public ExpressionContext {
  public:
    Assembly_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordAsm();
    antlr4::tree::TerminalNode *LeftParenthese();
    String_literalContext *string_literal();
    antlr4::tree::TerminalNode *RightParenthese();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Binary_optional_unwrapping_expression_Context : public ExpressionContext {
  public:
    Binary_optional_unwrapping_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Binary_optional_unwrapping_operatorContext *binary_optional_unwrapping_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Declaretion_expression_Context : public ExpressionContext {
  public:
    Declaretion_expression_Context(ExpressionContext *ctx);

    Declaration_expressionContext *declaration_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Import_expression_Context : public ExpressionContext {
  public:
    Import_expression_Context(ExpressionContext *ctx);

    Import_expressionContext *import_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Comma_expression_Context : public ExpressionContext {
  public:
    Comma_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *Comma();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Literal_expression_Context : public ExpressionContext {
  public:
    Literal_expression_Context(ExpressionContext *ctx);

    Literal_expressionContext *literal_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Self_expression_Context : public ExpressionContext {
  public:
    Self_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordSelf();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Function_call_expresison_Context : public ExpressionContext {
  public:
    Function_call_expresison_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Function_call_operatorContext *function_call_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Comptime_expression_Context : public ExpressionContext {
  public:
    Comptime_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordComptime();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Unary_optional_unwrapping_expression_Context : public ExpressionContext {
  public:
    Unary_optional_unwrapping_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Unary_optional_unwrapping_operatorContext *unary_optional_unwrapping_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Unreachable_expression_Context : public ExpressionContext {
  public:
    Unreachable_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordUnreachable();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Tuple_index_expression_Context : public ExpressionContext {
  public:
    Tuple_index_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Tuple_index_operatorContext *tuple_index_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Array_index_expression_Context : public ExpressionContext {
  public:
    Array_index_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Array_index_operatorContext *array_index_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Derefence_expression_Context : public ExpressionContext {
  public:
    Derefence_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *PointerDeref();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  With_expression_Context : public ExpressionContext {
  public:
    With_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *KeywordWith();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Type_expression_Context : public ExpressionContext {
  public:
    Type_expression_Context(ExpressionContext *ctx);

    Type_expressionContext *type_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  If_expression_Context : public ExpressionContext {
  public:
    If_expression_Context(ExpressionContext *ctx);

    If_expressionContext *if_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Match_expression_Context : public ExpressionContext {
  public:
    Match_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *KeywordMatch();
    std::vector<Match_caseContext *> match_case();
    Match_caseContext* match_case(size_t i);
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Anonymous_deinit_expression_Context : public ExpressionContext {
  public:
    Anonymous_deinit_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordDeinit();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Object_address_expression_Context : public ExpressionContext {
  public:
    Object_address_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *ObjectAddress();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Bit_expression_Context : public ExpressionContext {
  public:
    Bit_expression_Context(ExpressionContext *ctx);

    Unary_bit_operatorContext *unary_bit_operator();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Binary_bit_operatorContext *binary_bit_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Negation_expression_Context : public ExpressionContext {
  public:
    Negation_expression_Context(ExpressionContext *ctx);

    Negation_operatorContext *negation_operator();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Placeholder_expression_Context : public ExpressionContext {
  public:
    Placeholder_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *RemainderDivide();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Assignment_expression_Context : public ExpressionContext {
  public:
    Assignment_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Assignment_operatorContext *assignment_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Field_expression_Context : public ExpressionContext {
  public:
    Field_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Dot();
    Path_expression_elementContext *path_expression_element();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Repeat_while_expression_Context : public ExpressionContext {
  public:
    Repeat_while_expression_Context(ExpressionContext *ctx);

    Repeat_while_expressionContext *repeat_while_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Comparison_expression_Context : public ExpressionContext {
  public:
    Comparison_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Comparison_operatorContext *comparison_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Break_expression_Context : public ExpressionContext {
  public:
    Break_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordBreak();
    Code_block_nameContext *code_block_name();
    antlr4::tree::TerminalNode *KeywordWith();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Path_expression_Context : public ExpressionContext {
  public:
    Path_expression_Context(ExpressionContext *ctx);

    Path_expressionContext *path_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Reflection_expression_Context : public ExpressionContext {
  public:
    Reflection_expression_Context(ExpressionContext *ctx);

    Reflect_operatorContext *reflect_operator();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Try_expression_Context : public ExpressionContext {
  public:
    Try_expression_Context(ExpressionContext *ctx);

    Try_operatorContext *try_operator();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Boolean_expression_Context : public ExpressionContext {
  public:
    Boolean_expression_Context(ExpressionContext *ctx);

    Unary_boolean_operatorContext *unary_boolean_operator();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Binary_boolean_operatorContext *binary_boolean_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Arithmetic_expression_Context : public ExpressionContext {
  public:
    Arithmetic_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Arithmetic_operatorContext *arithmetic_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Range_expression_Context : public ExpressionContext {
  public:
    Range_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Range_operatorContext *range_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Fallthrough_expression_Context : public ExpressionContext {
  public:
    Fallthrough_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordFallthrough();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Member_function_call_expression_Context : public ExpressionContext {
  public:
    Member_function_call_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Function_call_operatorContext *function_call_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Init_expression_Context : public ExpressionContext {
  public:
    Init_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordInit();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Deinit_expression_Context : public ExpressionContext {
  public:
    Deinit_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordDeinit();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Assume_expression_Context : public ExpressionContext {
  public:
    Assume_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordAssume();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Await_expression_Context : public ExpressionContext {
  public:
    Await_expression_Context(ExpressionContext *ctx);

    Await_operatorContext *await_operator();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Pipeline_expression_Context : public ExpressionContext {
  public:
    Pipeline_expression_Context(ExpressionContext *ctx);

    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Pipeline_operatorContext *pipeline_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  While_expression_Context : public ExpressionContext {
  public:
    While_expression_Context(ExpressionContext *ctx);

    While_expressionContext *while_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Parentheses_expression_Context : public ExpressionContext {
  public:
    Parentheses_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *LeftParenthese();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *RightParenthese();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Async_expression_Context : public ExpressionContext {
  public:
    Async_expression_Context(ExpressionContext *ctx);

    Async_operatorContext *async_operator();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Type_cast_expression_Context : public ExpressionContext {
  public:
    Type_cast_expression_Context(ExpressionContext *ctx);

    ExpressionContext *expression();
    Type_casting_operatorContext *type_casting_operator();
    Type_expressionContext *type_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Anonymous_field_expression_Context : public ExpressionContext {
  public:
    Anonymous_field_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *Dot();
    Path_expression_elementContext *path_expression_element();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Anonymous_init_expression_Context : public ExpressionContext {
  public:
    Anonymous_init_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordInit();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Return_expression_Context : public ExpressionContext {
  public:
    Return_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordReturn();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Assert_expression_Context : public ExpressionContext {
  public:
    Assert_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordAssert();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *KeywordWith();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Builtin_function_callContext : public ExpressionContext {
  public:
    Builtin_function_callContext(ExpressionContext *ctx);

    Builtin_function_operatorContext *builtin_function_operator();
    Builtin_function_nameContext *builtin_function_name();
    Function_call_operatorContext *function_call_operator();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Closure_expression_Context : public ExpressionContext {
  public:
    Closure_expression_Context(ExpressionContext *ctx);

    Closure_expressionContext *closure_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Use_in_expression_Context : public ExpressionContext {
  public:
    Use_in_expression_Context(ExpressionContext *ctx);

    antlr4::tree::TerminalNode *KeywordUse();
    Declaration_statement_or_listContext *declaration_statement_or_list();
    antlr4::tree::TerminalNode *KeywordIn();
    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Code_block_expression_Context : public ExpressionContext {
  public:
    Code_block_expression_Context(ExpressionContext *ctx);

    Code_block_expressionContext *code_block_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  ExpressionContext* expression();
  ExpressionContext* expression(int precedence);
  class  Aggregate_initialization_expressionContext : public antlr4::ParserRuleContext {
  public:
    Aggregate_initialization_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_expressionContext *type_expression();
    antlr4::tree::TerminalNode *Dot();
    antlr4::tree::TerminalNode *KeywordInit();
    Aggregate_initialization_listContext *aggregate_initialization_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Aggregate_initialization_expressionContext* aggregate_initialization_expression();

  class  Aggregate_initialization_listContext : public antlr4::ParserRuleContext {
  public:
    Aggregate_initialization_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<Aggregate_initialization_memberContext *> aggregate_initialization_member();
    Aggregate_initialization_memberContext* aggregate_initialization_member(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Aggregate_initialization_listContext* aggregate_initialization_list();

  class  Aggregate_initialization_memberContext : public antlr4::ParserRuleContext {
  public:
    Aggregate_initialization_memberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Dot();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *Assign();
    Aggregate_initialization_listContext *aggregate_initialization_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Aggregate_initialization_memberContext* aggregate_initialization_member();

  class  Code_block_expressionContext : public antlr4::ParserRuleContext {
  public:
    Code_block_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Code_block_expressionContext* code_block_expression();

  class  Require_clauseContext : public antlr4::ParserRuleContext {
  public:
    Require_clauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRequire();
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Require_clauseContext* require_clause();

  class  Then_expression_or_blockContext : public antlr4::ParserRuleContext {
  public:
    Then_expression_or_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordThen();
    ExpressionContext *expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Then_expression_or_blockContext* then_expression_or_block();

  class  Then_expression_or_then_blockContext : public antlr4::ParserRuleContext {
  public:
    Then_expression_or_then_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordThen();
    ExpressionContext *expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Then_expression_or_then_blockContext* then_expression_or_then_block();

  class  Expression_or_blockContext : public antlr4::ParserRuleContext {
  public:
    Expression_or_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Expression_or_blockContext* expression_or_block();

  class  Then_type_expression_or_blockContext : public antlr4::ParserRuleContext {
  public:
    Then_type_expression_or_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordThen();
    Type_expressionContext *type_expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Then_type_expression_or_blockContext* then_type_expression_or_block();

  class  Type_expression_or_blockContext : public antlr4::ParserRuleContext {
  public:
    Type_expression_or_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_expressionContext *type_expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_expression_or_blockContext* type_expression_or_block();

  class  If_expressionContext : public antlr4::ParserRuleContext {
  public:
    If_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordIf();
    ExpressionContext *expression();
    Then_expression_or_blockContext *then_expression_or_block();
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  If_expressionContext* if_expression();

  class  While_expressionContext : public antlr4::ParserRuleContext {
  public:
    While_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordWhile();
    ExpressionContext *expression();
    Then_expression_or_blockContext *then_expression_or_block();
    Then_expression_or_then_blockContext *then_expression_or_then_block();
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  While_expressionContext* while_expression();

  class  Repeat_while_expressionContext : public antlr4::ParserRuleContext {
  public:
    Repeat_while_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordRepeat();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    Then_expression_or_blockContext *then_expression_or_block();
    antlr4::tree::TerminalNode *KeywordWhile();
    Then_expression_or_then_blockContext *then_expression_or_then_block();
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Repeat_while_expressionContext* repeat_while_expression();

  class  For_expressionContext : public antlr4::ParserRuleContext {
  public:
    For_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordFor();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *KeywordIn();
    ExpressionContext *expression();
    Then_expression_or_blockContext *then_expression_or_block();
    AttributesContext *attributes();
    Require_clauseContext *require_clause();
    Then_expression_or_then_blockContext *then_expression_or_then_block();
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  For_expressionContext* for_expression();

  class  Foreach_expressionContext : public antlr4::ParserRuleContext {
  public:
    Foreach_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordForeach();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *KeywordIn();
    ExpressionContext *expression();
    Then_expression_or_blockContext *then_expression_or_block();
    AttributesContext *attributes();
    Require_clauseContext *require_clause();
    Then_expression_or_then_blockContext *then_expression_or_then_block();
    antlr4::tree::TerminalNode *KeywordElse();
    Expression_or_blockContext *expression_or_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Foreach_expressionContext* foreach_expression();

  class  Match_caseContext : public antlr4::ParserRuleContext {
  public:
    Match_caseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Match_case_labelContext *match_case_label();
    antlr4::tree::TerminalNode *Colon();
    ExpressionContext *expression();
    Code_blockContext *code_block();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Match_caseContext* match_case();

  class  Match_case_labelContext : public antlr4::ParserRuleContext {
  public:
    Match_case_labelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Match_item_listContext *match_item_list();
    AttributesContext *attributes();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Match_case_labelContext* match_case_label();

  class  Match_item_listContext : public antlr4::ParserRuleContext {
  public:
    Match_item_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<PatternContext *> pattern();
    PatternContext* pattern(size_t i);
    std::vector<Require_clauseContext *> require_clause();
    Require_clauseContext* require_clause(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Match_item_listContext* match_item_list();

  class  Type_expressionContext : public antlr4::ParserRuleContext {
  public:
    Type_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *RightParenthese();
    Type_expressionContext *type_expression();
    antlr4::tree::TerminalNode *LeftParenthese();
    Path_expressionContext *path_expression();
    Function_call_operatorContext *function_call_operator();
    Basic_typeContext *basic_type();
    Tuple_typeContext *tuple_type();
    Optional_typeContext *optional_type();
    Collection_typeContext *collection_type();
    Any_typeContext *any_type();
    Some_typeContext *some_type();
    Const_typeContext *const_type();
    If_expressionContext *if_expression();
    While_expressionContext *while_expression();
    Repeat_while_expressionContext *repeat_while_expression();
    For_expressionContext *for_expression();
    Foreach_expressionContext *foreach_expression();
    Code_block_expressionContext *code_block_expression();
    antlr4::tree::TerminalNode *KeywordUnreachable();
    antlr4::tree::TerminalNode *KeywordFallthrough();
    antlr4::tree::TerminalNode *KeywordThrow();
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *KeywordReturn();
    antlr4::tree::TerminalNode *KeywordBreak();
    Code_block_nameContext *code_block_name();
    antlr4::tree::TerminalNode *KeywordWith();
    antlr4::tree::TerminalNode *KeywordContinue();
    antlr4::tree::TerminalNode *KeywordComptime();
    Builtin_function_operatorContext *builtin_function_operator();
    Builtin_function_nameContext *builtin_function_name();
    antlr4::tree::TerminalNode *Underscore();
    Array_index_operatorContext *array_index_operator();
    Tuple_index_operatorContext *tuple_index_operator();
    antlr4::tree::TerminalNode *PointerType();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_expressionContext* type_expression();
  Type_expressionContext* type_expression(int precedence);
  class  Basic_typeContext : public antlr4::ParserRuleContext {
  public:
    Basic_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Never_typeContext *never_type();
    Integer_typeContext *integer_type();
    Floating_point_typeContext *floating_point_type();
    Boolean_typeContext *boolean_type();
    Byte_typeContext *byte_type();
    Unit_typeContext *unit_type();
    Character_typeContext *character_type();
    String_typeContext *string_type();
    Comptime_typeContext *comptime_type();
    Type_typeContext *type_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Basic_typeContext* basic_type();

  class  Collection_typeContext : public antlr4::ParserRuleContext {
  public:
    Collection_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Static_array_typeContext *static_array_type();
    Dynamic_array_typeContext *dynamic_array_type();
    Map_typeContext *map_type();
    Set_typeContext *set_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Collection_typeContext* collection_type();

  class  Never_typeContext : public antlr4::ParserRuleContext {
  public:
    Never_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordNever();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Never_typeContext* never_type();

  class  Tuple_typeContext : public antlr4::ParserRuleContext {
  public:
    Tuple_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    std::vector<Tuple_type_elementContext *> tuple_type_element();
    Tuple_type_elementContext* tuple_type_element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);
    antlr4::tree::TerminalNode *ClosedRange();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_typeContext* tuple_type();

  class  Tuple_type_elementContext : public antlr4::ParserRuleContext {
  public:
    Tuple_type_elementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Type_expressionContext *type_expression();
    AttributesContext *attributes();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Colon();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_type_elementContext* tuple_type_element();

  class  Optional_typeContext : public antlr4::ParserRuleContext {
  public:
    Optional_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Question();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Optional_typeContext* optional_type();

  class  Any_typeContext : public antlr4::ParserRuleContext {
  public:
    Any_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordAny();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Any_typeContext* any_type();

  class  Some_typeContext : public antlr4::ParserRuleContext {
  public:
    Some_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordSome();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Some_typeContext* some_type();

  class  Static_array_typeContext : public antlr4::ParserRuleContext {
  public:
    Static_array_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    antlr4::tree::TerminalNode *RightSquare();
    Type_expressionContext *type_expression();
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Static_array_typeContext* static_array_type();

  class  Dynamic_array_typeContext : public antlr4::ParserRuleContext {
  public:
    Dynamic_array_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    antlr4::tree::TerminalNode *RightSquare();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Dynamic_array_typeContext* dynamic_array_type();

  class  Map_typeContext : public antlr4::ParserRuleContext {
  public:
    Map_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    std::vector<Type_expressionContext *> type_expression();
    Type_expressionContext* type_expression(size_t i);
    antlr4::tree::TerminalNode *Colon();
    antlr4::tree::TerminalNode *RightSquare();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Map_typeContext* map_type();

  class  Set_typeContext : public antlr4::ParserRuleContext {
  public:
    Set_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftSquare();
    Type_expressionContext *type_expression();
    antlr4::tree::TerminalNode *RightSquare();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Set_typeContext* set_type();

  class  Const_typeContext : public antlr4::ParserRuleContext {
  public:
    Const_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordConst();
    Type_expressionContext *type_expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Const_typeContext* const_type();

  class  Simple_typeContext : public antlr4::ParserRuleContext {
  public:
    Simple_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Integer_typeContext *integer_type();
    Floating_point_typeContext *floating_point_type();
    Boolean_typeContext *boolean_type();
    Byte_typeContext *byte_type();
    Unit_typeContext *unit_type();
    Character_typeContext *character_type();
    String_typeContext *string_type();
    Comptime_typeContext *comptime_type();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Simple_typeContext* simple_type();

  class  Integer_typeContext : public antlr4::ParserRuleContext {
  public:
    Integer_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordInt8();
    antlr4::tree::TerminalNode *KeywordInt16();
    antlr4::tree::TerminalNode *KeywordInt32();
    antlr4::tree::TerminalNode *KeywordInt64();
    antlr4::tree::TerminalNode *KeywordInt128();
    antlr4::tree::TerminalNode *KeywordUInt8();
    antlr4::tree::TerminalNode *KeywordUInt16();
    antlr4::tree::TerminalNode *KeywordUInt32();
    antlr4::tree::TerminalNode *KeywordUInt64();
    antlr4::tree::TerminalNode *KeywordUInt128();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Integer_typeContext* integer_type();

  class  Floating_point_typeContext : public antlr4::ParserRuleContext {
  public:
    Floating_point_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordFloat16();
    antlr4::tree::TerminalNode *KeywordFloat32();
    antlr4::tree::TerminalNode *KeywordFloat64();
    antlr4::tree::TerminalNode *KeywordFloat80();
    antlr4::tree::TerminalNode *KeywordFloat128();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Floating_point_typeContext* floating_point_type();

  class  Boolean_typeContext : public antlr4::ParserRuleContext {
  public:
    Boolean_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordBool();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Boolean_typeContext* boolean_type();

  class  Byte_typeContext : public antlr4::ParserRuleContext {
  public:
    Byte_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordByte();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Byte_typeContext* byte_type();

  class  Unit_typeContext : public antlr4::ParserRuleContext {
  public:
    Unit_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordUnit();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Unit_typeContext* unit_type();

  class  Character_typeContext : public antlr4::ParserRuleContext {
  public:
    Character_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordChar8();
    antlr4::tree::TerminalNode *KeywordChar16();
    antlr4::tree::TerminalNode *KeywordChar32();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Character_typeContext* character_type();

  class  String_typeContext : public antlr4::ParserRuleContext {
  public:
    String_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordString();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  String_typeContext* string_type();

  class  Comptime_typeContext : public antlr4::ParserRuleContext {
  public:
    Comptime_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordCompileTimeChar();
    antlr4::tree::TerminalNode *KeywordCompileTimeFloat();
    antlr4::tree::TerminalNode *KeywordCompileTimeInt();
    antlr4::tree::TerminalNode *KeywordCompileTimeString();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Comptime_typeContext* comptime_type();

  class  Type_typeContext : public antlr4::ParserRuleContext {
  public:
    Type_typeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordType();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Type_typeContext* type_type();

  class  Tuple_expressionContext : public antlr4::ParserRuleContext {
  public:
    Tuple_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Tuple_elementContext *tuple_element();
    antlr4::tree::TerminalNode *Comma();
    Tuple_element_listContext *tuple_element_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_expressionContext* tuple_expression();

  class  Tuple_element_listContext : public antlr4::ParserRuleContext {
  public:
    Tuple_element_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Tuple_elementContext *> tuple_element();
    Tuple_elementContext* tuple_element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_element_listContext* tuple_element_list();

  class  Tuple_elementContext : public antlr4::ParserRuleContext {
  public:
    Tuple_elementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Assign();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_elementContext* tuple_element();

  class  Path_expressionContext : public antlr4::ParserRuleContext {
  public:
    Path_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Path_expression_elementContext *> path_expression_element();
    Path_expression_elementContext* path_expression_element(size_t i);
    antlr4::tree::TerminalNode *KeywordGlobal();
    std::vector<antlr4::tree::TerminalNode *> Dot();
    antlr4::tree::TerminalNode* Dot(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Path_expressionContext* path_expression();

  class  Path_expression_elementContext : public antlr4::ParserRuleContext {
  public:
    Path_expression_elementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *KeywordSuper();
    antlr4::tree::TerminalNode *KeywordSelf();
    antlr4::tree::TerminalNode *KeywordThis();
    antlr4::tree::TerminalNode *KeywordOuter();
    antlr4::tree::TerminalNode *KeywordModule();
    antlr4::tree::TerminalNode *KeywordPackage();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Path_expression_elementContext* path_expression_element();

  class  Literal_expressionContext : public antlr4::ParserRuleContext {
  public:
    Literal_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiteralContext *literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Literal_expressionContext* literal_expression();

  class  LiteralContext : public antlr4::ParserRuleContext {
  public:
    LiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Numeric_literalContext *numeric_literal();
    Boolean_literalContext *boolean_literal();
    String_literalContext *string_literal();
    Char_literalContext *char_literal();
    Null_literalContext *null_literal();
    Undefined_literalContext *undefined_literal();
    Default_literalContext *default_literal();
    Array_literalContext *array_literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  LiteralContext* literal();

  class  Numeric_literalContext : public antlr4::ParserRuleContext {
  public:
    Numeric_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Integer_literalContext *integer_literal();
    Floating_point_literalContext *floating_point_literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Numeric_literalContext* numeric_literal();

  class  Integer_literalContext : public antlr4::ParserRuleContext {
  public:
    Integer_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DecimalDigits();
    antlr4::tree::TerminalNode *DecimalLiteral();
    antlr4::tree::TerminalNode *BinaryLiteral();
    antlr4::tree::TerminalNode *OctalLiteral();
    antlr4::tree::TerminalNode *HexadecimalLiteral();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Integer_literalContext* integer_literal();

  class  Floating_point_literalContext : public antlr4::ParserRuleContext {
  public:
    Floating_point_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FloatingPointLiteral();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Floating_point_literalContext* floating_point_literal();

  class  Boolean_literalContext : public antlr4::ParserRuleContext {
  public:
    Boolean_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordTrue();
    antlr4::tree::TerminalNode *KeywordFalse();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Boolean_literalContext* boolean_literal();

  class  Null_literalContext : public antlr4::ParserRuleContext {
  public:
    Null_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordNull();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Null_literalContext* null_literal();

  class  Undefined_literalContext : public antlr4::ParserRuleContext {
  public:
    Undefined_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordUndefined();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Undefined_literalContext* undefined_literal();

  class  Default_literalContext : public antlr4::ParserRuleContext {
  public:
    Default_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordDefault();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Default_literalContext* default_literal();

  class  Array_literalContext : public antlr4::ParserRuleContext {
  public:
    Array_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftCurly();
    antlr4::tree::TerminalNode *RightCurly();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Array_literalContext* array_literal();

  class  String_literalContext : public antlr4::ParserRuleContext {
  public:
    String_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Extended_string_literalContext *extended_string_literal();
    Interpolated_string_literalContext *interpolated_string_literal();
    Static_string_literalContext *static_string_literal();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  String_literalContext* string_literal();

  class  Extended_string_literalContext : public antlr4::ParserRuleContext {
  public:
    Extended_string_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *MultiLineExtendedStringOpen();
    antlr4::tree::TerminalNode *MultiLineExtendedStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedMultiLineExtendedText();
    antlr4::tree::TerminalNode* QuotedMultiLineExtendedText(size_t i);
    antlr4::tree::TerminalNode *SingleLineExtendedStringOpen();
    antlr4::tree::TerminalNode *SingleLineExtendedStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedSingleLineExtendedText();
    antlr4::tree::TerminalNode* QuotedSingleLineExtendedText(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Extended_string_literalContext* extended_string_literal();

  class  Static_string_literalContext : public antlr4::ParserRuleContext {
  public:
    Static_string_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SingleLineStringOpen();
    antlr4::tree::TerminalNode *SingleLineStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedSingleLineText();
    antlr4::tree::TerminalNode* QuotedSingleLineText(size_t i);
    antlr4::tree::TerminalNode *MultiLineStringOpen();
    antlr4::tree::TerminalNode *MultiLineStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedMultiLineText();
    antlr4::tree::TerminalNode* QuotedMultiLineText(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Static_string_literalContext* static_string_literal();

  class  Interpolated_string_literalContext : public antlr4::ParserRuleContext {
  public:
    Interpolated_string_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SingleLineStringOpen();
    antlr4::tree::TerminalNode *SingleLineStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedSingleLineText();
    antlr4::tree::TerminalNode* QuotedSingleLineText(size_t i);
    std::vector<antlr4::tree::TerminalNode *> InterpolataionSingleLine();
    antlr4::tree::TerminalNode* InterpolataionSingleLine(size_t i);
    std::vector<antlr4::tree::TerminalNode *> RightCurly();
    antlr4::tree::TerminalNode* RightCurly(size_t i);
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<Tuple_elementContext *> tuple_element();
    Tuple_elementContext* tuple_element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);
    std::vector<Tuple_element_listContext *> tuple_element_list();
    Tuple_element_listContext* tuple_element_list(size_t i);
    antlr4::tree::TerminalNode *MultiLineStringOpen();
    antlr4::tree::TerminalNode *MultiLineStringClose();
    std::vector<antlr4::tree::TerminalNode *> QuotedMultiLineText();
    antlr4::tree::TerminalNode* QuotedMultiLineText(size_t i);
    std::vector<antlr4::tree::TerminalNode *> InterpolataionMultiLine();
    antlr4::tree::TerminalNode* InterpolataionMultiLine(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Interpolated_string_literalContext* interpolated_string_literal();

  class  Char_literalContext : public antlr4::ParserRuleContext {
  public:
    Char_literalContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CharLiteralOpen();
    antlr4::tree::TerminalNode *ValidChar();
    antlr4::tree::TerminalNode *CharLiteralClose();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Char_literalContext* char_literal();

  class  PatternContext : public antlr4::ParserRuleContext {
  public:
    PatternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    PatternContext() = default;
    void copyFrom(PatternContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  Optional_pattern_Context : public PatternContext {
  public:
    Optional_pattern_Context(PatternContext *ctx);

    Optional_patternContext *optional_pattern();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Is_pattern_Context : public PatternContext {
  public:
    Is_pattern_Context(PatternContext *ctx);

    antlr4::tree::TerminalNode *KeywordIs();
    Type_expressionContext *type_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  As_pattern_Context : public PatternContext {
  public:
    As_pattern_Context(PatternContext *ctx);

    PatternContext *pattern();
    antlr4::tree::TerminalNode *KeywordAs();
    Type_expressionContext *type_expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Value_binding_pattern_Context : public PatternContext {
  public:
    Value_binding_pattern_Context(PatternContext *ctx);

    Value_binding_patternContext *value_binding_pattern();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Identifier_pattern_Context : public PatternContext {
  public:
    Identifier_pattern_Context(PatternContext *ctx);

    Identifier_patternContext *identifier_pattern();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Expression_pattern_Context : public PatternContext {
  public:
    Expression_pattern_Context(PatternContext *ctx);

    ExpressionContext *expression();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Enumerator_pattern_Context : public PatternContext {
  public:
    Enumerator_pattern_Context(PatternContext *ctx);

    Enumerator_patternContext *enumerator_pattern();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Wildcard_pattern_Context : public PatternContext {
  public:
    Wildcard_pattern_Context(PatternContext *ctx);

    Wildcard_patternContext *wildcard_pattern();
    antlr4::tree::TerminalNode *Colon();
    Type_annotationContext *type_annotation();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  class  Tuple_pattern_Context : public PatternContext {
  public:
    Tuple_pattern_Context(PatternContext *ctx);

    Tuple_patternContext *tuple_pattern();
    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
  };

  PatternContext* pattern();
  PatternContext* pattern(int precedence);
  class  Tuple_pattern_element_listContext : public antlr4::ParserRuleContext {
  public:
    Tuple_pattern_element_listContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<Tuple_pattern_elementContext *> tuple_pattern_element();
    Tuple_pattern_elementContext* tuple_pattern_element(size_t i);
    std::vector<antlr4::tree::TerminalNode *> Comma();
    antlr4::tree::TerminalNode* Comma(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_pattern_element_listContext* tuple_pattern_element_list();

  class  Tuple_pattern_elementContext : public antlr4::ParserRuleContext {
  public:
    Tuple_pattern_elementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PatternContext *pattern();
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Colon();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_pattern_elementContext* tuple_pattern_element();

  class  Wildcard_patternContext : public antlr4::ParserRuleContext {
  public:
    Wildcard_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Underscore();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Wildcard_patternContext* wildcard_pattern();

  class  Identifier_patternContext : public antlr4::ParserRuleContext {
  public:
    Identifier_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Identifier_patternContext* identifier_pattern();

  class  Value_binding_patternContext : public antlr4::ParserRuleContext {
  public:
    Value_binding_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *KeywordLet();
    antlr4::tree::TerminalNode *KeywordVar();
    PatternContext *pattern();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Value_binding_patternContext* value_binding_pattern();

  class  Tuple_patternContext : public antlr4::ParserRuleContext {
  public:
    Tuple_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *LeftParenthese();
    antlr4::tree::TerminalNode *RightParenthese();
    Tuple_pattern_element_listContext *tuple_pattern_element_list();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Tuple_patternContext* tuple_pattern();

  class  Enumerator_patternContext : public antlr4::ParserRuleContext {
  public:
    Enumerator_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Dot();
    Enumerator_nameContext *enumerator_name();
    Type_expressionContext *type_expression();
    Tuple_patternContext *tuple_pattern();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Enumerator_patternContext* enumerator_pattern();

  class  Optional_patternContext : public antlr4::ParserRuleContext {
  public:
    Optional_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    antlr4::tree::TerminalNode *Question();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Optional_patternContext* optional_pattern();

  class  Expression_patternContext : public antlr4::ParserRuleContext {
  public:
    Expression_patternContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  Expression_patternContext* expression_pattern();


  bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;

  bool expressionSempred(ExpressionContext *_localctx, size_t predicateIndex);
  bool type_expressionSempred(Type_expressionContext *_localctx, size_t predicateIndex);
  bool patternSempred(PatternContext *_localctx, size_t predicateIndex);

  // By default the static state used to implement the parser is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:
};

