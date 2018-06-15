package solutions_1.solutions_1;

import static org.junit.Assert.*;

import org.junit.Test;

import solutions_1.solutions_1.KattapaReadyForBattle;

/**
 * The Class PrimeStringTest.
 */

public class KattappaTest {

	/**
	 * Instantiating KattappaTest object
	 */

	KattapaReadyForBattle kattappaBattleTest = new KattapaReadyForBattle();

	/**
	 * testing method tests the isReadyOrNot method. Positive Test cases
	 */

	@Test
	public void kattapaReadyForBattle_Positive_Test() {
		assertEquals("NOT READY", kattappaBattleTest.isReadyForBattle(4, new Integer[] { 11, 12, 13, 14 }));
		assertEquals("READY FOR BATTLE", kattappaBattleTest.isReadyForBattle(3, new Integer[] { 2, 3, 4 }));
	}

	/**
	 * Negative Test cases
	 */

	@Test
	public void kattapaReadyForBattle_Negative_Test() {
		assertEquals("Number of Soliders and weapons are not matching",
				kattappaBattleTest.isReadyForBattle(2, new Integer[] { 11, 12, 13, 14 }));
		assertEquals("Invalid input", kattappaBattleTest.isReadyForBattle(4, null));
	}
}