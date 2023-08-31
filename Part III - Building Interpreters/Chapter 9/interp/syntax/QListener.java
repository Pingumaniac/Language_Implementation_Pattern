// Generated from Q.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QParser}.
 */
public interface QListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(QParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(QParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(QParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(QParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(QParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(QParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(QParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(QParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#setFields}.
	 * @param ctx the parse tree
	 */
	void enterSetFields(QParser.SetFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#setFields}.
	 * @param ctx the parse tree
	 */
	void exitSetFields(QParser.SetFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(QParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(QParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(QParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(QParser.ExprContext ctx);
}