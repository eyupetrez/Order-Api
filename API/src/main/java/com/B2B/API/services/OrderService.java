package com.B2B.API.services;

import java.util.List;

import com.B2B.API.dto.OrderDTO;
import com.B2B.API.entities.Order;

public interface OrderService {
	
	public List<OrderDTO> findAll();
	
	public OrderDTO findById(Long id);
	
	public void save(Order order);
	
	public void delete(Long id);
	
}
