package Antlr;

import Expression.SymbolTable.AbstractSyntaxTree;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {
    public static void main(String[] args) throws Exception {
        TLexer lexer = new TLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TParser parser = new TParser(tokens);
        ParseTree tree = parser.parse();
        AbstractSyntaxTree visitor = new AbstractSyntaxTree();
        visitor.visit(tree);
    }
}