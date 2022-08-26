// Generated from D:/Projects/IntelliJProjects/gebL/src/MainPackage\gebL.g4 by ANTLR 4.10.1
package MainPackage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gebLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gebLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gebLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(gebLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(gebLParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignvar}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignvar(gebLParser.AssignvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Operassign}
	 * labeled alternative in {@link gebLParser#varHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperassign(gebLParser.OperassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link gebLParser#decisionalStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(gebLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStatement}
	 * labeled alternative in {@link gebLParser#decisionalStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(gebLParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryStatement}
	 * labeled alternative in {@link gebLParser#decisionalStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryStatement(gebLParser.TernaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#curlyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurlyBlock(gebLParser.CurlyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(gebLParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link gebLParser#loopStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(gebLParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(gebLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(gebLParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(gebLParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(gebLParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(gebLParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(gebLParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultOp}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(gebLParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(gebLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link gebLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gebLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gebLParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(gebLParser.TypesContext ctx);
}