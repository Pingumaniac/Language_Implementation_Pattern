package types;
// Generated from Cymbol.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24,
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31,
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, CHAR=38, INT=39,
		FLOAT=40, WS=41, SL_COMMENT=42;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_superClass = 2,
		RULE_classMember = 3, RULE_methodDeclaration = 4, RULE_formalParameters = 5,
		RULE_parameter = 6, RULE_type = 7, RULE_primitiveType = 8, RULE_block = 9,
		RULE_varDeclaration = 10, RULE_statement = 11, RULE_lhs = 12, RULE_expressionList = 13,
		RULE_expression = 14, RULE_expr = 15, RULE_equalityExpression = 16, RULE_relationalExpression = 17,
		RULE_additiveExpression = 18, RULE_multiplicativeExpression = 19, RULE_unaryExpression = 20,
		RULE_postfixExpression = 21, RULE_primary = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDeclaration", "superClass", "classMember", "methodDeclaration",
			"formalParameters", "parameter", "type", "primitiveType", "block", "varDeclaration",
			"statement", "lhs", "expressionList", "expression", "expr", "equalityExpression",
			"relationalExpression", "additiveExpression", "multiplicativeExpression",
			"unaryExpression", "postfixExpression", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "';'", "':'", "'('", "')'", "','", "'[]'",
			"'*'", "'float'", "'int'", "'char'", "'boolean'", "'void'", "'='", "'if'",
			"'else'", "'return'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'+'",
			"'-'", "'/'", "'!'", "'&'", "'['", "']'", "'.'", "'->'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, "ID", "CHAR", "INT", "FLOAT", "WS", "SL_COMMENT"
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
	public String getGrammarFileName() { return "Cymbol.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(47);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(48);
					varDeclaration();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137439016962L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public SuperClassContext superClass() {
			return getRuleContext(SuperClassContext.class,0);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(55);
				superClass();
				}
			}

			setState(58);
			match(T__1);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				classMember();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137439016960L) != 0) );
			setState(64);
			match(T__2);
			setState(65);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperClassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public SuperClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterSuperClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitSuperClass(this);
		}
	}

	public final SuperClassContext superClass() throws RecognitionException {
		SuperClassContext _localctx = new SuperClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_superClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(68);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classMember);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137439016960L) != 0)) {
				{
				setState(77);
				formalParameters();
				}
			}

			setState(80);
			match(T__6);
			setState(81);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			parameter();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(84);
				match(T__7);
				setState(85);
				parameter();
				}
				}
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type();
				setState(92);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				type();
				setState(95);
				match(ID);
				setState(96);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				type();
				setState(99);
				match(T__9);
				setState(100);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__1);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2166409067588L) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDeclaration);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				type();
				setState(120);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(121);
					match(T__15);
					setState(122);
					expression();
					}
				}

				setState(125);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				type();
				setState(128);
				match(ID);
				setState(129);
				match(T__8);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(130);
					match(T__15);
					setState(131);
					expression();
					}
				}

				setState(134);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				type();
				setState(137);
				match(T__9);
				setState(138);
				match(ID);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(139);
					match(T__15);
					setState(140);
					expression();
					}
				}

				setState(143);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__16);
				setState(150);
				match(T__5);
				setState(151);
				expression();
				setState(152);
				match(T__6);
				setState(153);
				statement();
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(154);
					match(T__17);
					setState(155);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(T__18);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2166408348736L) != 0)) {
					{
					setState(159);
					expression();
					}
				}

				setState(162);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				lhs();
				setState(164);
				match(T__15);
				setState(165);
				expression();
				setState(166);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				postfixExpression();
				setState(169);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(176);
				match(T__7);
				setState(177);
				expression();
				}
				}
				setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			equalityExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			relationalExpression();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__20) {
				{
				{
				setState(188);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				relationalExpression();
				}
				}
				setState(194);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			additiveExpression();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(196);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(197);
				additiveExpression();
				}
				}
				setState(202);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			multiplicativeExpression();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				multiplicativeExpression();
				}
				}
				setState(210);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			unaryExpression();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__27) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				unaryExpression();
				}
				}
				setState(218);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpression);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__26);
				setState(220);
				unaryExpression();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__28);
				setState(222);
				unaryExpression();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__29);
				setState(224);
				unaryExpression();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__9);
				setState(226);
				unaryExpression();
				}
				break;
			case T__5:
			case T__34:
			case T__35:
			case ID:
			case CHAR:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				postfixExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CymbolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CymbolParser.ID, i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			primary();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27917287488L) != 0)) {
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(231);
					match(T__5);
					setState(232);
					expressionList();
					setState(233);
					match(T__6);
					}
					break;
				case T__30:
					{
					setState(235);
					match(T__30);
					setState(236);
					expression();
					setState(237);
					match(T__31);
					}
					break;
				case T__32:
					{
					setState(239);
					match(T__32);
					setState(240);
					match(ID);
					}
					break;
				case T__33:
					{
					setState(241);
					match(T__33);
					setState(242);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(247);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TerminalNode INT() { return getToken(CymbolParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CymbolParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(CymbolParser.CHAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CymbolListener ) ((CymbolListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(CHAR);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(T__35);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(T__5);
				setState(255);
				expr();
				setState(256);
				match(T__6);
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

	public static final String _serializedATN =
		"\u0004\u0001*\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"2\b\u0000\u000b\u0000\f\u00003\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001=\b\u0001\u000b\u0001"+
		"\f\u0001>\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007k\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tq\b\t\n\t"+
		"\f\tt\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n|\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0085"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008e"+
		"\b\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u009d\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a1\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ac\b\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r\u00b6\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00bf\b\u0010\n\u0010\f\u0010\u00c2\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00c7\b\u0011\n\u0011\f\u0011"+
		"\u00ca\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00cf\b"+
		"\u0012\n\u0012\f\u0012\u00d2\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00d7\b\u0013\n\u0013\f\u0013\u00da\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00e5\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f4"+
		"\b\u0015\n\u0015\f\u0015\u00f7\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,\u0000\u0005\u0001\u0000\u000b\u000f\u0001\u0000\u0014\u0015"+
		"\u0001\u0000\u0016\u0019\u0001\u0000\u001a\u001b\u0002\u0000\n\n\u001c"+
		"\u001c\u0118\u00001\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000"+
		"\u0004C\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bJ\u0001"+
		"\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000"+
		"\u000ej\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012n"+
		"\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u00ab"+
		"\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a\u00af"+
		"\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00b9"+
		"\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\"\u00c3\u0001"+
		"\u0000\u0000\u0000$\u00cb\u0001\u0000\u0000\u0000&\u00d3\u0001\u0000\u0000"+
		"\u0000(\u00e4\u0001\u0000\u0000\u0000*\u00e6\u0001\u0000\u0000\u0000,"+
		"\u0102\u0001\u0000\u0000\u0000.2\u0003\u0002\u0001\u0000/2\u0003\b\u0004"+
		"\u000002\u0003\u0014\n\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0001\u0001\u0000\u0000\u0000"+
		"56\u0005\u0001\u0000\u000068\u0005%\u0000\u000079\u0003\u0004\u0002\u0000"+
		"87\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:<\u0005\u0002\u0000\u0000;=\u0003\u0006\u0003\u0000<;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000"+
		"AB\u0005\u0004\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005\u0005"+
		"\u0000\u0000DE\u0005%\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FI\u0003"+
		"\u0014\n\u0000GI\u0003\b\u0004\u0000HF\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0003\u000e\u0007"+
		"\u0000KL\u0005%\u0000\u0000LN\u0005\u0006\u0000\u0000MO\u0003\n\u0005"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0003\u0012\t\u0000R\t\u0001"+
		"\u0000\u0000\u0000SX\u0003\f\u0006\u0000TU\u0005\b\u0000\u0000UW\u0003"+
		"\f\u0006\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005%"+
		"\u0000\u0000]g\u0001\u0000\u0000\u0000^_\u0003\u000e\u0007\u0000_`\u0005"+
		"%\u0000\u0000`a\u0005\t\u0000\u0000ag\u0001\u0000\u0000\u0000bc\u0003"+
		"\u000e\u0007\u0000cd\u0005\n\u0000\u0000de\u0005%\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000"+
		"fb\u0001\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000hk\u0003\u0010\b"+
		"\u0000ik\u0005%\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\u000f\u0001\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m\u0011"+
		"\u0001\u0000\u0000\u0000nr\u0005\u0002\u0000\u0000oq\u0003\u0016\u000b"+
		"\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0003\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0003\u000e\u0007\u0000x{\u0005%\u0000\u0000yz\u0005\u0010\u0000"+
		"\u0000z|\u0003\u001c\u000e\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0004\u0000\u0000~\u0092"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u000e\u0007\u0000\u0080\u0081"+
		"\u0005%\u0000\u0000\u0081\u0084\u0005\t\u0000\u0000\u0082\u0083\u0005"+
		"\u0010\u0000\u0000\u0083\u0085\u0003\u001c\u000e\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u0092\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0003\u000e\u0007\u0000\u0089\u008a\u0005"+
		"\n\u0000\u0000\u008a\u008d\u0005%\u0000\u0000\u008b\u008c\u0005\u0010"+
		"\u0000\u0000\u008c\u008e\u0003\u001c\u000e\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091w\u0001\u0000\u0000\u0000\u0091\u007f\u0001\u0000\u0000"+
		"\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0092\u0015\u0001\u0000\u0000"+
		"\u0000\u0093\u00ac\u0003\u0012\t\u0000\u0094\u00ac\u0003\u0014\n\u0000"+
		"\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000"+
		"\u0097\u0098\u0003\u001c\u000e\u0000\u0098\u0099\u0005\u0007\u0000\u0000"+
		"\u0099\u009c\u0003\u0016\u000b\u0000\u009a\u009b\u0005\u0012\u0000\u0000"+
		"\u009b\u009d\u0003\u0016\u000b\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00ac\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0005\u0013\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00ac\u0005\u0004\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5"+
		"\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7"+
		"\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9\u00aa"+
		"\u0005\u0004\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u0093"+
		"\u0001\u0000\u0000\u0000\u00ab\u0094\u0001\u0000\u0000\u0000\u00ab\u0095"+
		"\u0001\u0000\u0000\u0000\u00ab\u009e\u0001\u0000\u0000\u0000\u00ab\u00a3"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u0017"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u0019\u0001"+
		"\u0000\u0000\u0000\u00af\u00b4\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005"+
		"\b\u0000\u0000\u00b1\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u001e"+
		"\u000f\u0000\u00b8\u001d\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003 \u0010"+
		"\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003\"\u0011\u0000"+
		"\u00bc\u00bd\u0007\u0001\u0000\u0000\u00bd\u00bf\u0003\"\u0011\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"!\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0003$\u0012\u0000\u00c4\u00c5\u0007\u0002\u0000\u0000\u00c5\u00c7\u0003"+
		"$\u0012\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d0\u0003&\u0013\u0000\u00cc\u00cd\u0007\u0003\u0000\u0000"+
		"\u00cd\u00cf\u0003&\u0013\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1%\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d8\u0003(\u0014\u0000\u00d4\u00d5\u0007"+
		"\u0004\u0000\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\'\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001b\u0000"+
		"\u0000\u00dc\u00e5\u0003(\u0014\u0000\u00dd\u00de\u0005\u001d\u0000\u0000"+
		"\u00de\u00e5\u0003(\u0014\u0000\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0"+
		"\u00e5\u0003(\u0014\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e5"+
		"\u0003(\u0014\u0000\u00e3\u00e5\u0003*\u0015\u0000\u00e4\u00db\u0001\u0000"+
		"\u0000\u0000\u00e4\u00dd\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5)\u0001\u0000\u0000\u0000\u00e6\u00f5\u0003,\u0016\u0000"+
		"\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9\u0003\u001a\r\u0000\u00e9"+
		"\u00ea\u0005\u0007\u0000\u0000\u00ea\u00f4\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0003\u001c\u000e\u0000\u00ed"+
		"\u00ee\u0005 \u0000\u0000\u00ee\u00f4\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005!\u0000\u0000\u00f0\u00f4\u0005%\u0000\u0000\u00f1\u00f2\u0005\""+
		"\u0000\u0000\u00f2\u00f4\u0005%\u0000\u0000\u00f3\u00e7\u0001\u0000\u0000"+
		"\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6+\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u0103\u0005%\u0000\u0000\u00f9\u0103\u0005\'\u0000\u0000\u00fa"+
		"\u0103\u0005(\u0000\u0000\u00fb\u0103\u0005&\u0000\u0000\u00fc\u0103\u0005"+
		"#\u0000\u0000\u00fd\u0103\u0005$\u0000\u0000\u00fe\u00ff\u0005\u0006\u0000"+
		"\u0000\u00ff\u0100\u0003\u001e\u000f\u0000\u0100\u0101\u0005\u0007\u0000"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00f8\u0001\u0000\u0000"+
		"\u0000\u0102\u00f9\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000"+
		"\u0000\u0102\u00fb\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000"+
		"\u0000\u0102\u00fd\u0001\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000"+
		"\u0000\u0103-\u0001\u0000\u0000\u0000\u001a138>HNXfjr{\u0084\u008d\u0091"+
		"\u009c\u00a0\u00ab\u00b4\u00c0\u00c8\u00d0\u00d8\u00e4\u00f3\u00f5\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
