package com.JUnitTesting.program;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * This class is the test case for JunitTesting class which calculates the area
 * of rectangle given the length and breadth
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 *
 */

public class AreaofRectangle {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int areaofRectangle = test.areaofRectangle(5, 3);
		assertEquals(15, areaofRectangle);
	}

}
