package com.shishonok.task02.ex4_5_6;

/**
 * Class provide various manipulation with integer number 
 * @author Alexander Shishonok
 */
public class ManipulationWithIntegerClass {

	/**
	 * Method verifies that the digits of the four-digit number form an increasing sequence
	 * @param n four-digit integer number
	 * @return true if digit form an increasing sequence
	 */
	public static boolean hasIncreasingDigitSequence (int n) {
		int lastdigit = n % 10;
		n /= 10;
		boolean isIncrease = lastdigit > (n % 10);
		lastdigit = n % 10;
		n /= 10;
		isIncrease &= lastdigit > (n % 10);
		lastdigit = n % 10;
		n /= 10;
		isIncrease &= lastdigit > (n % 10);
		return isIncrease;
	}
	
	/**
	 * Method verifies that the digits of the four-digit number form an decreasing sequence
	 * @param n four-digit integer number
	 * @return true if digit form an decreasing sequence
	 */
	public static boolean hasDecreasingDigitSequence (int n) {
		int lastdigit = n % 10;
		n /= 10;
		boolean isIncrease = lastdigit < (n % 10);
		lastdigit = n % 10;
		n /= 10;
		isIncrease &= lastdigit < (n % 10);
		lastdigit = n % 10;
		n /= 10;
		isIncrease &= lastdigit < (n % 10);
		return isIncrease;
	}
	
	/**
	 * Calculate arithmetical average the digits of the six-digit number
	 * @param n six-digit integer number
	 * @return arithmetical average of the digit
	 */
	public static double calcDigitAverage(int n) {
		double s = 0;
		s += n % 10;
		n /= 10;
		s += n % 10;
		n /= 10;
		s += n % 10;
		n /= 10;
		s += n % 10;
		n /= 10;
		s += n % 10;
		n /= 10;
		s += n % 10;
		s /= 6;
		return s;
	}
	
	/**
	 * Calculate geometrical mean the digits of the six-digit number
	 * @param n six-digit integer number
	 * @return geometrical mean of the digit
	 */
	public static double calcDigitGeometricMean(int n) {
		double g = 1;
		g *= n % 10;
		n /= 10;
		g *= n % 10;
		n /= 10;
		g *= n % 10;
		n /= 10;
		g *= n % 10;
		n /= 10;
		g *= n % 10;
		n /= 10;
		g *= n % 10;
		g = Math.pow(g, 1. / 6);
		return g;
	}
	
	/**
	 * Method reverse sequence of digits of seven-digit number
	 * @param n six-digit integer number
	 * @return integer number with reverse sequence of digits
	 */
	public static int reverse(int n) {
		int nr = n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		n /= 10;
		nr = nr * 10 + n % 10;
		return nr;
	}
}

class Test {
	public static void main(String[] args) {
		// Test for example4 
		int n4 = 1579;		// Test number for example 4
		System.out.println("-----Test for example4-----");
		boolean isIncrease = ManipulationWithIntegerClass.hasIncreasingDigitSequence(n4);
		System.out.printf("Integer %d %s an increasing digit sequence\n", n4, isIncrease ? "has" : "has not");
		boolean isDecrease = ManipulationWithIntegerClass.hasDecreasingDigitSequence(n4);
		System.out.printf("Integer %d %s an decreasing digit sequence\n", n4, isDecrease ? "has" : "has not");
		n4 = 5321;
		isIncrease = ManipulationWithIntegerClass.hasIncreasingDigitSequence(n4);
		System.out.printf("Integer %d %s an increasing digit sequence\n", n4, isIncrease ? "has" : "has not");
		isDecrease = ManipulationWithIntegerClass.hasDecreasingDigitSequence(n4);
		System.out.printf("Integer %d %s an decreasing digit sequence\n", n4, isDecrease ? "has" : "has not");
		
		// Test for example5
		System.out.println("-----Test for example5-----");
		int n5 = 642937;
		System.out.printf("Arithmetical average of the digit n = %d is %f\n",
				n5, ManipulationWithIntegerClass.calcDigitAverage(n5));
		System.out.printf("Geometrical mean of the digit n = %d is %f\n",
				n5, ManipulationWithIntegerClass.calcDigitGeometricMean(n5));
		
		// Test for example6
		System.out.println("-----Test for example6-----");
		int n6 = 2_369_231;
		System.out.printf("For n = %d, reverse n = %d\n", n6, ManipulationWithIntegerClass.reverse(n6));	
	}
}