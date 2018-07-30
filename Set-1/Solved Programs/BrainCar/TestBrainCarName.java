package com.braincar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The class TestCaseForBrainCar
 * 
 */
public class TestBrainCarName {

	/**
	 * Positive test for BrainCar
	 * 
	 * @return nothing
	 */
	@Test
	public void testBrainCarNameAccecpted() {

		assertEquals("OK", BrainCar.checkBrainCarName("aaabbbccc"));

		assertEquals("Not OK", BrainCar.checkBrainCarName("aaabbbcccdd"));
	}

	/**
	 * Negative test for BrainCar
	 * 
	 * @return nothing
	 */
	@Test
	public void testBrainCarNameNotAccepted() {

		assertEquals("Invalid input", BrainCar.checkBrainCarName(null));

		assertEquals("OK", BrainCar.checkBrainCarName("aaabbbccddc"));

	}

}
