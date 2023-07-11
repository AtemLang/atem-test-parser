
// Generated from .\AtemParser.g4 by ANTLR 4.13.0

#pragma once


#include "antlr4-runtime.h"
#include "AtemParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by AtemParser.
 */
class  AtemParserListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterProgram(AtemParser::ProgramContext *ctx) = 0;
  virtual void exitProgram(AtemParser::ProgramContext *ctx) = 0;

  virtual void enterStatement(AtemParser::StatementContext *ctx) = 0;
  virtual void exitStatement(AtemParser::StatementContext *ctx) = 0;

  virtual void enterStatements(AtemParser::StatementsContext *ctx) = 0;
  virtual void exitStatements(AtemParser::StatementsContext *ctx) = 0;

  virtual void enterDeclaration_statement_or_list(AtemParser::Declaration_statement_or_listContext *ctx) = 0;
  virtual void exitDeclaration_statement_or_list(AtemParser::Declaration_statement_or_listContext *ctx) = 0;

  virtual void enterDeclaration_statement_list(AtemParser::Declaration_statement_listContext *ctx) = 0;
  virtual void exitDeclaration_statement_list(AtemParser::Declaration_statement_listContext *ctx) = 0;

  virtual void enterDeclaration_statement(AtemParser::Declaration_statementContext *ctx) = 0;
  virtual void exitDeclaration_statement(AtemParser::Declaration_statementContext *ctx) = 0;

  virtual void enterDeclarator(AtemParser::DeclaratorContext *ctx) = 0;
  virtual void exitDeclarator(AtemParser::DeclaratorContext *ctx) = 0;

  virtual void enterDeclare_operator(AtemParser::Declare_operatorContext *ctx) = 0;
  virtual void exitDeclare_operator(AtemParser::Declare_operatorContext *ctx) = 0;

  virtual void enterEmpty_declare_operator(AtemParser::Empty_declare_operatorContext *ctx) = 0;
  virtual void exitEmpty_declare_operator(AtemParser::Empty_declare_operatorContext *ctx) = 0;

  virtual void enterDeclarator_name(AtemParser::Declarator_nameContext *ctx) = 0;
  virtual void exitDeclarator_name(AtemParser::Declarator_nameContext *ctx) = 0;

  virtual void enterDeclaration_expression(AtemParser::Declaration_expressionContext *ctx) = 0;
  virtual void exitDeclaration_expression(AtemParser::Declaration_expressionContext *ctx) = 0;

  virtual void enterTest_declaration(AtemParser::Test_declarationContext *ctx) = 0;
  virtual void exitTest_declaration(AtemParser::Test_declarationContext *ctx) = 0;

  virtual void enterTest_name(AtemParser::Test_nameContext *ctx) = 0;
  virtual void exitTest_name(AtemParser::Test_nameContext *ctx) = 0;

  virtual void enterStruct_declaration(AtemParser::Struct_declarationContext *ctx) = 0;
  virtual void exitStruct_declaration(AtemParser::Struct_declarationContext *ctx) = 0;

  virtual void enterClass_declaration(AtemParser::Class_declarationContext *ctx) = 0;
  virtual void exitClass_declaration(AtemParser::Class_declarationContext *ctx) = 0;

  virtual void enterFinal_specifier(AtemParser::Final_specifierContext *ctx) = 0;
  virtual void exitFinal_specifier(AtemParser::Final_specifierContext *ctx) = 0;

  virtual void enterMember_specifier(AtemParser::Member_specifierContext *ctx) = 0;
  virtual void exitMember_specifier(AtemParser::Member_specifierContext *ctx) = 0;

  virtual void enterMember_specifiers(AtemParser::Member_specifiersContext *ctx) = 0;
  virtual void exitMember_specifiers(AtemParser::Member_specifiersContext *ctx) = 0;

  virtual void enterExtension_list(AtemParser::Extension_listContext *ctx) = 0;
  virtual void exitExtension_list(AtemParser::Extension_listContext *ctx) = 0;

  virtual void enterExtension_item(AtemParser::Extension_itemContext *ctx) = 0;
  virtual void exitExtension_item(AtemParser::Extension_itemContext *ctx) = 0;

  virtual void enterInherit_clause(AtemParser::Inherit_clauseContext *ctx) = 0;
  virtual void exitInherit_clause(AtemParser::Inherit_clauseContext *ctx) = 0;

  virtual void enterInherit_list(AtemParser::Inherit_listContext *ctx) = 0;
  virtual void exitInherit_list(AtemParser::Inherit_listContext *ctx) = 0;

  virtual void enterInherit_item(AtemParser::Inherit_itemContext *ctx) = 0;
  virtual void exitInherit_item(AtemParser::Inherit_itemContext *ctx) = 0;

  virtual void enterInherit_items(AtemParser::Inherit_itemsContext *ctx) = 0;
  virtual void exitInherit_items(AtemParser::Inherit_itemsContext *ctx) = 0;

  virtual void enterInherit_member_list(AtemParser::Inherit_member_listContext *ctx) = 0;
  virtual void exitInherit_member_list(AtemParser::Inherit_member_listContext *ctx) = 0;

  virtual void enterInherit_member(AtemParser::Inherit_memberContext *ctx) = 0;
  virtual void exitInherit_member(AtemParser::Inherit_memberContext *ctx) = 0;

  virtual void enterInherit_members(AtemParser::Inherit_membersContext *ctx) = 0;
  virtual void exitInherit_members(AtemParser::Inherit_membersContext *ctx) = 0;

  virtual void enterInherit_type_override(AtemParser::Inherit_type_overrideContext *ctx) = 0;
  virtual void exitInherit_type_override(AtemParser::Inherit_type_overrideContext *ctx) = 0;

  virtual void enterInherit_variable_override(AtemParser::Inherit_variable_overrideContext *ctx) = 0;
  virtual void exitInherit_variable_override(AtemParser::Inherit_variable_overrideContext *ctx) = 0;

  virtual void enterInherit_constant_override(AtemParser::Inherit_constant_overrideContext *ctx) = 0;
  virtual void exitInherit_constant_override(AtemParser::Inherit_constant_overrideContext *ctx) = 0;

  virtual void enterInherit_function_override(AtemParser::Inherit_function_overrideContext *ctx) = 0;
  virtual void exitInherit_function_override(AtemParser::Inherit_function_overrideContext *ctx) = 0;

  virtual void enterInherit_initializer_override(AtemParser::Inherit_initializer_overrideContext *ctx) = 0;
  virtual void exitInherit_initializer_override(AtemParser::Inherit_initializer_overrideContext *ctx) = 0;

  virtual void enterInherit_deinitializer_override(AtemParser::Inherit_deinitializer_overrideContext *ctx) = 0;
  virtual void exitInherit_deinitializer_override(AtemParser::Inherit_deinitializer_overrideContext *ctx) = 0;

  virtual void enterInherit_declarator(AtemParser::Inherit_declaratorContext *ctx) = 0;
  virtual void exitInherit_declarator(AtemParser::Inherit_declaratorContext *ctx) = 0;

  virtual void enterEmpty_inherit_declarator(AtemParser::Empty_inherit_declaratorContext *ctx) = 0;
  virtual void exitEmpty_inherit_declarator(AtemParser::Empty_inherit_declaratorContext *ctx) = 0;

  virtual void enterInherit_name(AtemParser::Inherit_nameContext *ctx) = 0;
  virtual void exitInherit_name(AtemParser::Inherit_nameContext *ctx) = 0;

  virtual void enterImpl_clause(AtemParser::Impl_clauseContext *ctx) = 0;
  virtual void exitImpl_clause(AtemParser::Impl_clauseContext *ctx) = 0;

  virtual void enterImpl_list(AtemParser::Impl_listContext *ctx) = 0;
  virtual void exitImpl_list(AtemParser::Impl_listContext *ctx) = 0;

  virtual void enterImpl_item(AtemParser::Impl_itemContext *ctx) = 0;
  virtual void exitImpl_item(AtemParser::Impl_itemContext *ctx) = 0;

  virtual void enterImpl_items(AtemParser::Impl_itemsContext *ctx) = 0;
  virtual void exitImpl_items(AtemParser::Impl_itemsContext *ctx) = 0;

  virtual void enterImpl_with_clause(AtemParser::Impl_with_clauseContext *ctx) = 0;
  virtual void exitImpl_with_clause(AtemParser::Impl_with_clauseContext *ctx) = 0;

  virtual void enterImpl_member_list(AtemParser::Impl_member_listContext *ctx) = 0;
  virtual void exitImpl_member_list(AtemParser::Impl_member_listContext *ctx) = 0;

  virtual void enterImpl_member(AtemParser::Impl_memberContext *ctx) = 0;
  virtual void exitImpl_member(AtemParser::Impl_memberContext *ctx) = 0;

  virtual void enterImpl_members(AtemParser::Impl_membersContext *ctx) = 0;
  virtual void exitImpl_members(AtemParser::Impl_membersContext *ctx) = 0;

  virtual void enterAssociated_type_impl(AtemParser::Associated_type_implContext *ctx) = 0;
  virtual void exitAssociated_type_impl(AtemParser::Associated_type_implContext *ctx) = 0;

  virtual void enterAssociated_variable_impl(AtemParser::Associated_variable_implContext *ctx) = 0;
  virtual void exitAssociated_variable_impl(AtemParser::Associated_variable_implContext *ctx) = 0;

  virtual void enterAssociated_constant_impl(AtemParser::Associated_constant_implContext *ctx) = 0;
  virtual void exitAssociated_constant_impl(AtemParser::Associated_constant_implContext *ctx) = 0;

  virtual void enterAssociated_function_impl(AtemParser::Associated_function_implContext *ctx) = 0;
  virtual void exitAssociated_function_impl(AtemParser::Associated_function_implContext *ctx) = 0;

  virtual void enterAssociated_initializer_impl(AtemParser::Associated_initializer_implContext *ctx) = 0;
  virtual void exitAssociated_initializer_impl(AtemParser::Associated_initializer_implContext *ctx) = 0;

  virtual void enterAssociated_deinitializer_impl(AtemParser::Associated_deinitializer_implContext *ctx) = 0;
  virtual void exitAssociated_deinitializer_impl(AtemParser::Associated_deinitializer_implContext *ctx) = 0;

  virtual void enterAssociated_declarator(AtemParser::Associated_declaratorContext *ctx) = 0;
  virtual void exitAssociated_declarator(AtemParser::Associated_declaratorContext *ctx) = 0;

  virtual void enterEmpty_associated_declarator(AtemParser::Empty_associated_declaratorContext *ctx) = 0;
  virtual void exitEmpty_associated_declarator(AtemParser::Empty_associated_declaratorContext *ctx) = 0;

  virtual void enterAssociated_name(AtemParser::Associated_nameContext *ctx) = 0;
  virtual void exitAssociated_name(AtemParser::Associated_nameContext *ctx) = 0;

  virtual void enterInitializer_list(AtemParser::Initializer_listContext *ctx) = 0;
  virtual void exitInitializer_list(AtemParser::Initializer_listContext *ctx) = 0;

  virtual void enterInitializer_member_list(AtemParser::Initializer_member_listContext *ctx) = 0;
  virtual void exitInitializer_member_list(AtemParser::Initializer_member_listContext *ctx) = 0;

  virtual void enterInitializer_member(AtemParser::Initializer_memberContext *ctx) = 0;
  virtual void exitInitializer_member(AtemParser::Initializer_memberContext *ctx) = 0;

  virtual void enterInitializer_type(AtemParser::Initializer_typeContext *ctx) = 0;
  virtual void exitInitializer_type(AtemParser::Initializer_typeContext *ctx) = 0;

  virtual void enterInitializer_members(AtemParser::Initializer_membersContext *ctx) = 0;
  virtual void exitInitializer_members(AtemParser::Initializer_membersContext *ctx) = 0;

  virtual void enterDeinitializer_list(AtemParser::Deinitializer_listContext *ctx) = 0;
  virtual void exitDeinitializer_list(AtemParser::Deinitializer_listContext *ctx) = 0;

  virtual void enterDeinitializer_member_list(AtemParser::Deinitializer_member_listContext *ctx) = 0;
  virtual void exitDeinitializer_member_list(AtemParser::Deinitializer_member_listContext *ctx) = 0;

  virtual void enterDeinitializer_member(AtemParser::Deinitializer_memberContext *ctx) = 0;
  virtual void exitDeinitializer_member(AtemParser::Deinitializer_memberContext *ctx) = 0;

  virtual void enterDeinitializer_type(AtemParser::Deinitializer_typeContext *ctx) = 0;
  virtual void exitDeinitializer_type(AtemParser::Deinitializer_typeContext *ctx) = 0;

  virtual void enterDeinitializer_members(AtemParser::Deinitializer_membersContext *ctx) = 0;
  virtual void exitDeinitializer_members(AtemParser::Deinitializer_membersContext *ctx) = 0;

  virtual void enterMember_list(AtemParser::Member_listContext *ctx) = 0;
  virtual void exitMember_list(AtemParser::Member_listContext *ctx) = 0;

  virtual void enterMember(AtemParser::MemberContext *ctx) = 0;
  virtual void exitMember(AtemParser::MemberContext *ctx) = 0;

  virtual void enterMembers(AtemParser::MembersContext *ctx) = 0;
  virtual void exitMembers(AtemParser::MembersContext *ctx) = 0;

  virtual void enterMember_nested_type(AtemParser::Member_nested_typeContext *ctx) = 0;
  virtual void exitMember_nested_type(AtemParser::Member_nested_typeContext *ctx) = 0;

  virtual void enterNested_class(AtemParser::Nested_classContext *ctx) = 0;
  virtual void exitNested_class(AtemParser::Nested_classContext *ctx) = 0;

  virtual void enterNested_struct(AtemParser::Nested_structContext *ctx) = 0;
  virtual void exitNested_struct(AtemParser::Nested_structContext *ctx) = 0;

  virtual void enterNested_protocol(AtemParser::Nested_protocolContext *ctx) = 0;
  virtual void exitNested_protocol(AtemParser::Nested_protocolContext *ctx) = 0;

  virtual void enterNested_union(AtemParser::Nested_unionContext *ctx) = 0;
  virtual void exitNested_union(AtemParser::Nested_unionContext *ctx) = 0;

  virtual void enterNested_enum(AtemParser::Nested_enumContext *ctx) = 0;
  virtual void exitNested_enum(AtemParser::Nested_enumContext *ctx) = 0;

  virtual void enterMember_type(AtemParser::Member_typeContext *ctx) = 0;
  virtual void exitMember_type(AtemParser::Member_typeContext *ctx) = 0;

  virtual void enterMember_variable(AtemParser::Member_variableContext *ctx) = 0;
  virtual void exitMember_variable(AtemParser::Member_variableContext *ctx) = 0;

  virtual void enterMember_constant(AtemParser::Member_constantContext *ctx) = 0;
  virtual void exitMember_constant(AtemParser::Member_constantContext *ctx) = 0;

  virtual void enterMember_function(AtemParser::Member_functionContext *ctx) = 0;
  virtual void exitMember_function(AtemParser::Member_functionContext *ctx) = 0;

  virtual void enterMember_declarator(AtemParser::Member_declaratorContext *ctx) = 0;
  virtual void exitMember_declarator(AtemParser::Member_declaratorContext *ctx) = 0;

  virtual void enterMember_name(AtemParser::Member_nameContext *ctx) = 0;
  virtual void exitMember_name(AtemParser::Member_nameContext *ctx) = 0;

  virtual void enterGetter_and_setter_list(AtemParser::Getter_and_setter_listContext *ctx) = 0;
  virtual void exitGetter_and_setter_list(AtemParser::Getter_and_setter_listContext *ctx) = 0;

  virtual void enterGetter_list(AtemParser::Getter_listContext *ctx) = 0;
  virtual void exitGetter_list(AtemParser::Getter_listContext *ctx) = 0;

  virtual void enterGetter_and_setter_item(AtemParser::Getter_and_setter_itemContext *ctx) = 0;
  virtual void exitGetter_and_setter_item(AtemParser::Getter_and_setter_itemContext *ctx) = 0;

  virtual void enterGetter_and_setter_items(AtemParser::Getter_and_setter_itemsContext *ctx) = 0;
  virtual void exitGetter_and_setter_items(AtemParser::Getter_and_setter_itemsContext *ctx) = 0;

  virtual void enterGetter_declaration(AtemParser::Getter_declarationContext *ctx) = 0;
  virtual void exitGetter_declaration(AtemParser::Getter_declarationContext *ctx) = 0;

  virtual void enterGetter_type(AtemParser::Getter_typeContext *ctx) = 0;
  virtual void exitGetter_type(AtemParser::Getter_typeContext *ctx) = 0;

  virtual void enterSetter_declaration(AtemParser::Setter_declarationContext *ctx) = 0;
  virtual void exitSetter_declaration(AtemParser::Setter_declarationContext *ctx) = 0;

  virtual void enterSetter_type(AtemParser::Setter_typeContext *ctx) = 0;
  virtual void exitSetter_type(AtemParser::Setter_typeContext *ctx) = 0;

  virtual void enterSetter_parameter_clause(AtemParser::Setter_parameter_clauseContext *ctx) = 0;
  virtual void exitSetter_parameter_clause(AtemParser::Setter_parameter_clauseContext *ctx) = 0;

  virtual void enterSetter_parameter(AtemParser::Setter_parameterContext *ctx) = 0;
  virtual void exitSetter_parameter(AtemParser::Setter_parameterContext *ctx) = 0;

  virtual void enterSetter_parameter_name(AtemParser::Setter_parameter_nameContext *ctx) = 0;
  virtual void exitSetter_parameter_name(AtemParser::Setter_parameter_nameContext *ctx) = 0;

  virtual void enterProtocol_declaration(AtemParser::Protocol_declarationContext *ctx) = 0;
  virtual void exitProtocol_declaration(AtemParser::Protocol_declarationContext *ctx) = 0;

  virtual void enterProtocol_extend_list(AtemParser::Protocol_extend_listContext *ctx) = 0;
  virtual void exitProtocol_extend_list(AtemParser::Protocol_extend_listContext *ctx) = 0;

  virtual void enterProtocol_requirement_list(AtemParser::Protocol_requirement_listContext *ctx) = 0;
  virtual void exitProtocol_requirement_list(AtemParser::Protocol_requirement_listContext *ctx) = 0;

  virtual void enterProtocol_requirement_item(AtemParser::Protocol_requirement_itemContext *ctx) = 0;
  virtual void exitProtocol_requirement_item(AtemParser::Protocol_requirement_itemContext *ctx) = 0;

  virtual void enterProtocol_requirement_items(AtemParser::Protocol_requirement_itemsContext *ctx) = 0;
  virtual void exitProtocol_requirement_items(AtemParser::Protocol_requirement_itemsContext *ctx) = 0;

  virtual void enterProtocol_requirement_type(AtemParser::Protocol_requirement_typeContext *ctx) = 0;
  virtual void exitProtocol_requirement_type(AtemParser::Protocol_requirement_typeContext *ctx) = 0;

  virtual void enterProtocol_requirement_function(AtemParser::Protocol_requirement_functionContext *ctx) = 0;
  virtual void exitProtocol_requirement_function(AtemParser::Protocol_requirement_functionContext *ctx) = 0;

  virtual void enterProtocol_requirement_variable(AtemParser::Protocol_requirement_variableContext *ctx) = 0;
  virtual void exitProtocol_requirement_variable(AtemParser::Protocol_requirement_variableContext *ctx) = 0;

  virtual void enterProtocol_requirement_constant(AtemParser::Protocol_requirement_constantContext *ctx) = 0;
  virtual void exitProtocol_requirement_constant(AtemParser::Protocol_requirement_constantContext *ctx) = 0;

  virtual void enterProtocol_requirement_initializer(AtemParser::Protocol_requirement_initializerContext *ctx) = 0;
  virtual void exitProtocol_requirement_initializer(AtemParser::Protocol_requirement_initializerContext *ctx) = 0;

  virtual void enterProtocol_requirement_deinitializer(AtemParser::Protocol_requirement_deinitializerContext *ctx) = 0;
  virtual void exitProtocol_requirement_deinitializer(AtemParser::Protocol_requirement_deinitializerContext *ctx) = 0;

  virtual void enterRequirement_declarator(AtemParser::Requirement_declaratorContext *ctx) = 0;
  virtual void exitRequirement_declarator(AtemParser::Requirement_declaratorContext *ctx) = 0;

  virtual void enterEmpty_requirement_declarator(AtemParser::Empty_requirement_declaratorContext *ctx) = 0;
  virtual void exitEmpty_requirement_declarator(AtemParser::Empty_requirement_declaratorContext *ctx) = 0;

  virtual void enterRequirement_name(AtemParser::Requirement_nameContext *ctx) = 0;
  virtual void exitRequirement_name(AtemParser::Requirement_nameContext *ctx) = 0;

  virtual void enterRequirement_default_clause(AtemParser::Requirement_default_clauseContext *ctx) = 0;
  virtual void exitRequirement_default_clause(AtemParser::Requirement_default_clauseContext *ctx) = 0;

  virtual void enterRequirement_getter_and_setter(AtemParser::Requirement_getter_and_setterContext *ctx) = 0;
  virtual void exitRequirement_getter_and_setter(AtemParser::Requirement_getter_and_setterContext *ctx) = 0;

  virtual void enterRequirement_getter(AtemParser::Requirement_getterContext *ctx) = 0;
  virtual void exitRequirement_getter(AtemParser::Requirement_getterContext *ctx) = 0;

  virtual void enterRequirement_getter_and_setter_item(AtemParser::Requirement_getter_and_setter_itemContext *ctx) = 0;
  virtual void exitRequirement_getter_and_setter_item(AtemParser::Requirement_getter_and_setter_itemContext *ctx) = 0;

  virtual void enterInitializer_declaration(AtemParser::Initializer_declarationContext *ctx) = 0;
  virtual void exitInitializer_declaration(AtemParser::Initializer_declarationContext *ctx) = 0;

  virtual void enterDeinitializer_declaration(AtemParser::Deinitializer_declarationContext *ctx) = 0;
  virtual void exitDeinitializer_declaration(AtemParser::Deinitializer_declarationContext *ctx) = 0;

  virtual void enterUnion_declaration(AtemParser::Union_declarationContext *ctx) = 0;
  virtual void exitUnion_declaration(AtemParser::Union_declarationContext *ctx) = 0;

  virtual void enterEnum_declaration(AtemParser::Enum_declarationContext *ctx) = 0;
  virtual void exitEnum_declaration(AtemParser::Enum_declarationContext *ctx) = 0;

  virtual void enterEnumerator_list(AtemParser::Enumerator_listContext *ctx) = 0;
  virtual void exitEnumerator_list(AtemParser::Enumerator_listContext *ctx) = 0;

  virtual void enterEnumeration_item(AtemParser::Enumeration_itemContext *ctx) = 0;
  virtual void exitEnumeration_item(AtemParser::Enumeration_itemContext *ctx) = 0;

  virtual void enterEnumerator(AtemParser::EnumeratorContext *ctx) = 0;
  virtual void exitEnumerator(AtemParser::EnumeratorContext *ctx) = 0;

  virtual void enterEnumerator_associated_value_clause(AtemParser::Enumerator_associated_value_clauseContext *ctx) = 0;
  virtual void exitEnumerator_associated_value_clause(AtemParser::Enumerator_associated_value_clauseContext *ctx) = 0;

  virtual void enterEnumerator_associated_value_list(AtemParser::Enumerator_associated_value_listContext *ctx) = 0;
  virtual void exitEnumerator_associated_value_list(AtemParser::Enumerator_associated_value_listContext *ctx) = 0;

  virtual void enterEnumerator_associated_value(AtemParser::Enumerator_associated_valueContext *ctx) = 0;
  virtual void exitEnumerator_associated_value(AtemParser::Enumerator_associated_valueContext *ctx) = 0;

  virtual void enterEnumerator_associated_value_name(AtemParser::Enumerator_associated_value_nameContext *ctx) = 0;
  virtual void exitEnumerator_associated_value_name(AtemParser::Enumerator_associated_value_nameContext *ctx) = 0;

  virtual void enterEnumerator_representation(AtemParser::Enumerator_representationContext *ctx) = 0;
  virtual void exitEnumerator_representation(AtemParser::Enumerator_representationContext *ctx) = 0;

  virtual void enterEnumerator_name(AtemParser::Enumerator_nameContext *ctx) = 0;
  virtual void exitEnumerator_name(AtemParser::Enumerator_nameContext *ctx) = 0;

  virtual void enterImport_alias_declaration(AtemParser::Import_alias_declarationContext *ctx) = 0;
  virtual void exitImport_alias_declaration(AtemParser::Import_alias_declarationContext *ctx) = 0;

  virtual void enterImport_expression(AtemParser::Import_expressionContext *ctx) = 0;
  virtual void exitImport_expression(AtemParser::Import_expressionContext *ctx) = 0;

  virtual void enterImport_statement(AtemParser::Import_statementContext *ctx) = 0;
  virtual void exitImport_statement(AtemParser::Import_statementContext *ctx) = 0;

  virtual void enterImport_path_expression_list(AtemParser::Import_path_expression_listContext *ctx) = 0;
  virtual void exitImport_path_expression_list(AtemParser::Import_path_expression_listContext *ctx) = 0;

  virtual void enterImport_path_expression(AtemParser::Import_path_expressionContext *ctx) = 0;
  virtual void exitImport_path_expression(AtemParser::Import_path_expressionContext *ctx) = 0;

  virtual void enterImport_path_expression_element(AtemParser::Import_path_expression_elementContext *ctx) = 0;
  virtual void exitImport_path_expression_element(AtemParser::Import_path_expression_elementContext *ctx) = 0;

  virtual void enterImport_element_list(AtemParser::Import_element_listContext *ctx) = 0;
  virtual void exitImport_element_list(AtemParser::Import_element_listContext *ctx) = 0;

  virtual void enterImport_kind(AtemParser::Import_kindContext *ctx) = 0;
  virtual void exitImport_kind(AtemParser::Import_kindContext *ctx) = 0;

  virtual void enterProject_declaration(AtemParser::Project_declarationContext *ctx) = 0;
  virtual void exitProject_declaration(AtemParser::Project_declarationContext *ctx) = 0;

  virtual void enterProject_member_list(AtemParser::Project_member_listContext *ctx) = 0;
  virtual void exitProject_member_list(AtemParser::Project_member_listContext *ctx) = 0;

  virtual void enterProject_member(AtemParser::Project_memberContext *ctx) = 0;
  virtual void exitProject_member(AtemParser::Project_memberContext *ctx) = 0;

  virtual void enterProject_members(AtemParser::Project_membersContext *ctx) = 0;
  virtual void exitProject_members(AtemParser::Project_membersContext *ctx) = 0;

  virtual void enterPackage_declaration(AtemParser::Package_declarationContext *ctx) = 0;
  virtual void exitPackage_declaration(AtemParser::Package_declarationContext *ctx) = 0;

  virtual void enterPackage_member_list(AtemParser::Package_member_listContext *ctx) = 0;
  virtual void exitPackage_member_list(AtemParser::Package_member_listContext *ctx) = 0;

  virtual void enterPackage_member(AtemParser::Package_memberContext *ctx) = 0;
  virtual void exitPackage_member(AtemParser::Package_memberContext *ctx) = 0;

  virtual void enterPackage_members(AtemParser::Package_membersContext *ctx) = 0;
  virtual void exitPackage_members(AtemParser::Package_membersContext *ctx) = 0;

  virtual void enterModule_declaration(AtemParser::Module_declarationContext *ctx) = 0;
  virtual void exitModule_declaration(AtemParser::Module_declarationContext *ctx) = 0;

  virtual void enterNamespace_declaration(AtemParser::Namespace_declarationContext *ctx) = 0;
  virtual void exitNamespace_declaration(AtemParser::Namespace_declarationContext *ctx) = 0;

  virtual void enterTypealias_declaration(AtemParser::Typealias_declarationContext *ctx) = 0;
  virtual void exitTypealias_declaration(AtemParser::Typealias_declarationContext *ctx) = 0;

  virtual void enterAccess_level_specifier(AtemParser::Access_level_specifierContext *ctx) = 0;
  virtual void exitAccess_level_specifier(AtemParser::Access_level_specifierContext *ctx) = 0;

  virtual void enterFunction_declaration(AtemParser::Function_declarationContext *ctx) = 0;
  virtual void exitFunction_declaration(AtemParser::Function_declarationContext *ctx) = 0;

  virtual void enterFunction_body(AtemParser::Function_bodyContext *ctx) = 0;
  virtual void exitFunction_body(AtemParser::Function_bodyContext *ctx) = 0;

  virtual void enterContract_list(AtemParser::Contract_listContext *ctx) = 0;
  virtual void exitContract_list(AtemParser::Contract_listContext *ctx) = 0;

  virtual void enterContract(AtemParser::ContractContext *ctx) = 0;
  virtual void exitContract(AtemParser::ContractContext *ctx) = 0;

  virtual void enterContract_precondition(AtemParser::Contract_preconditionContext *ctx) = 0;
  virtual void exitContract_precondition(AtemParser::Contract_preconditionContext *ctx) = 0;

  virtual void enterContract_postcondition(AtemParser::Contract_postconditionContext *ctx) = 0;
  virtual void exitContract_postcondition(AtemParser::Contract_postconditionContext *ctx) = 0;

  virtual void enterReturn_value_name(AtemParser::Return_value_nameContext *ctx) = 0;
  virtual void exitReturn_value_name(AtemParser::Return_value_nameContext *ctx) = 0;

  virtual void enterFunction_name(AtemParser::Function_nameContext *ctx) = 0;
  virtual void exitFunction_name(AtemParser::Function_nameContext *ctx) = 0;

  virtual void enterFunction_type(AtemParser::Function_typeContext *ctx) = 0;
  virtual void exitFunction_type(AtemParser::Function_typeContext *ctx) = 0;

  virtual void enterFunction_specifier(AtemParser::Function_specifierContext *ctx) = 0;
  virtual void exitFunction_specifier(AtemParser::Function_specifierContext *ctx) = 0;

  virtual void enterFunction_specifiers(AtemParser::Function_specifiersContext *ctx) = 0;
  virtual void exitFunction_specifiers(AtemParser::Function_specifiersContext *ctx) = 0;

  virtual void enterFunction_result(AtemParser::Function_resultContext *ctx) = 0;
  virtual void exitFunction_result(AtemParser::Function_resultContext *ctx) = 0;

  virtual void enterFunction_parameter_clause(AtemParser::Function_parameter_clauseContext *ctx) = 0;
  virtual void exitFunction_parameter_clause(AtemParser::Function_parameter_clauseContext *ctx) = 0;

  virtual void enterFunction_parameter_list(AtemParser::Function_parameter_listContext *ctx) = 0;
  virtual void exitFunction_parameter_list(AtemParser::Function_parameter_listContext *ctx) = 0;

  virtual void enterFunction_parameter(AtemParser::Function_parameterContext *ctx) = 0;
  virtual void exitFunction_parameter(AtemParser::Function_parameterContext *ctx) = 0;

  virtual void enterFunction_parameter_label(AtemParser::Function_parameter_labelContext *ctx) = 0;
  virtual void exitFunction_parameter_label(AtemParser::Function_parameter_labelContext *ctx) = 0;

  virtual void enterFunction_parameter_name(AtemParser::Function_parameter_nameContext *ctx) = 0;
  virtual void exitFunction_parameter_name(AtemParser::Function_parameter_nameContext *ctx) = 0;

  virtual void enterDefault_argument_clause(AtemParser::Default_argument_clauseContext *ctx) = 0;
  virtual void exitDefault_argument_clause(AtemParser::Default_argument_clauseContext *ctx) = 0;

  virtual void enterType_annotation(AtemParser::Type_annotationContext *ctx) = 0;
  virtual void exitType_annotation(AtemParser::Type_annotationContext *ctx) = 0;

  virtual void enterVariable_declaration(AtemParser::Variable_declarationContext *ctx) = 0;
  virtual void exitVariable_declaration(AtemParser::Variable_declarationContext *ctx) = 0;

  virtual void enterConstant_declaration(AtemParser::Constant_declarationContext *ctx) = 0;
  virtual void exitConstant_declaration(AtemParser::Constant_declarationContext *ctx) = 0;

  virtual void enterStorage_level_specifier(AtemParser::Storage_level_specifierContext *ctx) = 0;
  virtual void exitStorage_level_specifier(AtemParser::Storage_level_specifierContext *ctx) = 0;

  virtual void enterClosure_expression(AtemParser::Closure_expressionContext *ctx) = 0;
  virtual void exitClosure_expression(AtemParser::Closure_expressionContext *ctx) = 0;

  virtual void enterCapture_list(AtemParser::Capture_listContext *ctx) = 0;
  virtual void exitCapture_list(AtemParser::Capture_listContext *ctx) = 0;

  virtual void enterCapture_list_items(AtemParser::Capture_list_itemsContext *ctx) = 0;
  virtual void exitCapture_list_items(AtemParser::Capture_list_itemsContext *ctx) = 0;

  virtual void enterCapture_list_item(AtemParser::Capture_list_itemContext *ctx) = 0;
  virtual void exitCapture_list_item(AtemParser::Capture_list_itemContext *ctx) = 0;

  virtual void enterDefer_statement(AtemParser::Defer_statementContext *ctx) = 0;
  virtual void exitDefer_statement(AtemParser::Defer_statementContext *ctx) = 0;

  virtual void enterDefer_kind(AtemParser::Defer_kindContext *ctx) = 0;
  virtual void exitDefer_kind(AtemParser::Defer_kindContext *ctx) = 0;

  virtual void enterCode_block_no_label(AtemParser::Code_block_no_labelContext *ctx) = 0;
  virtual void exitCode_block_no_label(AtemParser::Code_block_no_labelContext *ctx) = 0;

  virtual void enterCode_block(AtemParser::Code_blockContext *ctx) = 0;
  virtual void exitCode_block(AtemParser::Code_blockContext *ctx) = 0;

  virtual void enterCode_block_name(AtemParser::Code_block_nameContext *ctx) = 0;
  virtual void exitCode_block_name(AtemParser::Code_block_nameContext *ctx) = 0;

  virtual void enterAttribute(AtemParser::AttributeContext *ctx) = 0;
  virtual void exitAttribute(AtemParser::AttributeContext *ctx) = 0;

  virtual void enterAttributes(AtemParser::AttributesContext *ctx) = 0;
  virtual void exitAttributes(AtemParser::AttributesContext *ctx) = 0;

  virtual void enterAttribute_name(AtemParser::Attribute_nameContext *ctx) = 0;
  virtual void exitAttribute_name(AtemParser::Attribute_nameContext *ctx) = 0;

  virtual void enterFunction_call_operator(AtemParser::Function_call_operatorContext *ctx) = 0;
  virtual void exitFunction_call_operator(AtemParser::Function_call_operatorContext *ctx) = 0;

  virtual void enterFunction_call_argument_clause(AtemParser::Function_call_argument_clauseContext *ctx) = 0;
  virtual void exitFunction_call_argument_clause(AtemParser::Function_call_argument_clauseContext *ctx) = 0;

  virtual void enterFunction_call_argument_list(AtemParser::Function_call_argument_listContext *ctx) = 0;
  virtual void exitFunction_call_argument_list(AtemParser::Function_call_argument_listContext *ctx) = 0;

  virtual void enterFunction_call_argument(AtemParser::Function_call_argumentContext *ctx) = 0;
  virtual void exitFunction_call_argument(AtemParser::Function_call_argumentContext *ctx) = 0;

  virtual void enterArgument_name(AtemParser::Argument_nameContext *ctx) = 0;
  virtual void exitArgument_name(AtemParser::Argument_nameContext *ctx) = 0;

  virtual void enterArgument_names(AtemParser::Argument_namesContext *ctx) = 0;
  virtual void exitArgument_names(AtemParser::Argument_namesContext *ctx) = 0;

  virtual void enterTrailing_closures(AtemParser::Trailing_closuresContext *ctx) = 0;
  virtual void exitTrailing_closures(AtemParser::Trailing_closuresContext *ctx) = 0;

  virtual void enterLabeled_trailing_closure(AtemParser::Labeled_trailing_closureContext *ctx) = 0;
  virtual void exitLabeled_trailing_closure(AtemParser::Labeled_trailing_closureContext *ctx) = 0;

  virtual void enterLabeled_trailing_closures(AtemParser::Labeled_trailing_closuresContext *ctx) = 0;
  virtual void exitLabeled_trailing_closures(AtemParser::Labeled_trailing_closuresContext *ctx) = 0;

  virtual void enterArithmetic_operator(AtemParser::Arithmetic_operatorContext *ctx) = 0;
  virtual void exitArithmetic_operator(AtemParser::Arithmetic_operatorContext *ctx) = 0;

  virtual void enterNegation_operator(AtemParser::Negation_operatorContext *ctx) = 0;
  virtual void exitNegation_operator(AtemParser::Negation_operatorContext *ctx) = 0;

  virtual void enterAssignment_operator(AtemParser::Assignment_operatorContext *ctx) = 0;
  virtual void exitAssignment_operator(AtemParser::Assignment_operatorContext *ctx) = 0;

  virtual void enterComparison_operator(AtemParser::Comparison_operatorContext *ctx) = 0;
  virtual void exitComparison_operator(AtemParser::Comparison_operatorContext *ctx) = 0;

  virtual void enterBinary_boolean_operator(AtemParser::Binary_boolean_operatorContext *ctx) = 0;
  virtual void exitBinary_boolean_operator(AtemParser::Binary_boolean_operatorContext *ctx) = 0;

  virtual void enterUnary_boolean_operator(AtemParser::Unary_boolean_operatorContext *ctx) = 0;
  virtual void exitUnary_boolean_operator(AtemParser::Unary_boolean_operatorContext *ctx) = 0;

  virtual void enterBinary_bit_operator(AtemParser::Binary_bit_operatorContext *ctx) = 0;
  virtual void exitBinary_bit_operator(AtemParser::Binary_bit_operatorContext *ctx) = 0;

  virtual void enterUnary_bit_operator(AtemParser::Unary_bit_operatorContext *ctx) = 0;
  virtual void exitUnary_bit_operator(AtemParser::Unary_bit_operatorContext *ctx) = 0;

  virtual void enterPointer_operator(AtemParser::Pointer_operatorContext *ctx) = 0;
  virtual void exitPointer_operator(AtemParser::Pointer_operatorContext *ctx) = 0;

  virtual void enterReflect_operator(AtemParser::Reflect_operatorContext *ctx) = 0;
  virtual void exitReflect_operator(AtemParser::Reflect_operatorContext *ctx) = 0;

  virtual void enterRange_operator(AtemParser::Range_operatorContext *ctx) = 0;
  virtual void exitRange_operator(AtemParser::Range_operatorContext *ctx) = 0;

  virtual void enterBinary_optional_unwrapping_operator(AtemParser::Binary_optional_unwrapping_operatorContext *ctx) = 0;
  virtual void exitBinary_optional_unwrapping_operator(AtemParser::Binary_optional_unwrapping_operatorContext *ctx) = 0;

  virtual void enterUnary_optional_unwrapping_operator(AtemParser::Unary_optional_unwrapping_operatorContext *ctx) = 0;
  virtual void exitUnary_optional_unwrapping_operator(AtemParser::Unary_optional_unwrapping_operatorContext *ctx) = 0;

  virtual void enterArrow_operator(AtemParser::Arrow_operatorContext *ctx) = 0;
  virtual void exitArrow_operator(AtemParser::Arrow_operatorContext *ctx) = 0;

  virtual void enterTry_operator(AtemParser::Try_operatorContext *ctx) = 0;
  virtual void exitTry_operator(AtemParser::Try_operatorContext *ctx) = 0;

  virtual void enterType_casting_operator(AtemParser::Type_casting_operatorContext *ctx) = 0;
  virtual void exitType_casting_operator(AtemParser::Type_casting_operatorContext *ctx) = 0;

  virtual void enterAwait_operator(AtemParser::Await_operatorContext *ctx) = 0;
  virtual void exitAwait_operator(AtemParser::Await_operatorContext *ctx) = 0;

  virtual void enterAsync_operator(AtemParser::Async_operatorContext *ctx) = 0;
  virtual void exitAsync_operator(AtemParser::Async_operatorContext *ctx) = 0;

  virtual void enterPipeline_operator(AtemParser::Pipeline_operatorContext *ctx) = 0;
  virtual void exitPipeline_operator(AtemParser::Pipeline_operatorContext *ctx) = 0;

  virtual void enterUsing_expression_(AtemParser::Using_expression_Context *ctx) = 0;
  virtual void exitUsing_expression_(AtemParser::Using_expression_Context *ctx) = 0;

  virtual void enterFor_expression_(AtemParser::For_expression_Context *ctx) = 0;
  virtual void exitFor_expression_(AtemParser::For_expression_Context *ctx) = 0;

  virtual void enterContinue_expression_(AtemParser::Continue_expression_Context *ctx) = 0;
  virtual void exitContinue_expression_(AtemParser::Continue_expression_Context *ctx) = 0;

  virtual void enterCatch_expression_(AtemParser::Catch_expression_Context *ctx) = 0;
  virtual void exitCatch_expression_(AtemParser::Catch_expression_Context *ctx) = 0;

  virtual void enterThrow_expression_(AtemParser::Throw_expression_Context *ctx) = 0;
  virtual void exitThrow_expression_(AtemParser::Throw_expression_Context *ctx) = 0;

  virtual void enterBinary_optional_unwrapping_expression_(AtemParser::Binary_optional_unwrapping_expression_Context *ctx) = 0;
  virtual void exitBinary_optional_unwrapping_expression_(AtemParser::Binary_optional_unwrapping_expression_Context *ctx) = 0;

  virtual void enterDeclaretion_expression_(AtemParser::Declaretion_expression_Context *ctx) = 0;
  virtual void exitDeclaretion_expression_(AtemParser::Declaretion_expression_Context *ctx) = 0;

  virtual void enterImport_expression_(AtemParser::Import_expression_Context *ctx) = 0;
  virtual void exitImport_expression_(AtemParser::Import_expression_Context *ctx) = 0;

  virtual void enterComma_expression_(AtemParser::Comma_expression_Context *ctx) = 0;
  virtual void exitComma_expression_(AtemParser::Comma_expression_Context *ctx) = 0;

  virtual void enterLiteral_expression_(AtemParser::Literal_expression_Context *ctx) = 0;
  virtual void exitLiteral_expression_(AtemParser::Literal_expression_Context *ctx) = 0;

  virtual void enterSelf_expression_(AtemParser::Self_expression_Context *ctx) = 0;
  virtual void exitSelf_expression_(AtemParser::Self_expression_Context *ctx) = 0;

  virtual void enterFunction_call_expresison_(AtemParser::Function_call_expresison_Context *ctx) = 0;
  virtual void exitFunction_call_expresison_(AtemParser::Function_call_expresison_Context *ctx) = 0;

  virtual void enterComptime_expression_(AtemParser::Comptime_expression_Context *ctx) = 0;
  virtual void exitComptime_expression_(AtemParser::Comptime_expression_Context *ctx) = 0;

  virtual void enterUnary_optional_unwrapping_expression_(AtemParser::Unary_optional_unwrapping_expression_Context *ctx) = 0;
  virtual void exitUnary_optional_unwrapping_expression_(AtemParser::Unary_optional_unwrapping_expression_Context *ctx) = 0;

  virtual void enterUnreachable_expression_(AtemParser::Unreachable_expression_Context *ctx) = 0;
  virtual void exitUnreachable_expression_(AtemParser::Unreachable_expression_Context *ctx) = 0;

  virtual void enterDerefence_expression_(AtemParser::Derefence_expression_Context *ctx) = 0;
  virtual void exitDerefence_expression_(AtemParser::Derefence_expression_Context *ctx) = 0;

  virtual void enterWith_expression_(AtemParser::With_expression_Context *ctx) = 0;
  virtual void exitWith_expression_(AtemParser::With_expression_Context *ctx) = 0;

  virtual void enterType_expression_(AtemParser::Type_expression_Context *ctx) = 0;
  virtual void exitType_expression_(AtemParser::Type_expression_Context *ctx) = 0;

  virtual void enterIf_expression_(AtemParser::If_expression_Context *ctx) = 0;
  virtual void exitIf_expression_(AtemParser::If_expression_Context *ctx) = 0;

  virtual void enterMatch_expression_(AtemParser::Match_expression_Context *ctx) = 0;
  virtual void exitMatch_expression_(AtemParser::Match_expression_Context *ctx) = 0;

  virtual void enterObject_address_expression_(AtemParser::Object_address_expression_Context *ctx) = 0;
  virtual void exitObject_address_expression_(AtemParser::Object_address_expression_Context *ctx) = 0;

  virtual void enterBit_expression_(AtemParser::Bit_expression_Context *ctx) = 0;
  virtual void exitBit_expression_(AtemParser::Bit_expression_Context *ctx) = 0;

  virtual void enterNegation_expression_(AtemParser::Negation_expression_Context *ctx) = 0;
  virtual void exitNegation_expression_(AtemParser::Negation_expression_Context *ctx) = 0;

  virtual void enterPlaceholder_expression_(AtemParser::Placeholder_expression_Context *ctx) = 0;
  virtual void exitPlaceholder_expression_(AtemParser::Placeholder_expression_Context *ctx) = 0;

  virtual void enterAssignment_expression_(AtemParser::Assignment_expression_Context *ctx) = 0;
  virtual void exitAssignment_expression_(AtemParser::Assignment_expression_Context *ctx) = 0;

  virtual void enterField_expression_(AtemParser::Field_expression_Context *ctx) = 0;
  virtual void exitField_expression_(AtemParser::Field_expression_Context *ctx) = 0;

  virtual void enterRepeat_while_expression_(AtemParser::Repeat_while_expression_Context *ctx) = 0;
  virtual void exitRepeat_while_expression_(AtemParser::Repeat_while_expression_Context *ctx) = 0;

  virtual void enterComparison_expression_(AtemParser::Comparison_expression_Context *ctx) = 0;
  virtual void exitComparison_expression_(AtemParser::Comparison_expression_Context *ctx) = 0;

  virtual void enterBreak_expression_(AtemParser::Break_expression_Context *ctx) = 0;
  virtual void exitBreak_expression_(AtemParser::Break_expression_Context *ctx) = 0;

  virtual void enterPath_expression_(AtemParser::Path_expression_Context *ctx) = 0;
  virtual void exitPath_expression_(AtemParser::Path_expression_Context *ctx) = 0;

  virtual void enterReflection_expression_(AtemParser::Reflection_expression_Context *ctx) = 0;
  virtual void exitReflection_expression_(AtemParser::Reflection_expression_Context *ctx) = 0;

  virtual void enterTry_expression_(AtemParser::Try_expression_Context *ctx) = 0;
  virtual void exitTry_expression_(AtemParser::Try_expression_Context *ctx) = 0;

  virtual void enterBoolean_expression_(AtemParser::Boolean_expression_Context *ctx) = 0;
  virtual void exitBoolean_expression_(AtemParser::Boolean_expression_Context *ctx) = 0;

  virtual void enterArithmetic_expression_(AtemParser::Arithmetic_expression_Context *ctx) = 0;
  virtual void exitArithmetic_expression_(AtemParser::Arithmetic_expression_Context *ctx) = 0;

  virtual void enterRange_expression_(AtemParser::Range_expression_Context *ctx) = 0;
  virtual void exitRange_expression_(AtemParser::Range_expression_Context *ctx) = 0;

  virtual void enterFallthrough_expression_(AtemParser::Fallthrough_expression_Context *ctx) = 0;
  virtual void exitFallthrough_expression_(AtemParser::Fallthrough_expression_Context *ctx) = 0;

  virtual void enterMember_function_call_expression_(AtemParser::Member_function_call_expression_Context *ctx) = 0;
  virtual void exitMember_function_call_expression_(AtemParser::Member_function_call_expression_Context *ctx) = 0;

  virtual void enterInit_expression_(AtemParser::Init_expression_Context *ctx) = 0;
  virtual void exitInit_expression_(AtemParser::Init_expression_Context *ctx) = 0;

  virtual void enterDeinit_expression_(AtemParser::Deinit_expression_Context *ctx) = 0;
  virtual void exitDeinit_expression_(AtemParser::Deinit_expression_Context *ctx) = 0;

  virtual void enterAwait_expression_(AtemParser::Await_expression_Context *ctx) = 0;
  virtual void exitAwait_expression_(AtemParser::Await_expression_Context *ctx) = 0;

  virtual void enterPipeline_expression_(AtemParser::Pipeline_expression_Context *ctx) = 0;
  virtual void exitPipeline_expression_(AtemParser::Pipeline_expression_Context *ctx) = 0;

  virtual void enterWhile_expression_(AtemParser::While_expression_Context *ctx) = 0;
  virtual void exitWhile_expression_(AtemParser::While_expression_Context *ctx) = 0;

  virtual void enterParentheses_expression_(AtemParser::Parentheses_expression_Context *ctx) = 0;
  virtual void exitParentheses_expression_(AtemParser::Parentheses_expression_Context *ctx) = 0;

  virtual void enterAsync_expression_(AtemParser::Async_expression_Context *ctx) = 0;
  virtual void exitAsync_expression_(AtemParser::Async_expression_Context *ctx) = 0;

  virtual void enterType_cast_expression_(AtemParser::Type_cast_expression_Context *ctx) = 0;
  virtual void exitType_cast_expression_(AtemParser::Type_cast_expression_Context *ctx) = 0;

  virtual void enterAnonymous_field_expression_(AtemParser::Anonymous_field_expression_Context *ctx) = 0;
  virtual void exitAnonymous_field_expression_(AtemParser::Anonymous_field_expression_Context *ctx) = 0;

  virtual void enterReturn_expression_(AtemParser::Return_expression_Context *ctx) = 0;
  virtual void exitReturn_expression_(AtemParser::Return_expression_Context *ctx) = 0;

  virtual void enterAssert_expression_(AtemParser::Assert_expression_Context *ctx) = 0;
  virtual void exitAssert_expression_(AtemParser::Assert_expression_Context *ctx) = 0;

  virtual void enterClosure_expression_(AtemParser::Closure_expression_Context *ctx) = 0;
  virtual void exitClosure_expression_(AtemParser::Closure_expression_Context *ctx) = 0;

  virtual void enterUse_in_expression_(AtemParser::Use_in_expression_Context *ctx) = 0;
  virtual void exitUse_in_expression_(AtemParser::Use_in_expression_Context *ctx) = 0;

  virtual void enterCode_block_expression_(AtemParser::Code_block_expression_Context *ctx) = 0;
  virtual void exitCode_block_expression_(AtemParser::Code_block_expression_Context *ctx) = 0;

  virtual void enterCode_block_expression(AtemParser::Code_block_expressionContext *ctx) = 0;
  virtual void exitCode_block_expression(AtemParser::Code_block_expressionContext *ctx) = 0;

  virtual void enterRequire_clause(AtemParser::Require_clauseContext *ctx) = 0;
  virtual void exitRequire_clause(AtemParser::Require_clauseContext *ctx) = 0;

  virtual void enterThen_expression_or_block(AtemParser::Then_expression_or_blockContext *ctx) = 0;
  virtual void exitThen_expression_or_block(AtemParser::Then_expression_or_blockContext *ctx) = 0;

  virtual void enterExpression_or_block(AtemParser::Expression_or_blockContext *ctx) = 0;
  virtual void exitExpression_or_block(AtemParser::Expression_or_blockContext *ctx) = 0;

  virtual void enterIf_expression(AtemParser::If_expressionContext *ctx) = 0;
  virtual void exitIf_expression(AtemParser::If_expressionContext *ctx) = 0;

  virtual void enterWhile_expression(AtemParser::While_expressionContext *ctx) = 0;
  virtual void exitWhile_expression(AtemParser::While_expressionContext *ctx) = 0;

  virtual void enterRepeat_while_expression(AtemParser::Repeat_while_expressionContext *ctx) = 0;
  virtual void exitRepeat_while_expression(AtemParser::Repeat_while_expressionContext *ctx) = 0;

  virtual void enterFor_expression(AtemParser::For_expressionContext *ctx) = 0;
  virtual void exitFor_expression(AtemParser::For_expressionContext *ctx) = 0;

  virtual void enterMatch_case(AtemParser::Match_caseContext *ctx) = 0;
  virtual void exitMatch_case(AtemParser::Match_caseContext *ctx) = 0;

  virtual void enterMatch_case_label(AtemParser::Match_case_labelContext *ctx) = 0;
  virtual void exitMatch_case_label(AtemParser::Match_case_labelContext *ctx) = 0;

  virtual void enterMatch_item_list(AtemParser::Match_item_listContext *ctx) = 0;
  virtual void exitMatch_item_list(AtemParser::Match_item_listContext *ctx) = 0;

  virtual void enterType_expression(AtemParser::Type_expressionContext *ctx) = 0;
  virtual void exitType_expression(AtemParser::Type_expressionContext *ctx) = 0;

  virtual void enterBasic_type(AtemParser::Basic_typeContext *ctx) = 0;
  virtual void exitBasic_type(AtemParser::Basic_typeContext *ctx) = 0;

  virtual void enterCollection_type(AtemParser::Collection_typeContext *ctx) = 0;
  virtual void exitCollection_type(AtemParser::Collection_typeContext *ctx) = 0;

  virtual void enterNever_type(AtemParser::Never_typeContext *ctx) = 0;
  virtual void exitNever_type(AtemParser::Never_typeContext *ctx) = 0;

  virtual void enterTuple_type(AtemParser::Tuple_typeContext *ctx) = 0;
  virtual void exitTuple_type(AtemParser::Tuple_typeContext *ctx) = 0;

  virtual void enterTuple_type_element(AtemParser::Tuple_type_elementContext *ctx) = 0;
  virtual void exitTuple_type_element(AtemParser::Tuple_type_elementContext *ctx) = 0;

  virtual void enterOptional_type(AtemParser::Optional_typeContext *ctx) = 0;
  virtual void exitOptional_type(AtemParser::Optional_typeContext *ctx) = 0;

  virtual void enterAny_type(AtemParser::Any_typeContext *ctx) = 0;
  virtual void exitAny_type(AtemParser::Any_typeContext *ctx) = 0;

  virtual void enterSome_type(AtemParser::Some_typeContext *ctx) = 0;
  virtual void exitSome_type(AtemParser::Some_typeContext *ctx) = 0;

  virtual void enterStatic_array_type(AtemParser::Static_array_typeContext *ctx) = 0;
  virtual void exitStatic_array_type(AtemParser::Static_array_typeContext *ctx) = 0;

  virtual void enterDynamic_array_type(AtemParser::Dynamic_array_typeContext *ctx) = 0;
  virtual void exitDynamic_array_type(AtemParser::Dynamic_array_typeContext *ctx) = 0;

  virtual void enterMap_type(AtemParser::Map_typeContext *ctx) = 0;
  virtual void exitMap_type(AtemParser::Map_typeContext *ctx) = 0;

  virtual void enterSet_type(AtemParser::Set_typeContext *ctx) = 0;
  virtual void exitSet_type(AtemParser::Set_typeContext *ctx) = 0;

  virtual void enterSimple_type(AtemParser::Simple_typeContext *ctx) = 0;
  virtual void exitSimple_type(AtemParser::Simple_typeContext *ctx) = 0;

  virtual void enterInteger_type(AtemParser::Integer_typeContext *ctx) = 0;
  virtual void exitInteger_type(AtemParser::Integer_typeContext *ctx) = 0;

  virtual void enterFloating_point_type(AtemParser::Floating_point_typeContext *ctx) = 0;
  virtual void exitFloating_point_type(AtemParser::Floating_point_typeContext *ctx) = 0;

  virtual void enterBoolean_type(AtemParser::Boolean_typeContext *ctx) = 0;
  virtual void exitBoolean_type(AtemParser::Boolean_typeContext *ctx) = 0;

  virtual void enterByte_type(AtemParser::Byte_typeContext *ctx) = 0;
  virtual void exitByte_type(AtemParser::Byte_typeContext *ctx) = 0;

  virtual void enterUnit_type(AtemParser::Unit_typeContext *ctx) = 0;
  virtual void exitUnit_type(AtemParser::Unit_typeContext *ctx) = 0;

  virtual void enterCharacter_type(AtemParser::Character_typeContext *ctx) = 0;
  virtual void exitCharacter_type(AtemParser::Character_typeContext *ctx) = 0;

  virtual void enterString_type(AtemParser::String_typeContext *ctx) = 0;
  virtual void exitString_type(AtemParser::String_typeContext *ctx) = 0;

  virtual void enterComptime_type(AtemParser::Comptime_typeContext *ctx) = 0;
  virtual void exitComptime_type(AtemParser::Comptime_typeContext *ctx) = 0;

  virtual void enterType_type(AtemParser::Type_typeContext *ctx) = 0;
  virtual void exitType_type(AtemParser::Type_typeContext *ctx) = 0;

  virtual void enterTuple_expression(AtemParser::Tuple_expressionContext *ctx) = 0;
  virtual void exitTuple_expression(AtemParser::Tuple_expressionContext *ctx) = 0;

  virtual void enterTuple_element_list(AtemParser::Tuple_element_listContext *ctx) = 0;
  virtual void exitTuple_element_list(AtemParser::Tuple_element_listContext *ctx) = 0;

  virtual void enterTuple_element(AtemParser::Tuple_elementContext *ctx) = 0;
  virtual void exitTuple_element(AtemParser::Tuple_elementContext *ctx) = 0;

  virtual void enterPath_expression(AtemParser::Path_expressionContext *ctx) = 0;
  virtual void exitPath_expression(AtemParser::Path_expressionContext *ctx) = 0;

  virtual void enterPath_expression_element(AtemParser::Path_expression_elementContext *ctx) = 0;
  virtual void exitPath_expression_element(AtemParser::Path_expression_elementContext *ctx) = 0;

  virtual void enterLiteral_expression(AtemParser::Literal_expressionContext *ctx) = 0;
  virtual void exitLiteral_expression(AtemParser::Literal_expressionContext *ctx) = 0;

  virtual void enterLiteral(AtemParser::LiteralContext *ctx) = 0;
  virtual void exitLiteral(AtemParser::LiteralContext *ctx) = 0;

  virtual void enterNumeric_literal(AtemParser::Numeric_literalContext *ctx) = 0;
  virtual void exitNumeric_literal(AtemParser::Numeric_literalContext *ctx) = 0;

  virtual void enterInteger_literal(AtemParser::Integer_literalContext *ctx) = 0;
  virtual void exitInteger_literal(AtemParser::Integer_literalContext *ctx) = 0;

  virtual void enterFloating_point_literal(AtemParser::Floating_point_literalContext *ctx) = 0;
  virtual void exitFloating_point_literal(AtemParser::Floating_point_literalContext *ctx) = 0;

  virtual void enterBoolean_literal(AtemParser::Boolean_literalContext *ctx) = 0;
  virtual void exitBoolean_literal(AtemParser::Boolean_literalContext *ctx) = 0;

  virtual void enterNull_literal(AtemParser::Null_literalContext *ctx) = 0;
  virtual void exitNull_literal(AtemParser::Null_literalContext *ctx) = 0;

  virtual void enterUndefined_literal(AtemParser::Undefined_literalContext *ctx) = 0;
  virtual void exitUndefined_literal(AtemParser::Undefined_literalContext *ctx) = 0;

  virtual void enterDefault_literal(AtemParser::Default_literalContext *ctx) = 0;
  virtual void exitDefault_literal(AtemParser::Default_literalContext *ctx) = 0;

  virtual void enterArray_literal(AtemParser::Array_literalContext *ctx) = 0;
  virtual void exitArray_literal(AtemParser::Array_literalContext *ctx) = 0;

  virtual void enterString_literal(AtemParser::String_literalContext *ctx) = 0;
  virtual void exitString_literal(AtemParser::String_literalContext *ctx) = 0;

  virtual void enterExtended_string_literal(AtemParser::Extended_string_literalContext *ctx) = 0;
  virtual void exitExtended_string_literal(AtemParser::Extended_string_literalContext *ctx) = 0;

  virtual void enterStatic_string_literal(AtemParser::Static_string_literalContext *ctx) = 0;
  virtual void exitStatic_string_literal(AtemParser::Static_string_literalContext *ctx) = 0;

  virtual void enterInterpolated_string_literal(AtemParser::Interpolated_string_literalContext *ctx) = 0;
  virtual void exitInterpolated_string_literal(AtemParser::Interpolated_string_literalContext *ctx) = 0;

  virtual void enterOptional_pattern_(AtemParser::Optional_pattern_Context *ctx) = 0;
  virtual void exitOptional_pattern_(AtemParser::Optional_pattern_Context *ctx) = 0;

  virtual void enterIs_pattern_(AtemParser::Is_pattern_Context *ctx) = 0;
  virtual void exitIs_pattern_(AtemParser::Is_pattern_Context *ctx) = 0;

  virtual void enterAs_pattern_(AtemParser::As_pattern_Context *ctx) = 0;
  virtual void exitAs_pattern_(AtemParser::As_pattern_Context *ctx) = 0;

  virtual void enterValue_binding_pattern_(AtemParser::Value_binding_pattern_Context *ctx) = 0;
  virtual void exitValue_binding_pattern_(AtemParser::Value_binding_pattern_Context *ctx) = 0;

  virtual void enterIdentifier_pattern_(AtemParser::Identifier_pattern_Context *ctx) = 0;
  virtual void exitIdentifier_pattern_(AtemParser::Identifier_pattern_Context *ctx) = 0;

  virtual void enterExpression_pattern_(AtemParser::Expression_pattern_Context *ctx) = 0;
  virtual void exitExpression_pattern_(AtemParser::Expression_pattern_Context *ctx) = 0;

  virtual void enterEnumerator_pattern_(AtemParser::Enumerator_pattern_Context *ctx) = 0;
  virtual void exitEnumerator_pattern_(AtemParser::Enumerator_pattern_Context *ctx) = 0;

  virtual void enterWildcard_pattern_(AtemParser::Wildcard_pattern_Context *ctx) = 0;
  virtual void exitWildcard_pattern_(AtemParser::Wildcard_pattern_Context *ctx) = 0;

  virtual void enterTuple_pattern_(AtemParser::Tuple_pattern_Context *ctx) = 0;
  virtual void exitTuple_pattern_(AtemParser::Tuple_pattern_Context *ctx) = 0;

  virtual void enterTuple_pattern_element_list(AtemParser::Tuple_pattern_element_listContext *ctx) = 0;
  virtual void exitTuple_pattern_element_list(AtemParser::Tuple_pattern_element_listContext *ctx) = 0;

  virtual void enterTuple_pattern_element(AtemParser::Tuple_pattern_elementContext *ctx) = 0;
  virtual void exitTuple_pattern_element(AtemParser::Tuple_pattern_elementContext *ctx) = 0;

  virtual void enterWildcard_pattern(AtemParser::Wildcard_patternContext *ctx) = 0;
  virtual void exitWildcard_pattern(AtemParser::Wildcard_patternContext *ctx) = 0;

  virtual void enterIdentifier_pattern(AtemParser::Identifier_patternContext *ctx) = 0;
  virtual void exitIdentifier_pattern(AtemParser::Identifier_patternContext *ctx) = 0;

  virtual void enterValue_binding_pattern(AtemParser::Value_binding_patternContext *ctx) = 0;
  virtual void exitValue_binding_pattern(AtemParser::Value_binding_patternContext *ctx) = 0;

  virtual void enterTuple_pattern(AtemParser::Tuple_patternContext *ctx) = 0;
  virtual void exitTuple_pattern(AtemParser::Tuple_patternContext *ctx) = 0;

  virtual void enterEnumerator_pattern(AtemParser::Enumerator_patternContext *ctx) = 0;
  virtual void exitEnumerator_pattern(AtemParser::Enumerator_patternContext *ctx) = 0;

  virtual void enterOptional_pattern(AtemParser::Optional_patternContext *ctx) = 0;
  virtual void exitOptional_pattern(AtemParser::Optional_patternContext *ctx) = 0;

  virtual void enterExpression_pattern(AtemParser::Expression_patternContext *ctx) = 0;
  virtual void exitExpression_pattern(AtemParser::Expression_patternContext *ctx) = 0;


};

