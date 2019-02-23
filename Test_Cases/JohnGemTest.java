package com.core.programming;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class JohnGemTest.
 */
public class JohnGemTest {

	/** The test gem. */
	JohnGem testJohnGemTest;

	/**
	 * Set up - Instantiate JohnGem
	 */
	@Before
	public void setUp() {
		testJohnGemTest = new JohnGem();
	}

	@After
	public void tearDown() {
		testJohnGemTest = null;
	}

	/**
	 * Test count gem positive.
	 */
	@Test
	public void testcountGemElementsPositive() {
		List<String> rocks1 = new ArrayList<String>();
		rocks1.add("abcdde");
		rocks1.add("baccd");
		rocks1.add("eeabg");
		List<String> rocks2 = new ArrayList<String>();
		rocks2.add("abcd");
		rocks2.add("defg");
		
		Assert.assertEquals(2, testJohnGemTest.countGemElements(rocks1));
		Assert.assertEquals(1, testJohnGemTest.countGemElements(rocks2));
	}

	/**
	 * Test count gem negative.
	 */
	@Test
	public void testGetValueNegative() {
		Assert.assertEquals(0, testJohnGemTest.countGemElements(new ArrayList<String>()));
		Assert.assertEquals(0, testJohnGemTest.countGemElements(null));
	}

	/**
	 * Test count gem verify logs.
	 */
	@Test
	public void testGetValueVerifyLogs() {
		List<String> rocks1 = new ArrayList<String>();
		rocks1.add("abcdde");
		rocks1.add("baccd");
		rocks1.add("eeabc");
		Assert.assertEquals(3, testJohnGemTest.countGemElements(rocks1));
	}
}