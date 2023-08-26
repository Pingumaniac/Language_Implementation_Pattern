// Generated from Reduce.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReduceParser}.
 */
public interface ReduceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReduceParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ReduceParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReduceParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ReduceParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReduceParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ReduceParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReduceParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ReduceParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReduceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ReduceParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReduceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ReduceParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReduceParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ReduceParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReduceParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ReduceParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReduceParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ReduceParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReduceParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ReduceParser.PrimaryContext ctx);
}