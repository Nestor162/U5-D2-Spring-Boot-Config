package com.nestorcicardini.D2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Drink extends Product {

	public Drink(String name, double price, int calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return getName() + "\tPrice: " + getPrice() + " Calories: "
				+ getCalories();
	}

}
