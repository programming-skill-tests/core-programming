package com.core.programming;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class NonReducibleTest.
 */
public class NonReducibleTest {

	/** The test non reducible. */
	NonReducible testNonReducible;

	/**
	 * Setup - Instantiate NonReducible
	 */
	@Before
	public void setUp() {
		testNonReducible = new NonReducible();
				
	}

	@After
	public void tearDown() {
		testNonReducible = null;
	}

	/**
	 * Test Reduced String With Operation Count positive.
	 */
	@Test
	public void testReducedStringWithOperationCountPositive() {
		Assert.assertEquals(new NonReducible(3, "abd"), testNonReducible.getReducedStringWithOperationCount("aaabccddd"));
		Assert.assertEquals(new NonReducible(2, "abcd"), testNonReducible.getReducedStringWithOperationCount("abcccddd")); 
	}

	/**
	 * Test Reduced String With Operation Count negative.
	 */
	@Test
	public void testReducedStringWithOperationCountNegative() {
		Assert.assertEquals(new NonReducible(0, ""), testNonReducible.getReducedStringWithOperationCount(null)); 
	}

	/**
	 * Test Reduced String With Operation Count & verify logs.
	 */
	@Test
	public void testCheckPrimeStringVerifyLogs() {
		Assert.assertEquals(new NonReducible(3, "z"), testNonReducible.getReducedStringWithOperationCount("xxyyzzz"));
	}
}