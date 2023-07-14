
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
    KeywordUsize = 128, KeywordVal = 129, KeywordVar = 130, KeywordVirtual = 131, 
    KeywordWhile = 132, KeywordWith = 133, Identifier = 134, BinaryLiteral = 135, 
    OctalLiteral = 136, DecimalDigits = 137, DecimalLiteral = 138, HexadecimalLiteral = 139, 
    FloatingPointLiteral = 140, LeftCurly = 141, RightCurly = 142, LeftParenthese = 143, 
    RightParenthese = 144, LeftSquare = 145, RightSquare = 146, Dot = 147, 
    Colon = 148, Semicolon = 149, Comma = 150, At = 151, Question = 152, 
    Bang = 153, Underscore = 154, Add = 155, OverflowingAdd = 156, SaturatingAdd = 157, 
    Sub = 158, OverflowingSub = 159, SaturatingSub = 160, Mul = 161, OverflowingMul = 162, 
    SaturatingMul = 163, Divide = 164, RemainderDivide = 165, Power = 166, 
    OverflowingPower = 167, SaturatingPower = 168, Assign = 169, AddAssign = 170, 
    OverflowingAddAssign = 171, SaturatingAddAssign = 172, SubAssign = 173, 
    OverflowingSubAssign = 174, SaturatingSubAssign = 175, MulAssign = 176, 
    OverflowingMulAssign = 177, SaturatingMulAssign = 178, PowerAssign = 179, 
    OverflowingPowerAssign = 180, SaturatingPowerAssign = 181, DivideAssign = 182, 
    RemainderDivideAssign = 183, BitLeftShiftAssign = 184, SaturatingBitLeftShiftAssign = 185, 
    BitRightShiftAssign = 186, BitAndAssign = 187, BitOrAssign = 188, BitNotAssign = 189, 
    GreaterThan = 190, LessThan = 191, GreaterThanOrEqual = 192, LessThanOrEqual = 193, 
    NotEqual = 194, Equal = 195, ThreeWayComparison = 196, BitNot = 197, 
    BitAnd = 198, BitOr = 199, BitXor = 200, BitLeftShift = 201, SaturatingBitLeftShift = 202, 
    BitRightShift = 203, PointerType = 204, PointerDeref = 205, ObjectAddress = 206, 
    Reflect = 207, Reify = 208, ClosedRange = 209, RightOpenRange = 210, 
    LeftOpenRange = 211, OpenedRange = 212, DefaultUnwrapping = 213, Arrow = 214, 
    PlaceholderPipeline = 215, LeftThreadingPipeline = 216, Builtin = 217, 
    OperatorHeadOther = 218, OperatorFollowingCharacter = 219, Whitespace = 220, 
    Newline = 221, LineComment = 222, InnerLineDocComment = 223, OuterLineDocComment = 224, 
    BlockComment = 225, InnerBlockComment = 226, OuterBlockComment = 227, 
    BlockCommentOrDoc = 228, MultiLineExtendedStringOpen = 229, SingleLineExtendedStringOpen = 230, 
    MultiLineStringOpen = 231, SingleLineStringOpen = 232, InterpolataionSingleLine = 233, 
    SingleLineStringClose = 234, QuotedSingleLineText = 235, InterpolataionMultiLine = 236, 
    MultiLineStringClose = 237, QuotedMultiLineText = 238, SingleLineExtendedStringClose = 239, 
    QuotedSingleLineExtendedText = 240, MultiLineExtendedStringClose = 241, 
    QuotedMultiLineExtendedText = 242, CharLiteralOpen = 243, ValidChar = 244, 
    CharLiteralClose = 245, BuiltinCompileError = 246, BuiltinCompileInfo = 247, 
    BuiltinCompileWarning = 248
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

