package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

public class PrintExpression extends Expression{

    Value value;

    public PrintExpression(TParser.LogContext ctx, AbstractSyntaxTree abstractSyntaxTree) {
        value = abstractSyntaxTree.visit(ctx.expr());
    }

    @Override
    public Value create() {
        System.out.println(value);
        return value;
    }
}
