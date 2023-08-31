package make;

// Generated from Make.g by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MakeParser}.
 */
public interface MakeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MakeParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(MakeParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakeParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(MakeParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakeParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(MakeParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakeParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(MakeParser.RuleContext ctx);
}
