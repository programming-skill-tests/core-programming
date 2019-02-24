package com.core.programming;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class ShoppingTest.
 */
public class ShoppingTest {

	/** The test shopping. */
	Shopping testShopping;

	/**
	 * Set up - Instantiate Shopping
	 */
	@Before
	public void setUp() {
		testShopping = new Shopping();
	}

	@After
	public void tearDown() {
		testShopping = null;
	}

	/**
	 * Test find amount spent by Roy positive.
	 */
	@Test
	public void testFindAmountSpentByRoyPositive() {
		
		int[] products = {5,10};
		Assert.assertEquals(8, testShopping.findAmountSpentByRoy(products));
		products = new int[]{0, 1, 5, 10, 50, 17};
		Assert.assertEquals(57, testShopping.findAmountSpentByRoy(products));
		
	}

	/**
	 * Test find amount spent by Roy negative.
	 */
	@Test
	public void testFindAmountSpentByRoyNegative() {
		int[] products = {};
		Assert.assertEquals(0, testShopping.findAmountSpentByRoy(products));
		Assert.assertEquals(0, testShopping.findAmountSpentByRoy(null));
	}

	/**
	 * Test find amount spent by Roy verify logs.
	 */
	@Test
	public void testGetValueVerifyLogs() {
		int[] products = {0, 1, 3, 4};
		Assert.assertEquals(3, testShopping.findAmountSpentByRoy(products));
	}
}