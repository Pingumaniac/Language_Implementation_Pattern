package safety;
// Generated from Types.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypesParser}.
 */
public interface TypesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypesParser#bottomup}.
	 * @param ctx the parse tree
	 */
	void enterBottomup(TypesParser.BottomupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#bottomup}.
	 * @param ctx the parse tree
	 */
	void exitBottomup(TypesParser.BottomupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(TypesParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(TypesParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(TypesParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(TypesParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(TypesParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(TypesParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TypesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TypesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#exprRoot}.
	 * @param ctx the parse tree
	 */
	void enterExprRoot(TypesParser.ExprRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#exprRoot}.
	 * @param ctx the parse tree
	 */
	void exitExprRoot(TypesParser.ExprRootContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TypesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TypesParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(TypesParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(TypesParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(TypesParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(TypesParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(TypesParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(TypesParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(TypesParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(TypesParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#eqop}.
	 * @param ctx the parse tree
	 */
	void enterEqop(TypesParser.EqopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#eqop}.
	 * @param ctx the parse tree
	 */
	void exitEqop(TypesParser.EqopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TypesParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TypesParser.StatContext ctx);
}
