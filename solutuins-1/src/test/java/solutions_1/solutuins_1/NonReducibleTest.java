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
public class NonReducibleTest {

	/**
	 * Instantiating NonReducibleTest object
	 */

	NonReducible instance = new NonReducible();
	
	/**
	 * Test case parameters
	 */
	
	@Parameter(0)
	public String inputString;
	@Parameter(1)
	public ChopCount expected;

	/**
	 *  creates the test data
	 * @return array list of data for each test case
	 */
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { "aaabbccdddd",new ChopCount(5, "a") }, { "aaabccddd",new ChopCount(3, "abd") } };
		return Arrays.asList(data);
	}

	/**
	 * testing method tests the getChopCount method.
	 */

	@Test
	public void testing() { 
		ChopCount result = instance.getChopCount( inputString );
		//String expected = "Yes";
		System.out.println("Expected : " + expected + " | Actual : " + result);
		assertEquals( "Result : " ,expected, result );
	}
}