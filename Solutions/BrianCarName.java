package com.core.programming;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class BrianCarName
 *
 */
public class BrianCarName {
	
	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new BrianCarName.
	 */
	public BrianCarName() {
		logger = Logger.getLogger(BrianCarName.class.getName());
	}
	
	/**
	 * Checks if given car name is liked by Brian
	 * 
	 * @param carName the given car name
	 * @return the string
	 */
	public String checkCarName(String carName) {
		if (carName != null  && !carName.isEmpty() && !carName.trim().isEmpty()) {
			logger.log(Level.INFO, "Input String/Car Name : " + carName);
			TreeMap<Character,Integer> charOccurrenceMap = populateMap(carName);
			if (charOccurrenceMap.size() == 3) {
				return validateCarName(charOccurrenceMap);
			} else {
				logger.log(Level.INFO, carName + " has " + charOccurrenceMap.size() + " distinct alphabet/s, & is not equal to three !");
				logger.log(Level.INFO, carName + " string is not liked by Brian");
				return "Not OK";
			}
		} else {
			logger.log(Level.SEVERE,"Input "+ carName + " is NULL/Empty & cannot be validated if Brian likes the input car name!");
			return "Error";
		}
	}

	/**
	 * Validates car name which has three distinct characters, to check whether each occurrence of character is same
	 * 
	 * @param charOccurrenceMap
	 * @return the string
	 */
	private String validateCarName(TreeMap<Character,Integer> charOccurrenceMap) {
		int firstCharOccurance = charOccurrenceMap.firstEntry().getValue();
		for (Map.Entry<Character, Integer> entry : charOccurrenceMap.entrySet()) {
			int val = entry.getValue();
			if (firstCharOccurance == val) {
				continue;
			} else {
				logger.log(Level.INFO, "'"+entry.getKey()+"'" +" occurred "+val+" times & is not matching previous character occurrences");
				logger.log(Level.INFO, "Input car name is not liked by Brian!");
				return "Not OK";
			}
		}
		logger.log(Level.INFO, "Input car name is liked by Brian");
		return "OK";
	}

	/**
	 * Populates Map for each character of the input string
	 * 
	 * @param carName
	 * @return populated tree map
	 */
	private TreeMap<Character,Integer> populateMap(String carName) {
		TreeMap<Character,Integer> charOccurrenceMap = new TreeMap<Character,Integer>();
		char[] inputCharArr = carName.toCharArray();
		for (int i = 0; i < inputCharArr.length; i++) {
			if (charOccurrenceMap.containsKey(inputCharArr[i])) {
				charOccurrenceMap.put(inputCharArr[i], 1 + charOccurrenceMap.get(inputCharArr[i]));
			} else {
				charOccurrenceMap.put(inputCharArr[i], 1);
			}
		}
		return charOccurrenceMap;
	}
}
