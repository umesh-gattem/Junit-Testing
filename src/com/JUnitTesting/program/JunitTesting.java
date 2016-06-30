package com.JUnitTesting.program;

/**
 * A class JunitTesting with two methods countofA which count the number of
 * letter A/a repeats.. and the method areaofRectangle which calculate the
 * areaofRectangle. These two Junit Test cases are implemented to find whether
 * test case is true or false
 * 
 * @author umesh
 * 
 * @since 30-06-2016
 * 
 */

public class JunitTesting {

	public int countofA(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}

	public int areaofRectangle(int length, int breadth) {
		int areaofRecatngle = length * breadth;
		return areaofRecatngle;
	}
}
