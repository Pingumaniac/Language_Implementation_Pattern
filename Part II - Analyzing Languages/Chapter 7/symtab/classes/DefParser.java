// Generated from Def.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DefParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BLOCK=3, METHOD_DECL=4, EXTENDS=5, FIELD_DECL=6, VAR_DECL=7, 
		ARG_DECL=8, ID=9;
	public static final int
		RULE_topdown = 0, RULE_bottomup = 1, RULE_enterBlock = 2, RULE_exitBlock = 3, 
		RULE_enterClass = 4, RULE_exitClass = 5, RULE_enterMethod = 6, RULE_exitMethod = 7, 
		RULE_atoms = 8, RULE_varDeclaration = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"topdown", "bottomup", "enterBlock", "exitBlock", "enterClass", "exitClass", 
			"enterMethod", "exitMethod", "atoms", "varDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'this'", "'BLOCK'", "'METHOD_DECL'", "'extends'", "'FIELD_DECL'", 
			"'VAR_DECL'", "'ARG_DECL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BLOCK", "METHOD_DECL", "EXTENDS", "FIELD_DECL", "VAR_DECL", 
			"ARG_DECL", "ID"
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
	public String getGrammarFileName() { return "Def.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymbolTable symtab;
	    Scope currentScope;

	    public DefParser(TokenStream input, SymbolTable symtab) {
	        super(input);
	        this.symtab = symtab;
	        this.currentScope = symtab.globals;
	    }

	public DefParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopdownContext extends ParserRuleContext {
		public EnterBlockContext enterBlock() {
			return getRuleContext(EnterBlockContext.class,0);
		}
		public EnterMethodContext enterMethod() {
			return getRuleContext(EnterMethodContext.class,0);
		}
		public EnterClassContext enterClass() {
			return getRuleContext(EnterClassContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public TopdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterTopdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitTopdown(this);
		}
	}

	public final TopdownContext topdown() throws RecognitionException {
		TopdownContext _localctx = new TopdownContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topdown);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				enterBlock();
				}
				break;
			case METHOD_DECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				enterMethod();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				enterClass();
				}
				break;
			case FIELD_DECL:
			case VAR_DECL:
			case ARG_DECL:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				varDeclaration();
				}
				break;
			case T__1:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				atoms();
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
	public static class BottomupContext extends ParserRuleContext {
		public ExitBlockContext exitBlock() {
			return getRuleContext(ExitBlockContext.class,0);
		}
		public ExitMethodContext exitMethod() {
			return getRuleContext(ExitMethodContext.class,0);
		}
		public ExitClassContext exitClass() {
			return getRuleContext(ExitClassContext.class,0);
		}
		public BottomupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bottomup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterBottomup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitBottomup(this);
		}
	}

	public final BottomupContext bottomup() throws RecognitionException {
		BottomupContext _localctx = new BottomupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bottomup);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				exitBlock();
				}
				break;
			case METHOD_DECL:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				exitMethod();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				exitClass();
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
	public static class EnterBlockContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(DefParser.BLOCK, 0); }
		public EnterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterEnterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitEnterBlock(this);
		}
	}

	public final EnterBlockContext enterBlock() throws RecognitionException {
		EnterBlockContext _localctx = new EnterBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enterBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(BLOCK);
			 currentScope = new LocalScope(currentScope); 
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
	public static class ExitBlockContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(DefParser.BLOCK, 0); }
		public ExitBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterExitBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitExitBlock(this);
		}
	}

	public final ExitBlockContext exitBlock() throws RecognitionException {
		ExitBlockContext _localctx = new ExitBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exitBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(BLOCK);
			 System.out.println("locals: " + currentScope); currentScope = currentScope.getEnclosingScope(); 
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
	public static class EnterClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DefParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DefParser.ID, i);
		}
		public TerminalNode EXTENDS() { return getToken(DefParser.EXTENDS, 0); }
		public EnterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterEnterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitEnterClass(this);
		}
	}

	public final EnterClassContext enterClass() throws RecognitionException {
		EnterClassContext _localctx = new EnterClassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(40);
				match(EXTENDS);
				setState(41);
				match(ID);
				}
			}


			            System.out.println("line " + _localctx.ID().getSymbol().getLine() + ": def class " + _localctx.ID().getText());
			            ClassSymbol cs = new ClassSymbol(_localctx.ID().getText(), currentScope, null);
			            currentScope.define(cs);
			            currentScope = cs;  // set current scope to class scope
			        
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
	public static class ExitClassContext extends ParserRuleContext {
		public ExitClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterExitClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitExitClass(this);
		}
	}

	public final ExitClassContext exitClass() throws RecognitionException {
		ExitClassContext _localctx = new ExitClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exitClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			 System.out.println("members: " + currentScope); currentScope = currentScope.getEnclosingScope(); 
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
	public static class EnterMethodContext extends ParserRuleContext {
		public TerminalNode METHOD_DECL() { return getToken(DefParser.METHOD_DECL, 0); }
		public TerminalNode ID() { return getToken(DefParser.ID, 0); }
		public EnterMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterEnterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitEnterMethod(this);
		}
	}

	public final EnterMethodContext enterMethod() throws RecognitionException {
		EnterMethodContext _localctx = new EnterMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enterMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(METHOD_DECL);
			setState(50);
			match(ID);

			            System.out.println("line " + _localctx.ID().getSymbol().getLine() + ": def method " + _localctx.ID().getText());
			            MethodSymbol ms = new MethodSymbol(_localctx.ID().getText(), null, currentScope);
			            currentScope.define(ms);
			            currentScope = ms;  // set current scope to method scope
			        
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
	public static class ExitMethodContext extends ParserRuleContext {
		public TerminalNode METHOD_DECL() { return getToken(DefParser.METHOD_DECL, 0); }
		public ExitMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterExitMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitExitMethod(this);
		}
	}

	public final ExitMethodContext exitMethod() throws RecognitionException {
		ExitMethodContext _localctx = new ExitMethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exitMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(METHOD_DECL);
			 System.out.println("args: " + currentScope); currentScope = currentScope.getEnclosingScope(); 
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
	public static class AtomsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DefParser.ID, 0); }
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitAtoms(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atoms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==ID) ) {
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DefParser.ID, 0); }
		public TerminalNode FIELD_DECL() { return getToken(DefParser.FIELD_DECL, 0); }
		public TerminalNode VAR_DECL() { return getToken(DefParser.VAR_DECL, 0); }
		public TerminalNode ARG_DECL() { return getToken(DefParser.ARG_DECL, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DefListener ) ((DefListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			match(ID);

			            System.out.println("line " + _localctx.ID().getSymbol().getLine() + ": def " + _localctx.ID().getText());
			            VariableSymbol vs = new VariableSymbol(_localctx.ID().getText(), null);
			            currentScope.define(vs);
			        
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
		"\u0004\u0001\t?\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004+\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0000\u0002\u0002\u0000\u0002\u0002\t\t\u0001\u0000\u0006\b;\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004 \u0001"+
		"\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b&\u0001\u0000\u0000"+
		"\u0000\n.\u0001\u0000\u0000\u0000\f1\u0001\u0000\u0000\u0000\u000e5\u0001"+
		"\u0000\u0000\u0000\u00108\u0001\u0000\u0000\u0000\u0012:\u0001\u0000\u0000"+
		"\u0000\u0014\u001a\u0003\u0004\u0002\u0000\u0015\u001a\u0003\f\u0006\u0000"+
		"\u0016\u001a\u0003\b\u0004\u0000\u0017\u001a\u0003\u0012\t\u0000\u0018"+
		"\u001a\u0003\u0010\b\u0000\u0019\u0014\u0001\u0000\u0000\u0000\u0019\u0015"+
		"\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0001"+
		"\u0001\u0000\u0000\u0000\u001b\u001f\u0003\u0006\u0003\u0000\u001c\u001f"+
		"\u0003\u000e\u0007\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005\u0003\u0000"+
		"\u0000!\"\u0006\u0002\uffff\uffff\u0000\"\u0005\u0001\u0000\u0000\u0000"+
		"#$\u0005\u0003\u0000\u0000$%\u0006\u0003\uffff\uffff\u0000%\u0007\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'*\u0005\t\u0000\u0000("+
		")\u0005\u0005\u0000\u0000)+\u0005\t\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0006\u0004\uffff"+
		"\uffff\u0000-\t\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0006"+
		"\u0005\uffff\uffff\u00000\u000b\u0001\u0000\u0000\u000012\u0005\u0004"+
		"\u0000\u000023\u0005\t\u0000\u000034\u0006\u0006\uffff\uffff\u00004\r"+
		"\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u000067\u0006\u0007\uffff"+
		"\uffff\u00007\u000f\u0001\u0000\u0000\u000089\u0007\u0000\u0000\u0000"+
		"9\u0011\u0001\u0000\u0000\u0000:;\u0007\u0001\u0000\u0000;<\u0005\t\u0000"+
		"\u0000<=\u0006\t\uffff\uffff\u0000=\u0013\u0001\u0000\u0000\u0000\u0003"+
		"\u0019\u001e*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}