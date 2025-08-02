package com.panda.core.controller;



import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/saludo")
public class MessageController {
    
  
	@GET 
	@Produces(MediaType.TEXT_PLAIN)
	public String saludar() {
		
		return "OK";
	}
}