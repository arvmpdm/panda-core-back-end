package com.panda.core.controller;



import com.panda.core.model.Message;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/saludo")
public class MessageController {
    
  
	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	public Message saludar() {
		Message m =new Message();
		m.setContent("Mensaje");
		
		
		return m;
	}
}