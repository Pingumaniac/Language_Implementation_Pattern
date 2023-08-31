package types;
// Generated from Types.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypesParser extends SymbolTable {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, VAR_DECL=14, ID=15, EXPR=16, CHAR=17,
		INT=18, FLOAT=19, CALL=20, ELIST=21, UNARY_MINUS=22, UNARY_NOT=23, ADDR=24,
		DEREF=25, SEMI=26;
	public static final int
		RULE_bottomup = 0, RULE_ifstat = 1, RULE_decl = 2, RULE_ret = 3, RULE_assignment = 4,
		RULE_exprRoot = 5, RULE_expr = 6, RULE_call = 7, RULE_member = 8, RULE_bop = 9,
		RULE_relop = 10, RULE_eqop = 11, RULE_stat = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"bottomup", "ifstat", "decl", "ret", "assignment", "exprRoot", "expr",
			"call", "member", "bop", "relop", "eqop", "stat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'return'", "'true'", "'false'", "'.'", "'+'", "'/'", "'<'",
			"'>'", "'<='", "'>='", "'!='", "'=='", "'var'", null, "'='", null, null,
			null, "'call'", "'elist'", "'-'", "'!'", "'&'", "'*'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, "VAR_DECL", "ID", "EXPR", "CHAR", "INT", "FLOAT", "CALL",
			"ELIST", "UNARY_MINUS", "UNARY_NOT", "ADDR", "DEREF", "SEMI"
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
	public String getGrammarFileName() { return "Types.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  SymbolTable symtab;
	  Type evalType;
	  public Types(CharStream input, SymbolTable symtab) {
	    this(input);
	    this.symtab = symtab;
	  }

	public TypesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BottomupContext extends ParserRuleContext {
		public ExprRootContext exprRoot() {
			return getRuleContext(ExprRootContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public BottomupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterBottomup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitBottomup(this);
		}
	}

	public final BottomupContext bottomup() throws RecognitionException {
		BottomupContext _localctx = new BottomupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bottomup);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				exprRoot();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				ret();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				ifstat();
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
	public static class IfstatContext extends ParserRuleContext {
		public ExprContext cond;
		public StatContext s;
		public StatContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			((IfstatContext)_localctx).cond = expr(0);
			setState(35);
			((IfstatContext)_localctx).s = stat();
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(36);
				((IfstatContext)_localctx).e = stat();
				}
				break;
			}
			 symtab.ifstat(((IfstatContext)_localctx).cond.type);
			}
		}
		catch (RecognitionException re) {
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
	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public ExprContext init;
		public TerminalNode VAR_DECL() { return getToken(TypesParser.VAR_DECL, 0); }
		public TerminalNode ID() { return getToken(TypesParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(VAR_DECL);
			setState(42);
			((DeclContext)_localctx).ID = match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64913464L) != 0)) {
				{
				setState(43);
				((DeclContext)_localctx).init = expr(0);
				}
			}

			 if (((DeclContext)_localctx).init.type != null) symtab.declinit(((DeclContext)_localctx).ID, ((DeclContext)_localctx).init.type);
			}
		}
		catch (RecognitionException re) {
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
	public static class RetContext extends ParserRuleContext {
		public ExprContext v;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			((RetContext)_localctx).v = expr(0);
			 symtab.ret(((RetContext)_localctx).v.type);
			}
		}
		catch (RecognitionException re) {
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
	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode EXPR() { return getToken(TypesParser.EXPR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(EXPR);
			setState(53);
			((AssignmentContext)_localctx).lhs = expr(0);
			setState(54);
			((AssignmentContext)_localctx).rhs = expr(0);
			 symtab.assign(((AssignmentContext)_localctx).lhs.type, ((AssignmentContext)_localctx).rhs.type);
			}
		}
		catch (RecognitionException re) {
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
	public static class ExprRootContext extends ParserRuleContext {
		public ExprContext expr;
		public TerminalNode EXPR() { return getToken(TypesParser.EXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterExprRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitExprRoot(this);
		}
	}

	public final ExprRootContext exprRoot() throws RecognitionException {
		ExprRootContext _localctx = new ExprRootContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprRoot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(EXPR);
			setState(58);
			((ExprRootContext)_localctx).expr = expr(0);
			 evalType = ((ExprRootContext)_localctx).expr.type;
			}
		}
		catch (RecognitionException re) {
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
		public Type type;
		public ExprContext a;
		public Token ID;
		public ExprContext expr;
		public MemberContext member;
		public CallContext call;
		public TerminalNode CHAR() { return getToken(TypesParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(TypesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TypesParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(TypesParser.ID, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(TypesParser.UNARY_MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode UNARY_NOT() { return getToken(TypesParser.UNARY_NOT, 0); }
		public TerminalNode ADDR() { return getToken(TypesParser.ADDR, 0); }
		public TerminalNode DEREF() { return getToken(TypesParser.DEREF, 0); }
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EqopContext eqop() {
			return getRuleContext(EqopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(62);
				match(T__2);
				 ((ExprContext)_localctx).type =  SymbolTable._boolean;
				}
				break;
			case T__3:
				{
				setState(64);
				match(T__3);
				 ((ExprContext)_localctx).type =  SymbolTable._boolean;
				}
				break;
			case CHAR:
				{
				setState(66);
				match(CHAR);
				 ((ExprContext)_localctx).type =  SymbolTable._char;
				}
				break;
			case INT:
				{
				setState(68);
				match(INT);
				 ((ExprContext)_localctx).type =  SymbolTable._int;
				}
				break;
			case FLOAT:
				{
				setState(70);
				match(FLOAT);
				 ((ExprContext)_localctx).type =  SymbolTable._float;
				}
				break;
			case ID:
				{
				setState(72);
				((ExprContext)_localctx).ID = match(ID);
				 VariableSymbol s = (VariableSymbol) symtab.resolveType((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); ((ExprContext)_localctx).type =  s.type;
				}
				break;
			case UNARY_MINUS:
				{
				setState(74);
				match(UNARY_MINUS);
				setState(75);
				((ExprContext)_localctx).expr = expr(9);
				 ((ExprContext)_localctx).type =  symtab.uminus((((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null));
				}
				break;
			case UNARY_NOT:
				{
				setState(78);
				match(UNARY_NOT);
				setState(79);
				((ExprContext)_localctx).expr = expr(8);
				 ((ExprContext)_localctx).type =  symtab.unot((((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null));
				}
				break;
			case ADDR:
				{
				setState(82);
				match(ADDR);
				setState(83);
				((ExprContext)_localctx).expr = expr(7);
				 ((ExprContext)_localctx).type =  new PointerType(((ExprContext)_localctx).expr.type);
				}
				break;
			case DEREF:
				{
				setState(86);
				match(DEREF);
				setState(87);
				((ExprContext)_localctx).expr = expr(6);
				 ((ExprContext)_localctx).type =  symtab.ptrDeref((((ExprContext)_localctx).expr!=null?(((ExprContext)_localctx).expr.start):null));
				}
				break;
			case T__4:
				{
				setState(90);
				((ExprContext)_localctx).member = member();
				 ((ExprContext)_localctx).type =  ((ExprContext)_localctx).member.type;
				}
				break;
			case CALL:
				{
				setState(93);
				((ExprContext)_localctx).call = call();
				 ((ExprContext)_localctx).type =  ((ExprContext)_localctx).call.type;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						bop();
						setState(100);
						((ExprContext)_localctx).a = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).type =  symtab.bop((((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null), (((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null));
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						relop();
						setState(105);
						((ExprContext)_localctx).a = ((ExprContext)_localctx).expr = expr(3);
						 ((ExprContext)_localctx).type =  symtab.relop((((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null), (((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null));
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(109);
						eqop();
						setState(110);
						((ExprContext)_localctx).a = ((ExprContext)_localctx).expr = expr(2);
						 ((ExprContext)_localctx).type =  symtab.eqop((((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null), (((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null));
						}
						break;
					}
					}
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public Type type;
		public Token ID;
		public ExprContext expr;
		public TerminalNode CALL() { return getToken(TypesParser.CALL, 0); }
		public TerminalNode ID() { return getToken(TypesParser.ID, 0); }
		public TerminalNode ELIST() { return getToken(TypesParser.ELIST, 0); }
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
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		 List args = new ArrayList();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CALL);
			setState(119);
			((CallContext)_localctx).ID = match(ID);
			setState(120);
			match(ELIST);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					((CallContext)_localctx).expr = expr(0);
					 args.add((((CallContext)_localctx).expr!=null?(((CallContext)_localctx).expr.start):null));
					}
					}
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			 ((CallContext)_localctx).type =  symtab.call(((CallContext)_localctx).ID, args);
			}
		}
		catch (RecognitionException re) {
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
	public static class MemberContext extends ParserRuleContext {
		public Type type;
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(TypesParser.ID, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__4);
			setState(132);
			((MemberContext)_localctx).expr = expr(0);
			setState(133);
			((MemberContext)_localctx).ID = match(ID);
			 ((MemberContext)_localctx).type =  symtab.member((((MemberContext)_localctx).expr!=null?(((MemberContext)_localctx).expr.start):null), ((MemberContext)_localctx).ID);
			}
		}
		catch (RecognitionException re) {
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
	public static class BopContext extends ParserRuleContext {
		public TerminalNode UNARY_MINUS() { return getToken(TypesParser.UNARY_MINUS, 0); }
		public TerminalNode DEREF() { return getToken(TypesParser.DEREF, 0); }
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 37748928L) != 0)) ) {
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
	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
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
	public static class EqopContext extends ParserRuleContext {
		public EqopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterEqop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitEqop(this);
		}
	}

	public final EqopContext eqop() throws RecognitionException {
		EqopContext _localctx = new EqopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eqop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(TypesParser.SEMI, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypesListener ) ((TypesListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case ID:
			case CHAR:
			case INT:
			case FLOAT:
			case CALL:
			case UNARY_MINUS:
			case UNARY_NOT:
			case ADDR:
			case DEREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expr(0);
				setState(143);
				match(SEMI);
				}
				break;
			case VAR_DECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				decl();
				setState(146);
				match(SEMI);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				ret();
				setState(149);
				match(SEMI);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				ifstat();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u009b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000 \b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006r\b"+
		"\u0006\n\u0006\f\u0006u\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0099\b\f\u0001\f\u0000\u0001\f\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0003\u0000\u0006\u0007\u0016"+
		"\u0016\u0019\u0019\u0001\u0000\b\u000b\u0001\u0000\f\r\u00a5\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001\u0000"+
		"\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000"+
		"\n9\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ev\u0001\u0000"+
		"\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000"+
		"\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000"+
		"\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a \u0003\n\u0005"+
		"\u0000\u001b \u0003\u0004\u0002\u0000\u001c \u0003\u0006\u0003\u0000\u001d"+
		" \u0003\b\u0004\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001a\u0001"+
		"\u0000\u0000\u0000\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\f\u0006\u0000#%\u0003\u0018\f\u0000$&\u0003\u0018\f\u0000"+
		"%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0006\u0001\uffff\uffff\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0005\u000e\u0000\u0000*,\u0005\u000f\u0000\u0000+-\u0003\f\u0006\u0000"+
		",+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0006\u0002\uffff\uffff\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"01\u0005\u0002\u0000\u000012\u0003\f\u0006\u000023\u0006\u0003\uffff\uffff"+
		"\u00003\u0007\u0001\u0000\u0000\u000045\u0005\u0010\u0000\u000056\u0003"+
		"\f\u0006\u000067\u0003\f\u0006\u000078\u0006\u0004\uffff\uffff\u00008"+
		"\t\u0001\u0000\u0000\u00009:\u0005\u0010\u0000\u0000:;\u0003\f\u0006\u0000"+
		";<\u0006\u0005\uffff\uffff\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0006"+
		"\u0006\uffff\uffff\u0000>?\u0005\u0003\u0000\u0000?a\u0006\u0006\uffff"+
		"\uffff\u0000@A\u0005\u0004\u0000\u0000Aa\u0006\u0006\uffff\uffff\u0000"+
		"BC\u0005\u0011\u0000\u0000Ca\u0006\u0006\uffff\uffff\u0000DE\u0005\u0012"+
		"\u0000\u0000Ea\u0006\u0006\uffff\uffff\u0000FG\u0005\u0013\u0000\u0000"+
		"Ga\u0006\u0006\uffff\uffff\u0000HI\u0005\u000f\u0000\u0000Ia\u0006\u0006"+
		"\uffff\uffff\u0000JK\u0005\u0016\u0000\u0000KL\u0003\f\u0006\tLM\u0006"+
		"\u0006\uffff\uffff\u0000Ma\u0001\u0000\u0000\u0000NO\u0005\u0017\u0000"+
		"\u0000OP\u0003\f\u0006\bPQ\u0006\u0006\uffff\uffff\u0000Qa\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0018\u0000\u0000ST\u0003\f\u0006\u0007TU\u0006\u0006"+
		"\uffff\uffff\u0000Ua\u0001\u0000\u0000\u0000VW\u0005\u0019\u0000\u0000"+
		"WX\u0003\f\u0006\u0006XY\u0006\u0006\uffff\uffff\u0000Ya\u0001\u0000\u0000"+
		"\u0000Z[\u0003\u0010\b\u0000[\\\u0006\u0006\uffff\uffff\u0000\\a\u0001"+
		"\u0000\u0000\u0000]^\u0003\u000e\u0007\u0000^_\u0006\u0006\uffff\uffff"+
		"\u0000_a\u0001\u0000\u0000\u0000`=\u0001\u0000\u0000\u0000`@\u0001\u0000"+
		"\u0000\u0000`B\u0001\u0000\u0000\u0000`D\u0001\u0000\u0000\u0000`F\u0001"+
		"\u0000\u0000\u0000`H\u0001\u0000\u0000\u0000`J\u0001\u0000\u0000\u0000"+
		"`N\u0001\u0000\u0000\u0000`R\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000as\u0001\u0000"+
		"\u0000\u0000bc\n\u0003\u0000\u0000cd\u0003\u0012\t\u0000de\u0003\f\u0006"+
		"\u0004ef\u0006\u0006\uffff\uffff\u0000fr\u0001\u0000\u0000\u0000gh\n\u0002"+
		"\u0000\u0000hi\u0003\u0014\n\u0000ij\u0003\f\u0006\u0003jk\u0006\u0006"+
		"\uffff\uffff\u0000kr\u0001\u0000\u0000\u0000lm\n\u0001\u0000\u0000mn\u0003"+
		"\u0016\u000b\u0000no\u0003\f\u0006\u0002op\u0006\u0006\uffff\uffff\u0000"+
		"pr\u0001\u0000\u0000\u0000qb\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000"+
		"\u0000ql\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\r\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0014\u0000\u0000wx\u0005\u000f\u0000\u0000"+
		"x~\u0005\u0015\u0000\u0000yz\u0003\f\u0006\u0000z{\u0006\u0007\uffff\uffff"+
		"\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0006\u0007\uffff\uffff\u0000\u0082\u000f\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u0085\u0003\f\u0006\u0000"+
		"\u0085\u0086\u0005\u000f\u0000\u0000\u0086\u0087\u0006\b\uffff\uffff\u0000"+
		"\u0087\u0011\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000"+
		"\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0001\u0000\u0000"+
		"\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0002\u0000\u0000"+
		"\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f"+
		"\u0090\u0005\u001a\u0000\u0000\u0090\u0099\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0003\u0004\u0002\u0000\u0092\u0093\u0005\u001a\u0000\u0000\u0093"+
		"\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095"+
		"\u0096\u0005\u001a\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0003\u0002\u0001\u0000\u0098\u008e\u0001\u0000\u0000\u0000\u0098"+
		"\u0091\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000\b\u001f"+
		"%,`qs~\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
