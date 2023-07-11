
	#include <stack>


// Generated from .\AtemLexer.g4 by ANTLR 4.13.0

#pragma once


#include "antlr4-runtime.h"




class  AtemLexer : public antlr4::Lexer {
public:
  enum {
    KeywordAbstract = 1, KeywordAlias = 2, KeywordAnd = 3, KeywordAny = 4, 
    KeywordAs = 5, KeywordAsm = 6, KeywordAssert = 7, KeywordAsync = 8, 
    KeywordAt = 9, KeywordAwait = 10, KeywordBool = 11, KeywordBreak = 12, 
    KeywordByte = 13, KeywordCase = 14, KeywordCatch = 15, KeywordChar8 = 16, 
    KeywordChar16 = 17, KeywordChar32 = 18, KeywordClass = 19, KeywordCompileTimeInt = 20, 
    KeywordCompileTimeFloat = 21, KeywordCompileTimeString = 22, KeywordCompileTimeChar = 23, 
    KeywordComptime = 24, KeywordConcept = 25, KeywordConst = 26, KeywordContinue = 27, 
    KeywordDefault = 28, KeywordDefer = 29, KeywordDeinit = 30, KeywordDelete = 31, 
    KeywordDo = 32, KeywordDyn = 33, KeywordElse = 34, KeywordEnsure = 35, 
    KeywordEnum = 36, KeywordExpect = 37, KeywordExtend = 38, KeywordExtern = 39, 
    KeywordFail = 40, KeywordFallthrough = 41, KeywordFalse = 42, KeywordFilePrivate = 43, 
    KeywordFinal = 44, KeywordFloat16 = 45, KeywordFloat32 = 46, KeywordFloat64 = 47, 
    KeywordFloat80 = 48, KeywordFloat128 = 49, KeywordFor = 50, KeywordForward = 51, 
    KeywordFunc = 52, KeywordGet = 53, KeywordGlobal = 54, KeywordIf = 55, 
    KeywordImpl = 56, KeywordImport = 57, KeywordIn = 58, KeywordInherit = 59, 
    KeywordInline = 60, KeywordInit = 61, KeywordInt8 = 62, KeywordInt16 = 63, 
    KeywordInt32 = 64, KeywordInt64 = 65, KeywordInt128 = 66, KeywordInternal = 67, 
    KeywordIs = 68, KeywordLazy = 69, KeywordLet = 70, KeywordMatch = 71, 
    KeywordMember = 72, KeywordModule = 73, KeywordMutable = 74, KeywordNamespace = 75, 
    KeywordNew = 76, KeywordNever = 77, KeywordNot = 78, KeywordNull = 79, 
    KeywordOpaque = 80, KeywordOpen = 81, KeywordOperator = 82, KeywordOr = 83, 
    KeywordOuter = 84, KeywordOverride = 85, KeywordPackage = 86, KeywordPrivate = 87, 
    KeywordProject = 88, KeywordProtocol = 89, KeywordPublic = 90, KeywordPure = 91, 
    KeywordRecursive = 92, KeywordReloc = 93, KeywordRequire = 94, KeywordRepeat = 95, 
    KeywordReturn = 96, KeywordSelf = 97, KeywordSet = 98, KeywordSome = 99, 
    KeywordStatic = 100, KeywordString = 101, KeywordStruct = 102, KeywordSuccess = 103, 
    KeywordSuper = 104, KeywordTest = 105, KeywordThen = 106, KeywordThis = 107, 
    KeywordThreadLocal = 108, KeywordThrow = 109, KeywordThrows = 110, KeywordTrue = 111, 
    KeywordTry = 112, KeywordType = 113, KeywordUInt8 = 114, KeywordUInt16 = 115, 
    KeywordUInt32 = 116, KeywordUInt64 = 117, KeywordUInt128 = 118, KeywordUndefined = 119, 
    KeywordUnion = 120, KeywordUnit = 121, KeywordUnreachable = 122, KeywordUse = 123, 
    KeywordUsing = 124, KeywordVal = 125, KeywordVar = 126, KeywordVirtual = 127, 
    KeywordWhile = 128, KeywordWith = 129, Identifier = 130, BinaryLiteral = 131, 
    OctalLiteral = 132, DecimalDigits = 133, DecimalLiteral = 134, HexadecimalLiteral = 135, 
    FloatingPointLiteral = 136, LeftCurly = 137, RightCurly = 138, LeftParenthese = 139, 
    RightParenthese = 140, LeftSquare = 141, RightSquare = 142, Dot = 143, 
    Colon = 144, Semicolon = 145, Comma = 146, At = 147, Question = 148, 
    Bang = 149, Underscore = 150, Add = 151, OverflowingAdd = 152, SaturatingAdd = 153, 
    Sub = 154, OverflowingSub = 155, SaturatingSub = 156, Mul = 157, OverflowingMul = 158, 
    SaturatingMul = 159, Divide = 160, RemainderDivide = 161, Power = 162, 
    OverflowingPower = 163, SaturatingPower = 164, Assign = 165, AddAssign = 166, 
    OverflowingAddAssign = 167, SaturatingAddAssign = 168, SubAssign = 169, 
    OverflowingSubAssign = 170, SaturatingSubAssign = 171, MulAssign = 172, 
    OverflowingMulAssign = 173, SaturatingMulAssign = 174, PowerAssign = 175, 
    OverflowingPowerAssign = 176, SaturatingPowerAssign = 177, DivideAssign = 178, 
    RemainderDivideAssign = 179, BitLeftShiftAssign = 180, SaturatingBitLeftShiftAssign = 181, 
    BitRightShiftAssign = 182, BitAndAssign = 183, BitOrAssign = 184, BitNotAssign = 185, 
    GreaterThan = 186, LessThan = 187, GreaterThanOrEqual = 188, LessThanOrEqual = 189, 
    NotEqual = 190, Equal = 191, ThreeWayComparison = 192, BitNot = 193, 
    BitAnd = 194, BitOr = 195, BitXor = 196, BitLeftShift = 197, SaturatingBitLeftShift = 198, 
    BitRightShift = 199, PointerType = 200, PointerDeref = 201, ObjectAddress = 202, 
    Reflect = 203, Reify = 204, ClosedRange = 205, RightOpenRange = 206, 
    LeftOpenRange = 207, OpenedRange = 208, DefaultUnwrapping = 209, Arrow = 210, 
    PlaceholderPipeline = 211, LeftThreadingPipeline = 212, OperatorHeadOther = 213, 
    OperatorFollowingCharacter = 214, Whitespace = 215, Newline = 216, LineComment = 217, 
    InnerLineDocComment = 218, OuterLineDocComment = 219, BlockComment = 220, 
    InnerBlockComment = 221, OuterBlockComment = 222, BlockCommentOrDoc = 223, 
    MultiLineExtendedStringOpen = 224, SingleLineExtendedStringOpen = 225, 
    MultiLineStringOpen = 226, SingleLineStringOpen = 227, InterpolataionSingleLine = 228, 
    SingleLineStringClose = 229, QuotedSingleLineText = 230, InterpolataionMultiLine = 231, 
    MultiLineStringClose = 232, QuotedMultiLineText = 233, SingleLineExtendedStringClose = 234, 
    QuotedSingleLineExtendedText = 235, MultiLineExtendedStringClose = 236, 
    QuotedMultiLineExtendedText = 237
  };

  enum {
    SingleLine = 1, MultiLine = 2, SingleLineExtended = 3, MultiLineExtended = 4
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

