// Generated from Cymbol.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CymbolParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CymbolParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CymbolParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CymbolParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CymbolParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CymbolParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CymbolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CymbolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CymbolParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CymbolParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CymbolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CymbolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CymbolParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CymbolParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CymbolParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CymbolParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CymbolParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CymbolParser.PrimaryContext ctx);
}