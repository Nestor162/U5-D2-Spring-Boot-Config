package com.nestorcicardini.D2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nestorcicardini.D2.entities.Topping;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

// C'e un ordine dei runner (default = alfabetico)
@Order(0) // Più basso è il numero prima viene eseguito

public class MenuRunner implements CommandLineRunner {
	// anche puo implementare ApplicationRunner

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		log.info("Benvenuti su Godfather's Pizza!" + System.lineSeparator());
		log.info("::::::::::::::::::::::: Menu ::::::::::::::::::::::::::");
		log.info("--- Pizzas ---");
		configWithAnnotation();

	}

	public static void configWithAnnotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				D2Application.class);

		log.info(context.getBean("pizzaMargherita").toString());
		log.info(context.getBean("hawaiianPizza").toString());
		log.info(context.getBean("salamiPizza").toString());
		log.info(context.getBean("familyPizza").toString());

		System.out.println();
		log.info("--- Toppings ---");
		log.info(context.getBean("cheese", Topping.class).showCompleteInfo());
		log.info(context.getBean("ham", Topping.class).showCompleteInfo());
		log.info(context.getBean("onions", Topping.class).showCompleteInfo());
		log.info(
				context.getBean("pineapple", Topping.class).showCompleteInfo());
		log.info(context.getBean("salami", Topping.class).showCompleteInfo());

		System.out.println();
		log.info("--- Drinks ---");
		log.info(context.getBean("lemonade").toString());
		log.info(context.getBean("water").toString());
		log.info(context.getBean("wine").toString());

		System.out.println();
		log.info("--- Franchise ---");
		log.info(context.getBean("shirt").toString());
		log.info(context.getBean("mug").toString());

		context.close();
	}

}
