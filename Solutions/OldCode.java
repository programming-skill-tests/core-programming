package com.core.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Old Code
 */
public class OldCode {
	
	/** The logger. */
	private Logger logger;

	/**
	 * Instantiates a new OldCode instance.
	 */
	public OldCode() {
		logger = Logger.getLogger(OldCode.class.getName());
	}
	
	/**
	 * Updates the old code to new code
	 * 
	 * @param inputList
	 * @return
	 */
	public List<String> updateCode(List<String> inputList) {
		if(inputList != null && !inputList.isEmpty()) {
			List<String> updatedList = new ArrayList<String>(inputList.size());
			for (int i = 0; i < inputList.size(); i++) {
				String oldCode = inputList.get(i);
				int indexOfComment = oldCode.indexOf("//");
				if(indexOfComment != -1) {
					String codeWithoutComments = oldCode.substring(0, indexOfComment);
					logger.log(Level.INFO, "Input string without comments : " + codeWithoutComments);
					String comments = oldCode.substring(indexOfComment);
					codeWithoutComments = codeWithoutComments.replaceAll("->", ".");
					String updatedCode = codeWithoutComments+comments;
					updatedList.add(updatedCode);
				}
			}
			return updatedList;
		}
		else {
			logger.log(Level.SEVERE, " Input list is NULL/Empty !");
			return new ArrayList<String>();
		}
	}
}
