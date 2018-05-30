package com.shishonok.task02.ex3;

/**
 * The class contains methods that help solve a geometric task
 * @author Alexander Shishonok
 */
public class GeometricHelper {
	
	/** 
	 * Method the area of the ring whose outer radius is r1, and the inner radius is r2.
	 * Attention: r1 must bigger r2. 
	 * @param r1 outer radius
	 * @param r2 inner radius
	 * @return area of the ring
	 */
	public static double findRingArea(double r1, double r2) {
		return findCircleArea(r1) - findCircleArea(r2);
	}
	
	public static double findCircleArea(double r) {
		return Math.PI * r * r;
	}
	
	/**
	 * Method find number of squares with side a in rectangle with sides bxc. Task02.ex28 
	 * @param a side of square
	 * @param b	first side of rectangle
	 * @param c	second side of rectangle
	 */
	public static void findNumberOfSquares(double a, double b, double c) {
		int numberOfSquares = (int) (b / a) * (int) (c / a);
		double restArea = b * c - numberOfSquares * a * a;
		System.out.printf("Rectangle b = %f x c = %f contain %d squares a = %f, rest area is %f\n", b, c, numberOfSquares, a, restArea);
	}
}

class Test {
	public static void main(String[] args) {
		double r1 = 23.4;
		double r2 = 12.5;
		System.out.printf("Area between outer radius = %f and inner radius = %f is %f\n",
				r1 , r2, GeometricHelper.findRingArea(r1, r2));
		
		/*-----Test for addition 28-----*/
		GeometricHelper.findNumberOfSquares(10, 40, 25);
	}
}