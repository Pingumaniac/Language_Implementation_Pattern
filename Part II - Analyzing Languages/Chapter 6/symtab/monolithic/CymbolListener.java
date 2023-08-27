package monolithic;

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
