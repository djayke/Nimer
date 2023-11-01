package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

import java.util.List;

public class ControlExpression {

    public static Value IfExpression(TParser.If_statContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        List<TParser.Condition_blockContext> conditions =  ctx.condition_block();
        boolean evaluatedBlock = false;
        for(TParser.Condition_blockContext condition : conditions) {
            Value evaluated = abstractSyntaxTree.visit(condition.expr());
            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                abstractSyntaxTree.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            abstractSyntaxTree.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    public static Value WhileExpression(TParser.While_statContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        Value value = abstractSyntaxTree.visit(ctx.expr());
        while(value.asBoolean()) {
            // evaluate the code block
            abstractSyntaxTree.visit(ctx.stat_block());
            // evaluate the expression
            value = abstractSyntaxTree.visit(ctx.expr());
        }

        return Value.VOID;
    }

    public static Value ForExpression(TParser.For_statContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        // declaration
        abstractSyntaxTree.visit(ctx.assignment(0));

        // Condititon
        Value value = abstractSyntaxTree.visit(ctx.expr());
        while(value.asBoolean()){

            // evaluate the block
            abstractSyntaxTree.visit(ctx.stat_block());
            value = abstractSyntaxTree.visit(ctx.expr());

            // reasigm
            abstractSyntaxTree.visit(ctx.assignment(1));
        }

        return Value.VOID;
    }


}
