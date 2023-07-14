
	#include <stack>


// Generated from D:\Repos\atem\grammar\AtemLexer.g4 by ANTLR 4.13.0

#pragma once


#include "antlr4-runtime.h"




class  AtemLexer : public antlr4::Lexer {
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
    SingleLine = 1, MultiLine = 2, SingleLineExtended = 3, MultiLineExtended = 4, 
    CharLiteral = 5, BuiltinFunction = 6
  };

  explicit AtemLexer(antlr4::CharStream *input);

  ~AtemLexer() override;


  	std::stack<int> curly = std::stack<int>{};

  	void reset() override{
  		curly = std::stack<int>{};
  	}


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  void action(antlr4::RuleContext *context, size_t ruleIndex, size_t actionIndex) override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.
  void LeftCurlyAction(antlr4::RuleContext *context, size_t actionIndex);
  void RightCurlyAction(antlr4::RuleContext *context, size_t actionIndex);
  void InterpolataionSingleLineAction(antlr4::RuleContext *context, size_t actionIndex);
  void InterpolataionMultiLineAction(antlr4::RuleContext *context, size_t actionIndex);

  // Individual semantic predicate functions triggered by sempred() above.

};

