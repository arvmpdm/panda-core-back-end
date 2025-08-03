package com.panda.core.controller;

import com.panda.core.controller.dto.Persona;
import com.panda.core.util.Util;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Util.APP_ROOT_MODULO_SEGURIDAD)
public class PersonaController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPerson() {
		Persona p=new Persona();
		p.setNombre("Abigail");
		p.setApellido("Arce");
		p.setEdad(25);
		
		return p;
	}
 
	
	

}
