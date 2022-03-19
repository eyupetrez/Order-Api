package com.B2B.API.services;

import java.util.List;

import com.B2B.API.dto.request.CustomerRequestDTO;
import com.B2B.API.dto.responses.CustomerResponseDTO;

public interface CustomerService {

	public List<CustomerResponseDTO> findAll();
	
	public CustomerResponseDTO findById(Long id);
	
	public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
	
	public void delete(Long id);
	
	
	
}
