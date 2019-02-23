package com.core.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class AlicePrimeString.
 */
public class AlicePrimeString {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new AlicePrimeString.
	 */
	public AlicePrimeString() {
		logger = Logger.getLogger(AlicePrimeString.class.getName());
	}

	/**
	 * Checks if a given string is prime string
	 * 
	 * @param input the given string
	 * @return the String
	 */
	public String checkPrimeString(String input) {
		if(input != null && !input.isEmpty() && !input.trim().isEmpty()) {
			logger.log(Level.INFO, "Input String : " + input);
			Map<Character, Integer> charFreqMap = populateMap(input);
			int uniqueChars = charFreqMap.size();
			boolean isUniqueCharPrime = isPrime(uniqueChars);
			if (isUniqueCharPrime) {
				return validateStringForPrimeNoOfUniqueChar(input, charFreqMap, uniqueChars);
			} else {
				logger.log(Level.INFO, input + " has " + uniqueChars + " distinct alphabet/s, & is not a prime number !");
				logger.log(Level.INFO, input + " is not a Prime-String");
				return "No";
			}
		}
		else {
			logger.log(Level.SEVERE,"Input "+ input + " is NULL/Empty & cannot be validated for Prime-String !");
			return "Error";
		}
		
	}

	/**
	 * Validates if a string which has prime distinct alphabets, has occurrences of each alphabet as prime
	 * 
	 * @param input the given string
	 * @param map stores occurrences of each character in input string
	 * @param uniqueChars
	 * @return the string
	 */
	private String validateStringForPrimeNoOfUniqueChar(String input, Map<Character, Integer> map, int uniqueChars) {
		logger.log(Level.INFO, input + " has " + uniqueChars + " distinct alphabets, & is a prime number");
		boolean isOccurrencePrime = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			isOccurrencePrime = isPrime(entry.getValue());
			if (isOccurrencePrime) {
				logger.log(Level.INFO," occurrences of '" + entry.getKey() + "' is " + entry.getValue() 
				+ " & is a prime number");
				continue;
			} else {
				logger.log(Level.INFO, " occurrences of '" + entry.getKey() + "' is " + entry.getValue() 
				+ " & is not a prime number !");
				break;
			}
		}
		if (isOccurrencePrime) {
			logger.log(Level.INFO, input + " is a Prime-String");
			return "Yes";
		} else {
			logger.log(Level.INFO, input + " is not a Prime-String");
			return "No";
		}
	}

	/**
	 * Populates Map for each character of the input string
	 * 
	 * @param input the given string
	 * @return populated map
	 */
	private Map<Character, Integer> populateMap(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] inputCharArr = input.toCharArray();
		for (int i = 0; i < inputCharArr.length; i++) {
			if (map.containsKey(inputCharArr[i])) {
				map.put(inputCharArr[i], 1 + map.get(inputCharArr[i]));
			} else {
				map.put(inputCharArr[i], 1);
			}
		}
		return map;
	}

	/**
	 * Checks if a number is prime
	 * 
	 * @param number the number
	 * @return true, if prime
	 */
	private boolean isPrime(int number) {
		boolean flag = false;
		if (number <= 1) {
			return flag;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return flag;
			}
		}
		flag = true;
		return flag;
	}
}
