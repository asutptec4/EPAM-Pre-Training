package com.shishonok.task03.ex1;

/**
 * Tests for ThreePointCheck
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute() {
		// Initial point
		Point a = new Point(0.0f , 0.0f);
		Point b = new Point(2.0f , 0.0f);
		Point c = new Point(1.0f , 3.0f);
		View.printf("For points A %s B %s C %s\n", a, b, c);
		View.println("Triangle? - " + ThreePointsCheck.isTriangle(a, b, c));
		View.println("Right triangle? - " + ThreePointsCheck.isRightTriangle(a, b, c));
		// Test three point in row
		c = new Point(4.0f , 0.0f);
		View.printf("For points A %s B %s C %s\n", a, b, c);
		View.println("Triangle? - " + ThreePointsCheck.isTriangle(a, b, c));
		View.println("Right triangle? - " + ThreePointsCheck.isRightTriangle(a, b, c));
		// Test three point for right rectangle
		c = new Point(2.0f , 4.0f);
		View.printf("For points A %s B %s C %s\n", a, b, c);
		View.println("Triangle? - " + ThreePointsCheck.isTriangle(a, b, c));
		View.println("Right triangle? - " + ThreePointsCheck.isRightTriangle(a, b, c));
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute();
	}
}