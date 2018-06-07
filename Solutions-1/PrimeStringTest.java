package com.solution.firstlevel;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * The Class PrimeStringTest.
 */

public class PrimeStringTest {
	
	/**
	 * Instantiating PrimeString object
	 */
	
	PrimeString instance = new PrimeString();
	
	/**
	 * Before testing the isPrimeString method, we need to make sure the supporting methods are working as expected.
	 * preRequisites method tests isPrime, buildMapFromString and isPrimeStringLogic methods.
	 */
	
	@Before
	public void preRequisites() {
		boolean result = instance.isPrime(7);
		boolean expected = true;
		assertEquals( expected, result );
		
		Map<Character, Integer> resultMap = instance.buildMapFromString( "aabbb" );
		Map<Character, Integer> expectedMap = new HashMap<Character, Integer>();
		expectedMap.put('a', 2);
		expectedMap.put('b', 3);
		assertEquals( expectedMap, resultMap );
		
		boolean logicResult = instance.isPrimeStringLogic(resultMap);
		boolean logicExpected = true;
		assertEquals( logicExpected, logicResult);
	}

	/**
	 * testing method tests the isPrimeString method.
	 */
	
    @Test
    public void testing() { 
       String result = instance.isPrimeString( "aabbb" );
       String expected = "Yes";
       assertEquals( expected, result );
    }
}