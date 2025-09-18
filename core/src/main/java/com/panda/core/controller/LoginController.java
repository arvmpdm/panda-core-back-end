package com.panda.core.controller;

import java.util.List;

import com.panda.core.config.JwtUtils;
import com.panda.core.controller.dto.LoginModel;
import com.panda.core.controller.dto.ResponseModel;
import com.panda.core.entidad.Pruebas;
import com.panda.core.entidad.Usuario;
import com.panda.core.servicio.LoginServicio;
import com.panda.core.servicio.PruebaServicio;
import com.panda.core.util.Util;
import com.panda.core.util.UtilMessage;

import jakarta.inject.Inject;
import jakarta.security.enterprise.authentication.mechanism.http.AutoApplySession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path(Util.APP_ROOT_MODULO_SEGURIDAD+"/login")
public class LoginController {
	
	@Inject
	PruebaServicio servicio;
	
	@Inject 
	JwtUtils jwt;
	
	@Inject
	LoginServicio userService;
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pruebas> getAllPrueba(){
		return this.servicio.getAllPruebas();
		
	}
	//
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseModel login( LoginModel model) {
		
		//String token=jwt.generateToken(username);
		
		System.out.println(model.getUserName());
		System.out.println(model.getPassword());
		Usuario user =new Usuario();
		user.setUserName(model.getUserName());
		user.setPassword(model.getPassword());
		
		userService.save(user);
		
		
		ResponseModel response=new ResponseModel();
		response.setStatus(UtilMessage.POST_ESTATUS);
		response.setMenssage(UtilMessage.POST_ESTATUS_MESSAGE);
		//return  Response.ok().entity(new TokenResponse(token)).build();
		return response;
		
	}
	
	 public static class TokenResponse {
	        public String token;
	        
	        public TokenResponse(String token) {
	            this.token = token;
	        }
	    }

}


