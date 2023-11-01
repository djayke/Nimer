package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;
import Expression.SymbolTable.Method;

import java.util.ArrayList;

public class FunctionExpression extends Expression{

    public FunctionExpression(TParser.MethodContext ctx, AbstractSyntaxTree abstractSyntaxTree) {
        // function name
        String id = ctx.ID().getText();

        // Parameters
        ArrayList<String> param = new ArrayList<>();
        if(ctx.arguments() != null)
            for(var v:ctx.arguments().expr())
                param.add(v.getText());

        // Return Statement
        TParser.ReturnContext ctx_return = null;
        if(ctx.return_() != null)
            ctx_return = ctx.return_();



        // Block statement
        abstractSyntaxTree.table.addFunc(id,new Method(param, ctx.block(), ctx_return));
    }

    @Override
    public Value create() {
        return Value.VOID;
    }
}
