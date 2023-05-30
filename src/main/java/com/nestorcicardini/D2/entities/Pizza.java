package com.nestorcicardini.D2.entities;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pizza extends Product {
	private List<Topping> toppings;
	private String size;

	public Pizza(String name, double price, double calories,
			List<Topping> toppings, String size) {
		super(name, price, calories);
		this.toppings = toppings;
		this.size = size;
	}

	@Override
	public String toString() {
		return getName() + " (" + toppings + ") " + "\t" + "Price: "
				+ getPrice() + " " + "Calories: " + getCalories();
	}

}
