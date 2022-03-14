package day4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Order(value = 2)
	//@Disabled
	@DisplayName(value = "multiply two number test")
	@Test
	void multiply_two_number_test() {

		Assertions.assertEquals(16, calculator.multiply(8, 2));

	}
	
	@Order(value = 3)
	@DisplayName(value = "divide two number test postive")
	@Test
	void divide_two_number_test() {

		Assertions.assertEquals(4, calculator.divide(8, 2));

	}
	
	@Order(value = 4)
	@DisplayName(value = "divide two number test with exceptions")
	@Test
	void divide_two_number_test_with_exceptions() {
		Assertions.assertThrows(ArithmeticException.class, ()-> calculator.divide(8, 0));
	}

	@Order(value = 1)
	@DisplayName(value = "add two number test")
	@Test
	void add_two_number_test() {
		Assertions.assertEquals(5, calculator.add(3, 2));
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

}
