package com.example.demo;

import java.util.List;

public interface IDao<T, K> {

	public void save(T t);
	public T findById(K k);
	public List<T> findAll();
}
