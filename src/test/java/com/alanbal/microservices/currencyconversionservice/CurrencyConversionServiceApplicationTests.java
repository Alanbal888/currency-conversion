package com.alanbal.microservices.currencyconversionservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alanbal.microservices.currencyconversionservice.controller.CurrencyConversionController;

@SpringBootTest
class CurrencyConversionServiceApplicationTests {

	@Autowired
	private CurrencyConversionController currencyConversionController;
	
	@Test
	void contextLoads() {
		assertNotNull(currencyConversionController);
	}

}
