// Generated from Ref.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RefParser}.
 */
public interface RefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RefParser#topdown}.
	 * @param ctx the parse tree
	 */
	void enterTopdown(RefParser.TopdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#topdown}.
	 * @param ctx the parse tree
	 */
	void exitTopdown(RefParser.TopdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#enterClass}.
	 * @param ctx the parse tree
	 */
	void enterEnterClass(RefParser.EnterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#enterClass}.
	 * @param ctx the parse tree
	 */
	void exitEnterClass(RefParser.EnterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#enterMethod}.
	 * @param ctx the parse tree
	 */
	void enterEnterMethod(RefParser.EnterMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#enterMethod}.
	 * @param ctx the parse tree
	 */
	void exitEnterMethod(RefParser.EnterMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(RefParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(RefParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RefParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RefParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RefParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RefParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#resolveExpr}.
	 * @param ctx the parse tree
	 */
	void enterResolveExpr(RefParser.ResolveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#resolveExpr}.
	 * @param ctx the parse tree
	 */
	void exitResolveExpr(RefParser.ResolveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RefParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RefParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RefParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RefParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RefParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(RefParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RefParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(RefParser.MemberContext ctx);
}