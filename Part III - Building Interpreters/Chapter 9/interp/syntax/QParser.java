// Generated from Q.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		INT=18, STRING=19, COMMENT=20, WS=21;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_table = 3, RULE_assign = 4, 
		RULE_insert = 5, RULE_setFields = 6, RULE_set = 7, RULE_query = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "print", "table", "assign", "insert", "setFields", 
			"set", "query", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "';'", "'create'", "'table'", "'('", "'primary'", "'key'", 
			"','", "')'", "'='", "'insert'", "'into'", "'set'", "'select'", "'from'", 
			"'where'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "INT", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Q.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Interpreter interp;
	    public QParser(TokenStream input, Interpreter interp) {
	        this(input);
	        this.interp = interp;
	    }

	public QParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 149514L) != 0) );
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				table();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				insert();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				assign();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				query();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				print();
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
	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			((PrintContext)_localctx).expr = expr();
			setState(34);
			match(T__1);
			interp.print(((PrintContext)_localctx).expr.value);
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
	public static class TableContext extends ParserRuleContext {
		public Token tbl;
		public Token key;
		public Token ID;
		public List<Token> columns = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(QParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QParser.ID, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			match(T__3);
			setState(39);
			((TableContext)_localctx).tbl = match(ID);
			setState(40);
			match(T__4);
			setState(41);
			match(T__5);
			setState(42);
			match(T__6);
			setState(43);
			((TableContext)_localctx).key = match(ID);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(T__7);
				setState(45);
				((TableContext)_localctx).ID = match(ID);
				((TableContext)_localctx).columns.add(((TableContext)_localctx).ID);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(50);
			match(T__8);
			setState(51);
			match(T__1);
			interp.createTable((((TableContext)_localctx).tbl!=null?((TableContext)_localctx).tbl.getText():null), (((TableContext)_localctx).key!=null?((TableContext)_localctx).key.getText():null), ((TableContext)_localctx).columns);
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
	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((AssignContext)_localctx).ID = match(ID);
			setState(55);
			match(T__9);
			setState(56);
			((AssignContext)_localctx).expr = expr();
			setState(57);
			match(T__1);
			interp.store((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), ((AssignContext)_localctx).expr.value);
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
	public static class InsertContext extends ParserRuleContext {
		public Token ID;
		public SetFieldsContext setFields;
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public SetFieldsContext setFields() {
			return getRuleContext(SetFieldsContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__10);
			setState(61);
			match(T__11);
			setState(62);
			((InsertContext)_localctx).ID = match(ID);
			setState(63);
			match(T__12);
			setState(64);
			((InsertContext)_localctx).setFields = setFields(interp.tables.get((((InsertContext)_localctx).ID!=null?((InsertContext)_localctx).ID.getText():null)));
			setState(65);
			match(T__1);
			interp.insertInto((((InsertContext)_localctx).ID!=null?((InsertContext)_localctx).ID.getText():null), ((InsertContext)_localctx).setFields.row);
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
	public static class SetFieldsContext extends ParserRuleContext {
		public Table t;
		public Row row;
		public List<SetContext> set() {
			return getRuleContexts(SetContext.class);
		}
		public SetContext set(int i) {
			return getRuleContext(SetContext.class,i);
		}
		public SetFieldsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SetFieldsContext(ParserRuleContext parent, int invokingState, Table t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_setFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterSetFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitSetFields(this);
		}
	}

	public final SetFieldsContext setFields(Table t) throws RecognitionException {
		SetFieldsContext _localctx = new SetFieldsContext(_ctx, getState(), t);
		enterRule(_localctx, 12, RULE_setFields);
		 ((SetFieldsContext)_localctx).row =  new Row(t.columns); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			set(_localctx.row);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(69);
				match(T__7);
				setState(70);
				set(_localctx.row);
				}
				}
				setState(75);
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
	public static class SetContext extends ParserRuleContext {
		public Row row;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SetContext(ParserRuleContext parent, int invokingState, Row row) {
			super(parent, invokingState);
			this.row = row;
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitSet(this);
		}
	}

	public final SetContext set(Row row) throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState(), row);
		enterRule(_localctx, 14, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((SetContext)_localctx).ID = match(ID);
			setState(77);
			match(T__9);
			setState(78);
			((SetContext)_localctx).expr = expr();
			row.set((((SetContext)_localctx).ID!=null?((SetContext)_localctx).ID.getText():null), ((SetContext)_localctx).expr.value);
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
	public static class QueryContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public List<Token> columns = new ArrayList<Token>();
		public Token tbl;
		public Token key;
		public ExprContext expr;
		public List<TerminalNode> ID() { return getTokens(QParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__13);
			setState(82);
			((QueryContext)_localctx).ID = match(ID);
			((QueryContext)_localctx).columns.add(((QueryContext)_localctx).ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(83);
				match(T__7);
				setState(84);
				((QueryContext)_localctx).ID = match(ID);
				((QueryContext)_localctx).columns.add(((QueryContext)_localctx).ID);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__14);
			setState(91);
			((QueryContext)_localctx).tbl = match(ID);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(92);
				match(T__15);
				setState(93);
				((QueryContext)_localctx).key = match(ID);
				setState(94);
				match(T__9);
				setState(95);
				((QueryContext)_localctx).expr = expr();
				((QueryContext)_localctx).value =  interp.select((((QueryContext)_localctx).tbl!=null?((QueryContext)_localctx).tbl.getText():null), ((QueryContext)_localctx).columns, (((QueryContext)_localctx).key!=null?((QueryContext)_localctx).key.getText():null), ((QueryContext)_localctx).expr.value);
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__7:
			case T__10:
			case T__13:
			case ID:
				{
				((QueryContext)_localctx).value =  interp.select((((QueryContext)_localctx).tbl!=null?((QueryContext)_localctx).tbl.getText():null), ((QueryContext)_localctx).columns);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ExprContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public Token INT;
		public Token STRING;
		public QueryContext query;
		public TerminalNode ID() { return getToken(QParser.ID, 0); }
		public TerminalNode INT() { return getToken(QParser.INT, 0); }
		public TerminalNode STRING() { return getToken(QParser.STRING, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).value =  interp.load((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).value =  (((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				((ExprContext)_localctx).query = query();
				((ExprContext)_localctx).value =  ((ExprContext)_localctx).query.value;
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
		"\u0004\u0001\u0015q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003/\b"+
		"\u0003\u000b\u0003\f\u00030\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006H\b\u0006\n\u0006\f\u0006K\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"V\b\b\n\b\f\bY\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bd\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\to\b\t\u0001\t\u0000\u0000\n"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000r\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004 \u0001"+
		"\u0000\u0000\u0000\u0006%\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000"+
		"\u0000\n<\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000\u000eL\u0001"+
		"\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000"+
		"\u0000\u0019\u001f\u0003\u0006\u0003\u0000\u001a\u001f\u0003\n\u0005\u0000"+
		"\u001b\u001f\u0003\b\u0004\u0000\u001c\u001f\u0003\u0010\b\u0000\u001d"+
		"\u001f\u0003\u0004\u0002\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e"+
		"\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f"+
		"\u0003\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0003\u0012"+
		"\t\u0000\"#\u0005\u0002\u0000\u0000#$\u0006\u0002\uffff\uffff\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0005\u0004\u0000"+
		"\u0000\'(\u0005\u0011\u0000\u0000()\u0005\u0005\u0000\u0000)*\u0005\u0006"+
		"\u0000\u0000*+\u0005\u0007\u0000\u0000+.\u0005\u0011\u0000\u0000,-\u0005"+
		"\b\u0000\u0000-/\u0005\u0011\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0005\t\u0000\u000034\u0005\u0002\u0000\u0000"+
		"45\u0006\u0003\uffff\uffff\u00005\u0007\u0001\u0000\u0000\u000067\u0005"+
		"\u0011\u0000\u000078\u0005\n\u0000\u000089\u0003\u0012\t\u00009:\u0005"+
		"\u0002\u0000\u0000:;\u0006\u0004\uffff\uffff\u0000;\t\u0001\u0000\u0000"+
		"\u0000<=\u0005\u000b\u0000\u0000=>\u0005\f\u0000\u0000>?\u0005\u0011\u0000"+
		"\u0000?@\u0005\r\u0000\u0000@A\u0003\f\u0006\u0000AB\u0005\u0002\u0000"+
		"\u0000BC\u0006\u0005\uffff\uffff\u0000C\u000b\u0001\u0000\u0000\u0000"+
		"DI\u0003\u000e\u0007\u0000EF\u0005\b\u0000\u0000FH\u0003\u000e\u0007\u0000"+
		"GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\r\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0011\u0000\u0000MN\u0005\n\u0000\u0000NO\u0003\u0012"+
		"\t\u0000OP\u0006\u0007\uffff\uffff\u0000P\u000f\u0001\u0000\u0000\u0000"+
		"QR\u0005\u000e\u0000\u0000RW\u0005\u0011\u0000\u0000ST\u0005\b\u0000\u0000"+
		"TV\u0005\u0011\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u000f\u0000\u0000[c\u0005"+
		"\u0011\u0000\u0000\\]\u0005\u0010\u0000\u0000]^\u0005\u0011\u0000\u0000"+
		"^_\u0005\n\u0000\u0000_`\u0003\u0012\t\u0000`a\u0006\b\uffff\uffff\u0000"+
		"ad\u0001\u0000\u0000\u0000bd\u0006\b\uffff\uffff\u0000c\\\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0011\u0001\u0000\u0000\u0000"+
		"ef\u0005\u0011\u0000\u0000fo\u0006\t\uffff\uffff\u0000gh\u0005\u0012\u0000"+
		"\u0000ho\u0006\t\uffff\uffff\u0000ij\u0005\u0013\u0000\u0000jo\u0006\t"+
		"\uffff\uffff\u0000kl\u0003\u0010\b\u0000lm\u0006\t\uffff\uffff\u0000m"+
		"o\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000"+
		"\u0000ni\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000o\u0013\u0001"+
		"\u0000\u0000\u0000\u0007\u0017\u001e0IWcn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}