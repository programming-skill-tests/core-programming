package com.core.programming;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *The class Shopping
 *
 */
public class Shopping {

	/** The logger. */
	private Logger logger;
	
	/**
	 * Instantiates a new Shopping instance.
	 */
	public Shopping() {
		logger = Logger.getLogger(Shopping.class.getName());
	}
	
	/**
	 * Finds the amount spent by Roy
	 * 
	 * @param products list of products
	 * @return total amount spend by Roy
	 */
	public int findAmountSpentByRoy(int[] products) {
		int amountSpentByRoy = 0;
		if(products != null && products.length != 0) {
			for (int i = 0; i < products.length; i++) {
				int minPrimeFactor = findMinPrimeFactor(products[i]);
				if (minPrimeFactor != -1) {
					amountSpentByRoy += products[i] - minPrimeFactor;
					logger.log(Level.INFO, "Amount spent by Roy for product of MRP " +products[i]+" : " + amountSpentByRoy);
				}
				else {
					//Prime factor doesn't exist for 1 or 0
					amountSpentByRoy += products[i];
					logger.log(Level.INFO, "Amount spent by Roy is same as product MRP & is :" +products[i]);
				}
			}
		}
		else {
			logger.log(Level.SEVERE,"Products list is NULL/Empty !");
		}
		logger.log(Level.INFO, "Total amount spent by Roy : "+ amountSpentByRoy);
		return amountSpentByRoy;
	}

	/**
	 * Finds the minimum prime factor
	 * 
	 * @param number the input number
	 * @return the minimum prime factor
	 */
	private int findMinPrimeFactor(int number) {
		int result = -1;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				number /= i;
				result = i;
				return result;
			}
		}
		if (number > 1) {
			result = number;
		}
		logger.log(Level.INFO, "Minimum prime factor product MRP :" +number+" is :"+result);
		return result;
	}
	public static void main(String[] args) {
		int[] products = {0 ,1, 3, 4}; 
		System.out.println(new Shopping().findAmountSpentByRoy(products));
	}
}
