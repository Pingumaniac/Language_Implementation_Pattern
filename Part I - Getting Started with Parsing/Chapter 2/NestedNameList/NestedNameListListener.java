// Generated from NestedNameList.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NestedNameListParser}.
 */
public interface NestedNameListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(NestedNameListParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(NestedNameListParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(NestedNameListParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(NestedNameListParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NestedNameListParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NestedNameListParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(NestedNameListParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(NestedNameListParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(NestedNameListParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(NestedNameListParser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NestedNameListParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NestedNameListParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(NestedNameListParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(NestedNameListParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NestedNameListParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NestedNameListParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NestedNameListParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NestedNameListParser.ExprContext ctx);
}