package com.JUnitTesting.program;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class is the test case of JunitTesting which counts the number of
 * letters of a/A present in the given string.
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class StringTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int count = test.countofA("Amadalavalasa");
		assertEquals(7, count);
	}
}