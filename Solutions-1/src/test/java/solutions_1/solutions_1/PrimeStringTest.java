package solutions_1.solutions_1;

import static org.junit.Assert.*;

import org.junit.Test;

import solutions_1.solutions_1.PrimeString;

/**
 * The Class PrimeStringTest.
 */

public class PrimeStringTest {

	/**
	 * Instantiating PrimeString object
	 */

	PrimeString primeStringTest = new PrimeString();

	/**
	 * testing method tests the isPrimeString method. Positive test case.
	 */

	@Test
	public void primeString_Positive_Test() {
		assertEquals("Result : ", "Yes", primeStringTest.isPrimeString("aabbb"));
		assertEquals("Result : ", "No", primeStringTest.isPrimeString("abcde"));
	}

	/**
	 * Negative test case
	 */

	@Test
	public void primeString_Negative_Test() {
		assertEquals("Result : ", "error", primeStringTest.isPrimeString(null));
	}
}