package com.panda.core.repositorio.persistencia;

import java.util.List;

import jakarta.ejb.Local;

@Local
public interface Repositorio<T> {
	
	T save(T entity);
	T update(T entity);
	T findById(Object entityId);
	void delete(T entity);
	List<T> findAll();

}
