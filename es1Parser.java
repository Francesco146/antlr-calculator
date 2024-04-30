// Generated from /home/accounts/studenti/id234mpo/IdeaProjects/lab3/src/es1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class es1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, VAR=2, LPAR=3, RPAR=4, PLUS=5, MUL=6, MINUS=7, DIV=8, MOD=9, COLON=10, 
		EQUAL=11, WS=12;
	public static final int
		RULE_main = 0, RULE_commands = 1, RULE_exp = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "commands", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'+'", "'*'", "'-'", "'/'", "'%'", "';'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "VAR", "LPAR", "RPAR", "PLUS", "MUL", "MINUS", "DIV", "MOD", 
			"COLON", "EQUAL", "WS"
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
	public String getGrammarFileName() { return "es1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public es1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(es1Parser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			commands();
			setState(7);
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
	public static class CommandsContext extends ParserRuleContext {
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	 
		public CommandsContext() { }
		public void copyFrom(CommandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends CommandsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpressionContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends CommandsContext {
		public TerminalNode VAR() { return getToken(es1Parser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(es1Parser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(es1Parser.COLON, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public DeclarationContext(CommandsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				exp();
				}
				break;
			case 2:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(VAR);
				setState(11);
				match(EQUAL);
				setState(12);
				exp();
				setState(13);
				match(COLON);
				setState(14);
				commands();
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(es1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(es1Parser.DIV, 0); }
		public TerminalNode RPAR() { return getToken(es1Parser.RPAR, 0); }
		public DivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(es1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(es1Parser.MINUS, 0); }
		public TerminalNode RPAR() { return getToken(es1Parser.RPAR, 0); }
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(es1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD() { return getToken(es1Parser.MOD, 0); }
		public TerminalNode RPAR() { return getToken(es1Parser.RPAR, 0); }
		public ModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(es1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(es1Parser.MUL, 0); }
		public TerminalNode RPAR() { return getToken(es1Parser.RPAR, 0); }
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpContext {
		public TerminalNode VAR() { return getToken(es1Parser.VAR, 0); }
		public VarContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExpContext {
		public TerminalNode INT() { return getToken(es1Parser.INT, 0); }
		public IntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(es1Parser.LPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(es1Parser.PLUS, 0); }
		public TerminalNode RPAR() { return getToken(es1Parser.RPAR, 0); }
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof es1Visitor ) return ((es1Visitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(INT);
				}
				break;
			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(VAR);
				}
				break;
			case 3:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(LPAR);
				setState(21);
				exp();
				setState(22);
				match(MOD);
				setState(23);
				exp();
				setState(24);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(LPAR);
				setState(27);
				exp();
				setState(28);
				match(MUL);
				setState(29);
				exp();
				setState(30);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(LPAR);
				setState(33);
				exp();
				setState(34);
				match(DIV);
				setState(35);
				exp();
				setState(36);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				match(LPAR);
				setState(39);
				exp();
				setState(40);
				match(PLUS);
				setState(41);
				exp();
				setState(42);
				match(RPAR);
				}
				break;
			case 7:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				match(LPAR);
				setState(45);
				exp();
				setState(46);
				match(MINUS);
				setState(47);
				exp();
				setState(48);
				match(RPAR);
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

	public static final String _serializedATN =
		"\u0004\u0001\f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0011\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001"+
		"\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u00008\u0000\u0006\u0001"+
		"\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u00042\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007\b\u0005\u0000\u0000"+
		"\u0001\b\u0001\u0001\u0000\u0000\u0000\t\u0011\u0003\u0004\u0002\u0000"+
		"\n\u000b\u0005\u0002\u0000\u0000\u000b\f\u0005\u000b\u0000\u0000\f\r\u0003"+
		"\u0004\u0002\u0000\r\u000e\u0005\n\u0000\u0000\u000e\u000f\u0003\u0002"+
		"\u0001\u0000\u000f\u0011\u0001\u0000\u0000\u0000\u0010\t\u0001\u0000\u0000"+
		"\u0000\u0010\n\u0001\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000"+
		"\u00123\u0005\u0001\u0000\u0000\u00133\u0005\u0002\u0000\u0000\u0014\u0015"+
		"\u0005\u0003\u0000\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017"+
		"\u0005\t\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0005"+
		"\u0004\u0000\u0000\u00193\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0003"+
		"\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0006"+
		"\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0005\u0004"+
		"\u0000\u0000\u001f3\u0001\u0000\u0000\u0000 !\u0005\u0003\u0000\u0000"+
		"!\"\u0003\u0004\u0002\u0000\"#\u0005\b\u0000\u0000#$\u0003\u0004\u0002"+
		"\u0000$%\u0005\u0004\u0000\u0000%3\u0001\u0000\u0000\u0000&\'\u0005\u0003"+
		"\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005\u0005\u0000\u0000)*\u0003"+
		"\u0004\u0002\u0000*+\u0005\u0004\u0000\u0000+3\u0001\u0000\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0007\u0000"+
		"\u0000/0\u0003\u0004\u0002\u000001\u0005\u0004\u0000\u000013\u0001\u0000"+
		"\u0000\u00002\u0012\u0001\u0000\u0000\u00002\u0013\u0001\u0000\u0000\u0000"+
		"2\u0014\u0001\u0000\u0000\u00002\u001a\u0001\u0000\u0000\u00002 \u0001"+
		"\u0000\u0000\u00002&\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u0000"+
		"3\u0005\u0001\u0000\u0000\u0000\u0002\u00102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}