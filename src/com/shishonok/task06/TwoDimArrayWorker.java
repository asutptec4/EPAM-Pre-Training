package com.shishonok.task06;

/**
 * Class contain methods for working with the elements of two-dimensional array.
 * 
 * @version 1 08.06.2018
 * @author Alexander Shishonok
 * 
 */
public class TwoDimArrayWorker {

	/**
	 * Find global minimum element of the two-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return global minimum
	 */
	public static double findMinElement(double[][] arr) {
		checkArray(arr);
		double result = arr[0][0]; // Accept that first element is desired
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < result) {
					result = arr[i][j];
				}
			}
		}
		return result;
	}

	/**
	 * Find global maximum element of the two-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return global maximum
	 */
	public static double findMaxElement(double[][] arr) {
		checkArray(arr);
		double result = arr[0][0]; // Accept that first element is desired
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > result) {
					result = arr[i][j];
				}
			}
		}
		return result;
	}

	/**
	 * Find the arithmetic mean value of elements of the two-dimensional array.
	 * 
	 * @param arr
	 *            source array
	 * @return arithmetic mean value
	 */
	public static double findArithmeticMean(double[][] arr) {
		checkArray(arr);
		double result = 0; // Use variable for summation of elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result += arr[i][j];
			}
		}
		return result / (arr.length * arr[0].length);
	}

	/**
	 * Find the geometric mean value of elements of the array. If element has
	 * elements less zero, geometric mean not evaluated and returned -1.
	 * 
	 * @param arr
	 *            source array
	 * @return geometric mean value
	 */
	public static double findGeometricMean(double[][] arr) {
		checkArray(arr);
		double result = 1; // Use variable for multiplication of elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= 0) {
					result *= arr[i][j];
				} else {
					return -1;
				}
			}
		}
		return Math.pow(result, 1. / (arr.length * arr[0].length));
	}

	/**
	 * Find index of first local minimum element of the two-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return index of first local minimum, return [-1,-1] if element doesn't exist
	 */
	public static int[] findFirstMinElemIndex(double[][] arr) {
		checkArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i > 0 && i < arr.length - 1 && j > 0 && j < arr[i].length - 1
						&& arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i][j - 1]
								&& arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i][j + 1]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	/**
	 * Find index of first local maximum element of the two-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return index of first local maximum, return [-1,-1] if element doesn't exist
	 */
	public static int[] findFirstMaxElemIndex(double[][] arr) {
		checkArray(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i > 0 && i < arr.length - 1 && j > 0 && j < arr[i].length - 1
						&& arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1]
								&& arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	/**
	 * Transpose the matrix.
	 * 
	 * @param arr
	 *            original matrix
	 * @return transposed matrix
	 */
	public static double[][] transpose(double[][] arr) {
		checkArray(arr);
		double[][] arrT = new double[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrT[j][i] = arr[i][j];
			}
		}
		return arrT;
	}

	/**
	 * Check input array. Throws lllegalArgumentException if reference is null
	 * or array does not have elements.
	 * 
	 * @param arr
	 */
	public static void checkArray(double[][] arr) {
		if (arr == null || arr.length == 0 || arr[0].length == 0) {
			throw new IllegalArgumentException("No elements in the array!");
		}
	}
}
