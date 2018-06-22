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
		int endLoop = arr.length - 1;
		for (int i = 1; i < endLoop; i++) {
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
		int endLoop = arr.length - 1;
		for (int i = 1; i < endLoop; i++) {
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
	public static void reverse(int[] arr) {
		/// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return;
		}
		int endLoop = arr.length / 2;
		for (int i = 0; i < endLoop; i++) {
			arr[i] ^= arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] ^= arr[i];
			arr[i] ^= arr[arr.length - 1 - i];
		}
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
	public static void sortInsert(int[] arr, boolean isAcsend) {
		/// Check if reference is null or array have less two elements
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
			    	if (isAcsend) {
			    	    if (arr[j] < arr[j - 1]) {
			    		arr[j] ^= arr[j - 1];
			    		arr[j - 1] ^= arr[j];
			    		arr[j] ^= arr[j - 1];
			    	    } else {
			    		break;
			    	    }
			    	} else {
			    	    if (arr[j] > arr[j - 1]) {
			    		arr[j] ^= arr[j - 1];
			    		arr[j - 1] ^= arr[j];
			    		arr[j] ^= arr[j - 1];
			    	    } else {
			    		break;
			    	    }
			    	}
			}
		}
	}
}
