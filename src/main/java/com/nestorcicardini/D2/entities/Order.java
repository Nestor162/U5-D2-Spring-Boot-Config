package com.nestorcicardini.D2.entities;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {
	private List<Product> products;
	private int orderNumber;
	private OrderStatus orderStatus;
	private int Occupancy;
	private String orderTime;
	private double totalAmount;

	enum OrderStatus {
		READY, IN_PROGRESS, SERVED
	}

	public Order(List<Product> products, int orderNumber,
			OrderStatus orderStatus, int occupancy, String orderTime,
			double totalAmount) {
		super();
		this.products = products;
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		Occupancy = occupancy;
		this.orderTime = orderTime;
		this.totalAmount = totalAmount;
	}

}
