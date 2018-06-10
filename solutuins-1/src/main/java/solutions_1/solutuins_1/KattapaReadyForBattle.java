package solutions_1.solutuins_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class KattapaReadyForBattle.
 */

public class KattapaReadyForBattle {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new KattapaReadyForBattle
	 */
	public KattapaReadyForBattle() {
		logger = Logger.getLogger(KattapaReadyForBattle.class.getSimpleName());
	}

	/**
	 * Checks if the even weapon solders are greater than odd weapon soldiers.
	 *
	 * @param int size of the army, Integer[] number of weapons each soldier is carrying
	 * @return String ready or not ready for battle based on Kattapa's luck logic
	 */

	public String isReadyOrNot(int size, Integer[] soldierWeapons) {
		try {
			int evenWeaponsCount = 0;
			int oddWeaponsCount = 0;
			for(int i=0;i<size;i++) {
				if(soldierWeapons[i] % 2 == 0) {
					evenWeaponsCount++;
				}
				else {
					oddWeaponsCount++;
				}
			}
			if(evenWeaponsCount > oddWeaponsCount) {
				return "READY FOR BATTLE";
			}
			else {
				return "NOT READY";
			}
		} catch(Exception e) {
			logger.log(Level.SEVERE, " KattapaReadyForBattle::isReadyOrNot()");
		}
		return "ERROR";
	}
}
