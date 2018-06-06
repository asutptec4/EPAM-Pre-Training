package com.shishonok.task05;

/**
 * Class contain methods for working with the elements of one-dimensional array.
 * 
 * @version 1 06.06.2018
 * @author Alexander Shishonok
 * 
 */
public class ArrayWorker {

	/**
	 * Find global minimum element of the one-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return global minimum
	 */
	public static int findGlobalMinimum(int[] arr) {
		// Check if array hasn't elements or reference is null
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("No elements in array");
		}

		int result = arr[0]; // Accept that first element is desired
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < result) {
				result = arr[i];
			}
		}
		return result;
	}

	/**
	 * Find global maximum element of the one-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return global maximum
	 */
	public static int findGlobalMaximum(int[] arr) {
		// Check if array hasn't elements or reference is null
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("No elements in array");
		}

		int result = arr[0]; // Accept that first element is desired
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > result) {
				result = arr[i];
			}
		}
		return result;
	}

	/**
	 * Find the arithmetic mean value of elements of the array.
	 * 
	 * @param arr
	 *            source array
	 * @return arithmetic mean value
	 */
	public static double findArithmeticMean(int[] arr) {
		// Check if array hasn't elements or reference is null
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("No elements in array");
		}

		double result = 0;
		for (int el : arr) {
			result += el;
		}
		return result / arr.length;
	}

	/**
	 * Find the geometric mean value of elements of the array. If element has
	 * elements less zero, geometric mean not evaluated and returned -1.
	 * 
	 * @param arr
	 *            source array
	 * @return geometric mean value
	 */
	public static double findGeometricMean(int[] arr) {
		// Check if array hasn't elements or reference is null
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("No elements in array");
		}

		double result = 1;
		for (int el : arr) {
			if (el < 0) {
				return -1;
			}
			result *= el;
		}
		return Math.pow(result, 1. / arr.length);
	}

	/**
	 * Check if all elements of the array are sorted in ascending order.
	 * 
	 * @param arr
	 *            source array
	 * @return true if ascending order
	 */
	public static boolean checkAscending(int[] arr) {
		// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Check if all elements of the array are sorted in descending order.
	 * 
	 * @param arr
	 *            source array
	 * @return true if descending order
	 */
	public static boolean checkDescending(int[] arr) {
		// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return false;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Find index of first local minimum element of the one-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return index of first local minimum
	 */
	public static int findFirstLocalMinimumIndex(int[] arr) {
		// Check if reference is null or array have less three elements
		if (arr == null || arr.length < 3) {
			return -1;
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Find index of first local maximum element of the one-dimensional array
	 * 
	 * @param arr
	 *            source array
	 * @return index of first local maximum
	 */
	public static int findFirstLocalMaximumIndex(int[] arr) {
		// Check if reference is null or array have less three elements
		if (arr == null || arr.length < 3) {
			return -1;
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Reverse array elements
	 * 
	 * @param arr
	 *            source array
	 * @return reversed array
	 */
	public static int[] reverse(int[] arr) {
		/// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return arr;
		}

		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] ^= arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] ^= arr[i];
			arr[i] ^= arr[arr.length - 1 - i];
		}
		return arr;
	}

	/**
	 * Sorts the array into ascending or descending order.
	 * 
	 * @param arr
	 *            source array
	 * @param isAcsend
	 *            sort order true - ascending, false - descending
	 * @return sorted array
	 */
	public static int[] sortInsert(int[] arr, boolean isAcsend) {
		/// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return arr;
		}
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (isAcsend ? j > 0 && arr[j - 1] >= temp
					: j > 0 && arr[j - 1] <= temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}
}
