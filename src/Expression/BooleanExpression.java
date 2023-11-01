package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

public class BooleanExpression extends Expression{

    public static Value NotExpression(TParser.NotExprContext ctx, AbstractSyntaxTree abstractSyntaxTree) {
        Value value = abstractSyntaxTree.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    public static Value AndExpression(TParser.AndExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }
    public static Value OrExpression(TParser.OrExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }
    public static Value RelationExpression(TParser.RelationalExprContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value left = abstractSyntaxTree.visit(ctx.expr(0));
        Value right = abstractSyntaxTree.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case TParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case TParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case TParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case TParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + TParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value create() {
        return null;
    }
}
