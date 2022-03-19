package com.B2B.API;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.B2B.API.dto.ProductDTO;
import com.B2B.API.dto.responses.CustomerResponseDTO;
import com.B2B.API.entities.Customer;
import com.B2B.API.entities.Order;
import com.B2B.API.entities.OrderItem;
import com.B2B.API.entities.Product;
import com.B2B.API.repositories.OrderItemRepository;
import com.B2B.API.repositories.OrderRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class OrdersTests {

	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public OrderItemRepository orderItemRepository;
	
	@Autowired
	public TestEntityManager entityManager;
	

	@Test
	public void testAddOneOrderItem() {
		
		Order order = entityManager.find(Order.class, 1);
		Customer customerId = entityManager.find(Customer.class, 1);
		Product product = entityManager.find(Product.class, 1);
		
		order.setCustomer(customerId);
		
		OrderItem newOrderItem = new OrderItem();
		newOrderItem.setOrder(order);
		newOrderItem.setProduct(product);
		newOrderItem.setQuantity(3);
		newOrderItem.setPrice(1200.0);
		
		OrderItem savedOrderItem = orderRepository.save(newOrderItem);
		
		assertTrue(savedOrderItem.getId() > 0);
	}
	
	@Test
	public void testGetOrderItemsByOrder() {
		Order order = new Order();
		order.setId((long) 1);
		
		 List<OrderItem> orderItems = orderItemRepository.findByOrder(order);
		 
		 assertEquals(1, orderItems.size());
	}
}
