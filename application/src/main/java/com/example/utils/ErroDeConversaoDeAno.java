package com.example.utils;

public class ErroDeConversaoDeAno extends RuntimeException {
    private String message;
    
    public ErroDeConversaoDeAno(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
}
