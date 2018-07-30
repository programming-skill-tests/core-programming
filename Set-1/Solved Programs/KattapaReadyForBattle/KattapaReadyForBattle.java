package com.problems;

import java.util.logging.Logger;


/**
 * The class  KattapaReadyForBattle
 *
 */
public class KattapaReadyForBattle {

	/** The logger. */
	static Logger logger = Logger.getLogger(KattapaReadyForBattle.class.getName());

	/**
	 * Kattapa is Ready for Battle
	 * 
	 * @param n 
	 * @param soldierWeapons
	 *            
	 * @return READY FOR BATTLE or NOT READY
	 */
	public static String isReadyForBattle(int n, int[] soldierWeapons) {

		int evenWeapons = 0, oddWeapons = 0;

		for (int i = 0; i < n; i++) {

			if (soldierWeapons[i] % 2 == 0) {

				evenWeapons++;

			} else {

				oddWeapons++;

			}
		}
		if (evenWeapons > oddWeapons) {

			logger.info("READY FOR BATTLE");
			return "READY FOR BATTLE";

		} else {

			logger.info("NOT READY");
			return "NOT READY";

		}

	}
}
