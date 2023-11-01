package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;
import Expression.SymbolTable.TableSymbol;

public class AssignementExpression extends Expression {
    String id;
    Value value;
    TableSymbol table;
    public AssignementExpression(TParser.AssignmentContext ctx, AbstractSyntaxTree abstractSyntaxTree) {
         id = ctx.ID().getText();
         value = abstractSyntaxTree.visit(ctx.expr());
         table = abstractSyntaxTree.table;
    }

    @Override
    public Value create() {
        return table.addVariable(id,value);
    }
}
