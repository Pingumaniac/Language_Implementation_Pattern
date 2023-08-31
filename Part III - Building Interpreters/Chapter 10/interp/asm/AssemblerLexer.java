// Generated from Assembler.g by ANTLR 4.13.0
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			FUNC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void FUNC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(ID.getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\b\b\n\b\f\bM\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0003\u000bX\b\u000b\u0001\u000b\u0004\u000b[\b"+
		"\u000b\u000b\u000b\f\u000b\\\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\re\b\r\n\r\f\rh\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000eo\b\u000e\n\u000e\f\u000er\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000ev\b\u000e\u000b\u000e\f\u000ew\u0003\u000ez\b\u000e"+
		"\u0001\u000f\u0004\u000f}\b\u000f\u000b\u000f\f\u000f~\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0085\b\u0010\n\u0010\f\u0010"+
		"\u0088\t\u0010\u0003\u0010\u008a\b\u0010\u0001\u0010\u0003\u0010\u008d"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0002\u0000AZaz\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u009d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0001#\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u0005"+
		"1\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t8\u0001\u0000"+
		"\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000"+
		"\u000fC\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013N"+
		"\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017W\u0001\u0000"+
		"\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000\u0000"+
		"\u001dy\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!\u0089"+
		"\u0001\u0000\u0000\u0000#$\u0005.\u0000\u0000$%\u0005g\u0000\u0000%&\u0005"+
		"l\u0000\u0000&\'\u0005o\u0000\u0000\'(\u0005b\u0000\u0000()\u0005a\u0000"+
		"\u0000)*\u0005l\u0000\u0000*+\u0005s\u0000\u0000+\u0002\u0001\u0000\u0000"+
		"\u0000,-\u0005.\u0000\u0000-.\u0005d\u0000\u0000./\u0005e\u0000\u0000"+
		"/0\u0005f\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005:\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000034\u0005a\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005g\u0000\u000067\u0005s\u0000\u00007\b\u0001\u0000\u0000\u0000"+
		"89\u0005=\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005,\u0000\u0000"+
		";\f\u0001\u0000\u0000\u0000<=\u0005l\u0000\u0000=>\u0005o\u0000\u0000"+
		">?\u0005c\u0000\u0000?@\u0005a\u0000\u0000@A\u0005l\u0000\u0000AB\u0005"+
		"s\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005r\u0000\u0000DE\u0003"+
		"\u0017\u000b\u0000E\u0010\u0001\u0000\u0000\u0000FK\u0003\u0015\n\u0000"+
		"GJ\u0003\u0015\n\u0000HJ\u000209\u0000IG\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NO\u0003\u0011\b\u0000OP\u0005(\u0000\u0000PQ\u0005)\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0006\t\u0000\u0000S\u0014\u0001\u0000"+
		"\u0000\u0000TU\u0007\u0000\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"VX\u0005-\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000Y[\u000209\u0000ZY\u0001\u0000\u0000\u0000["+
		"\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005\'\u0000\u0000_`\t\u0000"+
		"\u0000\u0000`a\u0005\'\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bf\u0005"+
		"\"\u0000\u0000ce\b\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\"\u0000\u0000"+
		"j\u001c\u0001\u0000\u0000\u0000kl\u0003\u0017\u000b\u0000lp\u0005.\u0000"+
		"\u0000mo\u0003\u0017\u000b\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qz\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0005.\u0000\u0000tv\u0003"+
		"\u0017\u000b\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yk\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000z\u001e\u0001"+
		"\u0000\u0000\u0000{}\u0007\u0002\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u000f"+
		"\u0001\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0086\u0005;\u0000\u0000"+
		"\u0083\u0085\b\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0005\r\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\n\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006"+
		"\u0010\u0001\u0000\u0091\"\u0001\u0000\u0000\u0000\r\u0000IKW\\fpwy~\u0086"+
		"\u0089\u008c\u0002\u0001\t\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}