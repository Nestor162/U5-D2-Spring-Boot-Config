package com.nestorcicardini.D2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Merchandise extends Product {

	public Merchandise(String name, double price, double calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return getName() + " \tPrice " + getPrice();
	}

}
