package com.shishonok.task10;

/**
 * Class contain recursion methods for solve task10.
 * 
 * @version 1 21.06.2018
 * @author Alexander Shishonok
 */
public class RecursiveAlgoritm {
    
    static final int FIRST_FIB_INDEX = 1;
    static final int FIRST_FIB_VALUE = 0;
    static final int SECOND_FIB_INDEX = 2;
    static final int SECOND_FIB_VALUE = 1;

    public static final int DEC_BASE = 10;

    /**
     * Find sum of digits of integer number.
     * 
     * @param n
     *            integer number
     * @return sum of digits
     */
    public static int findSumDigit(int n) {
	n = n > 0 ? n : -n;
	return findSumDigitRec(n);
    }

    private static int findSumDigitRec(int n) {
	if (n == 0) {
	    return 0;
	}
	return (n % DEC_BASE) + findSumDigitRec(n / DEC_BASE);
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
	return involveNumberRec(num, exp);
    }

    private static double involveNumberRec(double num, int exp) {
	if (exp == 0) {
	    return 1;
	}
	return num * involveNumberRec(num, exp - 1);
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
	return equalsRec(num, s);
    }

    private static boolean equalsRec(int num, int s) {
	if (num == 0) {
	    if (s == 0) {
		return true;
	    } else {
		return false;
	    }
	} else {
	    return equalsRec(num / DEC_BASE, s - num % DEC_BASE);
	}
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
	return findFibonacciRec(num);
    }

    private static long findFibonacciRec(int num) {
	if (num == FIRST_FIB_INDEX) {
	    return FIRST_FIB_VALUE; 	
	}
	if (num == SECOND_FIB_INDEX) {
	    return SECOND_FIB_VALUE; 
	}
	return findFibonacciRec(num - 1) + findFibonacciRec(num - 2);
    }
}
