package com.core.programming;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class OldCodeTest.
 */
public class OldCodeTest {

	/** The test gem. */
	OldCode testOldCode;

	/**
	 * Set up - Instantiate OldCode
	 */
	@Before
	public void setUp() {
		testOldCode = new OldCode();
	}

	@After
	public void tearDown() {
		testOldCode = null;
	}

	/**
	 * Test update code positive.
	 */
	@Test
	public void testUpdateCodePositive() {
		List<String> codes = new ArrayList<String>();
		codes.add("int t; //variable t, t->a=0;  //t->a does something, return 0;");
		codes.add("int t->a; //variable t, t->a=0;");
		codes.add("int i->j, k->l;  //variable i->j, k->l");
		
		List<String> expectedUpdatedCodes = new ArrayList<String>();
		expectedUpdatedCodes.add("int t; //variable t, t->a=0;  //t->a does something, return 0;");
		expectedUpdatedCodes.add("int t.a; //variable t, t->a=0;");
		expectedUpdatedCodes.add("int i.j, k.l;  //variable i->j, k->l");

		Assert.assertEquals(expectedUpdatedCodes, testOldCode.updateCode(codes));
	}

	/**
	 * Test update code negative.
	 */
	@Test
	public void testGetValueNegative() {
		Assert.assertEquals(new ArrayList<String>(), testOldCode.updateCode(null));
		Assert.assertEquals(new ArrayList<String>(), testOldCode.updateCode(new ArrayList<String>()));
	}

	/**
	 * Test update code verify logs.
	 */
	@Test
	public void testGetValueVerifyLogs() {
		List<String> codes = new ArrayList<String>();
		codes.add("int x->a; //variable x, x->a=0;");
		
		List<String> expectedUpdatedCodes = new ArrayList<String>();
		expectedUpdatedCodes.add("int x.a; //variable x, x->a=0;");
		Assert.assertEquals(expectedUpdatedCodes, testOldCode.updateCode(codes));
	}
}