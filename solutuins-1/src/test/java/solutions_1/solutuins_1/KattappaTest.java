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
public class KattappaTest {

	/**
	 * Instantiating KattappaTest object
	 */

	KattapaReadyForBattle instance = new KattapaReadyForBattle();
	
	/**
	 * Test case parameters
	 */
	
	@Parameter(0)
	public int inputArmySize;
	@Parameter(1)
	public Integer[] soldierWeapons;
	@Parameter(2)
	public String expected;

	/**
	 *  creates the test data
	 * @return array list of data for each test case
	 */
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 4,new Integer[]{11, 12, 13, 14},"NOT READY" }, { 3,new Integer[]{2, 3, 4},"READY FOR BATTLE" } };
		return Arrays.asList(data);
	}

	/**
	 * testing method tests the isReadyOrNot method.
	 */

	@Test
	public void testing() { 
		String result = instance.isReadyOrNot( inputArmySize, soldierWeapons );
		//String expected = "Yes";
		System.out.println("Expected : " + expected + " | Actual : " + result);
		assertEquals( "Result : " ,expected, result );
	}
}