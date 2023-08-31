package syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class Interpreter {
    public InterpreterListener listener =
        new InterpreterListener() {
            public void info(String msg) { System.out.println(msg); }
            public void error(String msg) { System.err.println(msg); }
            public void error(String msg, Exception e) {
                error(msg); e.printStackTrace(System.err);
            }
            public void error(String msg, Token t) {
                error("line " + t.getLine() + ": " + msg);
            }
        };

    Map<String, Object> globals = new HashMap<>();
    Map<String, Table> tables = new HashMap<>();

    public void interp(InputStream input) throws IOException {
        CharStream charStream = CharStreams.fromStream(input);
        QLexer lexer = new QLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QParser parser = new QParser(tokens);
        parser.setInterpreter(this);
        ParseTree tree = parser.program();
    }

    public void createTable(String name, String primaryKey, List<Token> columns) {
        Table table = new Table(name, primaryKey);
        for (Token t : columns) table.addColumn(t.getText());
        tables.put(name, table);
    }

    public void insertInto(String name, Row row) {
        Table t = tables.get(name);
        if (t == null) {
            listener.error("No such table " + name);
            return;
        }
        t.add(row);
    }

    public Object select(String name, List<Token> columns) {
        Table table = tables.get(name);
        ResultSet rs = new ResultSet();
        for (Row r : table.rows.values()) rs.add(r.getColumns(columns));
        return rs;
    }

    public Object select(String name, List<Token> columns, String key, Object value) {
        Table table = tables.get(name);
        ResultSet rs = new ResultSet();
        if (key.equals(table.getPrimaryKey())) {
            List<Object> selectedColumnData = table.rows.get(value).getColumns(columns);
            if (selectedColumnData.size() == 1) return selectedColumnData.get(0);
            rs.add(selectedColumnData);
            return rs;
        }
        for (Row r : table.rows.values()) {
            if (r.values.get(key).equals(value)) {
                rs.add(r.getColumns(columns));
            }
        }
        return rs;
    }

    public void store(String name, Object o) { globals.put(name, o); }
    public Object load(String name) { return globals.get(name); }

    public void print(Object o) {
        if (o instanceof ResultSet) { // result set?
            ResultSet rs = (ResultSet) o;
            for (List<Object> r : rs.results) {
                for (int i = 0; i < r.size(); i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print(r.get(i));
                }
                System.out.println();
            }
        } else {
            System.out.println(o.toString());
        }
    }
}
