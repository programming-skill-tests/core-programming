package com.core.programming;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class BrianCarNameTest.
 */
public class BrianCarNameTest {

	/** The test car name. */
	BrianCarName testBrianCarName;

	/**
	 * Setup - Instantiate BrianCarName
	 */
	@Before
	public void setUp() {
		testBrianCarName = new BrianCarName();

	}

	@After
	public void tearDown() {
		testBrianCarName = null;

	}

	/**
	 * Test CarName positive.
	 */
	@Test
	public void testCarNamePositive() {
		Assert.assertEquals("OK", testBrianCarName.checkCarName("bbbrrriii"));
		Assert.assertEquals("OK", testBrianCarName.checkCarName("bri"));

		Assert.assertEquals("Not OK", testBrianCarName.checkCarName("brian"));
		Assert.assertEquals("Not OK", testBrianCarName.checkCarName("bbrri"));
	}

	/**
	 * Test CarName negative.
	 */
	@Test
	public void testCarNameNegative() {
		Assert.assertEquals("Error", testBrianCarName.checkCarName(""));
		Assert.assertEquals("Error", testBrianCarName.checkCarName(" "));
		Assert.assertEquals("Error", testBrianCarName.checkCarName(null));
	}

	/**
	 * Test CarName verify logs.
	 */
	@Test
	public void testCarNameVerifyLogs() {
		Assert.assertEquals("OK", testBrianCarName.checkCarName("bbbrrriii"));
	}
}