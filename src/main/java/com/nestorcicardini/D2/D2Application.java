package com.nestorcicardini.D2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class D2Application {

	public static void main(String[] args) {
		SpringApplication.run(D2Application.class, args);
		log.info("Runner principale...");

	}

}
