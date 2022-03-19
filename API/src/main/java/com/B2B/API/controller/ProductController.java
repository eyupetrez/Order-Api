package com.B2B.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.B2B.API.dto.ProductDTO;
import com.B2B.API.services.ProdcutService;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProdcutService productService;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> getAllProduct() {
		return ResponseEntity.ok().body(productService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> getByIdProduct(@PathVariable Long id) {
		return ResponseEntity.ok().body(productService.findById(id));
	}
	
	@PostMapping
	public void save(@RequestBody ProductDTO productDTO) {
		productService.save(productDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
}
