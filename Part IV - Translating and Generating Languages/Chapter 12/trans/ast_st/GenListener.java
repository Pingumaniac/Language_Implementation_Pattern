// Generated from Gen.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GenParser}.
 */
public interface GenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GenParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GenParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GenParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GenParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GenParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(GenParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(GenParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GenParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GenParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GenParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GenParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GenParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GenParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GenParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GenParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GenParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GenParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GenParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GenParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GenParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GenParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(GenParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(GenParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(GenParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(GenParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperation(GenParser.RelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperation(GenParser.RelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code derefExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDerefExpr(GenParser.DerefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code derefExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDerefExpr(GenParser.DerefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(GenParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(GenParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(GenParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(GenParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addrExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddrExpr(GenParser.AddrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addrExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddrExpr(GenParser.AddrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(GenParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(GenParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(GenParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(GenParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExpr(GenParser.UnaryNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExpr}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExpr(GenParser.UnaryNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperation(GenParser.EqualityOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityOperation}
	 * labeled alternative in {@link GenParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperation(GenParser.EqualityOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GenParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GenParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(GenParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(GenParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(GenParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(GenParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#eqop}.
	 * @param ctx the parse tree
	 */
	void enterEqop(GenParser.EqopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#eqop}.
	 * @param ctx the parse tree
	 */
	void exitEqop(GenParser.EqopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GenParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GenParser.AtomContext ctx);
}