package com.panda.core.repositorio;

import java.util.List;

public interface PruebasRepositorio<T> {
	
	T save(T entity);
	
	T upDate(T entity);
	
	T findById(Object entity);
	
	void delete(T entity);
	
	List<T> findAll();

}
