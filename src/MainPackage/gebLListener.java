// Generated from D:/Apps/gebL/src/MainPackage\gebL.g4 by ANTLR 4.10.1
package MainPackage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gebLParser}.
 */
public interface gebLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gebLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(gebLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(gebLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(gebLParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(gebLParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignvar}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 */
	void enterAssignvar(gebLParser.AssignvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignvar}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 */
	void exitAssignvar(gebLParser.AssignvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Operassign}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 */
	void enterOperassign(gebLParser.OperassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Operassign}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 */
	void exitOperassign(gebLParser.OperassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link gebLParser#decisionalStatements}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(gebLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link gebLParser#decisionalStatements}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(gebLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(gebLParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(gebLParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#decisionalAndLoopBlock}.
	 * @param ctx the parse tree
	 */
	void enterDecisionalAndLoopBlock(gebLParser.DecisionalAndLoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#decisionalAndLoopBlock}.
	 * @param ctx the parse tree
	 */
	void exitDecisionalAndLoopBlock(gebLParser.DecisionalAndLoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(gebLParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(gebLParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(gebLParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(gebLParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(gebLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(gebLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(gebLParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(gebLParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(gebLParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(gebLParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(gebLParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(gebLParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(gebLParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(gebLParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterNum(gebLParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitNum(gebLParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(gebLParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(gebLParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterId(gebLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitId(gebLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterString(gebLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitString(gebLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gebLParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(gebLParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gebLParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(gebLParser.TypesContext ctx);
}