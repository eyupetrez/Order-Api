package com.B2B.API.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.B2B.API.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Optional<Customer> findById(Optional<Customer> id);

}
