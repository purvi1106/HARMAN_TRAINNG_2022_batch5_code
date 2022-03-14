package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@DisplayName("parameterized test case")
	@Order(value = 1)
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void test_add_two_numbers(int num1, int num2, int expected) {
		assertEquals(expected, calculator.add(num1, num2));
	}

	
//	@Tag(value = "dev")
//	@DisplayName("test add two numbers")
//	@Order(value = 1)
//	@Test
//	void test_add_two_numbers() {
//		assertEquals(4, calculator.add(2, 2));
//	}
//
//	@Tag(value = "dev")
//	@Order(value = 1)
//	@Test
//	void test_divide_two_numbers() {
//		assertEquals(2, calculator.divide(4, 2));
//	}

// @Order(value = 1)
//	@Test
//	void test_divide_number_with_zero_expect_ArithmaticEx() {
//		RuntimeException exception = Assertions
//				.assertThrows(ArithmeticException.class,
//						()-> calculator.divide(4, 0),
//						()-> "divide by zero is not allowed");
//	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

}
