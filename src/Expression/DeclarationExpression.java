package Expression;

import Antlr.TParser;
import Expression.SymbolTable.AbstractSyntaxTree;
import Expression.SymbolTable.TableSymbol;

public class DeclarationExpression extends Expression{
    String id;
    TableSymbol table;
   public DeclarationExpression(TParser.DeclareContext context, AbstractSyntaxTree abstractSyntaxTree)
   {
       id = context.ID().getText();
       table = abstractSyntaxTree.table;
   }

    @Override
    public Value create() {
        return table.addVariable(id, null);
    }
}
