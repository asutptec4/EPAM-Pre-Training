package com.shishonok.task04.ex2;

import com.shishonok.task03.ex1.View;

/**
 * Tests for NaturalNumberWorker.
 * 
 * @version		1	31.05.2018
 * @author Alexander Shishonok
 */
public class Test {
	public static void execute(int n) {
		View.println("For " + n + " :");
		View.println("Largest digit - " + NaturalNumberWorker.findLargestDigit(n));
		View.println("Reverse - " + NaturalNumberWorker.reverse(n));
		View.println("Palindrome? - " + NaturalNumberWorker.checkPalindrome(n));
		View.println("Prime? - " + NaturalNumberWorker.isPrime(n));
		View.println("Prime dividers are " + NaturalNumberWorker.findPrimeDividers(n));
		View.println("Number of different digits " + NaturalNumberWorker.findNumDifDigit(n));
	}
	public static void execute(int a, int b) {
		View.println("For " + a + " and " + b + " :");
		View.println("GCD - " + NaturalNumberWorker.findGCD(a, b));
		View.println("LCM - " + NaturalNumberWorker.findLCM(a, b));
	}
}

class Runner {
	public static void main(String[] args) {
		Test.execute(0);
		Test.execute(1);
		Test.execute(2);
		Test.execute(3);
		Test.execute(4);
		Test.execute(5);
		Test.execute(1342315);
		Test.execute(13);
		Test.execute(6);
		Test.execute(536354);
		Test.execute(1342315);
		Test.execute(3143);
		Test.execute(456643654);
		Test.execute(52100125);
		Test.execute(432);
		Test.execute(325496);
		Test.execute(404);
		Test.execute(80932, 3232);
		Test.execute(5325, 624);
		Test.execute(25, 100);
		Test.execute(1, 423);
		
	}
}