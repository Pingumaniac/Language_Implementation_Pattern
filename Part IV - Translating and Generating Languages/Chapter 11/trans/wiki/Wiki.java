package wiki;

// Generated from Wiki.g by ANTLR 4.13.0
import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Wiki extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TITLE=1, BOLD=2, LINK=3, ITALICS=4, LI=5, BLANK_LINE=6, UL=7, SECTION=8,
		TABLE=9, ROW=10, COL=11, TABLE_CONTENT=12, TAIL=13, SEC_TAIL=14, ELSE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TITLE", "BOLD", "LINK", "ITALICS", "LI", "BLANK_LINE", "UL", "SECTION",
			"TABLE", "ROW", "COL", "TABLE_CONTENT", "TAIL", "SEC_TAIL", "ELSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'* '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TITLE", "BOLD", "LINK", "ITALICS", "LI", "BLANK_LINE", "UL", "SECTION",
			"TABLE", "ROW", "COL", "TABLE_CONTENT", "TAIL", "SEC_TAIL", "ELSE"
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


	    PrintStream out;
	    Stack<String> context = new Stack<String>();

	    void closeList() {
	        if (context.size() == 0) return;
	        String list = context.pop();
	        out.println("</" + list + ">");
	    }

	    boolean upcomingEndOfCol() {
	        return _input.LA(1) == '|' ||
	               (_input.LA(1) == '\n' &&
	                (_input.LA(2) == '-' && _input.LA(3) == '-') || _input.LA(2) == ']');
	    }

	    public Wiki(CharStream input, PrintStream out) {
	        this(input);
	        this.out = out;
	    }


	public Wiki(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wiki.g"; }

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
		case 0:
			TITLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			BOLD_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LINK_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ITALICS_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			LI_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			BLANK_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			UL_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			SECTION_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			TABLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ROW_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			COL_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TABLE_CONTENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 out.println("<title>" + getText() + "</title>");
			break;
		}
	}
	private void BOLD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 out.print("<b>" + getText().substring(1, getText().length()-1) + "</b>");
			break;
		}
	}
	private void LINK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 /* Insert HTML generation logic here */
			break;
		}
	}
	private void ITALICS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 out.print("<i>" + getText().substring(1, getText().length()-1) + "</i>");
			break;
		}
	}
	private void LI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 out.print("<li>");
			break;
		}
	}
	private void BLANK_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 out.println("\n"); closeList();
			break;
		}
	}
	private void UL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 out.print("<ul>\n<li>"); context.push("ul");
			break;
		}
	}
	private void SECTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

			            String fullText = getText();
			            String tag = fullText.substring(0, 1); // You may have to adjust this
			            String content = fullText.substring(tag.length());
			            if (tag.equals("###")) tag = "h1";
			            else if (tag.equals("##")) tag = "h2";
			            else if (tag.equals("#")) tag = "h3";
			            out.println("<" + tag + ">" + content + "</" + tag + ">");

			break;
		}
	}
	private void TABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 out.print("\n</table>");
			break;
		}
	}
	private void ROW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			out.print("<tr>\n");
			break;
		case 10:
			out.print("\n</tr>\n");
			break;
		}
	}
	private void COL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			out.print("<td>");
			break;
		case 12:
			out.print("</td>");
			break;
		}
	}
	private void TABLE_CONTENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			out.print((char)_input.LA(1));
			break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			 out.print((char) _input.LA(1));
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return TITLE_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return BOLD_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return LI_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return SECTION_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean TITLE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getLine() == 1;
		}
		return true;
	}
	private boolean BOLD_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return getCharPositionInLine() > 0;
		}
		return true;
	}
	private boolean LI_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return getCharPositionInLine() == 0;
		}
		return true;
	}
	private boolean SECTION_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return getCharPositionInLine() == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u00020\b\u0002\u000b"+
		"\u0002\f\u00021\u0001\u0002\u0001\u0002\u0004\u00026\b\u0002\u000b\u0002"+
		"\f\u00027\u0003\u0002:\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0004\u0003A\b\u0003\u000b\u0003\f\u0003B\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"c\b\u0007\u0001\u0007\u0004\u0007f\b\u0007\u000b\u0007\f\u0007g\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0081\b\t\n\t\f\t\u0084\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0004\n\u008a\b\n\u000b\n\f\n\u008b\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0095\b\u000b\u0001\f\u0004\f\u0098\b\f\u000b\f\f\f\u0099\u0001\r\u0004"+
		"\r\u009d\b\r\u000b\r\f\r\u009e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0006\u0001\u0000**\u0002\u0000@@||\u0001"+
		"\u0000@@\u0001\u0000__\u0001\u0000\n\n\u0002\u0000\n\n##\u00b4\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005-\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\t"+
		"G\u0001\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rV\u0001\u0000"+
		"\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000"+
		"\u0013|\u0001\u0000\u0000\u0000\u0015\u0087\u0001\u0000\u0000\u0000\u0017"+
		"\u0094\u0001\u0000\u0000\u0000\u0019\u0097\u0001\u0000\u0000\u0000\u001b"+
		"\u009c\u0001\u0000\u0000\u0000\u001d\u00a0\u0001\u0000\u0000\u0000\u001f"+
		" \u0004\u0000\u0000\u0000 !\u0003\u0019\f\u0000!\"\u0006\u0000\u0000\u0000"+
		"\"\u0002\u0001\u0000\u0000\u0000#$\u0004\u0001\u0001\u0000$&\u0005*\u0000"+
		"\u0000%\'\b\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*+\u0005*\u0000\u0000+,\u0006\u0001\u0001\u0000,\u0004"+
		"\u0001\u0000\u0000\u0000-/\u0005@\u0000\u0000.0\b\u0001\u0000\u0000/."+
		"\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000029\u0001\u0000\u0000\u000035\u0005|\u0000"+
		"\u000046\b\u0002\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000"+
		"\u0000\u000093\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0005@\u0000\u0000<=\u0006\u0002\u0002\u0000=\u0006"+
		"\u0001\u0000\u0000\u0000>@\u0005_\u0000\u0000?A\b\u0003\u0000\u0000@?"+
		"\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005_\u0000"+
		"\u0000EF\u0006\u0003\u0003\u0000F\b\u0001\u0000\u0000\u0000GH\u0004\u0004"+
		"\u0002\u0000HI\u0005*\u0000\u0000IJ\u0005 \u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0006\u0004\u0004\u0000L\n\u0001\u0000\u0000\u0000MN\u0005\n"+
		"\u0000\u0000NO\u0005\n\u0000\u0000OP\u0001\u0000\u0000\u0000PT\u0006\u0005"+
		"\u0005\u0000QU\u0003\r\u0006\u0000RU\u0003\u000f\u0007\u0000SU\u0003\u0011"+
		"\b\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000WX\u0005 "+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\u0006\u0006\u0000Z\u000e"+
		"\u0001\u0000\u0000\u0000[b\u0004\u0007\u0003\u0000\\]\u0005#\u0000\u0000"+
		"]^\u0005#\u0000\u0000^c\u0005#\u0000\u0000_`\u0005#\u0000\u0000`c\u0005"+
		"#\u0000\u0000ac\u0005#\u0000\u0000b\\\u0001\u0000\u0000\u0000b_\u0001"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"df\b\u0004\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0006\u0007\u0007\u0000j\u0010\u0001\u0000\u0000\u0000kl\u0005"+
		"[\u0000\u0000lu\u0003\u0013\t\u0000mn\u0005\n\u0000\u0000no\u0005-\u0000"+
		"\u0000op\u0005-\u0000\u0000pq\u0005\n\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rt\u0003\u0013\t\u0000sm\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000yz\u0005]"+
		"\u0000\u0000z{\u0006\b\b\u0000{\u0012\u0001\u0000\u0000\u0000|}\u0006"+
		"\t\t\u0000}\u0082\u0003\u0015\n\u0000~\u007f\u0005|\u0000\u0000\u007f"+
		"\u0081\u0003\u0015\n\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0006\t\n\u0000\u0086\u0014\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0006\n\u000b\u0000\u0088\u008a\u0003\u0017"+
		"\u000b\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0006\n\f"+
		"\u0000\u008e\u0016\u0001\u0000\u0000\u0000\u008f\u0095\u0003\u0011\b\u0000"+
		"\u0090\u0095\u0003\u0003\u0001\u0000\u0091\u0095\u0003\u0007\u0003\u0000"+
		"\u0092\u0093\t\u0000\u0000\u0000\u0093\u0095\u0006\u000b\r\u0000\u0094"+
		"\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0018\u0001\u0000\u0000\u0000\u0096\u0098\b\u0004\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001a"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\b\u0005\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001c\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\t\u0000\u0000\u0000\u00a1\u00a2\u0006\u000e"+
		"\u000e\u0000\u00a2\u001e\u0001\u0000\u0000\u0000\u000f\u0000(179BTbgu"+
		"\u0082\u008b\u0094\u0099\u009e\u000f\u0001\u0000\u0000\u0001\u0001\u0001"+
		"\u0001\u0002\u0002\u0001\u0003\u0003\u0001\u0004\u0004\u0001\u0005\u0005"+
		"\u0001\u0006\u0006\u0001\u0007\u0007\u0001\b\b\u0001\t\t\u0001\t\n\u0001"+
		"\n\u000b\u0001\n\f\u0001\u000b\r\u0001\u000e\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
