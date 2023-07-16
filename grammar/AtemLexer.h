
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
    KeywordSync = 108, KeywordTest = 109, KeywordThen = 110, KeywordThis = 111, 
    KeywordThreadLocal = 112, KeywordThrow = 113, KeywordThrows = 114, KeywordTrue = 115, 
    KeywordTry = 116, KeywordType = 117, KeywordUInt8 = 118, KeywordUInt16 = 119, 
    KeywordUInt32 = 120, KeywordUInt64 = 121, KeywordUInt128 = 122, KeywordUndefined = 123, 
    KeywordUnion = 124, KeywordUnit = 125, KeywordUnreachable = 126, KeywordUse = 127, 
    KeywordUsing = 128, KeywordUsize = 129, KeywordVal = 130, KeywordVar = 131, 
    KeywordVirtual = 132, KeywordWhile = 133, KeywordWith = 134, Identifier = 135, 
    BinaryLiteral = 136, OctalLiteral = 137, DecimalDigits = 138, DecimalLiteral = 139, 
    HexadecimalLiteral = 140, FloatingPointLiteral = 141, LeftCurly = 142, 
    RightCurly = 143, LeftParenthese = 144, RightParenthese = 145, LeftSquare = 146, 
    RightSquare = 147, Dot = 148, Colon = 149, Semicolon = 150, Comma = 151, 
    At = 152, Question = 153, Bang = 154, Underscore = 155, Add = 156, OverflowingAdd = 157, 
    SaturatingAdd = 158, Sub = 159, OverflowingSub = 160, SaturatingSub = 161, 
    Mul = 162, OverflowingMul = 163, SaturatingMul = 164, Divide = 165, 
    RemainderDivide = 166, Power = 167, OverflowingPower = 168, SaturatingPower = 169, 
    Assign = 170, AddAssign = 171, OverflowingAddAssign = 172, SaturatingAddAssign = 173, 
    SubAssign = 174, OverflowingSubAssign = 175, SaturatingSubAssign = 176, 
    MulAssign = 177, OverflowingMulAssign = 178, SaturatingMulAssign = 179, 
    PowerAssign = 180, OverflowingPowerAssign = 181, SaturatingPowerAssign = 182, 
    DivideAssign = 183, RemainderDivideAssign = 184, BitLeftShiftAssign = 185, 
    SaturatingBitLeftShiftAssign = 186, BitRightShiftAssign = 187, BitAndAssign = 188, 
    BitOrAssign = 189, BitNotAssign = 190, GreaterThan = 191, LessThan = 192, 
    GreaterThanOrEqual = 193, LessThanOrEqual = 194, NotEqual = 195, Equal = 196, 
    ThreeWayComparison = 197, BitNot = 198, BitAnd = 199, BitOr = 200, BitXor = 201, 
    BitLeftShift = 202, SaturatingBitLeftShift = 203, BitRightShift = 204, 
    PointerType = 205, PointerDeref = 206, ObjectAddress = 207, Reflect = 208, 
    Reify = 209, Inject = 210, ClosedRange = 211, RightOpenRange = 212, 
    LeftOpenRange = 213, OpenedRange = 214, DefaultUnwrapping = 215, Arrow = 216, 
    PlaceholderPipeline = 217, LeftThreadingPipeline = 218, Builtin = 219, 
    Capture = 220, OperatorHeadOther = 221, OperatorFollowingCharacter = 222, 
    Whitespace = 223, Newline = 224, LineComment = 225, InnerLineDocComment = 226, 
    OuterLineDocComment = 227, BlockComment = 228, InnerBlockComment = 229, 
    OuterBlockComment = 230, BlockCommentOrDoc = 231, MultiLineExtendedStringOpen = 232, 
    SingleLineExtendedStringOpen = 233, MultiLineStringOpen = 234, SingleLineStringOpen = 235, 
    InterpolataionSingleLine = 236, SingleLineStringClose = 237, QuotedSingleLineText = 238, 
    InterpolataionMultiLine = 239, MultiLineStringClose = 240, QuotedMultiLineText = 241, 
    SingleLineExtendedStringClose = 242, QuotedSingleLineExtendedText = 243, 
    MultiLineExtendedStringClose = 244, QuotedMultiLineExtendedText = 245, 
    CharLiteralOpen = 246, ValidChar = 247, CharLiteralClose = 248, BuiltinCompileError = 249, 
    BuiltinCompileInfo = 250, BuiltinCompileWarning = 251, BuiltinPanic = 252, 
    BuiltinReturnAddress = 253
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

