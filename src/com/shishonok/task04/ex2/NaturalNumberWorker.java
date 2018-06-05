package com.shishonok.task04.ex2;

/**
 * Class provide various manipulation with integer number .
 *
 * @version 1 31.05.2018
 * @author Alexander Shishonok
 */
public class NaturalNumberWorker {
	
	public static final int DEC_BASE = 10;
	public static final int FIRST_PRIME = 2;
	
	/**
	 * Find the largest digit.
	 * @param n a natural number
	 * @return the largest digit
	 */
	public static int findLargestDigit(int n) {
		int result = 0;
		n = n > 0 ? n : -n;
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
		int result = 0;
		n = n > 0 ? n : -n;
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
		n = n > 0 ? n : -n;
		return (n ^ reverse(n)) == 0 ? true : false;
	}
	
	/**
	 * Check whether a natural number is prime.
	 * @param n a natural number
	 * @return true if natural number is prime
	 */
	public static boolean isPrime(int n) {
		n = n > 0 ? n : -n;
		if (n % 2 == 0 && n != FIRST_PRIME || n < FIRST_PRIME) {
			return false;
		}
		for (int i = FIRST_PRIME + 1; i * i <= n; i += 2) {
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
		n = n > 0 ? n : -n;
		for (int i = FIRST_PRIME; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
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
		a = a > 0 ? a : -a;
		b = b > 0 ? b : -b;
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
		a = a > 0 ? a : -a;
		b = b > 0 ? b : -b;
		return a * b / findGCD(a, b);
	}
	
	/**
	 * Find the number of different digits for a given natural number.
	 * @param n a natural number
	 * @return the number of different digits
	 */
	public static int findNumDifDigit(int n) {
		int result = 0;
		n = n > 0 ? n : -n;
		for (int i = 0; i < DEC_BASE; i++) {
			int tempn = n;
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