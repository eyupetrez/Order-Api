package com.B2B.API.exceptions;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.B2B.API.entities.Customer;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CustomerNotFoundException(Long id) {
		super("Customer not found with ID: " + id);
	}
	
	
}
