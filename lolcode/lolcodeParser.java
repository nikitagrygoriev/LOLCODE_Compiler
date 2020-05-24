// Generated from lolcode.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, ATOM=43, LABEL=44, BOOLEAN=45, 
		STRING=46, WHITESPACE=47, NEWLINE=48;
	public static final int
		RULE_program = 0, RULE_prog_type = 1, RULE_code_block = 2, RULE_statement = 3, 
		RULE_loop = 4, RULE_declaration = 5, RULE_comment = 6, RULE_print_block = 7, 
		RULE_if_block = 8, RULE_else_if_block = 9, RULE_input_block = 10, RULE_func_decl = 11, 
		RULE_assignment = 12, RULE_full_expression = 13, RULE_expression = 14, 
		RULE_equals = 15, RULE_not_equals = 16, RULE_both = 17, RULE_either = 18, 
		RULE_greater = 19, RULE_less = 20, RULE_add = 21, RULE_sub = 22, RULE_mul = 23, 
		RULE_div = 24, RULE_mod = 25, RULE_r_all = 26, RULE_r_any = 27, RULE_nope = 28, 
		RULE_func = 29, RULE_r_an = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prog_type", "code_block", "statement", "loop", "declaration", 
			"comment", "print_block", "if_block", "else_if_block", "input_block", 
			"func_decl", "assignment", "full_expression", "expression", "equals", 
			"not_equals", "both", "either", "greater", "less", "add", "sub", "mul", 
			"div", "mod", "r_all", "r_any", "nope", "func", "r_an"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'HAI'", "'KTHXBYE'", "'LOL'", "'GOT'", "'GEEK'", "'IM IN YR'", 
			"'WILE'", "'IM OUTTA YR'", "'I HAS A'", "'ITZ'", "'BTW'", "'OBTW'", "'TLDR'", 
			"'VISIBLE'", "'MKAY?'", "'O RLY?'", "'YA RLY'", "'OIC'", "'MEBBE'", "'NO WAI'", 
			"'GIMMEH'", "'HOW DUZ I'", "'YR'", "'AN YR'", "'IF U SAY SO'", "'R'", 
			"'BOTH SAEM'", "'DIFFRINT'", "'BOTH OF'", "'EITHER OF'", "'BIGGR OF'", 
			"'SMALLR OF'", "'SUM OF'", "'DIFF OF'", "'PRODUKT OF'", "'QUOSHUNT OF'", 
			"'MOD OF'", "'ALL OF'", "'ANY OF'", "'NOT'", "'I IZ'", "'AN'", null, 
			null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ATOM", "LABEL", "BOOLEAN", 
			"STRING", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "lolcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lolcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Prog_typeContext prog_type() {
			return getRuleContext(Prog_typeContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(lolcodeParser.NEWLINE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			prog_type();
			setState(64);
			match(NEWLINE);
			setState(65);
			code_block();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(66);
				match(T__1);
				}
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

	public static class Prog_typeContext extends ParserRuleContext {
		public Prog_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterProg_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitProg_type(this);
		}
	}

	public final Prog_typeContext prog_type() throws RecognitionException {
		Prog_typeContext _localctx = new Prog_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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

	public static class Code_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ATOM) | (1L << LABEL))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(lolcodeParser.NEWLINE, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Print_blockContext print_block() {
			return getRuleContext(Print_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Input_blockContext input_block() {
			return getRuleContext(Input_blockContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Full_expressionContext full_expression() {
			return getRuleContext(Full_expressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				loop();
				setState(77);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				declaration();
				setState(80);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				comment();
				setState(83);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				print_block();
				setState(86);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				if_block();
				setState(89);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				input_block();
				setState(92);
				match(NEWLINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				func_decl();
				setState(95);
				match(NEWLINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				assignment();
				setState(98);
				match(NEWLINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				full_expression();
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

	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(lolcodeParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(lolcodeParser.LABEL, i);
		}
		public Full_expressionContext full_expression() {
			return getRuleContext(Full_expressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__5);
			setState(104);
			match(LABEL);
			setState(105);
			match(T__6);
			setState(106);
			full_expression();
			setState(107);
			code_block();
			setState(108);
			match(T__7);
			setState(109);
			match(LABEL);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public TerminalNode ATOM() { return getToken(lolcodeParser.ATOM, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__8);
				setState(112);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__8);
				setState(114);
				match(LABEL);
				setState(115);
				match(T__9);
				setState(116);
				match(ATOM);
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

	public static class CommentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(lolcodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(lolcodeParser.NEWLINE, i);
		}
		public Full_expressionContext full_expression() {
			return getRuleContext(Full_expressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(lolcodeParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__10);
				setState(120);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__11);
				setState(122);
				match(NEWLINE);
				setState(123);
				full_expression();
				setState(124);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(T__10);
				setState(127);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(T__11);
				setState(129);
				match(NEWLINE);
				setState(130);
				match(STRING);
				setState(131);
				match(NEWLINE);
				setState(132);
				match(T__12);
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

	public static class Print_blockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Print_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterPrint_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitPrint_block(this);
		}
	}

	public final Print_blockContext print_block() throws RecognitionException {
		Print_blockContext _localctx = new Print_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ATOM) | (1L << LABEL))) != 0)) {
				{
				{
				setState(136);
				expression();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(142);
				match(T__14);
				}
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

	public static class If_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(lolcodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(lolcodeParser.NEWLINE, i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_if_blockContext else_if_block() {
			return getRuleContext(Else_if_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_block);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__15);
				setState(146);
				match(NEWLINE);
				setState(147);
				match(T__16);
				setState(148);
				match(NEWLINE);
				setState(149);
				code_block();
				setState(150);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__15);
				setState(153);
				match(NEWLINE);
				setState(154);
				match(T__16);
				setState(155);
				match(NEWLINE);
				setState(156);
				code_block();
				setState(157);
				else_if_block();
				setState(158);
				match(T__17);
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

	public static class Else_if_blockContext extends ParserRuleContext {
		public Full_expressionContext full_expression() {
			return getRuleContext(Full_expressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_if_blockContext else_if_block() {
			return getRuleContext(Else_if_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(lolcodeParser.NEWLINE, 0); }
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterElse_if_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitElse_if_block(this);
		}
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_if_block);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__18);
				setState(163);
				full_expression();
				setState(164);
				code_block();
				setState(165);
				else_if_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__19);
				setState(168);
				match(NEWLINE);
				setState(169);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__18);
				setState(171);
				full_expression();
				setState(172);
				code_block();
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

	public static class Input_blockContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public Input_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterInput_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitInput_block(this);
		}
	}

	public final Input_blockContext input_block() throws RecognitionException {
		Input_blockContext _localctx = new Input_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__20);
			setState(177);
			match(LABEL);
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

	public static class Func_declContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(lolcodeParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(lolcodeParser.LABEL, i);
		}
		public TerminalNode NEWLINE() { return getToken(lolcodeParser.NEWLINE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__21);
			setState(180);
			match(LABEL);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				{
				setState(181);
				match(T__22);
				setState(182);
				match(LABEL);
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(184);
					match(T__23);
					setState(185);
					match(LABEL);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(NEWLINE);
			setState(194);
			code_block();
			setState(195);
			match(T__24);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LABEL);
			setState(198);
			match(T__25);
			setState(199);
			expression();
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

	public static class Full_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(lolcodeParser.NEWLINE, 0); }
		public Full_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterFull_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitFull_expression(this);
		}
	}

	public final Full_expressionContext full_expression() throws RecognitionException {
		Full_expressionContext _localctx = new Full_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_full_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expression();
			setState(202);
			match(NEWLINE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public BothContext both() {
			return getRuleContext(BothContext.class,0);
		}
		public Not_equalsContext not_equals() {
			return getRuleContext(Not_equalsContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public EitherContext either() {
			return getRuleContext(EitherContext.class,0);
		}
		public R_allContext r_all() {
			return getRuleContext(R_allContext.class,0);
		}
		public R_anyContext r_any() {
			return getRuleContext(R_anyContext.class,0);
		}
		public NopeContext nope() {
			return getRuleContext(NopeContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public TerminalNode ATOM() { return getToken(lolcodeParser.ATOM, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				equals();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				both();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				not_equals();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				greater();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				less();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				add();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 7);
				{
				setState(210);
				sub();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				mul();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				div();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 10);
				{
				setState(213);
				mod();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 11);
				{
				setState(214);
				either();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 12);
				{
				setState(215);
				r_all();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 13);
				{
				setState(216);
				r_any();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 14);
				{
				setState(217);
				nope();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 15);
				{
				setState(218);
				func();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 16);
				{
				setState(219);
				match(LABEL);
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 17);
				{
				setState(220);
				match(ATOM);
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

	public static class EqualsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__26);
			setState(224);
			expression();
			setState(225);
			r_an();
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

	public static class Not_equalsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public Not_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterNot_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitNot_equals(this);
		}
	}

	public final Not_equalsContext not_equals() throws RecognitionException {
		Not_equalsContext _localctx = new Not_equalsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_not_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__27);
			setState(228);
			expression();
			setState(229);
			r_an();
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

	public static class BothContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public BothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_both; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitBoth(this);
		}
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__28);
			setState(232);
			expression();
			setState(233);
			r_an();
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

	public static class EitherContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public EitherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterEither(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitEither(this);
		}
	}

	public final EitherContext either() throws RecognitionException {
		EitherContext _localctx = new EitherContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_either);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__29);
			setState(236);
			expression();
			setState(237);
			r_an();
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

	public static class GreaterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__30);
			setState(240);
			expression();
			setState(241);
			r_an();
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

	public static class LessContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitLess(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__31);
			setState(244);
			expression();
			setState(245);
			r_an();
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

	public static class AddContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__32);
			setState(248);
			expression();
			setState(249);
			r_an();
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

	public static class SubContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__33);
			setState(252);
			expression();
			setState(253);
			r_an();
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

	public static class MulContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__34);
			setState(256);
			expression();
			setState(257);
			r_an();
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

	public static class DivContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__35);
			setState(260);
			expression();
			setState(261);
			r_an();
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

	public static class ModContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext r_an() {
			return getRuleContext(R_anContext.class,0);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__36);
			setState(264);
			expression();
			setState(265);
			r_an();
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

	public static class R_allContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<R_anContext> r_an() {
			return getRuleContexts(R_anContext.class);
		}
		public R_anContext r_an(int i) {
			return getRuleContext(R_anContext.class,i);
		}
		public R_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterR_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitR_all(this);
		}
	}

	public final R_allContext r_all() throws RecognitionException {
		R_allContext _localctx = new R_allContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_r_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__37);
			setState(268);
			expression();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(269);
				r_an();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(T__14);
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

	public static class R_anyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<R_anContext> r_an() {
			return getRuleContexts(R_anContext.class);
		}
		public R_anContext r_an(int i) {
			return getRuleContext(R_anContext.class,i);
		}
		public R_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterR_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitR_any(this);
		}
	}

	public final R_anyContext r_any() throws RecognitionException {
		R_anyContext _localctx = new R_anyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_r_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__38);
			setState(278);
			expression();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(279);
				r_an();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(T__14);
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

	public static class NopeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterNope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitNope(this);
		}
	}

	public final NopeContext nope() throws RecognitionException {
		NopeContext _localctx = new NopeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__39);
			setState(288);
			expression();
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__40);
			setState(291);
			match(LABEL);
			setState(292);
			expression();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(293);
				match(T__41);
				setState(294);
				expression();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(T__14);
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

	public static class R_anContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public R_anContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_an; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterR_an(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitR_an(this);
		}
	}

	public final R_anContext r_an() throws RecognitionException {
		R_anContext _localctx = new R_anContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_r_an);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__41);
			setState(303);
			expression();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0134\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\4\6\4K\n\4\r\4\16\4L\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0088\n\b\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\t\5"+
		"\t\u0092\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bd"+
		"\n\r\f\r\16\r\u00c0\13\r\5\r\u00c2\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e0\n\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\7\34\u0111\n\34\f\34\16\34\u0114\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\7\35\u011b\n\35\f\35\16\35\u011e\13\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u012a\n\37\f\37\16\37\u012d\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>\2\3\3\2\5\7\2\u013c\2@\3\2\2\2\4G\3\2\2\2\6J\3\2\2\2\bg\3\2"+
		"\2\2\ni\3\2\2\2\fw\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u00a2"+
		"\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00b5\3\2\2\2\32\u00c7\3"+
		"\2\2\2\34\u00cb\3\2\2\2\36\u00df\3\2\2\2 \u00e1\3\2\2\2\"\u00e5\3\2\2"+
		"\2$\u00e9\3\2\2\2&\u00ed\3\2\2\2(\u00f1\3\2\2\2*\u00f5\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u00fd\3\2\2\2\60\u0101\3\2\2\2\62\u0105\3\2\2\2\64\u0109\3\2"+
		"\2\2\66\u010d\3\2\2\28\u0117\3\2\2\2:\u0121\3\2\2\2<\u0124\3\2\2\2>\u0130"+
		"\3\2\2\2@A\7\3\2\2AB\5\4\3\2BC\7\62\2\2CE\5\6\4\2DF\7\4\2\2ED\3\2\2\2"+
		"EF\3\2\2\2F\3\3\2\2\2GH\t\2\2\2H\5\3\2\2\2IK\5\b\5\2JI\3\2\2\2KL\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NO\5\n\6\2OP\7\62\2\2Ph\3\2\2\2QR\5\f"+
		"\7\2RS\7\62\2\2Sh\3\2\2\2TU\5\16\b\2UV\7\62\2\2Vh\3\2\2\2WX\5\20\t\2X"+
		"Y\7\62\2\2Yh\3\2\2\2Z[\5\22\n\2[\\\7\62\2\2\\h\3\2\2\2]^\5\26\f\2^_\7"+
		"\62\2\2_h\3\2\2\2`a\5\30\r\2ab\7\62\2\2bh\3\2\2\2cd\5\32\16\2de\7\62\2"+
		"\2eh\3\2\2\2fh\5\34\17\2gN\3\2\2\2gQ\3\2\2\2gT\3\2\2\2gW\3\2\2\2gZ\3\2"+
		"\2\2g]\3\2\2\2g`\3\2\2\2gc\3\2\2\2gf\3\2\2\2h\t\3\2\2\2ij\7\b\2\2jk\7"+
		".\2\2kl\7\t\2\2lm\5\34\17\2mn\5\6\4\2no\7\n\2\2op\7.\2\2p\13\3\2\2\2q"+
		"r\7\13\2\2rx\7.\2\2st\7\13\2\2tu\7.\2\2uv\7\f\2\2vx\7-\2\2wq\3\2\2\2w"+
		"s\3\2\2\2x\r\3\2\2\2yz\7\r\2\2z\u0088\5\36\20\2{|\7\16\2\2|}\7\62\2\2"+
		"}~\5\34\17\2~\177\7\17\2\2\177\u0088\3\2\2\2\u0080\u0081\7\r\2\2\u0081"+
		"\u0088\7\60\2\2\u0082\u0083\7\16\2\2\u0083\u0084\7\62\2\2\u0084\u0085"+
		"\7\60\2\2\u0085\u0086\7\62\2\2\u0086\u0088\7\17\2\2\u0087y\3\2\2\2\u0087"+
		"{\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0082\3\2\2\2\u0088\17\3\2\2\2\u0089"+
		"\u008d\7\20\2\2\u008a\u008c\5\36\20\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\7\21\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7\62\2\2\u0095"+
		"\u0096\7\23\2\2\u0096\u0097\7\62\2\2\u0097\u0098\5\6\4\2\u0098\u0099\7"+
		"\24\2\2\u0099\u00a3\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009c\7\62\2\2"+
		"\u009c\u009d\7\23\2\2\u009d\u009e\7\62\2\2\u009e\u009f\5\6\4\2\u009f\u00a0"+
		"\5\24\13\2\u00a0\u00a1\7\24\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0093\3\2\2"+
		"\2\u00a2\u009a\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6"+
		"\5\34\17\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8\5\24\13\2\u00a8\u00b1\3\2\2"+
		"\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00b1\5\6\4\2\u00ac"+
		"\u00ad\7\25\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\5\6\4\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1"+
		"\25\3\2\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\7.\2\2\u00b4\27\3\2\2\2\u00b5"+
		"\u00b6\7\30\2\2\u00b6\u00c1\7.\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\7"+
		".\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bd\7.\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c5\5"+
		"\6\4\2\u00c5\u00c6\7\33\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8"+
		"\u00c9\7\34\2\2\u00c9\u00ca\5\36\20\2\u00ca\33\3\2\2\2\u00cb\u00cc\5\36"+
		"\20\2\u00cc\u00cd\7\62\2\2\u00cd\35\3\2\2\2\u00ce\u00e0\5 \21\2\u00cf"+
		"\u00e0\5$\23\2\u00d0\u00e0\5\"\22\2\u00d1\u00e0\5(\25\2\u00d2\u00e0\5"+
		"*\26\2\u00d3\u00e0\5,\27\2\u00d4\u00e0\5.\30\2\u00d5\u00e0\5\60\31\2\u00d6"+
		"\u00e0\5\62\32\2\u00d7\u00e0\5\64\33\2\u00d8\u00e0\5&\24\2\u00d9\u00e0"+
		"\5\66\34\2\u00da\u00e0\58\35\2\u00db\u00e0\5:\36\2\u00dc\u00e0\5<\37\2"+
		"\u00dd\u00e0\7.\2\2\u00de\u00e0\7-\2\2\u00df\u00ce\3\2\2\2\u00df\u00cf"+
		"\3\2\2\2\u00df\u00d0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d2\3\2\2\2\u00df"+
		"\u00d3\3\2\2\2\u00df\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2"+
		"\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3"+
		"\5\36\20\2\u00e3\u00e4\5> \2\u00e4!\3\2\2\2\u00e5\u00e6\7\36\2\2\u00e6"+
		"\u00e7\5\36\20\2\u00e7\u00e8\5> \2\u00e8#\3\2\2\2\u00e9\u00ea\7\37\2\2"+
		"\u00ea\u00eb\5\36\20\2\u00eb\u00ec\5> \2\u00ec%\3\2\2\2\u00ed\u00ee\7"+
		" \2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\5> \2\u00f0\'\3\2\2\2\u00f1\u00f2"+
		"\7!\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\5> \2\u00f4)\3\2\2\2\u00f5\u00f6"+
		"\7\"\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\5> \2\u00f8+\3\2\2\2\u00f9"+
		"\u00fa\7#\2\2\u00fa\u00fb\5\36\20\2\u00fb\u00fc\5> \2\u00fc-\3\2\2\2\u00fd"+
		"\u00fe\7$\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\5> \2\u0100/\3\2\2\2\u0101"+
		"\u0102\7%\2\2\u0102\u0103\5\36\20\2\u0103\u0104\5> \2\u0104\61\3\2\2\2"+
		"\u0105\u0106\7&\2\2\u0106\u0107\5\36\20\2\u0107\u0108\5> \2\u0108\63\3"+
		"\2\2\2\u0109\u010a\7\'\2\2\u010a\u010b\5\36\20\2\u010b\u010c\5> \2\u010c"+
		"\65\3\2\2\2\u010d\u010e\7(\2\2\u010e\u0112\5\36\20\2\u010f\u0111\5> \2"+
		"\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\21\2\2"+
		"\u0116\67\3\2\2\2\u0117\u0118\7)\2\2\u0118\u011c\5\36\20\2\u0119\u011b"+
		"\5> \2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\21"+
		"\2\2\u01209\3\2\2\2\u0121\u0122\7*\2\2\u0122\u0123\5\36\20\2\u0123;\3"+
		"\2\2\2\u0124\u0125\7+\2\2\u0125\u0126\7.\2\2\u0126\u012b\5\36\20\2\u0127"+
		"\u0128\7,\2\2\u0128\u012a\5\36\20\2\u0129\u0127\3\2\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7\21\2\2\u012f=\3\2\2\2\u0130\u0131\7,\2\2"+
		"\u0131\u0132\5\36\20\2\u0132?\3\2\2\2\21ELgw\u0087\u008d\u0091\u00a2\u00b0"+
		"\u00be\u00c1\u00df\u0112\u011c\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}