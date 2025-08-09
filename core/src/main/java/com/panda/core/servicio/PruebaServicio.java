package com.panda.core.servicio;

import java.util.List;

import com.panda.core.entidad.Pruebas;
import com.panda.core.repositorio.PruebasRepCrud;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Stateless

public class PruebaServicio extends PruebasRepCrud<Pruebas>{
	
	public PruebaServicio() {
		super(Pruebas.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public List<Pruebas> getAllPruebas(){
		Query query=em.createQuery("SELECT p FROM pruebas p");
		return query.getResultList();
	}


}
