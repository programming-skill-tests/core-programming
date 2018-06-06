import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class SumOfPalindromicNumbers.
 */
public class SumOfPalindromicNumbers {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new sum of palindromic numbers.
	 */
	public SumOfPalindromicNumbers() {
		logger = Logger.getLogger(SumOfPalindromicNumbers.class.getSimpleName());
	}

	/**
	 * Gets the value.
	 *
	 * @param startingRange the starting range
	 * @param endingRange the ending range
	 * @return the value
	 */
	public long getValue(int startingRange, int endingRange) {
		long sum = 0;
		logger.log(Level.INFO, "Starting Range : " + String.valueOf(startingRange) + " - Ending Range : "
				+ String.valueOf(endingRange));
		
		if (startingRange <= endingRange) {
			for (int num = startingRange; num <= endingRange; num++) {
				if (isPalindrome(num)) {
					sum += num;
					logger.log(Level.INFO, String.valueOf(num) + " is a Palindrome number");
				}
			}
		}
		else {
			logger.log(Level.SEVERE, "Starting Range cannot be greater than Ending Range");
		}
		
		logger.log(Level.INFO, "Sum of all the Palindrome number : " + String.valueOf(sum));
		return sum;
	}

	/**
	 * Checks if is palindrome.
	 *
	 * @param number the number
	 * @return true, if is palindrome
	 */
	public boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (number == reverse) {
			return true;
		}
		return false;
	}

}
