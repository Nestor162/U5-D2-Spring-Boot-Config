package com.nestorcicardini.D2.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nestorcicardini.D2.entities.Drink;
import com.nestorcicardini.D2.entities.Merchandise;
import com.nestorcicardini.D2.entities.Pizza;
import com.nestorcicardini.D2.entities.Product;
import com.nestorcicardini.D2.entities.Topping;

@Configuration
public class BeansConfiguration {

	// TOPPINGS
	@Bean(name = "tomato")
	Topping tomato() {
		return new Topping("Tomato", 0, 0);
	}

	@Bean(name = "cheese")
	Topping cheese() {
		return new Topping("cheese", 0.69, 92);
	}

	@Bean(name = "ham")
	Topping ham() {
		return new Topping("ham", 0.99, 35);
	}

	@Bean(name = "onions")
	Topping onions() {
		return new Topping("onions", 0.69, 22);
	}

	@Bean(name = "pineapple")
	Topping pineapple() {
		return new Topping("pineapple", 0.79, 24);
	}

	@Bean(name = "salami")
	Topping salami() {
		return new Topping("salami", 0.99, 86);
	}

	// PIZZE

	@Bean(name = "pizzaMargherita")
	Product getPizzaMargherita() {
		List<Topping> listaToppings = new ArrayList<>();
		listaToppings.add(tomato());
		listaToppings.add(cheese());
		return new Pizza("Pizza Margherita", 4.99, 1104, listaToppings, "sm");
	}

	@Bean(name = "hawaiianPizza")
	Product getHawaiianPizza() {
		List<Topping> listaToppings = new ArrayList<>();
		listaToppings.add(tomato());
		listaToppings.add(cheese());
		listaToppings.add(ham());
		listaToppings.add(pineapple());
		return new Pizza("Hawaiian Pizza", 6.49, 1024, listaToppings, "sm");
	}

	@Bean(name = "familyPizza")
	Product getFamilyPizza() {
		List<Topping> listaToppings = new ArrayList<>();
		return new Pizza("Family Pizza", 4.15, 1.95, listaToppings, "lg");
	}

	@Bean(name = "salamiPizza")
	Product getSalamiPizza() {
		List<Topping> listaToppings = new ArrayList<>();
		listaToppings.add(tomato());
		listaToppings.add(cheese());
		listaToppings.add(salami());
		return new Pizza("Salami Pizza", 6.49, 1024, listaToppings, "sm");
	}

	// Drinks
	@Bean
	Drink lemonade() {
		return new Drink("Lemonade", 1.29, 128);
	}

	@Bean
	Drink water() {
		return new Drink("Water", 1.29, 0);
	}

	@Bean
	Drink wine() {
		return new Drink("Wine", 7.49, 607);
	}

	// Franchise
	@Bean
	Merchandise shirt() {
		return new Merchandise("Shirt", 21.99, 0);
	}

	@Bean
	Merchandise mug() {
		return new Merchandise("Mug", 21.99, 0);
	}
}
