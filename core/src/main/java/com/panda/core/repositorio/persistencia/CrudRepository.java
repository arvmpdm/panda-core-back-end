package com.panda.core.repositorio.persistencia;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;

public abstract class CrudRepository <T> implements Repositorio<T>{
	
	private final Class<T> entityClass;
	
	public CrudRepository(Class<T> entityClass) {
		this.entityClass=entityClass;
	}
	
	
	@PersistenceContext(unitName="panda-core")
	protected EntityManager em;
	
	protected abstract EntityManager getEntityManager();
	
	public T save(T entity) {
		getEntityManager().persist(entity);
		return entity;
	}
	
	public T update(T entity)
	{
		getEntityManager().merge(entity);
		return entity;
		
		
	}
	
	public T findById(Object entity) {
		return getEntityManager().find(entityClass, entity);
		
	}
	
	public void delete(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}
	
	public List<T> findAll(){
		CriteriaQuery cq=getEntityManager().getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
		
	}
	

}
