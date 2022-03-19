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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.B2B.API.dto.request.CustomerRequestDTO;
import com.B2B.API.dto.responses.CustomerResponseDTO;
import com.B2B.API.services.CustomerService;

import lombok.var;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<CustomerResponseDTO>> getAllCustomer(){
		return ResponseEntity.ok().body(customerService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CustomerResponseDTO> getByIdCustomer(@PathVariable Long id) {
		return ResponseEntity.ok().body(customerService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<CustomerResponseDTO> save(@RequestBody CustomerRequestDTO customerRequestDTO){
		 var createdCustomer = customerService.save(customerRequestDTO);
	     var uri = ServletUriComponentsBuilder
	                .fromCurrentRequest()
	                .path("{/id}")
	                .buildAndExpand(createdCustomer.getId())
	                .toUri();
	        return ResponseEntity
	                .created(uri)
	                .body(createdCustomer);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		customerService.delete(id);
	}

}
