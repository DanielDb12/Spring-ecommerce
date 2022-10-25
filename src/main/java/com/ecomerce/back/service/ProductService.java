package com.ecomerce.back.service;

import java.util.List;
import java.util.Optional;


import com.ecomerce.back.models.ProductModels;



public interface ProductService {
	
	public ProductModels save(ProductModels productModels);
	public Optional<ProductModels> get(Integer id);
	public void update(ProductModels products);
	public void delete(Integer id);
	public List<ProductModels> findAll();
	

}
