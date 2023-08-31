// Generated from Pie.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NL=21, ID=22, CHAR=23, STRING=24, INT=25, 
		FLOAT=26, WS=27, SL_COMMENT=28;
	public static final int
		RULE_program = 0, RULE_structDefinition = 1, RULE_functionDefinition = 2, 
		RULE_slist = 3, RULE_statement = 4, RULE_call = 5, RULE_expr = 6, RULE_addexpr = 7, 
		RULE_mulexpr = 8, RULE_atom = 9, RULE_qid = 10, RULE_vardef = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structDefinition", "functionDefinition", "slist", "statement", 
			"call", "expr", "addexpr", "mulexpr", "atom", "qid", "vardef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "','", "'}'", "'def'", "'('", "')'", "':'", 
			"'.'", "'='", "'return'", "'print'", "'if'", "'else'", "'while'", "'=='", 
			"'<'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NL", "ID", "CHAR", 
			"STRING", "INT", "FLOAT", "WS", "SL_COMMENT"
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
	public String getGrammarFileName() { return "Pie.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Interpreter interp;
	    Scope currentScope;

	    public PieParser(TokenStream input, Interpreter interp) {
	        super(input);
	        this.interp = interp;
	        this.currentScope = interp.globalScope;
	    }

	public PieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PieParser.EOF, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(24);
					functionDefinition();
					}
					break;
				case T__0:
				case T__10:
				case T__11:
				case T__12:
				case T__14:
				case NL:
				case ID:
					{
					setState(25);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6338594L) != 0) );
			setState(30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructDefinitionContext extends ParserRuleContext {
		public Token name;
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			((StructDefinitionContext)_localctx).name = match(ID);
			setState(34);
			match(T__1);
			setState(35);
			vardef();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(36);
				match(T__2);
				setState(37);
				vardef();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public SlistContext slist() {
			return getRuleContext(SlistContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__4);
			setState(46);
			match(ID);
			setState(47);
			match(T__5);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(48);
				vardef();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(49);
					match(T__2);
					setState(50);
					vardef();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(58);
			match(T__6);
			setState(59);
			slist();
			}
		}
		catch (RecognitionException re) {
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
	public static class SlistContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterSlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitSlist(this);
		}
	}

	public final SlistContext slist() throws RecognitionException {
		SlistContext _localctx = new SlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_slist);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__7);
				setState(62);
				match(NL);
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					statement();
					}
					}
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6338562L) != 0) );
				setState(68);
				match(T__8);
				}
				break;
			case T__0:
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case NL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				statement();
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
	public static class StatementContext extends ParserRuleContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public List<SlistContext> slist() {
			return getRuleContexts(SlistContext.class);
		}
		public SlistContext slist(int i) {
			return getRuleContext(SlistContext.class,i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				structDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				qid();
				setState(75);
				match(T__9);
				setState(76);
				expr();
				setState(77);
				match(NL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__10);
				setState(80);
				expr();
				setState(81);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(T__11);
				setState(84);
				expr();
				setState(85);
				match(NL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__12);
				setState(88);
				expr();
				setState(89);
				slist();
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(90);
					match(T__13);
					setState(91);
					slist();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(T__14);
				setState(95);
				expr();
				setState(96);
				slist();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				call();
				setState(99);
				match(NL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				match(NL);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(T__5);
			setState(106);
			expr();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(107);
				match(T__2);
				setState(108);
				expr();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			addexpr();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__16) {
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				addexpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddexprContext extends ParserRuleContext {
		public List<MulexprContext> mulexpr() {
			return getRuleContexts(MulexprContext.class);
		}
		public MulexprContext mulexpr(int i) {
			return getRuleContext(MulexprContext.class,i);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitAddexpr(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			mulexpr();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				mulexpr();
				}
				}
				setState(128);
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
	public static class MulexprContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitMulexpr(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		MulexprContext _localctx = new MulexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			atom();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(130);
				match(T__19);
				setState(131);
				atom();
				}
				}
				setState(136);
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PieParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(PieParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(PieParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PieParser.STRING, 0); }
		public QidContext qid() {
			return getRuleContext(QidContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				qid();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				match(T__5);
				setState(144);
				expr();
				setState(145);
				match(T__6);
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
	public static class QidContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PieParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PieParser.ID, i);
		}
		public QidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterQid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitQid(this);
		}
	}

	public final QidContext qid() throws RecognitionException {
		QidContext _localctx = new QidContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_qid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(150);
				match(T__8);
				setState(151);
				match(ID);
				}
				}
				setState(156);
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
	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t"+
		"\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003"+
		"B\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004]\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"n\b\u0005\n\u0005\f\u0005q\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0085\b\b\n\b\f\b\u0088\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0094\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u0099\b\n\n\n\f\n\u009c\t"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0002\u0001\u0000\u0010"+
		"\u0011\u0001\u0000\u0012\u0013\u00ad\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002 \u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006G"+
		"\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\ft\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010"+
		"\u0081\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014"+
		"\u0095\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0003\u0004\u0002\u0000\u0019\u001b\u0003\b\u0004\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 !\u0005\u0001"+
		"\u0000\u0000!\"\u0005\u0016\u0000\u0000\"#\u0005\u0002\u0000\u0000#(\u0003"+
		"\u0016\u000b\u0000$%\u0005\u0003\u0000\u0000%\'\u0003\u0016\u000b\u0000"+
		"&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0004\u0000\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0005\u0000\u0000./\u0005\u0016\u0000\u0000/8\u0005\u0006\u0000"+
		"\u000005\u0003\u0016\u000b\u000012\u0005\u0003\u0000\u000024\u0003\u0016"+
		"\u000b\u000031\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000080\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0005\u0007\u0000\u0000;<\u0003\u0006"+
		"\u0003\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\b\u0000\u0000>@\u0005"+
		"\u0015\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0005\t\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FH\u0003\b\u0004\u0000G=\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"H\u0007\u0001\u0000\u0000\u0000Ig\u0003\u0002\u0001\u0000JK\u0003\u0014"+
		"\n\u0000KL\u0005\n\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005\u0015\u0000"+
		"\u0000Ng\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000PQ\u0003\f\u0006"+
		"\u0000QR\u0005\u0015\u0000\u0000Rg\u0001\u0000\u0000\u0000ST\u0005\f\u0000"+
		"\u0000TU\u0003\f\u0006\u0000UV\u0005\u0015\u0000\u0000Vg\u0001\u0000\u0000"+
		"\u0000WX\u0005\r\u0000\u0000XY\u0003\f\u0006\u0000Y\\\u0003\u0006\u0003"+
		"\u0000Z[\u0005\u000e\u0000\u0000[]\u0003\u0006\u0003\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]g\u0001\u0000\u0000\u0000^_\u0005"+
		"\u000f\u0000\u0000_`\u0003\f\u0006\u0000`a\u0003\u0006\u0003\u0000ag\u0001"+
		"\u0000\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\u0015\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000eg\u0005\u0015\u0000\u0000fI\u0001\u0000\u0000\u0000"+
		"fJ\u0001\u0000\u0000\u0000fO\u0001\u0000\u0000\u0000fS\u0001\u0000\u0000"+
		"\u0000fW\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005"+
		"\u0016\u0000\u0000ij\u0005\u0006\u0000\u0000jo\u0003\f\u0006\u0000kl\u0005"+
		"\u0003\u0000\u0000ln\u0003\f\u0006\u0000mk\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0007\u0000"+
		"\u0000s\u000b\u0001\u0000\u0000\u0000tw\u0003\u000e\u0007\u0000uv\u0007"+
		"\u0000\u0000\u0000vx\u0003\u000e\u0007\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000y~\u0003\u0010\b"+
		"\u0000z{\u0007\u0001\u0000\u0000{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0086\u0003\u0012\t\u0000\u0082\u0083\u0005\u0014"+
		"\u0000\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0094\u0005\u0019\u0000"+
		"\u0000\u008a\u0094\u0005\u0017\u0000\u0000\u008b\u0094\u0005\u001a\u0000"+
		"\u0000\u008c\u0094\u0005\u0018\u0000\u0000\u008d\u0094\u0003\u0014\n\u0000"+
		"\u008e\u0094\u0003\n\u0005\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090"+
		"\u0091\u0003\f\u0006\u0000\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000\u0000\u0000\u0093\u008a"+
		"\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u008c"+
		"\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u008e"+
		"\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094\u0013"+
		"\u0001\u0000\u0000\u0000\u0095\u009a\u0005\u0016\u0000\u0000\u0096\u0097"+
		"\u0005\t\u0000\u0000\u0097\u0099\u0005\u0016\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0015\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0016\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u000f\u001a\u001c"+
		"(58BG\\fow~\u0086\u0093\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}