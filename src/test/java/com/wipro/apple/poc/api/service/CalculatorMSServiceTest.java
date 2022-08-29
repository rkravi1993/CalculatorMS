package com.wipro.apple.poc.api.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorMSServiceTest {

	@Autowired
	private CalculatorMSService msService;

	@Test
	public void testSum() {
		int actual = msService.sum(3, 5);
		assertEquals(8, actual);
	}

	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void testSumForNull() {
		msService.sum((Integer) null, (Integer) null);
	}

	@Test
	public void testProduct() {
		int actual = msService.product(3, 5);
		assertEquals(15, actual);
	}

	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void testProductForNull() {
		msService.product((Integer) null, (Integer) null);
	}

	@Test
	public void testModulo() {
		int actual = msService.modulo(3, 5);
		assertEquals(3, actual);
	}

	@SuppressWarnings("null")
	@Test(expected = NullPointerException.class)
	public void testModuloForNull() {
		msService.modulo((Integer) null, (Integer) null);
	}
}
