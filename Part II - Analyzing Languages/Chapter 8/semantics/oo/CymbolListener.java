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
	 * Enter a parse tree produced by {@link CymbolParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CymbolParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CymbolParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#superClass}.
	 * @param ctx the parse tree
	 */
	void enterSuperClass(CymbolParser.SuperClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#superClass}.
	 * @param ctx the parse tree
	 */
	void exitSuperClass(CymbolParser.SuperClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(CymbolParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(CymbolParser.ClassMemberContext ctx);
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
	 * Enter a parse tree produced by {@link CymbolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CymbolParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CymbolParser.ParameterContext ctx);
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
	 * Enter a parse tree produced by {@link CymbolParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CymbolParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CymbolParser.PrimitiveTypeContext ctx);
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
	 * Enter a parse tree produced by {@link CymbolParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(CymbolParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(CymbolParser.LhsContext ctx);
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
	 * Enter a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CymbolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CymbolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CymbolParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CymbolParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CymbolParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CymbolParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CymbolParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CymbolParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CymbolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CymbolParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CymbolParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CymbolParser.UnaryExpressionContext ctx);
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