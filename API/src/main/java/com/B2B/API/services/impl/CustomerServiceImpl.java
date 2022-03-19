package com.B2B.API.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.B2B.API.dto.request.CustomerRequestDTO;
import com.B2B.API.dto.responses.CustomerResponseDTO;
import com.B2B.API.entities.Customer;
import com.B2B.API.exceptions.CustomerNotFoundException;
import com.B2B.API.repositories.CustomerRepository;
import com.B2B.API.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<CustomerResponseDTO> findAll() {
		List<Customer> list = customerRepository.findAll();
		return list.stream().map(CustomerResponseDTO::new).collect(Collectors.toList());
	}

	@Override
	public CustomerResponseDTO findById(Long id) throws CustomerNotFoundException {
		CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO(customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException(id)));
		return customerResponseDTO;
	}

	@Override
	public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
		Customer customer = new Customer(customerRequestDTO);
		Customer customerToSave = customerRepository.save(customer);
		CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO(customerToSave);
		return customerResponseDTO;
	}

	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}


}
