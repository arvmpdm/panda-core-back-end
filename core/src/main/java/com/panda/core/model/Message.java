package com.panda.core.model;


public class Message {
    private String content;
    
    public Message() {}
    
    public Message(String content) {
        this.content = content;
    }
    
    // Getters y setters
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}