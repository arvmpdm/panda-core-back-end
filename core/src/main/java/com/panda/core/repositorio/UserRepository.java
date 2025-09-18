package com.panda.core.repositorio;

import com.panda.core.entidad.Pruebas;
import com.panda.core.entidad.Usuario;
import com.panda.core.repositorio.persistencia.CrudRepository;

import jakarta.persistence.EntityManager;

public class UserRepository extends CrudRepository<Usuario> {

	public UserRepository(Class<Usuario> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
