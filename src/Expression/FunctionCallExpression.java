package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

public class FunctionCallExpression extends Expression{
    String id;
    AbstractSyntaxTree abstractSyntaxTree;
    TParser.FuncAtomContext context;

    public FunctionCallExpression(TParser.FuncAtomContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        this.id = ctx.getText().substring(0, ctx.getText().indexOf("("));
        this.abstractSyntaxTree = abstractSyntaxTree;
        this.context = ctx;
    }

    @Override
    public Value create() {
        if(context.arguments() == null)
            return abstractSyntaxTree.table.getFunction(id).call(null,abstractSyntaxTree);
        return abstractSyntaxTree.table.getFunction(id).call(context.arguments().expr(), abstractSyntaxTree);
    }
}
