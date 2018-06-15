package solutions_1.solutions_1;

import static org.junit.Assert.*;

import org.junit.Test;

import solutions_1.solutions_1.ChopCount;
import solutions_1.solutions_1.NonReducible;

/**
 * The Class PrimeStringTest.
 */

public class NonReducibleTest {

	/**
	 * Instantiating NonReducibleTest object
	 */

	NonReducible nonReducileTest = new NonReducible();

	/**
	 * testing method tests the getChopCount method. Positive test case.
	 */

	@Test
	public void nonReducible_Positive_Test() {
		assertEquals("Result : ", new ChopCount(5, "a"), nonReducileTest.getChopCount("aaabbccdddd"));
		assertEquals("Result : ", new ChopCount(3, "abd"), nonReducileTest.getChopCount("aaabccddd"));
	}

	/**
	 * Negative test case
	 */

	@Test
	public void nonReducible_Negative_Test() {
		assertEquals("Result : ", new ChopCount(0, ""), nonReducileTest.getChopCount(null));
	}
}