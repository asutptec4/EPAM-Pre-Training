package com.shishonok.task02.ex1;

/**
 * This class define static method to test different rules for three number
 * @author Alexander Shishonok
 */
public class ThreeNumberChecker {
	
	/**
	 * The method checks whether the numbers are equal 
	 * @param a first number
	 * @param b second number
	 * @param c third number
	 * @return true if number are equal 
	 */
	public static boolean isEqualNumber (double a, double b, double c) {
		return (a == b) && (c == b);
	}
}

class Test {
	public static void main(String[] args) {
		double a = 7.5;
		double b = 7.5;
		double c = 7.5;
		boolean isEqual = ThreeNumberChecker.isEqualNumber(a, b, c);
		System.out.println("a = " + a + " b = " + b + " c = " + c + (isEqual ? " are " : " are not ") + "equal");
		// Change number c
		c = 5.6;
		isEqual = ThreeNumberChecker.isEqualNumber(a, b, c);
		System.out.println("a = " + a + " b = " + b + " c = " + c + (isEqual ? " are " : " are not ") + "equal");
	}
}