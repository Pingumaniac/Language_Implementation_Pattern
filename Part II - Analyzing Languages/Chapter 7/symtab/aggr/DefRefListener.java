// Generated from DefRef.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DefRefParser}.
 */
public interface DefRefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DefRefParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DefRefParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DefRefParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DefRefParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DefRefParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DefRefParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DefRefParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DefRefParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DefRefParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(DefRefParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(DefRefParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DefRefParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DefRefParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DefRefParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DefRefParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DefRefParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DefRefParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefRefParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DefRefParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefRefParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DefRefParser.ExpressionContext ctx);
}