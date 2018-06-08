package com.shishonok.task06;

import java.util.Random;

/**
 * Class contains method for initialize the two-dimensional array.
 * 
 * @version 1 08.06.2018
 * @author Alexander Shishonok
 * 
 */
public class TwoDimArrayInitializer {
	/**
	 * Method initialize the two-dimensional array with double values in the range
	 * min (inclusive), max (exclusive).
	 * 
	 * @param arr
	 *            array for initialization
	 * @param min
	 *            minimum value
	 * @param max
	 *            maximum value
	 */
	public static void init(double[][] arr, double min, double max) {
		if (arr == null) {
			throw new NullPointerException("Couldn't initialize array");
		}
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextDouble() * (max - min) + min;
			}
		}
	}
}
