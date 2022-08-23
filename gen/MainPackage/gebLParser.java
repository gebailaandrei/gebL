// Generated from D:/Projects/IntelliJProjects/gebL/src/MainPackage\gebL.g4 by ANTLR 4.10.1
package MainPackage;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gebLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCURL=1, RCURL=2, LSQBR=3, RSQBR=4, LPAR=5, RPAR=6, QUOTE=7, SQUOTE=8, 
		SCOL=9, COL=10, MULT=11, DIV=12, MOD=13, ADD=14, SUB=15, MULTEQ=16, DIVEQ=17, 
		MODEQ=18, ADDEQ=19, SUBEQ=20, ASSIGN=21, GT=22, LT=23, GTOE=24, LTOE=25, 
		EQ=26, NEQ=27, AND=28, OR=29, PRINT=30, IF=31, ELSEIF=32, ELSE=33, SWITCH=34, 
		CASE=35, BREAK=36, WHILE=37, DO=38, FOR=39, FOREACH=40, DEF=41, RETURN=42, 
		INT=43, FLOAT=44, STRING=45, ID=46, STRING_VAL=47, FUNC_NAME=48, NUM=49, 
		COMMENT=50, WS=51;
	public static final int
		RULE_list = 0, RULE_struct = 1, RULE_varHandler = 2, RULE_decisionalStatements = 3, 
		RULE_ifCondition = 4, RULE_decisionalAndLoopBlock = 5, RULE_loopStatements = 6, 
		RULE_print = 7, RULE_comparisonExpression = 8, RULE_logicalExpression = 9, 
		RULE_operation = 10, RULE_types = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"list", "struct", "varHandler", "decisionalStatements", "ifCondition", 
			"decisionalAndLoopBlock", "loopStatements", "print", "comparisonExpression", 
			"logicalExpression", "operation", "types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "']'", "'['", "'('", "')'", "'\"'", "'''", "';'", 
			"':'", "'*'", "'/'", "'%'", "'+'", "'-'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", 
			"'||'", "'print'", "'if'", "'elseif'", "'else'", "'switch'", "'case'", 
			"'break'", "'while'", "'do'", "'for'", "'foreach'", "'def'", "'return'", 
			"'int'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LCURL", "RCURL", "LSQBR", "RSQBR", "LPAR", "RPAR", "QUOTE", "SQUOTE", 
			"SCOL", "COL", "MULT", "DIV", "MOD", "ADD", "SUB", "MULTEQ", "DIVEQ", 
			"MODEQ", "ADDEQ", "SUBEQ", "ASSIGN", "GT", "LT", "GTOE", "LTOE", "EQ", 
			"NEQ", "AND", "OR", "PRINT", "IF", "ELSEIF", "ELSE", "SWITCH", "CASE", 
			"BREAK", "WHILE", "DO", "FOR", "FOREACH", "DEF", "RETURN", "INT", "FLOAT", 
			"STRING", "ID", "STRING_VAL", "FUNC_NAME", "NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "gebL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gebLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gebLParser.EOF, 0); }
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(24);
				struct();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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

	public static class StructContext extends ParserRuleContext {
		public VarHandlerContext varHandler() {
			return getRuleContext(VarHandlerContext.class,0);
		}
		public DecisionalStatementsContext decisionalStatements() {
			return getRuleContext(DecisionalStatementsContext.class,0);
		}
		public LoopStatementsContext loopStatements() {
			return getRuleContext(LoopStatementsContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_struct);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				varHandler();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				decisionalStatements();
				}
				break;
			case WHILE:
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				loopStatements();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
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

	public static class VarHandlerContext extends ParserRuleContext {
		public VarHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHandler; }
	 
		public VarHandlerContext() { }
		public void copyFrom(VarHandlerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperassignContext extends VarHandlerContext {
		public Token op;
		public TerminalNode ID() { return getToken(gebLParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(gebLParser.SCOL, 0); }
		public TerminalNode MULTEQ() { return getToken(gebLParser.MULTEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(gebLParser.DIVEQ, 0); }
		public TerminalNode MODEQ() { return getToken(gebLParser.MODEQ, 0); }
		public TerminalNode ADDEQ() { return getToken(gebLParser.ADDEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(gebLParser.SUBEQ, 0); }
		public OperassignContext(VarHandlerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterOperassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitOperassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitOperassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignvarContext extends VarHandlerContext {
		public TerminalNode ID() { return getToken(gebLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gebLParser.ASSIGN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(gebLParser.SCOL, 0); }
		public AssignvarContext(VarHandlerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterAssignvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitAssignvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitAssignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHandlerContext varHandler() throws RecognitionException {
		VarHandlerContext _localctx = new VarHandlerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varHandler);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(ID);
				setState(39);
				match(ASSIGN);
				setState(40);
				operation(0);
				setState(41);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new OperassignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
				((OperassignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTEQ) | (1L << DIVEQ) | (1L << MODEQ) | (1L << ADDEQ) | (1L << SUBEQ))) != 0)) ) {
					((OperassignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45);
				operation(0);
				setState(46);
				match(SCOL);
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

	public static class DecisionalStatementsContext extends ParserRuleContext {
		public DecisionalStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisionalStatements; }
	 
		public DecisionalStatementsContext() { }
		public void copyFrom(DecisionalStatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends DecisionalStatementsContext {
		public TerminalNode IF() { return getToken(gebLParser.IF, 0); }
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public List<DecisionalAndLoopBlockContext> decisionalAndLoopBlock() {
			return getRuleContexts(DecisionalAndLoopBlockContext.class);
		}
		public DecisionalAndLoopBlockContext decisionalAndLoopBlock(int i) {
			return getRuleContext(DecisionalAndLoopBlockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(gebLParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(gebLParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(gebLParser.ELSE, 0); }
		public IfStatementContext(DecisionalStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionalStatementsContext decisionalStatements() throws RecognitionException {
		DecisionalStatementsContext _localctx = new DecisionalStatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decisionalStatements);
		int _la;
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IF);
			setState(51);
			ifCondition();
			setState(52);
			decisionalAndLoopBlock();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(53);
				match(ELSEIF);
				setState(54);
				ifCondition();
				setState(55);
				decisionalAndLoopBlock();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(62);
				match(ELSE);
				setState(63);
				decisionalAndLoopBlock();
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

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LPAR);
			setState(67);
			logicalExpression();
			setState(68);
			match(RPAR);
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

	public static class DecisionalAndLoopBlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(gebLParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(gebLParser.RCURL, 0); }
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public DecisionalAndLoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisionalAndLoopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterDecisionalAndLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitDecisionalAndLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitDecisionalAndLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionalAndLoopBlockContext decisionalAndLoopBlock() throws RecognitionException {
		DecisionalAndLoopBlockContext _localctx = new DecisionalAndLoopBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decisionalAndLoopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LCURL);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				struct();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RCURL);
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

	public static class LoopStatementsContext extends ParserRuleContext {
		public LoopStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatements; }
	 
		public LoopStatementsContext() { }
		public void copyFrom(LoopStatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileLoopContext extends LoopStatementsContext {
		public TerminalNode DO() { return getToken(gebLParser.DO, 0); }
		public DecisionalAndLoopBlockContext decisionalAndLoopBlock() {
			return getRuleContext(DecisionalAndLoopBlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(gebLParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
		public DoWhileLoopContext(LoopStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends LoopStatementsContext {
		public TerminalNode WHILE() { return getToken(gebLParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
		public DecisionalAndLoopBlockContext decisionalAndLoopBlock() {
			return getRuleContext(DecisionalAndLoopBlockContext.class,0);
		}
		public WhileLoopContext(LoopStatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementsContext loopStatements() throws RecognitionException {
		LoopStatementsContext _localctx = new LoopStatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopStatements);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(WHILE);
				setState(80);
				match(LPAR);
				setState(81);
				logicalExpression();
				setState(82);
				match(RPAR);
				setState(83);
				decisionalAndLoopBlock();
				}
				break;
			case DO:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(DO);
				setState(86);
				decisionalAndLoopBlock();
				setState(87);
				match(WHILE);
				setState(88);
				match(LPAR);
				setState(89);
				logicalExpression();
				setState(90);
				match(RPAR);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gebLParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
		public TerminalNode SCOL() { return getToken(gebLParser.SCOL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PRINT);
			setState(95);
			match(LPAR);
			setState(96);
			operation(0);
			setState(97);
			match(RPAR);
			setState(98);
			match(SCOL);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public Token op;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EQ() { return getToken(gebLParser.EQ, 0); }
		public TerminalNode GT() { return getToken(gebLParser.GT, 0); }
		public TerminalNode LT() { return getToken(gebLParser.LT, 0); }
		public TerminalNode LTOE() { return getToken(gebLParser.LTOE, 0); }
		public TerminalNode GTOE() { return getToken(gebLParser.GTOE, 0); }
		public TerminalNode NEQ() { return getToken(gebLParser.NEQ, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			operation(0);
			setState(101);
			((ComparisonExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTOE) | (1L << LTOE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
				((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			operation(0);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public Token op;
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(gebLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(gebLParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(gebLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(gebLParser.OR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			comparisonExpression();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(105);
				((LogicalExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((LogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				comparisonExpression();
				}
				}
				setState(111);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddOpContext extends OperationContext {
		public Token op;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode ADD() { return getToken(gebLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(gebLParser.SUB, 0); }
		public AddOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends OperationContext {
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
		public ParenthesisContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends OperationContext {
		public TerminalNode NUM() { return getToken(gebLParser.NUM, 0); }
		public NumContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultOpContext extends OperationContext {
		public Token op;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode MULT() { return getToken(gebLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(gebLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(gebLParser.MOD, 0); }
		public MultOpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends OperationContext {
		public TerminalNode ID() { return getToken(gebLParser.ID, 0); }
		public IdContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends OperationContext {
		public TerminalNode STRING_VAL() { return getToken(gebLParser.STRING_VAL, 0); }
		public StringContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				match(LPAR);
				setState(114);
				operation(0);
				setState(115);
				match(RPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(ID);
				}
				break;
			case STRING_VAL:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultOpContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(122);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(123);
						((MultOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						operation(6);
						}
						break;
					case 2:
						{
						_localctx = new AddOpContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(125);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(126);
						((AddOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						operation(5);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gebLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gebLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(gebLParser.STRING, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gebLListener ) ((gebLListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gebLVisitor ) return ((gebLVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"1\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005"+
		"\n\u0005\f\u0005L\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"]\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\tl\b\t\n\t\f\to\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\ny\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0081\b\n\n\n\f\n\u0084\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0000\u0001\u0014\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0006\u0001\u0000\u0010\u0014\u0001\u0000\u0016\u001b\u0001"+
		"\u0000\u001c\u001d\u0001\u0000\u000b\r\u0001\u0000\u000e\u000f\u0001\u0000"+
		"+-\u008a\u0000\u001b\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000"+
		"\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b"+
		"B\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000"+
		"\u0000\u000e^\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012"+
		"h\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016\u0085\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000 %\u0003\u0004\u0002"+
		"\u0000!%\u0003\u0006\u0003\u0000\"%\u0003\f\u0006\u0000#%\u0003\u000e"+
		"\u0007\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0005.\u0000\u0000\'(\u0005\u0015\u0000\u0000()\u0003\u0014"+
		"\n\u0000)*\u0005\t\u0000\u0000*1\u0001\u0000\u0000\u0000+,\u0005.\u0000"+
		"\u0000,-\u0007\u0000\u0000\u0000-.\u0003\u0014\n\u0000./\u0005\t\u0000"+
		"\u0000/1\u0001\u0000\u0000\u00000&\u0001\u0000\u0000\u00000+\u0001\u0000"+
		"\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u001f\u0000\u0000"+
		"34\u0003\b\u0004\u00004;\u0003\n\u0005\u000056\u0005 \u0000\u000067\u0003"+
		"\b\u0004\u000078\u0003\n\u0005\u00008:\u0001\u0000\u0000\u000095\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<@\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>?\u0005!\u0000\u0000?A\u0003\n\u0005\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0005\u0000\u0000CD\u0003\u0012\t\u0000DE\u0005\u0006\u0000\u0000E\t"+
		"\u0001\u0000\u0000\u0000FJ\u0005\u0001\u0000\u0000GI\u0003\u0002\u0001"+
		"\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000N\u000b\u0001\u0000\u0000"+
		"\u0000OP\u0005%\u0000\u0000PQ\u0005\u0005\u0000\u0000QR\u0003\u0012\t"+
		"\u0000RS\u0005\u0006\u0000\u0000ST\u0003\n\u0005\u0000T]\u0001\u0000\u0000"+
		"\u0000UV\u0005&\u0000\u0000VW\u0003\n\u0005\u0000WX\u0005%\u0000\u0000"+
		"XY\u0005\u0005\u0000\u0000YZ\u0003\u0012\t\u0000Z[\u0005\u0006\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\O\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000"+
		"\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\u001e\u0000\u0000_`\u0005\u0005"+
		"\u0000\u0000`a\u0003\u0014\n\u0000ab\u0005\u0006\u0000\u0000bc\u0005\t"+
		"\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0003\u0014\n\u0000ef\u0007"+
		"\u0001\u0000\u0000fg\u0003\u0014\n\u0000g\u0011\u0001\u0000\u0000\u0000"+
		"hm\u0003\u0010\b\u0000ij\u0007\u0002\u0000\u0000jl\u0003\u0010\b\u0000"+
		"ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u0013\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0006\n\uffff\uffff\u0000qr\u0005\u0005\u0000\u0000"+
		"rs\u0003\u0014\n\u0000st\u0005\u0006\u0000\u0000ty\u0001\u0000\u0000\u0000"+
		"uy\u00051\u0000\u0000vy\u0005.\u0000\u0000wy\u0005/\u0000\u0000xp\u0001"+
		"\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y\u0082\u0001\u0000\u0000\u0000z{\n\u0005\u0000"+
		"\u0000{|\u0007\u0003\u0000\u0000|\u0081\u0003\u0014\n\u0006}~\n\u0004"+
		"\u0000\u0000~\u007f\u0007\u0004\u0000\u0000\u007f\u0081\u0003\u0014\n"+
		"\u0005\u0080z\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0005\u0000\u0000\u0086"+
		"\u0017\u0001\u0000\u0000\u0000\u000b\u001b$0;@J\\mx\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}