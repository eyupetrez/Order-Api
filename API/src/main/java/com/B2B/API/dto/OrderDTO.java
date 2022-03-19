package com.B2B.API.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.B2B.API.dto.responses.CustomerResponseDTO;
import com.B2B.API.entities.Order;
import com.B2B.API.enums.OrderStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDTO {
	
	private Long id;
	private Date time;
	private OrderStatus status;
	private CustomerResponseDTO customerResponseDTO;
	private List<OrderItemDTO> items = new ArrayList<OrderItemDTO>();
	private Double getTotal;
	
	public OrderDTO(Order order) {
		id = order.getId();
		time = order.getTime();
		status = order.getStatus();
		customerResponseDTO = new CustomerResponseDTO(order.getCustomer());
		order.getItems().forEach(items -> this.items.add(new OrderItemDTO(items)));
		getTotal = order.getTotal();
		
	}

	
	
}
