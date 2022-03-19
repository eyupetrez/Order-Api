package com.B2B.API.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.B2B.API.dto.ProductDTO;
import com.B2B.API.entities.Product;
import com.B2B.API.exceptions.ProductNotFoundExcepiton;
import com.B2B.API.repositories.ProductRepository;
import com.B2B.API.services.ProdcutService;

@Service
public class ProductServiceImpl implements ProdcutService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductDTO> findAll() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(ProductDTO::new).collect(Collectors.toList());
	}

	@Override
	public ProductDTO findById(Long id) throws ProductNotFoundExcepiton {
		ProductDTO productDTO = new ProductDTO(productRepository.findById(id).orElseThrow(() -> new ProductNotFoundExcepiton(id)));
		return productDTO;
	}

	@Override
	public void save(ProductDTO productDTO) {
		Product product = new Product(productDTO);
		productRepository.save(product);
		
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

}
