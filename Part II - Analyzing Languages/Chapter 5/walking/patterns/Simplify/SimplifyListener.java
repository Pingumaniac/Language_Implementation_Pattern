// Generated from Simplify.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplifyParser}.
 */
public interface SimplifyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplifyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimplifyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplifyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimplifyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplifyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimplifyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplifyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimplifyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplifyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimplifyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplifyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimplifyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplifyParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(SimplifyParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplifyParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(SimplifyParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplifyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimplifyParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplifyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimplifyParser.PrimaryContext ctx);
}