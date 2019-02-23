package com.core.programming;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class KattapaReadyForBattleTest.
 */
public class KattapaReadyForBattleTest {

	/** The test ready for battle. */
	KattapaReadyForBattle testKattapaReadyForBattle;

	/**
	 * Setup - Instantiate KattapaReadyForBattle
	 */
	@Before
	public void setUp() {
		testKattapaReadyForBattle = new KattapaReadyForBattle();

	}

	@After
	public void tearDown() {
		testKattapaReadyForBattle = null;

	}

	/**
	 * Test is army ready for battle positive.
	 */
	@Test
	public void testCarNamePositive() {
		Assert.assertEquals("NOT READY", testKattapaReadyForBattle.checkIsArmyReady(4, new int[] { 11, 12, 13, 14 }));
		Assert.assertEquals("READY FOR BATTLE", testKattapaReadyForBattle.checkIsArmyReady(3, new int[] { 2, 3, 4 }));
	}

	/**
	 * Test is army ready for battle negative.
	 */
	@Test
	public void testCarNameNegative() {
		Assert.assertEquals("Empty input", testKattapaReadyForBattle.checkIsArmyReady(0, new int[] {}));
		Assert.assertEquals("Invalid input", testKattapaReadyForBattle.checkIsArmyReady(3, new int[] {}));
	}

	/**
	 * Test is army ready for battle verify logs.
	 */
	@Test
	public void testCarNameVerifyLogs() {
		Assert.assertEquals("READY FOR BATTLE", testKattapaReadyForBattle.checkIsArmyReady(3, new int[] { 8, 3, 12 }));
	}
}