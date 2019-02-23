package com.core.programming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class JohnGem
 */
public class JohnGem {

	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new JohnGem.
	 */
	public JohnGem() {
		logger = Logger.getLogger(JohnGem.class.getName());
	}
	
	
	/**
	 * Counts the Gem elements
	 * 
	 * @param rocks the list of Strings
	 * @return count of gem elements
	 */
	public int countGemElements(List<String> rocks) {
		if(rocks!=null && !rocks.isEmpty()) {
			Set<Character> firstUniqueStone = stringToSet(rocks.get(0));
			for (int i = 1; i < rocks.size(); i++) {
				firstUniqueStone.retainAll(stringToSet(rocks.get(i)));
			}
			logger.log(Level.INFO, "Number of gem-elements in those rocks. : " + String.valueOf(firstUniqueStone.size()));
			return firstUniqueStone.size();
		}
		else {
			logger.log(Level.SEVERE, "List of rocks-strings is null/empty, gem-elements couldn't be found.");
			return 0;
		}
	}

	/**
	 * Converts a String to Set
	 * 
	 * @param rock the string
	 * @return converted set from string
	 */
	private static Set<Character> stringToSet(String rock) {
		Set<Character> set = new HashSet<Character>(26);
		for (char character : rock.toCharArray()) {
			set.add(Character.valueOf(character));
		}
		return set;
	}
	
}
