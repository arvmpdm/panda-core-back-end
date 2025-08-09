package com.panda.core.repositorio;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;

public abstract class PruebasRepCrud<T> implements PruebasRepositorio<T> {
	
	private final Class<T> entidad;
	
	public PruebasRepCrud (Class<T> entidad) {
		this.entidad=entidad;
	}
	
	@PersistenceContext(unitName="panda-core")
	protected EntityManager em;
	
	protected abstract EntityManager getEntityManager();

	@Override
	public T save(T entity) {
		getEntityManager().persist(entity);
		return entity;
	}

	@Override
	public T upDate(T entity) {
		getEntityManager().merge(entity);
		return entity;
	}

	@Override
	public T findById(Object entity) {
		
		
		return getEntityManager().find(entidad, entity);
	}

	@Override
	public void delete(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
		
	}

	@Override
	public List<T> findAll() {
		CriteriaQuery cq=getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entidad));
		return getEntityManager().createQuery(cq).getResultList();
	}

}
