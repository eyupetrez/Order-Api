package com.B2B.API.dto;

import com.B2B.API.entities.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
	
	private Long id;
	private String name;
	private Double price;
	
	public ProductDTO(Product product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
	}
	
}
