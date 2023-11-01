// Generated from /home/monkey/Desktop/Nimer3/T.g4 by ANTLR 4.13.1
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TParser}.
 */
public interface TListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(TParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(TParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(TParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(TParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(TParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(TParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(TParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(TParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(TParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(TParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(TParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(TParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(TParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(TParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(TParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(TParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(TParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(TParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TParser#atom_stat}.
	 * @param ctx the parse tree
	 */
	void enterAtom_stat(TParser.Atom_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link TParser#atom_stat}.
	 * @param ctx the parse tree
	 */
	void exitAtom_stat(TParser.Atom_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(TParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(TParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(TParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(TParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(TParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(TParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(TParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(TParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(TParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(TParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(TParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(TParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(TParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(TParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(TParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(TParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(TParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(TParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(TParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(TParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(TParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(TParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(TParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(TParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(TParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(TParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(TParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(TParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(TParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(TParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFuncAtom(TParser.FuncAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFuncAtom(TParser.FuncAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(TParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(TParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(TParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link TParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(TParser.NilAtomContext ctx);
}