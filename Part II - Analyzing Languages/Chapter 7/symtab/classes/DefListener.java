// Generated from Def.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DefParser}.
 */
public interface DefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DefParser#topdown}.
	 * @param ctx the parse tree
	 */
	void enterTopdown(DefParser.TopdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#topdown}.
	 * @param ctx the parse tree
	 */
	void exitTopdown(DefParser.TopdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#bottomup}.
	 * @param ctx the parse tree
	 */
	void enterBottomup(DefParser.BottomupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#bottomup}.
	 * @param ctx the parse tree
	 */
	void exitBottomup(DefParser.BottomupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#enterBlock}.
	 * @param ctx the parse tree
	 */
	void enterEnterBlock(DefParser.EnterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#enterBlock}.
	 * @param ctx the parse tree
	 */
	void exitEnterBlock(DefParser.EnterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#exitBlock}.
	 * @param ctx the parse tree
	 */
	void enterExitBlock(DefParser.ExitBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#exitBlock}.
	 * @param ctx the parse tree
	 */
	void exitExitBlock(DefParser.ExitBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#enterClass}.
	 * @param ctx the parse tree
	 */
	void enterEnterClass(DefParser.EnterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#enterClass}.
	 * @param ctx the parse tree
	 */
	void exitEnterClass(DefParser.EnterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#exitClass}.
	 * @param ctx the parse tree
	 */
	void enterExitClass(DefParser.ExitClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#exitClass}.
	 * @param ctx the parse tree
	 */
	void exitExitClass(DefParser.ExitClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#enterMethod}.
	 * @param ctx the parse tree
	 */
	void enterEnterMethod(DefParser.EnterMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#enterMethod}.
	 * @param ctx the parse tree
	 */
	void exitEnterMethod(DefParser.EnterMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#exitMethod}.
	 * @param ctx the parse tree
	 */
	void enterExitMethod(DefParser.ExitMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#exitMethod}.
	 * @param ctx the parse tree
	 */
	void exitExitMethod(DefParser.ExitMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(DefParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(DefParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DefParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DefParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DefParser.VarDeclarationContext ctx);
}