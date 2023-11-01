package Expression.SymbolTable;

import Antlr.TParser;
import Expression.Value;

import java.util.ArrayList;
import java.util.List;

import static Util.Util.IsDigit;

public class Method {

    ArrayList<String> params;
    TParser.BlockContext context;
    TParser.ReturnContext return_;

    public Method(ArrayList<String> params, TParser.BlockContext ctx, TParser.ReturnContext ret) {
        this.params = params;
        this.context = ctx;
        this.return_ = ret;
    }

    public Value call(List<TParser.ExprContext> ctx, AbstractSyntaxTree caller) {
        for (int i=0;i<params.size();i++) {

            // if params is numeric eval as numeric
            if(IsDigit(ctx.get(i).getText()))
            {
                caller.table.addVariable(params.get(i), new Value(Double.valueOf(ctx.get(i).getText())));
            }
            // else it's var
            else
            {
                Value var = caller.table.getVariable(ctx.get(i).getText());
                caller.table.addVariable(params.get(i), var);
            }

        }
        if(this.return_ == null) {
            return caller.visit(this.context);
        }else{
            caller.visit(this.context);
            return caller.visit(this.return_.expr());
        }
    }
}

