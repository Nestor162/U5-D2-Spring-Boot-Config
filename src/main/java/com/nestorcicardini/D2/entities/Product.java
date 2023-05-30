package com.nestorcicardini.D2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Product {
	private String name;
	private double price;
	private double calories;

	public Product(String name, double price, double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

}
