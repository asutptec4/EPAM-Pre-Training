package com.shishonok.task05;

import java.util.Arrays;
import java.util.Random;

import com.shishonok.task03.ex1.View;
import static com.shishonok.task05.ArrayWorker.*;

/**
 * Test methods for ArrayWorker.
 * 
 * @version 1 06.06.2018
 * @author Alexander Shishonok
 * 
 */
public class Test {
	
	public static void execute(int size) {
		size = size >= 0 ? size : -size;
		View.println("Testing array with size " + size);
		int[] arr = new int[size];
		ArrayInitializer.init(arr, -25, 25);
		execute(arr);
	}
	
	public static void execute(int[] arr) {
		View.println("Original array = " + Arrays.toString(arr));
		// Test findGlobalMinimum
		try {
			View.println("Global minimum is " + findGlobalMinimum(arr));
		} catch (Exception e) {
			View.println("Couln't find global min : " + e.getMessage());
		}
		// Test findGlobalMaximum
		try {
			View.println("Global maximum is " + findGlobalMaximum(arr));
		} catch (Exception e) {
			View.println("Couln't find global max : " + e.getMessage());
		}
		// Test findArithmeticMean
		try {
			View.println("Arithmetic mean is " + findArithmeticMean(arr));
		} catch (Exception e) {
			View.println("Couln't find arithmetic mean : " + e.getMessage());
		}
		// Test findGeometricMean
		try {
			View.println("Geometric mean is " + findGeometricMean(arr));
		} catch (Exception e) {
			View.println("Couln't find geometric mean : " + e.getMessage());
		}
		// Test findFirstLocalMinimumIndex
		View.println("First local minimum at position " + findFirstLocalMinimumIndex(arr));
		// Test findFirstLocalMaximumIndex
		View.println("First local maximum at position " + findFirstLocalMaximumIndex(arr));
		// Test reverse
		View.println("Reversed array = " + Arrays.toString(reverse(arr)));
		// Test checkAscending and checkDescending
		arr = ArrayWorker.sortInsert(arr, new Random().nextBoolean());
		View.println("Array after sorting = " + Arrays.toString(arr));
		View.println("Is ascendig order? - " + checkAscending(arr));
		View.println("is descending order? - " + checkDescending(arr));
	}
}

class Runner {
	public static void main(String[] args) {
		// Array without elements
		Test.execute(0);
		// Array with single element
		Test.execute(1);
		// Array with size > 3
		Test.execute(10);
		Test.execute(16);
		Test.execute(7);
		// Test null reference
		Test.execute(null);
	}
}