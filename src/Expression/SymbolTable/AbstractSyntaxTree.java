package Expression.SymbolTable;

import Antlr.TBaseVisitor;
import Antlr.TParser;
import Expression.*;
import org.antlr.v4.runtime.misc.NotNull;

public class AbstractSyntaxTree extends TBaseVisitor<Value> {


    // store variables (there's only one global scope!)
    public TableSymbol table = new TableSymbol();

    // assignment/id overrides
    @Override
    public Value visitAssignment(TParser.AssignmentContext ctx) {
        return new AssignementExpression(ctx, this).create();
    }

    @Override
    public Value visitDeclare(TParser.DeclareContext ctx) {
        return new DeclarationExpression(ctx,this).create();
    }

    @Override
    public Value visitIdAtom(TParser.IdAtomContext ctx) {
        return new IdentifierExpression(ctx, this).create();
    }

    @Override
    public Value visitFuncAtom(TParser.FuncAtomContext ctx) {
        return new FunctionCallExpression(ctx, this).create();
    }

    // atom overrides
    @Override
    public Value visitStringAtom(TParser.StringAtomContext ctx) {
        return new LitteralExpression(ctx, this).create();
    }

    @Override
    public Value visitNumberAtom(TParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(TParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(TParser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(TParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(TParser.PowExprContext ctx) {
        return ArithmeticExpression.Power(ctx, this);
    }

    @Override
    public Value visitUnaryMinusExpr(TParser.UnaryMinusExprContext ctx) {
        return ArithmeticExpression.UnaryMinusExpression(ctx, this);
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull TParser.MultiplicationExprContext ctx) {
        return ArithmeticExpression.Multiplicative(ctx, this);
    }

    @Override
    public Value visitAdditiveExpr(@NotNull TParser.AdditiveExprContext ctx) {
        return ArithmeticExpression.Additive(ctx, this);
    }

    @Override
    public Value visitRelationalExpr(@NotNull TParser.RelationalExprContext ctx) {
        return BooleanExpression.RelationExpression(ctx, this);
    }

    @Override
    public Value visitEqualityExpr(@NotNull TParser.EqualityExprContext ctx) {
        return ArithmeticExpression.Equality(ctx, this);
    }

    @Override
    public Value visitAndExpr(TParser.AndExprContext ctx) {
        return BooleanExpression.AndExpression(ctx,this);
    }

    @Override
    public Value visitOrExpr(TParser.OrExprContext ctx) {
        return BooleanExpression.OrExpression(ctx, this);
    }

    @Override
    public Value visitNotExpr(TParser.NotExprContext ctx) {
        return BooleanExpression.NotExpression(ctx, this);
    }

    // log override
    @Override
    public Value visitLog(TParser.LogContext ctx) {
        return new PrintExpression(ctx, this).create();
    }

    // if override
    @Override
    public Value visitIf_stat(TParser.If_statContext ctx) {
       return ControlExpression.IfExpression(ctx,this);
    }

    // while override
    @Override
    public Value visitWhile_stat(TParser.While_statContext ctx) {
        return ControlExpression.WhileExpression(ctx,this);
    }

    @Override
    public Value visitFor_stat(TParser.For_statContext ctx) {
        return ControlExpression.ForExpression(ctx,this);
    }

    @Override
    public Value visitMethod(TParser.MethodContext ctx) {
        return new FunctionExpression(ctx, this).create();
    }

    @Override
    public Value visitReturn(TParser.ReturnContext ctx) {
        return new Value(ctx.expr());
    }
}
