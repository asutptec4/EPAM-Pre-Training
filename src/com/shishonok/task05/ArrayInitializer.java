package com.shishonok.task05;

import java.util.Random;

/**
 * Class contains method for initialize array.
 * 
 * @version 1 06.06.2018
 * @author Alexander Shishonok
 * 
 */
public class ArrayInitializer {
	/**
	 * Method initialize the array with integer values in the range min, max,
	 * inclusive.
	 * 
	 * @param arr
	 *            array for initialization
	 * @param min
	 *            minimum value
	 * @param max
	 *            maximum value
	 */
	public static void init(int[] arr, int min, int max) {
		if (arr == null) {
			throw new NullPointerException("Couldn't initialize array");
		}
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(max - min + 1) + min;
		}
	}
}
