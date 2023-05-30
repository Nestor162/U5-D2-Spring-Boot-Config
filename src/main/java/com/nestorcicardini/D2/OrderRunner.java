package com.nestorcicardini.D2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

// C'e un ordine dei runner (default = alfabetico)
@Order(0) // Più basso è il numero prima viene eseguito

public class OrderRunner implements CommandLineRunner {
	// anche puo implementare ApplicationRunner

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		log.info("::::::::::::::::::::::: Orders ::::::::::::::::::::::::::");
		configWithAnnotation();

	}

	public static void configWithAnnotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				D2Application.class);

		log.info(context.getBean("Order1").toString());

		context.close();
	}

}
