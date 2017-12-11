/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.Dao;

import java.util.List;

/**
 *
 * @author el ouali
 */
public interface IDao<T> {
    public boolean create(T o);

	public boolean update(T o);

	public boolean delete(T o);

	public T getById(int id);

	List<T> getAll();
    
}
