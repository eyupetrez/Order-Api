package com.B2B.API.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.B2B.API.entities.Order;
import com.B2B.API.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	List<OrderItem> findByOrder(Order order);

}
