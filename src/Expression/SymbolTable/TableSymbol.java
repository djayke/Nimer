package Expression.SymbolTable;

import Expression.Value;

import java.util.HashMap;
import java.util.Map;

public class TableSymbol {

    public final Map<String, Value> var = new HashMap<String, Value>();
    public final Map<String, Method> func = new HashMap<String, Method>();

    public Value addVariable(String id, Value value) {
        return var.put(id, value);
    }

    public Value getVariable(String id) {
        return var.get(id);
    }

    public Method getFunction(String id) {
        return func.get(id);
    }

    public Method addFunc(String id, Method method) {
        return func.put(id, method);
    }
}
