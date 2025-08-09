package com.panda.core.repositorio;

import java.util.List;

import com.panda.core.entidad.Pruebas;
import com.panda.core.repositorio.persistencia.CrudRepository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Stateless
public class PruebasRepositorio extends CrudRepository<Pruebas> {
	
	public PruebasRepositorio() {
		super(Pruebas.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public List<Pruebas> findAllElementsPruebas(){
		Query query=em.createQuery("SELECT p FROM Pruebas p");
		return query.getResultList();
		
	}
	
	

}
