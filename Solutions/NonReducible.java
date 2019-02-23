package com.core.programming;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class NonReducible
 */
public class NonReducible {

	/** The logger. */
	private Logger logger;
	private String reducedString;	
	private int operationCount;
	
	/**
	 * Instantiates a new NonReducible instance.
	 */
	public NonReducible() {
		logger = Logger.getLogger(NonReducible.class.getName());
	}
	
	/**
	 * Parameterized constructor
	 * @param operationCount
	 * @param reducedString
	 */
	public NonReducible(int operationCount, String reducedString) {
		this.operationCount = operationCount;
		this.reducedString = reducedString;
	}
	
	/**
	 * Getter for reducedString
	 * @return the String
	 */
	public String getReducedString() {
		return reducedString;
	}

	/**
	 * Setter for reducedString
	 * @param reducedString the string
	 */
	public void setReducedString(String reducedString) {
		this.reducedString = reducedString;
	}

	/**
	 * Getter for operationCount
	 * @return operationCount
	 */
	public int getOperationCount() {
		return operationCount;
	}

	/**
	 * Setter for operationCount
	 * @param operationCount
	 */
	public void setOperationCount(int operationCount) {
		this.operationCount = operationCount;
	}
	
	/**
	 * Gets the NonReducible instance with operation count & reduced string being set
	 * @param input the string
	 * @return the instance of NonReducible
	 */
	public NonReducible getReducedStringWithOperationCount(String input) {
		this.operationCount = 0;
		NonReducible nonReducible = new NonReducible();
		logger.log(Level.INFO, "Input String : " + input);
		if(input != null && !input.trim().isEmpty()) {
			String compressedString = "";
			for (int i = 0; i < input.length()-1;) {
				char[] inputCharArr = input.toCharArray();
				if(inputCharArr[i] == inputCharArr[i+1]) {
					String leftSubString = input.substring(0, i);
					String rightSubString = input.substring(i+2);
					compressedString = leftSubString + rightSubString;
					input = compressedString;
					operationCount ++;
				}
				else {
					i++;
				}
			}
			logger.log(Level.INFO, "Number of operations : " + operationCount);
			logger.log(Level.INFO, "Compressed String : " + compressedString);
			nonReducible.setOperationCount(operationCount);
			nonReducible.setReducedString(compressedString);
		}
		else {
			nonReducible.setOperationCount(0);
			nonReducible.setReducedString("");
			logger.log(Level.SEVERE,"Input "+ input + " is NULL/Empty reducing of string is not possible!");
		}
		return nonReducible;
	}

	/**
	 * Override equals method for comparing instances of this class
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NonReducible) {
			NonReducible instance = (NonReducible) obj;
			return (this.getOperationCount() == instance.getOperationCount() && 
					this.getReducedString().equals(instance.getReducedString())) ;
		}
		else {
			return false;
		}
	}
	
}
