package com.shishonok.task10;

import java.util.Random;

/**
 * Tests for Recursion.
 * 
 * @version 1 21.06.2018
 * @author Alexander Shishonok
 */
import com.shishonok.task03.ex1.View;

public class Test {

    private static final int TEST_INT = 30;

    public static void execute() {
	Random random = new Random();
	int num = random.nextInt();
	View.println("Rec alg Sum digit of " + num + " is "
		+ RecursiveAlgoritm.findSumDigit(num));
	View.println("Iter alg Sum digit of " + num + " is "
		+ IterativeAlgoritm.findSumDigit(num));
	double d = random.nextDouble() * TEST_INT;
	int exp = random.nextInt(TEST_INT);
	View.printf("Rec alg %f involve %d is %f\n", d, exp,
		RecursiveAlgoritm.involveNumber(d, exp));
	View.println("Rec alg " + RecursiveAlgoritm.equals(1234567, 28));
	View.println("Rec alg " + RecursiveAlgoritm.equals(10, 7));
	View.println("Rec alg " + RecursiveAlgoritm.equals(10000, 1));
	View.printf("Iter alg %f involve %d is %f\n", d, exp,
		IterativeAlgoritm.involveNumber(d, exp));
	View.println("Iter alg " + IterativeAlgoritm.equals(1234567, 28));
	View.println("Iter alg " + IterativeAlgoritm.equals(10, 7));
	View.println("Iter alg " + IterativeAlgoritm.equals(10000, 1));
	num = random.nextInt(TEST_INT);
	View.printf("Rec alg %d number of Fibonacci is %d\n", num,
		RecursiveAlgoritm.findFibonacci(num));
	View.printf("Iter alg %d number of Fibonacci is %d\n", num,
		IterativeAlgoritm.findFibonacci(num));
	RecursiveAlgoritm.solveHanoiTower(3, "A", "C", "B");
    }
}

class Runner {
    public static void main(String[] args) {
	Test.execute();
    }
}