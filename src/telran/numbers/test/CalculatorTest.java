package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static telran.numbers.Calculator.*;

class CalculatorTest {

	@Test
	void testMultiply() {
		assertEquals(4, multiply(2, 2));
		assertEquals(-4, multiply(-2, 2));
		assertEquals(4, /*Calculator.*/multiply(-2, -2));
	}

	@Test
	void testSum() {
		assertTrue(sum(2,2) > 0);
		assertFalse(sum(2,-10) > 0);
		assertEquals(4, sum(3,1));
		
	}

	@Test
	void testSubtract() {
		assertEquals(4, subtract(7,3));
		assertEquals(-3, subtract(7,10));
	}

	@Test
	void testDevide() {
		assertEquals(3, devide(9, 3));
				
	}

	@Test
	void testRemainder() {
		assertEquals(3, remainder(3, 4));
		assertEquals(0, remainder(12, 4));
	}
	
	@Test
	@Disabled
	void testDevideZero() {
		
		assertEquals(0, devide(9, 0));
		
	}
}
