package com.shishonok.task04.ex2;

/**
 * Class provide various manipulation with integer number .
 *
 * @version 1 31.05.2018
 * @author Alexander Shishonok
 */
public class NaturalNumberWorker {
	
	public static final int DEC_BASE = 10;
	
	/**
	 * Find the largest digit.
	 * @param n a natural number
	 * @return the largest digit
	 */
	public static int findLargestDigit(int n) {
		int result = n % DEC_BASE;
		n /= DEC_BASE;
		while (n > 0) {
			if (n % DEC_BASE > result) {
				result = n % DEC_BASE;
			}
			n /= DEC_BASE;
		}
		return result;
	}
	
	/**
	 * Method reverse sequence of digits of a natural number.
	 * @param n a natural number
	 * @return a natural number with reverse sequence of digits
	 */
	public static int reverse(int n) {
		int result = n % DEC_BASE;
		n /= DEC_BASE;
		while (n > 0) {
			result = result * DEC_BASE + n % DEC_BASE;
			n /= DEC_BASE;
		}
		return result;
	}
	
	/**
	 * Check whether a natural number is palindrome.
	 * @param n a natural number
	 * @return true if natural number is palindrome
	 */
	public static boolean checkPalindrome(int n) {
		return (n ^ NaturalNumberWorker.reverse(n)) == 0 ? true : false;
	}
	
	/**
	 * Check whether a natural number is prime.
	 * @param n a natural number
	 * @return true if natural number is prime
	 */
	public static boolean isPrime(int n) {
		if ((n % 2 == 0 && n != 2) || (n == 1) || (n == 0)) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Find all prime divisors of a given natural number.
	 * @param n a natural number
	 * @return string of dividers separate space
	 */
	public static String findPrimeDividers(int n) {
		String result = "";
		for(int i = 2; i <= n; i++) {
			if (n % i == 0 && NaturalNumberWorker.isPrime(i)) {
				result += i + " ";
			}
		}
		return result.equals("") ? "no prime dividers" : result;
	}
	
	/**
	 * Find the greatest common divisor of two natural numbers a and b.
	 * @param a first natural number
	 * @param b second natural number
	 * @return greatest common divisor
	 */
	public static int findGCD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}
	
	/**
	 * Find the least common multiple of two natural numbers a and b
	 * @param a first natural number
	 * @param b second natural number
	 * @return least common multiple
	 */
	public static int findLCM(int a, int b) {
		return a * b / findGCD(a, b);
	}
	
	/**
	 * Find the number of different digits for a given natural number.
	 * @param n a natural number
	 * @return the number of different digits
	 */
	public static int findNumDifDigit(int n) {
		int result = 0;
		int tempn;
		for (int i = 0; i < DEC_BASE; i++) {
			tempn = n;
			while (tempn > 0) {
				if (tempn % DEC_BASE == i) {
					result++;
					break;
				}
				tempn /= DEC_BASE;
			}
		}
		return result;
	}
}

/*
Develop the most effective algorithms and write the code for the solution
the following tasks:
find the largest digit of a natural number;
check whether the given natural number is a palindrome;
determine whether a given natural number is prime;
find all prime divisors of a given natural number;
find the GCD and LCM of two natural numbers a and b.
Find the number of different digits for a given natural number.
*/