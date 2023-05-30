package com.nestorcicardini.D2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Topping extends Product {
	public Topping(String name, double price, double calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return getName();
	}

	public String showCompleteInfo() {
		return getName() + "\t Price: " + getPrice() + " Calories: "
				+ getCalories();
	}

}
