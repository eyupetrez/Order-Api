package com.B2B.API.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.B2B.API.dto.OrderItemDTO;
import com.B2B.API.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	@Column
	private OrderStatus status;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE)
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public double getTotal() {
		double sum = 0;
		for (OrderItem orderItem : items) {
			sum = sum + orderItem.getSubTotal();
		}
		return sum;
	}
	
	public List<OrderItem> getItems(){
		return items;
	}
	
}
