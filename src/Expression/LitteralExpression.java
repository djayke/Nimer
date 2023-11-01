package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;
import Expression.Value;

public class LitteralExpression extends Expression{

    Value strv;

    public LitteralExpression(TParser.StringAtomContext ctx, AbstractSyntaxTree abstractSyntaxTree){
            String str = ctx.getText();
            // strip quotes
            strv = new Value(str.substring(1, str.length() - 1).replace("\"\"", "\""));
    }

    @Override
    public Value create()
    {
        return new Value(strv);
    }

}
