package com.wipro.apple.poc.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wipro.apple.poc.api.controller.CalculatorMSController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

	@Autowired
	private CalculatorMSController msController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(msController).isNotNull();
	}
}
