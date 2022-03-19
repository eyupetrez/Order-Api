package com.B2B.API.services.impl;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.B2B.API.dto.OrderDTO;
import com.B2B.API.dto.responses.CustomerResponseDTO;
import com.B2B.API.entities.Customer;
import com.B2B.API.entities.Order;
import com.B2B.API.exceptions.OrderNotFoundException;
import com.B2B.API.repositories.OrderRepository;
import com.B2B.API.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<OrderDTO> findAll() {
		List<Order> list = orderRepository.findAll();
		return list.stream().map(OrderDTO :: new).collect(Collectors.toList());
	}

	@Override
	public OrderDTO findById(Long id) throws OrderNotFoundException {
		OrderDTO orderDTO = new OrderDTO(orderRepository.findById(id).orElseThrow(()-> new OrderNotFoundException(id)));
		return orderDTO;
	}

	@Override
	public void delete(Long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public void save(Order order) {
		orderRepository.save(order);
	}

}
