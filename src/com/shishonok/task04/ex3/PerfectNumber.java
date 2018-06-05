package com.shishonok.task04.ex3;

/**
 * Class for working with perfect numbers.
 * 
 * @version		1	30.05.2018
 * @author Alexander Shishonok
 */
public class PerfectNumber {
	
	/**
	 * Check whether the natural number is perfect.
	 * @param n test number
	 * @return	true if number is perfect
	 */
	public static boolean isPerfectNumber(long n) {
		int counter = 0;
		n = n > 0 ? n : -n;
		while (n % 2 == 0) {
			n /= 2;
			counter++;
		}
		return (n == Math.pow(2, counter + 1) - 1) ? true : false;
	}
}
