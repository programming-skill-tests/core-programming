import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class SumOfPalindromicNumbersTest.
 */
public class SumOfPalindromicNumbersTest {

	/** The test sum of palindromic number. */
	SumOfPalindromicNumbers testSumOfPalindromicNumber;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		testSumOfPalindromicNumber = new SumOfPalindromicNumbers();
	}

	@After
	public void tearDown() {
		testSumOfPalindromicNumber = null;
	}

	/**
	 * Test get value positive.
	 */
	@Test
	public void testGetValuePositive() {
		Assert.assertEquals(272, testSumOfPalindromicNumber.getValue(123, 150));
		Assert.assertEquals(111, testSumOfPalindromicNumber.getValue(110, 112));
		Assert.assertEquals(540, testSumOfPalindromicNumber.getValue(1, 100));
		
		Assert.assertEquals(0, testSumOfPalindromicNumber.getValue(-10, 10));
		Assert.assertEquals(11, testSumOfPalindromicNumber.getValue(-10, 11));
		
		Assert.assertEquals(11, testSumOfPalindromicNumber.getValue(11, 11));
		Assert.assertEquals(0, testSumOfPalindromicNumber.getValue(100, 100));
	}

	/**
	 * Test get value negative.
	 */
	@Test
	public void testGetValueNegative() {
		Assert.assertEquals(0, testSumOfPalindromicNumber.getValue(1000, 100));
	}

	/**
	 * Test get value verify logs.
	 */
	@Test
	public void testGetValueVerifyLogs() {
		Assert.assertEquals(272, testSumOfPalindromicNumber.getValue(123, 150));
	}
}
