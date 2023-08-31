package syntax;

import org.antlr.v4.runtime.Token;

public interface InterpreterListener {
    public void info(String msg);
    public void error(String msg);
    public void error(String msg, Exception e);
    public void error(String msg, Token t);
}
