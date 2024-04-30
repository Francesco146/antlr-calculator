// Generated from /home/accounts/studenti/id234mpo/IdeaProjects/lab3/src/es1.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link es1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface es1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link es1Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(es1Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link es1Parser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(es1Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link es1Parser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(es1Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(es1Parser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(es1Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(es1Parser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(es1Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(es1Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(es1Parser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link es1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(es1Parser.MinusContext ctx);
}