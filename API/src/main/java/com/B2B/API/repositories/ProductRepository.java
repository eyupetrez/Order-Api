package com.B2B.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.B2B.API.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
