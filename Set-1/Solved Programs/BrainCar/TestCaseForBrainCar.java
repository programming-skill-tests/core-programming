package com.braincar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCaseForBrainCar {

	@Test
	public  void testBrainCarName() {
		assertEquals("OK",BrainCar.BrainCarName("aaabbbccc"));
	}

}
