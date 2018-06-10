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
public class ShoppingTest {

	/**
	 * Instantiating Shopping object
	 */

	Shopping instance = new Shopping();
	
	/**
	 * Test case parameters
	 */
	
	@Parameter(0)
	public Integer[] shoppingCart;
	@Parameter(1)
	public int expected;

	/**
	 *  creates the test data
	 * @return array list of data for each test case
	 */
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { new Integer[]{5,10},8 }, { new Integer[]{24,0},22 }, { new Integer[]{},0 } };
		return Arrays.asList(data);
	}

	/**
	 * testing method tests the getRoyPayment method.
	 */

	@Test
	public void testing() { 
		int result = instance.getRoyPayment( shoppingCart );
		//String expected = "Yes";
		System.out.println("Expected : " + expected + " | Actual : " + result);
		assertEquals( "Result : " ,expected, result );
	}
}