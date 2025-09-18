package com.panda.core.servicio;

import com.panda.core.entidad.Pruebas;
import com.panda.core.entidad.Usuario;
import com.panda.core.repositorio.PruebasRepCrud;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;

@Stateless
public class LoginServicio  extends PruebasRepCrud<Usuario>{
	
	public LoginServicio() {
		super(Usuario.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	@Override
	public Usuario update(Usuario entity) {
		
		
		return null;
	}
	
	public Usuario save(Usuario usuario) {
		
		return usuario;
		
	}
	
	

}
