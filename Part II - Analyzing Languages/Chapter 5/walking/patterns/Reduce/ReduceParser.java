// Generated from Reduce.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReduceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_primary = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "multExpr", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'print'", "'+'", "'*'", "'.'", "'['", "','", "']'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "WS"
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
	public String getGrammarFileName() { return "Reduce.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReduceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReduceParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==ID );
			setState(15);
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
	public static class StatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReduceParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(ID);
				setState(18);
				match(T__0);
				setState(19);
				expr();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__1);
				setState(21);
				expr();
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
	public static class ExprContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			multExpr();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(25);
				match(T__2);
				setState(26);
				multExpr();
				}
				}
				setState(31);
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
	public static class MultExprContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			primary();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				primary();
				}
				}
				setState(39);
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
		public TerminalNode INT() { return getToken(ReduceParser.INT, 0); }
		public TerminalNode ID() { return getToken(ReduceParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReduceListener ) ((ReduceListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primary);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__5);
				setState(43);
				expr();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(44);
					match(T__6);
					setState(45);
					expr();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(T__8);
				setState(54);
				expr();
				setState(55);
				match(T__9);
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
		"\u0004\u0001\r<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b"+
		"\u0002\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003$\b\u0003\n\u0003\f\u0003\'\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004/\b\u0004"+
		"\n\u0004\f\u00042\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0004\u0005>"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000"+
		"\u0004\u0018\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b"+
		"9\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000"+
		"\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u000b\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013"+
		"\u0017\u0003\u0004\u0002\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015"+
		"\u0017\u0003\u0004\u0002\u0000\u0016\u0011\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000\u0000\u0000\u0018"+
		"\u001d\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0003\u0000\u0000\u001a"+
		"\u001c\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 %\u0003\b\u0004\u0000!\"\u0007\u0000\u0000"+
		"\u0000\"$\u0003\b\u0004\u0000#!\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0007"+
		"\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(:\u0005\f\u0000\u0000"+
		"):\u0005\u000b\u0000\u0000*+\u0005\u0006\u0000\u0000+0\u0003\u0004\u0002"+
		"\u0000,-\u0005\u0007\u0000\u0000-/\u0003\u0004\u0002\u0000.,\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"34\u0005\b\u0000\u00004:\u0001\u0000\u0000\u000056\u0005\t\u0000\u0000"+
		"67\u0003\u0004\u0002\u000078\u0005\n\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9(\u0001\u0000\u0000\u00009)\u0001\u0000\u0000\u00009*\u0001\u0000\u0000"+
		"\u000095\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000\u0006\r\u0016"+
		"\u001d%09";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}