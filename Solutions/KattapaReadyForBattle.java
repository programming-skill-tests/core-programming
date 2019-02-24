package com.core.programming;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class KattapaReadyForBattle
 */
public class KattapaReadyForBattle {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new KattapaReadyForBattle instance.
	 */
	public KattapaReadyForBattle() {
		logger = Logger.getLogger(KattapaReadyForBattle.class.getName());
	}

	/**
	 * Checks if army is ready
	 * 
	 * @param numOfSoldiers the number of soldiers 
	 * @param weapons the array of weapons
	 * @return the string/result
	 */
	public String checkIsArmyReady(int numOfSoldiers, int[] weapons) {
		if(numOfSoldiers == 0 && weapons.length == 0) {
			logger.log(Level.SEVERE, "Since no soldiers are present, if army is ready for battle can't be validated");
			return "Empty input";
		}
		else if(numOfSoldiers != weapons.length){
			logger.log(Level.SEVERE, "Mismatch in Soldiers & their corresponding weapons, can't be validated");
			return "Invalid input";
		}
		else {
			
			logger.log(Level.INFO, " Number of Soldiers " + numOfSoldiers);
			int evenWeaponsCount = 0;
			int oddWeaponsCount = 0;
			for (int i = 0; i < weapons.length; i++) {
				if (weapons[i] % 2 == 0) {
					evenWeaponsCount++;
				} else {
					oddWeaponsCount++;
				}
			}
			logger.log(Level.INFO, " Number of Soldiers with odd weapons is " + oddWeaponsCount
					+" & with even weapons is "+evenWeaponsCount);
			if (evenWeaponsCount > oddWeaponsCount) {
				logger.log(Level.INFO, "Soldiers with even weapons are more than odd weapon");
				return "READY FOR BATTLE";
			} else {
				logger.log(Level.INFO, "Soldiers with odd weapons are more than even weapon");
				return "NOT READY";
			}
		}
		
	}
}
