package com.shishonok.task06;

/**
 * Used for transpose square matrix.
 * 
 * @version 1 09.06.2018
 * @author Alexander Shishonok
 * 
 */
public class SquareMatrixTransposer {

	/**
	 * Transpose the square integer matrix.
	 * 
	 * @param arr
	 *            original matrix
	 * @return transposed matrix
	 */
	public static void transpose(int[][] arr) {
		if (arr == null || arr.length == 0 || arr[0].length == 0 || arr.length != arr[0].length) {
			throw new IllegalArgumentException("Input matrix is not correct.");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				if (i != j) {
					arr[i][j] ^= arr[j][i];
					arr[j][i] ^= arr[i][j];
					arr[i][j] ^= arr[j][i];
				}
			}
		}
	}
}
