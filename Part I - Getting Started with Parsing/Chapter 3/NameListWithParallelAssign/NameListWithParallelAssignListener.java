// Generated from NameListWithParallelAssign.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NameListWithParallelAssignParser}.
 */
public interface NameListWithParallelAssignListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NameListWithParallelAssignParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(NameListWithParallelAssignParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithParallelAssignParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(NameListWithParallelAssignParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListWithParallelAssignParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(NameListWithParallelAssignParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithParallelAssignParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(NameListWithParallelAssignParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NameListWithParallelAssignParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(NameListWithParallelAssignParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NameListWithParallelAssignParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(NameListWithParallelAssignParser.ElementContext ctx);
}