package solutions_1.solutions_1;

import static org.junit.Assert.*;

import org.junit.Test;

import solutions_1.solutions_1.Shopping;

/**
 * The Class PrimeStringTest.
 */

public class ShoppingTest {

	/**
	 * Instantiating Shopping object
	 */

	Shopping shoppingTest = new Shopping();

	/**
	 * testing method tests the getRoyPayment method. Positive test case
	 */

	@Test
	public void shopping_Positive_Test() {
		assertEquals("Result : ", 8, shoppingTest.getRoyPayment(new Integer[] { 5, 10 }));
		assertEquals("Result : ", 22, shoppingTest.getRoyPayment(new Integer[] { 24, 0 }));
	}

	/**
	 * Negative test case
	 */

	@Test
	public void shopping_Negative_Test() {
		assertEquals("Result : ", 0, shoppingTest.getRoyPayment(null));
	}
}