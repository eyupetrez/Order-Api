package com.B2B.API.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductNotFoundExcepiton extends RuntimeException {
	
	public ProductNotFoundExcepiton(Long id) {
		super("Product not found with ID: " + id);
	}
	
	
}
