// Generated from Pie.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PieParser}.
 */
public interface PieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PieParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PieParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PieParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(PieParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(PieParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PieParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PieParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#slist}.
	 * @param ctx the parse tree
	 */
	void enterSlist(PieParser.SlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#slist}.
	 * @param ctx the parse tree
	 */
	void exitSlist(PieParser.SlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PieParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PieParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PieParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PieParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PieParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PieParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(PieParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(PieParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(PieParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#mulexpr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(PieParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PieParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PieParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#qid}.
	 * @param ctx the parse tree
	 */
	void enterQid(PieParser.QidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#qid}.
	 * @param ctx the parse tree
	 */
	void exitQid(PieParser.QidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(PieParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(PieParser.VardefContext ctx);
}