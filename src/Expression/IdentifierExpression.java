package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;

public class IdentifierExpression extends Expression{

    String id;
    Value value;

    public IdentifierExpression(TParser.IdAtomContext ctx, AbstractSyntaxTree abstractSyntaxTree)
    {
        id = ctx.getText();
        value = abstractSyntaxTree.table.getVariable(id);
        if(value == null) {
            throw new RuntimeException("No such id" + id);
        }
    }

    @Override
    public Value create() {
        return value;
    }
}
