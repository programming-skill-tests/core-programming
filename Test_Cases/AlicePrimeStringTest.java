package com.core.programming;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class AlicePrimeStringTest.
 */
public class AlicePrimeStringTest {

	/** The test prime string. */
	AlicePrimeString testAlicePrimeString;

	/**
	 * Setup - Instantiate AlicePrimeString
	 */
	@Before
	public void setUp() {
		testAlicePrimeString = new AlicePrimeString();
				
	}

	@After
	public void tearDown() {
		testAlicePrimeString = null;
		
	}

	/**
	 * Test CheckPrimeString positive.
	 */
	@Test
	public void testCheckPrimeStringPositive() {
		Assert.assertEquals("Yes", testAlicePrimeString.checkPrimeString("ababb"));
		Assert.assertEquals("Yes", testAlicePrimeString.checkPrimeString("abcccab"));
		
		Assert.assertEquals("No", testAlicePrimeString.checkPrimeString("abcab"));
		Assert.assertEquals("No", testAlicePrimeString.checkPrimeString("abcdab"));
		Assert.assertEquals("No", testAlicePrimeString.checkPrimeString("a"));
		Assert.assertEquals("No", testAlicePrimeString.checkPrimeString("ab"));

	}

	/**
	 * Test CheckPrimeString negative.
	 */
	@Test
	public void testCheckPrimeStringNegative() {
		Assert.assertEquals("Error", testAlicePrimeString.checkPrimeString(""));
		Assert.assertEquals("Error", testAlicePrimeString.checkPrimeString(" "));
		Assert.assertEquals("Error", testAlicePrimeString.checkPrimeString(null));
	}

	/**
	 * Test CheckPrimeString verify logs.
	 */
	@Test
	public void testCheckPrimeStringVerifyLogs() {
		Assert.assertEquals("Yes", testAlicePrimeString.checkPrimeString("aaabbcc"));
	}
}