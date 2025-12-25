package com.craftinginterpreters.lox;

public class RuntimeError {
    final Token token;
    
    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
