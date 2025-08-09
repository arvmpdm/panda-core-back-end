package com.panda.core.controller;

import java.util.List;

import com.panda.core.controller.dto.LoginModel;
import com.panda.core.entidad.Pruebas;
import com.panda.core.servicio.PruebaServicio;
import com.panda.core.util.Util;
import com.panda.core.util.UtilMessage;

import jakarta.inject.Inject;
import jakarta.security.enterprise.authentication.mechanism.http.AutoApplySession;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Util.APP_ROOT_MODULO_SEGURIDAD+"/login")
public class LoginController {
	
	@Inject
	PruebaServicio servicio;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public LoginModel postLogin() {
		
		 LoginModel login=new LoginModel();
		 login.setUserName("Arvm");
		 login.setPassword("123");
		 login.setEstatus(UtilMessage.POST_ESTATUS);
		 login.setMensaje(UtilMessage.POST_ESTATUS_MESSAGE);
		 
		 return login;
		 
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pruebas> getAllPrueba(){
		return this.servicio.getAllPruebas();
		
	}

}
