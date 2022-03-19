package com.B2B.API.dto.responses;

import com.B2B.API.entities.Customer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerResponseDTO {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	public CustomerResponseDTO(Customer customer) {
		id = customer.getId();
		name = customer.getName();
		email = customer.getEmail();
		phone = customer.getPhone();
	}
}
