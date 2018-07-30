package com.problems;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 
 * The class kattapaReadyForBattle
 *
 */
public class TestKattapaReadyForBattle {

	/**
	 * Positive test for kattapaReadyForBattle
	 * 
	 * @return nothing
	 */
	@Test
	public void kattapaReadyForBattlePositiveTest_Result  () {
	  
	   assertEquals("READY FOR BATTLE", KattapaReadyForBattle.isReadyForBattle(5, new int[]{2, 3, 4, 5,6}));
	   
	   assertEquals("NOT READY", KattapaReadyForBattle.isReadyForBattle(4, new int[]{11, 13, 14, 15}));
	}
	
	/**
	 * Positive test for kattapaReadyForBattle
	 * 
	 * @return nothing
	 */
	@Test
	public void kattapaReadyForBattleNegativeTest_Result  () {
	  
		assertEquals("Number of Soliders and weapon not matching ", KattapaReadyForBattle.isReadyForBattle(2, new int[]{11, 12, 13, 14}));   
	    
		assertEquals("Invalid input", KattapaReadyForBattle.isReadyForBattle(4, null));
	}

}
