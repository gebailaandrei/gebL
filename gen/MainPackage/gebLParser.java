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
		RULE_decisionalAndLoopBlock = 4, RULE_loopStatements = 5, RULE_print = 6, 
		RULE_comparisonExpression = 7, RULE_logicalExpression = 8, RULE_operation = 9, 
		RULE_types = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"list", "struct", "varHandler", "decisionalStatements", "decisionalAndLoopBlock", 
			"loopStatements", "print", "comparisonExpression", "logicalExpression", 
			"operation", "types"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				struct();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				varHandler();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				decisionalStatements();
				}
				break;
			case WHILE:
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				loopStatements();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				setState(37);
				match(ASSIGN);
				setState(38);
				operation(0);
				setState(39);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new OperassignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(ID);
				setState(42);
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
				setState(43);
				operation(0);
				setState(44);
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
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
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
			setState(48);
			match(IF);
			setState(49);
			logicalExpression();
			setState(50);
			decisionalAndLoopBlock();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(51);
				match(ELSEIF);
				setState(52);
				logicalExpression();
				setState(53);
				decisionalAndLoopBlock();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(60);
				match(ELSE);
				setState(61);
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
		enterRule(_localctx, 8, RULE_decisionalAndLoopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LCURL);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(65);
				struct();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		enterRule(_localctx, 10, RULE_loopStatements);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(WHILE);
				setState(74);
				match(LPAR);
				setState(75);
				logicalExpression();
				setState(76);
				match(RPAR);
				setState(77);
				decisionalAndLoopBlock();
				}
				break;
			case DO:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(DO);
				setState(80);
				decisionalAndLoopBlock();
				setState(81);
				match(WHILE);
				setState(82);
				match(LPAR);
				setState(83);
				logicalExpression();
				setState(84);
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
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PRINT);
			setState(89);
			match(LPAR);
			setState(90);
			operation(0);
			setState(91);
			match(RPAR);
			setState(92);
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
		enterRule(_localctx, 14, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			operation(0);
			setState(95);
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
			setState(96);
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
		public TerminalNode LPAR() { return getToken(gebLParser.LPAR, 0); }
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(gebLParser.RPAR, 0); }
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
		enterRule(_localctx, 16, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LPAR);
			setState(99);
			comparisonExpression();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(100);
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
				setState(101);
				comparisonExpression();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(LPAR);
				setState(111);
				operation(0);
				setState(112);
				match(RPAR);
				}
				break;
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(ID);
				}
				break;
			case STRING_VAL:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultOpContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
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
						setState(121);
						operation(6);
						}
						break;
					case 2:
						{
						_localctx = new AddOpContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
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
						setState(124);
						operation(5);
						}
						break;
					}
					} 
				}
				setState(129);
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
		enterRule(_localctx, 20, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		case 9:
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
		"\u0004\u00013\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003?\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004"+
		"\f\u0004F\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\bg\b\b\n\b\f\bj\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tv\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t~\b\t\n\t\f\t\u0081"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0012\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0006\u0001\u0000\u0010\u0014"+
		"\u0001\u0000\u0016\u001b\u0001\u0000\u001c\u001d\u0001\u0000\u000b\r\u0001"+
		"\u0000\u000e\u000f\u0001\u0000+-\u0088\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"b\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014\u0082\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e#\u0003\u0004"+
		"\u0002\u0000\u001f#\u0003\u0006\u0003\u0000 #\u0003\n\u0005\u0000!#\u0003"+
		"\f\u0006\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0003\u0001"+
		"\u0000\u0000\u0000$%\u0005.\u0000\u0000%&\u0005\u0015\u0000\u0000&\'\u0003"+
		"\u0012\t\u0000\'(\u0005\t\u0000\u0000(/\u0001\u0000\u0000\u0000)*\u0005"+
		".\u0000\u0000*+\u0007\u0000\u0000\u0000+,\u0003\u0012\t\u0000,-\u0005"+
		"\t\u0000\u0000-/\u0001\u0000\u0000\u0000.$\u0001\u0000\u0000\u0000.)\u0001"+
		"\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u001f\u0000"+
		"\u000012\u0003\u0010\b\u000029\u0003\b\u0004\u000034\u0005 \u0000\u0000"+
		"45\u0003\u0010\b\u000056\u0003\b\u0004\u000068\u0001\u0000\u0000\u0000"+
		"73\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<=\u0005!\u0000\u0000=?\u0003\b\u0004\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0007\u0001\u0000\u0000\u0000"+
		"@D\u0005\u0001\u0000\u0000AC\u0003\u0002\u0001\u0000BA\u0001\u0000\u0000"+
		"\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0002\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005%\u0000\u0000JK\u0005"+
		"\u0005\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\u0006\u0000\u0000MN\u0003"+
		"\b\u0004\u0000NW\u0001\u0000\u0000\u0000OP\u0005&\u0000\u0000PQ\u0003"+
		"\b\u0004\u0000QR\u0005%\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0003"+
		"\u0010\b\u0000TU\u0005\u0006\u0000\u0000UW\u0001\u0000\u0000\u0000VI\u0001"+
		"\u0000\u0000\u0000VO\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000"+
		"\u0000XY\u0005\u001e\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0003\u0012"+
		"\t\u0000[\\\u0005\u0006\u0000\u0000\\]\u0005\t\u0000\u0000]\r\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0012\t\u0000_`\u0007\u0001\u0000\u0000`a\u0003\u0012"+
		"\t\u0000a\u000f\u0001\u0000\u0000\u0000bc\u0005\u0005\u0000\u0000ch\u0003"+
		"\u000e\u0007\u0000de\u0007\u0002\u0000\u0000eg\u0003\u000e\u0007\u0000"+
		"fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0006\u0000\u0000l\u0011\u0001\u0000\u0000\u0000"+
		"mn\u0006\t\uffff\uffff\u0000no\u0005\u0005\u0000\u0000op\u0003\u0012\t"+
		"\u0000pq\u0005\u0006\u0000\u0000qv\u0001\u0000\u0000\u0000rv\u00051\u0000"+
		"\u0000sv\u0005.\u0000\u0000tv\u0005/\u0000\u0000um\u0001\u0000\u0000\u0000"+
		"ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000v\u007f\u0001\u0000\u0000\u0000wx\n\u0005\u0000\u0000xy\u0007\u0003"+
		"\u0000\u0000y~\u0003\u0012\t\u0006z{\n\u0004\u0000\u0000{|\u0007\u0004"+
		"\u0000\u0000|~\u0003\u0012\t\u0005}w\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0005\u0000\u0000"+
		"\u0083\u0015\u0001\u0000\u0000\u0000\u000b\u0019\".9>DVhu}\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}