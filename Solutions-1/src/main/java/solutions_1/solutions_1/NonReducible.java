package solutions_1.solutions_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class NonReducible.
 */

public class NonReducible {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new NonReducible
	 */
	public NonReducible() {
		logger = Logger.getLogger(NonReducible.class.getSimpleName());
	}

	/**
	 * Trims the input string as much as possible.
	 *
	 * @param String
	 *            the input string
	 * @return The object ChopCount containing the trimmed string and number of
	 *         operations
	 */
	public ChopCount getChopCount(String input) {
		ChopCount chopCount = new ChopCount();
		try {
			int totalChops = 0;
			for (int i = 0; i < input.length(); i++) {
				if (i == 0) {
					continue;
				}
				if (input.charAt(i) == input.charAt(i - 1)) {
					input = input.substring(0, i - 1) + input.substring(i + 1, input.length());
					i--;
					totalChops++;
				}
			}
			chopCount.setNonReducableStr(input);
			chopCount.setNumberOfChops(totalChops);
		} catch (Exception e) {
			logger.log(Level.SEVERE, " NonReducible::getChopCount()");
			chopCount.setNumberOfChops(0);
			chopCount.setNonReducableStr("");
		} finally {
			return chopCount;
		}
	}
}

/**
 * The Class ChopCount.
 */
class ChopCount {

	private int numberOfChops;
	private String nonReducableStr;

	public ChopCount() {

	}

	public ChopCount(int numOfChops, String nonRedStr) {
		this.numberOfChops = numOfChops;
		this.nonReducableStr = nonRedStr;
	}

	/**
	 * Getter and setters
	 */
	public int getNumberOfChops() {
		return numberOfChops;
	}

	public void setNumberOfChops(int numberOfChops) {
		this.numberOfChops = numberOfChops;
	}

	public String getNonReducableStr() {
		return nonReducableStr;
	}

	public void setNonReducableStr(String nonReducableStr) {
		this.nonReducableStr = nonReducableStr;
	}

	/**
	 * Overriding equals method
	 */
	public boolean equals(Object o) {
		ChopCount cc = (ChopCount) o;
		if (cc.getNumberOfChops() == this.getNumberOfChops()
				&& cc.getNonReducableStr().equals(this.getNonReducableStr())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Overriding toString method
	 */
	public String toString() {
		return "Number of operations: '" + this.numberOfChops + "', Non-reducible String: '" + this.nonReducableStr
				+ "'";
	}

}
