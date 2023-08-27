// Generated from Ref.g by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RefParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, EXTENDS=9, 
		MEMBERS=10, METHOD_DECL=11, FIELD_DECL=12, VAR_DECL=13, ARG_DECL=14, CALL=15, 
		EXPR=16, ID=17, INT=18;
	public static final int
		RULE_topdown = 0, RULE_enterClass = 1, RULE_enterMethod = 2, RULE_varDeclaration = 3, 
		RULE_type = 4, RULE_assignment = 5, RULE_resolveExpr = 6, RULE_expr = 7, 
		RULE_id = 8, RULE_member = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"topdown", "enterClass", "enterMethod", "varDeclaration", "type", "assignment", 
			"resolveExpr", "expr", "id", "member"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'float'", "'int'", "'void'", "'='", "'+'", "'this'", 
			"'.'", "'extends'", "'members'", "'method_decl'", "'field_decl'", "'var_decl'", 
			"'arg_decl'", "'call'", "'expr'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "EXTENDS", "MEMBERS", 
			"METHOD_DECL", "FIELD_DECL", "VAR_DECL", "ARG_DECL", "CALL", "EXPR", 
			"ID", "INT"
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
	public String getGrammarFileName() { return "Ref.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymbolTable symtab;
	    public RefParser(TokenStream input, SymbolTable symtab) {
	        super(input);
	        this.symtab = symtab;
	    }

	public RefParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopdownContext extends ParserRuleContext {
		public EnterMethodContext enterMethod() {
			return getRuleContext(EnterMethodContext.class,0);
		}
		public EnterClassContext enterClass() {
			return getRuleContext(EnterClassContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ResolveExprContext resolveExpr() {
			return getRuleContext(ResolveExprContext.class,0);
		}
		public TopdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterTopdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitTopdown(this);
		}
	}

	public final TopdownContext topdown() throws RecognitionException {
		TopdownContext _localctx = new TopdownContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topdown);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METHOD_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				enterMethod();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				enterClass();
				}
				break;
			case FIELD_DECL:
			case VAR_DECL:
			case ARG_DECL:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				varDeclaration();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				assignment();
				}
				break;
			case EXPR:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				resolveExpr();
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
	public static class EnterClassContext extends ParserRuleContext {
		public Token ID;
		public Token EXTENDS;
		public List<TerminalNode> ID() { return getTokens(RefParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RefParser.ID, i);
		}
		public TerminalNode MEMBERS() { return getToken(RefParser.MEMBERS, 0); }
		public TerminalNode EXTENDS() { return getToken(RefParser.EXTENDS, 0); }
		public EnterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterEnterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitEnterClass(this);
		}
	}

	public final EnterClassContext enterClass() throws RecognitionException {
		EnterClassContext _localctx = new EnterClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			((EnterClassContext)_localctx).ID = match(ID);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(29);
				((EnterClassContext)_localctx).EXTENDS = match(EXTENDS);
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(32);
				((EnterClassContext)_localctx).ID = match(ID);
				}
			}

			setState(35);
			match(MEMBERS);

			            if (((EnterClassContext)_localctx).EXTENDS != null) {
			                Symbol sup = symtab.resolve((((EnterClassContext)_localctx).EXTENDS!=null?((EnterClassContext)_localctx).EXTENDS.getText():null));
			                ClassSymbol current = (ClassSymbol) symtab.resolve((((EnterClassContext)_localctx).ID!=null?((EnterClassContext)_localctx).ID.getText():null));
			                current.superClass = (ClassSymbol) sup;
			                System.out.println("line " + ((EnterClassContext)_localctx).ID.getLine() + ": set " + (((EnterClassContext)_localctx).ID!=null?((EnterClassContext)_localctx).ID.getText():null) + " super to " + current.superClass.name);
			            }
			            else {
			                System.out.println("line " + ((EnterClassContext)_localctx).ID.getLine() + ": set " + (((EnterClassContext)_localctx).ID!=null?((EnterClassContext)_localctx).ID.getText():null));
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
	public static class EnterMethodContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public TerminalNode METHOD_DECL() { return getToken(RefParser.METHOD_DECL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RefParser.ID, 0); }
		public EnterMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterEnterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitEnterMethod(this);
		}
	}

	public final EnterMethodContext enterMethod() throws RecognitionException {
		EnterMethodContext _localctx = new EnterMethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enterMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(METHOD_DECL);
			setState(39);
			((EnterMethodContext)_localctx).type = type();
			setState(40);
			((EnterMethodContext)_localctx).ID = match(ID);

			            Symbol s = symtab.resolve((((EnterMethodContext)_localctx).ID!=null?((EnterMethodContext)_localctx).ID.getText():null));
			            s.type = symtab.resolve((((EnterMethodContext)_localctx).type!=null?_input.getText(((EnterMethodContext)_localctx).type.start,((EnterMethodContext)_localctx).type.stop):null));
			            System.out.println("line " + ((EnterMethodContext)_localctx).ID.getLine() + ": set method type " + s);
			        
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
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RefParser.ID, 0); }
		public TerminalNode FIELD_DECL() { return getToken(RefParser.FIELD_DECL, 0); }
		public TerminalNode VAR_DECL() { return getToken(RefParser.VAR_DECL, 0); }
		public TerminalNode ARG_DECL() { return getToken(RefParser.ARG_DECL, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			((VarDeclarationContext)_localctx).type = type();
			setState(45);
			((VarDeclarationContext)_localctx).ID = match(ID);

			            Symbol s = symtab.resolve((((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null));
			            s.type = symtab.resolve((((VarDeclarationContext)_localctx).type!=null?_input.getText(((VarDeclarationContext)_localctx).type.start,((VarDeclarationContext)_localctx).type.stop):null));
			            System.out.println("line " + ((VarDeclarationContext)_localctx).ID.getLine() + ": set var type " + s);
			        
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
		public TerminalNode ID() { return getToken(RefParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131100L) != 0)) ) {
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
	public static class AssignmentContext extends ParserRuleContext {
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
			if ( listener instanceof RefListener ) ((RefListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			expr();
			setState(52);
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
	public static class ResolveExprContext extends ParserRuleContext {
		public TerminalNode EXPR() { return getToken(RefParser.EXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ResolveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterResolveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitResolveExpr(this);
		}
	}

	public final ResolveExprContext resolveExpr() throws RecognitionException {
		ResolveExprContext _localctx = new ResolveExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resolveExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(EXPR);
			setState(55);
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
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public TerminalNode CALL() { return getToken(RefParser.CALL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INT() { return getToken(RefParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				member();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(CALL);
				setState(59);
				expr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__5);
				setState(61);
				expr();
				setState(62);
				expr();
				}
				break;
			case T__6:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				id();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(INT);
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
	public static class IdContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RefParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((IdContext)_localctx).ID = match(ID);

				            Symbol s = symtab.resolve((((IdContext)_localctx).ID!=null?((IdContext)_localctx).ID.getText():null));
				            if (s != null) {
				                // Insert code for type checking or other actions here.
				            }
				        
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__6);

				            // Insert code for 'this' resolution here, for example:
				            ClassSymbol currentClass = symtab.getEnclosingClass();
				            // Continue with other code...
				        
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
	public static class MemberContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(RefParser.ID, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefListener ) ((RefListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__7);
			setState(75);
			((MemberContext)_localctx).expr = expr();
			setState(76);
			((MemberContext)_localctx).ID = match(ID);

			            ClassSymbol scope = (ClassSymbol) symtab.resolve((((MemberContext)_localctx).expr!=null?_input.getText(((MemberContext)_localctx).expr.start,((MemberContext)_localctx).expr.stop):null));
			            Symbol s = scope.resolveMember((((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getText():null));
			            System.out.println("line " + ((MemberContext)_localctx).ID.getLine() + ": resolve " + (((MemberContext)_localctx).expr!=null?_input.getText(((MemberContext)_localctx).expr.start,((MemberContext)_localctx).expr.stop):null) + "." + (((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getText():null) + " to " + s);
			        
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
		"\u0004\u0001\u0012P\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001f\b\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007C\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bI\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\f\u000e\u0002\u0000"+
		"\u0002\u0004\u0011\u0011P\u0000\u0019\u0001\u0000\u0000\u0000\u0002\u001b"+
		"\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006+\u0001\u0000"+
		"\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f6"+
		"\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010H\u0001\u0000"+
		"\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014\u001a\u0003\u0004\u0002"+
		"\u0000\u0015\u001a\u0003\u0002\u0001\u0000\u0016\u001a\u0003\u0006\u0003"+
		"\u0000\u0017\u001a\u0003\n\u0005\u0000\u0018\u001a\u0003\f\u0006\u0000"+
		"\u0019\u0014\u0001\u0000\u0000\u0000\u0019\u0015\u0001\u0000\u0000\u0000"+
		"\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001e\u0005\u0011\u0000\u0000"+
		"\u001d\u001f\u0005\t\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0005"+
		"\u0011\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0005\n\u0000\u0000$%\u0006\u0001\uffff"+
		"\uffff\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u000b\u0000\u0000"+
		"\'(\u0003\b\u0004\u0000()\u0005\u0011\u0000\u0000)*\u0006\u0002\uffff"+
		"\uffff\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000"+
		",-\u0003\b\u0004\u0000-.\u0005\u0011\u0000\u0000./\u0006\u0003\uffff\uffff"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0007\u0001\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0003\u000e\u0007\u0000"+
		"45\u0003\u000e\u0007\u00005\u000b\u0001\u0000\u0000\u000067\u0005\u0010"+
		"\u0000\u000078\u0003\u000e\u0007\u00008\r\u0001\u0000\u0000\u00009C\u0003"+
		"\u0012\t\u0000:;\u0005\u000f\u0000\u0000;C\u0003\u000e\u0007\u0000<=\u0005"+
		"\u0006\u0000\u0000=>\u0003\u000e\u0007\u0000>?\u0003\u000e\u0007\u0000"+
		"?C\u0001\u0000\u0000\u0000@C\u0003\u0010\b\u0000AC\u0005\u0012\u0000\u0000"+
		"B9\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u000f\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0011\u0000\u0000EI\u0006\b\uffff\uffff\u0000"+
		"FG\u0005\u0007\u0000\u0000GI\u0006\b\uffff\uffff\u0000HD\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000I\u0011\u0001\u0000\u0000\u0000JK\u0005"+
		"\b\u0000\u0000KL\u0003\u000e\u0007\u0000LM\u0005\u0011\u0000\u0000MN\u0006"+
		"\t\uffff\uffff\u0000N\u0013\u0001\u0000\u0000\u0000\u0005\u0019\u001e"+
		"!BH";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}