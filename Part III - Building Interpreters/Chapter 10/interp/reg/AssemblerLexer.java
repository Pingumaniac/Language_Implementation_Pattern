package reg;

// Generated from Assembler.g by ANTLR 4.13.0
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, REG=8, ID=9, FUNC=10,
		LETTER=11, INT=12, CHAR=13, STRING=14, FLOAT=15, WS=16, NEWLINE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "REG", "ID",
			"FUNC", "LETTER", "INT", "CHAR", "STRING", "FLOAT", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.globals'", "'.def'", "':'", "'args'", "'='", "','", "'locals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "REG", "ID", "FUNC",
			"LETTER", "INT", "CHAR", "STRING", "FLOAT", "WS", "NEWLINE"
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


	    // Define the functionality required by the parser for code generation
	    protected void gen(org.antlr.v4.runtime.Token instrToken) {;}
	    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token operandToken) {;}
	    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token oToken1, org.antlr.v4.runtime.Token oToken2) {;}
	    protected void gen(org.antlr.v4.runtime.Token instrToken, org.antlr.v4.runtime.Token oToken1, org.antlr.v4.runtime.Token oToken2, org.antlr.v4.runtime.Token oToken3) {;}
	    protected void checkForUnresolvedReferences() {;}
	    protected void defineFunction(org.antlr.v4.runtime.Token idToken, int nargs, int nlocals) {;}
	    protected void defineDataSize(int n) {;}
	    protected void defineLabel(org.antlr.v4.runtime.Token idToken) {;}


	public AssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembler.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bJ"+
		"\b\b\n\b\f\bM\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0003\u000bV\b\u000b\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b"+
		"\f\u000bZ\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rc\b\r"+
		"\n\r\f\rf\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000em\b\u000e\n\u000e\f\u000ep\t\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000et\b\u000e\u000b\u000e\f\u000eu\u0003\u000ex\b\u000e\u0001\u000f"+
		"\u0004\u000f{\b\u000f\u000b\u000f\f\u000f|\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0083\b\u0010\n\u0010\f\u0010\u0086\t\u0010"+
		"\u0003\u0010\u0088\b\u0010\u0001\u0010\u0003\u0010\u008b\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011\u0001\u0000\u0004\u0002\u0000AZaz\u0003\u0000\n\n"+
		"\r\r\"\"\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u009b\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00051"+
		"\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t8\u0001\u0000"+
		"\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000"+
		"\u000fC\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013N"+
		"\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017U\u0001\u0000"+
		"\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000"+
		"\u0000\u001dw\u0001\u0000\u0000\u0000\u001fz\u0001\u0000\u0000\u0000!"+
		"\u0087\u0001\u0000\u0000\u0000#$\u0005.\u0000\u0000$%\u0005g\u0000\u0000"+
		"%&\u0005l\u0000\u0000&\'\u0005o\u0000\u0000\'(\u0005b\u0000\u0000()\u0005"+
		"a\u0000\u0000)*\u0005l\u0000\u0000*+\u0005s\u0000\u0000+\u0002\u0001\u0000"+
		"\u0000\u0000,-\u0005.\u0000\u0000-.\u0005d\u0000\u0000./\u0005e\u0000"+
		"\u0000/0\u0005f\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005:\u0000"+
		"\u00002\u0006\u0001\u0000\u0000\u000034\u0005a\u0000\u000045\u0005r\u0000"+
		"\u000056\u0005g\u0000\u000067\u0005s\u0000\u00007\b\u0001\u0000\u0000"+
		"\u000089\u0005=\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005,\u0000"+
		"\u0000;\f\u0001\u0000\u0000\u0000<=\u0005l\u0000\u0000=>\u0005o\u0000"+
		"\u0000>?\u0005c\u0000\u0000?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000"+
		"AB\u0005s\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005r\u0000\u0000"+
		"DE\u0003\u0017\u000b\u0000E\u0010\u0001\u0000\u0000\u0000FK\u0003\u0015"+
		"\n\u0000GJ\u0003\u0015\n\u0000HJ\u000209\u0000IG\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0003\u0011\b\u0000OP\u0005(\u0000\u0000PQ\u0005"+
		")\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000"+
		"S\u0016\u0001\u0000\u0000\u0000TV\u0005-\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WY\u000209\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u0018\u0001\u0000\u0000\u0000\\]\u0005"+
		"\'\u0000\u0000]^\t\u0000\u0000\u0000^_\u0005\'\u0000\u0000_\u001a\u0001"+
		"\u0000\u0000\u0000`d\u0005\"\u0000\u0000ac\b\u0001\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gh\u0005\"\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0003\u0017"+
		"\u000b\u0000jn\u0005.\u0000\u0000km\u0003\u0017\u000b\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000ox\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qs\u0005.\u0000\u0000rt\u0003\u0017\u000b\u0000sr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wi\u0001\u0000\u0000\u0000wq\u0001\u0000"+
		"\u0000\u0000x\u001e\u0001\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006"+
		"\u000f\u0000\u0000\u007f \u0001\u0000\u0000\u0000\u0080\u0084\u0005;\u0000"+
		"\u0000\u0081\u0083\b\u0003\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0005\r\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\n\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0006\u0010\u0000\u0000\u008f\"\u0001\u0000\u0000\u0000\r\u0000IKUZd"+
		"nuw|\u0084\u0087\u008a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
