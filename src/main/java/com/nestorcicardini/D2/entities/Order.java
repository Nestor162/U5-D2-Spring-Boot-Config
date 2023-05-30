package com.nestorcicardini.D2.entities;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
	private List<Product> products;
	private int orderNumber;
	private OrderStatus orderStatus;
	private int Occupancy;
	private String orderTime;
	private double totalAmount;

	public enum OrderStatus {
		READY, IN_PROGRESS, SERVED
	}

	public Order(List<Product> products, int orderNumber,
			OrderStatus orderStatus, int occupancy, String orderTime) {
		super();
		this.products = products;
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		Occupancy = occupancy;
		this.orderTime = orderTime;
		setTotalAmount();
	}

	public void setTotalAmount() {
		double total = products.stream().mapToDouble(Product::getPrice).sum();
		this.totalAmount = total;
	}

	@Override
	public String toString() {
		return "Order [products=" + products + ", orderNumber=" + orderNumber
				+ ", orderStatus=" + orderStatus + ", Occupancy=" + Occupancy
				+ ", orderTime=" + orderTime + ", totalAmount=" + totalAmount
				+ "]";
	}

}
