package com.problems;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestcaseForKattapa {

	@Test
	public  void testKattapa() {
		
		assertEquals("READY FOR BATTLE",KattapaReadyForBattle.isReadForBattle(5, new int[]{9,11,12,13,14}));
		
	}

}
