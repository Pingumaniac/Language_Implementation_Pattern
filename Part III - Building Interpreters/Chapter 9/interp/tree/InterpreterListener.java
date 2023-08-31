package tree;

import lexer.Token;

public interface InterpreterListener {
    public void info(String msg);
    public void error(String msg);
    public void error(String msg, Exception e);
    public void error(String msg, Token t);
}
