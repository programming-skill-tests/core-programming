package solutions_1.solutuins_1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class Shopping.
 */

public class Shopping {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new Shopping
	 */
	public Shopping() {
		logger = Logger.getLogger(Shopping.class.getSimpleName());
	}

	/**
	 * Checks if is prime.
	 *
	 * @param Integer the number
	 * @return true, if is prime
	 */
	
	private boolean isPrime(Integer number) {
		if (number < 2) { 
			return false; 
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Builds a list of potential prime numbers which divides the actual number.
	 *
	 * @param String the input string
	 * @return the list containing prime number up to square root of the number
	 */

	private List<Integer> getPotentialPrimes(Integer number) {
		List<Integer> potentialPrimes = new ArrayList<Integer>();
		if(number < 2) {
			return potentialPrimes;
		}
		if(isPrime(number)) {
			potentialPrimes.add(number);
		}
		else {
			for(int i=2;i<Math.sqrt(number);i++) {
				if(isPrime(i)) {
					potentialPrimes.add(i);
				}
			}
		}
		return potentialPrimes;
	}

	/**
	 * Calculates the amount Roy has to pay.
	 *
	 * @param Integer[] the prices of items in the shopping cart
	 * @return int the amount that Roy has to pay.
	 */

	public int getRoyPayment(Integer[] shoppingCart) {
		int royPayment = 0;
		try {
			int alicePayment = 0;
			int total = 0;
			for(Integer priceOfItem : shoppingCart) {
				total += priceOfItem;
				List<Integer> primesList = getPotentialPrimes(priceOfItem);
				if(primesList.size() == 0) {
					royPayment += priceOfItem;
				}
				for(Integer prime : primesList) {
					if(priceOfItem % prime == 0) {
						alicePayment += prime;
						break;
					}
				}
			}
			royPayment = total - alicePayment;
		} catch (Exception e) {
			logger.log(Level.SEVERE, " Shopping::getRoyPayment()");
		}
		return royPayment;
	}

}
