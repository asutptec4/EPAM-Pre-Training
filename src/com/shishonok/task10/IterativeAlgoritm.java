package com.shishonok.task10;

import static com.shishonok.task10.RecursiveAlgoritm.*;
/**
 * Class contain iterative methods for solve task10.
 * 
 * @version 1 21.06.2018
 * @author Alexander Shishonok
 */
public class IterativeAlgoritm {

    /**
     * Find sum of digits of integer number.
     * 
     * @param n
     *            integer number
     * @return sum of digits
     */
    public static int findSumDigit(int n) {
	n = n > 0 ? n : -n;
	return findSumDigitIter(n);
    }

    private static int findSumDigitIter(int n) {
	int result = 0;
	while (n > 0) {
	    result += n % DEC_BASE;
	    n /= DEC_BASE;
	}
	return result;
    }

    /**
     * Involve real number in exponent.
     * 
     * @param num
     *            real number
     * @param exp
     *            exponent
     * @return involved number
     */
    public static double involveNumber(double num, int exp) {
	if (exp < 0) {
	    return 0;
	}
	return involveNumberIter(num, exp);
    }

    private static double involveNumberIter(double num, int exp) {
	double result = 1;
	for (int i = exp; i > 0; i--) {
	    result *= num;
	}
	return result;
    }

    /**
     * Check is sum of digits of integer number equal given integer number.
     * 
     * @param num
     *            integer number
     * @param s
     *            suggested sum of number
     * @return true if sum of digits equal suggested number
     */
    public static boolean equals(int num, int s) {
	if (num < 0 || s < 0) {
	    return false;
	}
	return equalsIter(num, s);
    }

    private static boolean equalsIter(int num, int s) {
	while (num > 0) {
	    s -= num % DEC_BASE;
	    num /= DEC_BASE;
	}
	return s == 0 ? true : false;
    }

    /**
     * Find n number of Fibonacci sequence
     * 
     * @param num
     *            index number of target value
     * @return number of Fibonacci
     */
    public static long findFibonacci(int num) {
	if (num < FIRST_FIB_INDEX) {
	    return -1;
	}
	return findFibonacciIter(num);
    }

    private static long findFibonacciIter(int num) {
	long fib1 = FIRST_FIB_VALUE;
	long fib2 = SECOND_FIB_VALUE;
	if (num == FIRST_FIB_INDEX) {
	    return fib1;
	} else if (num == SECOND_FIB_INDEX) {
	    return fib2;
	} else {
	    for (int i = 3; i <= num; i++) {
		long temp = fib2;
		fib2 += fib1;
		fib1 = temp;
	    }
	    return fib2;
	}
    }

}
