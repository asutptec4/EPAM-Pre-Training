package com.shishonok.task06;

import java.util.Arrays;

import com.shishonok.task03.ex1.View;

public class Test {
	public static void execute(double[][] arr) {
		TwoDimArrayInitializer.init(arr, 1, 12);
		View.println("Original array:");
		for (double[] ds : arr) {
			View.println(Arrays.toString(ds));
		}
		View.println("Global minimum is " + TwoDimArrayWorker.findMinElement(arr));
		View.println("Global maximum is " + TwoDimArrayWorker.findMaxElement(arr));
		View.println("Arithmetic mean is " + TwoDimArrayWorker.findArithmeticMean(arr));
		View.println("Geometric mean is " + TwoDimArrayWorker.findGeometricMean(arr));
		View.println("First local minimum is " + Arrays.toString(TwoDimArrayWorker.findFirstMinElemIndex(arr)));
		View.println("First local maximum is " + Arrays.toString(TwoDimArrayWorker.findFirstMaxElemIndex(arr)));
		View.println("Transpose matrix:");
		double[][] arrt = TwoDimArrayWorker.transpose(arr);
		for (double[] ds : arrt) {
			View.println(Arrays.toString(ds));
		}
	}

	public static void execute(int[][] arr) {
		View.println("Original array:");
		for (int[] ds : arr) {
			View.println(Arrays.toString(ds));
		}
		View.println("Transpose matrix:");
		SquareMatrixTransposer.transpose(arr);
		for (int[] ds : arr) {
			View.println(Arrays.toString(ds));
		}
	}
}

class Runner {
	public static void main(String[] args) {
		double[][] arr = new double[4][6];
		Test.execute(arr);
		arr = new double[1][1];
		Test.execute(arr);
		arr = new double[2][3];
		Test.execute(arr);
		arr = new double[3][3];
		Test.execute(arr);
		// arr = new double[0][6];
		// Test.execute(arr);
		
		// Test integer square matrix
		int[][] array = { { 2, 5, 7, 9 }, { 6, 7, 4, 2 }, { 1, 0, 6, 3 }, { 5, 8, 4, 1 } };
		Test.execute(array);
		// arr = null;
		// Test.execute(arr);
	}
}