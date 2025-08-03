package com.panda.core.controller;

import com.panda.core.controller.dto.LoginModel;
import com.panda.core.util.Util;
import com.panda.core.util.UtilMessage;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(Util.APP_ROOT_MODULO_SEGURIDAD+"/login")
public class LoginController {
	
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

}
