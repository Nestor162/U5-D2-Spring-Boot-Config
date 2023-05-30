package com.nestorcicardini.D2.tools;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CustomMathsTest {
	private CustomMaths m = new CustomMaths();

	@BeforeEach
	void setUp() {
		// Configurazione iniziale prima di ogni test
		log.info("Configurazione iniziale...");
	}

	@AfterEach
	void tearDown() {
		// Pulizia dopo ogni test
		log.info("Pulisco dopo test...");
	}

	@Test
	void testDoSum() {
		assertEquals(4, m.doSum(2, 2));
		// Primo parametro quello che mi aspetto, secondo parametro la funzione
		// da testare
		log.info("Provo la somma!");

	}

	@Test
	@Disabled // Salta il test, su JUnit4 si chiama "Ignore"
	void testDoSum2() {
		assertEquals(5, m.doSum(2, 2));

	}

	@Test
	void testArray() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(8);

		assertTrue(list.contains(8));

		log.info("Provo l'array list!");

	}

}
