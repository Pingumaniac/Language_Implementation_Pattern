// Generated from Printer.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrinterParser}.
 */
public interface PrinterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrinterParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PrinterParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PrinterParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrinterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PrinterParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PrinterParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrinterParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PrinterParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PrinterParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrinterParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(PrinterParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrinterParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(PrinterParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PrinterParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PrinterParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(PrinterParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(PrinterParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vec}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVec(PrinterParser.VecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vec}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVec(PrinterParser.VecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDot(PrinterParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDot(PrinterParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(PrinterParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(PrinterParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(PrinterParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PrinterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(PrinterParser.IntContext ctx);
}