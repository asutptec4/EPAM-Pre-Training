package com.shishonok.task03.ex1;

/**
 * Check whether three points are the vertices of a right triangle.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class ThreePointsCheck {
	
	/**
	 * Check are three points the vertices of a triangle.
	 * @param a	first point
	 * @param b second point
	 * @param c	third point
	 * @return true if points define a triangle 
	 */
	public static boolean isTriangle(Point a, Point b, Point c) {
		float dist_ab, dist_bc, dist_ac;
		dist_ab = a.calcDistanceTo(b);
		dist_bc = b.calcDistanceTo(c);
		dist_ac = a.calcDistanceTo(c);
		return dist_ab < dist_ac + dist_bc 
				&& dist_ab > Math.abs(dist_bc - dist_ac);
	}
	
	/**
	 * Check are three points the vertices of a right triangle.
	 * @param a	first point
	 * @param b second point
	 * @param c	third point
	 * @return true if points define a right triangle 
	 */
	public static boolean isRightTriangle(Point a, Point b, Point c) {
		if (ThreePointsCheck.isTriangle(a, b, c)) {
			float dist_ab, dist_bc, dist_ac;
			dist_ab = a.calcDistanceTo(b);
			dist_bc = b.calcDistanceTo(c);
			dist_ac = a.calcDistanceTo(c);
			return dist_ab * dist_ab == dist_ac * dist_ac + dist_bc * dist_bc
					|| dist_ac * dist_ac == dist_ab * dist_ab + dist_bc * dist_bc
					|| dist_bc * dist_bc == dist_ab * dist_ab + dist_ac * dist_ac;
		}
		return false;
	}
}
