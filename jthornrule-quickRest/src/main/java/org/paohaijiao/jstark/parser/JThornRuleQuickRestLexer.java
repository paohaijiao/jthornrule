// Generated from D:/idea/jthornruleGrammer/QuickRest/JThornRuleQuickRest.g4 by ANTLR 4.13.2
package org.paohaijiao.jstark.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JThornRuleQuickRestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, HTTP_METHOD=22, STRING=23, STRING_EMPTY=24, 
		URL=25, WS=26, LINE_CONTINUATION=27, UNKNOWN=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "HTTP_METHOD", "STRING", "STRING_EMPTY", 
			"ESCAPE_SEQUENCE", "URL", "WS", "LINE_CONTINUATION", "UNKNOWN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'curl'", "'-X'", "'--request'", "'-H'", "'--header'", "'-d'", 
			"'--data'", "'--data-ascii'", "'--data-binary'", "'--data-raw'", "'--data-urlencode'", 
			"'-u'", "'--user'", "'-L'", "'--location'", "'-v'", "'--verbose'", "'-s'", 
			"'--silent'", "'-k'", "'--insecure'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "HTTP_METHOD", 
			"STRING", "STRING_EMPTY", "URL", "WS", "LINE_CONTINUATION", "UNKNOWN"
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


	public JThornRuleQuickRestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JThornRuleQuickRest.g4"; }

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
		"\u0004\u0000\u001c\u0141\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00fa\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00ff\b\u0016\n\u0016\f\u0016\u0102\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0108\b\u0016"+
		"\n\u0016\f\u0016\u010b\t\u0016\u0001\u0016\u0003\u0016\u010e\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0114\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011f\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0124\b\u0019\u0001\u0019\u0004\u0019\u0127"+
		"\b\u0019\u000b\u0019\f\u0019\u0128\u0001\u0019\u0003\u0019\u012c\b\u0019"+
		"\u0001\u001a\u0004\u001a\u012f\b\u001a\u000b\u001a\f\u001a\u0130\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0137\b\u001b\u0001"+
		"\u001b\u0003\u001b\u013a\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00003\u00195\u001a"+
		"7\u001b9\u001c\u0001\u0000\u0005\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\"+
		"\\\u0003\u0000\"\"\'\'\\\\\t\u0000!!#$&;==?[]]__az~~\u0003\u0000\t\n\r"+
		"\r  \u0152\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000"+
		"\u0000\u0005C\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\t"+
		"P\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000\u0000\r\\\u0001\u0000"+
		"\u0000\u0000\u000fc\u0001\u0000\u0000\u0000\u0011p\u0001\u0000\u0000\u0000"+
		"\u0013~\u0001\u0000\u0000\u0000\u0015\u0089\u0001\u0000\u0000\u0000\u0017"+
		"\u009a\u0001\u0000\u0000\u0000\u0019\u009d\u0001\u0000\u0000\u0000\u001b"+
		"\u00a4\u0001\u0000\u0000\u0000\u001d\u00a7\u0001\u0000\u0000\u0000\u001f"+
		"\u00b2\u0001\u0000\u0000\u0000!\u00b5\u0001\u0000\u0000\u0000#\u00bf\u0001"+
		"\u0000\u0000\u0000%\u00c2\u0001\u0000\u0000\u0000\'\u00cb\u0001\u0000"+
		"\u0000\u0000)\u00ce\u0001\u0000\u0000\u0000+\u00f9\u0001\u0000\u0000\u0000"+
		"-\u010d\u0001\u0000\u0000\u0000/\u0113\u0001\u0000\u0000\u00001\u0115"+
		"\u0001\u0000\u0000\u00003\u012b\u0001\u0000\u0000\u00005\u012e\u0001\u0000"+
		"\u0000\u00007\u0134\u0001\u0000\u0000\u00009\u013f\u0001\u0000\u0000\u0000"+
		";<\u0005c\u0000\u0000<=\u0005u\u0000\u0000=>\u0005r\u0000\u0000>?\u0005"+
		"l\u0000\u0000?\u0002\u0001\u0000\u0000\u0000@A\u0005-\u0000\u0000AB\u0005"+
		"X\u0000\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005-\u0000\u0000DE\u0005"+
		"-\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e\u0000\u0000GH\u0005q\u0000"+
		"\u0000HI\u0005u\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005s\u0000\u0000"+
		"KL\u0005t\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000"+
		"NO\u0005H\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000"+
		"QR\u0005-\u0000\u0000RS\u0005h\u0000\u0000ST\u0005e\u0000\u0000TU\u0005"+
		"a\u0000\u0000UV\u0005d\u0000\u0000VW\u0005e\u0000\u0000WX\u0005r\u0000"+
		"\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005-\u0000\u0000Z[\u0005d\u0000"+
		"\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]^\u0005-\u0000"+
		"\u0000^_\u0005d\u0000\u0000_`\u0005a\u0000\u0000`a\u0005t\u0000\u0000"+
		"ab\u0005a\u0000\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005-\u0000\u0000"+
		"de\u0005-\u0000\u0000ef\u0005d\u0000\u0000fg\u0005a\u0000\u0000gh\u0005"+
		"t\u0000\u0000hi\u0005a\u0000\u0000ij\u0005-\u0000\u0000jk\u0005a\u0000"+
		"\u0000kl\u0005s\u0000\u0000lm\u0005c\u0000\u0000mn\u0005i\u0000\u0000"+
		"no\u0005i\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pq\u0005-\u0000\u0000"+
		"qr\u0005-\u0000\u0000rs\u0005d\u0000\u0000st\u0005a\u0000\u0000tu\u0005"+
		"t\u0000\u0000uv\u0005a\u0000\u0000vw\u0005-\u0000\u0000wx\u0005b\u0000"+
		"\u0000xy\u0005i\u0000\u0000yz\u0005n\u0000\u0000z{\u0005a\u0000\u0000"+
		"{|\u0005r\u0000\u0000|}\u0005y\u0000\u0000}\u0012\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005-\u0000\u0000\u007f\u0080\u0005-\u0000\u0000\u0080\u0081"+
		"\u0005d\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082\u0083\u0005t"+
		"\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005-\u0000\u0000"+
		"\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005a\u0000\u0000\u0087\u0088"+
		"\u0005w\u0000\u0000\u0088\u0014\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"-\u0000\u0000\u008a\u008b\u0005-\u0000\u0000\u008b\u008c\u0005d\u0000"+
		"\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005t\u0000\u0000\u008e"+
		"\u008f\u0005a\u0000\u0000\u008f\u0090\u0005-\u0000\u0000\u0090\u0091\u0005"+
		"u\u0000\u0000\u0091\u0092\u0005r\u0000\u0000\u0092\u0093\u0005l\u0000"+
		"\u0000\u0093\u0094\u0005e\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095"+
		"\u0096\u0005c\u0000\u0000\u0096\u0097\u0005o\u0000\u0000\u0097\u0098\u0005"+
		"d\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u0016\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005-\u0000\u0000\u009b\u009c\u0005u\u0000\u0000\u009c"+
		"\u0018\u0001\u0000\u0000\u0000\u009d\u009e\u0005-\u0000\u0000\u009e\u009f"+
		"\u0005-\u0000\u0000\u009f\u00a0\u0005u\u0000\u0000\u00a0\u00a1\u0005s"+
		"\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\u00a3\u0005r\u0000\u0000"+
		"\u00a3\u001a\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5"+
		"\u00a6\u0005L\u0000\u0000\u00a6\u001c\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005-\u0000\u0000\u00a8\u00a9\u0005-\u0000\u0000\u00a9\u00aa\u0005l"+
		"\u0000\u0000\u00aa\u00ab\u0005o\u0000\u0000\u00ab\u00ac\u0005c\u0000\u0000"+
		"\u00ac\u00ad\u0005a\u0000\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae\u00af"+
		"\u0005i\u0000\u0000\u00af\u00b0\u0005o\u0000\u0000\u00b0\u00b1\u0005n"+
		"\u0000\u0000\u00b1\u001e\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005-\u0000"+
		"\u0000\u00b3\u00b4\u0005v\u0000\u0000\u00b4 \u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005-\u0000\u0000\u00b6\u00b7\u0005-\u0000\u0000\u00b7\u00b8\u0005"+
		"v\u0000\u0000\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u00ba\u0005r\u0000"+
		"\u0000\u00ba\u00bb\u0005b\u0000\u0000\u00bb\u00bc\u0005o\u0000\u0000\u00bc"+
		"\u00bd\u0005s\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be\"\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0\u00c1\u0005s\u0000"+
		"\u0000\u00c1$\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005-\u0000\u0000\u00c3"+
		"\u00c4\u0005-\u0000\u0000\u00c4\u00c5\u0005s\u0000\u0000\u00c5\u00c6\u0005"+
		"i\u0000\u0000\u00c6\u00c7\u0005l\u0000\u0000\u00c7\u00c8\u0005e\u0000"+
		"\u0000\u00c8\u00c9\u0005n\u0000\u0000\u00c9\u00ca\u0005t\u0000\u0000\u00ca"+
		"&\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005-\u0000\u0000\u00cc\u00cd\u0005"+
		"k\u0000\u0000\u00cd(\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005-\u0000"+
		"\u0000\u00cf\u00d0\u0005-\u0000\u0000\u00d0\u00d1\u0005i\u0000\u0000\u00d1"+
		"\u00d2\u0005n\u0000\u0000\u00d2\u00d3\u0005s\u0000\u0000\u00d3\u00d4\u0005"+
		"e\u0000\u0000\u00d4\u00d5\u0005c\u0000\u0000\u00d5\u00d6\u0005u\u0000"+
		"\u0000\u00d6\u00d7\u0005r\u0000\u0000\u00d7\u00d8\u0005e\u0000\u0000\u00d8"+
		"*\u0001\u0000\u0000\u0000\u00d9\u00da\u0005G\u0000\u0000\u00da\u00db\u0005"+
		"E\u0000\u0000\u00db\u00fa\u0005T\u0000\u0000\u00dc\u00dd\u0005P\u0000"+
		"\u0000\u00dd\u00de\u0005O\u0000\u0000\u00de\u00df\u0005S\u0000\u0000\u00df"+
		"\u00fa\u0005T\u0000\u0000\u00e0\u00e1\u0005P\u0000\u0000\u00e1\u00e2\u0005"+
		"U\u0000\u0000\u00e2\u00fa\u0005T\u0000\u0000\u00e3\u00e4\u0005D\u0000"+
		"\u0000\u00e4\u00e5\u0005E\u0000\u0000\u00e5\u00e6\u0005L\u0000\u0000\u00e6"+
		"\u00e7\u0005E\u0000\u0000\u00e7\u00e8\u0005T\u0000\u0000\u00e8\u00fa\u0005"+
		"E\u0000\u0000\u00e9\u00ea\u0005P\u0000\u0000\u00ea\u00eb\u0005A\u0000"+
		"\u0000\u00eb\u00ec\u0005T\u0000\u0000\u00ec\u00ed\u0005C\u0000\u0000\u00ed"+
		"\u00fa\u0005H\u0000\u0000\u00ee\u00ef\u0005H\u0000\u0000\u00ef\u00f0\u0005"+
		"E\u0000\u0000\u00f0\u00f1\u0005A\u0000\u0000\u00f1\u00fa\u0005D\u0000"+
		"\u0000\u00f2\u00f3\u0005O\u0000\u0000\u00f3\u00f4\u0005P\u0000\u0000\u00f4"+
		"\u00f5\u0005T\u0000\u0000\u00f5\u00f6\u0005I\u0000\u0000\u00f6\u00f7\u0005"+
		"O\u0000\u0000\u00f7\u00f8\u0005N\u0000\u0000\u00f8\u00fa\u0005S\u0000"+
		"\u0000\u00f9\u00d9\u0001\u0000\u0000\u0000\u00f9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00f9\u00e0\u0001\u0000\u0000\u0000\u00f9\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f2\u0001\u0000\u0000\u0000\u00fa,\u0001\u0000\u0000\u0000"+
		"\u00fb\u0100\u0005\"\u0000\u0000\u00fc\u00ff\b\u0000\u0000\u0000\u00fd"+
		"\u00ff\u00031\u0018\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u010e"+
		"\u0005\"\u0000\u0000\u0104\u0109\u0005\'\u0000\u0000\u0105\u0108\b\u0001"+
		"\u0000\u0000\u0106\u0108\u00031\u0018\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0005\'\u0000\u0000\u010d\u00fb\u0001\u0000\u0000\u0000"+
		"\u010d\u0104\u0001\u0000\u0000\u0000\u010e.\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\'\u0000\u0000\u0110\u0114\u0005\'\u0000\u0000\u0111\u0112"+
		"\u0005\"\u0000\u0000\u0112\u0114\u0005\"\u0000\u0000\u0113\u010f\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u01140\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\\\u0000\u0000\u0116\u0117\u0007\u0002\u0000"+
		"\u0000\u01172\u0001\u0000\u0000\u0000\u0118\u0119\u0005h\u0000\u0000\u0119"+
		"\u011a\u0005t\u0000\u0000\u011a\u011b\u0005t\u0000\u0000\u011b\u011c\u0005"+
		"p\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0005s\u0000"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005:\u0000\u0000"+
		"\u0121\u0122\u0005/\u0000\u0000\u0122\u0124\u0005/\u0000\u0000\u0123\u0118"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0001\u0000\u0000\u0000\u0125\u0127\u0007\u0003\u0000\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c"+
		"\u0001\u0000\u0000\u0000\u012a\u012c\u0003-\u0016\u0000\u012b\u0123\u0001"+
		"\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c4\u0001\u0000"+
		"\u0000\u0000\u012d\u012f\u0007\u0004\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0006\u001a\u0000\u0000\u01336\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0005\\\u0000\u0000\u0135\u0137\u00035\u001a\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u013a\u0005\r\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0005\n\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0006\u001b\u0000\u0000\u013e8\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\t\u0000\u0000\u0000\u0140:\u0001\u0000"+
		"\u0000\u0000\u000f\u0000\u00f9\u00fe\u0100\u0107\u0109\u010d\u0113\u011e"+
		"\u0123\u0128\u012b\u0130\u0136\u0139\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}