package solutions_1.solutuins_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * The Class PrimeStringTest.
 */


@RunWith(Parameterized.class)
public class PrimeStringTest {

	/**
	 * Instantiating PrimeString object
	 */

	PrimeString instance = new PrimeString();
	
	/**
	 * Test case parameters
	 */
	
	@Parameter(0)
	public String input;
	@Parameter(1)
	public String expected;


	/**
	 *  creates the test data
	 * @return array list of data for each test case
	 */
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { "aabbb","Yes" }, { "abcde","No" }, {null,"error"} };
		return Arrays.asList(data);
	}

	/**
	 * testing method tests the isPrimeString method.
	 */

	@Test
	public void testing() { 
		String result = instance.isPrimeString( input );
		//String expected = "Yes";
		System.out.println("Expected : " + expected + " | Actual : " + result);
		assertEquals( "Result : " ,expected, result );
	}
}