package com.solution.firstlevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class PrimeString.
 */
public class PrimeString {
	
	/** The logger. */
	private Logger logger;
	
	/**
	 * Instantiates a new PrimeString
	 */
	public PrimeString() {
		logger = Logger.getLogger(PrimeString.class.getSimpleName());
	}
	
	/**
	 * Checks if the number of distinct alphabets and the number of occurrences of each alphabets is prime.
	 *
	 * @param Map<Character, Integer> the map that is built from the input string
	 * @return true, if is Prime String
	 */
	
	protected boolean isPrimeStringLogic(Map<Character, Integer> map) {
		int mapSize = map.size();
		if(!isPrime(mapSize)) {
			return false;
		}
		else {
			for(Entry<Character,Integer> entry: map.entrySet()) {
				if(!isPrime(entry.getValue())) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Checks if is prime.
	 *
	 * @param Integer the number
	 * @return true, if is prime
	 */
	
	protected boolean isPrime(Integer number) {
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
	 * Builds a HashMap from each character from the inputString.
	 *
	 * @param String the input string
	 * @return the map
	 */
	
	protected Map<Character, Integer> buildMapFromString(String inputString) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int length = inputString.length();
		Integer count;
		for(int i=0;i<length;i++) {
			count = 0;
			Character tempChar = inputString.charAt(i);
			if(map.containsKey(tempChar)) {
				count = map.get(tempChar);
				map.put(tempChar, ++count);
			}
			else {
				map.put(tempChar, ++count);
			}
		}
		return map;
	}
	
	/**
	 * Checks if is Prime String.
	 *
	 * @param String the input string
	 * @return true, if is Prime String
	 */
	
	protected String isPrimeString(String input) {
		try {
			Map<Character, Integer> map = buildMapFromString(input);
			boolean primeString = isPrimeStringLogic(map);
			if(primeString) {
				return "Yes";
			} else {
				return "No";
			}
		} catch(Exception e) {
			logger.log(Level.SEVERE, " PrimeString::isPrimeString()");
		}
		return "error";
	}
	
}
