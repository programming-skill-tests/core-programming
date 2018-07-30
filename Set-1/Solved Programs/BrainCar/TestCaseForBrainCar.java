package com.braincar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCaseForBrainCar {

	@Test
	public  void positive_test_For_BrainCarName() {
		
		assertEquals("OK",BrainCar.checkBrainCarName("aaabbbccc"));
		
		assertEquals("Not OK",BrainCar.checkBrainCarName("aaabbbcccdd"));
	}
	
	@Test
	public  void negative_test_For_BrainCarName() {
		
		assertEquals("Invalid input",BrainCar.checkBrainCarName(null));
		
		assertEquals("OK",BrainCar.checkBrainCarName("aaabbbccddc"));
		
		
	}


}
