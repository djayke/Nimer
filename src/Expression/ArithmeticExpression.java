package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

public class ArithmeticExpression extends Expression{

    private static double SMALL_VALUE = 0.0000000001;

    public static Value Equality(TParser.EqualityExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case TParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case TParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + TParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value create() {
        return null;
    }
    
    public static Value Power(TParser.PowExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }
    public static Value Additive(TParser.AdditiveExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case TParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case TParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + TParser.tokenNames[ctx.op.getType()]);
        }
    }
    public static Value Multiplicative(TParser.MultiplicationExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case TParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case TParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case TParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + TParser.tokenNames[ctx.op.getType()]);
        }
    }

    public static Value UnaryMinusExpression(TParser.UnaryMinusExprContext ctx, AbstractSyntaxTree abstractSyntaxTree) {
        Value value = abstractSyntaxTree.visit(ctx.expr());
        return new Value(-value.asDouble());
    }


}
