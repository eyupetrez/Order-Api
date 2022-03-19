package com.B2B.API.services;

import java.util.List;

import com.B2B.API.dto.ProductDTO;


public interface ProdcutService {
	
	public List<ProductDTO> findAll();
	
	public ProductDTO findById(Long id);
	
	public void save(ProductDTO productDTO);
	
	public void delete(Long id);
}
