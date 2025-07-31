package com.panda.core.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panda.core.model.Message;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    
    @GetMapping("/{name}")
    public Message getMessage(@PathVariable String name) {
        return new Message("Hola " + name + ", bienvenido a Spring 5 REST API");
    }
}