package com.niit.insbackend.doa;

import java.util.List;

import com.niit.insbackend.model.Products;

public interface ProductsDao {
	
	public List<Products> getAllProducts();
	public Products get(String P_id);
	public void saveorupdate(Products products);
	public void delete(String P_id);
	

}

