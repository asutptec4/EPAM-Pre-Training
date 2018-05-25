package com.shishonok.task02.ex7;

/**
 * Class for swapping two integer without additional variable 
 * @author Alexander Shishonok
 */
public class TwoIntegerSwapClass {
	
	/**
	 * Method swap two integer
	 * @param a first integer
	 * @param b secon integer
	 */
	public static void swap(int a, int b) {
		System.out.printf("Before a = %d, b = %d\n", a, b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("After a = %d, b = %d\n", a, b);
	}
	
}

class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		TwoIntegerSwapClass.swap(a, b);
	}
}