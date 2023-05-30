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
	private int occupancy;
	private String orderTime;
	private double totalAmount;
	private double occupancyPrice;

	public enum OrderStatus {
		READY, IN_PROGRESS, SERVED
	}

	public Order(List<Product> products, int orderNumber,
			OrderStatus orderStatus, int occupancy, String orderTime,
			double occupancyPrice) {
		super();
		this.products = products;
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		this.occupancy = occupancy;
		this.orderTime = orderTime;
		this.occupancyPrice = occupancyPrice;
		setTotalAmount();
	}

	public void setTotalAmount() {
		double total = products.stream().mapToDouble(Product::getPrice).sum();
		total += occupancy * occupancyPrice;
		this.totalAmount = total;
	}

	@Override
	public String toString() {
		return "Order [products=" + products + ", orderNumber=" + orderNumber
				+ ", orderStatus=" + orderStatus + ", Occupancy=" + occupancy
				+ ", orderTime=" + orderTime + ", totalAmount=" + totalAmount
				+ "]";
	}

}
